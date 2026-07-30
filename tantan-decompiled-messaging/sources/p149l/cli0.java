package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4731b0;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
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
public abstract class cli0 implements p3m<k7h0.C17941a, VSwipeStack.OnCardSwipeResult> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m107471c(k7h0.C17941a c17941a, Throwable th) {
        c17941a.f121580a.m110803H2(c17941a.f121585f, th);
        yij0.m214926D(th);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m107472d(User user, k7h0.C17941a c17941a, boolean z, Relationship relationship) {
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
        c17941a.f121585f.m38467b(new j760<>("distance_content", Integer.valueOf(i)));
        c17941a.f121585f.m38467b(new j760<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
        c17941a.f121580a.m110804I2(c17941a.f121585f, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            for (Media media : user.pictures) {
                if (!jji0.m141806b(c17941a.f121580a.m110852v1()) && !c17941a.f121580a.m110852v1().equals(zub.m220207f(media).formatted())) {
                    qib0.f154691G.m102342R(c17941a.f121580a.m110852v1());
                }
                c17941a.f121580a.m110807L2(zub.m220207f(media).formatted());
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
        idl idlVar = c17941a.f121581b;
        if (zIsFemale) {
            abi.m95623K(idlVar.act(), user, i2);
        } else {
            if (idlVar.act().isFinishing()) {
                return;
            }
            c17941a.f121581b.act().startActivityWithCustomTransition(MatchAct.m47564g2(c17941a.f121581b.act(), vwb.m200324f0(user.f56011id), i2, (ArrayList) relationship.scenarios, null), new MatchAct.C8454b());
        }
    }

    /* JADX INFO: renamed from: e */
    public Counter m107473e() {
        return CoreModule.f17545c.m31484o3();
    }

    /* JADX INFO: renamed from: f */
    public void m107474f(boolean z, final boolean z2, final User user, Map<String, String> map, boolean z3, boolean z4, final k7h0.C17941a c17941a) {
        c17941a.f121585f.m38470e(map);
        if (c17941a.f121583d == SwipeDirection.UP) {
            rxg0.m181562L(c17941a.f121581b.act());
        }
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z3).matchSource((z4 ? HomeStatisticsHelper.ScActionFrom.PROFILE : HomeStatisticsHelper.ScActionFrom.SUGGEST).getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId("p_activity_momentcard_view").build();
        CoreSuggested.UserInfo userInfoM141746e = c17941a.f121582c.m141746e();
        C4731b0 c4731b0 = CoreModule.f17545c.f19666n0;
        c4731b0.f19541T = userInfoM141746e;
        if (userInfoM141746e == null) {
            return;
        }
        c4731b0.m31447P3(z, z2, map, null, LikeFrom.get("home"), true, likeExtraDataNew_, c17941a.f121585f.m38474i(), userInfoM141746e).subscribe(mkd0.m154956H(new e30() { // from class: l.ali0
            @Override // p149l.e30
            public final void call(Object obj) {
                cli0.m107472d(user, c17941a, z2, (Relationship) obj);
            }
        }, new e30() { // from class: l.bli0
            @Override // p149l.e30
            public final void call(Object obj) {
                cli0.m107471c(c17941a, (Throwable) obj);
            }
        }));
        if (NullChecker.m81303a(c17941a.f121581b.f112609W)) {
            int size = c17941a.f121581b.f112609W.f110174c.size();
            if (size == 6) {
                qib0.f154687E.m78869u(180000L);
            } else if (size == 5 || size == 3 || size == 1 || size == 0) {
                c17941a.f121580a.m110802F2(false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m107475g(k7h0.C17941a c17941a) {
        SwipeDirection swipeDirection = c17941a.f121583d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }
}
