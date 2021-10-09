package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentsList;
    RecyclerView recyclerViewStudentsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewStudentsList = findViewById(R.id.recyclerViewStudentsList);
        studentsList = new ArrayList<>();
        studentsList.add(new Student("Enubs", "Ron", 123456, "BSIT", 2));
        studentsList.add(new Student("Chan", "Jacky", 664455, "BSIT", 2));
        studentsList.add(new Student("Li", "Jet", 888888, "BSIT", 2));
        studentsList.add(new Student("Hu", "Lao", 223344, "BSIT", 2));
        studentsList.add(new Student("Suy", "Chop", 555555, "BSIT", 2));
        studentsList.add(new Student("Uy", "Van", 464646, "BSIT", 2));
        studentsList.add(new Student("Chang", "Xi", 798798, "BSIT", 2));
        studentsList.add(new Student("Lao", "Win", 333333, "BSIT", 2));
        studentsList.add(new Student("Zu", "Han", 111100, "BSIT", 2));
        studentsList.add(new Student("Te", "Al", 877778, "BSIT", 2));

        StudentsAdapter studentsAdapter = new StudentsAdapter(studentsList);
        recyclerViewStudentsList.setAdapter(studentsAdapter);
        recyclerViewStudentsList.setLayoutManager(new LinearLayoutManager(this));
    }
}