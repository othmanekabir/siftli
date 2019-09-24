package fr.siftli.transitmarchandise.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Taille implements Serializable {

    private float longueur;
    private float largeur;
    private float hauteur;
}
