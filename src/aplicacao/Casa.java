package aplicacao;

public class Casa {
    private Double largura;
    private Double comprimento;
    private Double alturaBaldrame;
    private Double larguraBaldrame;
    private Double comprimentoBaldrame;
    private Double valorMetroCubicoConcreto;

    public Double calculaAreaCasa(Double largura, Double comprimento) {
        return largura * comprimento;
    }

    public Double calcularVolumeBaldrame(Double larguraBaldrame, Double comprimentoBaldrame, Double alturaBaldrame) {
        return larguraBaldrame * comprimentoBaldrame * alturaBaldrame;
    }

    public Double custoConcretoBase(Double areaCasa, Double valorMetroCubicoConcreto) {

        return areaCasa * valorMetroCubicoConcreto;

    }

}
