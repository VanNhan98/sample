package vn.tayjava.dto.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import vn.tayjava.dto.validator.PhoneNumber;

import java.io.Serializable;

@Builder
@Getter

public class UserDetailResponse implements Serializable {

    private String firstName;

    private String lastName;

    private String email;

    private String phone;
}
