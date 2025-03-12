public class CompanyRegistry {

    private CompanyRegistry() {}

    private static final CompanyRegistry instance = new CompanyRegistry();

    public static CompanyRegistry getInstance() {
        return instance;
    }

    private String cnpj;
    private String cep;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}