package com.mobile_application.hireme.utils;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StandardResponse {

    private int code;

    private String message;

    private Object data;

}
