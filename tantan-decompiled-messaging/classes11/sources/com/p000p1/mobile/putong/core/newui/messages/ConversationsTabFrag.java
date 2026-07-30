package com.p000p1.mobile.putong.core.newui.messages;

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
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p000p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.CityCentreConfig;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.f6c0;
import l.hu40;
import l.i30;
import l.j760;
import l.jo0;
import l.l9b;
import l.mkd0;
import l.qib0;
import l.r65;
import l.roj0;
import l.s5c0;
import l.s7m;
import l.t100;
import l.u4c0;
import l.u59;
import l.upa;
import l.v9j;
import l.vwb;
import l.vy8;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.y19;
import l.zvf0;
import p009l.mqi0;
import p009l.q860;
import p009l.r6n;
import p009l.ws6;
import p009l.yni;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationsTabFrag extends NewMainContextFrag implements s7m<ws6> {

    /* JADX INFO: renamed from: H0 */
    public static String f3969H0 = "conversationsTabSearch";

    /* JADX INFO: renamed from: B */
    public FrameLayout f3970B;

    /* JADX INFO: renamed from: C */
    public VPager f3971C;

    /* JADX INFO: renamed from: D */
    public C0297c f3972D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public ConversationsList f3973E;

    /* JADX INFO: renamed from: G */
    public ConversationListFrag f3977G;

    /* JADX INFO: renamed from: H */
    public WhisperListFrag f3979H;

    /* JADX INFO: renamed from: I */
    public View f3980I;

    /* JADX INFO: renamed from: J */
    public SearchView f3981J;

    /* JADX INFO: renamed from: K */
    public View f3982K;

    /* JADX INFO: renamed from: L */
    public View f3983L;

    /* JADX INFO: renamed from: N */
    public c4g0 f3985N;

    /* JADX INFO: renamed from: O */
    public Menu f3986O;

    /* JADX INFO: renamed from: P */
    public ws6 f3987P;

    /* JADX INFO: renamed from: W */
    public ConversationLeftToolBar f3994W;

    /* JADX INFO: renamed from: X */
    public ConversationRightToolBar f3995X;

    /* JADX INFO: renamed from: F */
    public List<PutongFrag> f3975F = new ArrayList();

    /* JADX INFO: renamed from: M */
    public int f3984M = 0;

    /* JADX INFO: renamed from: Q */
    public e30 f3988Q = new e30() { // from class: l.nr6
        public final void call(Object obj) {
            this.f17622a.m5733N5(obj);
        }
    };

    /* JADX INFO: renamed from: R */
    public boolean f3989R = false;

    /* JADX INFO: renamed from: S */
    public long f3990S = 0;

    /* JADX INFO: renamed from: T */
    public boolean f3991T = false;

    /* JADX INFO: renamed from: U */
    public boolean f3992U = false;

    /* JADX INFO: renamed from: V */
    public double f3993V = 0.0d;

    /* JADX INFO: renamed from: Y */
    public boolean f3996Y = false;

    /* JADX INFO: renamed from: Z */
    public a<roj0> f3997Z = a.c(roj0.a);

    /* JADX INFO: renamed from: k0 */
    public int f3998k0 = t100.d(44.0f);

    /* JADX INFO: renamed from: p0 */
    public final Runnable f3999p0 = new Runnable() { // from class: l.tr6
        @Override // java.lang.Runnable
        public final void run() {
            this.f20844a.m5734O5();
        }
    };

    /* JADX INFO: renamed from: E0 */
    public final String f3974E0 = "all_match_pop_window_key";

    /* JADX INFO: renamed from: F0 */
    public long f3976F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public String f3978G0 = "";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag$a */
    public class C0295a implements ViewPager.j {
        public C0295a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            ConversationsTabFrag.this.m5746a6(i);
            ConversationsTabFrag.this.f3984M = i;
            ConversationsTabFrag conversationsTabFrag = ConversationsTabFrag.this;
            conversationsTabFrag.m5754f6(conversationsTabFrag.f3984M, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag$b */
    public class C0296b implements SearchView.m {
        public C0296b() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m5769a(String str) {
            ConversationsTabFrag.this.m5751d6(str);
            xdl0.M(ConversationsTabFrag.this.f3982K, !TextUtils.isEmpty(str));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m5770b(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsTabFrag$c */
    public class C0297c extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f4002a;

        public C0297c(FragmentManager fragmentManager, int i) {
            super(fragmentManager, i);
            this.f4002a = new ArrayList();
        }

        public int getCount() {
            return this.f4002a.size();
        }

        public Fragment getItem(int i) {
            return this.f4002a.get(i);
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            return (PutongFrag) super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: k */
        public void m5772k(FragmentManager fragmentManager) {
            Iterator<PutongFrag> it = this.f4002a.iterator();
            while (it.hasNext()) {
                fragmentManager.m().r(it.next()).j();
            }
        }

        /* JADX INFO: renamed from: l */
        public void m5773l(List<PutongFrag> list) {
            this.f4002a.clear();
            if (NullChecker.a(list)) {
                this.f4002a.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    public ConversationsTabFrag() {
        m5685D5();
    }

    /* JADX INFO: renamed from: B5 */
    public static ConversationsTabFrag m5684B5(int i) {
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
    private void m5685D5() {
        new ws6(this).C(this);
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m5695e5(Throwable th) {
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ User m5696f5(User user, c cVar) {
        return user;
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m5703m5(c cVar) {
        if (CoreModule.c.f0.n2.size() > 0) {
            g gVar = CoreModule.c.f0;
            gVar.Sn(gVar.n2);
        }
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ Boolean m5706p5(q860 q860Var) {
        long jLongValue = ((Long) CoreModule.c.e0.O6.get()).longValue();
        if (jLongValue == 0) {
            double dMax = 0.0d;
            if (q860Var != null && !vwb.J(q860Var.f19068a)) {
                Iterator it = q860Var.f19068a.iterator();
                while (it.hasNext()) {
                    dMax = Math.max(dMax, ((Conversation) it.next()).latestTime);
                }
            }
            CoreModule.c.e0.O6.put(Long.valueOf((long) dMax));
            return Boolean.FALSE;
        }
        if (q860Var == null || vwb.J(q860Var.f19068a)) {
            return Boolean.FALSE;
        }
        double d = jLongValue;
        for (T t : q860Var.f19068a) {
            if (t.unreadMessages > 0 && t.latestTime > d) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: z5 */
    private void m5716z5() {
        if (upa.Y0().function_switch) {
            L4().filter(new w9j() { // from class: l.fr6
                public final Object call(Object obj) {
                    return this.f13141a.m5729J5((Boolean) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.gr6
                public final void call(Object obj) {
                    this.f13696a.m5730K5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A5 */
    public void m5717A5() {
        if (NullChecker.a(this.f3995X)) {
            this.f3995X.m5377e();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m5718B4() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5719C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> m5720C4() {
        return this.f3987P.m24515C0(super/*com.p1.mobile.putong.app.PutongFrag*/.C4());
    }

    /* JADX INFO: renamed from: C5, reason: merged with bridge method [inline-methods] */
    public void m5758i1(ws6 ws6Var) {
        this.f3987P = ws6Var;
    }

    /* JADX INFO: renamed from: E5 */
    public void m5722E5() {
        d.l().k("love_letter_remaining");
        d.l().k("love_letter_reply");
    }

    /* JADX INFO: renamed from: F5 */
    public final void m5723F5(int i) {
        if (this.f3972D.getCount() <= i || i >= 0) {
            return;
        }
        if (NullChecker.a(this.f3977G.f3752G)) {
            this.f3977G.f3752G.m11269g();
        }
        this.f3977G.getClass();
        if (NullChecker.a((Object) null)) {
            this.f3977G.getClass();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX INFO: renamed from: G5 */
    public j760<String, String> m5724G5() {
        String str;
        if (NullChecker.a(this.f3972D)) {
            ConversationListFrag item = this.f3972D.getItem(this.f3984M);
            if (item instanceof ConversationListFrag) {
                str = item.m5209m5() ? "all_matches" : "chat";
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        return vwb.Y(pageId(), str);
    }

    /* JADX INFO: renamed from: H4 */
    public void m5725H4() {
        if (this.f3972D.f4002a.get(this.f3984M) instanceof ConversationListFrag) {
            ((ConversationListFrag) this.f3972D.f4002a.get(this.f3984M)).m5212v5();
        }
    }

    /* JADX INFO: renamed from: H5 */
    public final void m5726H5() {
        if (this.f3979H == null) {
            return;
        }
        ConversationLeftToolBar conversationLeftToolBar = (ConversationLeftToolBar) LayoutInflater.from(act()).inflate(f6c0.t7, (ViewGroup) this.f3970B, false);
        this.f3994W = conversationLeftToolBar;
        xdl0.M(conversationLeftToolBar.f3736d, false);
        this.f3994W.setWhisperTabPosition(this.f3975F.indexOf(this.f3979H));
        this.f3994W.setIntlTabTextSize(19);
        this.f3994W.m5166f();
        this.f3994W.m5165e(this, new f30() { // from class: l.wr6
            public final void call(Object obj, Object obj2) {
                this.f22289a.m5731L5((Integer) obj, (Boolean) obj2);
            }
        });
        Toolbar toolbar = act().toolbar();
        if (toolbar != null) {
            try {
                TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(toolbar);
                if (NullChecker.a(textView)) {
                    textView.setVisibility(8);
                }
            } catch (Exception unused) {
            }
            if (this.f3994W.getParent() != null) {
                ((ViewGroup) this.f3994W.getParent()).removeView(this.f3994W);
            }
            Toolbar.e eVar = new Toolbar.e(-2, -1);
            ((i30.a) eVar).a = 8388627;
            toolbar.addView(this.f3994W, eVar);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.height = this.f3998k0;
            layoutParams.gravity = 8388611;
            this.f3970B.addView(this.f3994W, layoutParams);
            xdl0.Z(new View[]{this.f3971C, this.f3994W});
        }
        m5728I5();
    }

    /* JADX INFO: renamed from: I4 */
    public void m5727I4() {
        if (this.f3972D.f4002a.get(this.f3984M) instanceof ConversationListFrag) {
            ((PutongFrag) this.f3972D.f4002a.get(this.f3984M)).I4();
        }
    }

    /* JADX INFO: renamed from: I5 */
    public final void m5728I5() {
        if (this.f3994W == null) {
            return;
        }
        final int iIndexOf = this.f3975F.indexOf(this.f3979H);
        duringCreated(CoreModule.c.f0.rh().observeOn(Schedulers.io()).map(new w9j() { // from class: l.hr6
            public final Object call(Object obj) {
                return ConversationsTabFrag.m5706p5((q860) obj);
            }
        }).distinctUntilChanged().observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.ir6
            public final void call(Object obj) {
                this.f14775a.m5732M5(iIndexOf, (Boolean) obj);
            }
        }, new e30() { // from class: l.jr6
            public final void call(Object obj) {
                ConversationsTabFrag.m5695e5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J5 */
    public final /* synthetic */ Boolean m5729J5(Boolean bool) {
        return Boolean.valueOf(NullChecker.a(this.f3977G));
    }

    /* JADX INFO: renamed from: K5 */
    public final /* synthetic */ void m5730K5(Boolean bool) {
        this.f3977G.f3748C = bool.booleanValue();
        if (this.f3977G.f3748C) {
            CoreModule.c.f0.Z.onNext("message_tab_hide_to_show_refresh");
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final /* synthetic */ void m5731L5(Integer num, Boolean bool) {
        if (num.intValue() < 0 || num.intValue() >= this.f3975F.size()) {
            return;
        }
        m5754f6(num.intValue(), true);
    }

    /* JADX INFO: renamed from: M5 */
    public final /* synthetic */ void m5732M5(int i, Boolean bool) {
        CoreModule.c.f0.r2.onNext(bool);
        if (this.f3984M == i || !NullChecker.a(this.f3994W)) {
            return;
        }
        this.f3994W.m5172l(bool.booleanValue());
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m5733N5(Object obj) {
        this.f3989R = true;
    }

    /* JADX INFO: renamed from: O5 */
    public final /* synthetic */ void m5734O5() {
        CoreModule.c.f0.Yf(this);
        CoreModule.c.f0.Zf(this);
    }

    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ rx.c m5735P5(final List list) {
        return mkd0.r(CoreModule.c.e0.o9(), lifecycle(), new x9j() { // from class: l.lr6
            public final Object call(Object obj, Object obj2) {
                return ConversationsTabFrag.m5696f5((User) obj, (c) obj2);
            }
        }).observeOn(Schedulers.io()).map(new w9j() { // from class: l.mr6
            public final Object call(Object obj) {
                return Integer.valueOf((((Boolean) CoreModule.c.e0.t0.get()).booleanValue() || ((User) obj).isVIP()) ? 10 : CoreModule.c.f0.ie(list));
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m5736Q5(Menu menu, Integer num) {
        boolean z = false;
        if (num.intValue() < 10 && !((Boolean) CoreModule.c.e0.t0.get()).booleanValue() && !CoreModule.c.e0.p9().isVIP()) {
            MenuItem menuItemFindItem = menu.findItem(u4c0.l8);
            if (NullChecker.a(menuItemFindItem)) {
                menuItemFindItem.setVisible(false);
                return;
            }
            return;
        }
        if (this.f3984M == 1) {
            zvf0.x("e_search_button", "p_messages_view");
        }
        if (!((Boolean) CoreModule.c.e0.t0.get()).booleanValue()) {
            CoreModule.c.e0.t0.put(Boolean.TRUE);
        }
        MenuItem menuItemFindItem2 = menu.findItem(u4c0.l8);
        if (NullChecker.a(menuItemFindItem2)) {
            if (NullChecker.a(this.f3979H) && this.f3984M == this.f3975F.indexOf(this.f3979H)) {
                z = true;
            }
            menuItemFindItem2.setVisible(!z);
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m5737R5(NewMainAct newMainAct, View view) {
        zvf0.r("e_search_button", "p_messages_view");
        if (CoreModule.c.e0.p9().isVIP()) {
            m5752e6(false);
        } else {
            this.f3981J.setIconified(true);
            com.p1.mobile.putong.core.ui.purchase.c.J1(newMainAct, "p_messages_view,e_search_button,click", Privilege.vip_membership_search_gp);
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag
    /* JADX INFO: renamed from: S4 */
    public void mo4013S4() {
        super.mo4013S4();
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ boolean m5738S5() {
        m5752e6(true);
        return false;
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m5739T5() {
        if (this.f3981J.isIconified() || TextUtils.isEmpty(this.f3978G0)) {
            return;
        }
        this.f3973E.setVisibility(0);
        m5762l6(false);
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m5740U5() {
        if (NullChecker.a(this.f3981J)) {
            this.f3981J.setIconified(true);
        }
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m5741V5() {
        m4(new Runnable() { // from class: l.sr6
            @Override // java.lang.Runnable
            public final void run() {
                this.f20433a.m5740U5();
            }
        }, 300);
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m5742W5() {
        m4009O4().m4560a(Boolean.TRUE, f3969H0);
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ boolean m5743X5(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.a(this.f3981J)) {
            this.f3981J.setIconified(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ Boolean m5744Y5(roj0 roj0Var) {
        return Boolean.valueOf(this.f3971C != null);
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ void m5745Z5(roj0 roj0Var) {
        act().removeCallbacks(this.f3999p0);
        act().postDelayed(this.f3999p0, 400L);
    }

    /* JADX INFO: renamed from: a6 */
    public final void m5746a6(int i) {
        m5723F5(i);
        if (upa.a2() && !isHidden()) {
            CoreModule.c.f0.io(i);
            act().removeCallbacks(this.f3999p0);
            act().postDelayed(this.f3999p0, 400L);
        }
    }

    /* JADX INFO: renamed from: b6 */
    public void m5747b6() {
        if (NullChecker.a(this.f3995X.getAllMatchView()) && !((Boolean) CoreModule.c.f0.l1.get()).booleanValue()) {
            com.p1.mobile.android.ui.bubble.a aVar = new com.p1.mobile.android.ui.bubble.a(act());
            aVar.B(t100.d(2.0f)).l(t100.d(7.0f)).p(75).w(t100.g).x(-t100.c).J(13.0f).e(true).M(true).N(new com.p1.mobile.android.ui.bubble.a.d() { // from class: l.rr6
                /* JADX INFO: renamed from: a */
                public final void m21783a(View view) {
                    CoreModule.c.f0.l1.put(Boolean.TRUE);
                }
            }).y(true).b(3000L).D("在这里查看所有配对").q(com.p1.mobile.android.ui.bubble.a.N | com.p1.mobile.android.ui.bubble.a.R);
            d.l().u(aVar, this.f3995X.getAllMatchView().findViewById(u4c0.g6), "all_match_pop_window_key");
        }
        if (y19.N()) {
            m5722E5();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public int m5748c0() {
        return NullChecker.a(this.f3971C) ? this.f3971C.getCurrentItem() : this.f3984M;
    }

    /* JADX INFO: renamed from: c6 */
    public boolean m5749c6() {
        if (!NullChecker.a(this.f3981J) || this.f3981J.isIconified()) {
            return false;
        }
        this.f3981J.setQuery("", true);
        this.f3981J.setIconified(true);
        return true;
    }

    /* JADX INFO: renamed from: d4 */
    public void m5750d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        this.f3992U = !mqi0.m18534C(mqi0.m18550o(), ((Long) CoreModule.c.f0.s1.get()).longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d6 */
    public void m5751d6(String str) {
        if (this.f3973E == null) {
            ConversationsList conversationsList = (ConversationsList) act().inflater().inflate(f6c0.he, (ViewGroup) this.f3970B, false);
            this.f3973E = conversationsList;
            conversationsList.m5578p1(true);
            this.f3973E.f3877S.setBackgroundResource(w0c0.b2);
            this.f3973E.f3883V.setCrashLogFlag("ConversationSearchList");
            this.f3973E.m5594w2();
            this.f3970B.addView(this.f3973E);
            xdl0.M(this.f3973E, false);
            xdl0.Z(new View[]{this.f3973E});
            xdl0.Y(t100.d(44.0f), new View[]{this.f3973E});
        }
        this.f3978G0 = str;
        if (str != null && !str.equals("")) {
            this.f3973E.m5595x1(str, new d30() { // from class: l.or6
                public final void call() {
                    this.f18215a.m5739T5();
                }
            }, new d30() { // from class: l.pr6
                public final void call() {
                    this.f18868a.m5741V5();
                }
            });
            return;
        }
        if (!this.f3981J.isIconified()) {
            m5762l6(true);
        }
        this.f3973E.setVisibility(8);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e6 */
    public final void m5752e6(boolean z) {
        NewMainAct newMainActAct = act();
        if (z) {
            newMainActAct.getSupportActionBar().w(false);
            newMainActAct.getSupportActionBar().y(false);
            m5762l6(false);
            if (NullChecker.a(this.f3973E)) {
                this.f3973E.setVisibility(8);
            }
            e51.I(this, new Runnable() { // from class: l.kr6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15822a.m5742W5();
                }
            }, 300L);
            this.f3983L.setEnabled(false);
            return;
        }
        this.f3983L.setEnabled(true);
        m4009O4().m4560a(Boolean.FALSE, f3969H0);
        newMainActAct.getSupportActionBar().w(true);
        newMainActAct.getSupportActionBar().y(true);
        act().getSupportActionBar().C(newMainActAct.getAppTheme().c());
        this.f3981J.requestFocus();
        m5762l6(true);
        this.f3982K.setVisibility(8);
    }

    /* JADX INFO: renamed from: f4 */
    public void m5753f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        m5763m6();
        if (act() instanceof NewMainAct) {
            upa.D2();
        }
        m5716z5();
        lifecycle().filter(new w9j() { // from class: l.ur6
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.k);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.vr6
            public final void call(Object obj) {
                ConversationsTabFrag.m5703m5((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f6 */
    public final void m5754f6(int i, boolean z) {
        if (i < 0) {
            return;
        }
        this.f3984M = i;
        boolean z2 = NullChecker.a(this.f3979H) && i == this.f3975F.indexOf(this.f3979H);
        if (z2) {
            CoreModule.c.e0.O6.put(Long.valueOf(mqi0.m18550o()));
            CoreModule.c.f0.r2.onNext(Boolean.FALSE);
            if (NullChecker.a(this.f3994W)) {
                this.f3994W.m5172l(false);
            }
            this.f3979H.m6514u5();
            CoreModule.c.f0.dq(qib0.H.guessedCurrentServerTime());
        }
        m5767p6(z2);
        if (NullChecker.a(this.f3971C) && this.f3971C.getCurrentItem() != i) {
            this.f3971C.T(i, z);
        }
        if (NullChecker.a(this.f3994W)) {
            this.f3994W.m5171k(i);
        }
        m5766o6();
    }

    /* JADX INFO: renamed from: g4 */
    public void m5755g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f3972D = new C0297c(getChildFragmentManager(), 1);
        ConversationListFrag conversationListFragM5194i5 = ConversationListFrag.m5194i5(true);
        this.f3977G = conversationListFragM5194i5;
        this.f3975F.add(conversationListFragM5194i5);
        WhisperListFrag whisperListFragM6498i5 = WhisperListFrag.m6498i5();
        this.f3979H = whisperListFragM6498i5;
        this.f3975F.add(whisperListFragM6498i5);
        this.f3971C.setAdapter(this.f3972D);
        this.f3972D.m5773l(this.f3975F);
        this.f3971C.setScrollble(false);
        this.f3971C.d(new C0295a());
        if (NullChecker.a(getArguments()) && getArguments().containsKey("init_conversation_tab_index")) {
            this.f3971C.setCurrentItem(getArguments().getInt("init_conversation_tab_index", 0));
        }
        r6n.m21419f().f19665k.put("");
        m5726H5();
    }

    /* JADX INFO: renamed from: g6 */
    public final void m5756g6() {
        act().setTitle("", false);
    }

    /* JADX INFO: renamed from: h6 */
    public void m5757h6(boolean z) {
        if (NullChecker.a(this.f3995X)) {
            this.f3995X.m5380h(z);
        }
    }

    /* JADX INFO: renamed from: i6 */
    public void m5759i6(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (NullChecker.a(this.f3995X)) {
            this.f3995X.m5381i(m5748c0(), loveLetterEntryInfo);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LaunchStep launchStep = LaunchStep.MsgDoubleTabInflate;
        yni.m25474f(launchStep);
        FrameLayout frameLayout = new FrameLayout(m5719C0());
        this.f3970B = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        yni.m25472d(launchStep);
        LaunchStep launchStep2 = LaunchStep.MsgSearchInflate;
        yni.m25474f(launchStep2);
        VPager vPager = new VPager(m5719C0());
        this.f3971C = vPager;
        vPager.setId(u4c0.m9);
        this.f3970B.addView((View) this.f3971C, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        yni.m25472d(launchStep2);
        View view = new View(act());
        this.f3980I = view;
        view.setBackgroundColor(Color.parseColor("#7fffffff"));
        this.f3970B.addView(this.f3980I);
        xdl0.M(this.f3980I, false);
        CoreBusinessModule.m0().g(this);
        return this.f3970B;
    }

    /* JADX INFO: renamed from: j6 */
    public void m5760j6(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (NullChecker.a(this.f3995X)) {
            this.f3995X.m5382j(loveLetterEntryInfo);
        }
    }

    /* JADX INFO: renamed from: k6 */
    public void m5761k6() {
        if (NullChecker.a(this.f3995X)) {
            this.f3995X.m5383k();
        }
    }

    /* JADX INFO: renamed from: l6 */
    public void m5762l6(boolean z) {
        View view = this.f3980I;
        if (z) {
            view.setVisibility(0);
            this.f3980I.setOnTouchListener(new View.OnTouchListener() { // from class: l.qr6
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f19469a.m5743X5(view2, motionEvent);
                }
            });
        } else {
            view.setVisibility(4);
            this.f3980I.setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final void m5763m6() {
        if (upa.a2()) {
            duringCreated(CoreModule.c.f0.xe()).filter(new w9j() { // from class: l.dr6
                public final Object call(Object obj) {
                    return this.f11968a.m5744Y5((roj0) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.er6
                public final void call(Object obj) {
                    this.f12665a.m5745Z5((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n4 */
    public void m5764n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        setHasOptionsMenu(true);
        act().getSupportActionBar().w(false);
        act().getSupportActionBar().y(false);
        m5756g6();
        CoreBusinessModule.m0().d(this);
    }

    /* JADX INFO: renamed from: n6 */
    public void m5765n6() {
        if (r65.m()) {
            CityCentreConfig cityCentreConfigI = y19.i();
            double dM18550o = (mqi0.m18550o() - CoreModule.c.h2.R) / 1000.0d;
            if (!NullChecker.a(cityCentreConfigI) || dM18550o <= cityCentreConfigI.refresh_interval_seconds) {
                return;
            }
            if (r65.m()) {
                CoreModule.c.h2.T3();
            }
            if (CoreModule.c.e0.p9().isFemale()) {
                return;
            }
            r65.l().o();
        }
    }

    /* JADX INFO: renamed from: o6 */
    public void m5766o6() {
        if (NullChecker.a(this.f3995X)) {
            this.f3995X.m5384l(this.f3984M == this.f3975F.indexOf(this.f3977G));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3987P.m24527Z();
        this.f3987P.m24528a0();
    }

    public void onCreateOptionsMenu(@NonNull final Menu menu, @NonNull MenuInflater menuInflater) {
        this.f3986O = menu;
        final NewMainAct newMainActAct = act();
        xaj0 xaj0VarInitSearchMenu = newMainActAct.initSearchMenu(menu, menuInflater);
        if (xaj0VarInitSearchMenu == null) {
            return;
        }
        act().toolbar().setContentInsetsRelative(0, act().toolbar().getContentInsetRight());
        SearchView searchView = (SearchView) xaj0VarInitSearchMenu.a;
        this.f3981J = searchView;
        this.f3982K = (View) xaj0VarInitSearchMenu.b;
        this.f3983L = (View) xaj0VarInitSearchMenu.c;
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: l.xr6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22697a.m5737R5(newMainActAct, view);
            }
        });
        this.f3981J.setOnQueryTextListener(new C0296b());
        this.f3981J.setOnCloseListener(new SearchView.l() { // from class: l.yr6
            public final boolean onClose() {
                return this.f23213a.m5738S5();
            }
        });
        final ArrayList arrayList = new ArrayList();
        arrayList.add("-1");
        if (NullChecker.a(this.f3985N)) {
            mkd0.z(this.f3985N);
        }
        this.f3985N = act().duringCreated(new v9j() { // from class: l.zr6
            public final Object call() {
                return this.f23849a.m5735P5(arrayList);
            }
        }).distinctUntilChanged().take(1).subscribe(mkd0.G(new e30() { // from class: l.as6
            public final void call(Object obj) {
                this.f9660a.m5736Q5(menu, (Integer) obj);
            }
        }));
        ((ImageView) this.f3981J.findViewById(s5c0.D)).setImageDrawable(getResources().getDrawable(x2c0.ka));
        xdl0.M(this.f3981J, false);
        this.f3987P.m24526U0();
    }

    public void onHiddenChanged(boolean z) {
        if (NullChecker.a(this.f3972D) && CoreModule.N().ko()) {
            for (int i = 0; i < this.f3972D.getCount(); i++) {
                ConversationListFrag item = this.f3972D.getItem(i);
                if (item instanceof ConversationListFrag) {
                    item.m5213w5(z);
                }
            }
        }
        if (z) {
            CoreModule.c.f0.R.m17233c();
        } else {
            this.f3996Y = true;
        }
        if (z && CoreModule.c.f0.n2.size() > 0) {
            g gVar = CoreModule.c.f0;
            gVar.Sn(gVar.n2);
        }
        this.f3987P.m24525S0(z);
        if (z) {
            if (NullChecker.a(this.f3981J)) {
                this.f3981J.setQuery("", true);
                this.f3981J.setIconified(true);
            }
            d.l().k("all_match_tip_key");
        } else {
            boolean z2 = NullChecker.a(this.f3979H) && this.f3984M == this.f3975F.indexOf(this.f3979H);
            m5767p6(z2);
            if (z2) {
                CoreModule.c.e0.O6.put(Long.valueOf(mqi0.m18550o()));
                CoreModule.c.f0.r2.onNext(Boolean.FALSE);
                if (NullChecker.a(this.f3994W)) {
                    this.f3994W.m5172l(false);
                }
                this.f3979H.m6514u5();
            }
            m5756g6();
            m4015U4();
            if (CoreModule.Q().m9005Ei(3)) {
                CoreModule.Q().m9018Lh().m11272j();
            } else if (CoreModule.Q().m9040a().m14848c() || CoreModule.Q().m9040a().m14849d()) {
                CoreModule.Q().m9018Lh().m11265c();
            }
            if (u59.T()) {
                CoreModule.c.r0.J6();
            }
            if (NullChecker.a(this.f3977G)) {
                this.f3977G.m5216z5();
            }
            if (upa.D2()) {
                boolean zF = hu40.a().f(act(), true);
                if (NullChecker.a(this.f3977G) && NullChecker.a(this.f3977G.f3758z) && NullChecker.a(this.f3977G.f3758z.f3863E0) && !zF && !this.f3977G.f3758z.f3863E0.m5668k0() && hu40.a().c()) {
                    this.f3977G.f3758z.f3863E0.m5657K0();
                }
                hu40.a().f(act(), true);
            }
        }
        if (!z && upa.k2()) {
            CoreModule.c.f0.vp(l9b.C(mqi0.m18550o(), ((Long) CoreModule.c.f0.h1.get()).longValue()), upa.z0(), upa.A0(), false);
        }
        if (z) {
            d.l().k("showNewMatchUserGuidePop");
            d.l().k("newUserShowGuidePop");
        }
        if (!z && vy8.e()) {
            act().duringCreated(CoreModule.c.S1.E3().flatMap(new w9j() { // from class: l.cr6
                public final Object call(Object obj) {
                    return CoreModule.c.S1.S3(((Boolean) obj).booleanValue());
                }
            })).subscribe(mkd0.F());
        }
        this.f3977G.getClass();
        boolean zA = NullChecker.a((Object) null);
        ConversationListFrag conversationListFrag = this.f3977G;
        if (zA) {
            conversationListFrag.getClass();
            throw null;
        }
        if (NullChecker.a(conversationListFrag) && NullChecker.a(this.f3977G.f3758z) && NullChecker.a(this.f3977G.f3758z.f3863E0) && !z) {
            this.f3977G.f3758z.f3863E0.m5679v0();
        }
        if (!z) {
            m5765n6();
        }
        if (!z) {
            CoreModule.c.f0.lp();
        }
        if (!z && CoreModule.Q().m9019M6().m12084c()) {
            CoreModule.Q().m9019M6().m12096o(act());
        }
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
    }

    public void onPrepareOptionsMenu(@NonNull Menu menu) {
        super/*androidx.fragment.app.Fragment*/.onPrepareOptionsMenu(menu);
        m5767p6(NullChecker.a(this.f3979H) && this.f3984M == this.f3975F.indexOf(this.f3979H));
    }

    /* JADX INFO: renamed from: p6 */
    public final void m5767p6(boolean z) {
        MenuItem menuItemFindItem;
        Menu menu = this.f3986O;
        if (menu == null || (menuItemFindItem = menu.findItem(u4c0.l8)) == null) {
            return;
        }
        if (z) {
            menuItemFindItem.setVisible(false);
        } else if (((Boolean) CoreModule.c.e0.t0.get()).booleanValue() || CoreModule.c.e0.p9().isVIP()) {
            menuItemFindItem.setVisible(true);
        }
    }

    public String pageId() {
        return "p_messages_view";
    }

    /* JADX INFO: renamed from: y4 */
    public void m5768y4() {
        super/*com.p1.mobile.android.app.Frag*/.y4();
        if (NullChecker.a(this.f3972D)) {
            this.f3972D.m5772k(getChildFragmentManager());
        }
    }
}
