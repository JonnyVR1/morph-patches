package p153l;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class o9t0 implements y6s0 {

    /* JADX INFO: renamed from: a */
    public final Context f145629a;

    /* JADX INFO: renamed from: b */
    public final Object f145630b;

    /* JADX INFO: renamed from: c */
    public final String f145631c;

    /* JADX INFO: renamed from: d */
    public boolean f145632d;

    public o9t0(Context context, String str) {
        this.f145629a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f145631c = str;
        this.f145632d = false;
        this.f145630b = new Object();
    }

    @Override // p153l.y6s0
    /* JADX INFO: renamed from: U */
    public final void mo13723U(x6s0 x6s0Var) {
        m166811i(x6s0Var.f192630j);
    }

    /* JADX INFO: renamed from: b */
    public final String m166810b() {
        return this.f145631c;
    }

    /* JADX INFO: renamed from: i */
    public final void m166811i(boolean z) {
        if (bxy0.m106932p().m185241p(this.f145629a)) {
            synchronized (this.f145630b) {
                try {
                    if (this.f145632d == z) {
                        return;
                    }
                    this.f145632d = z;
                    if (TextUtils.isEmpty(this.f145631c)) {
                        return;
                    }
                    if (this.f145632d) {
                        bxy0.m106932p().m185231f(this.f145629a, this.f145631c);
                    } else {
                        bxy0.m106932p().m185232g(this.f145629a, this.f145631c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
