package p149l;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pvm {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f151484a;

    /* JADX INFO: renamed from: b */
    public VImage f151485b;

    /* JADX INFO: renamed from: c */
    public VRelative f151486c;

    /* JADX INFO: renamed from: d */
    public VImage f151487d;

    /* JADX INFO: renamed from: e */
    public VImage f151488e;

    /* JADX INFO: renamed from: f */
    public VText f151489f;

    /* JADX INFO: renamed from: g */
    public VText f151490g;

    /* JADX INFO: renamed from: h */
    public Act f151491h;

    /* JADX INFO: renamed from: i */
    public Privilege f151492i;

    public pvm(Act act) {
        this.f151491h = act;
    }

    /* JADX INFO: renamed from: b */
    public final void m171682b(View view) {
        qvm.m176707a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public View m171683c(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.f131501L, viewGroup, false);
        m171682b(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public final int m171684d(String str) {
        int iM186890d;
        int iM186890d2;
        float fM131710o1 = hmb.m131710o1(14, str);
        float fM208412y0 = fM131710o1 % (xdl0.m208412y0() - t100.m186890d(40.0f));
        int iM208412y0 = (int) (fM131710o1 / (xdl0.m208412y0() - t100.m186890d(40.0f)));
        if (fM208412y0 != 0.0f) {
            iM186890d = t100.m186890d(299.0f);
            iM208412y0++;
            iM186890d2 = t100.m186890d(17.0f);
        } else {
            iM186890d = t100.m186890d(299.0f);
            iM186890d2 = t100.m186890d(17.0f);
        }
        return iM186890d + (iM208412y0 * iM186890d2);
    }

    /* JADX INFO: renamed from: e */
    public void m171685e(Act act, User user, boolean z) {
        m171686f();
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: f */
    public final void m171686f() {
        xdl0.m208325C0(this.f151484a, m171684d(this.f151491h.getString(R$string.f27239N5)));
        xdl0.m208344M(this.f151484a, true);
        xdl0.m208344M(this.f151485b, true);
        this.f151484a.setImageUrl("https://auto.tancdn.com/v1/raw/a541c11d-11a4-45a0-8da8-5bbe944a579614.webp");
        this.f151488e.setImageResource(d3c0.f83712Q0);
        this.f151489f.setText(R$string.f27239N5);
        this.f151490g.setText(String.format(this.f151491h.getString(R$string.f27206K5), Integer.valueOf(xma.m210052Q3())));
        this.f151489f.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: g */
    public void m171687g(final e30<Integer> e30Var) {
        xdl0.m208329E0(this.f151487d, new View.OnClickListener() { // from class: l.ovm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(0);
            }
        });
    }
}
