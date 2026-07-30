package p009l;

import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.b0;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Media;
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
import l.jji0;
import l.mkd0;
import l.qib0;
import l.rxg0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class cli0 implements p3m<k7h0.C0984a, VSwipeStack.OnCardSwipeResult> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12701c(k7h0.C0984a c0984a, Throwable th) {
        c0984a.f15441a.m13113H2(c0984a.f15446f, th);
        yij0.m25382D(th);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m12702d(User user, k7h0.C0984a c0984a, boolean z, Relationship relationship) {
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
        c0984a.f15446f.m2445b(new j760<>("distance_content", Integer.valueOf(i)));
        c0984a.f15446f.m2445b(new j760<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
        c0984a.f15441a.m13114I2(c0984a.f15446f, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            for (Media media : user.pictures) {
                if (!jji0.b(c0984a.f15441a.m13163v1()) && !c0984a.f15441a.m13163v1().equals(zub.m25966f(media).formatted())) {
                    qib0.G.R(c0984a.f15441a.m13163v1());
                }
                c0984a.f15441a.m13117L2(zub.m25966f(media).formatted());
            }
            return;
        }
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
        idl idlVar = c0984a.f15442b;
        if (zIsFemale) {
            abi.K(idlVar.act(), user, i2);
        } else {
            if (idlVar.act().isFinishing()) {
                return;
            }
            c0984a.f15442b.act().startActivityWithCustomTransition(MatchAct.g2(c0984a.f15442b.act(), vwb.f0(new String[]{((DbObject) user).id}), i2, (ArrayList) relationship.scenarios, (String) null), new MatchAct.b());
        }
    }

    /* JADX INFO: renamed from: e */
    public Counter m12703e() {
        return CoreModule.c.o3();
    }

    /* JADX INFO: renamed from: f */
    public void m12704f(boolean z, final boolean z2, final User user, Map<String, String> map, boolean z3, boolean z4, final k7h0.C0984a c0984a) {
        c0984a.f15446f.m2448e(map);
        if (c0984a.f15444d == SwipeDirection.UP) {
            rxg0.L(c0984a.f15442b.act());
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z3).matchSource((z4 ? HomeStatisticsHelper.ScActionFrom.PROFILE : HomeStatisticsHelper.ScActionFrom.SUGGEST).getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId("p_activity_momentcard_view").build();
        CoreSuggested.UserInfo userInfoM17131e = c0984a.f15443c.m17131e();
        b0 b0Var = CoreModule.c.n0;
        b0Var.T = userInfoM17131e;
        if (userInfoM17131e == null) {
            return;
        }
        b0Var.P3(z, z2, map, (User) null, LikeFrom.get("home"), true, likeExtraDataNew_, c0984a.f15446f.m2452i(), userInfoM17131e).subscribe(mkd0.H(new e30() { // from class: l.ali0
            public final void call(Object obj) {
                cli0.m12702d(user, c0984a, z2, (Relationship) obj);
            }
        }, new e30() { // from class: l.bli0
            public final void call(Object obj) {
                cli0.m12701c(c0984a, (Throwable) obj);
            }
        }));
        if (NullChecker.a(c0984a.f15442b.f14540W)) {
            int size = c0984a.f15442b.f14540W.f14313c.size();
            if (size == 6) {
                qib0.E.m9164u(180000L);
            } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                c0984a.f15441a.m13112F2(false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m12705g(k7h0.C0984a c0984a) {
        SwipeDirection swipeDirection = c0984a.f15444d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }
}
