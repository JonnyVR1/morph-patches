package p153l;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.p051p1.mobile.putong.location.Location;
import p151v.VCheckBox;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h2g {

    /* JADX INFO: renamed from: a */
    public static jl80 f107546a;

    /* JADX INFO: renamed from: l.h2g$a */
    public class ViewOnClickListenerC17373a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VCheckBox f107547a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VEditText f107548b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ VEditText f107549c;

        public ViewOnClickListenerC17373a(VCheckBox vCheckBox, VEditText vEditText, VEditText vEditText2) {
            this.f107547a = vCheckBox;
            this.f107548b = vEditText;
            this.f107549c = vEditText2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h2g.f107546a.dismiss();
            try {
                AbstractC13226a abstractC13226a = uqb0.f180370E;
                abstractC13226a.f54812a.put(Boolean.valueOf(this.f107547a.isChecked()));
                abstractC13226a.f54813b.put(Double.valueOf(Double.parseDouble(this.f107548b.getText().toString())));
                abstractC13226a.f54814c.put(Double.valueOf(Double.parseDouble(this.f107549c.getText().toString())));
                abstractC13226a.m80051t();
            } catch (Exception unused) {
                uqb0.f180370E.f54812a.put(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m133391b(Context context) {
        jl80 jl80VarM146020O = new jl80.C17971a(context).m146022Q(jec0.f120477w).m146020O();
        f107546a = jl80VarM146020O;
        jl80VarM146020O.show();
        View viewM145966L = f107546a.m145966L();
        ((VText) viewM145966L.findViewById(ycc0.f198488w)).setText("    当前定位类型：国际化");
        String[] strArr = {"INVALID", "UNKNOWN", "OFFLINE", "CACHE", "CELL", "WIFI", "GPS"};
        VCheckBox vCheckBox = (VCheckBox) viewM145966L.findViewById(ycc0.f198420I);
        Spinner spinner = (Spinner) viewM145966L.findViewById(ycc0.f198466l);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        Spinner spinner2 = (Spinner) viewM145966L.findViewById(ycc0.f198452e);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, strArr);
        arrayAdapter2.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
        Spinner spinner3 = (Spinner) viewM145966L.findViewById(ycc0.f198426L);
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(context, R.layout.simple_spinner_item, strArr);
        arrayAdapter3.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter((SpinnerAdapter) arrayAdapter3);
        VEditText vEditText = (VEditText) viewM145966L.findViewById(ycc0.f198422J);
        VEditText vEditText2 = (VEditText) viewM145966L.findViewById(ycc0.f198424K);
        viewM145966L.findViewById(ycc0.f198477q0).setOnClickListener(new ViewOnClickListenerC17373a(vCheckBox, vEditText, vEditText2));
        AbstractC13226a abstractC13226a = uqb0.f180370E;
        if (abstractC13226a.f54812a.get().booleanValue()) {
            vCheckBox.setChecked(true);
        } else {
            vCheckBox.setChecked(false);
        }
        Location locationM80048q = abstractC13226a.m80048q();
        if (locationM80048q != null) {
            vEditText.setText("" + locationM80048q.m80014u());
            vEditText2.setText("" + locationM80048q.m80016x());
        }
    }
}
