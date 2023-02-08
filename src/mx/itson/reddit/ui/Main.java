/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.reddit.ui;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import mx.itson.reddit.entidades.Comentario;
import mx.itson.reddit.entidades.Comunidad;
import mx.itson.reddit.entidades.Publicacion;
import mx.itson.reddit.entidades.Usuario;

/**
 *
 * @author Xylan
 */
public class Main {
     public static void main(String[] args) {
         
      List<Usuario> usuarios = new ArrayList<>();
      Usuario usuario1 = new Usuario();
      usuario1.setNombre("MythicElderTree");
      usuario1.setCorreo("MTG312@gmail.com");
      usuario1.setContrasenia("X02WyvernSol");
      usuario1.setPais("United Kingdom");
      
      Usuario usuario2 = new Usuario();
      usuario2.setNombre("Mother_Talk_3182");
      usuario2.setCorreo("MotherTalk3182@gmail.com");
      usuario2.setContrasenia("3182MTACES");
      usuario2.setPais("United States");
      
      Usuario usuario3 = new Usuario();
      usuario3.setNombre("StrangerealSensei");
      usuario3.setCorreo("Strangerealore341@gmail.com");
      usuario3.setContrasenia("Eruseadidnothingwrong2005");
      usuario3.setPais("United States");
      
      Usuario usuario4 = new Usuario();
      usuario4.setNombre("Heiko1809");
      usuario4.setCorreo("Heiko1809@gmail.com");
      usuario4.setContrasenia("HsksFlanker");
      usuario4.setPais("Brazil");
      
      Usuario usuario5 = new Usuario();
      usuario5.setNombre("Steampunk_483");
      usuario5.setCorreo("Steampunk2077@gmail.com");
      usuario5.setContrasenia("Belkadidnothingwrong");
      usuario5.setPais("Germany");
      
      Usuario usuario6 = new Usuario();
      usuario6.setNombre("tahko123");
      usuario6.setCorreo("tahko123@gmail.com");
      usuario6.setContrasenia("123456674376");
      usuario6.setPais("Filipines");
      
      Calendar calendar = Calendar.getInstance();
      calendar.clear();
      calendar.set(2023, 2, 8);
        
      Calendar calendar2 = Calendar.getInstance();
      calendar2.clear();
      calendar2.set(2023, 2, 8);
        
      Calendar calendar3 = Calendar.getInstance();
      calendar3.clear();
      calendar3.set(2023, 2, 6);
      
      Calendar calendar4 = Calendar.getInstance();
      calendar3.clear();
      calendar3.set(2019, 1, 15);
      
      List<Comentario> comentarios1 = new ArrayList<>();
      Comentario comentario1 = new Comentario();
      comentario1.setCuerpo("Yeah when you start over you keep everything. I kinda wish there was a way to give it up and earn it all again though.");
      comentario1.setUsuario(usuario2);
      comentario1.setFecha(calendar.getTime());
      
      Comentario comentario2 = new Comentario();
      comentario2.setCuerpo("I believe there is. You can either New Game+ or just start a fresh game. Been a while since I've played 7 though, so I may be thinking of older titles.");
      comentario2.setUsuario(usuario3);
      comentario2.setFecha(calendar.getTime());
      
     Comentario comentario3 = new Comentario();
     comentario3.setCuerpo("Appdata local and delete your Save At least thats how it works on pc");
     comentario3.setUsuario(usuario4);
     comentario3.setFecha(calendar.getTime());
     
     Comentario comentario4 = new Comentario();
     comentario4.setCuerpo("Yup, progress on the aircraft tree is kept between runs.\n" +
"\n" +
"Also, there's an achievement for completing the campaign on all difficulties (although Easy and Casual both count as the same difficulty, so you only need to do one to get it).");
     comentario4.setUsuario(usuario6);
     comentario4.setFecha(calendar.getTime());
     
     List<Comentario> comentarios2 = new ArrayList<>();
      Comentario comentario5 = new Comentario();
      comentario5.setCuerpo("You used enhanced gunplay, did not damage Mihaly enough, or shot Sol squadron too fast.");
      comentario5.setUsuario(usuario5);
      comentario5.setFecha(calendar2.getTime());
     
      Comentario comentario6 = new Comentario();
      comentario6.setCuerpo("Really? I've had games where i have killed sol really fucking quickly, and this didn't happen");
      comentario6.setUsuario(usuario3);
      comentario6.setFecha(calendar2.getTime());
      
      Comentario comentario7 = new Comentario();
      comentario7.setCuerpo("He listed 3 possible reasons. If its not the Sol one, look for the other 2");
      comentario7.setUsuario(usuario6);
      comentario7.setFecha(calendar2.getTime());
      
      Comentario comentario8 = new Comentario();
      comentario8.setCuerpo("Yeah I got rid of that mod for this exact reason. It felt way too overpowered anyway.");
      comentario8.setUsuario(usuario1);
      comentario8.setFecha(calendar2.getTime());
      
      List<Comentario> comentarios3 = new ArrayList<>();
      Comentario comentario9 = new Comentario();
      comentario9.setCuerpo("Buy the mission packs, do it");
      comentario9.setUsuario(usuario1);
      comentario9.setFecha(calendar3.getTime());
      
      Comentario comentario10 = new Comentario();
      comentario10.setCuerpo("He has the season pass");
      comentario10.setUsuario(usuario2);
      comentario10.setFecha(calendar3.getTime());
      
      Comentario comentario11 = new Comentario();
      comentario11.setCuerpo("Buy the Nosferatu, best aircraft in the game");
      comentario11.setUsuario(usuario5);
      comentario11.setFecha(calendar3.getTime());
      
      
      Comentario comentario12 = new Comentario();
      comentario12.setCuerpo("Ok, thanks for the suggestions");
      comentario12.setUsuario(usuario4);
      comentario12.setFecha(calendar3.getTime());
      
      List<Publicacion> posts = new ArrayList<>();
      
      Comunidad comunidad = new Comunidad();
      comunidad.setNombre("r/AceCombat");
      comunidad.setFechacreacion(calendar4.getTime());
      comunidad.setIntegrantes(usuarios);
      comunidad.setPosts(posts);
      
      Publicacion post1 = new Publicacion();
      post1.setTitulo("Question about Campaign Completion and the Wyvern");
      post1.setContenido("I was wondering if you kept the X-02 if you decided to start over for a new game.\n" +
      "Also, is there any reason to complete the game on Easy?\n" +
      "Or rather, all of the difficulties?");
      post1.setFecha(calendar.getTime());
      post1.setComentarios(comentarios1);
      post1.setUsuario(usuario1);
      post1.setComunidad(comunidad);
      
      Publicacion post2 = new Publicacion();
      post2.setTitulo("Battle for Farbanti Softlock?");
      post2.setContenido("I was just Medal Hunting and went for the Farbanti one.\n" +
"\n" +
"I managed really well, then Sol Squadron appeared. I shortly engaged Mihaly, then went on to shoot down the other 4 Sols. I then again focused on Mihaly and was waiting for him and Wiseman to have their little spiel.\n" +
"\n" +
"But that never happened. Mihaly continued to fly higher and higher, the soundtrack was gone and nothing happened. I continued to empty my reserves at him, but nothing happened, he was just flying around engaging Fencer until the timer ran out.\n" +
"\n" +
"Has this happened to anyone before?");
      post2.setFecha(calendar2.getTime());
      post2.setComentarios(comentarios2);
      post2.setUsuario(usuario3);
      post2.setComunidad(comunidad);
      
      Publicacion post3 = new Publicacion();
      post3.setTitulo("how useful is stealth in fighter jet games?");
      post3.setContenido("I had no where else to ask this, currently I am playing JASF( jane's advanced striker fighters) and I was wondering how does stealth benefits jets in this game? like can other jets or SAMs have a harder time spotting me on their radar or what?");
      post3.setFecha(calendar3.getTime());
      post3.setComentarios(comentarios3);
      post3.setUsuario(usuario5);
      post3.setComunidad(comunidad);

     }
}
