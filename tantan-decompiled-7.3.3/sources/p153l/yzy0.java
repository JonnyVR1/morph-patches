package p153l;

import androidx.annotation.NonNull;
import com.android.billingclient.api.C0911y;
import com.google.android.gms.internal.play_billing.C2399b1;

/* JADX INFO: loaded from: classes6.dex */
public final class yzy0 {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static lqv0 m218091a(@NonNull C0911y c0911y) {
        C2399b1 c2399b1 = new C2399b1();
        dyy0 dyy0Var = new dyy0(c2399b1);
        c2399b1.f10348b = dyy0Var;
        c2399b1.f10347a = c0911y.getClass();
        try {
            c2399b1.f10347a = c0911y.m5075a(c2399b1);
            return dyy0Var;
        } catch (Exception e) {
            dyy0Var.m118731b(e);
            return dyy0Var;
        }
    }
}
