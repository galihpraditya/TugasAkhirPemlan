import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Galih
 */
public class CashierSystem {
    private static List<User> users;
    private static List<Produk> produkList;

    public CashierSystem() {
        users = new ArrayList<>();
        produkList = new ArrayList<>();
        users.add(new Admin("admin", "1234"));
        users.add(new Kasir("kasir", "1234"));
    }

    public void addUser(User user) {
        users.add(user);
    }

    public static User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addProduk(Produk produk) {
        produkList.add(produk);
    }
    public List<Produk> getProdukList() {
        return produkList;
    }
    public static Produk getProdukByName(String nama) {
        for (Produk produk : produkList) {
            if (produk.getNama().equals(nama)) {
                return produk;
            }
        }
        return null;
    }
}

class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
class Admin extends User {
    public Admin(String username, String password) {
        super(username, password, "admin");
    }
}
class Kasir extends User {
    public Kasir(String username, String password) {
        super(username, password, "kasir");
    }
}

class Produk {
    private int id;
    private String nama;
    private double harga;

    public Produk(int id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
}