package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class wow0 extends bpw0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ xow0 f190198g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wow0(xow0 xow0Var, dpw0 dpw0Var, CharSequence charSequence) {
        super(dpw0Var, charSequence);
        this.f190198g = xow0Var;
    }

    @Override // p153l.bpw0
    /* JADX INFO: renamed from: b */
    public final int mo105853b(int i) {
        return i + 1;
    }

    @Override // p153l.bpw0
    /* JADX INFO: renamed from: c */
    public final int mo105854c(int i) {
        CharSequence charSequence = this.f77825c;
        int length = charSequence.length();
        tow0.m192087b(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            xow0 xow0Var = this.f190198g;
            if (xow0Var.f195608a.mo99233a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
