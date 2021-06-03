import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MyTriangleTest {

    private MyTriangle myTriangle;

    @BeforeEach
    void setUp() {
        myTriangle = new MyTriangle();
    }

    @Test
    public void testDrawTriangle() {
        Assertions.assertEquals(myTriangle.drawTriangle(), "*\n**\n***\n");
    }
}