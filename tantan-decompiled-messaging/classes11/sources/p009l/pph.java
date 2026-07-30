package p009l;

import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import l.abi;
import l.e30;
import l.j760;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.wge0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class pph implements p3m<qph.C1150a, VSwipeStack.OnCardSwipeResult> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20540c(qph.C1150a c1150a, Throwable th) {
        c1150a.f19431g.mo7340a2(c1150a.f19430f, th);
        yij0.m25382D(th);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20541d(User user, qph.C1150a c1150a, boolean z, Relationship relationship) {
        long jGuessedCurrentServerTime;
        int i;
        int i2 = 0;
        if (NullChecker.a(user) && NullChecker.a(user.location)) {
            i = user.location.distance;
            jGuessedCurrentServerTime = (long) ((qib0.H.guessedCurrentServerTime() - user.location.updatedTime) / 1000.0d);
        } else {
            jGuessedCurrentServerTime = 0;
            i = 0;
        }
        c1150a.f19430f.m2445b(new j760<>("distance_content", Integer.valueOf(i)));
        c1150a.f19430f.m2445b(new j760<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
        c1150a.f19431g.mo7345k2(c1150a.f19430f, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            c1150a.f19431g.mo7344h0();
            if (relationship.status.contains(MatchFrom.get("xmasActivity"))) {
                return;
            }
            if (relationship.status.size() != 0 && TEnum.equals((MatchFrom) relationship.status.get(0), "superLikedEach")) {
                i2 = 13;
            } else if (relationship.status.size() == 0 || !TEnum.equals((MatchFrom) relationship.status.get(0), "superLiked")) {
                if (z) {
                    i2 = 12;
                }
            } else if (z) {
                i2 = 12;
            } else {
                i2 = 11;
            }
            boolean zIsFemale = CoreModule.K().me_().isFemale();
            Act act = c1150a.f19425a;
            if (zIsFemale) {
                abi.K(act, user, i2);
            } else {
                if (act.isFinishing()) {
                    return;
                }
                c1150a.f19425a.startActivityWithCustomTransition(MatchAct.g2(c1150a.f19425a, vwb.f0(new String[]{((DbObject) user).id}), i2, (ArrayList) relationship.scenarios, (String) null), new MatchAct.b());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public Counter m20542e() {
        return CoreModule.c.o3();
    }

    /* JADX INFO: renamed from: f */
    public void m20543f(boolean z, final boolean z2, final User user, Map<String, String> map, boolean z3, final qph.C1150a c1150a) {
        c1150a.f19430f.m2448e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z3).matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId(c1150a.f19430f.m2451h()).build();
        if (user == null) {
            return;
        }
        CoreModule.c.m0.a8(z, z2, map, user, "", LikeFrom.get("poi"), true, likeExtraDataNew_, c1150a.f19430f.m2452i(), CoreModule.c.k1.t3(((DbObject) user).id), true, wge0.f().d(((DbObject) user).id), false).subscribe(mkd0.H(new e30() { // from class: l.nph
            public final void call(Object obj) {
                pph.m20541d(user, c1150a, z2, (Relationship) obj);
            }
        }, new e30() { // from class: l.oph
            public final void call(Object obj) {
                pph.m20540c(c1150a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public boolean m20544g(qph.C1150a c1150a) {
        SwipeDirection swipeDirection = c1150a.f19428d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }
}
