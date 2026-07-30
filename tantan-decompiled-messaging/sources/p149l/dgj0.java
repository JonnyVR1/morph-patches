package p149l;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class dgj0<T> extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference<T> f86112a;

    public dgj0(T t) {
        this.f86112a = new WeakReference<>(t);
    }

    /* JADX INFO: renamed from: a */
    public T m111669a() {
        return this.f86112a.get();
    }
}
