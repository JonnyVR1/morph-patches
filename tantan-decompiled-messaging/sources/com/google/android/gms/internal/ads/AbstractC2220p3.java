package com.google.android.gms.internal.ads;

import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import p149l.mlw0;
import p149l.nlw0;
import p149l.olw0;
import p149l.plw0;
import p149l.qmw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2220p3 extends AbstractC2180k3 {

    /* JADX INFO: renamed from: j */
    public static final mlw0 f10020j;

    /* JADX INFO: renamed from: k */
    public static final qmw0 f10021k = new qmw0(AbstractC2220p3.class);

    /* JADX INFO: renamed from: h */
    public volatile Set<Throwable> f10022h = null;

    /* JADX INFO: renamed from: i */
    public volatile int f10023i;

    static {
        Throwable th;
        mlw0 plw0Var;
        olw0 olw0Var = null;
        try {
            plw0Var = new nlw0(AtomicReferenceFieldUpdater.newUpdater(AbstractC2220p3.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(AbstractC2220p3.class, RXScreenCaptureService.KEY_INDEX));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            plw0Var = new plw0(olw0Var);
        }
        f10020j = plw0Var;
        if (th != null) {
            f10021k.m175582a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public AbstractC2220p3(int i) {
        this.f10023i = i;
    }

    /* JADX INFO: renamed from: C */
    public final int m13153C() {
        return f10020j.mo155282a(this);
    }

    /* JADX INFO: renamed from: E */
    public final Set m13154E() {
        Set<Throwable> set = this.f10022h;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        mo13077I(setNewSetFromMap);
        f10020j.mo155283b(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.f10022h;
        Objects.requireNonNull(set2);
        return set2;
    }

    /* JADX INFO: renamed from: H */
    public final void m13155H() {
        this.f10022h = null;
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo13077I(Set set);
}
