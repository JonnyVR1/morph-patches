package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.LikeExtraData;
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
import l.mkd0;
import l.qib0;
import l.rxg0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class udp implements p3m<j7h0.C0970a, VSwipeStack.OnCardSwipeResult> {
    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m22804c(User user, j7h0.C0970a c0970a, boolean z, Relationship relationship) {
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
        c0970a.f14972f.m2445b(new j760<>("distance_content", Integer.valueOf(i)));
        c0970a.f14972f.m2445b(new j760<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
        c0970a.f14967a.m15835x2(c0970a.f14972f, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            for (Media media : user.pictures) {
                if (!TextUtils.isEmpty(c0970a.f14967a.m15825o1()) && !c0970a.f14967a.m15825o1().equals(zub.m25966f(media).formatted())) {
                    qib0.G.R(c0970a.f14967a.m15825o1());
                }
                c0970a.f14967a.m15786A2(zub.m25966f(media).formatted());
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
        pip pipVar = c0970a.f14968b;
        if (zIsFemale) {
            abi.K(pipVar.act(), user, i2);
        } else {
            if (pipVar.act().isFinishing()) {
                return;
            }
            c0970a.f14968b.act().startActivityWithCustomTransition(MatchAct.g2(c0970a.f14968b.act(), vwb.f0(new String[]{((DbObject) user).id}), i2, (ArrayList) relationship.scenarios, (String) null), new MatchAct.b());
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22805d(j7h0.C0970a c0970a, Throwable th) {
        c0970a.f14967a.m15834w2(c0970a.f14972f, th);
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: e */
    public Counter m22806e() {
        return CoreModule.c.o3();
    }

    /* JADX INFO: renamed from: f */
    public void m22807f(boolean z, final boolean z2, final User user, Map<String, String> map, boolean z3, boolean z4, final j7h0.C0970a c0970a) {
        c0970a.f14972f.m2448e(map);
        if (c0970a.f14970d == SwipeDirection.UP) {
            rxg0.L(c0970a.f14968b.act());
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z3).matchSource((z4 ? HomeStatisticsHelper.ScActionFrom.PROFILE : HomeStatisticsHelper.ScActionFrom.SUGGEST).getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId("p_activity_momentcard_view").build();
        CoreSuggested.UserInfo userInfoM17131e = c0970a.f14969c.m17131e();
        CoreModule.c.o0.W = userInfoM17131e;
        if (userInfoM17131e == null) {
            return;
        }
        CoreModule.c.o0.R3(z, z2, map, (User) null, "tribe-" + c0970a.f14968b.f18675U, true, likeExtraDataNew_, c0970a.f14972f.m2452i(), userInfoM17131e).subscribe(mkd0.H(new e30() { // from class: l.sdp
            public final void call(Object obj) {
                udp.m22804c(user, c0970a, z2, (Relationship) obj);
            }
        }, new e30() { // from class: l.tdp
            public final void call(Object obj) {
                udp.m22805d(c0970a, (Throwable) obj);
            }
        }));
        if (NullChecker.a(c0970a.f14968b.f18655F)) {
            int size = c0970a.f14968b.f18655F.f12732c.size();
            if (size == 6) {
                qib0.E.m9164u(180000L);
            } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                c0970a.f14967a.m15833v2(false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m22808g(j7h0.C0970a c0970a) {
        SwipeDirection swipeDirection = c0970a.f14970d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }

    /* JADX INFO: renamed from: h */
    public User m22809h() {
        return CoreModule.c.e0.p9();
    }
}
