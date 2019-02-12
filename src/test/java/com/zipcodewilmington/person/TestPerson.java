package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithNameAgeHeightWeightState(){
        // Given
        String expectedName = "Cara";
        Integer expectedAge = 24;
        Double expectedHeight = 63.0;
        Double expectedWeight = 120.0;
        String expectedState = "Delaware";

        // When
        Person person = new Person(expectedName, expectedAge, expectedHeight, expectedWeight,expectedState);

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Double actualHeight = person.getHeight();
        Double actualWeight = person.getWeight();
        String actualState = person.getUsState();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedState, actualState);
    }

    @Test
    public void testConstructorHairColorEyeColor(){
        // Given
        String expectedHairColor = "blonde";
        String expectedEyeColor = "brown";

        // When
        Person person = new Person(expectedHairColor, expectedEyeColor);

        // Then
        String actualHairColor = person.getHairColor();
        String actualEyeColor = person.getEyeColor();

        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

    @Test
    public void testGetName(){
        // Given
        String expectedName = "Cara";
        Person person = new Person("Cara");

        // When
        String actualName = person.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void testGetAge(){
        // Given
        Integer expectedAge = 10;
        Person person = new Person(10);

        // When
        Integer actualAge = person.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testGetHeight(){
        // Given
        Double expectedHeight = 63.0;
        Person person = new Person("Cara", 24, expectedHeight,120.0, "Delaware");

        // When
        Double actualHeight = person.getHeight();

        // Then
        Assert.assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testGetWeight(){
        // Given
        Double expectedWeight = 120.0;
        Person person = new Person("Cara", 24, 63.0, expectedWeight, "Delaware");

        // When
        Double actualWeight = person.getWeight();

        // Then
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testGetUsState(){
        // Given
        String expectedState = "Delaware";
        Person person = new Person("Cara", 24, 63.0, 120.0, expectedState);

        // When
        String actualState = person.getUsState();

        // Then
        Assert.assertEquals(expectedState, actualState);
    }

    @Test
    public void testGetHairColor(){
        // Given
        String expectedHairColor = "blonde";
        Person person = new Person(expectedHairColor, "brown");

        // When
        String actualHairColor = person.getHairColor();

        // Then
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testGetEyeColor(){
        // Given
        String expectedEyeColor = "brown";
        Person person = new Person("blonde", expectedEyeColor);

        // When
        String actualEyeColor = person.getEyeColor();

        // Then
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight(){
        // Given
        Person person = new Person();
        double expectedHeight = 60;

        // When
        person.setHeight(expectedHeight);

        // Then
        double actualHeight = person.getHeight();
        Assert.assertEquals(expectedHeight, actualHeight, .001);
    }

    @Test
    public void testSetWeight(){
        // Given
        Person person = new Person();
        double expectedWeight = 100;

        // When
        person.setWeight(expectedWeight);

        // Then
        double actualWeight = person.getWeight();
        Assert.assertEquals(expectedWeight, actualWeight, .001);
    }

    @Test
    public void testSetUsState(){
        // Given
        Person person = new Person();
        String expectedState = "Florida";

        // When
        person.setUsState(expectedState);

        // Then
        String actualState = person.getUsState();
        Assert.assertEquals(expectedState, actualState);
    }

    @Test
    public void testSetHairColor(){
        // Given
        Person person = new Person();
        String expectedHairColor = "blonde";

        // When
        person.setHairColor(expectedHairColor);

        // Then
        String actualHairColor = person.getHairColor();
        Assert.assertEquals(expectedHairColor, actualHairColor);
    }

    @Test
    public void testSetEyeColor(){
        // Given
        Person person = new Person();
        String expectedEyeColor = "brown";

        // When
        person.setEyeColor(expectedEyeColor);

        // Then
        String actualEyeColor = person.getEyeColor();
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

}
