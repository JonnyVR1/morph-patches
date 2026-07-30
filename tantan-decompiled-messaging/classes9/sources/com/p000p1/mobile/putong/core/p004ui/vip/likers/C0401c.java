package com.p000p1.mobile.putong.core.p004ui.vip.likers;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Menu;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.C0401c;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.PicksItemView;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.header.PicksHeaderView;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.MemberZoneFilter;
import com.p1.mobile.putong.core.data.PicksUser;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.LikersLimit;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.b3c0;
import l.bhr;
import l.d30;
import l.e30;
import l.e51;
import l.hpd0;
import l.j760;
import l.jo0;
import l.jq2;
import l.mkd0;
import l.q860;
import l.vwb;
import l.w9j;
import l.x9j;
import l.zgq0;
import p006l.bzc0;
import p006l.gr9;
import p006l.mlr;
import p006l.ptl;
import p006l.qib0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0401c extends jq2<mlr> implements ptl {

    /* JADX INFO: renamed from: a */
    public long f7118a;

    /* JADX INFO: renamed from: b */
    public long f7119b;

    /* JADX INFO: renamed from: c */
    public Links f7120c;

    /* JADX INFO: renamed from: d */
    public User f7121d;

    /* JADX INFO: renamed from: e */
    public ViewGroup f7122e;

    /* JADX INFO: renamed from: f */
    public boolean f7123f;

    /* JADX INFO: renamed from: g */
    public String f7124g;

    /* JADX INFO: renamed from: h */
    public BusinessEntranceStyle f7125h;

    /* JADX INFO: renamed from: i */
    public int f7126i;

    /* JADX INFO: renamed from: j */
    public long f7127j;

    /* JADX INFO: renamed from: k */
    public Act f7128k;

    /* JADX INFO: renamed from: l */
    public LikersFrag f7129l;

    /* JADX INFO: renamed from: m */
    public final hpd0 f7130m;

    /* JADX INFO: renamed from: n */
    public final hpd0 f7131n;

    /* JADX INFO: renamed from: o */
    public rx.subjects.a<Boolean> f7132o;

    /* JADX INFO: renamed from: p */
    public rx.subjects.a<Boolean> f7133p;

    /* JADX INFO: renamed from: q */
    public boolean f7134q;

    /* JADX INFO: renamed from: r */
    public boolean f7135r;

    /* JADX INFO: renamed from: s */
    public boolean f7136s;

    /* JADX INFO: renamed from: t */
    public Runnable f7137t;

    /* JADX INFO: renamed from: u */
    public final Runnable f7138u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0401c.this.m10131C1(null);
            C0401c.this.f7119b = SystemClock.elapsedRealtime();
            C0401c.this.f7123f = false;
        }
    }

    public C0401c(LikersFrag likersFrag) {
        super(likersFrag);
        this.f7120c = null;
        this.f7121d = null;
        this.f7122e = null;
        this.f7123f = false;
        this.f7126i = 0;
        String str = "see_help_clicked_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f7130m = new hpd0(str, bool);
        this.f7131n = new hpd0("has_see_guide_anim_shown_" + CoreModule.m1850H().userId(), bool);
        Boolean bool2 = Boolean.TRUE;
        this.f7132o = rx.subjects.a.c(bool2);
        this.f7133p = rx.subjects.a.c(bool2);
        this.f7135r = false;
        this.f7136s = false;
        this.f7137t = new a();
        this.f7138u = new Runnable() { // from class: l.kkr
            @Override // java.lang.Runnable
            public final void run() {
                this.f15868a.m10126t1();
            }
        };
        this.f7128k = likersFrag.act();
        this.f7129l = likersFrag;
        boolean zM15939h = gr9.m15939h();
        this.f7135r = zM15939h;
        if (zM15939h) {
            zgq0.k().n();
        }
    }

    /* JADX INFO: renamed from: B1 */
    private void m10089B1() {
        CoreModule.f1534c.f3676u0.m2384m5();
        ((mlr) ((jq2) this).viewModel).m19310W(false);
        if (m10146Q1()) {
            CoreModule.f1534c.f3676u0.m2367f7(10, this.f7118a, "");
        } else {
            CoreModule.f1534c.f3676u0.m2347V6(this.f7120c, this.f7118a, 0, "");
        }
        this.f7119b = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ Boolean m10101P0(MemberZoneFilter memberZoneFilter, MemberZoneFilter memberZoneFilter2) {
        return zgq0.k().j() ? Boolean.FALSE : Boolean.valueOf(memberZoneFilter.equals(memberZoneFilter2));
    }

    /* JADX INFO: renamed from: W0 */
    private void m10105W0() {
        CoreModule.f1534c.f3676u0.m2378k5();
        this.f7118a = ((Long) CoreModule.f1534c.f3676u0.f3243k0.get()).longValue();
        m10143O1();
        m10089B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m10110h1() {
        if (m10146Q1()) {
            m10142N1("seepageBottomReach");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m10118o1(Bundle bundle) {
        act().setTitle(R.string.Y0);
        if (m10139J1(this.f7124g)) {
            ((mlr) ((jq2) this).viewModel).m19308U(b3c0.u0);
        }
        ((mlr) ((jq2) this).viewModel).m19296G();
        ((mlr) ((jq2) this).viewModel).m19297H(new d30() { // from class: l.qkr
            public final void call() {
                this.f19875a.m10110h1();
            }
        });
        ((mlr) ((jq2) this).viewModel).m19309V();
        ((mlr) ((jq2) this).viewModel).mo19264a(true, false);
        if (((Boolean) CoreModule.f1534c.f3676u0.f3247o0.get()).booleanValue()) {
            return;
        }
        CoreModule.f1534c.f3676u0.f3247o0.put(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m10120p1() {
        e51.J(this.f7137t);
        e51.J(((mlr) ((jq2) this).viewModel).f17042J);
        e51.J(this.f7138u);
        if (bzc0.m13040f()) {
            bzc0.m13038c().m13042g("see");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m10124s1() {
        this.f7133p.onNext(Boolean.FALSE);
        CoreModule.f1543l.m11706a().m5227Bb(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m10126t1() {
        ((mlr) ((jq2) this).viewModel).m19316c0(new d30() { // from class: l.rkr
            public final void call() {
                this.f20595a.m10124s1();
            }
        });
    }

    /* JADX INFO: renamed from: C1 */
    public void m10131C1(Links links) {
        if (this.f7136s) {
            CoreModule.f1534c.f3659o1.m24144j3(zgq0.k().i(), links != null ? links.next : null, Converter.dateToApiTimeString(this.f7118a));
        } else {
            CoreModule.f1534c.f3676u0.m2347V6(links, this.f7118a, 0, "");
        }
        this.f7119b = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m10132D1(int i, final int i2, final Intent intent) {
        if (i == CoreModule.f1543l.m11706a().m5236Ck()) {
            if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
                return false;
            }
            lifecycle().takeFirst(new w9j() { // from class: l.lkr
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.mkr
                public final void call(Object obj) {
                    this.f17015a.m10172u1(i2, intent, (c) obj);
                }
            }));
            return true;
        }
        if (i == 786) {
            CoreMemberModule.F().b().Yq(i2, intent, this.f7128k);
            return true;
        }
        if (i != CoreMemberModule.F().b().bj()) {
            return false;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.okr
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.pkr
            public final void call(Object obj) {
                this.f19176a.m10173v1(i2, intent, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: E */
    public void m10133E(User user, boolean z, boolean z2) {
        this.f7121d = user;
        if (!m10148V0(z, false, z2, false, 0, ((Media) user.pictures.get(0)).url)) {
            this.f7129l.m10021P4().notifyDataSetChanged();
        }
        CoreMemberModule.F().b().An(user);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m10134E1() {
        return ((mlr) ((jq2) this).viewModel).m19326z();
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m10135F1(Menu menu) {
        ((mlr) ((jq2) this).viewModel).m19290A(menu);
        ((mlr) ((jq2) this).viewModel).m19307T(((Boolean) this.f7130m.get()).booleanValue());
        if (((Boolean) this.f7130m.get()).booleanValue()) {
            return true;
        }
        this.f7130m.put(Boolean.TRUE);
        return true;
    }

    /* JADX INFO: renamed from: H1 */
    public void m10136H1(User user, boolean z, boolean z2) {
        this.f7121d = user;
        if (m10148V0(z, false, false, true, 0, ((Media) user.pictures.get(0)).url)) {
            return;
        }
        this.f7129l.m10021P4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m10137I1(MemberZoneFilter memberZoneFilter) {
        CoreModule.f1534c.f3659o1.m24144j3(memberZoneFilter, null, Converter.dateToApiTimeString(this.f7118a));
    }

    @Override // p006l.ptl
    /* JADX INFO: renamed from: J */
    public void mo10138J(int i) {
        this.f7126i = i;
    }

    /* JADX INFO: renamed from: J1 */
    public final boolean m10139J1(String str) {
        return "push_call2buysee".equals(str) || "push_call2buysee_side_new".equals(str) || "msg_call2buysee".equals(str) || "msg_call2buysee_side_new".equals(str);
    }

    @Override // p006l.ptl
    /* JADX INFO: renamed from: L */
    public void mo10140L(User user) {
        CoreMemberModule.F().b().lm(this.f7128k, user, "[摆手]", false, (Runnable) null, (Runnable) null, "QuickGreeting");
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m10141L1() {
        return ("push_call2buysee_side_new".equals(this.f7124g) || "msg_call2buysee_side_new".equals(this.f7124g)) && CoreModule.f1543l.m11706a().m5426e2();
    }

    /* JADX INFO: renamed from: N1 */
    public void m10142N1(String str) {
        if (SystemClock.elapsedRealtime() - this.f7127j >= 300) {
            CoreMemberModule.F().b().l1(act(), str);
            this.f7127j = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m10143O1() {
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        CoreModule.f1534c.f3676u0.f3243k0.put(Long.valueOf(jGuessedCurrentServerTime));
        CoreModule.f1534c.f3676u0.f3244l0.put(Long.valueOf(jGuessedCurrentServerTime));
        CoreModule.f1534c.f3676u0.f3245m0.put(Long.valueOf(jGuessedCurrentServerTime));
    }

    @Override // p006l.ptl
    /* JADX INFO: renamed from: P */
    public String mo10144P(int i) {
        Act act = this.f7128k;
        if (i <= 0) {
            return act.string(R.string.Y0);
        }
        return act.getString(R.string.X0, i > 99 ? "99+" : String.valueOf(i));
    }

    /* JADX INFO: renamed from: P1 */
    public final void m10145P1() {
        duringCreated(CoreModule.f1534c.m3413n3()).filter(new w9j() { // from class: l.skr
            public final Object call(Object obj) {
                return Boolean.valueOf(((Counter) obj).likersLimit.remaining > 0);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.tkr
            public final void call(Object obj) {
                this.f22161a.m10174x1((Counter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m10146Q1() {
        return m10139J1(this.f7124g) && CoreModule.f1543l.m11706a().m5426e2();
    }

    /* JADX INFO: renamed from: U0 */
    public String m10147U0() {
        return this.f7124g;
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m10148V0(boolean z, boolean z2, boolean z3, boolean z4, int i, String str) {
        return CoreMemberModule.F().b().fe(z, z2, z3, z4, i, str, this, ((jq2) this).viewModel, this.f7129l);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m10149X0() {
        return this.f7136s;
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m10150Y0() {
        return this.f7135r && this.f7136s;
    }

    /* JADX INFO: renamed from: Z */
    public void m10151Z() {
        super.Z();
        this.f7124g = act().getIntent().getStringExtra("from");
        this.f7125h = this.f7128k.getIntent().getSerializableExtra("style");
        this.f7134q = act().getIntent().getBooleanExtra("show_giving_boost", false);
        if (((Boolean) this.f7131n.get()).booleanValue()) {
            this.f7133p.onNext(Boolean.FALSE);
        }
        m10105W0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m10152a0() {
        super.a0();
        creates(new e30() { // from class: l.rjr
            public final void call(Object obj) {
                this.f20585a.m10118o1((Bundle) obj);
            }
        }, new d30() { // from class: l.tjr
            public final void call() {
                this.f22145a.m10120p1();
            }
        });
        if (m10139J1(this.f7124g)) {
            duringCreated(CoreModule.f1534c.m3413n3()).map(new w9j() { // from class: l.dkr
                public final Object call(Object obj) {
                    return ((Counter) obj).likersLimit;
                }
            }).distinctUntilChanged().skip(1).subscribe(mkd0.G(new e30() { // from class: l.ekr
                public final void call(Object obj) {
                    this.f11215a.m10169q1((LikersLimit) obj);
                }
            }));
            duringCreated(CoreModule.f1534c.f3676u0.m2339R6()).filter(new w9j() { // from class: l.fkr
                public final Object call(Object obj) {
                    return Boolean.valueOf(CoreModule.f1543l.m11706a().m5426e2());
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.gkr
                public final void call(Object obj) {
                    this.f13350a.m10170r1((j760) obj);
                }
            }));
        }
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.hkr
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ikr
            public final void call(Object obj) {
                this.f14535a.m10153a1((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).map(new w9j() { // from class: l.jkr
            public final Object call(Object obj) {
                return ((User) obj).settings;
            }
        }).distinctUntilChanged(new bhr()).skip(1).doOnNext(new e30() { // from class: l.ckr
            public final void call(Object obj) {
                this.f9706a.m10154b1((Settings) obj);
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.nkr
            public final void call(Object obj) {
                this.f17736a.m10156c1((Settings) obj);
            }
        }));
        duringCreated(mkd0.r(CoreModule.f1534c.f3676u0.m2323J6(), this.f7132o, new x9j() { // from class: l.ukr
            public final Object call(Object obj, Object obj2) {
                return this.f23593a.m10157d1((q860) obj, (Boolean) obj2);
            }
        })).filter(new w9j() { // from class: l.vkr
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) ((Pair) obj).second).booleanValue());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.wkr
            public final void call(Object obj) {
                this.f25206a.m10158e1((Pair) obj);
            }
        }));
        if (this.f7135r) {
            duringCreated(zgq0.k().h()).distinctUntilChanged(new x9j() { // from class: l.xkr
                public final Object call(Object obj, Object obj2) {
                    return C0401c.m10101P0((MemberZoneFilter) obj, (MemberZoneFilter) obj2);
                }
            }).skip(1).subscribe(mkd0.G(new e30() { // from class: l.ykr
                public final void call(Object obj) {
                    this.f28278a.m10159f1((MemberZoneFilter) obj);
                }
            }));
            duringCreated(CoreModule.f1534c.f3659o1.m24143i3()).filter(new w9j() { // from class: l.zkr
                public final Object call(Object obj) {
                    return this.f28795a.m10160g1((q860) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.alr
                public final void call(Object obj) {
                    this.f8348a.m10161i1((q860) obj);
                }
            }));
        }
        duringCreated(CoreModule.f1534c.f3676u0.m2323J6()).filter(new w9j() { // from class: l.sjr
            public final Object call(Object obj) {
                return this.f21387a.m10162j1((q860) obj);
            }
        }).filter(new w9j() { // from class: l.ujr
            public final Object call(Object obj) {
                return this.f23583a.m10164k1((q860) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.vjr
            public final void call(Object obj) {
                this.f24348a.m10166l1((q860) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21519wa()).subscribe(mkd0.G(new e30() { // from class: l.wjr
            public final void call(Object obj) {
                CoreModule.f1534c.f3628e0.m21515va(-1);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.xjr
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.yjr
            public final void call(Object obj) {
                this.f28252a.m10167m1((c) obj);
            }
        }));
        duringCreated(this.f7132o.filter(new w9j() { // from class: l.zjr
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).take(1)).filter(new w9j() { // from class: l.akr
            public final Object call(Object obj) {
                return Boolean.valueOf(!CoreModule.f1543l.m11706a().m5377X6());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.bkr
            public final void call(Object obj) {
                this.f8962a.m10168n1((Boolean) obj);
            }
        }));
        m10145P1();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m10153a1(NetworkInfo networkInfo) {
        m10105W0();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m10154b1(Settings settings) {
        e51.J(this.f7137t);
        CoreModule.f1534c.f3676u0.m2384m5();
    }

    /* JADX INFO: renamed from: c */
    public void m10155c(boolean z) {
        if (m10139J1(this.f7124g) && CoreModule.f1543l.m11706a().m5426e2()) {
            m10142N1(!z ? "seepageDislike" : "seepageLike");
        }
        this.f7129l.m10021P4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m10156c1(Settings settings) {
        this.f7120c = null;
        this.f7123f = false;
        CoreModule.f1534c.f3676u0.m2381l5();
        m10089B1();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Pair m10157d1(q860 q860Var, Boolean bool) {
        return Pair.create(Boolean.valueOf((((Boolean) this.f7131n.get()).booleanValue() || q860Var == null || q860Var.d() <= 0 || CoreModule.f1543l.m11706a().m5426e2() || IntlCountryCodeController.m21v()) ? false : true), bool);
    }

    public void destroy() {
        if (this.f7135r) {
            zgq0.k().n();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m10158e1(Pair pair) {
        if (!((Boolean) pair.first).booleanValue()) {
            CoreModule.f1543l.m11706a().m5227Bb(this.f7128k);
            return;
        }
        this.f7131n.put(Boolean.TRUE);
        ((mlr) ((jq2) this).viewModel).m19305R();
        e51.J(this.f7138u);
        e51.H(this.f7128k, this.f7138u, 700L);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m10159f1(MemberZoneFilter memberZoneFilter) {
        zgq0.k().p(false);
        if (!zgq0.k().l(memberZoneFilter)) {
            this.f7136s = true;
            m10137I1(memberZoneFilter);
            ((mlr) ((jq2) this).viewModel).m19310W(true);
        } else {
            if (this.f7136s) {
                CoreModule.f1534c.f3676u0.m2375j5();
                this.f7136s = false;
            }
            m10089B1();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ Boolean m10160g1(q860 q860Var) {
        return Boolean.valueOf(this.f7136s);
    }

    @Override // p006l.ptl
    public String getFrom() {
        return this.f7124g;
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m10161i1(q860 q860Var) {
        DbLinks dbLinks;
        this.f7120c = (q860Var == null || (dbLinks = q860Var.b) == null) ? null : dbLinks.links;
        ((mlr) ((jq2) this).viewModel).m19306S(q860Var);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ Boolean m10162j1(q860 q860Var) {
        return Boolean.valueOf(!m10146Q1());
    }

    @Override // p006l.ptl
    /* JADX INFO: renamed from: k */
    public User getClickedUser() {
        return this.f7121d;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ Boolean m10164k1(q860 q860Var) {
        return Boolean.valueOf(!m10150Y0());
    }

    @Override // p006l.ptl
    /* JADX INFO: renamed from: l */
    public int getSeeCount() {
        return this.f7126i;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m10166l1(q860 q860Var) {
        DbLinks dbLinks;
        this.f7120c = (q860Var == null || (dbLinks = q860Var.b) == null) ? null : dbLinks.links;
        int iD = q860Var == null ? 0 : q860Var.d();
        this.f7126i = iD;
        if (iD > 0) {
            this.f7123f = true;
        }
        ((mlr) ((jq2) this).viewModel).m19306S(q860Var);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m10167m1(c cVar) {
        if (((mlr) ((jq2) this).viewModel).m19295F()) {
            this.f7130m.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m10168n1(Boolean bool) {
        if (!CoreModule.m1854P().m11706a().m5523s8()) {
            ((mlr) ((jq2) this).viewModel).m19314a0();
        }
        ((mlr) ((jq2) this).viewModel).m19313Z(4000);
        ((mlr) ((jq2) this).viewModel).m19325y();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m10169q1(LikersLimit likersLimit) {
        m10089B1();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m10170r1(j760 j760Var) {
        Object obj = j760Var.b;
        int size = obj == null ? 0 : ((List) obj).size();
        if (size != ((Integer) j760Var.a).intValue() && size < 10) {
            m10089B1();
            return;
        }
        ((mlr) ((jq2) this).viewModel).m19294E();
        this.f7129l.m10021P4().m10074T((List) j760Var.b);
        boolean zJ = vwb.J((Collection) j760Var.b);
        ((mlr) ((jq2) this).viewModel).mo19264a(false, zJ);
        ((mlr) ((jq2) this).viewModel).m19315b0(!zJ);
        ((mlr) ((jq2) this).viewModel).m19312Y(zJ);
        int iIntValue = ((Integer) j760Var.a).intValue();
        this.f7126i = iIntValue;
        ((mlr) ((jq2) this).viewModel).setTitle(mo10144P(iIntValue));
    }

    @Override // p006l.ptl
    /* JADX INFO: renamed from: s */
    public ViewGroup getClickedItem() {
        return this.f7122e;
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m10172u1(int i, Intent intent, c cVar) {
        if (NullChecker.a(this.f7122e) && NullChecker.a(this.f7121d)) {
            int intExtra = 0;
            this.f7122e.setClickable(false);
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            String stringExtra = ((Media) this.f7121d.pictures.get(0)).url;
            if (NullChecker.a(intent)) {
                intExtra = intent.getIntExtra("currentImageIndex", 0);
                stringExtra = intent.getStringExtra("currentImageUrl");
            }
            m10148V0(z, z2, true, false, intExtra, stringExtra);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m10173v1(int i, Intent intent, c cVar) {
        PicksHeaderView picksHeaderViewM19292C = ((mlr) ((jq2) this).viewModel).m19292C();
        if (picksHeaderViewM19292C != null) {
            PicksItemView picksItemViewM19239j0 = picksHeaderViewM19292C.presenter.getClickedItem();
            PicksUser picksUser = picksHeaderViewM19292C.presenter.clickedUser;
            if (NullChecker.a(picksItemViewM19239j0) && NullChecker.a(picksUser)) {
                User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(picksUser.id);
                int intExtra = 0;
                boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
                SwipeDirection swipeDirection = SwipeDirection.UP;
                boolean z2 = i == swipeDirection.getValue();
                String stringExtra = ((Media) userM21393Pa.pictures.get(0)).url;
                String stringExtra2 = null;
                if (NullChecker.a(intent)) {
                    intExtra = intent.getIntExtra("currentImageIndex", 0);
                    stringExtra = intent.getStringExtra("currentImageUrl");
                    if (i == swipeDirection.getValue()) {
                        stringExtra2 = intent.getStringExtra(CoreMemberModule.F().b().pc());
                    }
                }
                String str = stringExtra2;
                picksHeaderViewM19292C.presenter.m19243n0(z, z2, true, intExtra, stringExtra, userM21393Pa, str);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m10174x1(Counter counter) {
        boolean zBooleanValue = ((Boolean) CoreModule.f1534c.f3602V0.get()).booleanValue();
        rx.subjects.a<Boolean> aVar = this.f7132o;
        if (!zBooleanValue) {
            aVar.onNext(Boolean.FALSE);
        } else {
            aVar.onNext(Boolean.TRUE);
            ((mlr) ((jq2) this).viewModel).m19304P();
        }
    }

    /* JADX INFO: renamed from: z1 */
    public LikersItemView.LikersItemStyle m10175z1() {
        return m10141L1() ? LikersItemView.LikersItemStyle.newStyle1 : LikersItemView.LikersItemStyle.defaultStyle;
    }
}
