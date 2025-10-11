package BraceCheker;

public class BraceCheker {
    private String text;

    public BraceCheker(String text) {
        this.text = text;


    }

    public void check() {
        Stack charstack = new Stack(text.length());
        Stack indexstack = new Stack(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    charstack.push(c);
                    indexstack.push((char) i);
                    break;
                case ')':
                case '}':
                case ']':
                    if (charstack.isEmpty()) {
                        System.out.println("error :closed " + c + "at" + i + "but nothing opened");
                    } else {
                        char last = charstack.pop();
                        int lastindex = indexstack.pop();
                       if(!matches(last,c)) {
                            System.out.println("error :opened " + last + "but closed" + c + "at" + i);
                        }
                    }
                    break;
            }

        }
        while (!charstack.isEmpty()) {
            char last = charstack.pop();
            int lastindex = indexstack.pop();
            System.out.println("Error:opened" + last + "but not closed");
        }

        }

    private boolean matches (char open,char close){
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');


    }
}
