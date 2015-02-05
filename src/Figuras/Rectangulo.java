/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author luisfeliz
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase Rectangulo que extiende de la clase abstracta FiguraConRelleno y se pueden 
 * manipular objetos rectangulo.
 * @since 1.6
 */
public class Rectangulo extends RellenoFiguras{

    /**
     * Ancho del rectangulo
     * @since 1.6
     */
    private int ancho;

    /**
     * Alto del rectangulo
     * @since 1.6
     */
    private int alto;           

    /**
     * Construye un rectangulo.
     *
     * @param punto La coordenada inicial (x, y)
     * @param ancho El ancho
     * @param alto El alto
     * @param colorBorde El color del borde
     * @param colorRelleno El color del relleno
     * @param tamaño El tamañio del borde
     * @since 1.6
     */
    public Rectangulo(Point2D punto, int ancho, int alto, Color colorBorde, Color colorRelleno,
            int tamaño){
        super(punto, colorBorde, colorRelleno, tamaño);
        setAncho(ancho);
        setAlto(alto);
    }

    /**
     * Construye un rectangulo.
     *
     * @param x La coordenada x
     * @param y La coordenada y
     * @param ancho El ancho
     * @param alto El alto
     * @param colorBorde El color del borde
     * @param colorRelleno El color del relleno
     * @param tamaño El tamañio del borde
     * @since 1.6
     */
    public Rectangulo(int x, int y, int ancho, int alto, Color colorBorde, Color colorRelleno,
            int tamaño){
        super(x, y, colorBorde, colorRelleno, tamaño);
        setAncho(ancho);
        setAlto(alto);
    }

    /**
     * Devuelve el alto del rectangulo.
     *
     * @return alto El alto del rectangulo
     * @since 1.6
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Establece el alto del rectangulo.
     *
     * @param alto El alto del rectangulo
     * @since 1.6
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

     /**
     * Devuelve el ancho del rectangulo.
     *
     * @return alto El ancho del rectangulo
     * @since 1.6
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Establece el ancho del rectangulo.
     *
     * @param ancho El ancho del rectangulo
     * @since 1.6
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * Dibuja el rectangulo.
     * @param g El objeto Graphics
     * @since 1.6
     */
    @Override
    public void dibujar(Graphics g){
        // Objetos
        Graphics2D g2;
        Rectangle2D r2;
        Stroke bordeFigura;

        // Si el color del relleno es null significa que no tiene relleno
        if(getColorRelleno() != null){
            g.setColor(getColorRelleno());
            g.fillRect((int)getInicio().getX(), (int)getInicio().getY(),
                    getAncho(), getAlto());
        }
        r2 = new Rectangle2D.Float((int)getInicio().getX(), (int)getInicio().getY(),
                    getAncho(), getAlto());
        g2 = (Graphics2D)g;
        bordeFigura = new BasicStroke(getSize(), BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        g2.setColor(getColorBorde());
        g2.setStroke(bordeFigura);
        g2.draw(r2);
    }

    
    /**
     * Debe devolver true si <b>x</b> e <b>y</b> están dentro del rectangulo;
     * false, en caso contrario.
     *
     * @param x La coordenada x del rectangulo
     * @param y La coordenada y del rectangulo
     *
     * @return True si esta dentro.
     * @since 1.6
     */
    @Override
    public boolean estaDentro(int x, int y){
        if((x > getInicio().getX()) && (x < (getInicio().getX() + getAncho())) &&
                (y > getInicio().getY()) && (y < (getInicio().getY() + getAlto()))){
            return true;
        }
        return false;
    }

   
    /**
     * Establece la posición en la que se debe dibujar el rectangulo.
     *
     * @param x La coordenada x del rectangulo
     * @param y La coordenada y del rectangulo
     * @since 1.6
     */
    @Override
    public void setPosicion(int x, int y){
        setInicio(x, y);
    }
}