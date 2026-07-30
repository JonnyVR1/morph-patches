package p149l;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public final class kw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f124921a;

    /* JADX INFO: renamed from: b */
    public final bud0 f124922b;

    /* JADX INFO: renamed from: c */
    public final int f124923c;

    /* JADX INFO: renamed from: l.kw50$a */
    public class C18098a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18099b f124924a;

        public C18098a(C18099b c18099b) {
            this.f124924a = c18099b;
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f124924a.m147517h(j);
        }
    }

    /* JADX INFO: renamed from: l.kw50$b */
    public static final class C18099b<T> extends z3g0<T> implements w9j<Object, T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f124926e;

        /* JADX INFO: renamed from: f */
        public final long f124927f;

        /* JADX INFO: renamed from: g */
        public final bud0 f124928g;

        /* JADX INFO: renamed from: h */
        public final int f124929h;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f124930i = new AtomicLong();

        /* JADX INFO: renamed from: j */
        public final ArrayDeque<Object> f124931j = new ArrayDeque<>();

        /* JADX INFO: renamed from: k */
        public final ArrayDeque<Long> f124932k = new ArrayDeque<>();

        /* JADX INFO: renamed from: l */
        public final NotificationLite<T> f124933l = NotificationLite.m221335f();

        public C18099b(z3g0<? super T> z3g0Var, int i, long j, bud0 bud0Var) {
            this.f124926e = z3g0Var;
            this.f124929h = i;
            this.f124927f = j;
            this.f124928g = bud0Var;
        }

        @Override // p149l.w9j
        public T call(Object obj) {
            return this.f124933l.m221340e(obj);
        }

        /* JADX INFO: renamed from: g */
        public void m147516g(long j) {
            long j2 = j - this.f124927f;
            while (true) {
                Long lPeek = this.f124932k.peek();
                if (lPeek == null || lPeek.longValue() >= j2) {
                    return;
                }
                this.f124931j.poll();
                this.f124932k.poll();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m147517h(long j) {
            kc2.m145342h(this.f124930i, j, this.f124931j, this.f124926e, this);
        }

        @Override // p149l.m250
        public void onCompleted() {
            m147516g(this.f124928g.now());
            this.f124932k.clear();
            kc2.m145339e(this.f124930i, this.f124931j, this.f124926e, this);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f124931j.clear();
            this.f124932k.clear();
            this.f124926e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f124929h != 0) {
                long jNow = this.f124928g.now();
                if (this.f124931j.size() == this.f124929h) {
                    this.f124931j.poll();
                    this.f124932k.poll();
                }
                m147516g(jNow);
                this.f124931j.offer(this.f124933l.m221344j(t));
                this.f124932k.offer(Long.valueOf(jNow));
            }
        }
    }

    public kw50(int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        if (i < 0) {
            jwm.m143661a("count could not be negative");
            throw null;
        }
        this.f124921a = timeUnit.toMillis(j);
        this.f124922b = bud0Var;
        this.f124923c = i;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C18099b c18099b = new C18099b(z3g0Var, this.f124923c, this.f124921a, this.f124922b);
        z3g0Var.m217046b(c18099b);
        z3g0Var.mo106696f(new C18098a(c18099b));
        return c18099b;
    }

    public kw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f124921a = timeUnit.toMillis(j);
        this.f124922b = bud0Var;
        this.f124923c = -1;
    }
}
