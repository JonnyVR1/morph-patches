package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.C8638b;
import com.p046p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qcf {

    /* JADX INFO: renamed from: a */
    public final b1m f153749a;

    /* JADX INFO: renamed from: b */
    public mcr f153750b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC8639c> f153751c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<TabLayout.Tab> f153752d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<AbstractC8639c> f153753e = null;

    public qcf(b1m b1mVar, mcr mcrVar) {
        this.f153749a = b1mVar;
        this.f153750b = mcrVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m173869b(int i, final List list, final AbstractC8639c abstractC8639c) {
        if (abstractC8639c.mo51160l() == i) {
            abstractC8639c.m51151c(new d30() { // from class: l.pcf
                @Override // p149l.d30
                public final void call() {
                    abstractC8639c.mo51171w(list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m173872e(TabLayout tabLayout, boolean z, String str, String str2) {
        View viewM98599a = asm.m98599a(tabLayout.getContext(), f6c0.f95365G2, null);
        ((TextView) viewM98599a.findViewById(u4c0.f173764Cd)).setText(str);
        TabLayout.Tab customView = tabLayout.newTab().setCustomView(viewM98599a);
        customView.setTag(str2);
        this.f153752d.add(customView);
        tabLayout.addTab(customView, z);
    }

    /* JADX INFO: renamed from: f */
    public void m173873f(List<AbstractC8639c> list) {
        m173876i(list);
    }

    /* JADX INFO: renamed from: g */
    public List<AbstractC8639c> m173874g() {
        if (vwb.m200296J(this.f153751c)) {
            m173873f(this.f153751c);
        }
        return this.f153751c;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC8639c m173875h(final Class<? extends AbstractC8639c> cls) {
        return (AbstractC8639c) vwb.m200346r(this.f153751c, new w9j() { // from class: l.ocf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC8639c) obj).getClass().isAssignableFrom(cls));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m173876i(List<AbstractC8639c> list) {
        list.add(new C8638b(this.f153749a, this.f153750b));
        list.add(new lcf(this.f153749a, this.f153750b));
        list.add(new idf(this.f153749a, this.f153750b));
        list.add(new wcf(this.f153749a, this.f153750b));
        list.add(new jcf(this.f153749a, this.f153750b));
        list.add(new r9f(this.f153749a, this.f153750b));
        list.add(new vdf(this.f153749a, this.f153750b));
        upa.m194718Y1();
        list.add(new daf(this.f153749a, this.f153750b));
        list.add(new w9f(this.f153749a, this.f153750b));
        list.add(new zcf(this.f153749a, this.f153750b));
        list.add(lqa.m150964b() ? new d9f(this.f153749a, this.f153750b) : new i9f(this.f153749a, this.f153750b));
        list.add(new tff(this.f153749a, this.f153750b));
        list.add(new u9f(this.f153749a, this.f153750b));
        list.add(new cdf(this.f153749a, this.f153750b));
        list.add(new a9f(this.f153749a, this.f153750b));
    }

    /* JADX INFO: renamed from: j */
    public List<TabLayout.Tab> m173877j() {
        return this.f153752d;
    }

    /* JADX INFO: renamed from: k */
    public void m173878k(TabLayout tabLayout, List<AbstractC8639c> list, rqh0 rqh0Var) {
        List<AbstractC8639c> list2 = this.f153753e;
        if (list2 == null || !vwb.m200335l(list2, list, new x9j() { // from class: l.ncf
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((AbstractC8639c) obj) == ((AbstractC8639c) obj2));
            }
        })) {
            this.f153753e = list;
            int size = rqh0Var.m180450h() >= list.size() ? list.size() - 1 : rqh0Var.m180450h();
            this.f153752d.clear();
            tabLayout.removeAllTabs();
            int i = 0;
            while (i < list.size()) {
                String strMo51161m = list.get(i).mo51161m();
                String strMo51162n = list.get(i).mo51162n();
                if (!TextUtils.isEmpty(strMo51161m)) {
                    m173872e(tabLayout, i == 0, strMo51161m, strMo51162n);
                }
                i++;
            }
            if (size < this.f153752d.size()) {
                tabLayout.selectTab(this.f153752d.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m173879l(final List<Media> list, final int i) {
        vwb.m200354z(this.f153751c, new e30() { // from class: l.mcf
            @Override // p149l.e30
            public final void call(Object obj) {
                qcf.m173869b(i, list, (AbstractC8639c) obj);
            }
        });
    }
}
