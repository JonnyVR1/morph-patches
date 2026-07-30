package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class dr4 extends AbstractC15503a<j760<String, CharSequence>> {

    /* JADX INFO: renamed from: c */
    public final Context f87570c;

    /* JADX INFO: renamed from: d */
    public final List<j760<String, CharSequence>> f87571d;

    public dr4(Context context, String str, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        this.f87571d = arrayList;
        this.f87570c = context;
        arrayList.add(vwb.m200311Y(str, charSequence));
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f87570c).inflate(e6c0.f89542a, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<j760<String, CharSequence>> mo20404p() {
        return this.f87571d;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, j760<String, CharSequence> j760Var, int i, int i2) {
        TextView textView = (TextView) view.findViewById(s4c0.f162360s0);
        TextView textView2 = (TextView) view.findViewById(s4c0.f162361t);
        if (j760Var != null) {
            textView.setText(j760Var.f116564a);
            textView2.setText(j760Var.f116565b);
            textView2.requestLayout();
        }
    }
}
