package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p149l.l7j0;
import p149l.lrv;
import p149l.nkx;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1936c<T> extends AbstractC1934a {

    /* JADX INFO: renamed from: a */
    public final HashMap<T, b<T>> f8293a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    @Nullable
    public Handler f8294b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public l7j0 f8295c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$a */
    public final class a implements InterfaceC1966j, InterfaceC1854b {

        /* JADX INFO: renamed from: a */
        public final T f8296a;

        /* JADX INFO: renamed from: b */
        public InterfaceC1966j.a f8297b;

        /* JADX INFO: renamed from: c */
        public InterfaceC1854b.a f8298c;

        public a(T t) {
            this.f8297b = AbstractC1936c.this.createEventDispatcher(null);
            this.f8298c = AbstractC1936c.this.createDrmEventDispatcher(null);
            this.f8296a = t;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: B */
        public void mo10886B(int i, @Nullable InterfaceC1965i.b bVar, lrv lrvVar, nkx nkxVar) {
            if (m10948a(i, bVar)) {
                this.f8297b.m11282l(lrvVar, m10949d(nkxVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: L */
        public void mo10888L(int i, @Nullable InterfaceC1965i.b bVar, lrv lrvVar, nkx nkxVar) {
            if (m10948a(i, bVar)) {
                this.f8297b.m11291u(lrvVar, m10949d(nkxVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: N */
        public void mo9912N(int i, @Nullable InterfaceC1965i.b bVar) {
            if (m10948a(i, bVar)) {
                this.f8298c.m9926h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: P */
        public void mo9913P(int i, @Nullable InterfaceC1965i.b bVar, int i2) {
            if (m10948a(i, bVar)) {
                this.f8298c.m9929k(i2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: Q */
        public void mo9914Q(int i, @Nullable InterfaceC1965i.b bVar) {
            if (m10948a(i, bVar)) {
                this.f8298c.m9928j();
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: V */
        public void mo10889V(int i, @Nullable InterfaceC1965i.b bVar, nkx nkxVar) {
            if (m10948a(i, bVar)) {
                this.f8297b.m11294x(m10949d(nkxVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: Y */
        public void mo10890Y(int i, @Nullable InterfaceC1965i.b bVar, lrv lrvVar, nkx nkxVar) {
            if (m10948a(i, bVar)) {
                this.f8297b.m11285o(lrvVar, m10949d(nkxVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: Z */
        public void mo10891Z(int i, @Nullable InterfaceC1965i.b bVar, lrv lrvVar, nkx nkxVar, IOException iOException, boolean z) {
            if (m10948a(i, bVar)) {
                this.f8297b.m11288r(lrvVar, m10949d(nkxVar), iOException, z);
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m10948a(int i, @Nullable InterfaceC1965i.b bVar) {
            InterfaceC1965i.b bVarMo10915c;
            if (bVar != null) {
                bVarMo10915c = AbstractC1936c.this.mo10915c(this.f8296a, bVar);
                if (bVarMo10915c == null) {
                    return false;
                }
            } else {
                bVarMo10915c = null;
            }
            int iMo10946e = AbstractC1936c.this.mo10946e(this.f8296a, i);
            InterfaceC1966j.a aVar = this.f8297b;
            if (aVar.f8648a != iMo10946e || !vck0.m197845c(aVar.f8649b, bVarMo10915c)) {
                this.f8297b = AbstractC1936c.this.createEventDispatcher(iMo10946e, bVarMo10915c);
            }
            InterfaceC1854b.a aVar2 = this.f8298c;
            if (aVar2.f7461a == iMo10946e && vck0.m197845c(aVar2.f7462b, bVarMo10915c)) {
                return true;
            }
            this.f8298c = AbstractC1936c.this.createDrmEventDispatcher(iMo10946e, bVarMo10915c);
            return true;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: a0 */
        public void mo9915a0(int i, @Nullable InterfaceC1965i.b bVar) {
            if (m10948a(i, bVar)) {
                this.f8298c.m9927i();
            }
        }

        /* JADX INFO: renamed from: d */
        public final nkx m10949d(nkx nkxVar) {
            long jMo10945d = AbstractC1936c.this.mo10945d(this.f8296a, nkxVar.f139486f);
            long jMo10945d2 = AbstractC1936c.this.mo10945d(this.f8296a, nkxVar.f139487g);
            return (jMo10945d == nkxVar.f139486f && jMo10945d2 == nkxVar.f139487g) ? nkxVar : new nkx(nkxVar.f139481a, nkxVar.f139482b, nkxVar.f139483c, nkxVar.f139484d, nkxVar.f139485e, jMo10945d, jMo10945d2);
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: j0 */
        public void mo9917j0(int i, @Nullable InterfaceC1965i.b bVar, Exception exc) {
            if (m10948a(i, bVar)) {
                this.f8298c.m9930l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1966j
        /* JADX INFO: renamed from: p0 */
        public void mo10892p0(int i, @Nullable InterfaceC1965i.b bVar, nkx nkxVar) {
            if (m10948a(i, bVar)) {
                this.f8297b.m11279i(m10949d(nkxVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
        /* JADX INFO: renamed from: q0 */
        public void mo9918q0(int i, @Nullable InterfaceC1965i.b bVar) {
            if (m10948a(i, bVar)) {
                this.f8298c.m9931m();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$b */
    public static final class b<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1965i f8300a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1965i.c f8301b;

        /* JADX INFO: renamed from: c */
        public final AbstractC1936c<T>.a f8302c;

        public b(InterfaceC1965i interfaceC1965i, InterfaceC1965i.c cVar, AbstractC1936c<T>.a aVar) {
            this.f8300a = interfaceC1965i;
            this.f8301b = cVar;
            this.f8302c = aVar;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract InterfaceC1965i.b mo10915c(T t, InterfaceC1965i.b bVar);

    /* JADX INFO: renamed from: d */
    public long mo10945d(T t, long j) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    @CallSuper
    public void disableInternal() {
        for (b<T> bVar : this.f8293a.values()) {
            bVar.f8300a.disable(bVar.f8301b);
        }
    }

    /* JADX INFO: renamed from: e */
    public int mo10946e(T t, int i) {
        return i;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    @CallSuper
    public void enableInternal() {
        for (b<T> bVar : this.f8293a.values()) {
            bVar.f8300a.enable(bVar.f8301b);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo10916f(T t, InterfaceC1965i interfaceC1965i, AbstractC1834c0 abstractC1834c0);

    /* JADX INFO: renamed from: g */
    public final void m10947g(final T t, InterfaceC1965i interfaceC1965i) {
        p11.m167007a(!this.f8293a.containsKey(t));
        InterfaceC1965i.c cVar = new InterfaceC1965i.c() { // from class: l.xr5
            @Override // com.google.android.exoplayer2.source.InterfaceC1965i.c
            /* JADX INFO: renamed from: a */
            public final void mo11270a(InterfaceC1965i interfaceC1965i2, AbstractC1834c0 abstractC1834c0) {
                this.f194086a.mo10916f(t, interfaceC1965i2, abstractC1834c0);
            }
        };
        a aVar = new a(t);
        this.f8293a.put(t, new b<>(interfaceC1965i, cVar, aVar));
        interfaceC1965i.addEventListener((Handler) p11.m167011e(this.f8294b), aVar);
        interfaceC1965i.addDrmEventListener((Handler) p11.m167011e(this.f8294b), aVar);
        interfaceC1965i.prepareSource(cVar, this.f8295c, getPlayerId());
        if (isEnabled()) {
            return;
        }
        interfaceC1965i.disable(cVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b<T>> it = this.f8293a.values().iterator();
        while (it.hasNext()) {
            it.next().f8300a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    @CallSuper
    public void prepareSourceInternal(@Nullable l7j0 l7j0Var) {
        this.f8295c = l7j0Var;
        this.f8294b = vck0.m197896w();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    @CallSuper
    public void releaseSourceInternal() {
        for (b<T> bVar : this.f8293a.values()) {
            bVar.f8300a.releaseSource(bVar.f8301b);
            bVar.f8300a.removeEventListener(bVar.f8302c);
            bVar.f8300a.removeDrmEventListener(bVar.f8302c);
        }
        this.f8293a.clear();
    }
}
