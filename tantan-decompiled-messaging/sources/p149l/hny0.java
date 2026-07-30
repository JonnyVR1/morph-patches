package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.play_billing.C2376b1;

/* JADX INFO: loaded from: classes6.dex */
public final class hny0 extends ohy0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xoy0 f108733h;

    public hny0(xoy0 xoy0Var) {
        this.f108733h = xoy0Var;
    }

    @Override // p149l.ohy0
    /* JADX INFO: renamed from: a */
    public final String mo132030a() {
        C2376b1 c2376b1 = (C2376b1) this.f108733h.f193889a.get();
        if (c2376b1 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(c2376b1.f10310a) + Constants.AES_SUFFIX;
    }
}
