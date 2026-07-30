package p149l;

/* JADX INFO: loaded from: classes13.dex */
public abstract class p7r<T> {

    /* JADX INFO: renamed from: a */
    public volatile boolean f147534a;

    /* JADX INFO: renamed from: b */
    public T f147535b;

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: l.p7r$a */
    public class C19152a<R> extends p7r<R> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ v9j f147536c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19152a(v9j v9jVar) {
            super(null);
            this.f147536c = v9jVar;
        }

        @Override // p149l.p7r
        /* JADX INFO: renamed from: a */
        public R mo167768a() {
            return (R) this.f147536c.call();
        }
    }

    public p7r() {
        this.f147534a = false;
    }

    /* JADX INFO: renamed from: c */
    public static <R> p7r<R> m167767c(v9j<R> v9jVar) {
        return new C19152a(v9jVar);
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo167768a();

    /* JADX INFO: renamed from: b */
    public T m167769b() {
        if (!this.f147534a) {
            synchronized (this) {
                try {
                    if (!this.f147534a) {
                        this.f147535b = mo167768a();
                        this.f147534a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f147535b;
    }

    public /* synthetic */ p7r(C19152a c19152a) {
        this();
    }
}
