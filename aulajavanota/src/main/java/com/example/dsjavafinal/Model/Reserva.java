package com.example.dsjavafinal.Model;

public class Reserva {
    private Integer id;
    private String numSala;
    private String curso;
    private String disciplina;
    private String professor;
    private String data;
    private String horaEntrada;
    private String horaSaida;
    private Boolean informatica;
    private String turno;

    public Reserva(Integer id, String numSala, String curso, String disciplina, String professor,
                   String data, String horaEntrada, String horaSaida, Boolean informatica, String turno) {
        this.id = id;
        this.numSala = numSala;
        this.curso = curso;
        this.disciplina = disciplina;
        this.professor = professor;
        this.data = data;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.informatica = informatica;
        this.turno = turno;
    }

    public Reserva(String numSala, String curso, String disciplina, String professor,
                   String data, String horaEntrada, String horaSaida, Boolean informatica, String turno) {
        this.numSala = numSala;
        this.curso = curso;
        this.disciplina = disciplina;
        this.professor = professor;
        this.data = data;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.informatica = informatica;
        this.turno = turno;
    }

    public Reserva() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumSala() {
        return numSala;
    }

    public void setNumSala(String numSala) {
        this.numSala = numSala;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {

        if (data.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.data = data;
        } else {
            throw new IllegalArgumentException("Data inválida. Use o formato YYYY-MM-DD.");
        }
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Boolean getInformatica() {
        return informatica;
    }

    public void setInformatica(Boolean informatica) {
        this.informatica = informatica;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", numeroSala='" + numSala + '\'' +
                ", curso='" + curso + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", professor='" + professor + '\'' +
                ", data='" + data + '\'' +
                ", horaEntrada='" + horaEntrada + '\'' +
                ", horaSaida='" + horaSaida + '\'' +
                ", informatica=" + informatica +
                ", turno='" + turno + '\'' +
                '}';
    }
}
