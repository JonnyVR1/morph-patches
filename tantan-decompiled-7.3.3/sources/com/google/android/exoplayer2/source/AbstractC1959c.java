package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p153l.bmk0;
import p153l.ktx;
import p153l.mtv;
import p153l.pgj0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1959c<T> extends AbstractC1957a {

    /* JADX INFO: renamed from: a */
    public final HashMap<T, b<T>> f8330a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    @Nullable
    public Handler f8331b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public pgj0 f8332c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$a */
    public final class a implements InterfaceC1989j, InterfaceC1877b {

        /* JADX INFO: renamed from: a */
        public final T f8333a;

        /* JADX INFO: renamed from: b */
        public InterfaceC1989j.a f8334b;

        /* JADX INFO: renamed from: c */
        public InterfaceC1877b.a f8335c;

        public a(T t) {
            this.f8334b = AbstractC1959c.this.createEventDispatcher(null);
            this.f8335c = AbstractC1959c.this.createDrmEventDispatcher(null);
            this.f8333a = t;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: B */
        public void mo10940B(int i, @Nullable InterfaceC1988i.b bVar, mtv mtvVar, ktx ktxVar) {
            if (m11002a(i, bVar)) {
                this.f8334b.m11336l(mtvVar, m11003d(ktxVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: L */
        public void mo10942L(int i, @Nullable InterfaceC1988i.b bVar, mtv mtvVar, ktx ktxVar) {
            if (m11002a(i, bVar)) {
                this.f8334b.m11345u(mtvVar, m11003d(ktxVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: N */
        public void mo9966N(int i, @Nullable InterfaceC1988i.b bVar) {
            if (m11002a(i, bVar)) {
                this.f8335c.m9980h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: P */
        public void mo9967P(int i, @Nullable InterfaceC1988i.b bVar, int i2) {
            if (m11002a(i, bVar)) {
                this.f8335c.m9983k(i2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: Q */
        public void mo9968Q(int i, @Nullable InterfaceC1988i.b bVar) {
            if (m11002a(i, bVar)) {
                this.f8335c.m9982j();
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: V */
        public void mo10943V(int i, @Nullable InterfaceC1988i.b bVar, ktx ktxVar) {
            if (m11002a(i, bVar)) {
                this.f8334b.m11348x(m11003d(ktxVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: Y */
        public void mo10944Y(int i, @Nullable InterfaceC1988i.b bVar, mtv mtvVar, ktx ktxVar) {
            if (m11002a(i, bVar)) {
                this.f8334b.m11339o(mtvVar, m11003d(ktxVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: Z */
        public void mo10945Z(int i, @Nullable InterfaceC1988i.b bVar, mtv mtvVar, ktx ktxVar, IOException iOException, boolean z) {
            if (m11002a(i, bVar)) {
                this.f8334b.m11342r(mtvVar, m11003d(ktxVar), iOException, z);
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m11002a(int i, @Nullable InterfaceC1988i.b bVar) {
            InterfaceC1988i.b bVarMo10969c;
            if (bVar != null) {
                bVarMo10969c = AbstractC1959c.this.mo10969c(this.f8333a, bVar);
                if (bVarMo10969c == null) {
                    return false;
                }
            } else {
                bVarMo10969c = null;
            }
            int iMo11000e = AbstractC1959c.this.mo11000e(this.f8333a, i);
            InterfaceC1989j.a aVar = this.f8334b;
            if (aVar.f8685a != iMo11000e || !bmk0.m105123c(aVar.f8686b, bVarMo10969c)) {
                this.f8334b = AbstractC1959c.this.createEventDispatcher(iMo11000e, bVarMo10969c);
            }
            InterfaceC1877b.a aVar2 = this.f8335c;
            if (aVar2.f7498a == iMo11000e && bmk0.m105123c(aVar2.f7499b, bVarMo10969c)) {
                return true;
            }
            this.f8335c = AbstractC1959c.this.createDrmEventDispatcher(iMo11000e, bVarMo10969c);
            return true;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: a0 */
        public void mo9969a0(int i, @Nullable InterfaceC1988i.b bVar) {
            if (m11002a(i, bVar)) {
                this.f8335c.m9981i();
            }
        }

        /* JADX INFO: renamed from: d */
        public final ktx m11003d(ktx ktxVar) {
            long jMo10999d = AbstractC1959c.this.mo10999d(this.f8333a, ktxVar.f128769f);
            long jMo10999d2 = AbstractC1959c.this.mo10999d(this.f8333a, ktxVar.f128770g);
            return (jMo10999d == ktxVar.f128769f && jMo10999d2 == ktxVar.f128770g) ? ktxVar : new ktx(ktxVar.f128764a, ktxVar.f128765b, ktxVar.f128766c, ktxVar.f128767d, ktxVar.f128768e, jMo10999d, jMo10999d2);
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: j0 */
        public void mo9971j0(int i, @Nullable InterfaceC1988i.b bVar, Exception exc) {
            if (m11002a(i, bVar)) {
                this.f8335c.m9984l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1989j
        /* JADX INFO: renamed from: p0 */
        public void mo10946p0(int i, @Nullable InterfaceC1988i.b bVar, ktx ktxVar) {
            if (m11002a(i, bVar)) {
                this.f8334b.m11333i(m11003d(ktxVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
        /* JADX INFO: renamed from: q0 */
        public void mo9972q0(int i, @Nullable InterfaceC1988i.b bVar) {
            if (m11002a(i, bVar)) {
                this.f8335c.m9985m();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$b */
    public static final class b<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1988i f8337a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1988i.c f8338b;

        /* JADX INFO: renamed from: c */
        public final AbstractC1959c<T>.a f8339c;

        public b(InterfaceC1988i interfaceC1988i, InterfaceC1988i.c cVar, AbstractC1959c<T>.a aVar) {
            this.f8337a = interfaceC1988i;
            this.f8338b = cVar;
            this.f8339c = aVar;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract InterfaceC1988i.b mo10969c(T t, InterfaceC1988i.b bVar);

    /* JADX INFO: renamed from: d */
    public long mo10999d(T t, long j) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    @CallSuper
    public void disableInternal() {
        for (b<T> bVar : this.f8330a.values()) {
            bVar.f8337a.disable(bVar.f8338b);
        }
    }

    /* JADX INFO: renamed from: e */
    public int mo11000e(T t, int i) {
        return i;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    @CallSuper
    public void enableInternal() {
        for (b<T> bVar : this.f8330a.values()) {
            bVar.f8337a.enable(bVar.f8338b);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo10970f(T t, InterfaceC1988i interfaceC1988i, AbstractC1857c0 abstractC1857c0);

    /* JADX INFO: renamed from: g */
    public final void m11001g(final T t, InterfaceC1988i interfaceC1988i) {
        w11.m204365a(!this.f8330a.containsKey(t));
        InterfaceC1988i.c cVar = new InterfaceC1988i.c() { // from class: l.bt5
            @Override // com.google.android.exoplayer2.source.InterfaceC1988i.c
            /* JADX INFO: renamed from: a */
            public final void mo11324a(InterfaceC1988i interfaceC1988i2, AbstractC1857c0 abstractC1857c0) {
                this.f78330a.mo10970f(t, interfaceC1988i2, abstractC1857c0);
            }
        };
        a aVar = new a(t);
        this.f8330a.put(t, new b<>(interfaceC1988i, cVar, aVar));
        interfaceC1988i.addEventListener((Handler) w11.m204369e(this.f8331b), aVar);
        interfaceC1988i.addDrmEventListener((Handler) w11.m204369e(this.f8331b), aVar);
        interfaceC1988i.prepareSource(cVar, this.f8332c, getPlayerId());
        if (isEnabled()) {
            return;
        }
        interfaceC1988i.disable(cVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b<T>> it = this.f8330a.values().iterator();
        while (it.hasNext()) {
            it.next().f8337a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    @CallSuper
    public void prepareSourceInternal(@Nullable pgj0 pgj0Var) {
        this.f8332c = pgj0Var;
        this.f8331b = bmk0.m105174w();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    @CallSuper
    public void releaseSourceInternal() {
        for (b<T> bVar : this.f8330a.values()) {
            bVar.f8337a.releaseSource(bVar.f8338b);
            bVar.f8337a.removeEventListener(bVar.f8339c);
            bVar.f8337a.removeDrmEventListener(bVar.f8339c);
        }
        this.f8330a.clear();
    }
}
