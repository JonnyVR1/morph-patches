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
public class vwe implements s7m<twe> {

    /* JADX INFO: renamed from: a */
    public VText f183327a;

    /* JADX INFO: renamed from: b */
    public VButton_FakeShadow f183328b;

    /* JADX INFO: renamed from: c */
    public final PutongAct f183329c;

    /* JADX INFO: renamed from: d */
    public twe f183330d;

    public vwe(PutongAct putongAct) {
        this.f183329c = putongAct;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f183329c;
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f183329c;
    }

    /* JADX INFO: renamed from: b */
    public View m200361b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wwe.m205857b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(twe tweVar) {
        this.f183330d = tweVar;
    }

    /* JADX INFO: renamed from: d */
    public void m200363d(SignInData signInData) {
        act().hackCenterTitle = true;
        act().setTitle(R$string.f16225i4);
        act().getSupportActionBar().mo134112B(v2c0.f179424P1);
        xdl0.m208329E0(this.f183328b, new View.OnClickListener() { // from class: l.uwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178640a.m200364e(view);
            }
        });
        String str = signInData.username;
        this.f183327a.setText(ddj0.m111020a(getContext(), R$string.f16219h4, i0g0.m133861b0(str, vwb.m200324f0(str), -570425344, eqh0.m117752c(2))));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m200364e(View view) {
        this.f183330d.m190852g0();
    }

    /* JADX INFO: renamed from: f */
    public void m200365f() {
        yij0.m214940R(this.f183329c);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m200361b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
