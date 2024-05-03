import javax.swing.JOptionPane;

public class movieSurvey{
    public void surveyThree(){

        String favMovie = JOptionPane.showInputDialog("What is your favourite movie?");
        String genre = JOptionPane.showInputDialog("What is your favourite genre of movie?");
        String upcomingMovie = JOptionPane.showInputDialog("What upcoming movie are you most excited for?");
        JOptionPane.showMessageDialog(null, "So your favourite movie is " + favMovie + ", your favourite genre is " + genre + ", and you can't wait to watch " + upcomingMovie + ". Awesome! Thanks!");
    }
}