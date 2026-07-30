package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.SignInData;
import l.ddj0;
import l.eqh0;
import l.i0g0;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.yij0;
import v.VButton_FakeShadow;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vwe implements s7m<twe> {

    /* JADX INFO: renamed from: a */
    public VText f24502a;

    /* JADX INFO: renamed from: b */
    public VButton_FakeShadow f24503b;

    /* JADX INFO: renamed from: c */
    public final PutongAct f24504c;

    /* JADX INFO: renamed from: d */
    public twe f24505d;

    public vwe(PutongAct putongAct) {
        this.f24504c = putongAct;
    }

    /* JADX INFO: renamed from: C0 */
    public Context m25950C0() {
        return this.f24504c;
    }

    public Act act() {
        return this.f24504c;
    }

    /* JADX INFO: renamed from: b */
    public View m25951b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wwe.m26793b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m25956i1(twe tweVar) {
        this.f24505d = tweVar;
    }

    /* JADX INFO: renamed from: d */
    public void m25953d(SignInData signInData) {
        act().hackCenterTitle = true;
        act().setTitle(R$string.f214i4);
        act().getSupportActionBar().B(v2c0.f23988P1);
        xdl0.E0(this.f24503b, new View.OnClickListener() { // from class: l.uwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23781a.m25954e(view);
            }
        });
        String str = signInData.username;
        this.f24502a.setText(ddj0.a(m25950C0(), R$string.f208h4, new CharSequence[]{i0g0.b0(str, vwb.f0(new String[]{str}), -570425344, eqh0.c(2))}));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m25954e(View view) {
        this.f24505d.m24842g0();
    }

    /* JADX INFO: renamed from: f */
    public void m25955f() {
        yij0.R(this.f24504c);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25951b(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
