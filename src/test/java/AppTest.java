
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    // test input to be string
    @Test
    public void  testEncoding_testWord_String(){
        Encrypt testEncrypt = new Encrypt();
        assertEquals(true , testEncrypt instanceof Encrypt);
    }

    @Test
    public void decryptTest_testWord_String(){

        Decrypt decryptTest = new Decrypt();
        assertEquals(true, decryptTest instanceof Decrypt);
    }
}


