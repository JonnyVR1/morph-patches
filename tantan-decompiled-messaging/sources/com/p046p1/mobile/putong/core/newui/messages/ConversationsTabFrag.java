package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.CityCentreConfig;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p046p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p147v.VPager;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.f30;
import p149l.f6c0;
import p149l.hu40;
import p149l.j760;
import p149l.jo0;
import p149l.l9b;
import p149l.mkd0;
import p149l.mqi0;
import p149l.q860;
import p149l.qib0;
import p149l.r65;
import p149l.r6n;
import p149l.roj0;
import p149l.s5c0;
import p149l.s7m;
import p149l.t100;
import p149l.u4c0;
import p149l.u59;
import p149l.upa;
import p149l.v9j;
import p149l.vwb;
import p149l.vy8;
import p149l.w0c0;
import p149l.w9j;
import p149l.ws6;
import p149l.x2c0;
import p149l.x9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y19;
import p149l.yni;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationsTabFrag extends NewMainContextFrag implements s7m<ws6> {

    /* JADX INFO: renamed from: H0 */
    public static String f25191H0 = "conversationsTabSearch";

    /* JADX INFO: renamed from: B */
    public FrameLayout f25192B;

    /* JADX INFO: renamed from: C */
    public VPager f25193C;

    /* JADX INFO: renamed from: D */
    public C8133c f25194D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public ConversationsList f25195E;

    /* JADX INFO: renamed from: G */
    public ConversationListFrag f25199G;

    /* JADX INFO: renamed from: H */
    public WhisperListFrag f25201H;

    /* JADX INFO: renamed from: I */
    public View f25202I;

    /* JADX INFO: renamed from: J */
    public SearchView f25203J;

    /* JADX INFO: renamed from: K */
    public View f25204K;

    /* JADX INFO: renamed from: L */
    public View f25205L;

    /* JADX INFO: renamed from: N */
    public c4g0 f25207N;

    /* JADX INFO: renamed from: O */
    public Menu f25208O;

    /* JADX INFO: renamed from: P */
    public ws6 f25209P;

    /* JADX INFO: renamed from: W */
    public ConversationLeftToolBar f25216W;

    /* JADX INFO: renamed from: X */
    public ConversationRightToolBar f25217X;

    /* JADX INFO: renamed from: F */
    public List<PutongFrag> f25197F = new ArrayList();

    /* JADX INFO: renamed from: M */
    public int f25206M = 0;

    /* JADX INFO: renamed from: Q */
    public e30 f25210Q = new e30() { // from class: l.nr6
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f140159a.m41619N5(obj);
        }
    };

    /* JADX INFO: renamed from: R */
    public boolean f25211R = false;

    /* JADX INFO: renamed from: S */
    public long f25212S = 0;

    /* JADX INFO: renamed from: T */
    public boolean f25213T = false;

    /* JADX INFO: renamed from: U */
    public boolean f25214U = false;

    /* JADX INFO: renamed from: V */
    public double f25215V = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: Y */
    public boolean f25218Y = false;

    /* JADX INFO: renamed from: Z */
    public C22392a<roj0> f25219Z = C22392a.m221513c(roj0.f160388a);

    /* JADX INFO: renamed from: k0 */
    public int f25220k0 = t100.m186890d(44.0f);

    /* JADX INFO: renamed from: p0 */
    public final Runnable f25221p0 = new Runnable() { // from class: l.tr6
        @Override // java.lang.Runnable
        public final void run() {
            this.f171790a.m41620O5();
        }
    };

    /* JADX INFO: renamed from: E0 */
    public final String f25196E0 = "all_match_pop_window_key";

    /* JADX INFO: renamed from: F0 */
    public long f25198F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public String f25200G0 = "";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag$a */
    public class C8131a implements ViewPager.InterfaceC0716j {
        public C8131a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            ConversationsTabFrag.this.m41632a6(i);
            ConversationsTabFrag.this.f25206M = i;
            ConversationsTabFrag conversationsTabFrag = ConversationsTabFrag.this;
            conversationsTabFrag.m41638f6(conversationsTabFrag.f25206M, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag$b */
    public class C8132b implements SearchView.InterfaceC0150m {
        public C8132b() {
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: a */
        public boolean mo600a(String str) {
            ConversationsTabFrag.this.m41636d6(str);
            xdl0.m208344M(ConversationsTabFrag.this.f25204K, !TextUtils.isEmpty(str));
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: b */
        public boolean mo601b(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag$c */
    public class C8133c extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f25224a;

        public C8133c(FragmentManager fragmentManager, int i) {
            super(fragmentManager, i);
            this.f25224a = new ArrayList();
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f25224a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return this.f25224a.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            return (PutongFrag) super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: k */
        public void m41650k(FragmentManager fragmentManager) {
            Iterator<PutongFrag> it = this.f25224a.iterator();
            while (it.hasNext()) {
                fragmentManager.m2567m().mo2715r(it.next()).mo2708j();
            }
        }

        /* JADX INFO: renamed from: l */
        public void m41651l(List<PutongFrag> list) {
            this.f25224a.clear();
            if (NullChecker.m81303a(list)) {
                this.f25224a.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    public ConversationsTabFrag() {
        m41576D5();
    }

    /* JADX INFO: renamed from: B5 */
    public static ConversationsTabFrag m41575B5(int i) {
        if (i < 0) {
            i = 0;
        }
        ConversationsTabFrag conversationsTabFrag = new ConversationsTabFrag();
        Bundle bundle = new Bundle();
        bundle.putInt("init_conversation_tab_index", i);
        conversationsTabFrag.setArguments(bundle);
        return conversationsTabFrag;
    }

    /* JADX INFO: renamed from: D5 */
    private void m41576D5() {
        new ws6(this).mo51532C(this);
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m41586e5(Throwable th) {
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ User m41587f5(User user, C4319c c4319c) {
        return user;
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m41594m5(C4319c c4319c) {
        if (CoreModule.f17545c.f19642f0.f19960n2.size() > 0) {
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            c4740g.m32805Sn(c4740g.f19960n2);
        }
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ Boolean m41597p5(q860 q860Var) {
        long jLongValue = CoreModule.f17545c.f19639e0.f149237O6.get().longValue();
        if (jLongValue == 0) {
            double dMax = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (q860Var != null && !vwb.m200296J(q860Var.f153135a)) {
                Iterator it = q860Var.f153135a.iterator();
                while (it.hasNext()) {
                    dMax = Math.max(dMax, ((Conversation) it.next()).latestTime);
                }
            }
            CoreModule.f17545c.f19639e0.f149237O6.put(Long.valueOf((long) dMax));
            return Boolean.FALSE;
        }
        if (q860Var == null || vwb.m200296J(q860Var.f153135a)) {
            return Boolean.FALSE;
        }
        double d = jLongValue;
        for (T t : q860Var.f153135a) {
            if (t.unreadMessages > 0 && t.latestTime > d) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: z5 */
    private void m41607z5() {
        if (upa.m194717Y0().function_switch) {
            m29640L4().filter(new w9j() { // from class: l.fr6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f98894a.m41615J5((Boolean) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.gr6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104031a.m41616K5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A5 */
    public void m41608A5() {
        if (NullChecker.m81303a(this.f25217X)) {
            this.f25217X.m41271e();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> mo29633C4() {
        return this.f25209P.m205383C0(super.mo29633C4());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C5, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ws6 ws6Var) {
        this.f25209P = ws6Var;
    }

    /* JADX INFO: renamed from: E5 */
    public void m41610E5() {
        C4348d.m20896l().m20900k("love_letter_remaining");
        C4348d.m20896l().m20900k("love_letter_reply");
    }

    /* JADX INFO: renamed from: F5 */
    public final void m41611F5(int i) {
        if (this.f25194D.getCount() <= i || i >= 0) {
            return;
        }
        if (NullChecker.m81303a(this.f25199G.f24974G)) {
            this.f25199G.f24974G.mo95353g();
        }
        this.f25199G.getClass();
        if (NullChecker.m81303a(null)) {
            this.f25199G.getClass();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX INFO: renamed from: G5 */
    public j760<String, String> m41612G5() {
        String str;
        if (NullChecker.m81303a(this.f25194D)) {
            Fragment item = this.f25194D.getItem(this.f25206M);
            if (item instanceof ConversationListFrag) {
                str = ((ConversationListFrag) item).m41103m5() ? "all_matches" : "chat";
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        return vwb.m200311Y(pageId(), str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: H4 */
    public void mo29636H4() {
        if (this.f25194D.f25224a.get(this.f25206M) instanceof ConversationListFrag) {
            ((ConversationListFrag) this.f25194D.f25224a.get(this.f25206M)).m41106v5();
        }
    }

    /* JADX INFO: renamed from: H5 */
    public final void m41613H5() {
        if (this.f25201H == null) {
            return;
        }
        ConversationLeftToolBar conversationLeftToolBar = (ConversationLeftToolBar) LayoutInflater.from(act()).inflate(f6c0.f96012t7, (ViewGroup) this.f25192B, false);
        this.f25216W = conversationLeftToolBar;
        xdl0.m208344M(conversationLeftToolBar.f24958d, false);
        this.f25216W.setWhisperTabPosition(this.f25197F.indexOf(this.f25201H));
        this.f25216W.setIntlTabTextSize(19);
        this.f25216W.m41064f();
        this.f25216W.m41063e(this, new f30() { // from class: l.wr6
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f187767a.m41617L5((Integer) obj, (Boolean) obj2);
            }
        });
        Toolbar toolbar = act().toolbar();
        if (toolbar != null) {
            try {
                TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(toolbar);
                if (NullChecker.m81303a(textView)) {
                    textView.setVisibility(8);
                }
            } catch (Exception unused) {
            }
            if (this.f25216W.getParent() != null) {
                ((ViewGroup) this.f25216W.getParent()).removeView(this.f25216W);
            }
            Toolbar.C0159e c0159e = new Toolbar.C0159e(-2, -1);
            c0159e.f110601a = 8388627;
            toolbar.addView(this.f25216W, c0159e);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.height = this.f25220k0;
            layoutParams.gravity = 8388611;
            this.f25192B.addView(this.f25216W, layoutParams);
            xdl0.m208362Z(this.f25193C, this.f25216W);
        }
        m41614I5();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: I4 */
    public void mo29637I4() {
        if (this.f25194D.f25224a.get(this.f25206M) instanceof ConversationListFrag) {
            ((PutongFrag) this.f25194D.f25224a.get(this.f25206M)).mo29637I4();
        }
    }

    /* JADX INFO: renamed from: I5 */
    public final void m41614I5() {
        if (this.f25216W == null) {
            return;
        }
        final int iIndexOf = this.f25197F.indexOf(this.f25201H);
        duringCreated(CoreModule.f17545c.f19642f0.m33106rh().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.hr6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationsTabFrag.m41597p5((q860) obj);
            }
        }).distinctUntilChanged().observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.ir6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114588a.m41618M5(iIndexOf, (Boolean) obj);
            }
        }, new e30() { // from class: l.jr6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsTabFrag.m41586e5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ Boolean m41615J5(Boolean bool) {
        return Boolean.valueOf(NullChecker.m81303a(this.f25199G));
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m41616K5(Boolean bool) {
        this.f25199G.f24970C = bool.booleanValue();
        if (this.f25199G.f24970C) {
            CoreModule.f17545c.f19642f0.f19916Z.m132487l("message_tab_hide_to_show_refresh");
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m41617L5(Integer num, Boolean bool) {
        if (num.intValue() < 0 || num.intValue() >= this.f25197F.size()) {
            return;
        }
        m41638f6(num.intValue(), true);
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ void m41618M5(int i, Boolean bool) {
        CoreModule.f17545c.f19642f0.f19972r2.m132487l(bool);
        if (this.f25206M == i || !NullChecker.m81303a(this.f25216W)) {
            return;
        }
        this.f25216W.m41070l(bool.booleanValue());
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m41619N5(Object obj) {
        this.f25211R = true;
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ void m41620O5() {
        CoreModule.f17545c.f19642f0.m32869Yf(this);
        CoreModule.f17545c.f19642f0.m32881Zf(this);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ C22306c m41621P5(final List list) {
        return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9(), lifecycle(), new x9j() { // from class: l.lr6
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ConversationsTabFrag.m41587f5((User) obj, (C4319c) obj2);
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.mr6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf((CoreModule.f17545c.f19639e0.f149472t0.get().booleanValue() || ((User) obj).isVIP()) ? 10 : CoreModule.f17545c.f19642f0.m32987ie(list));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m41622Q5(Menu menu, Integer num) {
        boolean z = false;
        if (num.intValue() < 10 && !CoreModule.f17545c.f19639e0.f149472t0.get().booleanValue() && !CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            MenuItem menuItemFindItem = menu.findItem(u4c0.f174346l8);
            if (NullChecker.m81303a(menuItemFindItem)) {
                menuItemFindItem.setVisible(false);
                return;
            }
            return;
        }
        if (this.f25206M == 1) {
            zvf0.m220402x("e_search_button", OMSDialogPositon.p_messages_view);
        }
        if (!CoreModule.f17545c.f19639e0.f149472t0.get().booleanValue()) {
            CoreModule.f17545c.f19639e0.f149472t0.put(Boolean.TRUE);
        }
        MenuItem menuItemFindItem2 = menu.findItem(u4c0.f174346l8);
        if (NullChecker.m81303a(menuItemFindItem2)) {
            if (NullChecker.m81303a(this.f25201H) && this.f25206M == this.f25197F.indexOf(this.f25201H)) {
                z = true;
            }
            menuItemFindItem2.setVisible(!z);
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m41623R5(NewMainAct newMainAct, View view) {
        zvf0.m220396r("e_search_button", OMSDialogPositon.p_messages_view);
        if (CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            m41637e6(false);
        } else {
            this.f25203J.setIconified(true);
            C8764c.m53403J1(newMainAct, "p_messages_view,e_search_button,click", Privilege.vip_membership_search_gp);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag
    /* JADX INFO: renamed from: S4 */
    public void mo39936S4() {
        super.mo39936S4();
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ boolean m41624S5() {
        m41637e6(true);
        return false;
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m41625T5() {
        if (this.f25203J.isIconified() || TextUtils.isEmpty(this.f25200G0)) {
            return;
        }
        this.f25195E.setVisibility(0);
        m41644l6(false);
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m41626U5() {
        if (NullChecker.m81303a(this.f25203J)) {
            this.f25203J.setIconified(true);
        }
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m41627V5() {
        m20593m4(new Runnable() { // from class: l.sr6
            @Override // java.lang.Runnable
            public final void run() {
                this.f166048a.m41626U5();
            }
        }, 300);
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m41628W5() {
        m39932O4().m40476a(Boolean.TRUE, f25191H0);
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ boolean m41629X5(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.m81303a(this.f25203J)) {
            this.f25203J.setIconified(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ Boolean m41630Y5(roj0 roj0Var) {
        return Boolean.valueOf(this.f25193C != null);
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ void m41631Z5(roj0 roj0Var) {
        act().removeCallbacks(this.f25221p0);
        act().postDelayed(this.f25221p0, 400L);
    }

    /* JADX INFO: renamed from: a6 */
    public final void m41632a6(int i) {
        m41611F5(i);
        if (upa.m194726a2() && !isHidden()) {
            CoreModule.f17545c.f19642f0.m32996io(i);
            act().removeCallbacks(this.f25221p0);
            act().postDelayed(this.f25221p0, 400L);
        }
    }

    /* JADX INFO: renamed from: b6 */
    public void m41633b6() {
        if (NullChecker.m81303a(this.f25217X.getAllMatchView()) && !CoreModule.f17545c.f19642f0.f19953l1.get().booleanValue()) {
            C4345a c4345a = new C4345a(act());
            c4345a.m20847B(t100.m186890d(2.0f)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20881w(t100.f167258g).m20882x(-t100.f167254c).m20855J(13.0f).m20864e(true).m20858M(true).m20859N(new C4345a.d() { // from class: l.rr6
                @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
                /* JADX INFO: renamed from: a */
                public final void mo20887a(View view) {
                    CoreModule.f17545c.f19642f0.f19953l1.put(Boolean.TRUE);
                }
            }).m20883y(true).m20861b(3000L).m20849D("在这里查看所有配对").m20875q(C4345a.f15680N | C4345a.f15684R);
            C4348d.m20896l().m20909u(c4345a, this.f25217X.getAllMatchView().findViewById(u4c0.f174260g6), "all_match_pop_window_key");
        }
        if (y19.m212154N()) {
            m41610E5();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public int m41634c0() {
        return NullChecker.m81303a(this.f25193C) ? this.f25193C.getCurrentItem() : this.f25206M;
    }

    /* JADX INFO: renamed from: c6 */
    public boolean m41635c6() {
        if (!NullChecker.m81303a(this.f25203J) || this.f25203J.isIconified()) {
            return false;
        }
        this.f25203J.setQuery("", true);
        this.f25203J.setIconified(true);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f25214U = !mqi0.m155928C(mqi0.m155944o(), CoreModule.f17545c.f19642f0.f19974s1.get().longValue());
    }

    /* JADX INFO: renamed from: d6 */
    public void m41636d6(String str) {
        if (this.f25195E == null) {
            ConversationsList conversationsList = (ConversationsList) act().inflater().inflate(f6c0.f95816he, (ViewGroup) this.f25192B, false);
            this.f25195E = conversationsList;
            conversationsList.m41472p1(true);
            this.f25195E.f25099S.setBackgroundResource(w0c0.f183834b2);
            this.f25195E.f25105V.setCrashLogFlag("ConversationSearchList");
            this.f25195E.m41487w2();
            this.f25192B.addView(this.f25195E);
            xdl0.m208344M(this.f25195E, false);
            xdl0.m208362Z(this.f25195E);
            xdl0.m208361Y(t100.m186890d(44.0f), this.f25195E);
        }
        this.f25200G0 = str;
        if (str != null && !str.equals("")) {
            this.f25195E.m41488x1(str, new d30() { // from class: l.or6
                @Override // p149l.d30
                public final void call() {
                    this.f145235a.m41625T5();
                }
            }, new d30() { // from class: l.pr6
                @Override // p149l.d30
                public final void call() {
                    this.f150857a.m41627V5();
                }
            });
            return;
        }
        if (!this.f25203J.isIconified()) {
            m41644l6(true);
        }
        this.f25195E.setVisibility(8);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e6 */
    public final void m41637e6(boolean z) {
        NewMainAct newMainAct = (NewMainAct) act();
        if (z) {
            newMainAct.getSupportActionBar().mo134136w(false);
            newMainAct.getSupportActionBar().mo134138y(false);
            m41644l6(false);
            if (NullChecker.m81303a(this.f25195E)) {
                this.f25195E.setVisibility(8);
            }
            e51.m114744I(this, new Runnable() { // from class: l.kr6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124323a.m41628W5();
                }
            }, 300L);
            this.f25205L.setEnabled(false);
            return;
        }
        this.f25205L.setEnabled(true);
        m39932O4().m40476a(Boolean.FALSE, f25191H0);
        newMainAct.getSupportActionBar().mo134136w(true);
        newMainAct.getSupportActionBar().mo134138y(true);
        act().getSupportActionBar().mo134113C(newMainAct.getAppTheme().mo103044c());
        this.f25203J.requestFocus();
        m41644l6(true);
        this.f25204K.setVisibility(8);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m41645m6();
        if (act() instanceof NewMainAct) {
            upa.m194624D2();
        }
        m41607z5();
        lifecycle().filter(new w9j() { // from class: l.ur6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15550k);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.vr6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsTabFrag.m41594m5((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f6 */
    public final void m41638f6(int i, boolean z) {
        if (i < 0) {
            return;
        }
        this.f25206M = i;
        boolean z2 = NullChecker.m81303a(this.f25201H) && i == this.f25197F.indexOf(this.f25201H);
        if (z2) {
            CoreModule.f17545c.f19639e0.f149237O6.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19642f0.f19972r2.m132487l(Boolean.FALSE);
            if (NullChecker.m81303a(this.f25216W)) {
                this.f25216W.m41070l(false);
            }
            this.f25201H.m42359u5();
            CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
        }
        m41648p6(z2);
        if (NullChecker.m81303a(this.f25193C) && this.f25193C.getCurrentItem() != i) {
            this.f25193C.m4176T(i, z);
        }
        if (NullChecker.m81303a(this.f25216W)) {
            this.f25216W.m41069k(i);
        }
        m41647o6();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f25194D = new C8133c(getChildFragmentManager(), 1);
        ConversationListFrag conversationListFragM41092i5 = ConversationListFrag.m41092i5(true);
        this.f25199G = conversationListFragM41092i5;
        this.f25197F.add(conversationListFragM41092i5);
        WhisperListFrag whisperListFragM42346i5 = WhisperListFrag.m42346i5();
        this.f25201H = whisperListFragM42346i5;
        this.f25197F.add(whisperListFragM42346i5);
        this.f25193C.setAdapter(this.f25194D);
        this.f25194D.m41651l(this.f25197F);
        this.f25193C.setScrollble(false);
        this.f25193C.m4185d(new C8131a());
        if (NullChecker.m81303a(getArguments()) && getArguments().containsKey("init_conversation_tab_index")) {
            this.f25193C.setCurrentItem(getArguments().getInt("init_conversation_tab_index", 0));
        }
        r6n.m178067f().f157963k.put("");
        m41613H5();
    }

    /* JADX INFO: renamed from: g6 */
    public final void m41639g6() {
        act().setTitle("", false);
    }

    /* JADX INFO: renamed from: h6 */
    public void m41640h6(boolean z) {
        if (NullChecker.m81303a(this.f25217X)) {
            this.f25217X.m41274h(z);
        }
    }

    /* JADX INFO: renamed from: i6 */
    public void m41641i6(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (NullChecker.m81303a(this.f25217X)) {
            this.f25217X.m41275i(m41634c0(), loveLetterEntryInfo);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LaunchStep launchStep = LaunchStep.MsgDoubleTabInflate;
        yni.m215417f(launchStep);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f25192B = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        yni.m215415d(launchStep);
        LaunchStep launchStep2 = LaunchStep.MsgSearchInflate;
        yni.m215417f(launchStep2);
        VPager vPager = new VPager(getContext());
        this.f25193C = vPager;
        vPager.setId(u4c0.f174364m9);
        this.f25192B.addView(this.f25193C, new FrameLayout.LayoutParams(-1, -1));
        yni.m215415d(launchStep2);
        View view = new View(act());
        this.f25202I = view;
        view.setBackgroundColor(Color.parseColor("#7fffffff"));
        this.f25192B.addView(this.f25202I);
        xdl0.m208344M(this.f25202I, false);
        CoreBusinessModule.m29908m0().mo190520g(this);
        return this.f25192B;
    }

    /* JADX INFO: renamed from: j6 */
    public void m41642j6(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (NullChecker.m81303a(this.f25217X)) {
            this.f25217X.m41276j(loveLetterEntryInfo);
        }
    }

    /* JADX INFO: renamed from: k6 */
    public void m41643k6() {
        if (NullChecker.m81303a(this.f25217X)) {
            this.f25217X.m41277k();
        }
    }

    /* JADX INFO: renamed from: l6 */
    public void m41644l6(boolean z) {
        View view = this.f25202I;
        if (z) {
            view.setVisibility(0);
            this.f25202I.setOnTouchListener(new View.OnTouchListener() { // from class: l.qr6
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f155967a.m41629X5(view2, motionEvent);
                }
            });
        } else {
            view.setVisibility(4);
            this.f25202I.setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final void m41645m6() {
        if (upa.m194726a2()) {
            duringCreated(CoreModule.f17545c.f19642f0.m33180xe()).filter(new w9j() { // from class: l.dr6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f87586a.m41630Y5((roj0) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.er6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92885a.m41631Z5((roj0) obj);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        setHasOptionsMenu(true);
        act().getSupportActionBar().mo134136w(false);
        act().getSupportActionBar().mo134138y(false);
        m41639g6();
        CoreBusinessModule.m29908m0().mo190517d(this);
    }

    /* JADX INFO: renamed from: n6 */
    public void m41646n6() {
        if (r65.m178035m()) {
            CityCentreConfig cityCentreConfigM212174i = y19.m212174i();
            double dM155944o = (mqi0.m155944o() - CoreModule.f17545c.f19650h2.f118814R) / 1000.0d;
            if (!NullChecker.m81303a(cityCentreConfigM212174i) || dM155944o <= cityCentreConfigM212174i.refresh_interval_seconds) {
                return;
            }
            if (r65.m178035m()) {
                CoreModule.f17545c.f19650h2.m142353T3();
            }
            if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
                return;
            }
            r65.m178034l().m178041o();
        }
    }

    /* JADX INFO: renamed from: o6 */
    public void m41647o6() {
        if (NullChecker.m81303a(this.f25217X)) {
            this.f25217X.m41278l(this.f25206M == this.f25197F.indexOf(this.f25199G));
        }
    }

    @Override // com.p046p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25209P.mo39469Z();
        this.f25209P.mo39470a0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NonNull final Menu menu, @NonNull MenuInflater menuInflater) {
        this.f25208O = menu;
        final NewMainAct newMainAct = (NewMainAct) act();
        xaj0<SearchView, View, View> xaj0VarInitSearchMenu = newMainAct.initSearchMenu(menu, menuInflater);
        if (xaj0VarInitSearchMenu == null) {
            return;
        }
        act().toolbar().setContentInsetsRelative(0, act().toolbar().getContentInsetRight());
        SearchView searchView = xaj0VarInitSearchMenu.f191751a;
        this.f25203J = searchView;
        this.f25204K = xaj0VarInitSearchMenu.f191752b;
        this.f25205L = xaj0VarInitSearchMenu.f191753c;
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: l.xr6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194091a.m41623R5(newMainAct, view);
            }
        });
        this.f25203J.setOnQueryTextListener(new C8132b());
        this.f25203J.setOnCloseListener(new SearchView.InterfaceC0149l() { // from class: l.yr6
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0149l
            public final boolean onClose() {
                return this.f199638a.m41624S5();
            }
        });
        final ArrayList arrayList = new ArrayList();
        arrayList.add(User.ID_TEAM_ACCOUNT);
        if (NullChecker.m81303a(this.f25207N)) {
            mkd0.m154992z(this.f25207N);
        }
        this.f25207N = act().duringCreated(new v9j() { // from class: l.zr6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f204457a.m41621P5(arrayList);
            }
        }).distinctUntilChanged().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.as6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71388a.m41622Q5(menu, (Integer) obj);
            }
        }));
        ((ImageView) this.f25203J.findViewById(s5c0.f162498D)).setImageDrawable(getResources().getDrawable(x2c0.f190293ka));
        xdl0.m208344M(this.f25203J, false);
        this.f25209P.m205394U0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        if (NullChecker.m81303a(this.f25194D) && CoreModule.m29934N().mo60365ko()) {
            for (int i = 0; i < this.f25194D.getCount(); i++) {
                Fragment item = this.f25194D.getItem(i);
                if (item instanceof ConversationListFrag) {
                    ((ConversationListFrag) item).m41107w5(z);
                }
            }
        }
        if (z) {
            CoreModule.f17545c.f19642f0.f19892R.m143757c();
        } else {
            this.f25218Y = true;
        }
        if (z && CoreModule.f17545c.f19642f0.f19960n2.size() > 0) {
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            c4740g.m32805Sn(c4740g.f19960n2);
        }
        this.f25209P.m205393S0(z);
        if (z) {
            if (NullChecker.m81303a(this.f25203J)) {
                this.f25203J.setQuery("", true);
                this.f25203J.setIconified(true);
            }
            C4348d.m20896l().m20900k("all_match_tip_key");
        } else {
            boolean z2 = NullChecker.m81303a(this.f25201H) && this.f25206M == this.f25197F.indexOf(this.f25201H);
            m41648p6(z2);
            if (z2) {
                CoreModule.f17545c.f19639e0.f149237O6.put(Long.valueOf(mqi0.m155944o()));
                CoreModule.f17545c.f19642f0.f19972r2.m132487l(Boolean.FALSE);
                if (NullChecker.m81303a(this.f25216W)) {
                    this.f25216W.m41070l(false);
                }
                this.f25201H.m42359u5();
            }
            m41639g6();
            m39938U4();
            if (CoreModule.m29936Q().mo67215Ei(3)) {
                CoreModule.m29936Q().mo67228Lh().mo95356j();
            } else if (CoreModule.m29936Q().mo67255a().mo124836c() || CoreModule.m29936Q().mo67255a().mo124837d()) {
                CoreModule.m29936Q().mo67228Lh().mo95349c();
            }
            if (u59.m191811T()) {
                CoreModule.f17545c.f19678r0.m34092J6();
            }
            if (NullChecker.m81303a(this.f25199G)) {
                this.f25199G.m41110z5();
            }
            if (upa.m194624D2()) {
                boolean zM133031f = hu40.m133026a().m133031f(act(), true);
                if (NullChecker.m81303a(this.f25199G) && NullChecker.m81303a(this.f25199G.f24980z) && NullChecker.m81303a(this.f25199G.f24980z.f25085E0) && !zM133031f && !this.f25199G.f24980z.f25085E0.m41559k0() && hu40.m133026a().m133028c()) {
                    this.f25199G.f24980z.f25085E0.m41548K0();
                }
                hu40.m133026a().m133031f(act(), true);
            }
        }
        if (!z && upa.m194775k2()) {
            CoreModule.f17545c.f19642f0.m33166vp(l9b.m149005C(mqi0.m155944o(), CoreModule.f17545c.f19642f0.f19941h1.get().longValue()), upa.m194848z0(), upa.m194607A0(), false);
        }
        if (z) {
            C4348d.m20896l().m20900k("showNewMatchUserGuidePop");
            C4348d.m20896l().m20900k("newUserShowGuidePop");
        }
        if (!z && vy8.m200607e()) {
            act().duringCreated((C22306c) CoreModule.f17545c.f19605S1.m200714E3().flatMap(new w9j() { // from class: l.cr6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19605S1.m200728S3(((Boolean) obj).booleanValue());
                }
            })).subscribe(mkd0.m154954F());
        }
        this.f25199G.getClass();
        boolean zM81303a = NullChecker.m81303a(null);
        ConversationListFrag conversationListFrag = this.f25199G;
        if (zM81303a) {
            conversationListFrag.getClass();
            throw null;
        }
        if (NullChecker.m81303a(conversationListFrag) && NullChecker.m81303a(this.f25199G.f24980z) && NullChecker.m81303a(this.f25199G.f24980z.f25085E0) && !z) {
            this.f25199G.f24980z.f25085E0.m41570v0();
        }
        if (!z) {
            m41646n6();
        }
        if (!z) {
            CoreModule.f17545c.f19642f0.m33036lp();
        }
        if (!z && CoreModule.m29936Q().mo67229M6().mo102418c()) {
            CoreModule.m29936Q().mo67229M6().mo102430o(act());
        }
        super.onHiddenChanged(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
        super.onPrepareOptionsMenu(menu);
        m41648p6(NullChecker.m81303a(this.f25201H) && this.f25206M == this.f25197F.indexOf(this.f25201H));
    }

    /* JADX INFO: renamed from: p6 */
    public final void m41648p6(boolean z) {
        MenuItem menuItemFindItem;
        Menu menu = this.f25208O;
        if (menu == null || (menuItemFindItem = menu.findItem(u4c0.f174346l8)) == null) {
            return;
        }
        if (z) {
            menuItemFindItem.setVisible(false);
        } else if (CoreModule.f17545c.f19639e0.f149472t0.get().booleanValue() || CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            menuItemFindItem.setVisible(true);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return OMSDialogPositon.p_messages_view;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        super.mo20605y4();
        if (NullChecker.m81303a(this.f25194D)) {
            this.f25194D.m41650k(getChildFragmentManager());
        }
    }
}
