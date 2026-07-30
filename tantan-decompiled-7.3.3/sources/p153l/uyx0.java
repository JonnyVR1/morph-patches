package p153l;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.ump.ConsentInformation;

/* JADX INFO: loaded from: classes6.dex */
public final class uyx0 implements ConsentInformation {

    /* JADX INFO: renamed from: a */
    public final tqr0 f181683a;

    /* JADX INFO: renamed from: b */
    public final qyy0 f181684b;

    /* JADX INFO: renamed from: c */
    public final ols0 f181685c;

    /* JADX INFO: renamed from: d */
    public final Object f181686d = new Object();

    /* JADX INFO: renamed from: e */
    public final Object f181687e = new Object();

    /* JADX INFO: renamed from: f */
    public boolean f181688f = false;

    /* JADX INFO: renamed from: g */
    public boolean f181689g = false;

    /* JADX INFO: renamed from: h */
    public wx5 f181690h = new wx5.C21196a().m208372a();

    public uyx0(tqr0 tqr0Var, qyy0 qyy0Var, ols0 ols0Var) {
        this.f181683a = tqr0Var;
        this.f181684b = qyy0Var;
        this.f181685c = ols0Var;
    }

    @Override // com.google.android.ump.ConsentInformation
    /* JADX INFO: renamed from: a */
    public final void mo15434a(@Nullable Activity activity, wx5 wx5Var, ConsentInformation.InterfaceC2657b interfaceC2657b, ConsentInformation.InterfaceC2656a interfaceC2656a) {
        synchronized (this.f181686d) {
            this.f181688f = true;
        }
        this.f181690h = wx5Var;
        this.f181684b.m178759c(activity, wx5Var, interfaceC2657b, interfaceC2656a);
    }

    @Override // com.google.android.ump.ConsentInformation
    /* JADX INFO: renamed from: b */
    public final boolean mo15435b() {
        if (!this.f181683a.m192359i()) {
            int iM192351a = !m198716c() ? 0 : this.f181683a.m192351a();
            if (iM192351a != 1 && iM192351a != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m198716c() {
        boolean z;
        synchronized (this.f181686d) {
            z = this.f181688f;
        }
        return z;
    }
}
