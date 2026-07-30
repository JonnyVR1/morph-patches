package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.e3 */
/* JADX INFO: loaded from: classes13.dex */
public class C16691e3 implements qol {

    /* JADX INFO: renamed from: a */
    public List<qol> f91908a = new ArrayList();

    @Override // p153l.qol
    /* JADX INFO: renamed from: a */
    public void mo119236a(Location location, Act act) {
        for (qol qolVar : this.f91908a) {
            if (qolVar.mo119237b()) {
                qolVar.mo119236a(location, act);
                return;
            }
        }
    }

    @Override // p153l.qol
    /* JADX INFO: renamed from: b */
    public boolean mo119237b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m119238c(Location location, Act act, String str) {
        for (qol qolVar : this.f91908a) {
        }
    }

    @Override // p153l.qol
    public void destroy() {
        Iterator<qol> it = this.f91908a.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    @Override // p153l.qol
    public void init() {
        Iterator<qol> it = this.f91908a.iterator();
        while (it.hasNext()) {
            it.next().init();
        }
    }
}
