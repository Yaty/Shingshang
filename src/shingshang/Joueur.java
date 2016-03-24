/*
 * Copyright 2016 Hugo Da Roit - Bourdalé Jules.
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

import java.util.LinkedList;

/**
 *
 * @author Hugo
 */
public class Joueur {
    LinkedList<Pion> listePion;
    static int nbJoueurs=0;
    int idJoueur;

    /**
     * Constructeur de Joueur
     * Créer une LinkedList
     * Associe un ID au joueur
     */
    public Joueur() {
        this.listePion = new LinkedList<>();
        this.idJoueur = Joueur.nbJoueurs;
        Joueur.nbJoueurs++;
    }
    
    /**
     *
     * @return La taille de la liste associé au joueur
     */
    public int getSizeOfListe() {
        return listePion.size();
    }
    
    /**
     *
     * @param pion
     */
    public void addPion(Pion pion) {
        listePion.add(pion);
    }
    
    /**
     *
     * @param index
     */
    public void deletePion(int index) {
        listePion.remove(index);
    }
    
    /**
     *
     * @param index
     * @return Le pion à la position index dans la LinkedList
     */
    public Pion getPionAtIndex(int index) {
        return listePion.get(index);
    }
    
    /**
     *
     * @return La LinkedList entière
     */
    public LinkedList<Pion> getListePion() {
        return listePion;
    }

    /**
     *
     * @return Le nombre de joueurs
     */
    public static int getNbJoueurs() {
        return nbJoueurs;
    }

    /**
     *
     * @return L'identifiant du joueur
     */
    public int getIdJoueur() {
        return idJoueur;
    } 
}
