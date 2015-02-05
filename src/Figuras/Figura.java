/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
/**
 *
 * @author luisfeliz
 */

public abstract class Figura {
  
    /**
     * Inicio de las coordenadas del Punto (x, y) de la figura.
     * @since 1.6
     */
    private Point2D inicio;

    /**
     * Color del borde de la figura
     * @since 1.6
     */
    private Color colorBorde;

    /*
     * Tamanhio de la figura
     * @since 1.6
     */
    private int tamaño;               


    /**
     * Es una clase abstracta y no se puede instanciar.<br>
     * Sus coordenadas de inicio son (0, 0).<br>
     * Su color de borde predeterminado es negro.<br>
 Su tamaño predeterminado es 1.<br>
     * @since 1.6
     */
    public Figura(){
        setInicio(new Point2D.Double(0, 0));    
        setColorBorde(Color.BLACK);             
        setSize(1);                         
    }

    /**
     * Es una clase abstracta y no se puede instanciar.
     *
     * @param punto El punto inicial (x, y) de la figura<br>
     * @param colorBorde El color del borde<br>
     * @param tamaño El tamaño del borde<br>
     * @since 1.6
     */
    public Figura(Point2D punto, Color colorBorde, int tamaño){
        setInicio(punto);               
        setColorBorde(colorBorde);      
        setSize(tamaño);          
    }

    /**
     * Es una clase abstracta y no se puede instanciar.
     *
     * @param x La coordenada x de la figura<br>
     * @param y La coordenada y de la figura<br>
     * @param colorBorde El color del borde<br>
     * @param tamaño El tamaño del borde<br>
     * @since 1.6
     */
    public Figura(int x, int y, Color colorBorde, int tamaño){
        setInicio(new Point2D.Double(x, y));        
        setColorBorde(colorBorde);                  
        setSize(tamaño);                     
    }


    ////////////////////////////////////////////////////////////////////////////
    // Setters y Getters
    ////////////////////////////////////////////////////////////////////////////
    /**
     * Devuelve el color del borde.
     *
     * @return El color del borde
     * @since 1.6
     */
    public Color getColorBorde() {
        return colorBorde;
    }

    /**
     * Establece el color del borde.
     *
     * @param colorBorde El color del borde
     * @since 1.6
     */
    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
    }


    /**
     * Devuelve la coordenada inicial (x, y).
     *
     * @return La coordenada inicial de Point 2D (x, y)
     * @since 1.6
     */
    public Point2D getInicio() {
        return inicio;
    }

    /**
     * Establece la coordenada inicial (x, y)).
     *
     * @param inicio La coordenada inicial de Point 2D (x, y)
     * @since 1.6
     */
    public void setInicio(Point2D inicio) {
        this.inicio = inicio;
    }

     /**
     * Establece la coordenada inicial (x, y)).
     *
     * @param x La coordenada x de la figura
     * @param y La coordenada y de la figura
     * @since 1.6
     */
    public void setInicio(int x, int y) {
        Point2D inicioCoordenada = new Point2D.Double(x, y);
        this.inicio = inicioCoordenada;
    }

    /**
     * Devuelve el tamaño de la figura.
     *
     * @return El tamaño de la figura
     * @since 1.6
     */
    public int getSize() {
        return tamaño;
    }

    /**
     * Establece el tamaño de la figura.
     *
     * @param tamaño El tamaño de la figura
     * @since 1.6
     */
    public void setSize(int tamaño) {
        this.tamaño = tamaño;
    }

    
    ////////////////////////////////////////////////////////////////////////////
    // Metodos varios
    ////////////////////////////////////////////////////////////////////////////
    /**
     * Dibuja la figura.
     * @param g El objeto Graphics
     * @since 1.6
     */
    public void dibujar(Graphics g){}


    
    /**
     * Debe devolver true si <b>x</b> e <b>y</b> están dentro de la figura; false, en caso contrario.
     *
     * @param x La coordenada x de la figura
     * @param y La coordenada y de la figura
     *
     * @return True si x e y están dentro de la figura.
     * @since 1.6
     */
    public abstract boolean estaDentro(int x, int y);


    /**
     * Establece la posición en la que se debe dibujar la figura.
     *
     * @param x La coordenada x de la figura
     * @param y La coordenada y de la figura
     * @since 1.6
     */
    public abstract void setPosicion(int x, int y);
}