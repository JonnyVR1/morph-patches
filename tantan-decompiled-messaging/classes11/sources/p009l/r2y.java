package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.ark;
import l.d30;
import l.e30;
import l.lsi0;
import l.mb90;
import l.mkd0;
import l.sja;
import l.swh0;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class r2y implements lwl {

    /* JADX INFO: renamed from: a */
    public final Act f19617a;

    /* JADX INFO: renamed from: b */
    public boolean f19618b;

    /* JADX INFO: renamed from: c */
    public User f19619c;

    /* JADX INFO: renamed from: d */
    public nwl f19620d = null;

    public r2y(Act act) {
        this.f19617a = act;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m21377g(boolean z, AbsMeetUserItemData absMeetUserItemData, Relationship relationship) {
        if (z) {
            return;
        }
        f5y.m14277k(((DbObject) absMeetUserItemData.user).id);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m21378h(boolean z, AbsMeetUserItemData absMeetUserItemData, Relationship relationship) {
        if (z) {
            return;
        }
        f5y.m14277k(((DbObject) absMeetUserItemData.user).id);
    }

    @Override // p009l.lwl
    /* JADX INFO: renamed from: a */
    public String mo18064a(AbsMeetUserItemData absMeetUserItemData) {
        if (this.f19620d == null) {
            this.f19620d = m21379i(absMeetUserItemData);
        }
        return this.f19620d.from();
    }

    @Override // p009l.lwl
    /* JADX INFO: renamed from: b */
    public void mo18065b(final AbsMeetUserItemData absMeetUserItemData, final boolean z, boolean z2, String str) {
        HashMap map = new HashMap();
        map.put("sourcepage", "mymeet");
        if (NullChecker.a(((AbsMeetListData) absMeetUserItemData).item)) {
            this.f19617a.duringCreated(CoreModule.c.m0.Y7(z, z2, map, absMeetUserItemData.user, str, LikeFrom.get("mymeet"), true, (LikeExtraData) null, 0, ((AbsMeetListData) absMeetUserItemData).item.pick.picksTracker)).subscribe(mkd0.G(new e30() { // from class: l.p2y
                public final void call(Object obj) {
                    r2y.m21378h(z, absMeetUserItemData, (Relationship) obj);
                }
            }));
        } else {
            this.f19617a.duringCreated(CoreModule.c.m0.Y7(z, z2, map, absMeetUserItemData.user, str, LikeFrom.get("mymeet"), true, (LikeExtraData) null, 0, absMeetUserItemData instanceof MeetLiveItemData ? ((MeetLiveItemData) absMeetUserItemData).getItem().picksTracker : null)).subscribe(mkd0.G(new e30() { // from class: l.q2y
                public final void call(Object obj) {
                    r2y.m21377g(z, absMeetUserItemData, (Relationship) obj);
                }
            }));
        }
    }

    @Override // p009l.lwl
    /* JADX INFO: renamed from: c */
    public boolean mo18066c() {
        return this.f19618b;
    }

    @Override // p009l.lwl
    /* JADX INFO: renamed from: d */
    public boolean mo18067d(final AbsMeetUserItemData absMeetUserItemData, final boolean z, final boolean z2, final boolean z3, final String str) {
        nwl nwlVarM21379i = m21379i(absMeetUserItemData);
        this.f19620d = nwlVarM21379i;
        this.f19619c = absMeetUserItemData.user;
        if (nwlVarM21379i.mo11828b(z, z2, false, str, ((AbsMeetListData) absMeetUserItemData).item.pick)) {
            return false;
        }
        Counter counterO3 = CoreModule.c.o3();
        CounterLikeLimit counterLikeLimit = counterO3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3.superLikeLimit;
        final C0158d c0158dM648e = HomeStatisticsHelper.m648e(this.f19617a.pageId(), z3, z, z2, this.f19619c);
        User userP9 = CoreModule.c.e0.p9();
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m637B(c0158dM648e, "failJailedUser");
            return false;
        }
        if (userP9.isNameFake()) {
            HomeStatisticsHelper.m637B(c0158dM648e, "failFakeUser");
            ark.T0(this.f19617a);
            return false;
        }
        if (z2 && xma.e4() && swh0.x0() <= 0) {
            if (!(this.f19620d instanceof s5y) || ((!xma.G3() && sja.r3() <= 0) || !mb90.c(userP9, PurchaseType.TYPE_SUPERLIKE_PKG))) {
                this.f19620d.mo11827a();
                return false;
            }
            c.F1(this.f19617a, "");
            return false;
        }
        if (z2 && !TextUtils.isEmpty(str) && !xma.D3() && swh0.G() && swh0.p0().e1()) {
            swh0.B1(this.f19617a, PurchaseType.TYPE_GET_LETTER, new d30() { // from class: l.n2y
                public final void call() {
                    this.f17202a.m21380j(z, z2, z3, c0158dM648e, str, absMeetUserItemData);
                }
            }, (d30) null);
            return false;
        }
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.c(userP9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            c.M1(this.f19617a, "p_home,likelimit", Privilege.vip_unlimited_likes, (d30) null, (d30) null, false, this.f19619c);
            HomeStatisticsHelper.m637B(c0158dM648e, "failExhaustSwipe");
            return false;
        }
        if (z2 && TextUtils.isEmpty(str) && TEnum.equals(((AbsMeetListData) absMeetUserItemData).item.relation.status, "lettered")) {
            if (this.f19619c.isFemale()) {
                lsi0.w(R.string.k2);
            } else {
                lsi0.w(R.string.l2);
            }
            return false;
        }
        if (z2 && TextUtils.isEmpty(str) && swh0.G1(this.f19617a, new d30() { // from class: l.o2y
            public final void call() {
                this.f17809a.m21381k(c0158dM648e, z, z2, z3, str, absMeetUserItemData);
            }
        })) {
            return false;
        }
        if (!z2 || !TextUtils.isEmpty(str) || swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            this.f19620d.mo11829c(this.f19617a, this.f19619c, z, z2, z3, c0158dM648e, str, ((AbsMeetListData) absMeetUserItemData).item.pick);
            return true;
        }
        c.F1(this.f19617a, this.f19620d.from());
        HomeStatisticsHelper.m637B(c0158dM648e, "failExhaustSuperlike");
        return false;
    }

    /* JADX INFO: renamed from: i */
    public nwl m21379i(AbsMeetUserItemData absMeetUserItemData) {
        if (absMeetUserItemData.isLocalLikersUser()) {
            boolean z = this.f19618b;
            Act act = this.f19617a;
            return z ? new jy10(act) : new b3y(act);
        }
        if (absMeetUserItemData.isSeeUser() || absMeetUserItemData.isSeePortraitUser()) {
            return new s6y(this.f19617a);
        }
        return (absMeetUserItemData.isLikedUser() || absMeetUserItemData.isMomentBeLikeUser() || absMeetUserItemData.isMomentLikeUser()) ? new t2y(this.f19617a) : new s5y(this.f19617a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m21380j(boolean z, boolean z2, boolean z3, C0158d c0158d, String str, AbsMeetUserItemData absMeetUserItemData) {
        swh0.p0().U0();
        this.f19620d.mo11829c(this.f19617a, this.f19619c, z, z2, z3, c0158d, str, ((AbsMeetListData) absMeetUserItemData).item.pick);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m21381k(C0158d c0158d, boolean z, boolean z2, boolean z3, String str, AbsMeetUserItemData absMeetUserItemData) {
        c0158d.m2459p();
        this.f19620d.mo11829c(this.f19617a, this.f19619c, z, z2, z3, c0158d, str, ((AbsMeetListData) absMeetUserItemData).item.pick);
    }

    /* JADX INFO: renamed from: l */
    public void m21382l(boolean z) {
        this.f19618b = z;
    }
}
