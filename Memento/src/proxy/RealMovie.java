/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author yyyura
 */
//RealMovie keeps link to Movie
public class RealMovie implements MovieIF {

    String linkToFile;

    public RealMovie(String linkToFile) {
        this.linkToFile = linkToFile;
        loadMovie();//loading in constructor
    }

    public void loadMovie() {
        System.out.println("Loading Movie... " + linkToFile);

    }

    @Override
    public void play() {
        System.out.println("Watching Movie " + linkToFile);

    }

}
