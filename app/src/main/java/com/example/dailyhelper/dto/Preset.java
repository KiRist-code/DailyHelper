package com.example.dailyhelper.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Presets")
public class Preset {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name="name")
    public String name;

    @ColumnInfo(name="category")
    public String category;

    @ColumnInfo(name="content")
    public String content;
}
