package com.example.shreyesh.sarinstituteofmedicalscience;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DepartmentsAdapter extends RecyclerView.Adapter<DepartmentsAdapter.ViewHolder> {


    Context context;
    private List<Departments> departmentsList;


    public DepartmentsAdapter(List<Departments> departmentsList) {
        this.departmentsList = departmentsList;
    }

    @NonNull
    @Override
    public DepartmentsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.department_single_layout, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DepartmentsAdapter.ViewHolder holder, int position) {

        String name = departmentsList.get(position).getDepartmentName();
        holder.setName(name);

    }

    @Override
    public int getItemCount() {
        return departmentsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private View view;
        private TextView departmentName;
        private ImageView departmentImage;


        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;

        }

        public void setName(String name) {
            departmentName = (TextView) view.findViewById(R.id.departmentName);
            departmentName.setText(name);
        }

        public void setImage(String image) {

        }
    }
}
