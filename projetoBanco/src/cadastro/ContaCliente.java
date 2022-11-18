
package cadastro;


public class ContaCliente {
    private String nome;
    private String data;
    private Double saldo;
    private Double deposito;
    private Double transferencia;

    @Override
    public String toString() {
        return "ContaCliente{" + "nome=" + nome + ", saldo=" + saldo + ", deposito=" + deposito + ", transferencia=" + transferencia + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    public Double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Double transferencia) {
        this.transferencia = transferencia;
    }
    
    
    
    
}
