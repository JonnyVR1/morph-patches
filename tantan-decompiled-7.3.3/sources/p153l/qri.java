package p153l;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qri extends ey2 {

    /* JADX INFO: renamed from: l.qri$b */
    public static final class C19635b implements ey2.InterfaceC16862f {

        /* JADX INFO: renamed from: a */
        public final xri f159122a;

        /* JADX INFO: renamed from: b */
        public final int f159123b;

        /* JADX INFO: renamed from: c */
        public final tri.C20384a f159124c;

        public C19635b(xri xriVar, int i) {
            this.f159122a = xriVar;
            this.f159123b = i;
            this.f159124c = new tri.C20384a();
        }

        @Override // p153l.ey2.InterfaceC16862f
        /* JADX INFO: renamed from: a */
        public ey2.C16861e mo123166a(asf asfVar, long j) throws IOException {
            long position = asfVar.getPosition();
            long jM177561c = m177561c(asfVar);
            long jMo99903k = asfVar.mo99903k();
            asfVar.mo99904m(Math.max(6, this.f159122a.f195914c));
            long jM177561c2 = m177561c(asfVar);
            long jMo99903k2 = asfVar.mo99903k();
            if (jM177561c > j || jM177561c2 <= j) {
                return jM177561c2 <= j ? ey2.C16861e.m123165f(jM177561c2, jMo99903k2) : ey2.C16861e.m123163d(jM177561c, position);
            }
            return ey2.C16861e.m123164e(jMo99903k);
        }

        /* JADX INFO: renamed from: c */
        public final long m177561c(asf asfVar) throws IOException {
            while (asfVar.mo99903k() < asfVar.getLength() - 6 && !tri.m192508h(asfVar, this.f159122a, this.f159123b, this.f159124c)) {
                asfVar.mo99904m(1);
            }
            if (asfVar.mo99903k() < asfVar.getLength() - 6) {
                return this.f159124c.f175880a;
            }
            asfVar.mo99904m((int) (asfVar.getLength() - asfVar.mo99903k()));
            return this.f159122a.f195921j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qri(final xri xriVar, int i, long j, long j2) {
        super(new ey2.InterfaceC16860d() { // from class: l.pri
            @Override // p153l.ey2.InterfaceC16860d
            /* JADX INFO: renamed from: a */
            public final long mo123143a(long j3) {
                return xriVar.m212836i(j3);
            }
        }, new C19635b(xriVar, i), xriVar.m212833f(), 0L, xriVar.f195921j, j, j2, xriVar.m212832d(), Math.max(6, xriVar.f195914c));
        Objects.requireNonNull(xriVar);
    }
}
