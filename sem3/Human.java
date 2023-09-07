package sem3;

import java.time.LocalDate;

public class Human {
    private String firstName;
    private String lastName;
    private String nameFather;
    private LocalDate birthData;
    private Integer telephone;
    private String gender;


    public Human(String firstName, String lastName, String nameFather, LocalDate birthData, Integer telephone, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameFather = nameFather;
        this.birthData = birthData;
        this.telephone = telephone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "<" + firstName + ">" +
                "<" + lastName + ">" +
                "<" + nameFather + ">" +
                "<" + birthData + ">" +
                "<" + telephone + ">" +
                "<" + gender + ">";
    }


    public String getLastName() {
        return lastName;
    }
}
