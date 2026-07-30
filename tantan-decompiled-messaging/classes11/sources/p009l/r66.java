package p009l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.messages.ColorTrackTextView;
import com.p1.mobile.putong.core.data.LabelParams;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.f6c0;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class r66 extends dac0<LabelParams> {

    /* JADX INFO: renamed from: c */
    public List<LabelParams> f19644c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final e30<String> f19645d;

    /* JADX INFO: renamed from: e */
    public final w9j<String, Boolean> f19646e;

    public r66(@NonNull e30<String> e30Var, @NonNull w9j<String, Boolean> w9jVar) {
        this.f19645d = e30Var;
        this.f19646e = w9jVar;
    }

    /* JADX INFO: renamed from: C */
    public int m21411C() {
        return this.f19644c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m21412D(ViewGroup viewGroup, int i) {
        return viewGroup.getContext().inflater().inflate(f6c0.C1, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [android.widget.TextView, com.p1.mobile.putong.core.newui.messages.ColorTrackTextView] */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m21410A(View view, final LabelParams labelParams, int i, int i2) {
        ?? r5 = (ColorTrackTextView) view.findViewById(u4c0.x6);
        r5.setText(labelParams.value);
        boolean z = upa.z();
        if (((Boolean) this.f19646e.call(labelParams.key)).booleanValue()) {
            if (z) {
                r5.m4686t(Color.parseColor("#000000"), 0);
                view.setBackgroundResource(x2c0.Ae);
            } else {
                r5.m4686t(Color.parseColor("#FE7E1D"), 0);
                view.setBackgroundResource(x2c0.He);
            }
        } else if (z) {
            r5.m4686t(Color.parseColor("#66000000"), 0);
            view.setBackgroundResource(x2c0.Be);
        } else {
            r5.m4686t(Color.parseColor("#33000000"), 0);
            view.setBackgroundResource(x2c0.He);
        }
        xdl0.E0(view.findViewById(u4c0.v6), new View.OnClickListener() { // from class: l.q66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f19045a.m21416I(labelParams, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public List<LabelParams> m21414G() {
        return this.f19644c;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public LabelParams getItem(int i) {
        return this.f19644c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m21416I(LabelParams labelParams, View view) {
        this.f19645d.call(labelParams.key);
    }

    /* JADX INFO: renamed from: J */
    public void m21417J(List<LabelParams> list) {
        if (list == null || vwb.J(list)) {
            return;
        }
        this.f19644c = list;
        notifyDataSetChanged();
    }

    public long getItemId(int i) {
        return i;
    }
}
