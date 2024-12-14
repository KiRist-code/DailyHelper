package com.example.dailyhelper.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "todo")
public class Todo {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name="date")
    public String date;

    @ColumnInfo(name="name")
    public String name;

    @ColumnInfo(name="category")
    public String category;

    @ColumnInfo(name = "content")
    public String content;
}
