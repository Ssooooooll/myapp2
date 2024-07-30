package com.test3;

// class Database{
//     void open() {System.out.println("Database Open");}
// }
// class MySql extends Database {
//     void open() {System.out.println("MySql Open()");}
// }
// class Oracle extends Database {
//     void open() {System.out.println("Oracle Open()");}
// }

interface Database {
    void open();
}

class MySql implements Database {
        public void open() {System.out.println("MySql Open()");}
    }
class Oracle implements Database {
        public void open() {System.out.println("Oracle Open()");}
    }

public class Main {
    static Database CreateDatabase(String dbName) {
        Database db = null;
        switch (dbName) {
            case "MySql":
                db = new MySql(); // Database db = new MySql();
                break;
        
            case "Oracle" :
                db = new Oracle();
                break;
        }
        return db;
    }
    public static void main(String[] args) {
    //     MySql mySql = new MySql();
    //     Database database = new MySql();
    //     Database database2 = new MySql();
    //     Database database3 = new Oracle();
    //     dbOpen(database2);
    //     dbOpen(database3);
    // }
    // static void dbOpen(MySql db) {
    //     db.open();
    // }
    // static void dbOpen(Oracle db) {
    //     db.open();
    // }

    Database db = CreateDatabase("MySql");
    db.open();
    Database db2 = CreateDatabase("Oracle");
    db2.open();
    }
}



