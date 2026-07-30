package p002l;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import l.d3c0;
import l.e30;
import l.hmb;
import l.m6c0;
import l.qvm;
import l.t100;
import l.xdl0;
import l.xma;
import v.AutoVDraweeView;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pvm {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f17690a;

    /* JADX INFO: renamed from: b */
    public VImage f17691b;

    /* JADX INFO: renamed from: c */
    public VRelative f17692c;

    /* JADX INFO: renamed from: d */
    public VImage f17693d;

    /* JADX INFO: renamed from: e */
    public VImage f17694e;

    /* JADX INFO: renamed from: f */
    public VText f17695f;

    /* JADX INFO: renamed from: g */
    public VText f17696g;

    /* JADX INFO: renamed from: h */
    public Act f17697h;

    /* JADX INFO: renamed from: i */
    public Privilege f17698i;

    public pvm(Act act) {
        this.f17697h = act;
    }

    /* JADX INFO: renamed from: b */
    public final void m20724b(View view) {
        qvm.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public View m20725c(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.L, viewGroup, false);
        m20724b(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public final int m20726d(String str) {
        int iD;
        int iD2;
        float fO1 = hmb.o1(14, str);
        float fY0 = fO1 % (xdl0.y0() - t100.d(40.0f));
        int iY0 = (int) (fO1 / (xdl0.y0() - t100.d(40.0f)));
        if (fY0 != 0.0f) {
            iD = t100.d(299.0f);
            iY0++;
            iD2 = t100.d(17.0f);
        } else {
            iD = t100.d(299.0f);
            iD2 = t100.d(17.0f);
        }
        return iD + (iY0 * iD2);
    }

    /* JADX INFO: renamed from: e */
    public void m20727e(Act act, User user, boolean z) {
        m20728f();
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: f */
    public final void m20728f() {
        xdl0.C0(this.f17690a, m20726d(this.f17697h.getString(R.string.N5)));
        xdl0.M(this.f17690a, true);
        xdl0.M(this.f17691b, true);
        this.f17690a.setImageUrl("https://auto.tancdn.com/v1/raw/a541c11d-11a4-45a0-8da8-5bbe944a579614.webp");
        this.f17694e.setImageResource(d3c0.Q0);
        this.f17695f.setText(R.string.N5);
        this.f17696g.setText(String.format(this.f17697h.getString(R.string.K5), Integer.valueOf(xma.Q3())));
        this.f17695f.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: g */
    public void m20729g(final e30<Integer> e30Var) {
        xdl0.E0(this.f17693d, new View.OnClickListener() { // from class: l.ovm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(0);
            }
        });
    }
}
