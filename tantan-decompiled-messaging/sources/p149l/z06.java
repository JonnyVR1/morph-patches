package p149l;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.p046p1.mobile.android.app.App;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public class z06 {

    /* JADX INFO: renamed from: l.z06$a */
    public class C21589a extends ContentObserver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f200935a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ v9j f200936b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21589a(Handler handler, z3g0 z3g0Var, v9j v9jVar) {
            super(handler);
            this.f200935a = z3g0Var;
            this.f200936b = v9jVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            this.f200935a.onNext(this.f200936b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m216717a(v9j v9jVar, Uri uri, z3g0 z3g0Var) {
        z3g0Var.onNext(v9jVar);
        final C21589a c21589a = new C21589a(null, z3g0Var, v9jVar);
        App.f15369e.getContentResolver().registerContentObserver(uri, true, c21589a);
        z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.y06
            @Override // p149l.d30
            public final void call() {
                App.f15369e.getContentResolver().unregisterContentObserver(c21589a);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22306c<v9j<T>> m216719c(final Uri uri, boolean z, final v9j<T> v9jVar) {
        return C22306c.create(new C22306c.a() { // from class: l.x06
            @Override // p149l.e30
            public final void call(Object obj) {
                z06.m216717a(v9jVar, uri, (z3g0) obj);
            }
        }).onBackpressureLatest();
    }
}
