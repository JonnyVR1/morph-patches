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
import p153l.aqg0;
import p153l.epr;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d */
/* JADX INFO: loaded from: classes.dex */
public class C0600d<T> {

    /* JADX INFO: renamed from: h */
    public static final Executor f2699h = new c();

    /* JADX INFO: renamed from: a */
    public final epr f2700a;

    /* JADX INFO: renamed from: b */
    public final C0599c<T> f2701b;

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
        public class C22769a extends C0603g.b {
            public C22769a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: a */
            public boolean mo3646a(int i, int i2) {
                Object obj = a.this.f2707a.get(i);
                Object obj2 = a.this.f2708b.get(i2);
                if (obj != null && obj2 != null) {
                    return C0600d.this.f2701b.m3637b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                aqg0.m99478a();
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: b */
            public boolean mo3647b(int i, int i2) {
                Object obj = a.this.f2707a.get(i);
                Object obj2 = a.this.f2708b.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return C0600d.this.f2701b.m3637b().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.C0603g.b
            @Nullable
            /* JADX INFO: renamed from: c */
            public Object mo3648c(int i, int i2) {
                Object obj = a.this.f2707a.get(i);
                Object obj2 = a.this.f2708b.get(i2);
                if (obj != null && obj2 != null) {
                    return C0600d.this.f2701b.m3637b().getChangePayload(obj, obj2);
                }
                aqg0.m99478a();
                return null;
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: d */
            public int mo3649d() {
                return a.this.f2708b.size();
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: e */
            public int mo3650e() {
                return a.this.f2707a.size();
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0603g.e f2713a;

            public b(C0603g.e eVar) {
                this.f2713a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                C0600d c0600d = C0600d.this;
                if (c0600d.f2706g == aVar.f2709c) {
                    c0600d.m3642c(aVar.f2708b, this.f2713a, aVar.f2710d);
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
            C0600d.this.f2702c.execute(new b(C0603g.m3681b(new C22769a())));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void mo3651a(@NonNull List<T> list, @NonNull List<T> list2);
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

    public C0600d(@NonNull epr eprVar, @NonNull C0599c<T> c0599c) {
        this.f2700a = eprVar;
        this.f2701b = c0599c;
        if (c0599c.m3638c() != null) {
            this.f2702c = c0599c.m3638c();
        } else {
            this.f2702c = f2699h;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3640a(@NonNull b<T> bVar) {
        this.f2703d.add(bVar);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public List<T> m3641b() {
        return this.f2705f;
    }

    /* JADX INFO: renamed from: c */
    public void m3642c(@NonNull List<T> list, @NonNull C0603g.e eVar, @Nullable Runnable runnable) {
        List<T> list2 = this.f2705f;
        this.f2704e = list;
        this.f2705f = Collections.unmodifiableList(list);
        eVar.m3694c(this.f2700a);
        m3643d(list2, runnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m3643d(@NonNull List<T> list, @Nullable Runnable runnable) {
        Iterator<b<T>> it = this.f2703d.iterator();
        while (it.hasNext()) {
            it.next().mo3651a(list, this.f2705f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m3644e(@Nullable List<T> list) {
        m3645f(list, null);
    }

    /* JADX INFO: renamed from: f */
    public void m3645f(@Nullable List<T> list, @Nullable Runnable runnable) {
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
            this.f2700a.mo3634c(0, size);
            m3643d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f2701b.m3636a().execute(new a(list2, list, i, runnable));
            return;
        }
        this.f2704e = list;
        this.f2705f = Collections.unmodifiableList(list);
        this.f2700a.mo3633b(0, list.size());
        m3643d(list3, runnable);
    }
}
