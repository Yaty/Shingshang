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

    public Joueur() {
        this.listePion = new LinkedList<>(); // http://stackoverflow.com/questions/4166966/what-is-the-point-of-the-diamond-operator-in-java-7
        this.idJoueur = Joueur.nbJoueurs;
        Joueur.nbJoueurs++;
    }

    public LinkedList<Pion> getListePion() {
        return listePion;
    }

    public static int getNbJoueurs() {
        return nbJoueurs;
    }

    public int getIdJoueur() {
        return idJoueur;
    } 
}
