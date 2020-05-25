package ua.testing.registration_form.entity;

import lombok.*;

/**
 * <h1>Registration Form (Second Name Has Added)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-02
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    private Long id;
    private String names;
    private String secondNames;
    private String email;
    private String login;
}
