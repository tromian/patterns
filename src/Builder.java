


public class Builder {

    public static void main(String[] args) {

        House house = new House.Builder().setAdress("Pushkina 6")
                .setOwner("Kolotushkin")
                .setFloors(4)
                .setRooms(5)
                .build();

        House house2 = new House.Builder().setAdress("Delovaya 4")
                .setOwner("Vasya Pup")
                .setFloors(2)
                .setRooms(1)
                .build();


        System.out.println(house.getAdress());
        System.out.println(house.getOwner());

        System.out.println(house2.getAdress());
        System.out.println(house2.getOwner());

    }


}

class House{

    private int rooms;
    private int floors;
    private String adress;
    private String owner;

    private House(Builder builder){
        this.rooms = builder.rooms;
        this.floors = builder.floors;
        this.adress = builder.adress;
        this.owner = builder.owner;
    }

    public int getRooms() {
        return rooms;
    }

    public int getFloors() {
        return floors;
    }

    public String getAdress() {
        return adress;
    }

    public String getOwner() {
        return owner;
    }

    static class Builder{
        private int rooms;
        private int floors;
        private String adress;
        private String owner;

        public Builder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }



}
