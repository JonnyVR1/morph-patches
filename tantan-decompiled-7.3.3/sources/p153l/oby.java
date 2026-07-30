package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class oby implements dzl {

    /* JADX INFO: renamed from: a */
    public final Act f146633a;

    /* JADX INFO: renamed from: b */
    public boolean f146634b;

    /* JADX INFO: renamed from: c */
    public User f146635c;

    /* JADX INFO: renamed from: d */
    public fzl f146636d = null;

    public oby(Act act) {
        this.f146633a = act;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m167064g(boolean z, AbsMeetUserItemData absMeetUserItemData, Relationship relationship) {
        if (z) {
            return;
        }
        cey.m109476k(absMeetUserItemData.user.f56859id);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m167065h(boolean z, AbsMeetUserItemData absMeetUserItemData, Relationship relationship) {
        if (z) {
            return;
        }
        cey.m109476k(absMeetUserItemData.user.f56859id);
    }

    @Override // p153l.dzl
    /* JADX INFO: renamed from: a */
    public String mo118746a(AbsMeetUserItemData absMeetUserItemData) {
        if (this.f146636d == null) {
            this.f146636d = m167066i(absMeetUserItemData);
        }
        return this.f146636d.from();
    }

    @Override // p153l.dzl
    /* JADX INFO: renamed from: b */
    public void mo118747b(final AbsMeetUserItemData absMeetUserItemData, final boolean z, boolean z2, String str) {
        HashMap map = new HashMap();
        map.put("sourcepage", "mymeet");
        if (NullChecker.m82486a(absMeetUserItemData.item)) {
            this.f146633a.duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(z, z2, map, absMeetUserItemData.user, str, LikeFrom.get("mymeet"), true, null, 0, absMeetUserItemData.item.pick.picksTracker)).subscribe(psd0.m173596G(new y20() { // from class: l.mby
                @Override // p153l.y20
                public final void call(Object obj) {
                    oby.m167065h(z, absMeetUserItemData, (Relationship) obj);
                }
            }));
        } else {
            this.f146633a.duringCreated(CoreModule.f18264c.f20405m0.m32076Y7(z, z2, map, absMeetUserItemData.user, str, LikeFrom.get("mymeet"), true, null, 0, absMeetUserItemData instanceof MeetLiveItemData ? ((MeetLiveItemData) absMeetUserItemData).getItem().picksTracker : null)).subscribe(psd0.m173596G(new y20() { // from class: l.nby
                @Override // p153l.y20
                public final void call(Object obj) {
                    oby.m167064g(z, absMeetUserItemData, (Relationship) obj);
                }
            }));
        }
    }

    @Override // p153l.dzl
    /* JADX INFO: renamed from: c */
    public boolean mo118748c() {
        return this.f146634b;
    }

    @Override // p153l.dzl
    /* JADX INFO: renamed from: d */
    public boolean mo118749d(final AbsMeetUserItemData absMeetUserItemData, final boolean z, final boolean z2, final boolean z3, final String str) {
        fzl fzlVarM167066i = m167066i(absMeetUserItemData);
        this.f146636d = fzlVarM167066i;
        this.f146635c = absMeetUserItemData.user;
        if (fzlVarM167066i.mo128194b(z, z2, false, str, absMeetUserItemData.item.pick)) {
            return false;
        }
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterLikeLimit counterLikeLimit = counterM32487o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3.superLikeLimit;
        final C8145d c8145dM37702e = HomeStatisticsHelper.m37702e(this.f146633a.pageId(), z3, z, z2, this.f146635c);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            HomeStatisticsHelper.m37691B(c8145dM37702e, "failJailedUser");
            return false;
        }
        if (userM116600p9.isNameFake()) {
            HomeStatisticsHelper.m37691B(c8145dM37702e, "failFakeUser");
            qtk.m177999T0(this.f146633a);
            return false;
        }
        if (z2 && joa.m146386f4() && a5i0.m96181x0() <= 0) {
            if (!(this.f146636d instanceof pey) || ((!joa.m146358H3() && ela.m121122r3() <= 0) || !qj90.m176831c(userM116600p9, PurchaseType.TYPE_SUPERLIKE_PKG))) {
                this.f146636d.mo128193a();
                return false;
            }
            C8927c.m54574F1(this.f146633a, "");
            return false;
        }
        if (z2 && !TextUtils.isEmpty(str) && !joa.m146355E3() && a5i0.m96096G() && a5i0.m96160p0().m96216e1()) {
            a5i0.m96085B1(this.f146633a, PurchaseType.TYPE_GET_LETTER, new x20() { // from class: l.kby
                @Override // p153l.x20
                public final void call() {
                    this.f124997a.m167067j(z, z2, z3, c8145dM37702e, str, absMeetUserItemData);
                }
            }, null);
            return false;
        }
        if (z && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176831c(userM116600p9, PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
            C8927c.m54595M1(this.f146633a, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, this.f146635c);
            HomeStatisticsHelper.m37691B(c8145dM37702e, "failExhaustSwipe");
            return false;
        }
        if (z2 && TextUtils.isEmpty(str) && TEnum.equals(absMeetUserItemData.item.relation.status, "lettered")) {
            if (this.f146635c.isFemale()) {
                o1j0.m165649w(R$string.f19386k2);
            } else {
                o1j0.m165649w(R$string.f19417l2);
            }
            return false;
        }
        if (z2 && TextUtils.isEmpty(str) && a5i0.m96098G1(this.f146633a, new x20() { // from class: l.lby
            @Override // p153l.x20
            public final void call() {
                this.f131232a.m167068k(c8145dM37702e, z, z2, z3, str, absMeetUserItemData);
            }
        })) {
            return false;
        }
        if (!z2 || !TextUtils.isEmpty(str) || a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) != 0) {
            this.f146636d.mo128195c(this.f146633a, this.f146635c, z, z2, z3, c8145dM37702e, str, absMeetUserItemData.item.pick);
            return true;
        }
        C8927c.m54574F1(this.f146633a, this.f146636d.from());
        HomeStatisticsHelper.m37691B(c8145dM37702e, "failExhaustSuperlike");
        return false;
    }

    /* JADX INFO: renamed from: i */
    public fzl m167066i(AbsMeetUserItemData absMeetUserItemData) {
        if (absMeetUserItemData.isLocalLikersUser()) {
            boolean z = this.f146634b;
            Act act = this.f146633a;
            return z ? new r620(act) : new yby(act);
        }
        if (absMeetUserItemData.isSeeUser() || absMeetUserItemData.isSeePortraitUser()) {
            return new pfy(this.f146633a);
        }
        return (absMeetUserItemData.isLikedUser() || absMeetUserItemData.isMomentBeLikeUser() || absMeetUserItemData.isMomentLikeUser()) ? new qby(this.f146633a) : new pey(this.f146633a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m167067j(boolean z, boolean z2, boolean z3, C8145d c8145d, String str, AbsMeetUserItemData absMeetUserItemData) {
        a5i0.m96160p0().m96206U0();
        this.f146636d.mo128195c(this.f146633a, this.f146635c, z, z2, z3, c8145d, str, absMeetUserItemData.item.pick);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m167068k(C8145d c8145d, boolean z, boolean z2, boolean z3, String str, AbsMeetUserItemData absMeetUserItemData) {
        c8145d.m39484p();
        this.f146636d.mo128195c(this.f146633a, this.f146635c, z, z2, z3, c8145d, str, absMeetUserItemData.item.pick);
    }

    /* JADX INFO: renamed from: l */
    public void m167069l(boolean z) {
        this.f146634b = z;
    }
}
