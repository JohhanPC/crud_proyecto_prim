package com.proyectoPri.userRegister.dtos.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description="Este request hace la validación de los campos de la creacion de un usuario")
@Getter
@Setter
public class CreateRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "Name is required")
    @NotBlank(message = "Name cannot empty")
    @Pattern(regexp = "^(?!\\s)[A-Za-zÁáÉéÍíÓóÚúÜüÑñ]+(\\s[A-Za-zÁáÉéÍíÓóÚúÜüÑñ]+)*$")
    private String name;

    @NotNull(message = "Email is required")
    @NotBlank(message = "Email cannot empty")
    @Email(message = "Email is not valid")
    private String email;

    @NotNull(message = "Password is required")
    @NotBlank(message = "Password cannot empty")
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$",
            message = "password should have the params minim"
    )
    private String password;

    @NotNull(message = "Password is required")
    @NotBlank(message = "Password cannot empty")
    private String identificationType;

    @NotNull(message = "Password is required")
    @NotBlank(message = "Password cannot empty")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "The identification number only contains numbers and letters without spaces or special characters")
    private String identificationNumber;

}
