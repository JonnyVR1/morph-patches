package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class cs4 extends AbstractC15610a<pf60<String, CharSequence>> {

    /* JADX INFO: renamed from: c */
    public final Context f83412c;

    /* JADX INFO: renamed from: d */
    public final List<pf60<String, CharSequence>> f83413d;

    public cs4(Context context, String str, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        this.f83413d = arrayList;
        this.f83412c = context;
        arrayList.add(jyb.m147494Y(str, charSequence));
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f83412c).inflate(jec0.f120455a, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<pf60<String, CharSequence>> mo21403p() {
        return this.f83413d;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, pf60<String, CharSequence> pf60Var, int i, int i2) {
        TextView textView = (TextView) view.findViewById(ycc0.f198481s0);
        TextView textView2 = (TextView) view.findViewById(ycc0.f198482t);
        if (pf60Var != null) {
            textView.setText(pf60Var.f152156a);
            textView2.setText(pf60Var.f152157b);
            textView2.requestLayout();
        }
    }
}
