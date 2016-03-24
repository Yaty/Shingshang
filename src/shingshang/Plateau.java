/*
 * Copyright 2016 jules.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package shingshang;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 *
 * @author jules
 */
public class Plateau {
    
    private final Image imgEau = new Image("shingshang/images/eau.png");
    private final Image imgPierre = new Image("shingshang/images/pierre.png");
    private final Image imgHerbe = new Image("shingshang/images/herbe.png");
    private final Image imgPortailJ1 = new Image("shingshang/images/portailJ1.png");
    private final Image imgPortailJ2 = new Image("shingshang/images/portailJ2.png");
    private int[][] matriceCarte = new int[10][10];
    
    public Plateau(){
        System.out.println("Constructeur plateau");
        this.initMatriceCarte();
    }
    
    
    /**
     * Génére aléatoirement une matrice static qui aura pour unique but de
     * retenir la texture appliqué aléatoirement à chaque case du plateau:
     * texture d'eau, de pierre ou d'herbe
     * Cette matrice sera converti en javafx.gridPane après où l'on remplacera
     * les cases occupées par les textures des pions correspondant.
     */
    private void initMatriceCarte(){
        /* Régle de génération :
                - Les 4 premières et 4 dernières cases de la 1ere et de la dernière colonne sont de l'eau
                - Les portails du joueur 1 doivent être en : [1,4],[1,5],
                - Les portails du joueur 2 doivent être en : [8,4] et [8,5]
        */
        
        for(int i=0; i<10; i++){
            for(int j = 0; j<10; j++){
                //Si on est sur les 4 premieres ou les 4 dernières lignes et si on est sur la premiere ou sur la dernière colonnes
                if((i<4 || i >5) && (j==0 || j==9)){
                    this.matriceCarte[i][j] = 0;
                //Si on est sur le portail du joueur 1
                }else if(i == 1 && (j == 4 || j == 5)){
                    this.matriceCarte[i][j] = 3;
                //Si on est sur le portail du joueur 2
                }else if(i == 8 && (j==4 || j == 5)){
                    this.matriceCarte[i][j] = 4;
                //Sinon, c'est qu'on est sur une case normale et on random 1 ou 2 pour pierre ou herbe
                }else{
                    this.matriceCarte[i][j] = (int) ( Math.random() * 2 + 1);
                }        
            }   
        }
        for(int i=0; i<10;i++){
            for( int j=0;j<10;j++){
                System.out.print(this.matriceCarte[i][j]);
            }
            System.out.println("");
        }
    }
    
    /**
     * Affiche le plateau
     * @param grid javafx.layout.GridPane, grille dans laquelle on va affiché nos cases
     */
    public void afficher(GridPane grid){
        //Parcours de la matrice pour récupérer les sols
        for(int i=0; i<10; i++){
            for(int j = 0; j<10; j++){
                //Création d'un ImageView qu'on va mettre dans chaque case de la grille
                //Qui contiendra l'image voulu en fonction de la matrice
                ImageView iv = new ImageView();
                switch(this.matriceCarte[i][j]){
                    case 0:
                        iv.setImage(this.imgEau);
                        break;
                    case 1:
                        iv.setImage(this.imgHerbe);
                        break;
                    case 2:
                        iv.setImage(this.imgPierre);
                        break;
                    case 3:
                        iv.setImage(this.imgPortailJ1);
                        break;
                    case 4:
                        iv.setImage(this.imgPortailJ2);
                        break;
                }//Fin du switch case
                iv.setFitWidth(64);
                iv.setFitHeight(64);
                grid.add(iv, j, i);
                
            }//Fin for
        }//Fin for
    }
    
}
