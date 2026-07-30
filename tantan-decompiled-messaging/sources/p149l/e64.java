package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12836e;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VListCell;

/* JADX INFO: loaded from: classes5.dex */
public class e64 extends h4t<ho2, LiveCallView> {

    /* JADX INFO: renamed from: i */
    public BLiveCall f89491i;

    /* JADX INFO: renamed from: j */
    public o44 f89492j;

    /* JADX INFO: renamed from: k */
    public User f89493k;

    /* JADX INFO: renamed from: l */
    public xh0 f89494l;

    /* JADX INFO: renamed from: m */
    public xh0 f89495m;

    /* JADX INFO: renamed from: n */
    public c40 f89496n;

    /* JADX INFO: renamed from: o */
    public ViewTreeObserver.OnGlobalLayoutListener f89497o;

    /* JADX INFO: renamed from: p */
    public boolean f89498p;

    public e64(bsm bsmVar, LiveCallView liveCallView, o44 o44Var) {
        super(bsmVar);
        this.f89492j = o44Var;
        mo51532C(liveCallView);
        this.f89497o = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.z54
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f201748a.m114941A4();
            }
        };
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m114960B4(List list) {
        this.f89492j.mo162543m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m114961C4(Throwable th) {
        this.f89492j.m162527V3(th);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ Boolean m114962D4(User user) {
        BLiveCall bLiveCall = this.f89491i;
        return Boolean.valueOf(bLiveCall != null && TextUtils.equals(bLiveCall.user, user.f56011id));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m114963E4(User user) {
        this.f89493k = user;
        ((LiveCallView) this.viewModel).m75976l(m114987p4(user), false);
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ Integer m114964F4(j74 j74Var) {
        return Integer.valueOf(m114979h4());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [l.ho2] */
    /* JADX INFO: renamed from: G4 */
    public void m114965G4() {
        if (this.f89491i == null) {
            return;
        }
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(4400).userId(this.f89491i.user).giftSource("callVideoVice").setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, this.f89491i.user, 4400)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, this.f89491i.user, 4400)).setScene("call").setSource("live").build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public void m114966H4(BLiveCall bLiveCall) {
        if (bLiveCall == null) {
            return;
        }
        m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(2));
        if (TextUtils.isEmpty(bLiveCall.userName)) {
            bLiveCall.userName = this.f89492j.m162531Z3().m108760m().m133917k(bLiveCall.user).f111521b;
        }
        if (!xdl0.m208349O0((View) this.viewModel) && !v44.m196943k(bLiveCall)) {
            m114980i4(bLiveCall.user);
        }
        ((LiveCallView) this.viewModel).getViewTreeObserver().addOnGlobalLayoutListener(this.f89497o);
        if (!xdl0.m208349O0((View) this.viewModel)) {
            m206028F2().StickerEvent.changeVisible().mo172463j(Boolean.FALSE);
            m114968J4();
        }
        ((LiveCallView) this.viewModel).m75981y(bLiveCall);
        this.f89491i = bLiveCall;
    }

    /* JADX INFO: renamed from: I4 */
    public void m114967I4() {
        i54 i54VarM133917k = this.f89492j.m162531Z3().m108760m().m133917k(this.f89491i.user);
        mnj.C18509a c18509a = new mnj.C18509a();
        i54 i54Var = new i54(i54VarM133917k.f111520a, i54VarM133917k.f111521b, i54VarM133917k.f111522c);
        BLiveCall bLiveCall = this.f89491i;
        m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(4400).m122564h(c18509a.m155527h(mlj.m155154c(i54Var, q44.m172922b(bLiveCall.f44342id, "gift-audience-none-callaudience", bLiveCall.position))).m155523d()).m122566j("callVideoVice"));
    }

    /* JADX INFO: renamed from: J4 */
    public void m114968J4() {
        int iM114981j4 = m114981j4();
        h54.m129377d("availableSpace:" + iM114981j4);
        if (m114974c4()) {
            m114969K4(iM114981j4 - l9e.f127086j);
            m114970L4(iM114981j4 - l9e.f127084h);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final void m114969K4(int i) {
        m206028F2().TraysViewEvent.changeBottomSpace().mo172463j(new C12836e.a(4400).m74292a(i).m74293b());
    }

    /* JADX INFO: renamed from: L4 */
    public final void m114970L4(int i) {
        m206028F2().CallEvent.updateWidgetMargin().mo172463j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: M4 */
    public final void m114971M4() {
        BLiveCall bLiveCall = this.f89491i;
        if (bLiveCall != null) {
            duringCreated(LivingNormalApiProvider.m71340S7(bLiveCall.f44342id, m206032L2())).subscribe(ffw.m121194e(new e30() { // from class: l.t54
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167788a.m114960B4((List) obj);
                }
            }, new e30() { // from class: l.u54
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f174650a.m114961C4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m114972N4() {
        r0s.m177408b(this, this.f89493k.f56011id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public final void m114941A4() {
        Act act = this.f188513f;
        boolean zM114976e4 = m114976e4(act, act.getWindow());
        if (this.f89498p == zM114976e4 || !xdl0.m208349O0((View) this.viewModel)) {
            return;
        }
        this.f89498p = zM114976e4;
        m114968J4();
    }

    /* JADX INFO: renamed from: c4 */
    public final boolean m114974c4() {
        return (((m114981j4() - l9e.f127084h) - l9e.f127082f) - l9e.f127087k) - l9e.f127091o >= l9e.f127080d;
    }

    /* JADX INFO: renamed from: d4 */
    public void m114975d4() {
        boolean zM206032L2 = m206032L2();
        BLiveCall bLiveCall = this.f89491i;
        duringCreated(LivingNormalApiProvider.m71241H7(this.f89491i.f44342id, !(zM206032L2 ? bLiveCall.mutedByAnchor : bLiveCall.mutedByUser), m206032L2())).subscribe(ffw.m121194e(new e30() { // from class: l.c64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79435a.m114988q4((List) obj);
            }
        }, new e30() { // from class: l.d64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84583a.m114989r4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m114976e4(@NonNull Context context, @NonNull Window window) {
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
    public void m114977f4() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f188513f.getResources().getString(R$string.f46888P5));
        arrayList.add(this.f188513f.getResources().getString(R$string.f46561A4));
        int i = h1c0.f105400r0;
        c40 c40VarM105153F = new c40.C16057b(this.f188513f).m105155H(R$string.f47113a).m105164Q(arrayList).m105165R(new int[]{0, 1}, new int[]{i, i}).m105157J(-6710887).m105168U(new View.OnClickListener() { // from class: l.p54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147255a.m114990s4(view);
            }
        }).m105169V(new c40.InterfaceC16059d() { // from class: l.q54
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i2) {
                this.f152725a.m114991t4(vListCell, c22545a, i2);
            }
        }).m105153F();
        this.f89496n = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: g4 */
    public void m114978g4() {
        if (this.f89491i == null && this.f89493k == null) {
            return;
        }
        r0s.m177407a(this, this.f89493k.f56011id);
        vpv vpvVar = ypv.f199493a;
        duringCreated(vpvVar.m199340d(vpvVar.m199309D0(), this.f89493k, true, "liveRoom", null, "", mo77274R2(), "callVideo")).subscribe(ffw.m121194e(new e30() { // from class: l.a64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67738a.m114992u4((Followship) obj);
            }
        }, new e30() { // from class: l.b64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73741a.m114993v4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final int m114979h4() {
        return (m114974c4() && xdl0.m208349O0((View) this.viewModel)) ? m114981j4() - l9e.f127084h : l9e.f127090n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: i4 */
    public void m114980i4(final String str) {
        duringCreated((C22306c) m206027E2().m132151m2().onErrorReturn(new w9j() { // from class: l.l54
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.m54
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71574s7(str, "");
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.n54
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137185a.m114994w4((User) obj);
            }
        }, new e30() { // from class: l.o54
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141871a.m114995x4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public final int m114981j4() {
        boolean z = this.f89498p;
        Act act = this.f188513f;
        return !z ? xdl0.m208410x0(act) - l9e.f127085i : (xdl0.m208410x0(act) - l9e.f127085i) - xdl0.m208336I(this.f188513f);
    }

    /* JADX INFO: renamed from: k4 */
    public void m114982k4(j760<cud, Boolean> j760Var) {
        h54.m129377d("CallVideoPresenter stream " + j760Var.f116565b);
        if (!j760Var.f116565b.booleanValue()) {
            m114986o4();
            return;
        }
        cud cudVar = j760Var.f116564a;
        if (cudVar == null || cudVar.m108755h() == null) {
            m114986o4();
            return;
        }
        int i = cudVar.f82558e;
        if (i == 2) {
            BLiveCall bLiveCall = this.f89491i;
            if (bLiveCall == null || v44.m196942j(cudVar.f82557d, bLiveCall)) {
                if (v44.m196940h(cudVar.f82557d)) {
                    m114966H4(cudVar.f82557d);
                    return;
                } else {
                    m114986o4();
                    return;
                }
            }
            return;
        }
        if (i == 3) {
            BLiveCall bLiveCall2 = this.f89491i;
            if (bLiveCall2 == null || !v44.m196942j(bLiveCall2, cudVar.f82557d)) {
                return;
            }
            m114986o4();
            return;
        }
        if (i == 1) {
            if (cudVar.m108755h() != null) {
                m114966H4(cudVar.m108755h());
            } else {
                m114986o4();
            }
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m114983l4() {
        boolean zM206032L2 = m206032L2();
        Act act = this.f188513f;
        xh0 xh0VarM208722a = new xh0.C21150a(act()).m208731j(zM206032L2 ? String.format(act.getString(R$string.f47489r2), this.f89491i.userName) : act.getString(R$string.f47247g1)).m208737p(h1c0.f105394p0).m208738q(R$string.f47577v2).m208736o(new View.OnClickListener() { // from class: l.s54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162484a.m114996y4(view);
            }
        }).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1).m208722a();
        this.f89494l = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: m4 */
    public final void m114984m4() {
        boolean zM206032L2 = m206032L2();
        Act act = this.f188513f;
        xh0 xh0VarM208722a = new xh0.C21150a(act()).m208740s(zM206032L2 ? String.format(act.getString(R$string.f47225f1), this.f89491i.userName) : act.getString(R$string.f47203e1)).m208730i(R$string.f47422o1).m208737p(h1c0.f105394p0).m208738q(R$string.f47181d1).m208736o(new View.OnClickListener() { // from class: l.r54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157755a.m114997z4(view);
            }
        }).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1).m208722a();
        this.f89495m = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        m114986o4();
        super.mo69117n();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m114985n4() {
        this.f89492j.m162528W3(this.f89491i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public void m114986o4() {
        if (xdl0.m208349O0((View) this.viewModel)) {
            m114970L4(l9e.f127090n);
            m114969K4(l9e.f127089m);
        }
        m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(2));
        xh0 xh0Var = this.f89494l;
        if (xh0Var != null) {
            xh0Var.m208717c();
        }
        xh0 xh0Var2 = this.f89495m;
        if (xh0Var2 != null) {
            xh0Var2.m208717c();
        }
        c40 c40Var = this.f89496n;
        if (c40Var != null) {
            c40Var.m105113b();
        }
        m206028F2().StickerEvent.changeVisible().mo172463j(Boolean.TRUE);
        ((LiveCallView) this.viewModel).getViewTreeObserver().removeOnGlobalLayoutListener(this.f89497o);
        ((LiveCallView) this.viewModel).m75977m();
        this.f89491i = null;
        this.f89493k = null;
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m114987p4(User user) {
        return user.matchedOrFollowed();
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m114988q4(List list) {
        this.f89492j.mo162543m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m114989r4(Throwable th) {
        this.f89492j.m162527V3(th);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m114990s4(View view) {
        this.f89496n.m105113b();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).filter(new w9j() { // from class: l.k54
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f121141a.m114962D4((User) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.v54
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180000a.m114963E4((User) obj);
            }
        }));
        duringCreated(mkd0.m154984r(this.f89492j.m162532a4(), this.f89492j.m162542l4(), new x9j() { // from class: l.w54
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((cud) obj, (Boolean) obj2);
            }
        })).subscribe(ffw.m121193d(new e30() { // from class: l.x54
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191087a.m114982k4((j760) obj);
            }
        }));
        m129301d3(j74.class, new w9j() { // from class: l.y54
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f196379a.m114964F4((j74) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m114991t4(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (i == 0) {
            m114984m4();
            this.f89496n.m105113b();
        } else {
            m114983l4();
            this.f89496n.m105113b();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m114992u4(Followship followship) {
        User user = this.f89493k;
        if (user == null || !m114987p4(user)) {
            return;
        }
        this.f89493k.localFollowship = followship;
        ((LiveCallView) this.viewModel).m75976l(true, true);
        lsi0.m151593w(R$string.f46803L4);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m114993v4(Throwable th) {
        this.f89492j.m162527V3(th);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m114994w4(User user) {
        this.f89493k = user;
        ((LiveCallView) this.viewModel).m75976l(m114987p4(user), true);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m114995x4(Throwable th) {
        this.f89492j.m162527V3(th);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m114996y4(View view) {
        m114985n4();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m114997z4(View view) {
        m114971M4();
    }
}
