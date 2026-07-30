package p007l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.location.Location;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface eml {

    /* JADX INFO: renamed from: l.eml$a */
    public interface InterfaceC2379a {
        /* JADX INFO: renamed from: a */
        void mo9933a(List<k90> list);

        void onError(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    void mo9600a(Location location, Act act);

    /* JADX INFO: renamed from: b */
    boolean mo9601b();

    void destroy();

    void init();
}
