package sg.edu.rp.c346.additionalexercise;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Employee> employeeList;

    public CustomAdapter(Context context,int resource,ArrayList<Employee> objects){
        super(context,resource,objects);
        parent_context=context;
        layout_id=resource;
        employeeList=objects;
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI Elements and assign to variables
        TextView tvName=(TextView)rowView.findViewById(R.id.textViewName);
        TextView tvTitle=(TextView)rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary=(TextView)rowView.findViewById(R.id.textViewSalary);

        // Obtain the employee item based on the 'position'.
        Employee currentItem = employeeList.get(position);

        // Set the TextView to display corresponding information
        tvName.setText(currentItem.getTitle());
        tvTitle.setText(currentItem.getTitle());
        tvSalary.setText(currentItem.getDoubleString());



        return rowView;
    }
}
