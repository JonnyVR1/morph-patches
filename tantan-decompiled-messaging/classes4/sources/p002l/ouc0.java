package p002l;

import com.p1.mobile.android.app.Act;
import java.lang.ref.WeakReference;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ouc0<T> implements e30<T> {

    /* JADX INFO: renamed from: a */
    public final WeakReference<Act> f16796a;

    public ouc0(Act act) {
        this.f16796a = new WeakReference<>(act);
    }

    /* JADX INFO: renamed from: a */
    public boolean m19756a() {
        Act act = this.f16796a.get();
        return (act == null || act.isDestroyed()) ? false : true;
    }
}
