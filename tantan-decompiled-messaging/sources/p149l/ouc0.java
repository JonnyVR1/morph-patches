package p149l;

import com.p046p1.mobile.android.app.Act;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ouc0<T> implements e30<T> {

    /* JADX INFO: renamed from: a */
    public final WeakReference<Act> f145684a;

    public ouc0(Act act) {
        this.f145684a = new WeakReference<>(act);
    }

    /* JADX INFO: renamed from: a */
    public boolean m165983a() {
        Act act = this.f145684a.get();
        return (act == null || act.isDestroyed()) ? false : true;
    }
}
