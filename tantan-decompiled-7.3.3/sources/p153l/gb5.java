package p153l;

import android.util.Log;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class gb5 {

    /* JADX INFO: renamed from: a */
    public final fb5.InterfaceC16935c f103046a;

    /* JADX INFO: renamed from: l.gb5$a */
    public class C17189a implements fb5.InterfaceC16935c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hb5 f103047a;

        public C17189a(hb5 hb5Var) {
            this.f103047a = hb5Var;
        }

        @Override // p153l.fb5.InterfaceC16935c
        /* JADX INFO: renamed from: a */
        public boolean mo124881a() {
            return this.f103047a.mo100021b();
        }

        @Override // p153l.fb5.InterfaceC16935c
        /* JADX INFO: renamed from: b */
        public void mo124882b(SharedReference<Object> sharedReference, Throwable th) {
            this.f103047a.mo100020a(sharedReference, th);
            Object objM8219f = sharedReference.m8219f();
            huf.m137198z("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objM8219f != null ? objM8219f.getClass().getName() : "<value is null>", gb5.m129767d(th));
        }
    }

    public gb5(hb5 hb5Var) {
        this.f103046a = new C17189a(hb5Var);
    }

    /* JADX INFO: renamed from: d */
    public static String m129767d(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    /* JADX INFO: renamed from: b */
    public <U extends Closeable> fb5<U> m129768b(U u) {
        return fb5.m124866U(u, this.f103046a);
    }

    /* JADX INFO: renamed from: c */
    public <T> fb5<T> m129769c(T t, w4d0<T> w4d0Var) {
        return fb5.m124868a0(t, w4d0Var, this.f103046a);
    }
}
