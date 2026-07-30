package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.DynamicLable;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class rk4 {

    /* JADX INFO: renamed from: a */
    public int f159774a;

    /* JADX INFO: renamed from: b */
    public List<AbstractC17222h4> f159775b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC17222h4> f159776c;

    /* JADX INFO: renamed from: d */
    public List<AbstractC17222h4> f159777d;

    /* JADX INFO: renamed from: e */
    public List<DynamicLable> f159778e;

    /* JADX INFO: renamed from: f */
    public Set<String> f159779f;

    public rk4() {
        this.f159774a = jjb0.m141784b() ? 2 : 3;
        this.f159775b = new ArrayList();
        this.f159776c = new ArrayList();
        this.f159777d = new ArrayList();
        this.f159778e = new ArrayList();
        this.f159779f = new HashSet();
    }

    /* JADX INFO: renamed from: b */
    public void m179669b() {
        for (AbstractC17222h4 abstractC17222h4 : this.f159776c) {
            if (abstractC17222h4 instanceof zk4) {
                abstractC17222h4.mo116772h();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m179670c(CoreSuggested.UserInfo userInfo) {
        this.f159776c.clear();
        List<Class> list = null;
        int i = 0;
        for (final AbstractC17222h4 abstractC17222h4 : this.f159775b) {
            if (vwb.m200296J(list) || vwb.m200337m(list, new w9j() { // from class: l.qk4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Class) obj).equals(abstractC17222h4.getClass()));
                }
            })) {
                if (!TextUtils.isEmpty(abstractC17222h4.mo116770d())) {
                    Iterator<String> it = this.f159779f.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        if (abstractC17222h4.mo116770d().startsWith(it.next())) {
                            z = true;
                        }
                    }
                    if (z) {
                        continue;
                    }
                }
                if (i < this.f159774a && abstractC17222h4.mo116769c() && (!upa.m194665L3() || userInfo.renderFrom == CardInfoRenderFrom.CARD || abstractC17222h4.mo116771g())) {
                    if (i == this.f159774a - 1 && m179673f(abstractC17222h4)) {
                        return;
                    }
                    if (abstractC17222h4.mo116772h()) {
                        abstractC17222h4.mo116768a();
                        i++;
                        this.f159776c.add(abstractC17222h4);
                        if (!abstractC17222h4.getShouldShowNextLabel()) {
                            return;
                        }
                        List<Class> listM129198i = abstractC17222h4.m129198i();
                        if (!vwb.m200296J(listM129198i)) {
                            list = listM129198i;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m179671d(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        this.f159775b.clear();
        if (lac0.m149136m()) {
            this.f159775b.add(new rg4(golVar, user, userInfo));
        }
        if (jjb0.m141784b()) {
            this.f159775b.add(new ej4(golVar, user, userInfo));
        }
        this.f159775b.add(new hl4(golVar, user, userInfo));
        this.f159775b.add(new el4(golVar, user, userInfo));
        this.f159775b.add(new fl4(golVar, user, userInfo));
    }

    /* JADX INFO: renamed from: e */
    public void m179672e(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        this.f159775b.clear();
        if (upa.m194628E1()) {
            this.f159775b.add(new gj4(golVar, user, userInfo));
        }
        this.f159775b.add(new zk4(golVar, user, userInfo));
        if (upa.m194809r1()) {
            this.f159775b.add(new ig4(golVar, user, userInfo));
        }
        this.f159775b.add(new ol4(golVar, user, userInfo));
        if (lac0.m149136m()) {
            this.f159775b.add(new rg4(golVar, user, userInfo));
        }
        this.f159775b.add(new i4n(golVar, user, userInfo));
        if (jjb0.m141784b()) {
            this.f159775b.add(new ej4(golVar, user, userInfo));
        }
        this.f159775b.add(new lj4(golVar, user, userInfo));
        this.f159775b.add(new hj4(golVar, user, userInfo));
        this.f159775b.add(new om4(golVar, user, userInfo));
    }

    /* JADX INFO: renamed from: f */
    public boolean m179673f(AbstractC17222h4 abstractC17222h4) {
        for (AbstractC17222h4 abstractC17222h5 : this.f159775b) {
            if (abstractC17222h5.mo129199j() && abstractC17222h5.mo116769c() && abstractC17222h5.mo129196b(this, this.f159776c, abstractC17222h4)) {
                return true;
            }
        }
        return false;
    }
}
