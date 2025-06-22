package ma.alten.backend.dto.auth;

import jakarta.validation.constraints.Pattern;
import ma.alten.backend.constantes.Validation;

public record UserDto(
        Long id,
        String username,
        String firstname,
        @Pattern(regexp = Validation.EMAIL_PATTERN,message = Validation.INVALID_EMAIL_PATTERN)
        String email,
        String password
) {
}
