package p007l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.e3 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2365e3 implements eml {

    /* JADX INFO: renamed from: a */
    public List<eml> f7184a = new ArrayList();

    @Override // p007l.eml
    /* JADX INFO: renamed from: a */
    public void mo9600a(Location location, Act act) {
        for (eml emlVar : this.f7184a) {
            if (emlVar.mo9601b()) {
                emlVar.mo9600a(location, act);
                return;
            }
        }
    }

    @Override // p007l.eml
    /* JADX INFO: renamed from: b */
    public boolean mo9601b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m9602c(Location location, Act act, String str) {
        for (eml emlVar : this.f7184a) {
        }
    }

    @Override // p007l.eml
    public void destroy() {
        Iterator<eml> it = this.f7184a.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    @Override // p007l.eml
    public void init() {
        Iterator<eml> it = this.f7184a.iterator();
        while (it.hasNext()) {
            it.next().init();
        }
    }
}
