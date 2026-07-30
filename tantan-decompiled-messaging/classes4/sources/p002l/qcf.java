package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.C0063b;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.List;
import l.asm;
import l.d30;
import l.e30;
import l.f6c0;
import l.lqa;
import l.mcr;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w9j;
import l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qcf {

    /* JADX INFO: renamed from: a */
    public final b1m f17901a;

    /* JADX INFO: renamed from: b */
    public mcr f17902b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC0064c> f17903c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<TabLayout.Tab> f17904d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<AbstractC0064c> f17905e = null;

    public qcf(b1m b1mVar, mcr mcrVar) {
        this.f17901a = b1mVar;
        this.f17902b = mcrVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21155b(int i, final List list, final AbstractC0064c abstractC0064c) {
        if (abstractC0064c.mo1612l() == i) {
            abstractC0064c.m1603c(new d30() { // from class: l.pcf
                public final void call() {
                    abstractC0064c.mo1623w(list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m21158e(TabLayout tabLayout, boolean z, String str, String str2) {
        View viewA = asm.a(tabLayout.getContext(), f6c0.G2, (ViewGroup) null);
        ((TextView) viewA.findViewById(u4c0.Cd)).setText(str);
        TabLayout.Tab customView = tabLayout.newTab().setCustomView(viewA);
        customView.setTag(str2);
        this.f17904d.add(customView);
        tabLayout.addTab(customView, z);
    }

    /* JADX INFO: renamed from: f */
    public void m21159f(List<AbstractC0064c> list) {
        m21162i(list);
    }

    /* JADX INFO: renamed from: g */
    public List<AbstractC0064c> m21160g() {
        if (vwb.J(this.f17903c)) {
            m21159f(this.f17903c);
        }
        return this.f17903c;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC0064c m21161h(final Class<? extends AbstractC0064c> cls) {
        return (AbstractC0064c) vwb.r(this.f17903c, new w9j() { // from class: l.ocf
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC0064c) obj).getClass().isAssignableFrom(cls));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m21162i(List<AbstractC0064c> list) {
        list.add(new C0063b(this.f17901a, this.f17902b));
        list.add(new lcf(this.f17901a, this.f17902b));
        list.add(new idf(this.f17901a, this.f17902b));
        list.add(new wcf(this.f17901a, this.f17902b));
        list.add(new jcf(this.f17901a, this.f17902b));
        list.add(new r9f(this.f17901a, this.f17902b));
        list.add(new vdf(this.f17901a, this.f17902b));
        upa.Y1();
        list.add(new daf(this.f17901a, this.f17902b));
        list.add(new w9f(this.f17901a, this.f17902b));
        list.add(new zcf(this.f17901a, this.f17902b));
        list.add(lqa.b() ? new d9f(this.f17901a, this.f17902b) : new i9f(this.f17901a, this.f17902b));
        list.add(new tff(this.f17901a, this.f17902b));
        list.add(new u9f(this.f17901a, this.f17902b));
        list.add(new cdf(this.f17901a, this.f17902b));
        list.add(new a9f(this.f17901a, this.f17902b));
    }

    /* JADX INFO: renamed from: j */
    public List<TabLayout.Tab> m21163j() {
        return this.f17904d;
    }

    /* JADX INFO: renamed from: k */
    public void m21164k(TabLayout tabLayout, List<AbstractC0064c> list, rqh0 rqh0Var) {
        List<AbstractC0064c> list2 = this.f17905e;
        if (list2 == null || !vwb.l(list2, list, new x9j() { // from class: l.ncf
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((AbstractC0064c) obj) == ((AbstractC0064c) obj2));
            }
        })) {
            this.f17905e = list;
            int size = rqh0Var.m22104h() >= list.size() ? list.size() - 1 : rqh0Var.m22104h();
            this.f17904d.clear();
            tabLayout.removeAllTabs();
            int i = 0;
            while (i < list.size()) {
                String strMo1613m = list.get(i).mo1613m();
                String strMo1614n = list.get(i).mo1614n();
                if (!TextUtils.isEmpty(strMo1613m)) {
                    m21158e(tabLayout, i == 0, strMo1613m, strMo1614n);
                }
                i++;
            }
            if (size < this.f17904d.size()) {
                tabLayout.selectTab(this.f17904d.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m21165l(final List<Media> list, final int i) {
        vwb.z(this.f17903c, new e30() { // from class: l.mcf
            public final void call(Object obj) {
                qcf.m21155b(i, list, (AbstractC0064c) obj);
            }
        });
    }
}
