class Pig {
    private int nyawaBabi;
    private String namaBabi;

    public void setNyawaBabi(int nyawaBabi){
        this.nyawaBabi = nyawaBabi;
    }

    public int getNyawaBabi(){
        return this.nyawaBabi;
    }

    public void setNamaBabi (String namaBabi){
        this.namaBabi = namaBabi;
    }

    public String getNamaBabi(){
        return this.namaBabi;
    }

    public boolean hat(){
        return true;
    };
    public boolean metal(){
        return true;
    }

}

class Pighat extends Pig{
    public boolean hat(){
        return true;
    };
    public boolean metal(){
        return false;
    }
}

class PigMetal extends Pig{
    public boolean hat(){
        return false;
    };
    public boolean metal(){
        return true;
    }
}
