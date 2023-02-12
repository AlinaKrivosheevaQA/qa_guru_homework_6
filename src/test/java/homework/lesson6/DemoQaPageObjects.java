package homework.lesson6;

import org.junit.jupiter.api.Test;

public class DemoQaPageObjects extends TestBase {

    @Test
    void fillFormTest() {

        String firstName = "Alina",
                lastName = "Krivosheeva",
                email = "alina@test.ru",
                gender = "Female",
                number = "9208929023",
                birthDay[] = {"31", "December", "1998"},
                subjects = "Commerce",
                hobbies = "Reading",
                picturePath = "picture/test.png",
                pictureName = "test.png",
                address = "Lenina, d 18, kv 92",
                state = "Haryana",
                city = "Karnal";

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(number)
                .setBirthDay(birthDay[0], birthDay[1], birthDay[2])
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setPicture(picturePath)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmitButton();

        registrationPage.verifyResultsModalAppears()
                .verifyResults("Student Name", firstName + " " + lastName)
                .verifyResults("Student Email", email)
                .verifyResults("Gender", gender)
                .verifyResults("Mobile", number)
                .verifyResults("Date of Birth",
                        birthDay[0] + " " + birthDay[1] + "," + birthDay[2])
                .verifyResults("Subjects", subjects)
                .verifyResults("Hobbies", hobbies)
                .verifyResults("Picture", pictureName)
                .verifyResults("Address", address)
                .verifyResults("State and City", state + " " + city);


    }
}
