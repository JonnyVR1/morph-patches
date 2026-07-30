package com.google.android.gms.internal.ads;

import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import p153l.suw0;
import p153l.tuw0;
import p153l.uuw0;
import p153l.vuw0;
import p153l.wvw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2243p3 extends AbstractC2203k3 {

    /* JADX INFO: renamed from: j */
    public static final suw0 f10057j;

    /* JADX INFO: renamed from: k */
    public static final wvw0 f10058k = new wvw0(AbstractC2243p3.class);

    /* JADX INFO: renamed from: h */
    public volatile Set<Throwable> f10059h = null;

    /* JADX INFO: renamed from: i */
    public volatile int f10060i;

    static {
        Throwable th;
        suw0 vuw0Var;
        uuw0 uuw0Var = null;
        try {
            vuw0Var = new tuw0(AtomicReferenceFieldUpdater.newUpdater(AbstractC2243p3.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(AbstractC2243p3.class, RXScreenCaptureService.KEY_INDEX));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            vuw0Var = new vuw0(uuw0Var);
        }
        f10057j = vuw0Var;
        if (th != null) {
            f10058k.m208109a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public AbstractC2243p3(int i) {
        this.f10060i = i;
    }

    /* JADX INFO: renamed from: C */
    public final int m13207C() {
        return f10057j.mo188098a(this);
    }

    /* JADX INFO: renamed from: E */
    public final Set m13208E() {
        Set<Throwable> set = this.f10059h;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        mo13131I(setNewSetFromMap);
        f10057j.mo188099b(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.f10059h;
        Objects.requireNonNull(set2);
        return set2;
    }

    /* JADX INFO: renamed from: H */
    public final void m13209H() {
        this.f10059h = null;
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo13131I(Set set);
}
