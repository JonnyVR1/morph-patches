package p009l;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.p000p1.mobile.putong.location.AbstractC0465a;
import com.p000p1.mobile.putong.location.Location;
import l.dd80;
import l.e6c0;
import l.qib0;
import l.s4c0;
import v.VCheckBox;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class t0g {

    /* JADX INFO: renamed from: a */
    public static dd80 f20507a;

    /* JADX INFO: renamed from: l.t0g$a */
    public class ViewOnClickListenerC1196a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VCheckBox f20508a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VEditText f20509b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ VEditText f20510c;

        public ViewOnClickListenerC1196a(VCheckBox vCheckBox, VEditText vEditText, VEditText vEditText2) {
            this.f20508a = vCheckBox;
            this.f20509b = vEditText;
            this.f20510c = vEditText2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t0g.f20507a.dismiss();
            try {
                AbstractC0465a abstractC0465a = qib0.E;
                abstractC0465a.f7570a.put(Boolean.valueOf(this.f20508a.isChecked()));
                abstractC0465a.f7571b.put(Double.valueOf(Double.parseDouble(this.f20509b.getText().toString())));
                abstractC0465a.f7572c.put(Double.valueOf(Double.parseDouble(this.f20510c.getText().toString())));
                abstractC0465a.m9163t();
            } catch (Exception unused) {
                qib0.E.f7570a.put(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m22424b(Context context) {
        dd80 dd80VarO = new dd80.a(context).Q(e6c0.w).O();
        f20507a = dd80VarO;
        dd80VarO.show();
        View viewL = f20507a.L();
        viewL.findViewById(s4c0.w).setText("    当前定位类型：国际化");
        String[] strArr = {"INVALID", "UNKNOWN", "OFFLINE", "CACHE", "CELL", "WIFI", "GPS"};
        viewL.findViewById(s4c0.i);
        viewL.findViewById(s4c0.b);
        VCheckBox vCheckBoxFindViewById = viewL.findViewById(s4c0.I);
        Spinner spinner = (Spinner) viewL.findViewById(s4c0.l);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        Spinner spinner2 = (Spinner) viewL.findViewById(s4c0.e);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, strArr);
        arrayAdapter2.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
        Spinner spinner3 = (Spinner) viewL.findViewById(s4c0.L);
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(context, R.layout.simple_spinner_item, strArr);
        arrayAdapter3.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter((SpinnerAdapter) arrayAdapter3);
        viewL.findViewById(s4c0.h);
        viewL.findViewById(s4c0.a);
        viewL.findViewById(s4c0.H);
        viewL.findViewById(s4c0.j);
        viewL.findViewById(s4c0.c);
        VEditText vEditTextFindViewById = viewL.findViewById(s4c0.J);
        viewL.findViewById(s4c0.k);
        viewL.findViewById(s4c0.d);
        VEditText vEditTextFindViewById2 = viewL.findViewById(s4c0.K);
        viewL.findViewById(s4c0.q0).setOnClickListener(new ViewOnClickListenerC1196a(vCheckBoxFindViewById, vEditTextFindViewById, vEditTextFindViewById2));
        AbstractC0465a abstractC0465a = qib0.E;
        if (((Boolean) abstractC0465a.f7570a.get()).booleanValue()) {
            vCheckBoxFindViewById.setChecked(true);
        } else {
            vCheckBoxFindViewById.setChecked(false);
        }
        Location locationM9160q = abstractC0465a.m9160q();
        if (locationM9160q != null) {
            vEditTextFindViewById.setText("" + locationM9160q.m9126u());
            vEditTextFindViewById2.setText("" + locationM9160q.m9128x());
        }
    }
}
