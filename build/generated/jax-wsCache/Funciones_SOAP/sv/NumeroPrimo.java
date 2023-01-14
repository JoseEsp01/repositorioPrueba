
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para numeroPrimo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="numeroPrimo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numeroPrimo", propOrder = {
    "numero"
})
public class NumeroPrimo {

    protected double numero;

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public double getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(double value) {
        this.numero = value;
    }

}
