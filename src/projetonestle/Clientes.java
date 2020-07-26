/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonestle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class Clientes {


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha1() {
        return senha1;
    }

    public void setSenha1(String senha1) {
        this.senha1 = senha1;
    }
    private String nome;
    private String email;
    private String senha;
    private String senha1;

    /**
     *
     * @return 
     */

            
    public String salvar(){
        
        try{
            FileWriter fw = new FileWriter("cadastro.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("----------------");
            pw.println("Nome: "+this.nome);
            pw.println("E-mail: "+this.email);
            pw.println("Senha: "+this.senha);
            pw.println("Senha confirmada: "+this.senha1);
            pw.println("----------------");
            pw.flush();
            pw.close();
            fw.close();     
        }
        
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;  
    }
    
    public boolean existeEmail(String email) throws IOException, Exception {
        
            String a = "";
            File arq = new File("emails1.txt");
            FileWriter fw = new FileWriter(arq, true);
            PrintWriter pw = new PrintWriter(fw);
            Scanner sc = new Scanner(arq);
            while(sc.hasNextLine()){
                a += sc.nextLine();
            }

            return a.toLowerCase().contains(email.toLowerCase());
                
              
           
    }
    public void registrarEmail(String email) throws IOException, Exception{
        File arq = new File("registrosEmails.txt");
        FileWriter fw = new FileWriter(arq, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(email);
        pw.flush();
        pw.close();
        
    }
    public void registrarSenha(String senha) throws IOException, Exception{
        File arq = new File("registrosSenhas.txt");
        FileWriter fw = new FileWriter(arq, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(senha);
        pw.flush();
        pw.close();
        
    }
    public void registrarNome(String nome) throws IOException, Exception{
        File arq = new File("registrosNomes.txt");
        FileWriter fw = new FileWriter(arq, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(nome);
        pw.flush();
        pw.close();
        
    }
}
