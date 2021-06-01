package com.example.databaselokal.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "kampus_db")
public class DataKampus {
    @NonNull
    @PrimaryKey(autoGenerate = true)

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "alamat")
    private String alamat;

    @ColumnInfo(name = "mhs")
    private int mhs;

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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getMhs() {
        return mhs;
    }

    public void setMhs(int mhs) {
        this.mhs = mhs;
    }
}
