package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import p151v.VButton_FakeShadow;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class bvd implements iam<avd> {

    /* JADX INFO: renamed from: a */
    public TextView f78579a;

    /* JADX INFO: renamed from: b */
    public TextView f78580b;

    /* JADX INFO: renamed from: c */
    public TextView f78581c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f78582d;

    /* JADX INFO: renamed from: e */
    public VText f78583e;

    /* JADX INFO: renamed from: f */
    public Act f78584f;

    /* JADX INFO: renamed from: g */
    public avd f78585g;

    public bvd(Act act) {
        this.f78584f = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f78584f;
    }

    /* JADX INFO: renamed from: a */
    public View m106559a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cvd.m112795b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f78584f;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(avd avdVar) {
        this.f78585g = avdVar;
    }

    /* JADX INFO: renamed from: c */
    public void m106561c(Throwable th) {
        act().progressDismiss();
        bsj0.m106246D(th);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m106559a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m106562r() {
        act().setSwipeBackEnable(false);
        act().getSupportActionBar().mo102196w(false);
        bnl0.m105509E0(this.f78582d, this.f78585g.m100450x0());
        bnl0.m105509E0(this.f78583e, this.f78585g.m100449u0());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
