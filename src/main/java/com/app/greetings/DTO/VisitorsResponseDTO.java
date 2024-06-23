package com.app.greetings.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitorsResponseDTO {

    private String clientIP;
    private String greetings;


}
