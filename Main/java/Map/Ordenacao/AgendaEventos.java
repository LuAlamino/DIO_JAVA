package Main.java.Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);


    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        Set<LocalDate> dataSet = eventoMap.keySet();
        Collection<Evento> values = eventoMap.values();
        //Mostra a data atual do seu Sistema
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
           if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
               proximaData = entry.getKey();
               proximoEvento = entry.getValue();

               System.out.println("O Proximo evento: " + proximoEvento + " Acontecera na data " + proximaData);
               break;
           }
           }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 25), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.DECEMBER, 12), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.MAY, 31), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
        System.out.println(LocalDate.now());
    }
}
