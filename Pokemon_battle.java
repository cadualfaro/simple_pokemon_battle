package pokemon_battle;

class Pokemon{
    int nivel;
    int hp;
    String nome;
    int dano;
    int velocidade;
    int hpmax;
    
Pokemon(String nome, int nivel, int dano, int hp, int vel){
this.nome = nome;
this.nivel = nivel;
this.dano = dano;
this.hp = hp;
this.velocidade = vel;
this.hpmax = hp;

}

void Atacar(Pokemon p2){
p2.hp = p2.hp-dano;
    System.out.println(this.nome+" atacou "+p2.nome+", que ficou com hp "+p2.hp+"\n");
}
void Curar(int pot){
 hp=hp+pot;
  if(hp>hpmax){
    hp = hpmax;
 }
}

}

public class Pokemon_battle {

    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Mewtwo", 5,12,55,120);
        Pokemon p2 = new Pokemon("Charmander", 3,5,35,50);
        
        while(true){
            if(p1.velocidade>p2.velocidade){
        p1.Atacar(p2);
        if(p2.hp<=0){
        break;
        }
        p2.Atacar(p1);
            }
        else{
        p2.Atacar(p1);
        
        if(p1.hp<=0){
        break;
        }
        p1.Atacar(p2);
        }
        
        if(p1.hp<=0 || p2.hp<=0){
        break;
        }
        }
        
        System.out.println("Batalha finalizada");
        if(p1.hp<=0){
            System.out.println("O vencedor foi "+p2.nome);
        }
        else{
            System.out.println("O vencedor foi "+p1.nome);
        }
    }
}
