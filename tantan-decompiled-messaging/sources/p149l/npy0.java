package p149l;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class npy0 extends noy0 {

    /* JADX INFO: renamed from: h */
    public final HashMap f140018h = new HashMap();

    /* JADX INFO: renamed from: i */
    @Nullable
    public Handler f140019i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public vjx0 f140020j;

    /* JADX INFO: renamed from: A */
    public abstract void mo142978A(Object obj, gqy0 gqy0Var, xqt0 xqt0Var);

    /* JADX INFO: renamed from: B */
    public final void m160551B(final Object obj, gqy0 gqy0Var) {
        f5v0.m119533d(!this.f140018h.containsKey(obj));
        fqy0 fqy0Var = new fqy0() { // from class: l.roy0
            @Override // p149l.fqy0
            /* JADX INFO: renamed from: a */
            public final void mo114572a(gqy0 gqy0Var2, xqt0 xqt0Var) {
                this.f160457a.mo142978A(obj, gqy0Var2, xqt0Var);
            }
        };
        soy0 soy0Var = new soy0(this, obj);
        this.f140018h.put(obj, new toy0(gqy0Var, fqy0Var, soy0Var));
        Handler handler = this.f140019i;
        handler.getClass();
        gqy0Var.mo127639f(handler, soy0Var);
        Handler handler2 = this.f140019i;
        handler2.getClass();
        gqy0Var.mo127642j(handler2, soy0Var);
        gqy0Var.mo127640g(fqy0Var, this.f140020j, m160431o());
        if (m160439z()) {
            return;
        }
        gqy0Var.mo127643l(fqy0Var);
    }

    /* JADX INFO: renamed from: C */
    public int mo151757C(Object obj, int i) {
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    public abstract eqy0 mo142979E(Object obj, eqy0 eqy0Var);

    @Override // p149l.gqy0
    @CallSuper
    /* JADX INFO: renamed from: G */
    public void mo98640G() throws IOException {
        Iterator it = this.f140018h.values().iterator();
        while (it.hasNext()) {
            ((toy0) it.next()).f171419a.mo98640G();
        }
    }

    @Override // p149l.noy0
    @CallSuper
    /* JADX INFO: renamed from: t */
    public final void mo160436t() {
        for (toy0 toy0Var : this.f140018h.values()) {
            toy0Var.f171419a.mo127643l(toy0Var.f171420b);
        }
    }

    @Override // p149l.noy0
    @CallSuper
    /* JADX INFO: renamed from: u */
    public final void mo160437u() {
        for (toy0 toy0Var : this.f140018h.values()) {
            toy0Var.f171419a.mo127644n(toy0Var.f171420b);
        }
    }

    @Override // p149l.noy0
    @CallSuper
    /* JADX INFO: renamed from: v */
    public void mo98646v(@Nullable vjx0 vjx0Var) {
        this.f140020j = vjx0Var;
        this.f140019i = ggw0.m126055L(null);
    }

    @Override // p149l.noy0
    @CallSuper
    /* JADX INFO: renamed from: x */
    public void mo98647x() {
        for (toy0 toy0Var : this.f140018h.values()) {
            toy0Var.f171419a.mo127641h(toy0Var.f171420b);
            toy0Var.f171419a.mo127638e(toy0Var.f171421c);
            toy0Var.f171419a.mo127636a(toy0Var.f171421c);
        }
        this.f140018h.clear();
    }

    /* JADX INFO: renamed from: D */
    public long mo151758D(Object obj, long j, @Nullable eqy0 eqy0Var) {
        return j;
    }
}
