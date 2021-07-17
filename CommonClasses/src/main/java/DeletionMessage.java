import java.io.File;
import java.util.LinkedList;

public class DeletionMessage extends AbstractMessage {
    private final String login;
    private final LinkedList<File> filesToDelete;

    public DeletionMessage(String login, LinkedList<File> filesToDelete) {
        this.login = login;
        this.filesToDelete = filesToDelete;
    }

    public String getLogin() {
        return login;
    }

    public LinkedList<File> getFilesToDelete() {
        return filesToDelete;
    }
}
