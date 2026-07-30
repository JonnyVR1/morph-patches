package p153l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r9r<T> {

    /* JADX INFO: renamed from: a */
    public volatile boolean f161862a;

    /* JADX INFO: renamed from: b */
    public T f161863b;

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: l.r9r$a */
    public class C19798a<R> extends r9r<R> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ pcj f161864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19798a(pcj pcjVar) {
            super(null);
            this.f161864c = pcjVar;
        }

        @Override // p153l.r9r
        /* JADX INFO: renamed from: a */
        public R mo180654a() {
            return (R) this.f161864c.call();
        }
    }

    public r9r() {
        this.f161862a = false;
    }

    /* JADX INFO: renamed from: c */
    public static <R> r9r<R> m180653c(pcj<R> pcjVar) {
        return new C19798a(pcjVar);
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo180654a();

    /* JADX INFO: renamed from: b */
    public T m180655b() {
        if (!this.f161862a) {
            synchronized (this) {
                try {
                    if (!this.f161862a) {
                        this.f161863b = mo180654a();
                        this.f161862a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f161863b;
    }

    public /* synthetic */ r9r(C19798a c19798a) {
        this();
    }
}
