import Service.TransporteService;
import models.Encomenda;

public class Main {
    public static void main(String[] args) {
        // Criando uma encomenda de exemplo
        Encomenda encomendaInternacional = new Encomenda(5, 50, true, false);
        Encomenda encomendaLeve = new Encomenda(2, 50, false, true);
        Encomenda encomendaLeveInterMunicipal = new Encomenda(5, 1, false, false);
        Encomenda encomenda = new Encomenda(100, 100, false, false);

        // Instanciando o serviço de transporte
        TransporteService transporteService = new TransporteService();

        // Selecionando e realizando a entrega com base na encomenda
        transporteService.selecionarETerirTransporte(encomendaInternacional);
        transporteService.selecionarETerirTransporte(encomendaLeve);
        transporteService.selecionarETerirTransporte(encomendaLeveInterMunicipal);
        transporteService.selecionarETerirTransporte(encomenda);

    }
}