package p009l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.newui.greet.p001ui.ImDiscoveryPager;
import com.p1.mobile.putong.core.ui.intl.greet.message.IntlDynamicGreetListAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l.a1c0;
import l.ano;
import l.eb2;
import l.eno;
import l.k2n;
import l.l6c0;
import l.q9n;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import v.VRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cno extends k2n<ano> implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: d */
    public VNavigationBar f10704d;

    /* JADX INFO: renamed from: e */
    public TabLayout f10705e;

    /* JADX INFO: renamed from: f */
    public ImDiscoveryPager f10706f;

    /* JADX INFO: renamed from: g */
    public final List<VText> f10707g;

    /* JADX INFO: renamed from: h */
    public final List<View> f10708h;

    /* JADX INFO: renamed from: i */
    public final List<VRecyclerView> f10709i;

    /* JADX INFO: renamed from: j */
    public final List<q9n> f10710j;

    public cno(IntlDynamicGreetListAct intlDynamicGreetListAct) {
        super(intlDynamicGreetListAct);
        this.f10707g = new ArrayList();
        this.f10708h = new ArrayList();
        this.f10709i = new ArrayList();
        this.f10710j = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public List<fxq> m12733b() {
        return this.f10710j.get(((k2n) this).b.b).T();
    }

    /* JADX INFO: renamed from: e */
    public void m12734e() {
        this.f10710j.get(((k2n) this).b.b).Y();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM12735j = m12735j(layoutInflater, viewGroup);
        c(this.f10704d);
        return viewM12735j;
    }

    /* JADX INFO: renamed from: j */
    public View m12735j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eno.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m12736k(final int i) {
        View viewInflate = LayoutInflater.from(act()).inflate(l6c0.P0, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(y4c0.s4);
        View viewFindViewById = viewInflate.findViewById(y4c0.t4);
        View viewFindViewById2 = viewInflate.findViewById(y4c0.k1);
        vTextFindViewById.setText(((k2n) this).b.c[i]);
        this.f10707g.add(vTextFindViewById);
        this.f10708h.add(viewFindViewById);
        TabLayout tabLayout = this.f10705e;
        tabLayout.addTab(tabLayout.newTab().setCustomView(viewInflate), i, i == ((k2n) this).b.b);
        m12741q(i == ((k2n) this).b.b, i);
        xdl0.E0(viewFindViewById2, new View.OnClickListener() { // from class: l.bno
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10210a.m12737l(i, view);
            }
        });
        xdl0.M(viewFindViewById2, ((k2n) this).b.e[i]);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m12737l(int i, View view) {
        ano anoVar = ((k2n) this).b;
        if (anoVar.e[i]) {
            anoVar.P0(((k2n) this).a, m12733b());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m12738m() {
        int currentItem = this.f10706f.getCurrentItem();
        ano anoVar = ((k2n) this).b;
        if (currentItem != anoVar.b) {
            this.f10706f.setCurrentItem(anoVar.b);
        }
        VRecyclerView vRecyclerView = this.f10709i.get(((k2n) this).b.b);
        if (vRecyclerView.getAdapter() == null) {
            vRecyclerView.setAdapter(this.f10710j.get(((k2n) this).b.b));
        }
        int i = ((k2n) this).b.b;
        IntlDynamicGreetListAct intlDynamicGreetListAct = ((k2n) this).a;
        if (i == 1) {
            zvf0.r("e_intl_click_hi_sent_user", intlDynamicGreetListAct.pageId());
        } else {
            zvf0.r("e_intl_click_hi_receive_user", intlDynamicGreetListAct.pageId());
        }
        m12741q(true, ((k2n) this).b.b);
    }

    /* JADX INFO: renamed from: n */
    public void m12739n(int i, List<fxq> list) {
        this.f10710j.get(i).b0(list);
    }

    public void onTabSelected(TabLayout.Tab tab) {
        ((k2n) this).b.b = tab.getPosition();
        m12738m();
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        m12741q(false, tab.getPosition());
    }

    /* JADX INFO: renamed from: p */
    public void m12740p(Set<String> set) {
        List<fxq> listM12733b = m12733b();
        for (int i = 0; i < listM12733b.size(); i++) {
            fxq fxqVar = listM12733b.get(i);
            if (set.contains(fxqVar.m14621p())) {
                fxqVar.m14606M(0);
                m12734e();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m12741q(boolean z, int i) {
        List<View> list = this.f10708h;
        if (z) {
            list.get(i).setBackgroundResource(a1c0.o);
            this.f10707g.get(i).setTextColor(((k2n) this).a.getResources().getColor(a1c0.o));
        } else {
            list.get(i).setBackgroundColor(Color.parseColor("#19979797"));
            this.f10707g.get(0).setTextColor(((k2n) this).a.getResources().getColor(a1c0.m));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m12742r() {
        for (int i = 0; i < ((k2n) this).b.c.length; i++) {
            VRecyclerView vRecyclerView = new VRecyclerView(((k2n) this).a);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(((k2n) this).a);
            linearLayoutManager.setOrientation(1);
            vRecyclerView.setLayoutManager(linearLayoutManager);
            this.f10710j.add(new q9n(((k2n) this).a, ((k2n) this).b.d[i]));
            this.f10709i.add(vRecyclerView);
            m12736k(i);
        }
        this.f10705e.addOnTabSelectedListener(this);
        this.f10706f.setAdapter(new C0824a());
        this.f10706f.setScrollble(false);
        m12738m();
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    /* JADX INFO: renamed from: l.cno$a */
    public class C0824a extends eb2 {
        public C0824a() {
        }

        public int getCount() {
            return ((k2n) cno.this).b.c.length;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: p */
        public Object m12744p(ViewGroup viewGroup, int i) {
            VRecyclerView vRecyclerView = (VRecyclerView) cno.this.f10709i.get(i);
            viewGroup.addView((View) vRecyclerView, new ViewGroup.LayoutParams(-1, -1));
            return vRecyclerView;
        }

        /* JADX INFO: renamed from: o */
        public void m12743o(ViewGroup viewGroup, int i, Object obj) {
        }
    }
}
