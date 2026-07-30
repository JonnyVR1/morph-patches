package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class mkg {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m155008a(String str, boolean z, Act act, User user, boolean z2, String str2, Relationship relationship) {
        User user2;
        boolean z3;
        Relationship relationship2;
        if (!TextUtils.isEmpty(str)) {
            osi0.m165783g(str);
        }
        if (!TEnum.equals(relationship.state, "liked")) {
            if (TEnum.equals(relationship.state, "matched")) {
                CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
                coreSuggested.f19466y0 = 0;
                coreSuggested.f19469z0 = 0;
                if (z) {
                    user2 = user;
                    z3 = z2;
                    relationship2 = relationship;
                    m155010c(act, user2, z3, false, relationship2, str2);
                }
            }
            CoreModule.m29934N().processMomentLikeStatusChanged(relationship2, user2, z3, false);
        }
        CoreSuggested coreSuggested2 = CoreModule.f17545c.f19663m0;
        coreSuggested2.f19466y0++;
        coreSuggested2.f19469z0++;
        user2 = user;
        z3 = z2;
        relationship2 = relationship;
        CoreModule.m29934N().processMomentLikeStatusChanged(relationship2, user2, z3, false);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m155009b(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX INFO: renamed from: c */
    public static void m155010c(Act act, User user, boolean z, boolean z2, Relationship relationship, String str) {
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
        act.startActivityWithCustomTransition(MatchAct.m47564g2(act, vwb.m200324f0(user.f56011id), i, (ArrayList) relationship.scenarios, str), new MatchAct.C8454b());
    }

    /* JADX INFO: renamed from: d */
    public static void m155011d(final Act act, final User user, final boolean z, LikeFrom likeFrom, final String str, final boolean z2, final String str2) {
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151579i(R$string.f18813p4, true);
            return;
        }
        if (user == null) {
            return;
        }
        if (TEnum.equals(likeFrom, "moment") && m155012e()) {
            C8764c.m53412M1(act, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, user);
        } else {
            act.duringCreated(CoreModule.f17545c.f19663m0.m31065W7(z, false, null, user, null, likeFrom, true, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.kkg
                @Override // p149l.e30
                public final void call(Object obj) {
                    mkg.m155008a(str, z2, act, user, z, str2, (Relationship) obj);
                }
            }, new e30() { // from class: l.lkg
                @Override // p149l.e30
                public final void call(Object obj) {
                    mkg.m155009b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m155012e() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterLikeLimit counterLikeLimit = counterM31484o3 == null ? null : counterM31484o3.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153867c(userM169527p9, PurchaseType.TYPE_LIKENOLIMIT_PKG);
    }
}
