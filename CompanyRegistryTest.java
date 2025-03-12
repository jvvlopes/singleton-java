import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyRegistryTest {

    @Test
    public void testSetAndGetCnpj() {
        CompanyRegistry registry = CompanyRegistry.getInstance();
        registry.setCnpj("12.345.678/0001-90");

        assertEquals("12.345.678/0001-90", registry.getCnpj(), "O CNPJ não foi armazenado corretamente.");
    }

    @Test
    public void testSetAndGetCep() {
        CompanyRegistry registry = CompanyRegistry.getInstance();
        registry.setCep("12345-678");

        assertEquals("12345-678", registry.getCep(), "O CEP não foi armazenado corretamente.");
    }
}
