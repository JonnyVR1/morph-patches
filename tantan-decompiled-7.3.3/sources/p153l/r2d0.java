package p153l;

import com.p051p1.mobile.android.app.Act;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r2d0<T> implements y20<T> {

    /* JADX INFO: renamed from: a */
    public final WeakReference<Act> f160932a;

    public r2d0(Act act) {
        this.f160932a = new WeakReference<>(act);
    }

    /* JADX INFO: renamed from: a */
    public boolean m179536a() {
        Act act = this.f160932a.get();
        return (act == null || act.isDestroyed()) ? false : true;
    }
}
