package project.kazumy.realhosting.discord.services.panel.exceptions;

public class PlanNotFoundException extends Exception {

    public PlanNotFoundException() {
        super("Nenhum plano com o estágio CHOOSING_SERVER foi encontrado com seu ID, contate um desenvolvedor!");
    }
}
