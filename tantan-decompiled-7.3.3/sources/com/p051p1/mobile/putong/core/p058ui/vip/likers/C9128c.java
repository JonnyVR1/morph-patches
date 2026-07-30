package com.p051p1.mobile.putong.core.p058ui.vip.likers;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Menu;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MemberZoneFilter;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.C9128c;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksItemView;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.LikersLimit;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.TXLiteAVCode;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.subjects.C22507a;
import p153l.ar2;
import p153l.cjr;
import p153l.dwl;
import p153l.e7d0;
import p153l.eqq0;
import p153l.ewl;
import p153l.fo0;
import p153l.gbc0;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.nnr;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.rs9;
import p153l.uqb0;
import p153l.vg60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.c */
/* JADX INFO: loaded from: classes12.dex */
public class C9128c extends ar2<nnr> implements dwl {

    /* JADX INFO: renamed from: a */
    public long f38185a;

    /* JADX INFO: renamed from: b */
    public long f38186b;

    /* JADX INFO: renamed from: c */
    public Links f38187c;

    /* JADX INFO: renamed from: d */
    public User f38188d;

    /* JADX INFO: renamed from: e */
    public ViewGroup f38189e;

    /* JADX INFO: renamed from: f */
    public boolean f38190f;

    /* JADX INFO: renamed from: g */
    public String f38191g;

    /* JADX INFO: renamed from: h */
    public BusinessEntranceStyle f38192h;

    /* JADX INFO: renamed from: i */
    public int f38193i;

    /* JADX INFO: renamed from: j */
    public long f38194j;

    /* JADX INFO: renamed from: k */
    public Act f38195k;

    /* JADX INFO: renamed from: l */
    public LikersFrag f38196l;

    /* JADX INFO: renamed from: m */
    public final jxd0 f38197m;

    /* JADX INFO: renamed from: n */
    public final jxd0 f38198n;

    /* JADX INFO: renamed from: o */
    public C22507a<Boolean> f38199o;

    /* JADX INFO: renamed from: p */
    public C22507a<Boolean> f38200p;

    /* JADX INFO: renamed from: q */
    public boolean f38201q;

    /* JADX INFO: renamed from: r */
    public boolean f38202r;

    /* JADX INFO: renamed from: s */
    public boolean f38203s;

    /* JADX INFO: renamed from: t */
    public Runnable f38204t;

    /* JADX INFO: renamed from: u */
    public final Runnable f38205u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9128c.this.m57857C1(null);
            C9128c.this.f38186b = SystemClock.elapsedRealtime();
            C9128c.this.f38190f = false;
        }
    }

    public C9128c(LikersFrag likersFrag) {
        super(likersFrag);
        this.f38187c = null;
        this.f38188d = null;
        this.f38189e = null;
        this.f38190f = false;
        this.f38193i = 0;
        String str = "see_help_clicked_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f38197m = new jxd0(str, bool);
        this.f38198n = new jxd0("has_see_guide_anim_shown_" + CoreModule.m30929H().userId(), bool);
        Boolean bool2 = Boolean.TRUE;
        this.f38199o = C22507a.m222759c(bool2);
        this.f38200p = C22507a.m222759c(bool2);
        this.f38202r = false;
        this.f38203s = false;
        this.f38204t = new a();
        this.f38205u = new Runnable() { // from class: l.lmr
            @Override // java.lang.Runnable
            public final void run() {
                this.f132713a.m57852t1();
            }
        };
        this.f38195k = likersFrag.act();
        this.f38196l = likersFrag;
        boolean zM182939h = rs9.m182939h();
        this.f38202r = zM182939h;
        if (zM182939h) {
            eqq0.m122035k().m122042n();
        }
    }

    /* JADX INFO: renamed from: B1 */
    private void m57815B1() {
        CoreModule.f18264c.f20429u0.m31458m5();
        ((nnr) this.viewModel).m163939W(false);
        if (m57872Q1()) {
            CoreModule.f18264c.f20429u0.m31451j7(10, this.f38185a, "");
        } else {
            CoreModule.f18264c.f20429u0.m31429Z6(this.f38187c, this.f38185a, 0, "");
        }
        this.f38186b = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ Boolean m57827P0(MemberZoneFilter memberZoneFilter, MemberZoneFilter memberZoneFilter2) {
        return eqq0.m122035k().getForceRefreshFilter() ? Boolean.FALSE : Boolean.valueOf(memberZoneFilter.equals(memberZoneFilter2));
    }

    /* JADX INFO: renamed from: W0 */
    private void m57831W0() {
        CoreModule.f18264c.f20429u0.m31452k5();
        this.f38185a = CoreModule.f18264c.f20429u0.f19996l0.get().longValue();
        m57869O1();
        m57815B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m57836h1() {
        if (m57872Q1()) {
            m57868N1("seepageBottomReach");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m57844o1(Bundle bundle) {
        act().setTitle(R$string.f21366Y0);
        if (m57865J1(this.f38191g)) {
            ((nnr) this.viewModel).m163937U(gbc0.f103413u0);
        }
        ((nnr) this.viewModel).m163925G();
        ((nnr) this.viewModel).m163926H(new x20() { // from class: l.rmr
            @Override // p153l.x20
            public final void call() {
                this.f163921a.m57836h1();
            }
        });
        ((nnr) this.viewModel).m163938V();
        ((nnr) this.viewModel).mo122954a(true, false);
        if (CoreModule.f18264c.f20429u0.f20000p0.get().booleanValue()) {
            return;
        }
        CoreModule.f18264c.f20429u0.f20000p0.put(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m57846p1() {
        l51.m152890J(this.f38204t);
        l51.m152890J(((nnr) this.viewModel).f142830J);
        l51.m152890J(this.f38205u);
        if (e7d0.m119697f()) {
            e7d0.m119695c().m119699g("see");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m57850s1() {
        this.f38200p.m137019l(Boolean.FALSE);
        CoreModule.f18273l.m143405a().mo34293Bb(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m57852t1() {
        ((nnr) this.viewModel).m163945c0(new x20() { // from class: l.smr
            @Override // p153l.x20
            public final void call() {
                this.f169608a.m57850s1();
            }
        });
    }

    /* JADX INFO: renamed from: C1 */
    public void m57857C1(Links links) {
        if (this.f38203s) {
            CoreModule.f18264c.f20412o1.m117837j3(eqq0.m122035k().m122039i(), links != null ? links.next : null, Converter.dateToApiTimeString(this.f38185a));
        } else {
            CoreModule.f18264c.f20429u0.m31429Z6(links, this.f38185a, 0, "");
        }
        this.f38186b = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m57858D1(int i, final int i2, final Intent intent) {
        if (i == CoreModule.f18273l.m143405a().mo34302Ck()) {
            if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
                return false;
            }
            lifecycle().takeFirst(new qcj() { // from class: l.mmr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.nmr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f142739a.m57896u1(i2, intent, (C4470c) obj);
                }
            }));
            return true;
        }
        if (i == 786) {
            CoreMemberModule.m37004F().m187693b().mo36984Yq(i2, intent, this.f38195k);
            return true;
        }
        if (i != CoreMemberModule.m37004F().m187693b().mo36987bj()) {
            return false;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new qcj() { // from class: l.pmr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.qmr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158414a.m57897v1(i2, intent, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: E */
    public void m57859E(User user, boolean z, boolean z2) {
        this.f38188d = user;
        if (!m57874V0(z, false, z2, false, 0, user.pictures.get(0).url)) {
            this.f38196l.m57762P4().notifyDataSetChanged();
        }
        CoreMemberModule.m37004F().m187693b().mo36972An(user);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m57860E1() {
        return ((nnr) this.viewModel).m163954z();
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m57861F1(Menu menu) {
        ((nnr) this.viewModel).m163920A(menu);
        ((nnr) this.viewModel).m163936T(this.f38197m.get().booleanValue());
        if (this.f38197m.get().booleanValue()) {
            return true;
        }
        this.f38197m.put(Boolean.TRUE);
        return true;
    }

    /* JADX INFO: renamed from: H1 */
    public void m57862H1(User user, boolean z, boolean z2) {
        this.f38188d = user;
        if (m57874V0(z, false, false, true, 0, user.pictures.get(0).url)) {
            return;
        }
        this.f38196l.m57762P4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m57863I1(MemberZoneFilter memberZoneFilter) {
        CoreModule.f18264c.f20412o1.m117837j3(memberZoneFilter, null, Converter.dateToApiTimeString(this.f38185a));
    }

    @Override // p153l.dwl
    /* JADX INFO: renamed from: J */
    public void mo57864J(int i) {
        this.f38193i = i;
    }

    /* JADX INFO: renamed from: J1 */
    public final boolean m57865J1(String str) {
        return SchemeKey.push_call2buysee.equals(str) || SchemeKey.push_call2buysee_side_new.equals(str) || "msg_call2buysee".equals(str) || "msg_call2buysee_side_new".equals(str);
    }

    @Override // p153l.dwl
    /* JADX INFO: renamed from: L */
    public void mo57866L(User user) {
        CoreMemberModule.m37004F().m187693b().mo36995lm(this.f38195k, user, "[摆手]", false, null, null, "QuickGreeting");
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m57867L1() {
        return (SchemeKey.push_call2buysee_side_new.equals(this.f38191g) || "msg_call2buysee_side_new".equals(this.f38191g)) && CoreModule.f18273l.m143405a().mo34492e2();
    }

    /* JADX INFO: renamed from: N1 */
    public void m57868N1(String str) {
        if (SystemClock.elapsedRealtime() - this.f38194j >= 300) {
            CoreMemberModule.m37004F().m187693b().mo36994l1(act(), str);
            this.f38194j = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m57869O1() {
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(jGuessedCurrentServerTime));
        CoreModule.f18264c.f20429u0.f19997m0.put(Long.valueOf(jGuessedCurrentServerTime));
        CoreModule.f18264c.f20429u0.f19998n0.put(Long.valueOf(jGuessedCurrentServerTime));
    }

    @Override // p153l.dwl
    /* JADX INFO: renamed from: P */
    public String mo57870P(int i) {
        Act act = this.f38195k;
        if (i <= 0) {
            return act.string(R$string.f21366Y0);
        }
        return act.getString(R$string.f21364X0, i > 99 ? "99+" : String.valueOf(i));
    }

    /* JADX INFO: renamed from: P1 */
    public final void m57871P1() {
        duringCreated(CoreModule.f18264c.m32486n3()).filter(new qcj() { // from class: l.tmr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Counter) obj).likersLimit.remaining > 0);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.umr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179667a.m57898x1((Counter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m57872Q1() {
        return m57865J1(this.f38191g) && CoreModule.f18273l.m143405a().mo34492e2();
    }

    /* JADX INFO: renamed from: U0 */
    public String m57873U0() {
        return this.f38191g;
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m57874V0(boolean z, boolean z2, boolean z3, boolean z4, int i, String str) {
        return CoreMemberModule.m37004F().m187693b().mo36991fe(z, z2, z3, z4, i, str, this, (ewl) this.viewModel, this.f38196l);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m57875X0() {
        return this.f38203s;
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m57876Y0() {
        return this.f38202r && this.f38203s;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f38191g = act().getIntent().getStringExtra("from");
        this.f38192h = (BusinessEntranceStyle) this.f38195k.getIntent().getSerializableExtra("style");
        this.f38201q = act().getIntent().getBooleanExtra("show_giving_boost", false);
        if (this.f38198n.get().booleanValue()) {
            this.f38200p.m137019l(Boolean.FALSE);
        }
        m57831W0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.slr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169456a.m57844o1((Bundle) obj);
            }
        }, new x20() { // from class: l.ulr
            @Override // p153l.x20
            public final void call() {
                this.f179549a.m57846p1();
            }
        });
        if (m57865J1(this.f38191g)) {
            duringCreated(CoreModule.f18264c.m32486n3()).map(new qcj() { // from class: l.emr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Counter) obj).likersLimit;
                }
            }).distinctUntilChanged().skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.fmr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99827a.m57893q1((LikersLimit) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20429u0.m31421V6()).filter(new qcj() { // from class: l.gmr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(CoreModule.f18273l.m143405a().mo34492e2());
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.hmr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110661a.m57894r1((pf60) obj);
                }
            }));
        }
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.imr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.jmr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121706a.m57877a1((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.kmr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).settings;
            }
        }).distinctUntilChanged(new cjr()).skip(1).doOnNext(new y20() { // from class: l.dmr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89721a.m57878b1((Settings) obj);
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.omr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147994a.m57880c1((Settings) obj);
            }
        }));
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20429u0.m31405N6(), this.f38199o, new rcj() { // from class: l.vmr
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f184749a.m57881d1((vg60) obj, (Boolean) obj2);
            }
        })).filter(new qcj() { // from class: l.wmr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) ((Pair) obj).second).booleanValue());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.xmr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195283a.m57882e1((Pair) obj);
            }
        }));
        if (this.f38202r) {
            duringCreated(eqq0.m122035k().m122038h()).distinctUntilChanged(new rcj() { // from class: l.ymr
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return C9128c.m57827P0((MemberZoneFilter) obj, (MemberZoneFilter) obj2);
                }
            }).skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.zmr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205097a.m57883f1((MemberZoneFilter) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20412o1.m117836i3()).filter(new qcj() { // from class: l.anr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f72376a.m57884g1((vg60) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.bnr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f77580a.m57885i1((vg60) obj);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.f20429u0.m31405N6()).filter(new qcj() { // from class: l.tlr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f174862a.m57886j1((vg60) obj);
            }
        }).filter(new qcj() { // from class: l.vlr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184627a.m57888k1((vg60) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.wlr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189724a.m57890l1((vg60) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116629wa()).subscribe(psd0.m173596G(new y20() { // from class: l.xlr
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116625va(-1);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.ylr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.zlr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205001a.m57891m1((C4470c) obj);
            }
        }));
        duringCreated(this.f38199o.filter(new qcj() { // from class: l.amr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).take(1)).filter(new qcj() { // from class: l.bmr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!CoreModule.f18273l.m143405a().mo34443X6());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.cmr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82639a.m57892n1((Boolean) obj);
            }
        }));
        m57871P1();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m57877a1(NetworkInfo networkInfo) {
        m57831W0();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m57878b1(Settings settings) {
        l51.m152890J(this.f38204t);
        CoreModule.f18264c.f20429u0.m31458m5();
    }

    /* JADX INFO: renamed from: c */
    public void m57879c(boolean z) {
        if (m57865J1(this.f38191g) && CoreModule.f18273l.m143405a().mo34492e2()) {
            m57868N1(!z ? "seepageDislike" : "seepageLike");
        }
        this.f38196l.m57762P4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m57880c1(Settings settings) {
        this.f38187c = null;
        this.f38190f = false;
        CoreModule.f18264c.f20429u0.m31455l5();
        m57815B1();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Pair m57881d1(vg60 vg60Var, Boolean bool) {
        return Pair.create(Boolean.valueOf((this.f38198n.get().booleanValue() || vg60Var == null || vg60Var.m201222d() <= 0 || CoreModule.f18273l.m143405a().mo34492e2() || IntlCountryCodeController.m29125v()) ? false : true), bool);
    }

    @Override // p153l.k3m
    public void destroy() {
        if (this.f38202r) {
            eqq0.m122035k().m122042n();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m57882e1(Pair pair) {
        if (!((Boolean) pair.first).booleanValue()) {
            CoreModule.f18273l.m143405a().mo34293Bb(this.f38195k);
            return;
        }
        this.f38198n.put(Boolean.TRUE);
        ((nnr) this.viewModel).m163934R();
        l51.m152890J(this.f38205u);
        l51.m152888H(this.f38195k, this.f38205u, 700L);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m57883f1(MemberZoneFilter memberZoneFilter) {
        eqq0.m122035k().m122044p(false);
        if (!eqq0.m122035k().m122041l(memberZoneFilter)) {
            this.f38203s = true;
            m57863I1(memberZoneFilter);
            ((nnr) this.viewModel).m163939W(true);
        } else {
            if (this.f38203s) {
                CoreModule.f18264c.f20429u0.m31449j5();
                this.f38203s = false;
            }
            m57815B1();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ Boolean m57884g1(vg60 vg60Var) {
        return Boolean.valueOf(this.f38203s);
    }

    @Override // p153l.dwl
    public String getFrom() {
        return this.f38191g;
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m57885i1(vg60 vg60Var) {
        DbLinks dbLinks;
        this.f38187c = (vg60Var == null || (dbLinks = vg60Var.f184002b) == null) ? null : dbLinks.links;
        ((nnr) this.viewModel).m163935S(vg60Var);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ Boolean m57886j1(vg60 vg60Var) {
        return Boolean.valueOf(!m57872Q1());
    }

    @Override // p153l.dwl
    /* JADX INFO: renamed from: k */
    public User getClickedUser() {
        return this.f38188d;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ Boolean m57888k1(vg60 vg60Var) {
        return Boolean.valueOf(!m57876Y0());
    }

    @Override // p153l.dwl
    /* JADX INFO: renamed from: l */
    public int getSeeCount() {
        return this.f38193i;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m57890l1(vg60 vg60Var) {
        DbLinks dbLinks;
        this.f38187c = (vg60Var == null || (dbLinks = vg60Var.f184002b) == null) ? null : dbLinks.links;
        int iM201222d = vg60Var == null ? 0 : vg60Var.m201222d();
        this.f38193i = iM201222d;
        if (iM201222d > 0) {
            this.f38190f = true;
        }
        ((nnr) this.viewModel).m163935S(vg60Var);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m57891m1(C4470c c4470c) {
        if (((nnr) this.viewModel).m163924F()) {
            this.f38197m.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m57892n1(Boolean bool) {
        if (!CoreModule.m30933P().m143405a().mo34589s8()) {
            ((nnr) this.viewModel).m163943a0();
        }
        ((nnr) this.viewModel).m163942Z(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
        ((nnr) this.viewModel).m163953y();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m57893q1(LikersLimit likersLimit) {
        m57815B1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m57894r1(pf60 pf60Var) {
        S s = pf60Var.f152157b;
        int size = s == 0 ? 0 : ((List) s).size();
        if (size != ((Integer) pf60Var.f152156a).intValue() && size < 10) {
            m57815B1();
            return;
        }
        ((nnr) this.viewModel).m163923E();
        this.f38196l.m57762P4().m57811T((List) pf60Var.f152157b);
        boolean zM147479J = jyb.m147479J((Collection) pf60Var.f152157b);
        ((nnr) this.viewModel).mo122954a(false, zM147479J);
        ((nnr) this.viewModel).m163944b0(!zM147479J);
        ((nnr) this.viewModel).m163941Y(zM147479J);
        int iIntValue = ((Integer) pf60Var.f152156a).intValue();
        this.f38193i = iIntValue;
        ((nnr) this.viewModel).setTitle(mo57870P(iIntValue));
    }

    @Override // p153l.dwl
    /* JADX INFO: renamed from: s */
    public ViewGroup getClickedItem() {
        return this.f38189e;
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m57896u1(int i, Intent intent, C4470c c4470c) {
        if (NullChecker.m82486a(this.f38189e) && NullChecker.m82486a(this.f38188d)) {
            int intExtra = 0;
            this.f38189e.setClickable(false);
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            String stringExtra = this.f38188d.pictures.get(0).url;
            if (NullChecker.m82486a(intent)) {
                intExtra = intent.getIntExtra("currentImageIndex", 0);
                stringExtra = intent.getStringExtra("currentImageUrl");
            }
            m57874V0(z, z2, true, false, intExtra, stringExtra);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m57897v1(int i, Intent intent, C4470c c4470c) {
        PicksHeaderView picksHeaderViewM163922C = ((nnr) this.viewModel).m163922C();
        if (picksHeaderViewM163922C != null) {
            PicksItemView clickedItem = picksHeaderViewM163922C.presenter.getClickedItem();
            PicksUser picksUser = picksHeaderViewM163922C.presenter.clickedUser;
            if (NullChecker.m82486a(clickedItem) && NullChecker.m82486a(picksUser)) {
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(picksUser.f21210id);
                int intExtra = 0;
                boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
                SwipeDirection swipeDirection = SwipeDirection.UP;
                boolean z2 = i == swipeDirection.getValue();
                String stringExtra = userM116503Pa.pictures.get(0).url;
                String stringExtra2 = null;
                if (NullChecker.m82486a(intent)) {
                    intExtra = intent.getIntExtra("currentImageIndex", 0);
                    stringExtra = intent.getStringExtra("currentImageUrl");
                    if (i == swipeDirection.getValue()) {
                        stringExtra2 = intent.getStringExtra(CoreMemberModule.m37004F().m187693b().mo36999pc());
                    }
                }
                String str = stringExtra2;
                picksHeaderViewM163922C.presenter.m186769n0(z, z2, true, intExtra, stringExtra, userM116503Pa, str);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m57898x1(Counter counter) {
        boolean zBooleanValue = CoreModule.f18264c.f20355V0.get().booleanValue();
        C22507a<Boolean> c22507a = this.f38199o;
        if (!zBooleanValue) {
            c22507a.m137019l(Boolean.FALSE);
        } else {
            c22507a.m137019l(Boolean.TRUE);
            ((nnr) this.viewModel).m163933P();
        }
    }

    /* JADX INFO: renamed from: z1 */
    public LikersItemView.LikersItemStyle m57899z1() {
        return m57867L1() ? LikersItemView.LikersItemStyle.newStyle1 : LikersItemView.LikersItemStyle.defaultStyle;
    }
}
