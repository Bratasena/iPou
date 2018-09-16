package me.helloworlds.iPou;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Mitra4Fragment extends Fragment {
    private Button logout;
    private TextView txtUser,txtIpay;
    private String user,ipay;

    public Mitra4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mitra4, container, false);
        txtIpay = (TextView) view.findViewById(R.id.iPayProfile);
        txtUser = (TextView) view.findViewById(R.id.userProfile);
        user = getArguments().getString("name");
        ipay = getArguments().getString("ipay");
        txtUser.setText(user);
        txtIpay.setText("Rp."+ipay);
        logout = (Button) view.findViewById(R.id.btnLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Login.class);
                startActivity(i);
                getActivity().finish();
            }
        });
        return view;
    }

}