package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.play_billing.C2399b1;

/* JADX INFO: loaded from: classes6.dex */
public final class nwy0 extends uqy0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ dyy0 f144053h;

    public nwy0(dyy0 dyy0Var) {
        this.f144053h = dyy0Var;
    }

    @Override // p153l.uqy0
    /* JADX INFO: renamed from: a */
    public final String mo165053a() {
        C2399b1 c2399b1 = (C2399b1) this.f144053h.f91310a.get();
        if (c2399b1 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(c2399b1.f10347a) + Constants.AES_SUFFIX;
    }
}
