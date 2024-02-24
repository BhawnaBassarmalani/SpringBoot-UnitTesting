package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;



    @BeforeEach
    void setupBeforeEach(){
        demoUtils =new DemoUtils();
       // System.out.println("BeforeEach executes before the execution of the each test method");
    }


    @Test
   // @DisplayName("Equals and not equals")
    void testEqualsAndNotEquals(){

       // System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6,demoUtils.add(2,4) , "2,4 must be 6");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 must not be 6");
    }

    @Test
    void testNullAndNotNull(){
        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "coding";
        assertNull(demoUtils.checkNull(str1) , "Object should be null");
        assertNotNull(demoUtils.checkNull(str2) , "Object should not be null");
    }

@DisplayName("Array Equals")
@Test
    void testArrayEquals(){
        String[] stringArray = {"A","B","C"};
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet() , "arrays should be the same");
}
//    @AfterEach
//    void tearDownAfterEach(){
//        System.out.println("Running @AfterEach");
//        System.out.println();
//    }
//
//    @BeforeAll
//    static void setUpBeforeEachClass(){
//        System.out.println("Before all executes only once before all test methods");
//    }
//
//    @AfterAll
//    static void tearDownAfterAll(){
//        System.out.println("After all executes only once after all test methods");
//    }

    @DisplayName("Throws and does not throw")
    @Test
    void testThrowsAndDoesNotThrow(){
        assertThrows(Exception.class , ()->{demoUtils.throwException(-1);}, "should throw exception");
        assertDoesNotThrow(()->{demoUtils.throwException(5);},"shouldnt throw exception");
    }




}
