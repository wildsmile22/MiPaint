/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import java.awt.Color;
import java.awt.geom.Point2D;

/**
 *
 * @author luisfeliz
 */
/**
 *
 * Clase abstracta Figura con relleno que extiende de Figura.
 * Agrega color de relleno.
 */
public abstract class RellenoFiguras extends Figura{
    ////////////////////////////////////////////////////////////////////////////
    // Variables de clase
    ////////////////////////////////////////////////////////////////////////////
    /**
     * Color del relleno de FiguraConRelleno.
     * @since 1.6
     */
    private Color colorRelleno;         


    ////////////////////////////////////////////////////////////////////////////
    // Constructores
    ////////////////////////////////////////////////////////////////////////////
    /**
     * Es una clase abstracta y no se puede instanciar.<br>
     * Su color de relleno predeterminado es blanco.
     * @since 1.6
     */
    public RellenoFiguras(){
        super();
        setColorRelleno(Color.WHITE);           
    }

    /**
     * Es una clase abstracta y no se puede instanciar.<br>
     *
     * @param punto Las coordenadas de inicio (x, y) del figura con relleno
     * @param colorBorde El color del borde
     * @param colorRelleno El color del relleno
     * @param size El tamañio del borde
     * @since 1.6
     */
    public RellenoFiguras(Point2D punto, Color colorBorde, Color colorRelleno,
             int size){
        super(punto, colorBorde, size);
        setColorRelleno(colorRelleno);  
    }

    /**
     * Es una clase abstracta y no se puede instanciar.<br>
     *
     * @param x La coordenada x de la figura con relleno
     * @param y La coordenada y de la figura con relleno
     * @param colorBorde El color del borde
     * @param colorRelleno El color del relleno
     * @param size El tamañio del borde
     * @since 1.6
     */
    public RellenoFiguras(int x, int y, Color colorBorde, Color colorRelleno,
             int size){
        super(x, y, colorBorde, size);
        setColorRelleno(colorRelleno);              
    }


    ////////////////////////////////////////////////////////////////////////////
    // Setters y Getters
    ////////////////////////////////////////////////////////////////////////////
    /**
     * Devuelve el color del relleno.
     *
     * @return colorRelleno El color del relleno
     * @since 1.6
     */
    public Color getColorRelleno() {
        return colorRelleno;
    }

    /**
     * Establece el color del relleno.
     *
     * @param colorRelleno El color del relleno
     * @since 1.6
     */
    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
}