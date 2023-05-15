/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livia.prototipo.bitbox;

/**
 *
 * @author livia
 */
public class Empresa {
    private Integer id_empresa;

    private String nome;

    private String cnpj;


    public Empresa(Integer id, String nome, String cnpj) {
        this.id_empresa = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }


    public Empresa() {
        
    }
    
    @Override
    public String toString() {
        return "Empresa{" + "id=" + id_empresa + ", nome=" + nome + ", cnpj=" + cnpj + '}';
    }


    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
