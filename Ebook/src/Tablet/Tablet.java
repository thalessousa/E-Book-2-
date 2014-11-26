/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablet;

public abstract class Tablet {

	protected int id;
	protected String marca;
        
        /*Construtor default */
	public Tablet() {
	}
        /*Construtor */
	public Tablet(int id, String marca) {

	}
        @Override
	public String toString() {
		return null;
	}
        @Override
	public boolean equals(Object other) {
		return false;
	}
}