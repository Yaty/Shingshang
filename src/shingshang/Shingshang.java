package shingshang;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;

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

public class Shingshang extends Application {
    
    private GridPane grille;
    private int[] map;
    
    @Override
    public void start(Stage stage){
        
        System.out.println("Working Directory = "+System.getProperty("user.dir"));
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(0);
        grid.setVgap(0);
        grid.setPadding(new Insets(0, 0, 0, 0));
        Scene scene = new Scene(grid, 640, 640);
        Plateau plateau = new Plateau();
        plateau.afficher(grid);
        
        Pion lion1 = new Lion();
        lion1.afficher(grid);
       
        
        stage.setTitle("ShingShang");
        stage.setScene(scene);
        stage.show();
        lion1.setX(3);
        lion1.setY(3);
        plateau.afficher(grid);
        lion1.afficher(grid);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
