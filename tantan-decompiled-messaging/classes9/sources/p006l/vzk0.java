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
public class vzk0 implements s7m<tzk0> {

    /* JADX INFO: renamed from: a */
    public VText f24563a;

    /* JADX INFO: renamed from: b */
    public VButton_FakeShadow f24564b;

    /* JADX INFO: renamed from: c */
    public final PutongAct f24565c;

    /* JADX INFO: renamed from: d */
    public tzk0 f24566d;

    public vzk0(PutongAct putongAct) {
        this.f24565c = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m26076e(View view) {
        this.f24566d.m24871g0();
    }

    /* JADX INFO: renamed from: C0 */
    public Context m26077C0() {
        return this.f24565c;
    }

    public Act act() {
        return this.f24565c;
    }

    /* JADX INFO: renamed from: b */
    public View m26078b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wzk0.m26927b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m26082i1(tzk0 tzk0Var) {
        this.f24566d = tzk0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m26080d(SignInData signInData) {
        act().hackCenterTitle = true;
        act().setTitle(R$string.f202g4);
        act().getSupportActionBar().B(v2c0.f23988P1);
        xdl0.E0(this.f24564b, new View.OnClickListener() { // from class: l.uzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23829a.m26076e(view);
            }
        });
        String strY = yij0.y(signInData.username);
        this.f24563a.setText(ddj0.a(m26077C0(), R$string.f184d4, new CharSequence[]{i0g0.b0(strY, vwb.f0(new String[]{strY}), -570425344, eqh0.c(2))}));
    }

    /* JADX INFO: renamed from: f */
    public void m26081f() {
        yij0.R(this.f24565c);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m26078b(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
