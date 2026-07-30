package p149l;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class i0t0 implements sxr0 {

    /* JADX INFO: renamed from: a */
    public final Context f110379a;

    /* JADX INFO: renamed from: b */
    public final Object f110380b;

    /* JADX INFO: renamed from: c */
    public final String f110381c;

    /* JADX INFO: renamed from: d */
    public boolean f110382d;

    public i0t0(Context context, String str) {
        this.f110379a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f110381c = str;
        this.f110382d = false;
        this.f110380b = new Object();
    }

    @Override // p149l.sxr0
    /* JADX INFO: renamed from: U */
    public final void mo13669U(rxr0 rxr0Var) {
        m133932i(rxr0Var.f161504j);
    }

    /* JADX INFO: renamed from: b */
    public final String m133931b() {
        return this.f110381c;
    }

    /* JADX INFO: renamed from: i */
    public final void m133932i(boolean z) {
        if (vny0.m199078p().m152537p(this.f110379a)) {
            synchronized (this.f110380b) {
                try {
                    if (this.f110382d == z) {
                        return;
                    }
                    this.f110382d = z;
                    if (TextUtils.isEmpty(this.f110381c)) {
                        return;
                    }
                    if (this.f110382d) {
                        vny0.m199078p().m152527f(this.f110379a, this.f110381c);
                    } else {
                        vny0.m199078p().m152528g(this.f110379a, this.f110381c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
