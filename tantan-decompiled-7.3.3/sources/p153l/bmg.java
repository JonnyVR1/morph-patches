package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class bmg {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m105055a(String str, boolean z, Act act, User user, boolean z2, String str2, Relationship relationship) {
        User user2;
        boolean z3;
        Relationship relationship2;
        if (!TextUtils.isEmpty(str)) {
            r1j0.m179420g(str);
        }
        if (!TEnum.equals(relationship.state, "liked")) {
            if (TEnum.equals(relationship.state, "matched")) {
                CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
                coreSuggested.f20208y0 = 0;
                coreSuggested.f20211z0 = 0;
                if (z) {
                    user2 = user;
                    z3 = z2;
                    relationship2 = relationship;
                    m105057c(act, user2, z3, false, relationship2, str2);
                }
            }
            CoreModule.m30932N().processMomentLikeStatusChanged(relationship2, user2, z3, false);
        }
        CoreSuggested coreSuggested2 = CoreModule.f18264c.f20405m0;
        coreSuggested2.f20208y0++;
        coreSuggested2.f20211z0++;
        user2 = user;
        z3 = z2;
        relationship2 = relationship;
        CoreModule.m30932N().processMomentLikeStatusChanged(relationship2, user2, z3, false);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m105056b(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX INFO: renamed from: c */
    public static void m105057c(Act act, User user, boolean z, boolean z2, Relationship relationship, String str) {
        if (!TEnum.equals(relationship.state, "matched") || relationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity))) {
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
            i = 13;
        } else if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), "secretcrush")) {
                i = 1;
            } else if (z2) {
                i = 12;
            }
        } else if (z2) {
            i = 12;
        } else {
            i = 11;
        }
        act.startActivityWithCustomTransition(MatchAct.m48747h2(act, jyb.m147507f0(user.f56859id), i, (ArrayList) relationship.scenarios, str), new MatchAct.C8617b());
    }

    /* JADX INFO: renamed from: d */
    public static void m105058d(final Act act, final User user, final boolean z, LikeFrom likeFrom, final String str, final boolean z2, final String str2) {
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165635i(R$string.f19605r4, true);
            return;
        }
        if (user == null) {
            return;
        }
        if (TEnum.equals(likeFrom, "moment") && m105059e()) {
            C8927c.m54595M1(act, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, user);
        } else {
            act.duringCreated(CoreModule.f18264c.f20405m0.m32068W7(z, false, null, user, null, likeFrom, true, null)).subscribe(psd0.m173597H(new y20() { // from class: l.zlg
                @Override // p153l.y20
                public final void call(Object obj) {
                    bmg.m105055a(str, z2, act, user, z, str2, (Relationship) obj);
                }
            }, new y20() { // from class: l.amg
                @Override // p153l.y20
                public final void call(Object obj) {
                    bmg.m105056b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m105059e() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterLikeLimit counterLikeLimit = counterM32487o3 == null ? null : counterM32487o3.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176831c(userM116600p9, PurchaseType.TYPE_LIKENOLIMIT_PKG);
    }
}
