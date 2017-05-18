/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.br.projetormi.cliente.servidor.GUI;

import fatec.br.projetormi.cliente.GUI.*;
import fatec.br.projetormi.servidor.DAO.AutentificacaoClienteDAO;
import fatec.br.projetormi.servidor.DAO.AutentificacaoFuncionarioDAO;
import fatec.br.projetormi.servidor.Servidor;
import fatec.br.projetormi.servidor.VO.AutentificacaoFuncionarioVO;
import fatec.br.projetormi.servidor.conexao.Conexao;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ynhic
 */
public class AutentificacaoServidorGUI extends javax.swing.JFrame {
    //------------ Variaveis Globais ------------
    
    private Conexao conexao = new Conexao(); //Cria um objeto para a conexao com o banco de dados
    private AutentificacaoClienteDAO autentificacaoDAO =  new AutentificacaoClienteDAO(conexao); //Cria a DAO para a troca de dados com o banco
    
    /**
     * Creates new form AutentificacaoGUI
     */
    public AutentificacaoServidorGUI() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_senha = new javax.swing.JPanel();
        bt_sair = new javax.swing.JButton();
        bt_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_senha = new javax.swing.JPasswordField();
        bt_cadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jp_senha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bt_sair.setText("Sair");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        bt_login.setText("Login");
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuário");

        jLabel2.setText("Senha");

        bt_cadastro.setText("Criar usuario");
        bt_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_senhaLayout = new javax.swing.GroupLayout(jp_senha);
        jp_senha.setLayout(jp_senhaLayout);
        jp_senhaLayout.setHorizontalGroup(
            jp_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_senhaLayout.createSequentialGroup()
                .addGroup(jp_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_senhaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jp_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txt_senha)))
                    .addGroup(jp_senhaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jp_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_senhaLayout.createSequentialGroup()
                                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_senhaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_login, bt_sair});

        jp_senhaLayout.setVerticalGroup(
            jp_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_senhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_senhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sair)
                    .addComponent(bt_login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_cadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastroActionPerformed
        Cadastro_clientesGUI cadastro_clienteGUI = new Cadastro_clientesGUI();
        cadastro_clienteGUI.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_bt_cadastroActionPerformed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        
        if(txt_usuario.getText().isEmpty() ||
                txt_senha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o codigo para realizar a pesquisa","Alerta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String email = txt_usuario.getText(); //Armazena o usuario digitado em txtUser
        String senha = txt_senha.getText(); //Armazena a senha digitada em txtSenha
        boolean valida;
       // ServidorInter objeto1 = null;
       
       AutentificacaoFuncionarioVO funcionarioServidorVO = new AutentificacaoFuncionarioVO();
       AutentificacaoFuncionarioDAO autentificacaoFuncionarioDAO = new AutentificacaoFuncionarioDAO(conexao);
       
       
       try{
           funcionarioServidorVO = autentificacaoFuncionarioDAO.validarSenha(email, senha);
           
           if(funcionarioServidorVO==null){
               JOptionPane.showMessageDialog(rootPane, "Dados nao encontrados!",
                    "Mensagem ao Usuário", 
                    JOptionPane.INFORMATION_MESSAGE);
           } else{
               //achou
               JOptionPane.showMessageDialog(null, "login efetuado com sucesso","Alerta", JOptionPane.INFORMATION_MESSAGE);
                new MenuServidorGUI().setVisible(true);
                this.setVisible(false);
                System.out.println("Server ativo...");
                new Servidor();
           }
      
           
       } catch (SQLException ex) {
            Logger.getLogger(AutentificacaoServidorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

       /* try {
            LocateRegistry.getRegistry("192.168.0.102");
            objeto1 = (ServidorInter) Naming.lookup("rmi://localhost:9999/MensageiroService");
            valida = objeto1.validarSenha(email,senha );

            if (valida == true) {         
                MenuGUI menu = new MenuGUI();
                menu.setVisible(true);
                this.dispose();
                
            } else {
                if (email.equals("") && senha.equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite email e senha para entrar", "Atenção", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Email ou senha incorretos", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            // TODO Auto-generated catch block
            System.out.println("problema de conexão" + e);
        }
        
        
        
        
       String email = txt_usuario.getText(); //Armazena o usuario digitado em txtUser
        String senha = txt_senha.getText(); //Armazena a senha digitada em txtSenha 
        AutentificacaoVO autentificacaoVO = new AutentificacaoVO();
               
        try {
            autentificacaoVO = autentificacaoDAO.validarSenha(email, senha);
            if(autentificacaoVO != null){
                MenuGUI menu = new MenuGUI();
                menu.setVisible(true);
                this.dispose();
            }else{
                if(email.equals("")&& senha.equals("")){
                    JOptionPane.showMessageDialog(null,"Digite email e senha para entrar","Atenção", JOptionPane.WARNING_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Email ou senha incorretos","Atenção", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AutentificacaoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        
        
        
    }//GEN-LAST:event_bt_loginActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        System.exit(0);
        
        
    }//GEN-LAST:event_bt_sairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao.setNomeBanco("leilaoapp");
        conexao.setPorta(3306);
        conexao.setSenha("");
        conexao.setServidor("localhost");
        conexao.setUsuario("root"); 
        
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutentificacaoServidorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutentificacaoServidorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutentificacaoServidorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutentificacaoServidorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutentificacaoServidorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastro;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jp_senha;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
