package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import p137rx.C22421c;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class li60 implements iam<ii60> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f132184a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit f132185b;

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f132186c;

    /* JADX INFO: renamed from: d */
    public ii60 f132187d;

    /* JADX INFO: renamed from: e */
    public final PutongAct f132188e;

    public li60(PutongAct putongAct) {
        this.f132188e = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m154299f(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m154300i(View view) {
        this.f132187d.m140061p0(this.f132185b.getText().toString());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f132188e;
    }

    @Override // p153l.iam
    public Act act() {
        return this.f132188e;
    }

    /* JADX INFO: renamed from: c */
    public View m154301c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mi60.m158466b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ii60 ii60Var) {
        this.f132187d = ii60Var;
    }

    /* JADX INFO: renamed from: e */
    public void m154303e(boolean z) {
        bnl0.m105591y(this.f132186c, z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m154301c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public C22421c<CharSequence> m154304j() {
        return this.f132185b.m224373H();
    }

    /* JADX INFO: renamed from: r */
    public void m154305r() {
        this.f132184a.setTitle(act().getString(R$string.f28703g3));
        this.f132184a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ji60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121046a.m154299f(view);
            }
        });
        this.f132186c.setOnClickListener(new View.OnClickListener() { // from class: l.ki60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126970a.m154300i(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
