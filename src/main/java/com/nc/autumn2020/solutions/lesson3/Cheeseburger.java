package com.nc.autumn2020.solutions.lesson3;

//Класс Чизбургер
public class Cheeseburger {
    //обязательные
    private String bun; //булочка
    private String cutlet; //котлета
    private String cheese; //сыр
    //необязательные
    private short tomato; //помидор
    private short lettuce; //листья салата
    private String sauce; //соус

    private Cheeseburger(Builder builder) {
        this.bun = builder.bun;
        this.cutlet = builder.cutlet;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
        this.lettuce = builder.lettuce;
        this.sauce = builder.sauce;
    }

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public String getCutlet() {
        return cutlet;
    }

    public void setCutlet(String cutlet) {
        this.cutlet = cutlet;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public short getTomato() {
        return tomato;
    }

    public void setTomato(short tomato) {
        this.tomato = tomato;
    }

    public short getLettuce() {
        return lettuce;
    }

    public void setLettuce(short lettuce) {
        this.lettuce = lettuce;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }


    public static class Builder {
        //обязательные
        private String bun; //булочка
        private String cutlet; //котлета
        private String cheese; //сыр
        //необязательные
        private short tomato = 0; //помидор
        private short lettuce = 0; //листья салата
        private String sauce = "no sauce"; //соус

        /**
         * @param bun
         * @param cutlet
         * @param cheese
         */
        public Builder(String bun, String cutlet, String cheese) {
            this.bun = bun;
            this.cutlet = cutlet;
            this.cheese = cheese;
        }

        public Builder tomato(short tomato){
            this.tomato = tomato;
            return this;
        }
        public Builder lettuce(short lettuce){
            this.lettuce = lettuce;
            return this;
        }
        public Builder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }
        public Cheeseburger build(){
            return new Cheeseburger(this);
        }
    }

    @Override
    public String toString() {
        return "Cheeseburger{" +
                "bun='" + bun + '\'' +
                ", cutlet='" + cutlet + '\'' +
                ", cheese='" + cheese + '\'' +
                ", tomato=" + tomato +
                ", lettuce=" + lettuce +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
