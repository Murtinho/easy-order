/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aless
 */
public class Piatto
{
    private int id;
    private String nome;
    private String descrizione;
    private String allergeni;
    private String categoria;
    private int prezzo;

    public Piatto(String nome, String descrizione, String allergeni, String categoria, int prezzo)
    {
        this.nome = nome;
        this.descrizione = descrizione;
        this.allergeni = allergeni;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }
    
    public Piatto(int id, String nome, String descrizione, String allergeni, String categoria, int prezzo)
    {
        this(nome, descrizione, allergeni, categoria, prezzo);
        
        this.id = id;
    }
    
    public Piatto(String nome, String categoria)
    {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getAllergeni() {
        return allergeni;
    }

    public void setAllergeni(String allergeni) {
        this.allergeni = allergeni;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
