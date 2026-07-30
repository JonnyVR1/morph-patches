package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import l.a;
import l.e6c0;
import l.j760;
import l.s4c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dr4 extends a<j760<String, CharSequence>> {

    /* JADX INFO: renamed from: c */
    public final Context f11958c;

    /* JADX INFO: renamed from: d */
    public final List<j760<String, CharSequence>> f11959d;

    public dr4(Context context, String str, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        this.f11959d = arrayList;
        this.f11958c = context;
        arrayList.add(vwb.Y(str, charSequence));
    }

    /* JADX INFO: renamed from: m */
    public View m13449m(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f11958c).inflate(e6c0.a, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<j760<String, CharSequence>> m13450p() {
        return this.f11959d;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m13448j(View view, j760<String, CharSequence> j760Var, int i, int i2) {
        TextView textView = (TextView) view.findViewById(s4c0.s0);
        TextView textView2 = (TextView) view.findViewById(s4c0.t);
        if (j760Var != null) {
            textView.setText((CharSequence) j760Var.a);
            textView2.setText((CharSequence) j760Var.b);
            textView2.requestLayout();
        }
    }
}
