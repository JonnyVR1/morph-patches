package p153l;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface md2 {

    /* JADX INFO: renamed from: l.md2$a */
    public interface InterfaceC18588a {

        /* JADX INFO: renamed from: l.md2$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final CopyOnWriteArrayList<C22841a> f135858a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: l.md2$a$a$a, reason: collision with other inner class name */
            public static final class C22841a {

                /* JADX INFO: renamed from: a */
                public final Handler f135859a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC18588a f135860b;

                /* JADX INFO: renamed from: c */
                public boolean f135861c;

                public C22841a(Handler handler, InterfaceC18588a interfaceC18588a) {
                    this.f135859a = handler;
                    this.f135860b = interfaceC18588a;
                }

                /* JADX INFO: renamed from: d */
                public void m157953d() {
                    this.f135861c = true;
                }
            }

            /* JADX INFO: renamed from: b */
            public void m157947b(Handler handler, InterfaceC18588a interfaceC18588a) {
                w11.m204369e(handler);
                w11.m204369e(interfaceC18588a);
                m157949d(interfaceC18588a);
                this.f135858a.add(new C22841a(handler, interfaceC18588a));
            }

            /* JADX INFO: renamed from: c */
            public void m157948c(int i, long j, long j2) {
                final int i2;
                final long j3;
                final long j4;
                for (final C22841a c22841a : this.f135858a) {
                    if (c22841a.f135861c) {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                    } else {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                        c22841a.f135859a.post(new Runnable() { // from class: l.ld2
                            @Override // java.lang.Runnable
                            public final void run() {
                                c22841a.f135860b.mo157945u(i2, j3, j4);
                            }
                        });
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            }

            /* JADX INFO: renamed from: d */
            public void m157949d(InterfaceC18588a interfaceC18588a) {
                for (C22841a c22841a : this.f135858a) {
                    if (c22841a.f135860b == interfaceC18588a) {
                        c22841a.m157953d();
                        this.f135858a.remove(c22841a);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: u */
        void mo157945u(int i, long j, long j2);
    }

    /* JADX INFO: renamed from: c */
    long mo157940c();

    /* JADX INFO: renamed from: d */
    void mo157941d(Handler handler, InterfaceC18588a interfaceC18588a);

    /* JADX INFO: renamed from: e */
    default long m157942e() {
        return -9223372036854775807L;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    pgj0 mo157943g();

    /* JADX INFO: renamed from: h */
    void mo157944h(InterfaceC18588a interfaceC18588a);
}
