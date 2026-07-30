package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.location.Location;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface qol {

    /* JADX INFO: renamed from: l.qol$a */
    public interface InterfaceC19615a {
        /* JADX INFO: renamed from: a */
        void mo146707a(List<g90> list);

        void onError(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    void mo119236a(Location location, Act act);

    /* JADX INFO: renamed from: b */
    boolean mo119237b();

    void destroy();

    void init();
}
