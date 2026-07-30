package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ufp implements g6m<rfh0.C19824a, VSwipeStack.OnCardSwipeResult> {
    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m195850c(User user, rfh0.C19824a c19824a, boolean z, Relationship relationship) {
        long jGuessedCurrentServerTime;
        int i;
        int i2 = 0;
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.location)) {
            i = user.location.distance;
            jGuessedCurrentServerTime = (long) ((uqb0.f180376H.guessedCurrentServerTime() - user.location.updatedTime) / 1000.0d);
        } else {
            jGuessedCurrentServerTime = 0;
            i = 0;
        }
        c19824a.f162792f.m39470b(new pf60<>("distance_content", Integer.valueOf(i)));
        c19824a.f162792f.m39470b(new pf60<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
        c19824a.f162787a.m135496x2(c19824a.f162792f, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            for (Media media : user.pictures) {
                if (!TextUtils.isEmpty(c19824a.f162787a.m135486o1()) && !c19824a.f162787a.m135486o1().equals(nwb.m164968f(media).formatted())) {
                    uqb0.f180374G.m127126R(c19824a.f162787a.m135486o1());
                }
                c19824a.f162787a.m135448A2(nwb.m164968f(media).formatted());
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
        boolean zIsFemale = CoreModule.m30930K().me_().isFemale();
        pkp pkpVar = c19824a.f162788b;
        if (zIsFemale) {
            pci.m171662K(pkpVar.getAct(), user, i2);
        } else {
            if (pkpVar.getAct().isFinishing()) {
                return;
            }
            c19824a.f162788b.getAct().startActivityWithCustomTransition(MatchAct.m48747h2(c19824a.f162788b.getAct(), jyb.m147507f0(user.f56859id), i2, (ArrayList) relationship.scenarios, null), new MatchAct.C8617b());
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m195851d(rfh0.C19824a c19824a, Throwable th) {
        c19824a.f162787a.m135495w2(c19824a.f162792f, th);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: e */
    public Counter m195852e() {
        return CoreModule.f18264c.m32487o3();
    }

    /* JADX INFO: renamed from: f */
    public void m195853f(boolean z, final boolean z2, final User user, Map<String, String> map, boolean z3, boolean z4, final rfh0.C19824a c19824a) {
        c19824a.f162792f.m39473e(map);
        if (c19824a.f162790d == SwipeDirection.UP) {
            z5h0.m218665L(c19824a.f162788b.getAct());
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z3).matchSource((z4 ? HomeStatisticsHelper.ScActionFrom.PROFILE : HomeStatisticsHelper.ScActionFrom.SUGGEST).getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId("p_activity_momentcard_view").build();
        CoreSuggested.UserInfo userInfoM140260e = c19824a.f162789c.m140260e();
        CoreModule.f18264c.f20411o0.f20803W = userInfoM140260e;
        if (userInfoM140260e == null) {
            return;
        }
        CoreModule.f18264c.f20411o0.m35318R3(z, z2, map, null, "tribe-" + c19824a.f162788b.f152896U, true, likeExtraDataNew_, c19824a.f162792f.m39477i(), userInfoM140260e).subscribe(psd0.m173597H(new y20() { // from class: l.sfp
            @Override // p153l.y20
            public final void call(Object obj) {
                ufp.m195850c(user, c19824a, z2, (Relationship) obj);
            }
        }, new y20() { // from class: l.tfp
            @Override // p153l.y20
            public final void call(Object obj) {
                ufp.m195851d(c19824a, (Throwable) obj);
            }
        }));
        if (NullChecker.m82486a(c19824a.f162788b.f152876F)) {
            int size = c19824a.f162788b.f152876F.f166636c.size();
            if (size == 6) {
                uqb0.f180370E.m80052u(180000L);
            } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                c19824a.f162787a.m135494v2(false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m195854g(rfh0.C19824a c19824a) {
        SwipeDirection swipeDirection = c19824a.f162790d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }

    /* JADX INFO: renamed from: h */
    public User m195855h() {
        return CoreModule.f18264c.f20381e0.m116600p9();
    }
}
