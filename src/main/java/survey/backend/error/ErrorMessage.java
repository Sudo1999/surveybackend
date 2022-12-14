package survey.backend.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorMessage {

    private int status;
    private String error;
}