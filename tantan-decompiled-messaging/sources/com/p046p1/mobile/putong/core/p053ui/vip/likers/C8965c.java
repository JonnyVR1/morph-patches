package com.p046p1.mobile.putong.core.p053ui.vip.likers;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Menu;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MemberZoneFilter;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.C8965c;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.LikersLimit;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.TXLiteAVCode;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.subjects.C22392a;
import p149l.b3c0;
import p149l.bhr;
import p149l.bzc0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.gr9;
import p149l.hpd0;
import p149l.j760;
import p149l.jo0;
import p149l.jq2;
import p149l.mkd0;
import p149l.mlr;
import p149l.ptl;
import p149l.q860;
import p149l.qib0;
import p149l.qtl;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.zgq0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.c */
/* JADX INFO: loaded from: classes9.dex */
public class C8965c extends jq2<mlr> implements ptl {

    /* JADX INFO: renamed from: a */
    public long f37337a;

    /* JADX INFO: renamed from: b */
    public long f37338b;

    /* JADX INFO: renamed from: c */
    public Links f37339c;

    /* JADX INFO: renamed from: d */
    public User f37340d;

    /* JADX INFO: renamed from: e */
    public ViewGroup f37341e;

    /* JADX INFO: renamed from: f */
    public boolean f37342f;

    /* JADX INFO: renamed from: g */
    public String f37343g;

    /* JADX INFO: renamed from: h */
    public BusinessEntranceStyle f37344h;

    /* JADX INFO: renamed from: i */
    public int f37345i;

    /* JADX INFO: renamed from: j */
    public long f37346j;

    /* JADX INFO: renamed from: k */
    public Act f37347k;

    /* JADX INFO: renamed from: l */
    public LikersFrag f37348l;

    /* JADX INFO: renamed from: m */
    public final hpd0 f37349m;

    /* JADX INFO: renamed from: n */
    public final hpd0 f37350n;

    /* JADX INFO: renamed from: o */
    public C22392a<Boolean> f37351o;

    /* JADX INFO: renamed from: p */
    public C22392a<Boolean> f37352p;

    /* JADX INFO: renamed from: q */
    public boolean f37353q;

    /* JADX INFO: renamed from: r */
    public boolean f37354r;

    /* JADX INFO: renamed from: s */
    public boolean f37355s;

    /* JADX INFO: renamed from: t */
    public Runnable f37356t;

    /* JADX INFO: renamed from: u */
    public final Runnable f37357u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8965c.this.m56674C1(null);
            C8965c.this.f37338b = SystemClock.elapsedRealtime();
            C8965c.this.f37342f = false;
        }
    }

    public C8965c(LikersFrag likersFrag) {
        super(likersFrag);
        this.f37339c = null;
        this.f37340d = null;
        this.f37341e = null;
        this.f37342f = false;
        this.f37345i = 0;
        String str = "see_help_clicked_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f37349m = new hpd0(str, bool);
        this.f37350n = new hpd0("has_see_guide_anim_shown_" + CoreModule.m29931H().userId(), bool);
        Boolean bool2 = Boolean.TRUE;
        this.f37351o = C22392a.m221513c(bool2);
        this.f37352p = C22392a.m221513c(bool2);
        this.f37354r = false;
        this.f37355s = false;
        this.f37356t = new a();
        this.f37357u = new Runnable() { // from class: l.kkr
            @Override // java.lang.Runnable
            public final void run() {
                this.f123591a.m56669t1();
            }
        };
        this.f37347k = likersFrag.act();
        this.f37348l = likersFrag;
        boolean zM127683h = gr9.m127683h();
        this.f37354r = zM127683h;
        if (zM127683h) {
            zgq0.m218673k().m218680n();
        }
    }

    /* JADX INFO: renamed from: B1 */
    private void m56632B1() {
        CoreModule.f17545c.f19687u0.m30456m5();
        ((mlr) this.viewModel).m155228W(false);
        if (m56689Q1()) {
            CoreModule.f17545c.f19687u0.m30439f7(10, this.f37337a, "");
        } else {
            CoreModule.f17545c.f19687u0.m30419V6(this.f37339c, this.f37337a, 0, "");
        }
        this.f37338b = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ Boolean m56644P0(MemberZoneFilter memberZoneFilter, MemberZoneFilter memberZoneFilter2) {
        return zgq0.m218673k().getForceRefreshFilter() ? Boolean.FALSE : Boolean.valueOf(memberZoneFilter.equals(memberZoneFilter2));
    }

    /* JADX INFO: renamed from: W0 */
    private void m56648W0() {
        CoreModule.f17545c.f19687u0.m30450k5();
        this.f37337a = CoreModule.f17545c.f19687u0.f19254k0.get().longValue();
        m56686O1();
        m56632B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m56653h1() {
        if (m56689Q1()) {
            m56685N1("seepageBottomReach");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m56661o1(Bundle bundle) {
        act().setTitle(R$string.f20624Y0);
        if (m56682J1(this.f37343g)) {
            ((mlr) this.viewModel).m155226U(b3c0.f73162u0);
        }
        ((mlr) this.viewModel).m155214G();
        ((mlr) this.viewModel).m155215H(new d30() { // from class: l.qkr
            @Override // p149l.d30
            public final void call() {
                this.f155156a.m56653h1();
            }
        });
        ((mlr) this.viewModel).m155227V();
        ((mlr) this.viewModel).mo154901a(true, false);
        if (CoreModule.f17545c.f19687u0.f19258o0.get().booleanValue()) {
            return;
        }
        CoreModule.f17545c.f19687u0.f19258o0.put(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m56663p1() {
        e51.m114745J(this.f37356t);
        e51.m114745J(((mlr) this.viewModel).f134481J);
        e51.m114745J(this.f37357u);
        if (bzc0.m104566f()) {
            bzc0.m104564c().m104568g("see");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m56667s1() {
        this.f37352p.m132487l(Boolean.FALSE);
        CoreModule.f17554l.m94651a().mo33290Bb(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m56669t1() {
        ((mlr) this.viewModel).m155234c0(new d30() { // from class: l.rkr
            @Override // p149l.d30
            public final void call() {
                this.f159879a.m56667s1();
            }
        });
    }

    /* JADX INFO: renamed from: C1 */
    public void m56674C1(Links links) {
        if (this.f37355s) {
            CoreModule.f17545c.f19670o1.m185638j3(zgq0.m218673k().m218677i(), links != null ? links.next : null, Converter.dateToApiTimeString(this.f37337a));
        } else {
            CoreModule.f17545c.f19687u0.m30419V6(links, this.f37337a, 0, "");
        }
        this.f37338b = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m56675D1(int i, final int i2, final Intent intent) {
        if (i == CoreModule.f17554l.m94651a().mo33299Ck()) {
            if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
                return false;
            }
            lifecycle().takeFirst(new w9j() { // from class: l.lkr
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.mkr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f134374a.m56713u1(i2, intent, (C4319c) obj);
                }
            }));
            return true;
        }
        if (i == 786) {
            CoreMemberModule.m36001F().m132651b().mo35981Yq(i2, intent, this.f37347k);
            return true;
        }
        if (i != CoreMemberModule.m36001F().m132651b().mo35984bj()) {
            return false;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.okr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.pkr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150020a.m56714v1(i2, intent, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: E */
    public void m56676E(User user, boolean z, boolean z2) {
        this.f37340d = user;
        if (!m56691V0(z, false, z2, false, 0, user.pictures.get(0).url)) {
            this.f37348l.m56579P4().notifyDataSetChanged();
        }
        CoreMemberModule.m36001F().m132651b().mo35969An(user);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m56677E1() {
        return ((mlr) this.viewModel).m155243z();
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m56678F1(Menu menu) {
        ((mlr) this.viewModel).m155209A(menu);
        ((mlr) this.viewModel).m155225T(this.f37349m.get().booleanValue());
        if (this.f37349m.get().booleanValue()) {
            return true;
        }
        this.f37349m.put(Boolean.TRUE);
        return true;
    }

    /* JADX INFO: renamed from: H1 */
    public void m56679H1(User user, boolean z, boolean z2) {
        this.f37340d = user;
        if (m56691V0(z, false, false, true, 0, user.pictures.get(0).url)) {
            return;
        }
        this.f37348l.m56579P4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m56680I1(MemberZoneFilter memberZoneFilter) {
        CoreModule.f17545c.f19670o1.m185638j3(memberZoneFilter, null, Converter.dateToApiTimeString(this.f37337a));
    }

    @Override // p149l.ptl
    /* JADX INFO: renamed from: J */
    public void mo56681J(int i) {
        this.f37345i = i;
    }

    /* JADX INFO: renamed from: J1 */
    public final boolean m56682J1(String str) {
        return SchemeKey.push_call2buysee.equals(str) || SchemeKey.push_call2buysee_side_new.equals(str) || "msg_call2buysee".equals(str) || "msg_call2buysee_side_new".equals(str);
    }

    @Override // p149l.ptl
    /* JADX INFO: renamed from: L */
    public void mo56683L(User user) {
        CoreMemberModule.m36001F().m132651b().mo35992lm(this.f37347k, user, "[摆手]", false, null, null, "QuickGreeting");
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m56684L1() {
        return (SchemeKey.push_call2buysee_side_new.equals(this.f37343g) || "msg_call2buysee_side_new".equals(this.f37343g)) && CoreModule.f17554l.m94651a().mo33489e2();
    }

    /* JADX INFO: renamed from: N1 */
    public void m56685N1(String str) {
        if (SystemClock.elapsedRealtime() - this.f37346j >= 300) {
            CoreMemberModule.m36001F().m132651b().mo35991l1(act(), str);
            this.f37346j = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m56686O1() {
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(jGuessedCurrentServerTime));
        CoreModule.f17545c.f19687u0.f19255l0.put(Long.valueOf(jGuessedCurrentServerTime));
        CoreModule.f17545c.f19687u0.f19256m0.put(Long.valueOf(jGuessedCurrentServerTime));
    }

    @Override // p149l.ptl
    /* JADX INFO: renamed from: P */
    public String mo56687P(int i) {
        Act act = this.f37347k;
        if (i <= 0) {
            return act.string(R$string.f20624Y0);
        }
        return act.getString(R$string.f20622X0, i > 99 ? "99+" : String.valueOf(i));
    }

    /* JADX INFO: renamed from: P1 */
    public final void m56688P1() {
        duringCreated(CoreModule.f17545c.m31483n3()).filter(new w9j() { // from class: l.skr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Counter) obj).likersLimit.remaining > 0);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.tkr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170910a.m56715x1((Counter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m56689Q1() {
        return m56682J1(this.f37343g) && CoreModule.f17554l.m94651a().mo33489e2();
    }

    /* JADX INFO: renamed from: U0 */
    public String m56690U0() {
        return this.f37343g;
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m56691V0(boolean z, boolean z2, boolean z3, boolean z4, int i, String str) {
        return CoreMemberModule.m36001F().m132651b().mo35988fe(z, z2, z3, z4, i, str, this, (qtl) this.viewModel, this.f37348l);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m56692X0() {
        return this.f37355s;
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m56693Y0() {
        return this.f37354r && this.f37355s;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f37343g = act().getIntent().getStringExtra("from");
        this.f37344h = (BusinessEntranceStyle) this.f37347k.getIntent().getSerializableExtra("style");
        this.f37353q = act().getIntent().getBooleanExtra("show_giving_boost", false);
        if (this.f37350n.get().booleanValue()) {
            this.f37352p.m132487l(Boolean.FALSE);
        }
        m56648W0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.rjr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159738a.m56661o1((Bundle) obj);
            }
        }, new d30() { // from class: l.tjr
            @Override // p149l.d30
            public final void call() {
                this.f170793a.m56663p1();
            }
        });
        if (m56682J1(this.f37343g)) {
            duringCreated(CoreModule.f17545c.m31483n3()).map(new w9j() { // from class: l.dkr
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Counter) obj).likersLimit;
                }
            }).distinctUntilChanged().skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.ekr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92006a.m56710q1((LikersLimit) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19687u0.m30411R6()).filter(new w9j() { // from class: l.fkr
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(CoreModule.f17554l.m94651a().mo33489e2());
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.gkr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103219a.m56711r1((j760) obj);
                }
            }));
        }
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.hkr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ikr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113721a.m56694a1((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.jkr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).settings;
            }
        }).distinctUntilChanged(new bhr()).skip(1).doOnNext(new e30() { // from class: l.ckr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81348a.m56695b1((Settings) obj);
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.nkr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139458a.m56697c1((Settings) obj);
            }
        }));
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19687u0.m30395J6(), this.f37351o, new x9j() { // from class: l.ukr
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f176953a.m56698d1((q860) obj, (Boolean) obj2);
            }
        })).filter(new w9j() { // from class: l.vkr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) ((Pair) obj).second).booleanValue());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.wkr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186800a.m56699e1((Pair) obj);
            }
        }));
        if (this.f37354r) {
            duringCreated(zgq0.m218673k().m218676h()).distinctUntilChanged(new x9j() { // from class: l.xkr
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return C8965c.m56644P0((MemberZoneFilter) obj, (MemberZoneFilter) obj2);
                }
            }).skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.ykr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198825a.m56700f1((MemberZoneFilter) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19670o1.m185637i3()).filter(new w9j() { // from class: l.zkr
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f203558a.m56701g1((q860) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.alr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f70508a.m56702i1((q860) obj);
                }
            }));
        }
        duringCreated(CoreModule.f17545c.f19687u0.m30395J6()).filter(new w9j() { // from class: l.sjr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f164898a.m56703j1((q860) obj);
            }
        }).filter(new w9j() { // from class: l.ujr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176810a.m56705k1((q860) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.vjr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181745a.m56707l1((q860) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169556wa()).subscribe(mkd0.m154955G(new e30() { // from class: l.wjr
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169552va(-1);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.xjr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.yjr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198676a.m56708m1((C4319c) obj);
            }
        }));
        duringCreated(this.f37351o.filter(new w9j() { // from class: l.zjr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).take(1)).filter(new w9j() { // from class: l.akr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!CoreModule.f17554l.m94651a().mo33440X6());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.bkr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76124a.m56709n1((Boolean) obj);
            }
        }));
        m56688P1();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m56694a1(NetworkInfo networkInfo) {
        m56648W0();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m56695b1(Settings settings) {
        e51.m114745J(this.f37356t);
        CoreModule.f17545c.f19687u0.m30456m5();
    }

    /* JADX INFO: renamed from: c */
    public void m56696c(boolean z) {
        if (m56682J1(this.f37343g) && CoreModule.f17554l.m94651a().mo33489e2()) {
            m56685N1(!z ? "seepageDislike" : "seepageLike");
        }
        this.f37348l.m56579P4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m56697c1(Settings settings) {
        this.f37339c = null;
        this.f37342f = false;
        CoreModule.f17545c.f19687u0.m30453l5();
        m56632B1();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Pair m56698d1(q860 q860Var, Boolean bool) {
        return Pair.create(Boolean.valueOf((this.f37350n.get().booleanValue() || q860Var == null || q860Var.m173344d() <= 0 || CoreModule.f17554l.m94651a().mo33489e2() || IntlCountryCodeController.m28126v()) ? false : true), bool);
    }

    @Override // p149l.q0m
    public void destroy() {
        if (this.f37354r) {
            zgq0.m218673k().m218680n();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m56699e1(Pair pair) {
        if (!((Boolean) pair.first).booleanValue()) {
            CoreModule.f17554l.m94651a().mo33290Bb(this.f37347k);
            return;
        }
        this.f37350n.put(Boolean.TRUE);
        ((mlr) this.viewModel).m155223R();
        e51.m114745J(this.f37357u);
        e51.m114743H(this.f37347k, this.f37357u, 700L);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m56700f1(MemberZoneFilter memberZoneFilter) {
        zgq0.m218673k().m218682p(false);
        if (!zgq0.m218673k().m218679l(memberZoneFilter)) {
            this.f37355s = true;
            m56680I1(memberZoneFilter);
            ((mlr) this.viewModel).m155228W(true);
        } else {
            if (this.f37355s) {
                CoreModule.f17545c.f19687u0.m30447j5();
                this.f37355s = false;
            }
            m56632B1();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ Boolean m56701g1(q860 q860Var) {
        return Boolean.valueOf(this.f37355s);
    }

    @Override // p149l.ptl
    public String getFrom() {
        return this.f37343g;
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m56702i1(q860 q860Var) {
        DbLinks dbLinks;
        this.f37339c = (q860Var == null || (dbLinks = q860Var.f153136b) == null) ? null : dbLinks.links;
        ((mlr) this.viewModel).m155224S(q860Var);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ Boolean m56703j1(q860 q860Var) {
        return Boolean.valueOf(!m56689Q1());
    }

    @Override // p149l.ptl
    /* JADX INFO: renamed from: k */
    public User getClickedUser() {
        return this.f37340d;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ Boolean m56705k1(q860 q860Var) {
        return Boolean.valueOf(!m56693Y0());
    }

    @Override // p149l.ptl
    /* JADX INFO: renamed from: l */
    public int getSeeCount() {
        return this.f37345i;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m56707l1(q860 q860Var) {
        DbLinks dbLinks;
        this.f37339c = (q860Var == null || (dbLinks = q860Var.f153136b) == null) ? null : dbLinks.links;
        int iM173344d = q860Var == null ? 0 : q860Var.m173344d();
        this.f37345i = iM173344d;
        if (iM173344d > 0) {
            this.f37342f = true;
        }
        ((mlr) this.viewModel).m155224S(q860Var);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m56708m1(C4319c c4319c) {
        if (((mlr) this.viewModel).m155213F()) {
            this.f37349m.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m56709n1(Boolean bool) {
        if (!CoreModule.m29935P().m94651a().mo33586s8()) {
            ((mlr) this.viewModel).m155232a0();
        }
        ((mlr) this.viewModel).m155231Z(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
        ((mlr) this.viewModel).m155242y();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m56710q1(LikersLimit likersLimit) {
        m56632B1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m56711r1(j760 j760Var) {
        S s = j760Var.f116565b;
        int size = s == 0 ? 0 : ((List) s).size();
        if (size != ((Integer) j760Var.f116564a).intValue() && size < 10) {
            m56632B1();
            return;
        }
        ((mlr) this.viewModel).m155212E();
        this.f37348l.m56579P4().m56628T((List) j760Var.f116565b);
        boolean zM200296J = vwb.m200296J((Collection) j760Var.f116565b);
        ((mlr) this.viewModel).mo154901a(false, zM200296J);
        ((mlr) this.viewModel).m155233b0(!zM200296J);
        ((mlr) this.viewModel).m155230Y(zM200296J);
        int iIntValue = ((Integer) j760Var.f116564a).intValue();
        this.f37345i = iIntValue;
        ((mlr) this.viewModel).setTitle(mo56687P(iIntValue));
    }

    @Override // p149l.ptl
    /* JADX INFO: renamed from: s */
    public ViewGroup getClickedItem() {
        return this.f37341e;
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m56713u1(int i, Intent intent, C4319c c4319c) {
        if (NullChecker.m81303a(this.f37341e) && NullChecker.m81303a(this.f37340d)) {
            int intExtra = 0;
            this.f37341e.setClickable(false);
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            String stringExtra = this.f37340d.pictures.get(0).url;
            if (NullChecker.m81303a(intent)) {
                intExtra = intent.getIntExtra("currentImageIndex", 0);
                stringExtra = intent.getStringExtra("currentImageUrl");
            }
            m56691V0(z, z2, true, false, intExtra, stringExtra);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m56714v1(int i, Intent intent, C4319c c4319c) {
        PicksHeaderView picksHeaderViewM155211C = ((mlr) this.viewModel).m155211C();
        if (picksHeaderViewM155211C != null) {
            PicksItemView clickedItem = picksHeaderViewM155211C.presenter.getClickedItem();
            PicksUser picksUser = picksHeaderViewM155211C.presenter.clickedUser;
            if (NullChecker.m81303a(clickedItem) && NullChecker.m81303a(picksUser)) {
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(picksUser.f20468id);
                int intExtra = 0;
                boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
                SwipeDirection swipeDirection = SwipeDirection.UP;
                boolean z2 = i == swipeDirection.getValue();
                String stringExtra = userM169430Pa.pictures.get(0).url;
                String stringExtra2 = null;
                if (NullChecker.m81303a(intent)) {
                    intExtra = intent.getIntExtra("currentImageIndex", 0);
                    stringExtra = intent.getStringExtra("currentImageUrl");
                    if (i == swipeDirection.getValue()) {
                        stringExtra2 = intent.getStringExtra(CoreMemberModule.m36001F().m132651b().mo35996pc());
                    }
                }
                String str = stringExtra2;
                picksHeaderViewM155211C.presenter.m154158n0(z, z2, true, intExtra, stringExtra, userM169430Pa, str);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m56715x1(Counter counter) {
        boolean zBooleanValue = CoreModule.f17545c.f19613V0.get().booleanValue();
        C22392a<Boolean> c22392a = this.f37351o;
        if (!zBooleanValue) {
            c22392a.m132487l(Boolean.FALSE);
        } else {
            c22392a.m132487l(Boolean.TRUE);
            ((mlr) this.viewModel).m155222P();
        }
    }

    /* JADX INFO: renamed from: z1 */
    public LikersItemView.LikersItemStyle m56716z1() {
        return m56684L1() ? LikersItemView.LikersItemStyle.newStyle1 : LikersItemView.LikersItemStyle.defaultStyle;
    }
}
