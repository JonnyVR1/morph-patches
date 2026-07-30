package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.bmk0;
import p153l.ktx;
import p153l.mtv;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.j */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1989j {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f8685a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final InterfaceC1988i.b f8686b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<C22789a> f8687c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.j$a$a, reason: collision with other inner class name */
        public static final class C22789a {

            /* JADX INFO: renamed from: a */
            public Handler f8688a;

            /* JADX INFO: renamed from: b */
            public InterfaceC1989j f8689b;

            public C22789a(Handler handler, InterfaceC1989j interfaceC1989j) {
                this.f8688a = handler;
                this.f8689b = interfaceC1989j;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: renamed from: g */
        public void m11331g(Handler handler, InterfaceC1989j interfaceC1989j) {
            w11.m204369e(handler);
            w11.m204369e(interfaceC1989j);
            this.f8687c.add(new C22789a(handler, interfaceC1989j));
        }

        /* JADX INFO: renamed from: h */
        public void m11332h(int i, @Nullable C1894k c1894k, int i2, @Nullable Object obj, long j) {
            m11333i(new ktx(1, i, c1894k, i2, obj, bmk0.m105152l1(j), -9223372036854775807L));
        }

        /* JADX INFO: renamed from: i */
        public void m11333i(final ktx ktxVar) {
            for (C22789a c22789a : this.f8687c) {
                final InterfaceC1989j interfaceC1989j = c22789a.f8689b;
                bmk0.m105102S0(c22789a.f8688a, new Runnable() { // from class: l.f6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1989j.a aVar = this.f97457a;
                        interfaceC1989j.mo10946p0(aVar.f8685a, aVar.f8686b, ktxVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: j */
        public void m11334j(mtv mtvVar, int i) {
            m11335k(mtvVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: k */
        public void m11335k(mtv mtvVar, int i, int i2, @Nullable C1894k c1894k, int i3, @Nullable Object obj, long j, long j2) {
            m11336l(mtvVar, new ktx(i, i2, c1894k, i3, obj, bmk0.m105152l1(j), bmk0.m105152l1(j2)));
        }

        /* JADX INFO: renamed from: l */
        public void m11336l(final mtv mtvVar, final ktx ktxVar) {
            for (C22789a c22789a : this.f8687c) {
                final InterfaceC1989j interfaceC1989j = c22789a.f8689b;
                bmk0.m105102S0(c22789a.f8688a, new Runnable() { // from class: l.c6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1989j.a aVar = this.f80010a;
                        interfaceC1989j.mo10940B(aVar.f8685a, aVar.f8686b, mtvVar, ktxVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: m */
        public void m11337m(mtv mtvVar, int i) {
            m11338n(mtvVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: n */
        public void m11338n(mtv mtvVar, int i, int i2, @Nullable C1894k c1894k, int i3, @Nullable Object obj, long j, long j2) {
            m11339o(mtvVar, new ktx(i, i2, c1894k, i3, obj, bmk0.m105152l1(j), bmk0.m105152l1(j2)));
        }

        /* JADX INFO: renamed from: o */
        public void m11339o(final mtv mtvVar, final ktx ktxVar) {
            for (C22789a c22789a : this.f8687c) {
                final InterfaceC1989j interfaceC1989j = c22789a.f8689b;
                bmk0.m105102S0(c22789a.f8688a, new Runnable() { // from class: l.a6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1989j.a aVar = this.f68775a;
                        interfaceC1989j.mo10944Y(aVar.f8685a, aVar.f8686b, mtvVar, ktxVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: p */
        public void m11340p(mtv mtvVar, int i, int i2, @Nullable C1894k c1894k, int i3, @Nullable Object obj, long j, long j2, IOException iOException, boolean z) {
            m11342r(mtvVar, new ktx(i, i2, c1894k, i3, obj, bmk0.m105152l1(j), bmk0.m105152l1(j2)), iOException, z);
        }

        /* JADX INFO: renamed from: q */
        public void m11341q(mtv mtvVar, int i, IOException iOException, boolean z) {
            m11340p(mtvVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* JADX INFO: renamed from: r */
        public void m11342r(final mtv mtvVar, final ktx ktxVar, final IOException iOException, final boolean z) {
            for (C22789a c22789a : this.f8687c) {
                final InterfaceC1989j interfaceC1989j = c22789a.f8689b;
                bmk0.m105102S0(c22789a.f8688a, new Runnable() { // from class: l.b6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1989j.a aVar = this.f75230a;
                        interfaceC1989j.mo10945Z(aVar.f8685a, aVar.f8686b, mtvVar, ktxVar, iOException, z);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: s */
        public void m11343s(mtv mtvVar, int i) {
            m11344t(mtvVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: t */
        public void m11344t(mtv mtvVar, int i, int i2, @Nullable C1894k c1894k, int i3, @Nullable Object obj, long j, long j2) {
            m11345u(mtvVar, new ktx(i, i2, c1894k, i3, obj, bmk0.m105152l1(j), bmk0.m105152l1(j2)));
        }

        /* JADX INFO: renamed from: u */
        public void m11345u(final mtv mtvVar, final ktx ktxVar) {
            for (C22789a c22789a : this.f8687c) {
                final InterfaceC1989j interfaceC1989j = c22789a.f8689b;
                bmk0.m105102S0(c22789a.f8688a, new Runnable() { // from class: l.d6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1989j.a aVar = this.f85428a;
                        interfaceC1989j.mo10942L(aVar.f8685a, aVar.f8686b, mtvVar, ktxVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: v */
        public void m11346v(InterfaceC1989j interfaceC1989j) {
            for (C22789a c22789a : this.f8687c) {
                if (c22789a.f8689b == interfaceC1989j) {
                    this.f8687c.remove(c22789a);
                }
            }
        }

        /* JADX INFO: renamed from: w */
        public void m11347w(int i, long j, long j2) {
            m11348x(new ktx(1, i, null, 3, null, bmk0.m105152l1(j), bmk0.m105152l1(j2)));
        }

        /* JADX INFO: renamed from: x */
        public void m11348x(final ktx ktxVar) {
            final InterfaceC1988i.b bVar = (InterfaceC1988i.b) w11.m204369e(this.f8686b);
            for (C22789a c22789a : this.f8687c) {
                final InterfaceC1989j interfaceC1989j = c22789a.f8689b;
                bmk0.m105102S0(c22789a.f8688a, new Runnable() { // from class: l.e6y
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1989j.mo10943V(this.f92375a.f8685a, bVar, ktxVar);
                    }
                });
            }
        }

        @CheckResult
        /* JADX INFO: renamed from: y */
        public a m11349y(int i, @Nullable InterfaceC1988i.b bVar) {
            return new a(this.f8687c, i, bVar);
        }

        public a(CopyOnWriteArrayList<C22789a> copyOnWriteArrayList, int i, @Nullable InterfaceC1988i.b bVar) {
            this.f8687c = copyOnWriteArrayList;
            this.f8685a = i;
            this.f8686b = bVar;
        }
    }

    /* JADX INFO: renamed from: V */
    default void mo10943V(int i, InterfaceC1988i.b bVar, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: p0 */
    default void mo10946p0(int i, @Nullable InterfaceC1988i.b bVar, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: B */
    default void mo10940B(int i, @Nullable InterfaceC1988i.b bVar, mtv mtvVar, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: L */
    default void mo10942L(int i, @Nullable InterfaceC1988i.b bVar, mtv mtvVar, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: Y */
    default void mo10944Y(int i, @Nullable InterfaceC1988i.b bVar, mtv mtvVar, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: Z */
    default void mo10945Z(int i, @Nullable InterfaceC1988i.b bVar, mtv mtvVar, ktx ktxVar, IOException iOException, boolean z) {
    }
}
