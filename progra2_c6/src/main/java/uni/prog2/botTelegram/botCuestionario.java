package uni.prog2.botTelegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import uni.prog2.botTelegram.BotRegistra;
import uni.prog2.botTelegram.botPregunton;




public class botCuestionario extends TelegramLongPollingBot {



    @Override
    public String getBotUsername() {
        return "@Progra2_MDan_bot";
    }

    @Override
    public String getBotToken() {
        return "7409520243:AAE6LE3Owkt3XI9Sbh7vcwdVekiqG1PJM9w";
    }


    @Override
    public void onUpdateReceived(Update update) {
        try {
//
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            BotRegistra botRegistra = new BotRegistra();
            botPregunton botPregunton = new botPregunton();

            do {
                botsApi.registerBot(botRegistra);
            } while(botRegistra.estadoConversacion.equals("fin"));

            botsApi.registerBot(botPregunton);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

//    public botCuestionario() throws TelegramApiException {
//
//    }
}
