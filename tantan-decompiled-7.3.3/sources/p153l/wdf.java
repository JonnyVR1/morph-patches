package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.C8801b;
import com.p051p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class wdf {

    /* JADX INFO: renamed from: a */
    public final u3m f188546a;

    /* JADX INFO: renamed from: b */
    public ner f188547b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC8802c> f188548c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<TabLayout.Tab> f188549d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<AbstractC8802c> f188550e = null;

    public wdf(u3m u3mVar, ner nerVar) {
        this.f188546a = u3mVar;
        this.f188547b = nerVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m205868b(int i, final List list, final AbstractC8802c abstractC8802c) {
        if (abstractC8802c.mo52343l() == i) {
            abstractC8802c.m52334c(new x20() { // from class: l.vdf
                @Override // p153l.x20
                public final void call() {
                    abstractC8802c.mo52354w(list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m205871e(TabLayout tabLayout, boolean z, String str, String str2) {
        View viewM112692a = cum.m112692a(tabLayout.getContext(), kec0.f125419G2, null);
        ((TextView) viewM112692a.findViewById(adc0.f69886Ed)).setText(str);
        TabLayout.Tab customView = tabLayout.newTab().setCustomView(viewM112692a);
        customView.setTag(str2);
        this.f188549d.add(customView);
        tabLayout.addTab(customView, z);
    }

    /* JADX INFO: renamed from: f */
    public void m205872f(List<AbstractC8802c> list) {
        m205875i(list);
    }

    /* JADX INFO: renamed from: g */
    public List<AbstractC8802c> m205873g() {
        if (jyb.m147479J(this.f188548c)) {
            m205872f(this.f188548c);
        }
        return this.f188548c;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC8802c m205874h(final Class<? extends AbstractC8802c> cls) {
        return (AbstractC8802c) jyb.m147529r(this.f188548c, new qcj() { // from class: l.udf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC8802c) obj).getClass().isAssignableFrom(cls));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m205875i(List<AbstractC8802c> list) {
        list.add(new C8801b(this.f188546a, this.f188547b));
        list.add(new rdf(this.f188546a, this.f188547b));
        list.add(new oef(this.f188546a, this.f188547b));
        list.add(new cef(this.f188546a, this.f188547b));
        list.add(new pdf(this.f188546a, this.f188547b));
        list.add(new xaf(this.f188546a, this.f188547b));
        list.add(new bff(this.f188546a, this.f188547b));
        gra.m131649Y1();
        list.add(new jbf(this.f188546a, this.f188547b));
        list.add(new cbf(this.f188546a, this.f188547b));
        list.add(new fef(this.f188546a, this.f188547b));
        list.add(xra.m212783b() ? new jaf(this.f188546a, this.f188547b) : new oaf(this.f188546a, this.f188547b));
        list.add(new zgf(this.f188546a, this.f188547b));
        list.add(new abf(this.f188546a, this.f188547b));
        list.add(new ief(this.f188546a, this.f188547b));
        list.add(new gaf(this.f188546a, this.f188547b));
    }

    /* JADX INFO: renamed from: j */
    public List<TabLayout.Tab> m205876j() {
        return this.f188549d;
    }

    /* JADX INFO: renamed from: k */
    public void m205877k(TabLayout tabLayout, List<AbstractC8802c> list, zyh0 zyh0Var) {
        List<AbstractC8802c> list2 = this.f188550e;
        if (list2 == null || !jyb.m147518l(list2, list, new rcj() { // from class: l.tdf
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((AbstractC8802c) obj) == ((AbstractC8802c) obj2));
            }
        })) {
            this.f188550e = list;
            int size = zyh0Var.m222121h() >= list.size() ? list.size() - 1 : zyh0Var.m222121h();
            this.f188549d.clear();
            tabLayout.removeAllTabs();
            int i = 0;
            while (i < list.size()) {
                String strMo52344m = list.get(i).mo52344m();
                String strMo52345n = list.get(i).mo52345n();
                if (!TextUtils.isEmpty(strMo52344m)) {
                    m205871e(tabLayout, i == 0, strMo52344m, strMo52345n);
                }
                i++;
            }
            if (size < this.f188549d.size()) {
                tabLayout.selectTab(this.f188549d.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m205878l(final List<Media> list, final int i) {
        jyb.m147537z(this.f188548c, new y20() { // from class: l.sdf
            @Override // p153l.y20
            public final void call(Object obj) {
                wdf.m205868b(i, list, (AbstractC8802c) obj);
            }
        });
    }
}
