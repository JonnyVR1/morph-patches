package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.SignInData;
import p147v.VButton_FakeShadow;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class vzk0 implements s7m<tzk0> {

    /* JADX INFO: renamed from: a */
    public VText f183644a;

    /* JADX INFO: renamed from: b */
    public VButton_FakeShadow f183645b;

    /* JADX INFO: renamed from: c */
    public final PutongAct f183646c;

    /* JADX INFO: renamed from: d */
    public tzk0 f183647d;

    public vzk0(PutongAct putongAct) {
        this.f183646c = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m200767e(View view) {
        this.f183647d.m191208g0();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f183646c;
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f183646c;
    }

    /* JADX INFO: renamed from: b */
    public View m200768b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wzk0.m206290b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tzk0 tzk0Var) {
        this.f183647d = tzk0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m200770d(SignInData signInData) {
        act().hackCenterTitle = true;
        act().setTitle(R$string.f16213g4);
        act().getSupportActionBar().mo134112B(v2c0.f179424P1);
        xdl0.m208329E0(this.f183645b, new View.OnClickListener() { // from class: l.uzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179004a.m200767e(view);
            }
        });
        String strM214969y = yij0.m214969y(signInData.username);
        this.f183644a.setText(ddj0.m111020a(getContext(), R$string.f16195d4, i0g0.m133861b0(strM214969y, vwb.m200324f0(strM214969y), -570425344, eqh0.m117752c(2))));
    }

    /* JADX INFO: renamed from: f */
    public void m200771f() {
        yij0.m214940R(this.f183646c);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m200768b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
