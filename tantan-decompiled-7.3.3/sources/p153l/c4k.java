package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class c4k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.c4k$a */
    public class C16181a<T> implements InterfaceC16182b<T> {

        /* JADX INFO: renamed from: a */
        private volatile T f79708a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC16182b f79709b;

        public C16181a(InterfaceC16182b interfaceC16182b) {
            this.f79709b = interfaceC16182b;
        }

        @Override // p153l.c4k.InterfaceC16182b
        public T get() {
            if (this.f79708a == null) {
                synchronized (this) {
                    try {
                        if (this.f79708a == null) {
                            this.f79708a = (T) vn80.m201944d(this.f79709b.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f79708a;
        }
    }

    /* JADX INFO: renamed from: l.c4k$b */
    public interface InterfaceC16182b<T> {
        T get();
    }

    /* JADX INFO: renamed from: a */
    public static <T> InterfaceC16182b<T> m107884a(InterfaceC16182b<T> interfaceC16182b) {
        return new C16181a(interfaceC16182b);
    }
}
