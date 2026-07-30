package p149l;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class uoi extends px2 {

    /* JADX INFO: renamed from: l.uoi$b */
    public static final class C20471b implements px2.InterfaceC19359f {

        /* JADX INFO: renamed from: a */
        public final bpi f177507a;

        /* JADX INFO: renamed from: b */
        public final int f177508b;

        /* JADX INFO: renamed from: c */
        public final xoi.C21194a f177509c;

        public C20471b(bpi bpiVar, int i) {
            this.f177507a = bpiVar;
            this.f177508b = i;
            this.f177509c = new xoi.C21194a();
        }

        @Override // p149l.px2.InterfaceC19359f
        /* JADX INFO: renamed from: a */
        public px2.C19358e mo100975a(tqf tqfVar, long j) throws IOException {
            long position = tqfVar.getPosition();
            long jM194554c = m194554c(tqfVar);
            long jMo150659k = tqfVar.mo150659k();
            tqfVar.mo150660m(Math.max(6, this.f177507a.f76630c));
            long jM194554c2 = m194554c(tqfVar);
            long jMo150659k2 = tqfVar.mo150659k();
            if (jM194554c > j || jM194554c2 <= j) {
                return jM194554c2 <= j ? px2.C19358e.m171818f(jM194554c2, jMo150659k2) : px2.C19358e.m171816d(jM194554c, position);
            }
            return px2.C19358e.m171817e(jMo150659k);
        }

        /* JADX INFO: renamed from: c */
        public final long m194554c(tqf tqfVar) throws IOException {
            while (tqfVar.mo150659k() < tqfVar.getLength() - 6 && !xoi.m210426h(tqfVar, this.f177507a, this.f177508b, this.f177509c)) {
                tqfVar.mo150660m(1);
            }
            if (tqfVar.mo150659k() < tqfVar.getLength() - 6) {
                return this.f177509c.f193846a;
            }
            tqfVar.mo150660m((int) (tqfVar.getLength() - tqfVar.mo150659k()));
            return this.f177507a.f76637j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uoi(final bpi bpiVar, int i, long j, long j2) {
        super(new px2.InterfaceC19357d() { // from class: l.toi
            @Override // p149l.px2.InterfaceC19357d
            /* JADX INFO: renamed from: a */
            public final long mo171796a(long j3) {
                return bpiVar.m103066i(j3);
            }
        }, new C20471b(bpiVar, i), bpiVar.m103063f(), 0L, bpiVar.f76637j, j, j2, bpiVar.m103062d(), Math.max(6, bpiVar.f76630c));
        Objects.requireNonNull(bpiVar);
    }
}
