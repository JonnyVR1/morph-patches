package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class me00<A, B> {

    /* JADX INFO: renamed from: a */
    private final wgw<C18596b<A>, B> f136424a;

    /* JADX INFO: renamed from: l.me00$a */
    public class C18595a extends wgw<C18596b<A>, B> {
        public C18595a(long j) {
            super(j);
        }

        @Override // p153l.wgw
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo104375j(@NonNull C18596b<A> c18596b, @Nullable B b) {
            c18596b.m158007c();
        }
    }

    /* JADX INFO: renamed from: l.me00$b */
    @VisibleForTesting
    public static final class C18596b<A> {

        /* JADX INFO: renamed from: d */
        private static final Queue<C18596b<?>> f136426d = ylk0.m216582f(0);

        /* JADX INFO: renamed from: a */
        private int f136427a;

        /* JADX INFO: renamed from: b */
        private int f136428b;

        /* JADX INFO: renamed from: c */
        private A f136429c;

        private C18596b() {
        }

        /* JADX INFO: renamed from: a */
        public static <A> C18596b<A> m158005a(A a, int i, int i2) {
            C18596b<A> c18596b;
            Queue<C18596b<?>> queue = f136426d;
            synchronized (queue) {
                c18596b = (C18596b) queue.poll();
            }
            if (c18596b == null) {
                c18596b = new C18596b<>();
            }
            c18596b.m158006b(a, i, i2);
            return c18596b;
        }

        /* JADX INFO: renamed from: b */
        private void m158006b(A a, int i, int i2) {
            this.f136429c = a;
            this.f136428b = i;
            this.f136427a = i2;
        }

        /* JADX INFO: renamed from: c */
        public void m158007c() {
            Queue<C18596b<?>> queue = f136426d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C18596b) {
                C18596b c18596b = (C18596b) obj;
                if (this.f136428b == c18596b.f136428b && this.f136427a == c18596b.f136427a && this.f136429c.equals(c18596b.f136429c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f136427a * 31) + this.f136428b) * 31) + this.f136429c.hashCode();
        }
    }

    public me00(long j) {
        this.f136424a = new C18595a(j);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public B m158002a(A a, int i, int i2) {
        C18596b<A> c18596bM158005a = C18596b.m158005a(a, i, i2);
        B bM206267g = this.f136424a.m206267g(c18596bM158005a);
        c18596bM158005a.m158007c();
        return bM206267g;
    }

    /* JADX INFO: renamed from: b */
    public void m158003b(A a, int i, int i2, B b) {
        this.f136424a.m206269k(C18596b.m158005a(a, i, i2), b);
    }

    public me00() {
        this(250L);
    }
}
