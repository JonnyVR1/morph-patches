package p149l;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface fd2 {

    /* JADX INFO: renamed from: l.fd2$a */
    public interface InterfaceC16803a {

        /* JADX INFO: renamed from: l.fd2$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final CopyOnWriteArrayList<C22723a> f96948a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: l.fd2$a$a$a, reason: collision with other inner class name */
            public static final class C22723a {

                /* JADX INFO: renamed from: a */
                public final Handler f96949a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC16803a f96950b;

                /* JADX INFO: renamed from: c */
                public boolean f96951c;

                public C22723a(Handler handler, InterfaceC16803a interfaceC16803a) {
                    this.f96949a = handler;
                    this.f96950b = interfaceC16803a;
                }

                /* JADX INFO: renamed from: d */
                public void m120888d() {
                    this.f96951c = true;
                }
            }

            /* JADX INFO: renamed from: b */
            public void m120882b(Handler handler, InterfaceC16803a interfaceC16803a) {
                p11.m167011e(handler);
                p11.m167011e(interfaceC16803a);
                m120884d(interfaceC16803a);
                this.f96948a.add(new C22723a(handler, interfaceC16803a));
            }

            /* JADX INFO: renamed from: c */
            public void m120883c(int i, long j, long j2) {
                final int i2;
                final long j3;
                final long j4;
                for (final C22723a c22723a : this.f96948a) {
                    if (c22723a.f96951c) {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                    } else {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                        c22723a.f96949a.post(new Runnable() { // from class: l.ed2
                            @Override // java.lang.Runnable
                            public final void run() {
                                c22723a.f96950b.mo120880u(i2, j3, j4);
                            }
                        });
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            }

            /* JADX INFO: renamed from: d */
            public void m120884d(InterfaceC16803a interfaceC16803a) {
                for (C22723a c22723a : this.f96948a) {
                    if (c22723a.f96950b == interfaceC16803a) {
                        c22723a.m120888d();
                        this.f96948a.remove(c22723a);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: u */
        void mo120880u(int i, long j, long j2);
    }

    /* JADX INFO: renamed from: c */
    long mo120875c();

    /* JADX INFO: renamed from: d */
    void mo120876d(Handler handler, InterfaceC16803a interfaceC16803a);

    /* JADX INFO: renamed from: e */
    default long m120877e() {
        return -9223372036854775807L;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    l7j0 mo120878g();

    /* JADX INFO: renamed from: h */
    void mo120879h(InterfaceC16803a interfaceC16803a);
}
