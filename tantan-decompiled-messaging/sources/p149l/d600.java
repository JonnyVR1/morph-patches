package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class d600<A, B> {

    /* JADX INFO: renamed from: a */
    private final yew<C16305b<A>, B> f84577a;

    /* JADX INFO: renamed from: l.d600$a */
    public class C16304a extends yew<C16305b<A>, B> {
        public C16304a(long j) {
            super(j);
        }

        @Override // p149l.yew
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo110110j(@NonNull C16305b<A> c16305b, @Nullable B b) {
            c16305b.m110114c();
        }
    }

    /* JADX INFO: renamed from: l.d600$b */
    @VisibleForTesting
    public static final class C16305b<A> {

        /* JADX INFO: renamed from: d */
        private static final Queue<C16305b<?>> f84579d = sck0.m183406f(0);

        /* JADX INFO: renamed from: a */
        private int f84580a;

        /* JADX INFO: renamed from: b */
        private int f84581b;

        /* JADX INFO: renamed from: c */
        private A f84582c;

        private C16305b() {
        }

        /* JADX INFO: renamed from: a */
        public static <A> C16305b<A> m110112a(A a, int i, int i2) {
            C16305b<A> c16305b;
            Queue<C16305b<?>> queue = f84579d;
            synchronized (queue) {
                c16305b = (C16305b) queue.poll();
            }
            if (c16305b == null) {
                c16305b = new C16305b<>();
            }
            c16305b.m110113b(a, i, i2);
            return c16305b;
        }

        /* JADX INFO: renamed from: b */
        private void m110113b(A a, int i, int i2) {
            this.f84582c = a;
            this.f84581b = i;
            this.f84580a = i2;
        }

        /* JADX INFO: renamed from: c */
        public void m110114c() {
            Queue<C16305b<?>> queue = f84579d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C16305b) {
                C16305b c16305b = (C16305b) obj;
                if (this.f84581b == c16305b.f84581b && this.f84580a == c16305b.f84580a && this.f84582c.equals(c16305b.f84582c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f84580a * 31) + this.f84581b) * 31) + this.f84582c.hashCode();
        }
    }

    public d600(long j) {
        this.f84577a = new C16304a(j);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public B m110108a(A a, int i, int i2) {
        C16305b<A> c16305bM110112a = C16305b.m110112a(a, i, i2);
        B bM214441g = this.f84577a.m214441g(c16305bM110112a);
        c16305bM110112a.m110114c();
        return bM214441g;
    }

    /* JADX INFO: renamed from: b */
    public void m110109b(A a, int i, int i2, B b) {
        this.f84577a.m214443k(C16305b.m110112a(a, i, i2), b);
    }

    public d600() {
        this(250L);
    }
}
