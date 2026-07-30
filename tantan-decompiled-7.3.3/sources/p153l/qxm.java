package p153l;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qxm {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f160054a;

    /* JADX INFO: renamed from: b */
    public VImage f160055b;

    /* JADX INFO: renamed from: c */
    public VRelative f160056c;

    /* JADX INFO: renamed from: d */
    public VImage f160057d;

    /* JADX INFO: renamed from: e */
    public VImage f160058e;

    /* JADX INFO: renamed from: f */
    public VText f160059f;

    /* JADX INFO: renamed from: g */
    public VText f160060g;

    /* JADX INFO: renamed from: h */
    public Act f160061h;

    /* JADX INFO: renamed from: i */
    public Privilege f160062i;

    public qxm(Act act) {
        this.f160061h = act;
    }

    /* JADX INFO: renamed from: b */
    public final void m178608b(View view) {
        rxm.m183554a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public View m178609c(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(rec0.f162461L, viewGroup, false);
        m178608b(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public final int m178610d(String str) {
        int iM175859d;
        int iM175859d2;
        float fM201955o1 = vnb.m201955o1(14, str);
        float fM105592y0 = fM201955o1 % (bnl0.m105592y0() - qa00.m175859d(40.0f));
        int iM105592y0 = (int) (fM201955o1 / (bnl0.m105592y0() - qa00.m175859d(40.0f)));
        if (fM105592y0 != 0.0f) {
            iM175859d = qa00.m175859d(299.0f);
            iM105592y0++;
            iM175859d2 = qa00.m175859d(17.0f);
        } else {
            iM175859d = qa00.m175859d(299.0f);
            iM175859d2 = qa00.m175859d(17.0f);
        }
        return iM175859d + (iM105592y0 * iM175859d2);
    }

    /* JADX INFO: renamed from: e */
    public void m178611e(Act act, User user, boolean z) {
        m178612f();
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: f */
    public final void m178612f() {
        bnl0.m105505C0(this.f160054a, m178610d(this.f160061h.getString(R$string.f28087N5)));
        bnl0.m105524M(this.f160054a, true);
        bnl0.m105524M(this.f160055b, true);
        this.f160054a.setImageUrl("https://auto.tancdn.com/v1/raw/a541c11d-11a4-45a0-8da8-5bbe944a579614.webp");
        this.f160058e.setImageResource(jbc0.f119367Q0);
        this.f160059f.setText(R$string.f28087N5);
        this.f160060g.setText(String.format(this.f160061h.getString(R$string.f28054K5), Integer.valueOf(joa.m146366R3())));
        this.f160059f.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: g */
    public void m178613g(final y20<Integer> y20Var) {
        bnl0.m105509E0(this.f160057d, new View.OnClickListener() { // from class: l.pxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(0);
            }
        });
    }
}
