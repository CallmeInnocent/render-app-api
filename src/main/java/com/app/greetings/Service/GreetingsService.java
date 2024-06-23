package com.app.greetings.Service;

import com.app.greetings.DTO.VisitorsResponseDTO;
import jakarta.servlet.http.HttpServletRequest;

public interface GreetingsService {

    VisitorsResponseDTO visitorsResponse(String name, HttpServletRequest httpRequest);


}
