package com.example.dailyhelper.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;

import com.example.dailyhelper.dto.Todo;

import java.util.List;

@Dao
public interface TodoDAO {
    @Query("SELECT * FROM todo")
    List<Todo> getAll();

    @Query("SELECT * FROM todo WHERE date LIKE :dateQuery ")
    List<Todo> findDatesTodo(String dateQuery);

    @Delete
    void delete(Todo todo);
}
