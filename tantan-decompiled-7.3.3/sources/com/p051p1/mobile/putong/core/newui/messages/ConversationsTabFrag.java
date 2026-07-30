package com.p051p1.mobile.putong.core.newui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.CityCentreConfig;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p051p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p151v.VPager;
import p153l.adc0;
import p153l.bkj0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.d09;
import p153l.d79;
import p153l.dbc0;
import p153l.fo0;
import p153l.gra;
import p153l.h39;
import p153l.i4g0;
import p153l.iam;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.l51;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.r8n;
import p153l.rcj;
import p153l.s75;
import p153l.uqb0;
import p153l.uqi;
import p153l.uxj0;
import p153l.vg60;
import p153l.w250;
import p153l.x20;
import p153l.xdc0;
import p153l.y20;
import p153l.yab;
import p153l.z20;
import p153l.zt6;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationsTabFrag extends NewMainContextFrag implements iam<zt6> {

    /* JADX INFO: renamed from: H0 */
    public static String f25933H0 = "conversationsTabSearch";

    /* JADX INFO: renamed from: B */
    public FrameLayout f25934B;

    /* JADX INFO: renamed from: C */
    public VPager f25935C;

    /* JADX INFO: renamed from: D */
    public C8284c f25936D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public ConversationsList f25937E;

    /* JADX INFO: renamed from: G */
    public ConversationListFrag f25941G;

    /* JADX INFO: renamed from: H */
    public WhisperListFrag f25943H;

    /* JADX INFO: renamed from: I */
    public View f25944I;

    /* JADX INFO: renamed from: J */
    public SearchView f25945J;

    /* JADX INFO: renamed from: K */
    public View f25946K;

    /* JADX INFO: renamed from: L */
    public View f25947L;

    /* JADX INFO: renamed from: N */
    public kcg0 f25949N;

    /* JADX INFO: renamed from: O */
    public Menu f25950O;

    /* JADX INFO: renamed from: P */
    public zt6 f25951P;

    /* JADX INFO: renamed from: W */
    public ConversationLeftToolBar f25958W;

    /* JADX INFO: renamed from: X */
    public ConversationRightToolBar f25959X;

    /* JADX INFO: renamed from: F */
    public List<PutongFrag> f25939F = new ArrayList();

    /* JADX INFO: renamed from: M */
    public int f25948M = 0;

    /* JADX INFO: renamed from: Q */
    public y20 f25952Q = new y20() { // from class: l.qs6
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f159248a.m42630N5(obj);
        }
    };

    /* JADX INFO: renamed from: R */
    public boolean f25953R = false;

    /* JADX INFO: renamed from: S */
    public long f25954S = 0;

    /* JADX INFO: renamed from: T */
    public boolean f25955T = false;

    /* JADX INFO: renamed from: U */
    public boolean f25956U = false;

    /* JADX INFO: renamed from: V */
    public double f25957V = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: Y */
    public boolean f25960Y = false;

    /* JADX INFO: renamed from: Z */
    public C22507a<uxj0> f25961Z = C22507a.m222759c(uxj0.f181467a);

    /* JADX INFO: renamed from: k0 */
    public int f25962k0 = qa00.m175859d(44.0f);

    /* JADX INFO: renamed from: p0 */
    public final Runnable f25963p0 = new Runnable() { // from class: l.ws6
        @Override // java.lang.Runnable
        public final void run() {
            this.f190598a.m42631O5();
        }
    };

    /* JADX INFO: renamed from: E0 */
    public final String f25938E0 = "all_match_pop_window_key";

    /* JADX INFO: renamed from: F0 */
    public long f25940F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public String f25942G0 = "";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag$a */
    public class C8282a implements ViewPager.InterfaceC0718j {
        public C8282a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            ConversationsTabFrag.this.m42643a6(i);
            ConversationsTabFrag.this.f25948M = i;
            ConversationsTabFrag conversationsTabFrag = ConversationsTabFrag.this;
            conversationsTabFrag.m42649f6(conversationsTabFrag.f25948M, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag$b */
    public class C8283b implements SearchView.InterfaceC0151m {
        public C8283b() {
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: a */
        public boolean mo601a(String str) {
            ConversationsTabFrag.this.m42647d6(str);
            bnl0.m105524M(ConversationsTabFrag.this.f25946K, !TextUtils.isEmpty(str));
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: b */
        public boolean mo602b(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag$c */
    public class C8284c extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f25966a;

        public C8284c(FragmentManager fragmentManager, int i) {
            super(fragmentManager, i);
            this.f25966a = new ArrayList();
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f25966a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return this.f25966a.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            return (PutongFrag) super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: k */
        public void m42661k(FragmentManager fragmentManager) {
            Iterator<PutongFrag> it = this.f25966a.iterator();
            while (it.hasNext()) {
                fragmentManager.m2568m().mo2716r(it.next()).mo2709j();
            }
        }

        /* JADX INFO: renamed from: l */
        public void m42662l(List<PutongFrag> list) {
            this.f25966a.clear();
            if (NullChecker.m82486a(list)) {
                this.f25966a.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    public ConversationsTabFrag() {
        m42587D5();
    }

    /* JADX INFO: renamed from: B5 */
    public static ConversationsTabFrag m42586B5(int i) {
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
    private void m42587D5() {
        new zt6(this).mo52715C(this);
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m42597e5(Throwable th) {
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ User m42598f5(User user, C4470c c4470c) {
        return user;
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m42605m5(C4470c c4470c) {
        if (CoreModule.f18264c.f20384f0.f20702n2.size() > 0) {
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            c4891g.m33808Sn(c4891g.f20702n2);
        }
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ Boolean m42608p5(vg60 vg60Var) {
        long jLongValue = CoreModule.f18264c.f20381e0.f89094O6.get().longValue();
        if (jLongValue == 0) {
            double dMax = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (vg60Var != null && !jyb.m147479J(vg60Var.f184001a)) {
                Iterator it = vg60Var.f184001a.iterator();
                while (it.hasNext()) {
                    dMax = Math.max(dMax, ((Conversation) it.next()).latestTime);
                }
            }
            CoreModule.f18264c.f20381e0.f89094O6.put(Long.valueOf((long) dMax));
            return Boolean.FALSE;
        }
        if (vg60Var == null || jyb.m147479J(vg60Var.f184001a)) {
            return Boolean.FALSE;
        }
        double d = jLongValue;
        for (T t : vg60Var.f184001a) {
            if (t.unreadMessages > 0 && t.latestTime > d) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: z5 */
    private void m42618z5() {
        if (gra.m131648Y0().function_switch) {
            m30638L4().filter(new qcj() { // from class: l.is6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f116628a.m42626J5((Boolean) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.js6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122428a.m42627K5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A5 */
    public void m42619A5() {
        if (NullChecker.m82486a(this.f25959X)) {
            this.f25959X.m42282e();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends pf60<String, x20>> mo30631C4() {
        return this.f25951P.m221440C0(super.mo30631C4());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C5, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zt6 zt6Var) {
        this.f25951P = zt6Var;
    }

    /* JADX INFO: renamed from: E5 */
    public void m42621E5() {
        C4499d.m21895l().m21899k("love_letter_remaining");
        C4499d.m21895l().m21899k("love_letter_reply");
    }

    /* JADX INFO: renamed from: F5 */
    public final void m42622F5(int i) {
        if (this.f25936D.getCount() <= i || i >= 0) {
            return;
        }
        if (NullChecker.m82486a(this.f25941G.f25716G)) {
            this.f25941G.f25716G.mo175950g();
        }
        this.f25941G.getClass();
        if (NullChecker.m82486a(null)) {
            this.f25941G.getClass();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX INFO: renamed from: G5 */
    public pf60<String, String> m42623G5() {
        String str;
        if (NullChecker.m82486a(this.f25936D)) {
            Fragment item = this.f25936D.getItem(this.f25948M);
            if (item instanceof ConversationListFrag) {
                str = ((ConversationListFrag) item).m42114m5() ? "all_matches" : "chat";
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        return jyb.m147494Y(pageId(), str);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: H4 */
    public void mo30634H4() {
        if (this.f25936D.f25966a.get(this.f25948M) instanceof ConversationListFrag) {
            ((ConversationListFrag) this.f25936D.f25966a.get(this.f25948M)).m42117v5();
        }
    }

    /* JADX INFO: renamed from: H5 */
    public final void m42624H5() {
        if (this.f25943H == null) {
            return;
        }
        ConversationLeftToolBar conversationLeftToolBar = (ConversationLeftToolBar) LayoutInflater.from(act()).inflate(kec0.f125323A7, (ViewGroup) this.f25934B, false);
        this.f25958W = conversationLeftToolBar;
        bnl0.m105524M(conversationLeftToolBar.f25700d, false);
        this.f25958W.setWhisperTabPosition(this.f25939F.indexOf(this.f25943H));
        this.f25958W.setIntlTabTextSize(19);
        this.f25958W.m42075f();
        this.f25958W.m42074e(this, new z20() { // from class: l.zs6
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f205847a.m42628L5((Integer) obj, (Boolean) obj2);
            }
        });
        Toolbar toolbar = act().toolbar();
        if (toolbar != null) {
            try {
                TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(toolbar);
                if (NullChecker.m82486a(textView)) {
                    textView.setVisibility(8);
                }
            } catch (Exception unused) {
            }
            if (this.f25958W.getParent() != null) {
                ((ViewGroup) this.f25958W.getParent()).removeView(this.f25958W);
            }
            Toolbar.C0160e c0160e = new Toolbar.C0160e(-2, -1);
            c0160e.f79555a = 8388627;
            toolbar.addView(this.f25958W, c0160e);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.height = this.f25962k0;
            layoutParams.gravity = 8388611;
            this.f25934B.addView(this.f25958W, layoutParams);
            bnl0.m105542Z(this.f25935C, this.f25958W);
        }
        m42625I5();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: I4 */
    public void mo30635I4() {
        if (this.f25936D.f25966a.get(this.f25948M) instanceof ConversationListFrag) {
            ((PutongFrag) this.f25936D.f25966a.get(this.f25948M)).mo30635I4();
        }
    }

    /* JADX INFO: renamed from: I5 */
    public final void m42625I5() {
        if (this.f25958W == null) {
            return;
        }
        final int iIndexOf = this.f25939F.indexOf(this.f25943H);
        duringCreated(CoreModule.f18264c.f20384f0.m34109rh().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.ks6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationsTabFrag.m42608p5((vg60) obj);
            }
        }).distinctUntilChanged().observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.ls6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133403a.m42629M5(iIndexOf, (Boolean) obj);
            }
        }, new y20() { // from class: l.ms6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsTabFrag.m42597e5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ Boolean m42626J5(Boolean bool) {
        return Boolean.valueOf(NullChecker.m82486a(this.f25941G));
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m42627K5(Boolean bool) {
        this.f25941G.f25712C = bool.booleanValue();
        if (this.f25941G.f25712C) {
            CoreModule.f18264c.f20384f0.f20658Z.m137019l("message_tab_hide_to_show_refresh");
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m42628L5(Integer num, Boolean bool) {
        if (num.intValue() < 0 || num.intValue() >= this.f25939F.size()) {
            return;
        }
        m42649f6(num.intValue(), true);
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ void m42629M5(int i, Boolean bool) {
        CoreModule.f18264c.f20384f0.f20714r2.m137019l(bool);
        if (this.f25948M == i || !NullChecker.m82486a(this.f25958W)) {
            return;
        }
        this.f25958W.m42081l(bool.booleanValue());
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m42630N5(Object obj) {
        this.f25953R = true;
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ void m42631O5() {
        CoreModule.f18264c.f20384f0.m33872Yf(this);
        CoreModule.f18264c.f20384f0.m33884Zf(this);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ C22421c m42632P5(final List list) {
        return psd0.m173625r(CoreModule.f18264c.f20381e0.m116596o9(), lifecycle(), new rcj() { // from class: l.os6
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return ConversationsTabFrag.m42598f5((User) obj, (C4470c) obj2);
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.ps6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf((CoreModule.f18264c.f20381e0.f89329t0.get().booleanValue() || ((User) obj).isVIP()) ? 10 : CoreModule.f18264c.f20384f0.m33990ie(list));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m42633Q5(Menu menu, Integer num) {
        boolean z = false;
        if (num.intValue() < 10 && !CoreModule.f18264c.f20381e0.f89329t0.get().booleanValue() && !CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            MenuItem menuItemFindItem = menu.findItem(adc0.f70471n8);
            if (NullChecker.m82486a(menuItemFindItem)) {
                menuItemFindItem.setVisible(false);
                return;
            }
            return;
        }
        if (this.f25948M == 1) {
            i4g0.m138526x("e_search_button", OMSDialogPositon.p_messages_view);
        }
        if (!CoreModule.f18264c.f20381e0.f89329t0.get().booleanValue()) {
            CoreModule.f18264c.f20381e0.f89329t0.put(Boolean.TRUE);
        }
        MenuItem menuItemFindItem2 = menu.findItem(adc0.f70471n8);
        if (NullChecker.m82486a(menuItemFindItem2)) {
            if (NullChecker.m82486a(this.f25943H) && this.f25948M == this.f25939F.indexOf(this.f25943H)) {
                z = true;
            }
            menuItemFindItem2.setVisible(!z);
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m42634R5(NewMainAct newMainAct, View view) {
        i4g0.m138520r("e_search_button", OMSDialogPositon.p_messages_view);
        if (CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            m42648e6(false);
        } else {
            this.f25945J.setIconified(true);
            C8927c.m54586J1(newMainAct, "p_messages_view,e_search_button,click", Privilege.vip_membership_search_gp);
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag
    /* JADX INFO: renamed from: S4 */
    public void mo40943S4() {
        super.mo40943S4();
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ boolean m42635S5() {
        m42648e6(true);
        return false;
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m42636T5() {
        if (this.f25945J.isIconified() || TextUtils.isEmpty(this.f25942G0)) {
            return;
        }
        this.f25937E.setVisibility(0);
        m42655l6(false);
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m42637U5() {
        if (NullChecker.m82486a(this.f25945J)) {
            this.f25945J.setIconified(true);
        }
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m42638V5() {
        m21592m4(new Runnable() { // from class: l.vs6
            @Override // java.lang.Runnable
            public final void run() {
                this.f185566a.m42637U5();
            }
        }, 300);
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m42639W5() {
        m40939O4().m41487a(Boolean.TRUE, f25933H0);
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ boolean m42640X5(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.m82486a(this.f25945J)) {
            this.f25945J.setIconified(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ Boolean m42641Y5(uxj0 uxj0Var) {
        return Boolean.valueOf(this.f25935C != null);
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ void m42642Z5(uxj0 uxj0Var) {
        act().removeCallbacks(this.f25963p0);
        act().postDelayed(this.f25963p0, 400L);
    }

    /* JADX INFO: renamed from: a6 */
    public final void m42643a6(int i) {
        m42622F5(i);
        if (gra.m131657a2() && !isHidden()) {
            CoreModule.f18264c.f20384f0.m33999io(i);
            act().removeCallbacks(this.f25963p0);
            act().postDelayed(this.f25963p0, 400L);
        }
    }

    /* JADX INFO: renamed from: b6 */
    public void m42644b6() {
        if (NullChecker.m82486a(this.f25959X.getAllMatchView()) && !CoreModule.f18264c.f20384f0.f20695l1.get().booleanValue()) {
            C4496a c4496a = new C4496a(act());
            c4496a.m21846B(qa00.m175859d(2.0f)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21880w(qa00.f156320g).m21881x(-qa00.f156316c).m21854J(13.0f).m21863e(true).m21857M(true).m21858N(new C4496a.d() { // from class: l.us6
                @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
                /* JADX INFO: renamed from: a */
                public final void mo21886a(View view) {
                    CoreModule.f18264c.f20384f0.f20695l1.put(Boolean.TRUE);
                }
            }).m21882y(true).m21860b(3000L).m21848D("在这里查看所有配对").m21874q(C4496a.f16399N | C4496a.f16403R);
            C4499d.m21895l().m21908u(c4496a, this.f25959X.getAllMatchView().findViewById(adc0.f70385i6), "all_match_pop_window_key");
        }
        if (h39.m133425N()) {
            m42621E5();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public int m42645c0() {
        return NullChecker.m82486a(this.f25935C) ? this.f25935C.getCurrentItem() : this.f25948M;
    }

    /* JADX INFO: renamed from: c6 */
    public boolean m42646c6() {
        if (!NullChecker.m82486a(this.f25945J) || this.f25945J.isIconified()) {
            return false;
        }
        this.f25945J.setQuery("", true);
        this.f25945J.setIconified(true);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f25956U = !pzi0.m174438C(pzi0.m174454o(), CoreModule.f18264c.f20384f0.f20716s1.get().longValue());
    }

    /* JADX INFO: renamed from: d6 */
    public void m42647d6(String str) {
        if (this.f25937E == null) {
            ConversationsList conversationsList = (ConversationsList) act().inflater().inflate(kec0.f125988oe, (ViewGroup) this.f25934B, false);
            this.f25937E = conversationsList;
            conversationsList.m42483p1(true);
            this.f25937E.f25841S.setBackgroundResource(c9c0.f80407c2);
            this.f25937E.f25847V.setCrashLogFlag("ConversationSearchList");
            this.f25937E.m42498w2();
            this.f25934B.addView(this.f25937E);
            bnl0.m105524M(this.f25937E, false);
            bnl0.m105542Z(this.f25937E);
            bnl0.m105541Y(qa00.m175859d(44.0f), this.f25937E);
        }
        this.f25942G0 = str;
        if (str != null && !str.equals("")) {
            this.f25937E.m42499x1(str, new x20() { // from class: l.rs6
                @Override // p153l.x20
                public final void call() {
                    this.f164636a.m42636T5();
                }
            }, new x20() { // from class: l.ss6
                @Override // p153l.x20
                public final void call() {
                    this.f170438a.m42638V5();
                }
            });
            return;
        }
        if (!this.f25945J.isIconified()) {
            m42655l6(true);
        }
        this.f25937E.setVisibility(8);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e6 */
    public final void m42648e6(boolean z) {
        NewMainAct newMainAct = (NewMainAct) act();
        if (z) {
            newMainAct.getSupportActionBar().mo102196w(false);
            newMainAct.getSupportActionBar().mo102198y(false);
            m42655l6(false);
            if (NullChecker.m82486a(this.f25937E)) {
                this.f25937E.setVisibility(8);
            }
            l51.m152889I(this, new Runnable() { // from class: l.ns6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143471a.m42639W5();
                }
            }, 300L);
            this.f25947L.setEnabled(false);
            return;
        }
        this.f25947L.setEnabled(true);
        m40939O4().m41487a(Boolean.FALSE, f25933H0);
        newMainAct.getSupportActionBar().mo102196w(true);
        newMainAct.getSupportActionBar().mo102198y(true);
        act().getSupportActionBar().mo102170C(newMainAct.getAppTheme().mo134823c());
        this.f25945J.requestFocus();
        m42655l6(true);
        this.f25946K.setVisibility(8);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m42656m6();
        if (act() instanceof NewMainAct) {
            gra.m131555D2();
        }
        m42618z5();
        lifecycle().filter(new qcj() { // from class: l.xs6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16269k);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ys6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsTabFrag.m42605m5((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f6 */
    public final void m42649f6(int i, boolean z) {
        if (i < 0) {
            return;
        }
        this.f25948M = i;
        boolean z2 = NullChecker.m82486a(this.f25943H) && i == this.f25939F.indexOf(this.f25943H);
        if (z2) {
            CoreModule.f18264c.f20381e0.f89094O6.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20384f0.f20714r2.m137019l(Boolean.FALSE);
            if (NullChecker.m82486a(this.f25958W)) {
                this.f25958W.m42081l(false);
            }
            this.f25943H.m43370u5();
            CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
        }
        m42659p6(z2);
        if (NullChecker.m82486a(this.f25935C) && this.f25935C.getCurrentItem() != i) {
            this.f25935C.m4178T(i, z);
        }
        if (NullChecker.m82486a(this.f25958W)) {
            this.f25958W.m42080k(i);
        }
        m42658o6();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f25936D = new C8284c(getChildFragmentManager(), 1);
        ConversationListFrag conversationListFragM42103i5 = ConversationListFrag.m42103i5(true);
        this.f25941G = conversationListFragM42103i5;
        this.f25939F.add(conversationListFragM42103i5);
        WhisperListFrag whisperListFragM43357i5 = WhisperListFrag.m43357i5();
        this.f25943H = whisperListFragM43357i5;
        this.f25939F.add(whisperListFragM43357i5);
        this.f25935C.setAdapter(this.f25936D);
        this.f25936D.m42662l(this.f25939F);
        this.f25935C.setScrollble(false);
        this.f25935C.m4187d(new C8282a());
        if (NullChecker.m82486a(getArguments()) && getArguments().containsKey("init_conversation_tab_index")) {
            this.f25935C.setCurrentItem(getArguments().getInt("init_conversation_tab_index", 0));
        }
        r8n.m180219f().f161737k.put("");
        m42624H5();
    }

    /* JADX INFO: renamed from: g6 */
    public final void m42650g6() {
        act().setTitle("", false);
    }

    /* JADX INFO: renamed from: h6 */
    public void m42651h6(boolean z) {
        if (NullChecker.m82486a(this.f25959X)) {
            this.f25959X.m42285h(z);
        }
    }

    /* JADX INFO: renamed from: i6 */
    public void m42652i6(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (NullChecker.m82486a(this.f25959X)) {
            this.f25959X.m42286i(m42645c0(), loveLetterEntryInfo);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LaunchStep launchStep = LaunchStep.MsgDoubleTabInflate;
        uqi.m197339f(launchStep);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f25934B = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        uqi.m197337d(launchStep);
        LaunchStep launchStep2 = LaunchStep.MsgSearchInflate;
        uqi.m197339f(launchStep2);
        VPager vPager = new VPager(getContext());
        this.f25935C = vPager;
        vPager.setId(adc0.f70489o9);
        this.f25934B.addView(this.f25935C, new FrameLayout.LayoutParams(-1, -1));
        uqi.m197337d(launchStep2);
        View view = new View(act());
        this.f25944I = view;
        view.setBackgroundColor(Color.parseColor("#7fffffff"));
        this.f25934B.addView(this.f25944I);
        bnl0.m105524M(this.f25944I, false);
        CoreBusinessModule.m30906m0().mo122547g(this);
        return this.f25934B;
    }

    /* JADX INFO: renamed from: j6 */
    public void m42653j6(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (NullChecker.m82486a(this.f25959X)) {
            this.f25959X.m42287j(loveLetterEntryInfo);
        }
    }

    /* JADX INFO: renamed from: k6 */
    public void m42654k6() {
        if (NullChecker.m82486a(this.f25959X)) {
            this.f25959X.m42288k();
        }
    }

    /* JADX INFO: renamed from: l6 */
    public void m42655l6(boolean z) {
        View view = this.f25944I;
        if (z) {
            view.setVisibility(0);
            this.f25944I.setOnTouchListener(new View.OnTouchListener() { // from class: l.ts6
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f175963a.m42640X5(view2, motionEvent);
                }
            });
        } else {
            view.setVisibility(4);
            this.f25944I.setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final void m42656m6() {
        if (gra.m131657a2()) {
            duringCreated(CoreModule.f18264c.f20384f0.m34183xe()).filter(new qcj() { // from class: l.gs6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f106234a.m42641Y5((uxj0) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.hs6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111420a.m42642Z5((uxj0) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        setHasOptionsMenu(true);
        act().getSupportActionBar().mo102196w(false);
        act().getSupportActionBar().mo102198y(false);
        m42650g6();
        CoreBusinessModule.m30906m0().mo122544d(this);
    }

    /* JADX INFO: renamed from: n6 */
    public void m42657n6() {
        if (s75.m184965m()) {
            CityCentreConfig cityCentreConfigM133445i = h39.m133445i();
            double dM174454o = (pzi0.m174454o() - CoreModule.f18264c.f20392h2.f142915R) / 1000.0d;
            if (!NullChecker.m82486a(cityCentreConfigM133445i) || dM174454o <= cityCentreConfigM133445i.refresh_interval_seconds) {
                return;
            }
            if (s75.m184965m()) {
                CoreModule.f18264c.f20392h2.m164089T3();
            }
            if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
                return;
            }
            s75.m184964l().m184971o();
        }
    }

    /* JADX INFO: renamed from: o6 */
    public void m42658o6() {
        if (NullChecker.m82486a(this.f25959X)) {
            this.f25959X.m42289l(this.f25948M == this.f25939F.indexOf(this.f25941G));
        }
    }

    @Override // com.p051p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25951P.mo40472Z();
        this.f25951P.mo40473a0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NonNull final Menu menu, @NonNull MenuInflater menuInflater) {
        this.f25950O = menu;
        final NewMainAct newMainAct = (NewMainAct) act();
        bkj0<SearchView, View, View> bkj0VarInitSearchMenu = newMainAct.initSearchMenu(menu, menuInflater);
        if (bkj0VarInitSearchMenu == null) {
            return;
        }
        act().toolbar().setContentInsetsRelative(0, act().toolbar().getContentInsetRight());
        SearchView searchView = bkj0VarInitSearchMenu.f77081a;
        this.f25945J = searchView;
        this.f25946K = bkj0VarInitSearchMenu.f77082b;
        this.f25947L = bkj0VarInitSearchMenu.f77083c;
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: l.at6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73209a.m42634R5(newMainAct, view);
            }
        });
        this.f25945J.setOnQueryTextListener(new C8283b());
        this.f25945J.setOnCloseListener(new SearchView.InterfaceC0150l() { // from class: l.bt6
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0150l
            public final boolean onClose() {
                return this.f78334a.m42635S5();
            }
        });
        final ArrayList arrayList = new ArrayList();
        arrayList.add(User.ID_TEAM_ACCOUNT);
        if (NullChecker.m82486a(this.f25949N)) {
            psd0.m173633z(this.f25949N);
        }
        this.f25949N = act().duringCreated(new pcj() { // from class: l.ct6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f83666a.m42632P5(arrayList);
            }
        }).distinctUntilChanged().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.dt6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90539a.m42633Q5(menu, (Integer) obj);
            }
        }));
        ((ImageView) this.f25945J.findViewById(xdc0.f193537D)).setImageDrawable(getResources().getDrawable(dbc0.f87179la));
        bnl0.m105524M(this.f25945J, false);
        this.f25951P.m221451U0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        if (NullChecker.m82486a(this.f25936D) && CoreModule.m30932N().mo61549ko()) {
            for (int i = 0; i < this.f25936D.getCount(); i++) {
                Fragment item = this.f25936D.getItem(i);
                if (item instanceof ConversationListFrag) {
                    ((ConversationListFrag) item).m42118w5(z);
                }
            }
        }
        if (z) {
            CoreModule.f18264c.f20384f0.f20634R.m170614c();
        } else {
            this.f25960Y = true;
        }
        if (z && CoreModule.f18264c.f20384f0.f20702n2.size() > 0) {
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            c4891g.m33808Sn(c4891g.f20702n2);
        }
        this.f25951P.m221450S0(z);
        if (z) {
            if (NullChecker.m82486a(this.f25945J)) {
                this.f25945J.setQuery("", true);
                this.f25945J.setIconified(true);
            }
            C4499d.m21895l().m21899k("all_match_tip_key");
        } else {
            boolean z2 = NullChecker.m82486a(this.f25943H) && this.f25948M == this.f25939F.indexOf(this.f25943H);
            m42659p6(z2);
            if (z2) {
                CoreModule.f18264c.f20381e0.f89094O6.put(Long.valueOf(pzi0.m174454o()));
                CoreModule.f18264c.f20384f0.f20714r2.m137019l(Boolean.FALSE);
                if (NullChecker.m82486a(this.f25958W)) {
                    this.f25958W.m42081l(false);
                }
                this.f25943H.m43370u5();
            }
            m42650g6();
            m40945U4();
            if (CoreModule.m30934Q().mo68398Ei(3)) {
                CoreModule.m30934Q().mo68411Lh().mo175953j();
            } else if (CoreModule.m30934Q().mo68438a().mo134411c() || CoreModule.m30934Q().mo68438a().mo134412d()) {
                CoreModule.m30934Q().mo68411Lh().mo175946c();
            }
            if (d79.m114662U()) {
                CoreModule.f18264c.f20420r0.m35095J6();
            }
            if (NullChecker.m82486a(this.f25941G)) {
                this.f25941G.m42121z5();
            }
            if (gra.m131555D2()) {
                boolean zM204536f = w250.m204531a().m204536f(act(), true);
                if (NullChecker.m82486a(this.f25941G) && NullChecker.m82486a(this.f25941G.f25722z) && NullChecker.m82486a(this.f25941G.f25722z.f25827E0) && !zM204536f && !this.f25941G.f25722z.f25827E0.m42570k0() && w250.m204531a().m204533c()) {
                    this.f25941G.f25722z.f25827E0.m42559K0();
                }
                w250.m204531a().m204536f(act(), true);
            }
        }
        if (!z && gra.m131706k2()) {
            CoreModule.f18264c.f20384f0.m34169vp(yab.m214857C(pzi0.m174454o(), CoreModule.f18264c.f20384f0.f20683h1.get().longValue()), gra.m131779z0(), gra.m131538A0(), false);
        }
        if (z) {
            C4499d.m21895l().m21899k("showNewMatchUserGuidePop");
            C4499d.m21895l().m21899k("newUserShowGuidePop");
        }
        if (!z && d09.m113368e()) {
            act().duringCreated((C22421c) CoreModule.f18264c.f20347S1.m113538E3().flatMap(new qcj() { // from class: l.fs6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20347S1.m113552S3(((Boolean) obj).booleanValue());
                }
            })).subscribe(psd0.m173595F());
        }
        this.f25941G.getClass();
        boolean zM82486a = NullChecker.m82486a(null);
        ConversationListFrag conversationListFrag = this.f25941G;
        if (zM82486a) {
            conversationListFrag.getClass();
            throw null;
        }
        if (NullChecker.m82486a(conversationListFrag) && NullChecker.m82486a(this.f25941G.f25722z) && NullChecker.m82486a(this.f25941G.f25722z.f25827E0) && !z) {
            this.f25941G.f25722z.f25827E0.m42581v0();
        }
        if (!z) {
            m42657n6();
        }
        if (!z) {
            CoreModule.f18264c.f20384f0.m34039lp();
        }
        if (!z && CoreModule.m30934Q().mo68412M6().mo127332c()) {
            CoreModule.m30934Q().mo68412M6().mo127344o(act());
        }
        super.onHiddenChanged(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
        super.onPrepareOptionsMenu(menu);
        m42659p6(NullChecker.m82486a(this.f25943H) && this.f25948M == this.f25939F.indexOf(this.f25943H));
    }

    /* JADX INFO: renamed from: p6 */
    public final void m42659p6(boolean z) {
        MenuItem menuItemFindItem;
        Menu menu = this.f25950O;
        if (menu == null || (menuItemFindItem = menu.findItem(adc0.f70471n8)) == null) {
            return;
        }
        if (z) {
            menuItemFindItem.setVisible(false);
        } else if (CoreModule.f18264c.f20381e0.f89329t0.get().booleanValue() || CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            menuItemFindItem.setVisible(true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return OMSDialogPositon.p_messages_view;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        super.mo21604y4();
        if (NullChecker.m82486a(this.f25936D)) {
            this.f25936D.m42661k(getChildFragmentManager());
        }
    }
}
