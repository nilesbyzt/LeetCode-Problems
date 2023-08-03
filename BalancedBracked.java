 public boolean isValid(String s) {
        List<Character> leftBrackets = Arrays.asList('(','{','['); 
        List<Character> rightBrackets = Arrays.asList(')','}',']');

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(leftBrackets.contains(ch)){
                stack.push(ch); // we put all of it into stack
            }
            if(rightBrackets.contains(ch)){
               if(stack.empty()) return false;

               var top = stack.pop();
               if(!(leftBrackets.indexOf(top) == rightBrackets.indexOf(ch))) return false;
            }
        }

       return stack.empty();

    }
