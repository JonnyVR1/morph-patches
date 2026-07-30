package p153l;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.p051p1.mobile.android.app.App;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public class e26 {

    /* JADX INFO: renamed from: l.e26$a */
    public class C16687a extends ContentObserver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f91704a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pcj f91705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16687a(Handler handler, gcg0 gcg0Var, pcj pcjVar) {
            super(handler);
            this.f91704a = gcg0Var;
            this.f91705b = pcjVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            this.f91704a.onNext(this.f91705b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m119045a(pcj pcjVar, Uri uri, gcg0 gcg0Var) {
        gcg0Var.onNext(pcjVar);
        final C16687a c16687a = new C16687a(null, gcg0Var, pcjVar);
        App.f16088e.getContentResolver().registerContentObserver(uri, true, c16687a);
        gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.d26
            @Override // p153l.x20
            public final void call() {
                App.f16088e.getContentResolver().unregisterContentObserver(c16687a);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22421c<pcj<T>> m119047c(final Uri uri, boolean z, final pcj<T> pcjVar) {
        return C22421c.create(new C22421c.a() { // from class: l.c26
            @Override // p153l.y20
            public final void call(Object obj) {
                e26.m119045a(pcjVar, uri, (gcg0) obj);
            }
        }).onBackpressureLatest();
    }
}
