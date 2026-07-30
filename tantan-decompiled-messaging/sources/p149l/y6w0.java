package p149l;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class y6w0 implements o6w0 {

    /* JADX INFO: renamed from: f */
    public static y6w0 f196648f;

    /* JADX INFO: renamed from: a */
    public float f196649a = 0.0f;

    /* JADX INFO: renamed from: b */
    public final k6w0 f196650b;

    /* JADX INFO: renamed from: c */
    public final i6w0 f196651c;

    /* JADX INFO: renamed from: d */
    public j6w0 f196652d;

    /* JADX INFO: renamed from: e */
    public n6w0 f196653e;

    public y6w0(k6w0 k6w0Var, i6w0 i6w0Var) {
        this.f196650b = k6w0Var;
        this.f196651c = i6w0Var;
    }

    /* JADX INFO: renamed from: c */
    public static y6w0 m213252c() {
        if (f196648f == null) {
            f196648f = new y6w0(new k6w0(), new i6w0());
        }
        return f196648f;
    }

    @Override // p149l.o6w0
    /* JADX INFO: renamed from: a */
    public final void mo148783a(boolean z) {
        if (z) {
            a8w0.m95375d().m95382i();
        } else {
            a8w0.m95375d().m95381h();
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m213253b() {
        return this.f196649a;
    }

    /* JADX INFO: renamed from: d */
    public final void m213254d(Context context) {
        this.f196652d = new j6w0(new Handler(), context, new h6w0(), this);
    }

    /* JADX INFO: renamed from: e */
    public final void m213255e(float f) {
        this.f196649a = f;
        if (this.f196653e == null) {
            this.f196653e = n6w0.m158096a();
        }
        Iterator it = this.f196653e.m158097b().iterator();
        while (it.hasNext()) {
            ((e6w0) it.next()).m115115g().m115224i(f);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m213256f() {
        m6w0.m153308i().m167695e(this);
        m6w0.m153308i().m167696f();
        a8w0.m95375d().m95382i();
        this.f196652d.m140059a();
    }

    /* JADX INFO: renamed from: g */
    public final void m213257g() {
        a8w0.m95375d().m95383j();
        m6w0.m153308i().m167697g();
        this.f196652d.m140060b();
    }
}
