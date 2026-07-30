package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.DynamicLable;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l.jjb0;
import l.lac0;
import l.upa;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rk4 {

    /* JADX INFO: renamed from: a */
    public int f19882a;

    /* JADX INFO: renamed from: b */
    public List<AbstractC0925h4> f19883b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC0925h4> f19884c;

    /* JADX INFO: renamed from: d */
    public List<AbstractC0925h4> f19885d;

    /* JADX INFO: renamed from: e */
    public List<DynamicLable> f19886e;

    /* JADX INFO: renamed from: f */
    public Set<String> f19887f;

    public rk4() {
        this.f19882a = jjb0.b() ? 2 : 3;
        this.f19883b = new ArrayList();
        this.f19884c = new ArrayList();
        this.f19885d = new ArrayList();
        this.f19886e = new ArrayList();
        this.f19887f = new HashSet();
    }

    /* JADX INFO: renamed from: b */
    public void m21685b() {
        for (AbstractC0925h4 abstractC0925h4 : this.f19884c) {
            if (abstractC0925h4 instanceof zk4) {
                abstractC0925h4.mo13957h();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m21686c(CoreSuggested.UserInfo userInfo) {
        this.f19884c.clear();
        List<Class> list = null;
        int i = 0;
        for (final AbstractC0925h4 abstractC0925h4 : this.f19883b) {
            if (vwb.J(list) || vwb.m(list, new w9j() { // from class: l.qk4
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Class) obj).equals(abstractC0925h4.getClass()));
                }
            })) {
                if (!TextUtils.isEmpty(abstractC0925h4.mo13955d())) {
                    Iterator<String> it = this.f19887f.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        if (abstractC0925h4.mo13955d().startsWith(it.next())) {
                            z = true;
                        }
                    }
                    if (z) {
                        continue;
                    }
                }
                if (i < this.f19882a && abstractC0925h4.mo13954c() && (!upa.L3() || userInfo.renderFrom == CardInfoRenderFrom.CARD || abstractC0925h4.mo13956g())) {
                    if (i == this.f19882a - 1 && m21689f(abstractC0925h4)) {
                        return;
                    }
                    if (abstractC0925h4.mo13957h()) {
                        abstractC0925h4.mo13953a();
                        i++;
                        this.f19884c.add(abstractC0925h4);
                        if (!abstractC0925h4.getShouldShowNextLabel()) {
                            return;
                        }
                        List<Class> listM15391i = abstractC0925h4.m15391i();
                        if (!vwb.J(listM15391i)) {
                            list = listM15391i;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m21687d(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        this.f19883b.clear();
        if (lac0.m()) {
            this.f19883b.add(new rg4(golVar, user, userInfo));
        }
        if (jjb0.b()) {
            this.f19883b.add(new ej4(golVar, user, userInfo));
        }
        this.f19883b.add(new hl4(golVar, user, userInfo));
        this.f19883b.add(new el4(golVar, user, userInfo));
        this.f19883b.add(new fl4(golVar, user, userInfo));
    }

    /* JADX INFO: renamed from: e */
    public void m21688e(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        this.f19883b.clear();
        if (upa.E1()) {
            this.f19883b.add(new gj4(golVar, user, userInfo));
        }
        this.f19883b.add(new zk4(golVar, user, userInfo));
        if (upa.r1()) {
            this.f19883b.add(new ig4(golVar, user, userInfo));
        }
        this.f19883b.add(new ol4(golVar, user, userInfo));
        if (lac0.m()) {
            this.f19883b.add(new rg4(golVar, user, userInfo));
        }
        this.f19883b.add(new i4n(golVar, user, userInfo));
        if (jjb0.b()) {
            this.f19883b.add(new ej4(golVar, user, userInfo));
        }
        this.f19883b.add(new lj4(golVar, user, userInfo));
        this.f19883b.add(new hj4(golVar, user, userInfo));
        this.f19883b.add(new om4(golVar, user, userInfo));
    }

    /* JADX INFO: renamed from: f */
    public boolean m21689f(AbstractC0925h4 abstractC0925h4) {
        for (AbstractC0925h4 abstractC0925h5 : this.f19883b) {
            if (abstractC0925h5.mo15392j() && abstractC0925h5.mo13954c() && abstractC0925h5.mo15389b(this, this.f19884c, abstractC0925h4)) {
                return true;
            }
        }
        return false;
    }
}
