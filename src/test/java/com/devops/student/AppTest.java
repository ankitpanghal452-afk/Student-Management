
package com.devops.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final App app = new App();

    @Test
    void shouldReturnWelcomeMessage() {
        assertEquals(
            "Student Management CI Application is running!",
            app.getWelcomeMessage()
        );
    }

    @Test
    void shouldCalculateTotalMarks() {
        assertEquals(263, app.calculateTotalMarks(85, 90, 88));
    }

    @Test
    void shouldCalculatePercentage() {
        assertEquals(263.0 / 3.0, app.calculatePercentage(263), 0.001);
    }

    @Test
    void shouldRejectInvalidMarks() {
        assertThrows(
            IllegalArgumentException.class,
            () -> app.calculateTotalMarks(110, 90, 88)
        );
    }

    @Test
    void shouldRejectNegativeMarks() {
        assertThrows(
            IllegalArgumentException.class,
            () -> app.calculateTotalMarks(85, -5, 88)
        );
    }
}
