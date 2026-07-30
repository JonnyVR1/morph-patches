package p149l;

import androidx.annotation.NonNull;
import com.android.billingclient.api.C0907y;
import com.google.android.gms.internal.play_billing.C2376b1;

/* JADX INFO: loaded from: classes6.dex */
public final class sqy0 {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static fhv0 m185618a(@NonNull C0907y c0907y) {
        C2376b1 c2376b1 = new C2376b1();
        xoy0 xoy0Var = new xoy0(c2376b1);
        c2376b1.f10311b = xoy0Var;
        c2376b1.f10310a = c0907y.getClass();
        try {
            c2376b1.f10310a = c0907y.m5065a(c2376b1);
            return xoy0Var;
        } catch (Exception e) {
            xoy0Var.m210455b(e);
            return xoy0Var;
        }
    }
}
