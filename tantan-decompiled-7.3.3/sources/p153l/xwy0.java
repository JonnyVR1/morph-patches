package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class xwy0 extends u1z0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ pyy0 f196567h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwy0(pyy0 pyy0Var, k3z0 k3z0Var, CharSequence charSequence) {
        super(k3z0Var, charSequence);
        this.f196567h = pyy0Var;
    }

    @Override // p153l.u1z0
    /* JADX INFO: renamed from: b */
    public final int mo194228b(int i) {
        return i + 1;
    }

    @Override // p153l.u1z0
    /* JADX INFO: renamed from: c */
    public final int mo194229c(int i) {
        CharSequence charSequence = this.f177157c;
        int length = charSequence.length();
        tuy0.m192767b(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            pyy0 pyy0Var = this.f196567h;
            if (pyy0Var.f154699a.mo103146a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
