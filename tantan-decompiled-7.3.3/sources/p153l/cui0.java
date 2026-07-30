package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4882b0;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
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
public abstract class cui0 implements g6m<sfh0.C20031a, VSwipeStack.OnCardSwipeResult> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m112686c(sfh0.C20031a c20031a, Throwable th) {
        c20031a.f167702a.m190785H2(c20031a.f167707f, th);
        bsj0.m106246D(th);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m112687d(User user, sfh0.C20031a c20031a, boolean z, Relationship relationship) {
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
        c20031a.f167707f.m39470b(new pf60<>("distance_content", Integer.valueOf(i)));
        c20031a.f167707f.m39470b(new pf60<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
        c20031a.f167702a.m190786I2(c20031a.f167707f, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            for (Media media : user.pictures) {
                if (!jsi0.m146843b(c20031a.f167702a.m190834v1()) && !c20031a.f167702a.m190834v1().equals(nwb.m164968f(media).formatted())) {
                    uqb0.f180374G.m127126R(c20031a.f167702a.m190834v1());
                }
                c20031a.f167702a.m190789L2(nwb.m164968f(media).formatted());
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
        yfl yflVar = c20031a.f167703b;
        if (zIsFemale) {
            pci.m171662K(yflVar.act(), user, i2);
        } else {
            if (yflVar.act().isFinishing()) {
                return;
            }
            c20031a.f167703b.act().startActivityWithCustomTransition(MatchAct.m48747h2(c20031a.f167703b.act(), jyb.m147507f0(user.f56859id), i2, (ArrayList) relationship.scenarios, null), new MatchAct.C8617b());
        }
    }

    /* JADX INFO: renamed from: e */
    public Counter m112688e() {
        return CoreModule.f18264c.m32487o3();
    }

    /* JADX INFO: renamed from: f */
    public void m112689f(boolean z, final boolean z2, final User user, Map<String, String> map, boolean z3, boolean z4, final sfh0.C20031a c20031a) {
        c20031a.f167707f.m39473e(map);
        if (c20031a.f167705d == SwipeDirection.UP) {
            z5h0.m218665L(c20031a.f167703b.act());
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z3).matchSource((z4 ? HomeStatisticsHelper.ScActionFrom.PROFILE : HomeStatisticsHelper.ScActionFrom.SUGGEST).getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId("p_activity_momentcard_view").build();
        CoreSuggested.UserInfo userInfoM140260e = c20031a.f167704c.m140260e();
        C4882b0 c4882b0 = CoreModule.f18264c.f20408n0;
        c4882b0.f20283T = userInfoM140260e;
        if (userInfoM140260e == null) {
            return;
        }
        c4882b0.m32450P3(z, z2, map, null, LikeFrom.get("home"), true, likeExtraDataNew_, c20031a.f167707f.m39477i(), userInfoM140260e).subscribe(psd0.m173597H(new y20() { // from class: l.aui0
            @Override // p153l.y20
            public final void call(Object obj) {
                cui0.m112687d(user, c20031a, z2, (Relationship) obj);
            }
        }, new y20() { // from class: l.bui0
            @Override // p153l.y20
            public final void call(Object obj) {
                cui0.m112686c(c20031a, (Throwable) obj);
            }
        }));
        if (NullChecker.m82486a(c20031a.f167703b.f199579W)) {
            int size = c20031a.f167703b.f199579W.f182719c.size();
            if (size == 6) {
                uqb0.f180370E.m80052u(180000L);
            } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                c20031a.f167702a.m190784F2(false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m112690g(sfh0.C20031a c20031a) {
        SwipeDirection swipeDirection = c20031a.f167705d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }
}
