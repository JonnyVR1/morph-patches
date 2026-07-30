package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import p133rx.C22306c;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes8.dex */
public class ga60 implements s7m<da60> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f101631a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit f101632b;

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f101633c;

    /* JADX INFO: renamed from: d */
    public da60 f101634d;

    /* JADX INFO: renamed from: e */
    public final PutongAct f101635e;

    public ga60(PutongAct putongAct) {
        this.f101635e = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m124926f(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m124927i(View view) {
        this.f101634d.m110578p0(this.f101632b.getText().toString());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f101635e;
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f101635e;
    }

    /* JADX INFO: renamed from: c */
    public View m124928c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ha60.m130069b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(da60 da60Var) {
        this.f101634d = da60Var;
    }

    /* JADX INFO: renamed from: e */
    public void m124930e(boolean z) {
        xdl0.m208411y(this.f101633c, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m124928c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public C22306c<CharSequence> m124931j() {
        return this.f101632b.m223127H();
    }

    /* JADX INFO: renamed from: r */
    public void m124932r() {
        this.f101631a.setTitle(act().getString(R$string.f27855g3));
        this.f101631a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ea60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90174a.m124926f(view);
            }
        });
        this.f101633c.setOnClickListener(new View.OnClickListener() { // from class: l.fa60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96570a.m124927i(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
