package p149l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.newui.greet.p052ui.ImDiscoveryPager;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlDynamicGreetListAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class cno extends k2n<ano> implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: d */
    public VNavigationBar f81671d;

    /* JADX INFO: renamed from: e */
    public TabLayout f81672e;

    /* JADX INFO: renamed from: f */
    public ImDiscoveryPager f81673f;

    /* JADX INFO: renamed from: g */
    public final List<VText> f81674g;

    /* JADX INFO: renamed from: h */
    public final List<View> f81675h;

    /* JADX INFO: renamed from: i */
    public final List<VRecyclerView> f81676i;

    /* JADX INFO: renamed from: j */
    public final List<q9n> f81677j;

    public cno(IntlDynamicGreetListAct intlDynamicGreetListAct) {
        super(intlDynamicGreetListAct);
        this.f81674g = new ArrayList();
        this.f81675h = new ArrayList();
        this.f81676i = new ArrayList();
        this.f81677j = new ArrayList();
    }

    @Override // p149l.k2n
    /* JADX INFO: renamed from: b */
    public List<fxq> mo107810b() {
        return this.f81677j.get(((ano) this.f120750b).f70749b).m173645T();
    }

    @Override // p149l.k2n
    /* JADX INFO: renamed from: e */
    public void mo107811e() {
        this.f81677j.get(((ano) this.f120750b).f70749b).m173648Y();
    }

    @Override // p149l.k2n, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM107812j = m107812j(layoutInflater, viewGroup);
        m144322c(this.f81671d);
        return viewM107812j;
    }

    /* JADX INFO: renamed from: j */
    public View m107812j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eno.m117286b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m107813k(final int i) {
        View viewInflate = LayoutInflater.from(act()).inflate(l6c0.f126361P0, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(y4c0.f196218s4);
        View viewFindViewById = viewInflate.findViewById(y4c0.f196225t4);
        View viewFindViewById2 = viewInflate.findViewById(y4c0.f196159k1);
        vText.setText(((ano) this.f120750b).f70750c[i]);
        this.f81674g.add(vText);
        this.f81675h.add(viewFindViewById);
        TabLayout tabLayout = this.f81672e;
        tabLayout.addTab(tabLayout.newTab().setCustomView(viewInflate), i, i == ((ano) this.f120750b).f70749b);
        m107818q(i == ((ano) this.f120750b).f70749b, i);
        xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.bno
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76415a.m107814l(i, view);
            }
        });
        xdl0.m208344M(viewFindViewById2, ((ano) this.f120750b).f70752e[i]);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m107814l(int i, View view) {
        P p = this.f120750b;
        if (((ano) p).f70752e[i]) {
            ((ano) p).m97783P0(this.f120749a, mo107810b());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m107815m() {
        int currentItem = this.f81673f.getCurrentItem();
        P p = this.f120750b;
        if (currentItem != ((ano) p).f70749b) {
            this.f81673f.setCurrentItem(((ano) p).f70749b);
        }
        VRecyclerView vRecyclerView = this.f81676i.get(((ano) this.f120750b).f70749b);
        if (vRecyclerView.getAdapter() == null) {
            vRecyclerView.setAdapter(this.f81677j.get(((ano) this.f120750b).f70749b));
        }
        int i = ((ano) this.f120750b).f70749b;
        IntlDynamicGreetListAct intlDynamicGreetListAct = this.f120749a;
        if (i == 1) {
            zvf0.m220396r("e_intl_click_hi_sent_user", intlDynamicGreetListAct.pageId());
        } else {
            zvf0.m220396r("e_intl_click_hi_receive_user", intlDynamicGreetListAct.pageId());
        }
        m107818q(true, ((ano) this.f120750b).f70749b);
    }

    /* JADX INFO: renamed from: n */
    public void m107816n(int i, List<fxq> list) {
        this.f81677j.get(i).m173649b0(list);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        ((ano) this.f120750b).f70749b = tab.getPosition();
        m107815m();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        m107818q(false, tab.getPosition());
    }

    /* JADX INFO: renamed from: p */
    public void m107817p(Set<String> set) {
        List<fxq> listMo107810b = mo107810b();
        for (int i = 0; i < listMo107810b.size(); i++) {
            fxq fxqVar = listMo107810b.get(i);
            if (set.contains(fxqVar.m123668p())) {
                fxqVar.m123653M(0);
                mo107811e();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m107818q(boolean z, int i) {
        List<View> list = this.f81675h;
        if (z) {
            list.get(i).setBackgroundResource(a1c0.f67161o);
            this.f81674g.get(i).setTextColor(this.f120749a.getResources().getColor(a1c0.f67161o));
        } else {
            list.get(i).setBackgroundColor(Color.parseColor("#19979797"));
            this.f81674g.get(0).setTextColor(this.f120749a.getResources().getColor(a1c0.f67159m));
        }
    }

    @Override // p149l.k2n
    /* JADX INFO: renamed from: r */
    public void mo107819r() {
        for (int i = 0; i < ((ano) this.f120750b).f70750c.length; i++) {
            VRecyclerView vRecyclerView = new VRecyclerView(this.f120749a);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f120749a);
            linearLayoutManager.setOrientation(1);
            vRecyclerView.setLayoutManager(linearLayoutManager);
            this.f81677j.add(new q9n(this.f120749a, ((ano) this.f120750b).f70751d[i]));
            this.f81676i.add(vRecyclerView);
            m107813k(i);
        }
        this.f81672e.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        this.f81673f.setAdapter(new C16197a());
        this.f81673f.setScrollble(false);
        m107815m();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    /* JADX INFO: renamed from: l.cno$a */
    public class C16197a extends eb2 {
        public C16197a() {
        }

        @Override // p149l.w660
        public int getCount() {
            return ((ano) cno.this.f120750b).f70750c.length;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            VRecyclerView vRecyclerView = (VRecyclerView) cno.this.f81676i.get(i);
            viewGroup.addView(vRecyclerView, new ViewGroup.LayoutParams(-1, -1));
            return vRecyclerView;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        }
    }
}
