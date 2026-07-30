package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class r2y implements lwl {

    /* JADX INFO: renamed from: a */
    public final Act f157459a;

    /* JADX INFO: renamed from: b */
    public boolean f157460b;

    /* JADX INFO: renamed from: c */
    public User f157461c;

    /* JADX INFO: renamed from: d */
    public nwl f157462d = null;

    public r2y(Act act) {
        this.f157459a = act;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m177624g(boolean z, AbsMeetUserItemData absMeetUserItemData, Relationship relationship) {
        if (z) {
            return;
        }
        f5y.m119546k(absMeetUserItemData.user.f56011id);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m177625h(boolean z, AbsMeetUserItemData absMeetUserItemData, Relationship relationship) {
        if (z) {
            return;
        }
        f5y.m119546k(absMeetUserItemData.user.f56011id);
    }

    @Override // p149l.lwl
    /* JADX INFO: renamed from: a */
    public String mo151975a(AbsMeetUserItemData absMeetUserItemData) {
        if (this.f157462d == null) {
            this.f157462d = m177626i(absMeetUserItemData);
        }
        return this.f157462d.from();
    }

    @Override // p149l.lwl
    /* JADX INFO: renamed from: b */
    public void mo151976b(final AbsMeetUserItemData absMeetUserItemData, final boolean z, boolean z2, String str) {
        HashMap map = new HashMap();
        map.put("sourcepage", "mymeet");
        if (NullChecker.m81303a(absMeetUserItemData.item)) {
            this.f157459a.duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(z, z2, map, absMeetUserItemData.user, str, LikeFrom.get("mymeet"), true, null, 0, absMeetUserItemData.item.pick.picksTracker)).subscribe(mkd0.m154955G(new e30() { // from class: l.p2y
                @Override // p149l.e30
                public final void call(Object obj) {
                    r2y.m177625h(z, absMeetUserItemData, (Relationship) obj);
                }
            }));
        } else {
            this.f157459a.duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(z, z2, map, absMeetUserItemData.user, str, LikeFrom.get("mymeet"), true, null, 0, absMeetUserItemData instanceof MeetLiveItemData ? ((MeetLiveItemData) absMeetUserItemData).getItem().picksTracker : null)).subscribe(mkd0.m154955G(new e30() { // from class: l.q2y
                @Override // p149l.e30
                public final void call(Object obj) {
                    r2y.m177624g(z, absMeetUserItemData, (Relationship) obj);
                }
            }));
        }
    }

    @Override // p149l.lwl
    /* JADX INFO: renamed from: c */
    public boolean mo151977c() {
        return this.f157460b;
    }

    @Override // p149l.lwl
    /* JADX INFO: renamed from: d */
    public boolean mo151978d(final AbsMeetUserItemData absMeetUserItemData, final boolean z, final boolean z2, final boolean z3, final String str) {
        nwl nwlVarM177626i = m177626i(absMeetUserItemData);
        this.f157462d = nwlVarM177626i;
        this.f157461c = absMeetUserItemData.user;
        if (nwlVarM177626i.mo100121b(z, z2, false, str, absMeetUserItemData.item.pick)) {
            return false;
        }
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterLikeLimit counterLikeLimit = counterM31484o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3.superLikeLimit;
        final C7994d c7994dM36699e = HomeStatisticsHelper.m36699e(this.f157459a.pageId(), z3, z, z2, this.f157461c);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m36688B(c7994dM36699e, "failJailedUser");
            return false;
        }
        if (userM169527p9.isNameFake()) {
            HomeStatisticsHelper.m36688B(c7994dM36699e, "failFakeUser");
            ark.m98449T0(this.f157459a);
            return false;
        }
        if (z2 && xma.m210071e4() && swh0.m186276x0() <= 0) {
            if (!(this.f157462d instanceof s5y) || ((!xma.m210044G3() && sja.m184461r3() <= 0) || !mb90.m153867c(userM169527p9, PurchaseType.TYPE_SUPERLIKE_PKG))) {
                this.f157462d.mo100120a();
                return false;
            }
            C8764c.m53391F1(this.f157459a, "");
            return false;
        }
        if (z2 && !TextUtils.isEmpty(str) && !xma.m210041D3() && swh0.m186191G() && swh0.m186255p0().m186311e1()) {
            swh0.m186180B1(this.f157459a, PurchaseType.TYPE_GET_LETTER, new d30() { // from class: l.n2y
                @Override // p149l.d30
                public final void call() {
                    this.f136883a.m177627j(z, z2, z3, c7994dM36699e, str, absMeetUserItemData);
                }
            }, null);
            return false;
        }
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153867c(userM169527p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8764c.m53412M1(this.f157459a, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, this.f157461c);
            HomeStatisticsHelper.m36688B(c7994dM36699e, "failExhaustSwipe");
            return false;
        }
        if (z2 && TextUtils.isEmpty(str) && TEnum.equals(absMeetUserItemData.item.relation.status, "lettered")) {
            if (this.f157461c.isFemale()) {
                lsi0.m151593w(R$string.f18656k2);
            } else {
                lsi0.m151593w(R$string.f18687l2);
            }
            return false;
        }
        if (z2 && TextUtils.isEmpty(str) && swh0.m186193G1(this.f157459a, new d30() { // from class: l.o2y
            @Override // p149l.d30
            public final void call() {
                this.f141564a.m177628k(c7994dM36699e, z, z2, z3, str, absMeetUserItemData);
            }
        })) {
            return false;
        }
        if (!z2 || !TextUtils.isEmpty(str) || swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            this.f157462d.mo100122c(this.f157459a, this.f157461c, z, z2, z3, c7994dM36699e, str, absMeetUserItemData.item.pick);
            return true;
        }
        C8764c.m53391F1(this.f157459a, this.f157462d.from());
        HomeStatisticsHelper.m36688B(c7994dM36699e, "failExhaustSuperlike");
        return false;
    }

    /* JADX INFO: renamed from: i */
    public nwl m177626i(AbsMeetUserItemData absMeetUserItemData) {
        if (absMeetUserItemData.isLocalLikersUser()) {
            boolean z = this.f157460b;
            Act act = this.f157459a;
            return z ? new jy10(act) : new b3y(act);
        }
        if (absMeetUserItemData.isSeeUser() || absMeetUserItemData.isSeePortraitUser()) {
            return new s6y(this.f157459a);
        }
        return (absMeetUserItemData.isLikedUser() || absMeetUserItemData.isMomentBeLikeUser() || absMeetUserItemData.isMomentLikeUser()) ? new t2y(this.f157459a) : new s5y(this.f157459a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m177627j(boolean z, boolean z2, boolean z3, C7994d c7994d, String str, AbsMeetUserItemData absMeetUserItemData) {
        swh0.m186255p0().m186301U0();
        this.f157462d.mo100122c(this.f157459a, this.f157461c, z, z2, z3, c7994d, str, absMeetUserItemData.item.pick);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m177628k(C7994d c7994d, boolean z, boolean z2, boolean z3, String str, AbsMeetUserItemData absMeetUserItemData) {
        c7994d.m38481p();
        this.f157462d.mo100122c(this.f157459a, this.f157461c, z, z2, z3, c7994d, str, absMeetUserItemData.item.pick);
    }

    /* JADX INFO: renamed from: l */
    public void m177629l(boolean z) {
        this.f157460b = z;
    }
}
