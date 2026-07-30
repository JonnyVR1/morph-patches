package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class udp implements p3m<j7h0.C17710a, VSwipeStack.OnCardSwipeResult> {
    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m193145c(User user, j7h0.C17710a c17710a, boolean z, Relationship relationship) {
        long jGuessedCurrentServerTime;
        int i;
        int i2 = 0;
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.location)) {
            i = user.location.distance;
            jGuessedCurrentServerTime = (long) ((qib0.f154693H.guessedCurrentServerTime() - user.location.updatedTime) / 1000.0d);
        } else {
            jGuessedCurrentServerTime = 0;
            i = 0;
        }
        c17710a.f116604f.m38467b(new j760<>("distance_content", Integer.valueOf(i)));
        c17710a.f116604f.m38467b(new j760<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
        c17710a.f116599a.m131092x2(c17710a.f116604f, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            for (Media media : user.pictures) {
                if (!TextUtils.isEmpty(c17710a.f116599a.m131082o1()) && !c17710a.f116599a.m131082o1().equals(zub.m220207f(media).formatted())) {
                    qib0.f154691G.m102342R(c17710a.f116599a.m131082o1());
                }
                c17710a.f116599a.m131044A2(zub.m220207f(media).formatted());
            }
            return;
        }
        if (relationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity))) {
            return;
        }
        if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
            i2 = 13;
        } else if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
            if (z) {
                i2 = 12;
            }
        } else if (z) {
            i2 = 12;
        } else {
            i2 = 11;
        }
        boolean zIsFemale = CoreModule.m29932K().me_().isFemale();
        pip pipVar = c17710a.f116600b;
        if (zIsFemale) {
            abi.m95623K(pipVar.getAct(), user, i2);
        } else {
            if (pipVar.getAct().isFinishing()) {
                return;
            }
            c17710a.f116600b.getAct().startActivityWithCustomTransition(MatchAct.m47564g2(c17710a.f116600b.getAct(), vwb.m200324f0(user.f56011id), i2, (ArrayList) relationship.scenarios, null), new MatchAct.C8454b());
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m193146d(j7h0.C17710a c17710a, Throwable th) {
        c17710a.f116599a.m131091w2(c17710a.f116604f, th);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: e */
    public Counter m193147e() {
        return CoreModule.f17545c.m31484o3();
    }

    /* JADX INFO: renamed from: f */
    public void m193148f(boolean z, final boolean z2, final User user, Map<String, String> map, boolean z3, boolean z4, final j7h0.C17710a c17710a) {
        c17710a.f116604f.m38470e(map);
        if (c17710a.f116602d == SwipeDirection.UP) {
            rxg0.m181562L(c17710a.f116600b.getAct());
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z3).matchSource((z4 ? HomeStatisticsHelper.ScActionFrom.PROFILE : HomeStatisticsHelper.ScActionFrom.SUGGEST).getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId("p_activity_momentcard_view").build();
        CoreSuggested.UserInfo userInfoM141746e = c17710a.f116601c.m141746e();
        CoreModule.f17545c.f19669o0.f20061W = userInfoM141746e;
        if (userInfoM141746e == null) {
            return;
        }
        CoreModule.f17545c.f19669o0.m34315R3(z, z2, map, null, "tribe-" + c17710a.f116600b.f149629U, true, likeExtraDataNew_, c17710a.f116604f.m38474i(), userInfoM141746e).subscribe(mkd0.m154956H(new e30() { // from class: l.sdp
            @Override // p149l.e30
            public final void call(Object obj) {
                udp.m193145c(user, c17710a, z2, (Relationship) obj);
            }
        }, new e30() { // from class: l.tdp
            @Override // p149l.e30
            public final void call(Object obj) {
                udp.m193146d(c17710a, (Throwable) obj);
            }
        }));
        if (NullChecker.m81303a(c17710a.f116600b.f149609F)) {
            int size = c17710a.f116600b.f149609F.f93841c.size();
            if (size == 6) {
                qib0.f154687E.m78869u(180000L);
            } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                c17710a.f116599a.m131090v2(false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m193149g(j7h0.C17710a c17710a) {
        SwipeDirection swipeDirection = c17710a.f116602d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }

    /* JADX INFO: renamed from: h */
    public User m193150h() {
        return CoreModule.f17545c.f19639e0.m169527p9();
    }
}
