package p153l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.newui.greet.p057ui.ImDiscoveryPager;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlDynamicGreetListAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public class cpo extends k4n<apo> implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: d */
    public VNavigationBar f83006d;

    /* JADX INFO: renamed from: e */
    public TabLayout f83007e;

    /* JADX INFO: renamed from: f */
    public ImDiscoveryPager f83008f;

    /* JADX INFO: renamed from: g */
    public final List<VText> f83009g;

    /* JADX INFO: renamed from: h */
    public final List<View> f83010h;

    /* JADX INFO: renamed from: i */
    public final List<VRecyclerView> f83011i;

    /* JADX INFO: renamed from: j */
    public final List<qbn> f83012j;

    public cpo(IntlDynamicGreetListAct intlDynamicGreetListAct) {
        super(intlDynamicGreetListAct);
        this.f83009g = new ArrayList();
        this.f83010h = new ArrayList();
        this.f83011i = new ArrayList();
        this.f83012j = new ArrayList();
    }

    @Override // p153l.k4n
    /* JADX INFO: renamed from: b */
    public List<fzq> mo111816b() {
        return this.f83012j.get(((apo) this.f123902b).f72734b).m176052T();
    }

    @Override // p153l.k4n
    /* JADX INFO: renamed from: e */
    public void mo111817e() {
        this.f83012j.get(((apo) this.f123902b).f72734b).m176055Y();
    }

    @Override // p153l.k4n, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM111818j = m111818j(layoutInflater, viewGroup);
        m148269c(this.f83006d);
        return viewM111818j;
    }

    /* JADX INFO: renamed from: j */
    public View m111818j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return epo.m121868b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m111819k(final int i) {
        View viewInflate = LayoutInflater.from(act()).inflate(qec0.f156917P0, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(edc0.f93453s4);
        View viewFindViewById = viewInflate.findViewById(edc0.f93460t4);
        View viewFindViewById2 = viewInflate.findViewById(edc0.f93394k1);
        vText.setText(((apo) this.f123902b).f72735c[i]);
        this.f83009g.add(vText);
        this.f83010h.add(viewFindViewById);
        TabLayout tabLayout = this.f83007e;
        tabLayout.addTab(tabLayout.newTab().setCustomView(viewInflate), i, i == ((apo) this.f123902b).f72734b);
        m111824q(i == ((apo) this.f123902b).f72734b, i);
        bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.bpo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77793a.m111820l(i, view);
            }
        });
        bnl0.m105524M(viewFindViewById2, ((apo) this.f123902b).f72737e[i]);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m111820l(int i, View view) {
        P p = this.f123902b;
        if (((apo) p).f72737e[i]) {
            ((apo) p).m99347P0(this.f123901a, mo111816b());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m111821m() {
        int currentItem = this.f83008f.getCurrentItem();
        P p = this.f123902b;
        if (currentItem != ((apo) p).f72734b) {
            this.f83008f.setCurrentItem(((apo) p).f72734b);
        }
        VRecyclerView vRecyclerView = this.f83011i.get(((apo) this.f123902b).f72734b);
        if (vRecyclerView.getAdapter() == null) {
            vRecyclerView.setAdapter(this.f83012j.get(((apo) this.f123902b).f72734b));
        }
        int i = ((apo) this.f123902b).f72734b;
        IntlDynamicGreetListAct intlDynamicGreetListAct = this.f123901a;
        if (i == 1) {
            i4g0.m138520r("e_intl_click_hi_sent_user", intlDynamicGreetListAct.pageId());
        } else {
            i4g0.m138520r("e_intl_click_hi_receive_user", intlDynamicGreetListAct.pageId());
        }
        m111824q(true, ((apo) this.f123902b).f72734b);
    }

    /* JADX INFO: renamed from: n */
    public void m111822n(int i, List<fzq> list) {
        this.f83012j.get(i).m176056b0(list);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        ((apo) this.f123902b).f72734b = tab.getPosition();
        m111821m();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        m111824q(false, tab.getPosition());
    }

    /* JADX INFO: renamed from: p */
    public void m111823p(Set<String> set) {
        List<fzq> listMo111816b = mo111816b();
        for (int i = 0; i < listMo111816b.size(); i++) {
            fzq fzqVar = listMo111816b.get(i);
            if (set.contains(fzqVar.m128224p())) {
                fzqVar.m128209M(0);
                mo111817e();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m111824q(boolean z, int i) {
        List<View> list = this.f83010h;
        if (z) {
            list.get(i).setBackgroundResource(g9c0.f102825o);
            this.f83009g.get(i).setTextColor(this.f123901a.getResources().getColor(g9c0.f102825o));
        } else {
            list.get(i).setBackgroundColor(Color.parseColor("#19979797"));
            this.f83009g.get(0).setTextColor(this.f123901a.getResources().getColor(g9c0.f102823m));
        }
    }

    @Override // p153l.k4n
    /* JADX INFO: renamed from: r */
    public void mo111825r() {
        for (int i = 0; i < ((apo) this.f123902b).f72735c.length; i++) {
            VRecyclerView vRecyclerView = new VRecyclerView(this.f123901a);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f123901a);
            linearLayoutManager.setOrientation(1);
            vRecyclerView.setLayoutManager(linearLayoutManager);
            this.f83012j.add(new qbn(this.f123901a, ((apo) this.f123902b).f72736d[i]));
            this.f83011i.add(vRecyclerView);
            m111819k(i);
        }
        this.f83007e.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        this.f83008f.setAdapter(new C16331a());
        this.f83008f.setScrollble(false);
        m111821m();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    /* JADX INFO: renamed from: l.cpo$a */
    public class C16331a extends lb2 {
        public C16331a() {
        }

        @Override // p153l.cf60
        public int getCount() {
            return ((apo) cpo.this.f123902b).f72735c.length;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            VRecyclerView vRecyclerView = (VRecyclerView) cpo.this.f83011i.get(i);
            viewGroup.addView(vRecyclerView, new ViewGroup.LayoutParams(-1, -1));
            return vRecyclerView;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        }
    }
}
