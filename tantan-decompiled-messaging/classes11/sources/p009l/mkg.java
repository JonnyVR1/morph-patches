package p009l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Map;
import l.d30;
import l.e30;
import l.lsi0;
import l.mb90;
import l.mkd0;
import l.osi0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mkg {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18518a(String str, boolean z, Act act, User user, boolean z2, String str2, Relationship relationship) {
        User user2;
        boolean z3;
        Relationship relationship2;
        if (!TextUtils.isEmpty(str)) {
            osi0.g(str);
        }
        if (!TEnum.equals(relationship.state, "liked")) {
            if (TEnum.equals(relationship.state, "matched")) {
                CoreSuggested coreSuggested = CoreModule.c.m0;
                coreSuggested.y0 = 0;
                coreSuggested.z0 = 0;
                if (z) {
                    user2 = user;
                    z3 = z2;
                    relationship2 = relationship;
                    m18520c(act, user2, z3, false, relationship2, str2);
                }
            }
            CoreModule.N().processMomentLikeStatusChanged(relationship2, user2, z3, false);
        }
        CoreSuggested coreSuggested2 = CoreModule.c.m0;
        coreSuggested2.y0++;
        coreSuggested2.z0++;
        user2 = user;
        z3 = z2;
        relationship2 = relationship;
        CoreModule.N().processMomentLikeStatusChanged(relationship2, user2, z3, false);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m18519b(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX INFO: renamed from: c */
    public static void m18520c(Act act, User user, boolean z, boolean z2, Relationship relationship, String str) {
        if (!TEnum.equals(relationship.state, "matched") || relationship.status.contains(MatchFrom.get("xmasActivity"))) {
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
            i = 13;
        } else if (relationship.status.size() == 0 || !TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) {
            if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "secretcrush")) {
                i = 1;
            } else if (z2) {
                i = 12;
            }
        } else if (z2) {
            i = 12;
        } else {
            i = 11;
        }
        act.startActivityWithCustomTransition(MatchAct.g2(act, vwb.f0(new String[]{((DbObject) user).id}), i, (ArrayList) relationship.scenarios, str), new MatchAct.b());
    }

    /* JADX INFO: renamed from: d */
    public static void m18521d(final Act act, final User user, final boolean z, LikeFrom likeFrom, final String str, final boolean z2, final String str2) {
        if (!Network.isConnected(CoreModule.b)) {
            lsi0.i(R.string.p4, true);
            return;
        }
        if (user == null) {
            return;
        }
        if (TEnum.equals(likeFrom, "moment") && m18522e()) {
            c.M1(act, "p_home,likelimit", Privilege.vip_unlimited_likes, (d30) null, (d30) null, false, user);
        } else {
            act.duringCreated(CoreModule.c.m0.W7(z, false, (Map) null, user, (String) null, likeFrom, true, (LikeExtraData) null)).subscribe(mkd0.H(new e30() { // from class: l.kkg
                public final void call(Object obj) {
                    mkg.m18518a(str, z2, act, user, z, str2, (Relationship) obj);
                }
            }, new e30() { // from class: l.lkg
                public final void call(Object obj) {
                    mkg.m18519b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18522e() {
        User userP9 = CoreModule.c.e0.p9();
        Counter counterO3 = CoreModule.c.o3();
        CounterLikeLimit counterLikeLimit = counterO3 == null ? null : counterO3.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.c(userP9, PurchaseType.TYPE_LIKENOLIMIT_PKG);
    }
}
