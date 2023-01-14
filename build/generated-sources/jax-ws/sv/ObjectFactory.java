
package sv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EuroDolarResponse_QNAME = new QName("http://sv/", "euroDolarResponse");
    private final static QName _Hello_QNAME = new QName("http://sv/", "hello");
    private final static QName _Diccionario_QNAME = new QName("http://sv/", "diccionario");
    private final static QName _EuroDolar_QNAME = new QName("http://sv/", "euroDolar");
    private final static QName _DiccionarioResponse_QNAME = new QName("http://sv/", "diccionarioResponse");
    private final static QName _NumeroPrimo_QNAME = new QName("http://sv/", "numeroPrimo");
    private final static QName _NumeroPrimoResponse_QNAME = new QName("http://sv/", "numeroPrimoResponse");
    private final static QName _Potencia_QNAME = new QName("http://sv/", "potencia");
    private final static QName _HelloResponse_QNAME = new QName("http://sv/", "helloResponse");
    private final static QName _PotenciaResponse_QNAME = new QName("http://sv/", "potenciaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NumeroPrimo }
     * 
     */
    public NumeroPrimo createNumeroPrimo() {
        return new NumeroPrimo();
    }

    /**
     * Create an instance of {@link NumeroPrimoResponse }
     * 
     */
    public NumeroPrimoResponse createNumeroPrimoResponse() {
        return new NumeroPrimoResponse();
    }

    /**
     * Create an instance of {@link Potencia }
     * 
     */
    public Potencia createPotencia() {
        return new Potencia();
    }

    /**
     * Create an instance of {@link PotenciaResponse }
     * 
     */
    public PotenciaResponse createPotenciaResponse() {
        return new PotenciaResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link EuroDolarResponse }
     * 
     */
    public EuroDolarResponse createEuroDolarResponse() {
        return new EuroDolarResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link DiccionarioResponse }
     * 
     */
    public DiccionarioResponse createDiccionarioResponse() {
        return new DiccionarioResponse();
    }

    /**
     * Create an instance of {@link Diccionario }
     * 
     */
    public Diccionario createDiccionario() {
        return new Diccionario();
    }

    /**
     * Create an instance of {@link EuroDolar }
     * 
     */
    public EuroDolar createEuroDolar() {
        return new EuroDolar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroDolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "euroDolarResponse")
    public JAXBElement<EuroDolarResponse> createEuroDolarResponse(EuroDolarResponse value) {
        return new JAXBElement<EuroDolarResponse>(_EuroDolarResponse_QNAME, EuroDolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "diccionario")
    public JAXBElement<Diccionario> createDiccionario(Diccionario value) {
        return new JAXBElement<Diccionario>(_Diccionario_QNAME, Diccionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroDolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "euroDolar")
    public JAXBElement<EuroDolar> createEuroDolar(EuroDolar value) {
        return new JAXBElement<EuroDolar>(_EuroDolar_QNAME, EuroDolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "diccionarioResponse")
    public JAXBElement<DiccionarioResponse> createDiccionarioResponse(DiccionarioResponse value) {
        return new JAXBElement<DiccionarioResponse>(_DiccionarioResponse_QNAME, DiccionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroPrimo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "numeroPrimo")
    public JAXBElement<NumeroPrimo> createNumeroPrimo(NumeroPrimo value) {
        return new JAXBElement<NumeroPrimo>(_NumeroPrimo_QNAME, NumeroPrimo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroPrimoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "numeroPrimoResponse")
    public JAXBElement<NumeroPrimoResponse> createNumeroPrimoResponse(NumeroPrimoResponse value) {
        return new JAXBElement<NumeroPrimoResponse>(_NumeroPrimoResponse_QNAME, NumeroPrimoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Potencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "potencia")
    public JAXBElement<Potencia> createPotencia(Potencia value) {
        return new JAXBElement<Potencia>(_Potencia_QNAME, Potencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "potenciaResponse")
    public JAXBElement<PotenciaResponse> createPotenciaResponse(PotenciaResponse value) {
        return new JAXBElement<PotenciaResponse>(_PotenciaResponse_QNAME, PotenciaResponse.class, null, value);
    }

}
