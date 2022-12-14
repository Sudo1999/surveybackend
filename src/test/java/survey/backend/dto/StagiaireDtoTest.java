package survey.backend.dto;

//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import java.time.LocalDate;
//import static org.junit.jupiter.api.Assertions.*;
//
//class StagiaireDtoTest {
//
//    @BeforeAll
//    static void initData() {
//        Long id = 1;
//        String lastname = "lastname";
//        String firstname = "firstname";
//        String email = "monemail@monemail.com";
//        String phonenumber = "06 06 06 06 06";
//        LocalDate birthdate = LocalDate.of(2000, 2, 29);
//        StagiaireDto stagiaireDto = new StagiaireDto(id, lastname, firstname, email, phonenumber, birthdate);
//    }
//
//    @Test   // Annotation JUnit
//    void testDefaultConstructor() {
//        StagiaireDto stagiaireDto = new StagiaireDto();
//        assertAll(      // Sans le assertAll, le premier qui plante arrête tout => on ne connaît pas le nombre d'erreurs
//                () -> assertNull(stagiaireDto.getId(), "id"),
//                () -> assertNull(stagiaireDto.getLastName(), "lastname"),
//                () -> assertNull(stagiaireDto.getFirstName(), "firstname"),
//                () -> assertNull(stagiaireDto.getEmail(), "email"),
//                () -> assertNull(stagiaireDto.getPhoneNumber(), "phonenumber"),
//                () -> assertNull(stagiaireDto.getBirthDate(), "birthdate")
//        );
//    }
//
//    @Test
//    void testAllArgsConstructor() {
//        Long id = 1;
//        String lastname = "lastname";
//        String firstname = "firstname";
//        String email = "monemail@monemail.com";
//        String phonenumber = "06 06 06 06 06";
//        LocalDate birthdate = LocalDate.of(2000, 2, 29);
//        StagiaireDto stagiaireDto = new StagiaireDto(id, lastname, firstname, email, phonenumber, birthdate);
//        assertAll(
//            () -> assertEquals(stagiaireDto.getId(), id, "id"),
//            () -> assertEquals(stagiaireDto.getLastName(), lastname, "lastname"),
//            () -> assertEquals(stagiaireDto.getFirstName(), firstname, "firstname"),
//            () -> assertEquals(stagiaireDto.getEmail(), email, "email"),
//            () -> assertEquals(stagiaireDto.getPhoneNumber(), phonenumber, "phonenumber"),
//            () -> assertEquals(stagiaireDto.getBirthDate(), birthdate, "birthdate")
//        );
//    }
//
//    @Test
//    void testBuilder() {
//    }
//}