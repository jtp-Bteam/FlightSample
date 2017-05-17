package jp.ac.dendai.c.jtp.flightsample;
public interface Touchable extends Drawable{
    boolean isContained(Vect v);
    void die();
    boolean isAlive();
}
