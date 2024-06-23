package com.app.greetings.Service;

import com.app.greetings.DTO.VisitorsResponseDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service

public class GreetingsImpl implements GreetingsService {


    @Override
    public VisitorsResponseDTO visitorsResponse(String name, HttpServletRequest httpServletRequest) {

        VisitorsResponseDTO visitorsResponseDTO = new VisitorsResponseDTO();

        String ipAddress = httpServletRequest.getHeader("X-Forwarded-For");

        if (ipAddress == null) {
            ipAddress = httpServletRequest.getRemoteAddr();
        }

        String message = "Hello " +name;

        visitorsResponseDTO.setGreetings(message);
        visitorsResponseDTO.setClientIP(ipAddress);


        return visitorsResponseDTO;
    }

}
