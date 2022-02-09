package edu.weber.w01311060.designstuff;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FireMissilesDialog#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FireMissilesDialog extends DialogFragment
{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FireMissilesDialog()
    {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FireMissilesDialog.
     */
    // TODO: Rename and change types and number of parameters
    public static FireMissilesDialog newInstance(String param1, String param2)
    {
        FireMissilesDialog fragment = new FireMissilesDialog();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("This action will end the world, think carefully")
                .setTitle("Fire Missiles?")
                .setPositiveButton("Start Nuclear Winter", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        Log.d("DialogFragment", "Nuclar war inititated");
                    }
                })
                .setNegativeButton("Abort", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        Log.d("DialogFragment", "Nuclear war aborted");
                    }
                });

        return builder.create();
    }

    //    @Override   Get rid of this when creating a dialog fragment
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState)
//    {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_fire_missiles_dialog, container, false);
//    }
}