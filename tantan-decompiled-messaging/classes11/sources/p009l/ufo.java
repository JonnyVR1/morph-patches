package p009l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.jq2;
import l.mkd0;
import l.pib;
import l.qib0;
import l.ura;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ufo extends jq2<pgo> {

    /* JADX INFO: renamed from: a */
    public final PutongFrag f21109a;

    /* JADX INFO: renamed from: b */
    public long f21110b;

    /* JADX INFO: renamed from: c */
    public DbLinks f21111c;

    /* JADX INFO: renamed from: d */
    public String f21112d;

    /* JADX INFO: renamed from: e */
    public boolean f21113e;

    public ufo(IntlMeetLikersFrag intlMeetLikersFrag) {
        super(intlMeetLikersFrag);
        this.f21110b = 0L;
        this.f21112d = null;
        this.f21113e = false;
        this.f21109a = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: a1 */
    private void m22812a1() {
        duringCreated(CoreModule.P().g().On()).filter(new w9j() { // from class: l.ofo
            public final Object call(Object obj) {
                return ufo.m22827s0((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.pfo
            public final void call(Object obj) {
                this.f18526a.m22837J0((PaymentResultWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ Boolean m22827s0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM || purchaseType == PurchaseType.TYPE_GET_LIKERS);
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m22828A0(final boolean z, boolean z2, boolean z3, boolean z4, String str, final User user) {
        return CoreMemberModule.F().b().Ej(z2, z3, z4, 0, str, user, act(), this.f21109a.pageId(), new f30() { // from class: l.jfo
            public final void call(Object obj, Object obj2) {
                this.f15103a.m22832E0(user, (Relationship) obj, (Integer) obj2);
            }
        }, new d30() { // from class: l.kfo
            public final void call() {
                CoreModule.c.v0.E3(z, ((DbObject) user).id);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final void m22829C0(int i, int i2, Intent intent) {
        if (intent == null) {
            return;
        }
        boolean z = i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.UP.getValue();
        boolean z2 = i2 == SwipeDirection.UP.getValue();
        User userPa = CoreModule.c.e0.Pa(intent.getStringExtra(CoreModule.l.a().Iq()));
        if (NullChecker.a(userPa) && userPa.hasPic()) {
            boolean z3 = i == 82;
            String str = ((Media) userPa.fp()).url;
            if (str != null) {
                m22828A0(z3, z, z2, false, str, userPa);
            }
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m22830D0(int i, int i2) {
        if (i == 81 || i == 82) {
            return i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue() || i2 == SwipeDirection.REMOVE.getValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public void m22831E(User user, boolean z, boolean z2) {
        if (user == null || vwb.J(user.pictures)) {
            ((pgo) ((jq2) this).viewModel).m20219K().notifyDataSetChanged();
            return;
        }
        String str = ((Media) user.pictures.get(0)).url;
        if (str == null) {
            ((pgo) ((jq2) this).viewModel).m20219K().notifyDataSetChanged();
        } else {
            if (m22828A0(false, z, false, z2, str, user)) {
                return;
            }
            ((pgo) ((jq2) this).viewModel).m20219K().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m22832E0(User user, Relationship relationship, Integer num) {
        act().startActivityWithCustomTransition(CoreModule.P().a().n8(act(), vwb.f0(new String[]{relationship.id}), num.intValue(), new ArrayList(), this.f21109a.pageId()), CoreModule.P().a().hg(act()));
        CoreModule.c.m0.E8(((DbObject) user).id);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m22833F0(Intent intent, int i, int i2, c cVar) {
        if (intent != null) {
            if (i != SwipeDirection.REMOVE.getValue()) {
                m22829C0(i2, i, intent);
            } else {
                CoreModule.c.v0.E3(false, intent.getStringExtra(CoreModule.l.a().Iq()));
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m22834G0(Bundle bundle) {
        ((pgo) ((jq2) this).viewModel).m20250r();
        ((pgo) ((jq2) this).viewModel).m20251r0(!xma.h4());
        if (ura.e().d().Oq()) {
            this.f21112d = "all";
        }
        m22839N0(null);
        m22860y0();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m22835H0(Optional optional) {
        m22847W0(Pair.create(Optional.of(q860.m20833b()), optional));
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m22836I0(Optional optional) {
        m22847W0(Pair.create(Optional.of(q860.m20833b()), optional));
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m22837J0(PaymentResultWrapper paymentResultWrapper) {
        e51.H(act(), new Runnable() { // from class: l.ifo
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.C0.u4();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m22838L0(Boolean bool) {
        ((pgo) ((jq2) this).viewModel).m20251r0(bool.booleanValue());
        if (bool.booleanValue() || !ura.e().d().Oq()) {
            m22839N0(null);
            return;
        }
        ((pgo) ((jq2) this).viewModel).m20244k0(0);
        ((pgo) ((jq2) this).viewModel).f18555h.scrollToPosition(0);
        ((pgo) ((jq2) this).viewModel).f18553f.setExpanded(true, true);
    }

    /* JADX INFO: renamed from: N0 */
    public void m22839N0(String str) {
        if (str == null) {
            this.f21113e = true;
            CoreModule.c.v0.n3();
            CoreModule.c.v0.m3();
            CoreModule.c.v0.l3();
        }
        String str2 = str == null ? "" : str;
        if (ura.e().d().Oq() || !((pgo) ((jq2) this).viewModel).m20218J().m3426R4()) {
            CoreModule.c.v0.C3(str2, this.f21110b, ura.e().d().Oq() ? this.f21112d : null);
            return;
        }
        if (str == null) {
            CoreModule.c.v0.B3(this.f21110b, (String) null);
        }
        CoreModule.c.v0.z3(str2, this.f21110b, (String) null);
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m22840O0(final int i, final int i2, final Intent intent) {
        if (!m22830D0(i, i2)) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.mfo
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.nfo
            public final void call(Object obj) {
                this.f17439a.m22833F0(intent, i2, i, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public void m22841P0(String str) {
        this.f21112d = str;
        m22839N0(null);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m22842Q0(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        long jLongValue = ((Long) CoreModule.c.u0.k0.get()).longValue();
        this.f21110b = jLongValue;
        if (jLongValue <= 0) {
            this.f21110b = mqi0.m18550o();
        }
        CoreModule.c.u0.k0.put(Long.valueOf(mqi0.m18550o()));
        CoreModule.c.e0.W9(CoreModule.H().userId());
        ((pgo) ((jq2) this).viewModel).m20251r0(!xma.h4());
        m22839N0(null);
    }

    /* JADX INFO: renamed from: R0 */
    public void m22843R0(String str, e30<Boolean> e30Var) {
        if (xma.h4()) {
            CoreModule.P().a().Lf(act(), str, Privilege.see_who_likes_me, (e30) null, e30Var);
        } else if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m22844S0(String str) {
        m22845U0(str, null);
    }

    /* JADX INFO: renamed from: U0 */
    public void m22845U0(String str, d30 d30Var) {
        if (xma.h4()) {
            CoreModule.P().a().showSeeDialog(act(), d30Var, str);
        } else if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m22846V0(boolean z) {
        if (z) {
            m22855e1();
            CoreModule.c.e0.W9(CoreModule.H().userId());
            CoreModule.c.C0.u4();
            ((pgo) ((jq2) this).viewModel).m20251r0(!xma.h4());
            ((pgo) ((jq2) this).viewModel).m20224P();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m22847W0(Pair<Optional<q860<User>>, Optional<q860<User>>> pair) {
        Optional optional = (Optional) pair.first;
        Optional optional2 = (Optional) pair.second;
        if (optional.isPresent() && optional2.isPresent()) {
            q860<User> q860Var = (q860) optional.get();
            q860<User> q860Var2 = (q860) optional2.get();
            m22856f1(pair, m22857t0(q860Var, q860Var2), q860Var2.f19068a);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m22848X0() {
        creates(new e30() { // from class: l.qfo
            public final void call(Object obj) {
                this.f19225a.m22834G0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m22849Y0() {
        if (!ura.e().d().Oq() && ((pgo) ((jq2) this).viewModel).m20218J().m3426R4()) {
            duringCreated(mkd0.r(CoreModule.c.v0.q3(), CoreModule.c.v0.p3(), new x9j() { // from class: l.rfo
                public final Object call(Object obj, Object obj2) {
                    return new Pair((Optional) obj, (Optional) obj2);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.sfo
                public final void call(Object obj) {
                    this.f20229a.m22847W0((Pair) obj);
                }
            }));
        } else if (ura.e().d().Oq()) {
            duringCreated(CoreModule.c.v0.o3()).subscribe(mkd0.G(new e30() { // from class: l.tfo
                public final void call(Object obj) {
                    this.f20660a.m22835H0((Optional) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.c.v0.p3()).subscribe(mkd0.G(new e30() { // from class: l.ffo
                public final void call(Object obj) {
                    this.f12986a.m22836I0((Optional) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m22850Z() {
        super.Z();
        m22855e1();
    }

    /* JADX INFO: renamed from: a0 */
    public void m22851a0() {
        super.a0();
        m22848X0();
        m22812a1();
        m22852b1();
        m22853c1();
        m22849Y0();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m22852b1() {
        duringCreated(CoreModule.c.C0.x3()).map(new w9j() { // from class: l.gfo
            public final Object call(Object obj) {
                return Boolean.valueOf(!xma.h4());
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.G(new e30() { // from class: l.hfo
            public final void call(Object obj) {
                this.f14058a.m22838L0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public final void m22853c1() {
        duringCreated(CoreModule.c.e0.o9()).map(new w9j() { // from class: l.efo
            public final Object call(Object obj) {
                return ((User) obj).profile.receivedLikes;
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.lfo
            public final void call(Object obj) {
                this.f16149a.m22854d1((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public final void m22854d1(Long l2) {
        if (l2.longValue() <= 0) {
            return;
        }
        pib pibVar = CoreModule.c.e0;
        pibVar.j3 = Math.max(pibVar.j3, l2.longValue());
        CoreModule.P().a().Rr(CoreModule.c.e0.j3);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m22855e1() {
        long jLongValue = ((Long) CoreModule.c.u0.k0.get()).longValue();
        this.f21110b = jLongValue;
        if (jLongValue <= 0) {
            this.f21110b = qib0.H.guessedCurrentServerTime();
        }
        CoreModule.c.u0.k0.put(Long.valueOf(qib0.H.guessedCurrentServerTime()));
    }

    /* JADX INFO: renamed from: f1 */
    public final void m22856f1(Pair<Optional<q860<User>>, Optional<q860<User>>> pair, ArrayList<etl> arrayList, List<User> list) {
        if (TextUtils.isEmpty(this.f21112d) || "all".equals(this.f21112d)) {
            ((pgo) ((jq2) this).viewModel).m20252s0(m22859x0(pair));
        }
        m22861z0(arrayList, list);
        ((pgo) ((jq2) this).viewModel).m20251r0(!xma.h4());
        ((pgo) ((jq2) this).viewModel).m20249q0(arrayList, this.f21113e);
        this.f21113e = false;
    }

    /* JADX INFO: renamed from: t0 */
    public final ArrayList<etl> m22857t0(q860<User> q860Var, q860<User> q860Var2) {
        ArrayList<etl> arrayList = new ArrayList<>();
        if (!vwb.J(q860Var.f19068a)) {
            DbLinks dbLinks = q860Var.f19069b;
            arrayList.add(new afo(dbLinks.total, q860Var.f19068a, dbLinks));
        }
        List<User> list = q860Var2.f19068a;
        if (!vwb.J(list)) {
            if (!vwb.J(q860Var.f19068a)) {
                arrayList.add(new zfo(App.e.getString(R.string.W)));
            }
            this.f21111c = q860Var2.f19069b;
            boolean zH4 = xma.h4();
            for (User user : list) {
                if (zH4) {
                    arrayList.add(new oco(user));
                } else {
                    arrayList.add(new cgo(user));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u0 */
    public String m22858u0() {
        return this.f21112d;
    }

    /* JADX INFO: renamed from: x0 */
    public final int m22859x0(Pair<Optional<q860<User>>, Optional<q860<User>>> pair) {
        Optional optional = (Optional) pair.first;
        Optional optional2 = (Optional) pair.second;
        if (!optional.isPresent() || !optional2.isPresent()) {
            return -1;
        }
        return ((q860) optional.get()).f19068a.size() + ((q860) optional2.get()).f19069b.total;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m22860y0() {
        if (xma.h4()) {
            return;
        }
        if (!CoreModule.P().a().X6() && CoreModule.P().a().s8()) {
            ((pgo) ((jq2) this).viewModel).m20257x0(4000);
        }
        ((pgo) ((jq2) this).viewModel).m20217H();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m22861z0(ArrayList<etl> arrayList, List<User> list) {
        if (xma.h4()) {
            if (list.size() >= 4) {
                ((pgo) ((jq2) this).viewModel).m20243j0(arrayList);
                ((pgo) ((jq2) this).viewModel).m20216G(true);
            } else {
                arrayList.add(new lco(null));
                ((pgo) ((jq2) this).viewModel).m20216G(false);
            }
        }
    }

    public void destroy() {
    }
}
