package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.base.Optional;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class uho extends ar2<pio> {

    /* JADX INFO: renamed from: a */
    public final PutongFrag f179041a;

    /* JADX INFO: renamed from: b */
    public long f179042b;

    /* JADX INFO: renamed from: c */
    public DbLinks f179043c;

    /* JADX INFO: renamed from: d */
    public String f179044d;

    /* JADX INFO: renamed from: e */
    public boolean f179045e;

    public uho(IntlMeetLikersFrag intlMeetLikersFrag) {
        super(intlMeetLikersFrag);
        this.f179042b = 0L;
        this.f179044d = null;
        this.f179045e = false;
        this.f179041a = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: b1 */
    private void m196075b1() {
        duringCreated(CoreModule.m30933P().m143410g().mo36025On()).filter(new qcj() { // from class: l.oho
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uho.m196090s0((PaymentResultWrapper) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.pho
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152463a.m196101L0((PaymentResultWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ Boolean m196090s0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM || purchaseType == PurchaseType.TYPE_GET_LIKERS);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m196091A0(ArrayList<svl> arrayList, List<User> list) {
        if (joa.m146392i4()) {
            if (list.size() >= 4) {
                ((pio) this.viewModel).m172444j0(arrayList);
                ((pio) this.viewModel).m172418G(true);
            } else {
                arrayList.add(new leo(null));
                ((pio) this.viewModel).m172418G(false);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m196092C0(final boolean z, boolean z2, boolean z3, boolean z4, String str, final User user) {
        return CoreMemberModule.m37004F().m187693b().mo36974Ej(z2, z3, z4, 0, str, user, act(), this.f179041a.pageId(), new z20() { // from class: l.jho
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f120991a.m196096F0(user, (Relationship) obj, (Integer) obj2);
            }
        }, new x20() { // from class: l.kho
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20432v0.m153374F3(z, user.f56859id);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final void m196093D0(int i, int i2, Intent intent) {
        if (intent == null) {
            return;
        }
        boolean z = i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.UP.getValue();
        boolean z2 = i2 == SwipeDirection.UP.getValue();
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(intent.getStringExtra(CoreModule.f18273l.m143405a().mo34346Iq()));
        if (NullChecker.m82486a(userM116503Pa) && userM116503Pa.hasPic()) {
            boolean z3 = i == 82;
            String str = userM116503Pa.m61308fp().url;
            if (str != null) {
                m196092C0(z3, z, z2, false, str, userM116503Pa);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m196094E(User user, boolean z, boolean z2) {
        if (user == null || jyb.m147479J(user.pictures)) {
            ((pio) this.viewModel).m172421K().notifyDataSetChanged();
            return;
        }
        String str = user.pictures.get(0).url;
        if (str == null) {
            ((pio) this.viewModel).m172421K().notifyDataSetChanged();
        } else {
            if (m196092C0(false, z, false, z2, str, user)) {
                return;
            }
            ((pio) this.viewModel).m172421K().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m196095E0(int i, int i2) {
        if (i == 81 || i == 82) {
            return i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue() || i2 == SwipeDirection.REMOVE.getValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m196096F0(User user, Relationship relationship, Integer num) {
        act().startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(act(), jyb.m147507f0(relationship.f39654id), num.intValue(), new ArrayList<>(), this.f179041a.pageId()), CoreModule.m30933P().m143405a().mo34515hg(act()));
        CoreModule.f18264c.f20405m0.m31997E8(user.f56859id);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m196097G0(Intent intent, int i, int i2, C4470c c4470c) {
        if (intent != null) {
            if (i != SwipeDirection.REMOVE.getValue()) {
                m196093D0(i2, i, intent);
            } else {
                CoreModule.f18264c.f20432v0.m153374F3(false, intent.getStringExtra(CoreModule.f18273l.m143405a().mo34346Iq()));
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m196098H0(Bundle bundle) {
        ((pio) this.viewModel).m172451r();
        ((pio) this.viewModel).m172452r0(!joa.m146392i4());
        if (gta.m132210e().m132214d().mo34738Oq()) {
            this.f179044d = "all";
        }
        m196103O0(null);
        m196123z0();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m196099I0(Optional optional) {
        m196111X0(Pair.create(Optional.m15467of(vg60.m201220b()), optional));
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m196100J0(Optional optional) {
        m196111X0(Pair.create(Optional.m15467of(vg60.m201220b()), optional));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m196101L0(PaymentResultWrapper paymentResultWrapper) {
        l51.m152888H(act(), new Runnable() { // from class: l.iho
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20297C0.m146425v4();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m196102N0(Boolean bool) {
        ((pio) this.viewModel).m172452r0(bool.booleanValue());
        if (bool.booleanValue() || !gta.m132210e().m132214d().mo34738Oq()) {
            m196103O0(null);
            return;
        }
        ((pio) this.viewModel).m172445k0(0);
        ((pio) this.viewModel).f152565h.scrollToPosition(0);
        ((pio) this.viewModel).f152563f.setExpanded(true, true);
    }

    /* JADX INFO: renamed from: O0 */
    public void m196103O0(String str) {
        if (str == null) {
            this.f179045e = true;
            CoreModule.f18264c.f20432v0.m153377n3();
            CoreModule.f18264c.f20432v0.m153376m3();
            CoreModule.f18264c.f20432v0.m153375l3();
        }
        String str2 = str == null ? "" : str;
        if (gta.m132210e().m132214d().mo34738Oq() || !((pio) this.viewModel).m172420J().m40384R4()) {
            CoreModule.f18264c.f20432v0.m153371C3(str2, this.f179042b, gta.m132210e().m132214d().mo34738Oq() ? this.f179044d : null);
            return;
        }
        if (str == null) {
            CoreModule.f18264c.f20432v0.m153370B3(this.f179042b, null);
        }
        CoreModule.f18264c.f20432v0.m153389z3(str2, this.f179042b, null);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m196104P0(final int i, final int i2, final Intent intent) {
        if (!m196095E0(i, i2)) {
            return false;
        }
        lifecycle().takeFirst(new qcj() { // from class: l.mho
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.nho
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142012a.m196097G0(intent, i2, i, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m196105Q0(String str) {
        this.f179044d = str;
        m196103O0(null);
    }

    /* JADX INFO: renamed from: R0 */
    public void m196106R0(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        long jLongValue = CoreModule.f18264c.f20429u0.f19996l0.get().longValue();
        this.f179042b = jLongValue;
        if (jLongValue <= 0) {
            this.f179042b = pzi0.m174454o();
        }
        CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(pzi0.m174454o()));
        m196120u0();
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        ((pio) this.viewModel).m172452r0(!joa.m146392i4());
        m196103O0(null);
    }

    /* JADX INFO: renamed from: S0 */
    public void m196107S0(String str, y20<Boolean> y20Var) {
        if (joa.m146392i4()) {
            CoreModule.m30933P().m143405a().mo34365Lf(act(), str, Privilege.see_who_likes_me, null, y20Var);
        } else if (y20Var != null) {
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m196108U0(String str) {
        m196109V0(str, null);
    }

    /* JADX INFO: renamed from: V0 */
    public void m196109V0(String str, x20 x20Var) {
        if (joa.m146392i4()) {
            CoreModule.m30933P().m143405a().showSeeDialog(act(), x20Var, str);
        } else if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m196110W0(boolean z) {
        if (z) {
            m196117f1();
            m196120u0();
            CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            CoreModule.f18264c.f20297C0.m146425v4();
            ((pio) this.viewModel).m172452r0(!joa.m146392i4());
            ((pio) this.viewModel).m172426P();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m196111X0(Pair<Optional<vg60<User>>, Optional<vg60<User>>> pair) {
        Optional optional = (Optional) pair.first;
        Optional optional2 = (Optional) pair.second;
        if (optional.isPresent() && optional2.isPresent()) {
            vg60<User> vg60Var = (vg60) optional.get();
            vg60<User> vg60Var2 = (vg60) optional2.get();
            m196118g1(pair, m196119t0(vg60Var, vg60Var2), vg60Var2.f184001a);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m196112Y0() {
        creates(new y20() { // from class: l.qho
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157740a.m196098H0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m196117f1();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m196112Y0();
        m196075b1();
        m196114c1();
        m196115d1();
        m196113a1();
    }

    /* JADX INFO: renamed from: a1 */
    public final void m196113a1() {
        if (!gta.m132210e().m132214d().mo34738Oq() && ((pio) this.viewModel).m172420J().m40384R4()) {
            duringCreated(psd0.m173625r(CoreModule.f18264c.f20432v0.m153380q3(), CoreModule.f18264c.f20432v0.m153379p3(), new rcj() { // from class: l.rho
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new Pair((Optional) obj, (Optional) obj2);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.sho
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f168734a.m196111X0((Pair) obj);
                }
            }));
        } else if (gta.m132210e().m132214d().mo34738Oq()) {
            duringCreated(CoreModule.f18264c.f20432v0.m153378o3()).subscribe(psd0.m173596G(new y20() { // from class: l.tho
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f174399a.m196099I0((Optional) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f18264c.f20432v0.m153379p3()).subscribe(psd0.m173596G(new y20() { // from class: l.fho
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99087a.m196100J0((Optional) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m196114c1() {
        duringCreated(CoreModule.f18264c.f20297C0.m146427y3()).map(new qcj() { // from class: l.gho
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!joa.m146392i4());
            }
        }).distinctUntilChanged().skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.hho
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109912a.m196102N0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public final void m196115d1() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.eho
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).profile.receivedLikes;
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.lho
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132126a.m196116e1((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public final void m196116e1(Long l2) {
        if (l2.longValue() <= 0) {
            return;
        }
        dkb dkbVar = CoreModule.f18264c.f20381e0;
        dkbVar.f89257j3 = Math.max(dkbVar.f89257j3, l2.longValue());
        CoreModule.m30933P().m143405a().mo34406Rr(CoreModule.f18264c.f20381e0.f89257j3);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m196117f1() {
        long jLongValue = CoreModule.f18264c.f20429u0.f19996l0.get().longValue();
        this.f179042b = jLongValue;
        if (jLongValue <= 0) {
            this.f179042b = uqb0.f180376H.guessedCurrentServerTime();
        }
        CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
    }

    /* JADX INFO: renamed from: g1 */
    public final void m196118g1(Pair<Optional<vg60<User>>, Optional<vg60<User>>> pair, ArrayList<svl> arrayList, List<User> list) {
        if (TextUtils.isEmpty(this.f179044d) || "all".equals(this.f179044d)) {
            ((pio) this.viewModel).m172453s0(m196122y0(pair));
        }
        m196091A0(arrayList, list);
        ((pio) this.viewModel).m172452r0(!joa.m146392i4());
        ((pio) this.viewModel).m172450q0(arrayList, this.f179045e);
        this.f179045e = false;
    }

    /* JADX INFO: renamed from: t0 */
    public final ArrayList<svl> m196119t0(vg60<User> vg60Var, vg60<User> vg60Var2) {
        ArrayList<svl> arrayList = new ArrayList<>();
        if (!jyb.m147479J(vg60Var.f184001a)) {
            DbLinks dbLinks = vg60Var.f184002b;
            arrayList.add(new aho(dbLinks.total, vg60Var.f184001a, dbLinks));
        }
        List<User> list = vg60Var2.f184001a;
        if (!jyb.m147479J(list)) {
            if (!jyb.m147479J(vg60Var.f184001a)) {
                arrayList.add(new zho(App.f16088e.getString(R$string.f21361W)));
            }
            this.f179043c = vg60Var2.f184002b;
            boolean zM146392i4 = joa.m146392i4();
            for (User user : list) {
                if (zM146392i4) {
                    arrayList.add(new oeo(user));
                } else {
                    arrayList.add(new cio(user));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m196120u0() {
        CoreModule.f18264c.f20429u0.m31473r5();
    }

    /* JADX INFO: renamed from: x0 */
    public String m196121x0() {
        return this.f179044d;
    }

    /* JADX INFO: renamed from: y0 */
    public final int m196122y0(Pair<Optional<vg60<User>>, Optional<vg60<User>>> pair) {
        Optional optional = (Optional) pair.first;
        Optional optional2 = (Optional) pair.second;
        if (!optional.isPresent() || !optional2.isPresent()) {
            return -1;
        }
        return ((vg60) optional.get()).f184001a.size() + ((vg60) optional2.get()).f184002b.total;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m196123z0() {
        if (joa.m146392i4()) {
            return;
        }
        if (!CoreModule.m30933P().m143405a().mo34443X6() && CoreModule.m30933P().m143405a().mo34589s8()) {
            ((pio) this.viewModel).m172458x0(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
        }
        ((pio) this.viewModel).m172419H();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
