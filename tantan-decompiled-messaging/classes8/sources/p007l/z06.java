package p007l;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.p003p1.mobile.android.app.App;
import l.d30;
import l.h4g0;
import l.v9j;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class z06 {

    /* JADX INFO: renamed from: l.z06$a */
    public class C0803a extends ContentObserver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f5470a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ v9j f5471b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0803a(Handler handler, z3g0 z3g0Var, v9j v9jVar) {
            super(handler);
            this.f5470a = z3g0Var;
            this.f5471b = v9jVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            this.f5470a.onNext(this.f5471b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11961a(v9j v9jVar, Uri uri, z3g0 z3g0Var) {
        z3g0Var.onNext(v9jVar);
        final C0803a c0803a = new C0803a(null, z3g0Var, v9jVar);
        App.f1068e.getContentResolver().registerContentObserver(uri, true, c0803a);
        z3g0Var.b(h4g0.a(new d30() { // from class: l.y06
            public final void call() {
                App.f1068e.getContentResolver().unregisterContentObserver(c0803a);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static <T> c<v9j<T>> m11963c(final Uri uri, boolean z, final v9j<T> v9jVar) {
        return c.create(new c.a() { // from class: l.x06
            public final void call(Object obj) {
                z06.m11961a(v9jVar, uri, (z3g0) obj);
            }
        }).onBackpressureLatest();
    }
}
