package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.base.Optional;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ufo extends jq2<pgo> {

    /* JADX INFO: renamed from: a */
    public final PutongFrag f176292a;

    /* JADX INFO: renamed from: b */
    public long f176293b;

    /* JADX INFO: renamed from: c */
    public DbLinks f176294c;

    /* JADX INFO: renamed from: d */
    public String f176295d;

    /* JADX INFO: renamed from: e */
    public boolean f176296e;

    public ufo(IntlMeetLikersFrag intlMeetLikersFrag) {
        super(intlMeetLikersFrag);
        this.f176293b = 0L;
        this.f176295d = null;
        this.f176296e = false;
        this.f176292a = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: a1 */
    private void m193407a1() {
        duringCreated(CoreModule.m29935P().m94656g().mo35022On()).filter(new w9j() { // from class: l.ofo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ufo.m193422s0((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.pfo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148577a.m193432J0((PaymentResultWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ Boolean m193422s0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM || purchaseType == PurchaseType.TYPE_GET_LIKERS);
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m193423A0(final boolean z, boolean z2, boolean z3, boolean z4, String str, final User user) {
        return CoreMemberModule.m36001F().m132651b().mo35971Ej(z2, z3, z4, 0, str, user, act(), this.f176292a.pageId(), new f30() { // from class: l.jfo
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f117679a.m193427E0(user, (Relationship) obj, (Integer) obj2);
            }
        }, new d30() { // from class: l.kfo
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19690v0.m105761E3(z, user.f56011id);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final void m193424C0(int i, int i2, Intent intent) {
        if (intent == null) {
            return;
        }
        boolean z = i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.UP.getValue();
        boolean z2 = i2 == SwipeDirection.UP.getValue();
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(intent.getStringExtra(CoreModule.f17554l.m94651a().mo33343Iq()));
        if (NullChecker.m81303a(userM169430Pa) && userM169430Pa.hasPic()) {
            boolean z3 = i == 82;
            String str = userM169430Pa.m60124fp().url;
            if (str != null) {
                m193423A0(z3, z, z2, false, str, userM169430Pa);
            }
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m193425D0(int i, int i2) {
        if (i == 81 || i == 82) {
            return i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue() || i2 == SwipeDirection.REMOVE.getValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public void m193426E(User user, boolean z, boolean z2) {
        if (user == null || vwb.m200296J(user.pictures)) {
            ((pgo) this.viewModel).m168851K().notifyDataSetChanged();
            return;
        }
        String str = user.pictures.get(0).url;
        if (str == null) {
            ((pgo) this.viewModel).m168851K().notifyDataSetChanged();
        } else {
            if (m193423A0(false, z, false, z2, str, user)) {
                return;
            }
            ((pgo) this.viewModel).m168851K().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m193427E0(User user, Relationship relationship, Integer num) {
        act().startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33551n8(act(), vwb.m200324f0(relationship.f38806id), num.intValue(), new ArrayList<>(), this.f176292a.pageId()), CoreModule.m29935P().m94651a().mo33512hg(act()));
        CoreModule.f17545c.f19663m0.m30994E8(user.f56011id);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m193428F0(Intent intent, int i, int i2, C4319c c4319c) {
        if (intent != null) {
            if (i != SwipeDirection.REMOVE.getValue()) {
                m193424C0(i2, i, intent);
            } else {
                CoreModule.f17545c.f19690v0.m105761E3(false, intent.getStringExtra(CoreModule.f17554l.m94651a().mo33343Iq()));
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m193429G0(Bundle bundle) {
        ((pgo) this.viewModel).m168881r();
        ((pgo) this.viewModel).m168882r0(!xma.m210077h4());
        if (ura.m195053e().m195057d().mo33735Oq()) {
            this.f176295d = "all";
        }
        m193434N0(null);
        m193453y0();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m193430H0(Optional optional) {
        m193442W0(Pair.create(Optional.m15413of(q860.m173342b()), optional));
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m193431I0(Optional optional) {
        m193442W0(Pair.create(Optional.m15413of(q860.m173342b()), optional));
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m193432J0(PaymentResultWrapper paymentResultWrapper) {
        e51.m114743H(act(), new Runnable() { // from class: l.ifo
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19555C0.m210112u4();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m193433L0(Boolean bool) {
        ((pgo) this.viewModel).m168882r0(bool.booleanValue());
        if (bool.booleanValue() || !ura.m195053e().m195057d().mo33735Oq()) {
            m193434N0(null);
            return;
        }
        ((pgo) this.viewModel).m168875k0(0);
        ((pgo) this.viewModel).f148769h.scrollToPosition(0);
        ((pgo) this.viewModel).f148767f.setExpanded(true, true);
    }

    /* JADX INFO: renamed from: N0 */
    public void m193434N0(String str) {
        if (str == null) {
            this.f176296e = true;
            CoreModule.f17545c.f19690v0.m105764n3();
            CoreModule.f17545c.f19690v0.m105763m3();
            CoreModule.f17545c.f19690v0.m105762l3();
        }
        String str2 = str == null ? "" : str;
        if (ura.m195053e().m195057d().mo33735Oq() || !((pgo) this.viewModel).m168850J().m39381R4()) {
            CoreModule.f17545c.f19690v0.m105759C3(str2, this.f176293b, ura.m195053e().m195057d().mo33735Oq() ? this.f176295d : null);
            return;
        }
        if (str == null) {
            CoreModule.f17545c.f19690v0.m105758B3(this.f176293b, null);
        }
        CoreModule.f17545c.f19690v0.m105776z3(str2, this.f176293b, null);
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m193435O0(final int i, final int i2, final Intent intent) {
        if (!m193425D0(i, i2)) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.mfo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.nfo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138806a.m193428F0(intent, i2, i, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public void m193436P0(String str) {
        this.f176295d = str;
        m193434N0(null);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m193437Q0(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        long jLongValue = CoreModule.f17545c.f19687u0.f19254k0.get().longValue();
        this.f176293b = jLongValue;
        if (jLongValue <= 0) {
            this.f176293b = mqi0.m155944o();
        }
        CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        ((pgo) this.viewModel).m168882r0(!xma.m210077h4());
        m193434N0(null);
    }

    /* JADX INFO: renamed from: R0 */
    public void m193438R0(String str, e30<Boolean> e30Var) {
        if (xma.m210077h4()) {
            CoreModule.m29935P().m94651a().mo33362Lf(act(), str, Privilege.see_who_likes_me, null, e30Var);
        } else if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m193439S0(String str) {
        m193440U0(str, null);
    }

    /* JADX INFO: renamed from: U0 */
    public void m193440U0(String str, d30 d30Var) {
        if (xma.m210077h4()) {
            CoreModule.m29935P().m94651a().showSeeDialog(act(), d30Var, str);
        } else if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m193441V0(boolean z) {
        if (z) {
            m193448e1();
            CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            CoreModule.f17545c.f19555C0.m210112u4();
            ((pgo) this.viewModel).m168882r0(!xma.m210077h4());
            ((pgo) this.viewModel).m168856P();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m193442W0(Pair<Optional<q860<User>>, Optional<q860<User>>> pair) {
        Optional optional = (Optional) pair.first;
        Optional optional2 = (Optional) pair.second;
        if (optional.isPresent() && optional2.isPresent()) {
            q860<User> q860Var = (q860) optional.get();
            q860<User> q860Var2 = (q860) optional2.get();
            m193449f1(pair, m193450t0(q860Var, q860Var2), q860Var2.f153135a);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m193443X0() {
        creates(new e30() { // from class: l.qfo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154155a.m193429G0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m193444Y0() {
        if (!ura.m195053e().m195057d().mo33735Oq() && ((pgo) this.viewModel).m168850J().m39381R4()) {
            duringCreated(mkd0.m154984r(CoreModule.f17545c.f19690v0.m105767q3(), CoreModule.f17545c.f19690v0.m105766p3(), new x9j() { // from class: l.rfo
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new Pair((Optional) obj, (Optional) obj2);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.sfo
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f164323a.m193442W0((Pair) obj);
                }
            }));
        } else if (ura.m195053e().m195057d().mo33735Oq()) {
            duringCreated(CoreModule.f17545c.f19690v0.m105765o3()).subscribe(mkd0.m154955G(new e30() { // from class: l.tfo
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170010a.m193430H0((Optional) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f17545c.f19690v0.m105766p3()).subscribe(mkd0.m154955G(new e30() { // from class: l.ffo
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f97275a.m193431I0((Optional) obj);
                }
            }));
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m193448e1();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m193443X0();
        m193407a1();
        m193445b1();
        m193446c1();
        m193444Y0();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m193445b1() {
        duringCreated(CoreModule.f17545c.f19555C0.m210114x3()).map(new w9j() { // from class: l.gfo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!xma.m210077h4());
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.hfo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107495a.m193433L0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public final void m193446c1() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.efo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).profile.receivedLikes;
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.lfo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127914a.m193447d1((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public final void m193447d1(Long l2) {
        if (l2.longValue() <= 0) {
            return;
        }
        pib pibVar = CoreModule.f17545c.f19639e0;
        pibVar.f149400j3 = Math.max(pibVar.f149400j3, l2.longValue());
        CoreModule.m29935P().m94651a().mo33403Rr(CoreModule.f17545c.f19639e0.f149400j3);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m193448e1() {
        long jLongValue = CoreModule.f17545c.f19687u0.f19254k0.get().longValue();
        this.f176293b = jLongValue;
        if (jLongValue <= 0) {
            this.f176293b = qib0.f154693H.guessedCurrentServerTime();
        }
        CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
    }

    /* JADX INFO: renamed from: f1 */
    public final void m193449f1(Pair<Optional<q860<User>>, Optional<q860<User>>> pair, ArrayList<etl> arrayList, List<User> list) {
        if (TextUtils.isEmpty(this.f176295d) || "all".equals(this.f176295d)) {
            ((pgo) this.viewModel).m168883s0(m193452x0(pair));
        }
        m193454z0(arrayList, list);
        ((pgo) this.viewModel).m168882r0(!xma.m210077h4());
        ((pgo) this.viewModel).m168880q0(arrayList, this.f176296e);
        this.f176296e = false;
    }

    /* JADX INFO: renamed from: t0 */
    public final ArrayList<etl> m193450t0(q860<User> q860Var, q860<User> q860Var2) {
        ArrayList<etl> arrayList = new ArrayList<>();
        if (!vwb.m200296J(q860Var.f153135a)) {
            DbLinks dbLinks = q860Var.f153136b;
            arrayList.add(new afo(dbLinks.total, q860Var.f153135a, dbLinks));
        }
        List<User> list = q860Var2.f153135a;
        if (!vwb.m200296J(list)) {
            if (!vwb.m200296J(q860Var.f153135a)) {
                arrayList.add(new zfo(App.f15369e.getString(R$string.f20619W)));
            }
            this.f176294c = q860Var2.f153136b;
            boolean zM210077h4 = xma.m210077h4();
            for (User user : list) {
                if (zM210077h4) {
                    arrayList.add(new oco(user));
                } else {
                    arrayList.add(new cgo(user));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u0 */
    public String m193451u0() {
        return this.f176295d;
    }

    /* JADX INFO: renamed from: x0 */
    public final int m193452x0(Pair<Optional<q860<User>>, Optional<q860<User>>> pair) {
        Optional optional = (Optional) pair.first;
        Optional optional2 = (Optional) pair.second;
        if (!optional.isPresent() || !optional2.isPresent()) {
            return -1;
        }
        return ((q860) optional.get()).f153135a.size() + ((q860) optional2.get()).f153136b.total;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m193453y0() {
        if (xma.m210077h4()) {
            return;
        }
        if (!CoreModule.m29935P().m94651a().mo33440X6() && CoreModule.m29935P().m94651a().mo33586s8()) {
            ((pgo) this.viewModel).m168888x0(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
        }
        ((pgo) this.viewModel).m168849H();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m193454z0(ArrayList<etl> arrayList, List<User> list) {
        if (xma.m210077h4()) {
            if (list.size() >= 4) {
                ((pgo) this.viewModel).m168874j0(arrayList);
                ((pgo) this.viewModel).m168848G(true);
            } else {
                arrayList.add(new lco(null));
                ((pgo) this.viewModel).m168848G(false);
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
