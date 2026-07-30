package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class erh implements g6m<frh.C17047a, VSwipeStack.OnCardSwipeResult> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m122183c(frh.C17047a c17047a, Throwable th) {
        c17047a.f100426g.mo44139a2(c17047a.f100425f, th);
        bsj0.m106246D(th);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m122184d(User user, frh.C17047a c17047a, boolean z, Relationship relationship) {
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
        c17047a.f100425f.m39470b(new pf60<>("distance_content", Integer.valueOf(i)));
        c17047a.f100425f.m39470b(new pf60<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
        c17047a.f100426g.mo44141k2(c17047a.f100425f, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            c17047a.f100426g.mo44140h0();
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
            Act act = c17047a.f100420a;
            if (zIsFemale) {
                pci.m171662K(act, user, i2);
            } else {
                if (act.isFinishing()) {
                    return;
                }
                c17047a.f100420a.startActivityWithCustomTransition(MatchAct.m48747h2(c17047a.f100420a, jyb.m147507f0(user.f56859id), i2, (ArrayList) relationship.scenarios, null), new MatchAct.C8617b());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public Counter m122185e() {
        return CoreModule.f18264c.m32487o3();
    }

    /* JADX INFO: renamed from: f */
    public void m122186f(boolean z, final boolean z2, final User user, Map<String, String> map, boolean z3, final frh.C17047a c17047a) {
        c17047a.f100425f.m39473e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z3).matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId(c17047a.f100425f.m39476h()).build();
        if (user == null) {
            return;
        }
        CoreModule.f18264c.f20405m0.m32084a8(z, z2, map, user, "", LikeFrom.get("poi"), true, likeExtraDataNew_, c17047a.f100425f.m39477i(), CoreModule.f18264c.f20400k1.m121135t3(user.f56859id), true, bpe0.m105814f().m105817d(user.f56859id), false).subscribe(psd0.m173597H(new y20() { // from class: l.crh
            @Override // p153l.y20
            public final void call(Object obj) {
                erh.m122184d(user, c17047a, z2, (Relationship) obj);
            }
        }, new y20() { // from class: l.drh
            @Override // p153l.y20
            public final void call(Object obj) {
                erh.m122183c(c17047a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public boolean m122187g(frh.C17047a c17047a) {
        SwipeDirection swipeDirection = c17047a.f100423d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }
}
