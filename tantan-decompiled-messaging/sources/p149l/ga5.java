package p149l;

import android.util.Log;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class ga5 {

    /* JADX INFO: renamed from: a */
    public final fa5.InterfaceC16786c f101627a;

    /* JADX INFO: renamed from: l.ga5$a */
    public class C17026a implements fa5.InterfaceC16786c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ha5 f101628a;

        public C17026a(ha5 ha5Var) {
            this.f101628a = ha5Var;
        }

        @Override // p149l.fa5.InterfaceC16786c
        /* JADX INFO: renamed from: a */
        public boolean mo120160a() {
            return this.f101628a.mo130067b();
        }

        @Override // p149l.fa5.InterfaceC16786c
        /* JADX INFO: renamed from: b */
        public void mo120161b(SharedReference<Object> sharedReference, Throwable th) {
            this.f101628a.mo130066a(sharedReference, th);
            Object objM8165f = sharedReference.m8165f();
            tsf.m190560z("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objM8165f != null ? objM8165f.getClass().getName() : "<value is null>", ga5.m124921d(th));
        }
    }

    public ga5(ha5 ha5Var) {
        this.f101627a = new C17026a(ha5Var);
    }

    /* JADX INFO: renamed from: d */
    public static String m124921d(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    /* JADX INFO: renamed from: b */
    public <U extends Closeable> fa5<U> m124922b(U u) {
        return fa5.m120146T(u, this.f101627a);
    }

    /* JADX INFO: renamed from: c */
    public <T> fa5<T> m124923c(T t, twc0<T> twc0Var) {
        return fa5.m120148Z(t, twc0Var, this.f101627a);
    }
}
