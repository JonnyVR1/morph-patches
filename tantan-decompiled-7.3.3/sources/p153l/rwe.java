package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import p151v.VButton;

/* JADX INFO: loaded from: classes12.dex */
public class rwe implements iam<qwe> {

    /* JADX INFO: renamed from: a */
    public VButton f165128a;

    /* JADX INFO: renamed from: b */
    public Act f165129b;

    /* JADX INFO: renamed from: c */
    public qwe f165130c;

    public rwe(Act act) {
        this.f165129b = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f165129b;
    }

    /* JADX INFO: renamed from: a */
    public View m183353a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return swe.m188279b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f165129b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qwe qweVar) {
        this.f165130c = qweVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m183353a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m183355r() {
        bnl0.m105509E0(this.f165128a, this.f165130c.m178475i0());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
