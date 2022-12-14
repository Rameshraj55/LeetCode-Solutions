public int finalValueAfterOperations(String[] operations) {
        //WE INITIATED X HERE BECAUSE WE WOULN'T INVOLVE THIS X IN LOOP
        int x = 0;
        //HERE WE USED FOR EACH LOOP
        for(String i : operations){
            //USE SINGLE LINE STATEMENT LIKE THIS \\//IF SINGLE CHARACTER USE SINGLE QUOTES
            if (i.charAt(1) == '+') x++; //HERE ONLY WE DO ADDITION NOT CONSIDER PRE/POST INCREMENT
            else x--; //HERE ONLY WE SUBTRACT NOT CONSIDER PRE/POST INCREMENT
        }
        return x;
        
    }
