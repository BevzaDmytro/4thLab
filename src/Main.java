import views.MyFrame;

public class Main {

    public static void main(String[] args) {

        GrammarParser grammarParser = new GrammarParser();
        try {
            grammarParser.parseGrammar();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Analyzer analyzer = new Analyzer(grammarParser.getRules(), grammarParser.getRelations());
        analyzer.analyze();

        MyFrame frame = new MyFrame();
        frame.show(analyzer.getRelations());
        System.out.println("Hello World!");
    }
}
