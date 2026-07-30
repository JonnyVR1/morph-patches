package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p149l.dnr;
import p149l.shg0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d */
/* JADX INFO: loaded from: classes.dex */
public class C0598d<T> {

    /* JADX INFO: renamed from: h */
    public static final Executor f2699h = new c();

    /* JADX INFO: renamed from: a */
    public final dnr f2700a;

    /* JADX INFO: renamed from: b */
    public final C0597c<T> f2701b;

    /* JADX INFO: renamed from: c */
    public Executor f2702c;

    /* JADX INFO: renamed from: e */
    @Nullable
    public List<T> f2704e;

    /* JADX INFO: renamed from: g */
    public int f2706g;

    /* JADX INFO: renamed from: d */
    public final List<b<T>> f2703d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    @NonNull
    public List<T> f2705f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f2707a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f2708b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f2709c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f2710d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C22654a extends C0601g.b {
            public C22654a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: a */
            public boolean mo3645a(int i, int i2) {
                Object obj = a.this.f2707a.get(i);
                Object obj2 = a.this.f2708b.get(i2);
                if (obj != null && obj2 != null) {
                    return C0598d.this.f2701b.m3636b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                shg0.m184191a();
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: b */
            public boolean mo3646b(int i, int i2) {
                Object obj = a.this.f2707a.get(i);
                Object obj2 = a.this.f2708b.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return C0598d.this.f2701b.m3636b().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C0601g.b
            @Nullable
            /* JADX INFO: renamed from: c */
            public Object mo3647c(int i, int i2) {
                Object obj = a.this.f2707a.get(i);
                Object obj2 = a.this.f2708b.get(i2);
                if (obj != null && obj2 != null) {
                    return C0598d.this.f2701b.m3636b().getChangePayload(obj, obj2);
                }
                shg0.m184191a();
                return null;
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: d */
            public int mo3648d() {
                return a.this.f2708b.size();
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: e */
            public int mo3649e() {
                return a.this.f2707a.size();
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0601g.e f2713a;

            public b(C0601g.e eVar) {
                this.f2713a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                C0598d c0598d = C0598d.this;
                if (c0598d.f2706g == aVar.f2709c) {
                    c0598d.m3641c(aVar.f2708b, this.f2713a, aVar.f2710d);
                }
            }
        }

        public a(List list, List list2, int i, Runnable runnable) {
            this.f2707a = list;
            this.f2708b = list2;
            this.f2709c = i;
            this.f2710d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0598d.this.f2702c.execute(new b(C0601g.m3680b(new C22654a())));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void mo3650a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$c */
    public static class c implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f2715a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f2715a.post(runnable);
        }
    }

    public C0598d(@NonNull dnr dnrVar, @NonNull C0597c<T> c0597c) {
        this.f2700a = dnrVar;
        this.f2701b = c0597c;
        if (c0597c.m3637c() != null) {
            this.f2702c = c0597c.m3637c();
        } else {
            this.f2702c = f2699h;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3639a(@NonNull b<T> bVar) {
        this.f2703d.add(bVar);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public List<T> m3640b() {
        return this.f2705f;
    }

    /* JADX INFO: renamed from: c */
    public void m3641c(@NonNull List<T> list, @NonNull C0601g.e eVar, @Nullable Runnable runnable) {
        List<T> list2 = this.f2705f;
        this.f2704e = list;
        this.f2705f = Collections.unmodifiableList(list);
        eVar.m3693c(this.f2700a);
        m3642d(list2, runnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m3642d(@NonNull List<T> list, @Nullable Runnable runnable) {
        Iterator<b<T>> it = this.f2703d.iterator();
        while (it.hasNext()) {
            it.next().mo3650a(list, this.f2705f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m3643e(@Nullable List<T> list) {
        m3644f(list, null);
    }

    /* JADX INFO: renamed from: f */
    public void m3644f(@Nullable List<T> list, @Nullable Runnable runnable) {
        int i = this.f2706g + 1;
        this.f2706g = i;
        List<T> list2 = this.f2704e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f2705f;
        if (list == null) {
            int size = list2.size();
            this.f2704e = null;
            this.f2705f = Collections.EMPTY_LIST;
            this.f2700a.mo3633c(0, size);
            m3642d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f2701b.m3635a().execute(new a(list2, list, i, runnable));
            return;
        }
        this.f2704e = list;
        this.f2705f = Collections.unmodifiableList(list);
        this.f2700a.mo3632b(0, list.size());
        m3642d(list3, runnable);
    }
}
