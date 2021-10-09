package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.ViewHolder> {

    private List<Student> studentsList;

    public StudentsAdapter(List<Student> studentsList){
        this.studentsList = studentsList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView firstName, lastName, idNumber, course, year;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.tvFirstName);
            lastName = itemView.findViewById(R.id.tvLastName);
            idNumber = itemView.findViewById(R.id.tvIdNumber);
            course = itemView.findViewById(R.id.tvCourse);
            year = itemView.findViewById(R.id.tvYear);
        }
    }
    @NonNull
    @Override
    public StudentsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View studentView = inflater.inflate(R.layout.students_list_layout, parent, false);
        return new ViewHolder(studentView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsAdapter.ViewHolder holder, int position) {
        Student student = studentsList.get(position);

        TextView firstName = holder.firstName;
        TextView lastName = holder.lastName;
        TextView idNumber = holder.idNumber;
        TextView course = holder.course;
        TextView year = holder.year;

        firstName.setText(student.getFirstName());
        lastName.setText(student.getLastName());
        idNumber.setText(String.valueOf(student.getIdNumber()));
        course.setText(student.getCourse());
        year.setText(String.valueOf(student.getYear()));
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }
}
