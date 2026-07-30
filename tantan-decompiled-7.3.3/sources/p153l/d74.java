package p153l;

import android.R;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12999e;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VListCell;

/* JADX INFO: loaded from: classes5.dex */
public class d74 extends i6t<oo2, LiveCallView> {

    /* JADX INFO: renamed from: i */
    public BLiveCall f85447i;

    /* JADX INFO: renamed from: j */
    public n54 f85448j;

    /* JADX INFO: renamed from: k */
    public User f85449k;

    /* JADX INFO: renamed from: l */
    public th0 f85450l;

    /* JADX INFO: renamed from: m */
    public th0 f85451m;

    /* JADX INFO: renamed from: n */
    public w30 f85452n;

    /* JADX INFO: renamed from: o */
    public ViewTreeObserver.OnGlobalLayoutListener f85453o;

    /* JADX INFO: renamed from: p */
    public boolean f85454p;

    public d74(dum dumVar, LiveCallView liveCallView, n54 n54Var) {
        super(dumVar);
        this.f85448j = n54Var;
        mo52715C(liveCallView);
        this.f85453o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.y64
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f197627a.m114584A4();
            }
        };
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m114603B4(List list) {
        this.f85448j.mo161660m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m114604C4(Throwable th) {
        this.f85448j.m161644V3(th);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ Boolean m114605D4(User user) {
        BLiveCall bLiveCall = this.f85447i;
        return Boolean.valueOf(bLiveCall != null && TextUtils.equals(bLiveCall.user, user.f56859id));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m114606E4(User user) {
        this.f85449k = user;
        ((LiveCallView) this.viewModel).m77159l(m114630p4(user), false);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ Integer m114607F4(i84 i84Var) {
        return Integer.valueOf(m114622h4());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [l.oo2] */
    /* JADX INFO: renamed from: G4 */
    public void m114608G4() {
        if (this.f85447i == null) {
            return;
        }
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(4400).userId(this.f85447i.user).giftSource("callVideoVice").setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, this.f85447i.user, 4400)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, this.f85447i.user, 4400)).setScene("call").setSource("live").build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public void m114609H4(BLiveCall bLiveCall) {
        if (bLiveCall == null) {
            return;
        }
        m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(2));
        if (TextUtils.isEmpty(bLiveCall.userName)) {
            bLiveCall.userName = this.f85448j.m161648Z3().m178270m().m143251k(bLiveCall.user).f107998b;
        }
        if (!bnl0.m105529O0((View) this.viewModel) && !u54.m194531k(bLiveCall)) {
            m114623i4(bLiveCall.user);
        }
        ((LiveCallView) this.viewModel).getViewTreeObserver().addOnGlobalLayoutListener(this.f85453o);
        if (!bnl0.m105529O0((View) this.viewModel)) {
            m213811F2().StickerEvent.changeVisible().mo199273j(Boolean.FALSE);
            m114611J4();
        }
        ((LiveCallView) this.viewModel).m77164y(bLiveCall);
        this.f85447i = bLiveCall;
    }

    /* JADX INFO: renamed from: I4 */
    public void m114610I4() {
        h64 h64VarM143251k = this.f85448j.m161648Z3().m178270m().m143251k(this.f85447i.user);
        cqj.C16337a c16337a = new cqj.C16337a();
        h64 h64Var = new h64(h64VarM143251k.f107997a, h64VarM143251k.f107998b, h64VarM143251k.f107999c);
        BLiveCall bLiveCall = this.f85447i;
        m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(4400).m156158h(c16337a.m111927h(coj.m111661c(h64Var, p54.m170592b(bLiveCall.f45190id, "gift-audience-none-callaudience", bLiveCall.position))).m111923d()).m156160j("callVideoVice"));
    }

    /* JADX INFO: renamed from: J4 */
    public void m114611J4() {
        int iM114624j4 = m114624j4();
        g64.m129083d("availableSpace:" + iM114624j4);
        if (m114617c4()) {
            m114612K4(iM114624j4 - pae.f151266j);
            m114613L4(iM114624j4 - pae.f151264h);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final void m114612K4(int i) {
        m213811F2().TraysViewEvent.changeBottomSpace().mo199273j(new C12999e.a(4400).m75475a(i).m75476b());
    }

    /* JADX INFO: renamed from: L4 */
    public final void m114613L4(int i) {
        m213811F2().CallEvent.updateWidgetMargin().mo199273j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: M4 */
    public final void m114614M4() {
        BLiveCall bLiveCall = this.f85447i;
        if (bLiveCall != null) {
            duringCreated(LivingNormalApiProvider.m72523S7(bLiveCall.f45190id, m213815L2())).subscribe(dhw.m115826e(new y20() { // from class: l.s64
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f166536a.m114603B4((List) obj);
                }
            }, new y20() { // from class: l.t64
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172288a.m114604C4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m114615N4() {
        s2s.m184136b(this, this.f85449k.f56859id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public final void m114584A4() {
        Act act = this.f196919f;
        boolean zM114619e4 = m114619e4(act, act.getWindow());
        if (this.f85454p == zM114619e4 || !bnl0.m105529O0((View) this.viewModel)) {
            return;
        }
        this.f85454p = zM114619e4;
        m114611J4();
    }

    /* JADX INFO: renamed from: c4 */
    public final boolean m114617c4() {
        return (((m114624j4() - pae.f151264h) - pae.f151262f) - pae.f151267k) - pae.f151271o >= pae.f151260d;
    }

    /* JADX INFO: renamed from: d4 */
    public void m114618d4() {
        boolean zM213815L2 = m213815L2();
        BLiveCall bLiveCall = this.f85447i;
        duringCreated(LivingNormalApiProvider.m72424H7(this.f85447i.f45190id, !(zM213815L2 ? bLiveCall.mutedByAnchor : bLiveCall.mutedByUser), m213815L2())).subscribe(dhw.m115826e(new y20() { // from class: l.b74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75252a.m114631q4((List) obj);
            }
        }, new y20() { // from class: l.c74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80080a.m114632r4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m114619e4(@NonNull Context context, @NonNull Window window) {
        Display defaultDisplay = window.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        View decorView = window.getDecorView();
        if (2 == context.getResources().getConfiguration().orientation) {
            return point.x != decorView.findViewById(R.id.content).getWidth();
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return rect.bottom != point.y;
    }

    /* JADX INFO: renamed from: f4 */
    public void m114620f4() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f196919f.getResources().getString(R$string.f47736P5));
        arrayList.add(this.f196919f.getResources().getString(R$string.f47409A4));
        int i = n9c0.f140861r0;
        w30 w30VarM204654F = new w30.C21001b(this.f196919f).m204656H(R$string.f47961a).m204665Q(arrayList).m204666R(new int[]{0, 1}, new int[]{i, i}).m204658J(-6710887).m204669U(new View.OnClickListener() { // from class: l.o64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145139a.m114633s4(view);
            }
        }).m204670V(new w30.InterfaceC21003d() { // from class: l.p64
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i2) {
                this.f150734a.m114634t4(vListCell, c22660a, i2);
            }
        }).m204654F();
        this.f85452n = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: g4 */
    public void m114621g4() {
        if (this.f85447i == null && this.f85449k == null) {
            return;
        }
        s2s.m184135a(this, this.f85449k.f56859id);
        wrv wrvVar = zrv.f205799a;
        duringCreated(wrvVar.m207662d(wrvVar.m207631D0(), this.f85449k, true, "liveRoom", null, "", mo78457R2(), "callVideo")).subscribe(dhw.m115826e(new y20() { // from class: l.z64
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203122a.m114635u4((Followship) obj);
            }
        }, new y20() { // from class: l.a74
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68787a.m114636v4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final int m114622h4() {
        return (m114617c4() && bnl0.m105529O0((View) this.viewModel)) ? m114624j4() - pae.f151264h : pae.f151270n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: i4 */
    public void m114623i4(final String str) {
        duringCreated((C22421c) m213810E2().m168537m2().onErrorReturn(new qcj() { // from class: l.k64
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.l64
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72757s7(str, "");
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.m64
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134966a.m114637w4((User) obj);
            }
        }, new y20() { // from class: l.n64
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140427a.m114638x4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public final int m114624j4() {
        boolean z = this.f85454p;
        Act act = this.f196919f;
        return !z ? bnl0.m105590x0(act) - pae.f151265i : (bnl0.m105590x0(act) - pae.f151265i) - bnl0.m105516I(this.f196919f);
    }

    /* JADX INFO: renamed from: k4 */
    public void m114625k4(pf60<qvd, Boolean> pf60Var) {
        g64.m129083d("CallVideoPresenter stream " + pf60Var.f152157b);
        if (!pf60Var.f152157b.booleanValue()) {
            m114629o4();
            return;
        }
        qvd qvdVar = pf60Var.f152156a;
        if (qvdVar == null || qvdVar.m178265h() == null) {
            m114629o4();
            return;
        }
        int i = qvdVar.f159736e;
        if (i == 2) {
            BLiveCall bLiveCall = this.f85447i;
            if (bLiveCall == null || u54.m194530j(qvdVar.f159735d, bLiveCall)) {
                if (u54.m194528h(qvdVar.f159735d)) {
                    m114609H4(qvdVar.f159735d);
                    return;
                } else {
                    m114629o4();
                    return;
                }
            }
            return;
        }
        if (i == 3) {
            BLiveCall bLiveCall2 = this.f85447i;
            if (bLiveCall2 == null || !u54.m194530j(bLiveCall2, qvdVar.f159735d)) {
                return;
            }
            m114629o4();
            return;
        }
        if (i == 1) {
            if (qvdVar.m178265h() != null) {
                m114609H4(qvdVar.m178265h());
            } else {
                m114629o4();
            }
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m114626l4() {
        boolean zM213815L2 = m213815L2();
        Act act = this.f196919f;
        th0 th0VarM191142a = new th0.C20312a(act()).m191151j(zM213815L2 ? String.format(act.getString(R$string.f48337r2), this.f85447i.userName) : act.getString(R$string.f48095g1)).m191157p(n9c0.f140855p0).m191158q(R$string.f48425v2).m191156o(new View.OnClickListener() { // from class: l.r64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161443a.m114639y4(view);
            }
        }).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1).m191142a();
        this.f85450l = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m114627m4() {
        boolean zM213815L2 = m213815L2();
        Act act = this.f196919f;
        th0 th0VarM191142a = new th0.C20312a(act()).m191160s(zM213815L2 ? String.format(act.getString(R$string.f48073f1), this.f85447i.userName) : act.getString(R$string.f48051e1)).m191150i(R$string.f48270o1).m191157p(n9c0.f140855p0).m191158q(R$string.f48029d1).m191156o(new View.OnClickListener() { // from class: l.q64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155781a.m114640z4(view);
            }
        }).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1).m191142a();
        this.f85451m = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        m114629o4();
        super.mo70300n();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m114628n4() {
        this.f85448j.m161645W3(this.f85447i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public void m114629o4() {
        if (bnl0.m105529O0((View) this.viewModel)) {
            m114613L4(pae.f151270n);
            m114612K4(pae.f151269m);
        }
        m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(2));
        th0 th0Var = this.f85450l;
        if (th0Var != null) {
            th0Var.m191137c();
        }
        th0 th0Var2 = this.f85451m;
        if (th0Var2 != null) {
            th0Var2.m191137c();
        }
        w30 w30Var = this.f85452n;
        if (w30Var != null) {
            w30Var.m204614b();
        }
        m213811F2().StickerEvent.changeVisible().mo199273j(Boolean.TRUE);
        ((LiveCallView) this.viewModel).getViewTreeObserver().removeOnGlobalLayoutListener(this.f85453o);
        ((LiveCallView) this.viewModel).m77160m();
        this.f85447i = null;
        this.f85449k = null;
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m114630p4(User user) {
        return user.matchedOrFollowed();
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m114631q4(List list) {
        this.f85448j.mo161660m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m114632r4(Throwable th) {
        this.f85448j.m161644V3(th);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m114633s4(View view) {
        this.f85452n.m204614b();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).filter(new qcj() { // from class: l.j64
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118516a.m114605D4((User) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.u64
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177705a.m114606E4((User) obj);
            }
        }));
        duringCreated(psd0.m173625r(this.f85448j.m161649a4(), this.f85448j.m161659l4(), new rcj() { // from class: l.v64
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((qvd) obj, (Boolean) obj2);
            }
        })).subscribe(dhw.m115825d(new y20() { // from class: l.w64
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187595a.m114625k4((pf60) obj);
            }
        }));
        m138860d3(i84.class, new qcj() { // from class: l.x64
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192555a.m114607F4((i84) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m114634t4(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (i == 0) {
            m114627m4();
            this.f85452n.m204614b();
        } else {
            m114626l4();
            this.f85452n.m204614b();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m114635u4(Followship followship) {
        User user = this.f85449k;
        if (user == null || !m114630p4(user)) {
            return;
        }
        this.f85449k.localFollowship = followship;
        ((LiveCallView) this.viewModel).m77159l(true, true);
        o1j0.m165649w(R$string.f47651L4);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m114636v4(Throwable th) {
        this.f85448j.m161644V3(th);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m114637w4(User user) {
        this.f85449k = user;
        ((LiveCallView) this.viewModel).m77159l(m114630p4(user), true);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m114638x4(Throwable th) {
        this.f85448j.m161644V3(th);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m114639y4(View view) {
        m114628n4();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m114640z4(View view) {
        m114614M4();
    }
}
