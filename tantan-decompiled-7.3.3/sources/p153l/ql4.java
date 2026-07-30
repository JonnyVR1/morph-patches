package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.DynamicLable;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class ql4 {

    /* JADX INFO: renamed from: a */
    public int f158201a;

    /* JADX INFO: renamed from: b */
    public List<AbstractC17382h4> f158202b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC17382h4> f158203c;

    /* JADX INFO: renamed from: d */
    public List<AbstractC17382h4> f158204d;

    /* JADX INFO: renamed from: e */
    public List<DynamicLable> f158205e;

    /* JADX INFO: renamed from: f */
    public Set<String> f158206f;

    public ql4() {
        this.f158201a = nrb0.m164466b() ? 2 : 3;
        this.f158202b = new ArrayList();
        this.f158203c = new ArrayList();
        this.f158204d = new ArrayList();
        this.f158205e = new ArrayList();
        this.f158206f = new HashSet();
    }

    /* JADX INFO: renamed from: b */
    public void m176990b() {
        for (AbstractC17382h4 abstractC17382h4 : this.f158203c) {
            if (abstractC17382h4 instanceof yl4) {
                abstractC17382h4.mo116209h();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m176991c(CoreSuggested.UserInfo userInfo) {
        this.f158203c.clear();
        List<Class> list = null;
        int i = 0;
        for (final AbstractC17382h4 abstractC17382h4 : this.f158202b) {
            if (jyb.m147479J(list) || jyb.m147520m(list, new qcj() { // from class: l.pl4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Class) obj).equals(abstractC17382h4.getClass()));
                }
            })) {
                if (!TextUtils.isEmpty(abstractC17382h4.mo116207d())) {
                    Iterator<String> it = this.f158206f.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        if (abstractC17382h4.mo116207d().startsWith(it.next())) {
                            z = true;
                        }
                    }
                    if (z) {
                        continue;
                    }
                }
                if (i < this.f158201a && abstractC17382h4.mo116206c() && (!gra.m131596L3() || userInfo.renderFrom == CardInfoRenderFrom.CARD || abstractC17382h4.mo116208g())) {
                    if (i == this.f158201a - 1 && m176994f(abstractC17382h4)) {
                        return;
                    }
                    if (abstractC17382h4.mo116209h()) {
                        abstractC17382h4.mo116205a();
                        i++;
                        this.f158203c.add(abstractC17382h4);
                        if (!abstractC17382h4.getShouldShowNextLabel()) {
                            return;
                        }
                        List<Class> listM133527i = abstractC17382h4.m133527i();
                        if (!jyb.m147479J(listM133527i)) {
                            list = listM133527i;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m176992d(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        this.f158202b.clear();
        if (ric0.m181583m()) {
            this.f158202b.add(new qh4(rqlVar, user, userInfo));
        }
        if (nrb0.m164466b()) {
            this.f158202b.add(new dk4(rqlVar, user, userInfo));
        }
        this.f158202b.add(new gm4(rqlVar, user, userInfo));
        this.f158202b.add(new dm4(rqlVar, user, userInfo));
        this.f158202b.add(new em4(rqlVar, user, userInfo));
    }

    /* JADX INFO: renamed from: e */
    public void m176993e(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        this.f158202b.clear();
        if (gra.m131559E1()) {
            this.f158202b.add(new fk4(rqlVar, user, userInfo));
        }
        this.f158202b.add(new yl4(rqlVar, user, userInfo));
        if (gra.m131740r1()) {
            this.f158202b.add(new hh4(rqlVar, user, userInfo));
        }
        this.f158202b.add(new nm4(rqlVar, user, userInfo));
        if (ric0.m181583m()) {
            this.f158202b.add(new qh4(rqlVar, user, userInfo));
        }
        this.f158202b.add(new i6n(rqlVar, user, userInfo));
        if (nrb0.m164466b()) {
            this.f158202b.add(new dk4(rqlVar, user, userInfo));
        }
        this.f158202b.add(new kk4(rqlVar, user, userInfo));
        this.f158202b.add(new gk4(rqlVar, user, userInfo));
        this.f158202b.add(new nn4(rqlVar, user, userInfo));
    }

    /* JADX INFO: renamed from: f */
    public boolean m176994f(AbstractC17382h4 abstractC17382h4) {
        for (AbstractC17382h4 abstractC17382h5 : this.f158202b) {
            if (abstractC17382h5.mo133528j() && abstractC17382h5.mo116206c() && abstractC17382h5.mo133525b(this, this.f158203c, abstractC17382h4)) {
                return true;
            }
        }
        return false;
    }
}
