package p149l;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.p046p1.mobile.putong.location.AbstractC13063a;
import com.p046p1.mobile.putong.location.Location;
import p147v.VCheckBox;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class t0g {

    /* JADX INFO: renamed from: a */
    public static dd80 f167180a;

    /* JADX INFO: renamed from: l.t0g$a */
    public class ViewOnClickListenerC20091a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VCheckBox f167181a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VEditText f167182b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ VEditText f167183c;

        public ViewOnClickListenerC20091a(VCheckBox vCheckBox, VEditText vEditText, VEditText vEditText2) {
            this.f167181a = vCheckBox;
            this.f167182b = vEditText;
            this.f167183c = vEditText2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t0g.f167180a.dismiss();
            try {
                AbstractC13063a abstractC13063a = qib0.f154687E;
                abstractC13063a.f53964a.put(Boolean.valueOf(this.f167181a.isChecked()));
                abstractC13063a.f53965b.put(Double.valueOf(Double.parseDouble(this.f167182b.getText().toString())));
                abstractC13063a.f53966c.put(Double.valueOf(Double.parseDouble(this.f167183c.getText().toString())));
                abstractC13063a.m78868t();
            } catch (Exception unused) {
                qib0.f154687E.f53964a.put(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m186859b(Context context) {
        dd80 dd80VarM110960O = new dd80.C16336a(context).m110962Q(e6c0.f89564w).m110960O();
        f167180a = dd80VarM110960O;
        dd80VarM110960O.show();
        View viewM110906L = f167180a.m110906L();
        ((VText) viewM110906L.findViewById(s4c0.f162367w)).setText("    当前定位类型：国际化");
        String[] strArr = {"INVALID", "UNKNOWN", "OFFLINE", "CACHE", "CELL", "WIFI", "GPS"};
        VCheckBox vCheckBox = (VCheckBox) viewM110906L.findViewById(s4c0.f162299I);
        Spinner spinner = (Spinner) viewM110906L.findViewById(s4c0.f162345l);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        Spinner spinner2 = (Spinner) viewM110906L.findViewById(s4c0.f162331e);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, strArr);
        arrayAdapter2.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
        Spinner spinner3 = (Spinner) viewM110906L.findViewById(s4c0.f162305L);
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(context, R.layout.simple_spinner_item, strArr);
        arrayAdapter3.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter((SpinnerAdapter) arrayAdapter3);
        VEditText vEditText = (VEditText) viewM110906L.findViewById(s4c0.f162301J);
        VEditText vEditText2 = (VEditText) viewM110906L.findViewById(s4c0.f162303K);
        viewM110906L.findViewById(s4c0.f162356q0).setOnClickListener(new ViewOnClickListenerC20091a(vCheckBox, vEditText, vEditText2));
        AbstractC13063a abstractC13063a = qib0.f154687E;
        if (abstractC13063a.f53964a.get().booleanValue()) {
            vCheckBox.setChecked(true);
        } else {
            vCheckBox.setChecked(false);
        }
        Location locationM78865q = abstractC13063a.m78865q();
        if (locationM78865q != null) {
            vEditText.setText("" + locationM78865q.m78831u());
            vEditText2.setText("" + locationM78865q.m78833x());
        }
    }
}
