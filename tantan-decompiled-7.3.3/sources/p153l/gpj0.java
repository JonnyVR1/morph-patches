package p153l;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class gpj0<T> extends Handler {

    /* JADX INFO: renamed from: a */
    private WeakReference<T> f105469a;

    public gpj0(T t) {
        this.f105469a = new WeakReference<>(t);
    }

    /* JADX INFO: renamed from: a */
    public T m131281a() {
        return this.f105469a.get();
    }
}
