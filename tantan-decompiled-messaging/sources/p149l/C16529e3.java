package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.e3 */
/* JADX INFO: loaded from: classes12.dex */
public class C16529e3 implements eml {

    /* JADX INFO: renamed from: a */
    public List<eml> f88984a = new ArrayList();

    @Override // p149l.eml
    /* JADX INFO: renamed from: a */
    public void mo114573a(Location location, Act act) {
        for (eml emlVar : this.f88984a) {
            if (emlVar.mo114574b()) {
                emlVar.mo114573a(location, act);
                return;
            }
        }
    }

    @Override // p149l.eml
    /* JADX INFO: renamed from: b */
    public boolean mo114574b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m114575c(Location location, Act act, String str) {
        for (eml emlVar : this.f88984a) {
        }
    }

    @Override // p149l.eml
    public void destroy() {
        Iterator<eml> it = this.f88984a.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    @Override // p149l.eml
    public void init() {
        Iterator<eml> it = this.f88984a.iterator();
        while (it.hasNext()) {
            it.next().init();
        }
    }
}
