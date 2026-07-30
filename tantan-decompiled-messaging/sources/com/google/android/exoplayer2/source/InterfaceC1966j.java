package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.lrv;
import p149l.nkx;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.j */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1966j {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f8648a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final InterfaceC1965i.b f8649b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<C22673a> f8650c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.j$a$a, reason: collision with other inner class name */
        public static final class C22673a {

            /* JADX INFO: renamed from: a */
            public Handler f8651a;

            /* JADX INFO: renamed from: b */
            public InterfaceC1966j f8652b;

            public C22673a(Handler handler, InterfaceC1966j interfaceC1966j) {
                this.f8651a = handler;
                this.f8652b = interfaceC1966j;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: renamed from: g */
        public void m11277g(Handler handler, InterfaceC1966j interfaceC1966j) {
            p11.m167011e(handler);
            p11.m167011e(interfaceC1966j);
            this.f8650c.add(new C22673a(handler, interfaceC1966j));
        }

        /* JADX INFO: renamed from: h */
        public void m11278h(int i, @Nullable C1871k c1871k, int i2, @Nullable Object obj, long j) {
            m11279i(new nkx(1, i, c1871k, i2, obj, vck0.m197874l1(j), -9223372036854775807L));
        }

        /* JADX INFO: renamed from: i */
        public void m11279i(final nkx nkxVar) {
            for (C22673a c22673a : this.f8650c) {
                final InterfaceC1966j interfaceC1966j = c22673a.f8652b;
                vck0.m197824S0(c22673a.f8651a, new Runnable() { // from class: l.ixx
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1966j.a aVar = this.f115407a;
                        interfaceC1966j.mo10892p0(aVar.f8648a, aVar.f8649b, nkxVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: j */
        public void m11280j(lrv lrvVar, int i) {
            m11281k(lrvVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: k */
        public void m11281k(lrv lrvVar, int i, int i2, @Nullable C1871k c1871k, int i3, @Nullable Object obj, long j, long j2) {
            m11282l(lrvVar, new nkx(i, i2, c1871k, i3, obj, vck0.m197874l1(j), vck0.m197874l1(j2)));
        }

        /* JADX INFO: renamed from: l */
        public void m11282l(final lrv lrvVar, final nkx nkxVar) {
            for (C22673a c22673a : this.f8650c) {
                final InterfaceC1966j interfaceC1966j = c22673a.f8652b;
                vck0.m197824S0(c22673a.f8651a, new Runnable() { // from class: l.fxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1966j.a aVar = this.f99817a;
                        interfaceC1966j.mo10886B(aVar.f8648a, aVar.f8649b, lrvVar, nkxVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: m */
        public void m11283m(lrv lrvVar, int i) {
            m11284n(lrvVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: n */
        public void m11284n(lrv lrvVar, int i, int i2, @Nullable C1871k c1871k, int i3, @Nullable Object obj, long j, long j2) {
            m11285o(lrvVar, new nkx(i, i2, c1871k, i3, obj, vck0.m197874l1(j), vck0.m197874l1(j2)));
        }

        /* JADX INFO: renamed from: o */
        public void m11285o(final lrv lrvVar, final nkx nkxVar) {
            for (C22673a c22673a : this.f8650c) {
                final InterfaceC1966j interfaceC1966j = c22673a.f8652b;
                vck0.m197824S0(c22673a.f8651a, new Runnable() { // from class: l.dxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1966j.a aVar = this.f88327a;
                        interfaceC1966j.mo10890Y(aVar.f8648a, aVar.f8649b, lrvVar, nkxVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: p */
        public void m11286p(lrv lrvVar, int i, int i2, @Nullable C1871k c1871k, int i3, @Nullable Object obj, long j, long j2, IOException iOException, boolean z) {
            m11288r(lrvVar, new nkx(i, i2, c1871k, i3, obj, vck0.m197874l1(j), vck0.m197874l1(j2)), iOException, z);
        }

        /* JADX INFO: renamed from: q */
        public void m11287q(lrv lrvVar, int i, IOException iOException, boolean z) {
            m11286p(lrvVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* JADX INFO: renamed from: r */
        public void m11288r(final lrv lrvVar, final nkx nkxVar, final IOException iOException, final boolean z) {
            for (C22673a c22673a : this.f8650c) {
                final InterfaceC1966j interfaceC1966j = c22673a.f8652b;
                vck0.m197824S0(c22673a.f8651a, new Runnable() { // from class: l.exx
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1966j.a aVar = this.f93700a;
                        interfaceC1966j.mo10891Z(aVar.f8648a, aVar.f8649b, lrvVar, nkxVar, iOException, z);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: s */
        public void m11289s(lrv lrvVar, int i) {
            m11290t(lrvVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: t */
        public void m11290t(lrv lrvVar, int i, int i2, @Nullable C1871k c1871k, int i3, @Nullable Object obj, long j, long j2) {
            m11291u(lrvVar, new nkx(i, i2, c1871k, i3, obj, vck0.m197874l1(j), vck0.m197874l1(j2)));
        }

        /* JADX INFO: renamed from: u */
        public void m11291u(final lrv lrvVar, final nkx nkxVar) {
            for (C22673a c22673a : this.f8650c) {
                final InterfaceC1966j interfaceC1966j = c22673a.f8652b;
                vck0.m197824S0(c22673a.f8651a, new Runnable() { // from class: l.gxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1966j.a aVar = this.f104941a;
                        interfaceC1966j.mo10888L(aVar.f8648a, aVar.f8649b, lrvVar, nkxVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: v */
        public void m11292v(InterfaceC1966j interfaceC1966j) {
            for (C22673a c22673a : this.f8650c) {
                if (c22673a.f8652b == interfaceC1966j) {
                    this.f8650c.remove(c22673a);
                }
            }
        }

        /* JADX INFO: renamed from: w */
        public void m11293w(int i, long j, long j2) {
            m11294x(new nkx(1, i, null, 3, null, vck0.m197874l1(j), vck0.m197874l1(j2)));
        }

        /* JADX INFO: renamed from: x */
        public void m11294x(final nkx nkxVar) {
            final InterfaceC1965i.b bVar = (InterfaceC1965i.b) p11.m167011e(this.f8649b);
            for (C22673a c22673a : this.f8650c) {
                final InterfaceC1966j interfaceC1966j = c22673a.f8652b;
                vck0.m197824S0(c22673a.f8651a, new Runnable() { // from class: l.hxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1966j.mo10889V(this.f109938a.f8648a, bVar, nkxVar);
                    }
                });
            }
        }

        @CheckResult
        /* JADX INFO: renamed from: y */
        public a m11295y(int i, @Nullable InterfaceC1965i.b bVar) {
            return new a(this.f8650c, i, bVar);
        }

        public a(CopyOnWriteArrayList<C22673a> copyOnWriteArrayList, int i, @Nullable InterfaceC1965i.b bVar) {
            this.f8650c = copyOnWriteArrayList;
            this.f8648a = i;
            this.f8649b = bVar;
        }
    }

    /* JADX INFO: renamed from: V */
    default void mo10889V(int i, InterfaceC1965i.b bVar, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: p0 */
    default void mo10892p0(int i, @Nullable InterfaceC1965i.b bVar, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: B */
    default void mo10886B(int i, @Nullable InterfaceC1965i.b bVar, lrv lrvVar, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: L */
    default void mo10888L(int i, @Nullable InterfaceC1965i.b bVar, lrv lrvVar, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: Y */
    default void mo10890Y(int i, @Nullable InterfaceC1965i.b bVar, lrv lrvVar, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: Z */
    default void mo10891Z(int i, @Nullable InterfaceC1965i.b bVar, lrv lrvVar, nkx nkxVar, IOException iOException, boolean z) {
    }
}
