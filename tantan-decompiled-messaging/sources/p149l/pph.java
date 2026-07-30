package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pph implements p3m<qph.C19553a, VSwipeStack.OnCardSwipeResult> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m170717c(qph.C19553a c19553a, Throwable th) {
        c19553a.f155763g.mo43128a2(c19553a.f155762f, th);
        yij0.m214926D(th);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m170718d(User user, qph.C19553a c19553a, boolean z, Relationship relationship) {
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
        c19553a.f155762f.m38467b(new j760<>("distance_content", Integer.valueOf(i)));
        c19553a.f155762f.m38467b(new j760<>("time_content", Long.valueOf(jGuessedCurrentServerTime)));
        c19553a.f155763g.mo43130k2(c19553a.f155762f, "success");
        if (TEnum.equals(relationship.state, "matched")) {
            c19553a.f155763g.mo43129h0();
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
            Act act = c19553a.f155757a;
            if (zIsFemale) {
                abi.m95623K(act, user, i2);
            } else {
                if (act.isFinishing()) {
                    return;
                }
                c19553a.f155757a.startActivityWithCustomTransition(MatchAct.m47564g2(c19553a.f155757a, vwb.m200324f0(user.f56011id), i2, (ArrayList) relationship.scenarios, null), new MatchAct.C8454b());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public Counter m170719e() {
        return CoreModule.f17545c.m31484o3();
    }

    /* JADX INFO: renamed from: f */
    public void m170720f(boolean z, final boolean z2, final User user, Map<String, String> map, boolean z3, final qph.C19553a c19553a) {
        c19553a.f155762f.m38470e(map);
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().isFromButton(z3).matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(z).isSuperLiked(z2).user(user).pageId(c19553a.f155762f.m38473h()).build();
        if (user == null) {
            return;
        }
        CoreModule.f17545c.f19663m0.m31081a8(z, z2, map, user, "", LikeFrom.get("poi"), true, likeExtraDataNew_, c19553a.f155762f.m38474i(), CoreModule.f17545c.f19658k1.m184474t3(user.f56011id), true, wge0.m203034f().m203037d(user.f56011id), false).subscribe(mkd0.m154956H(new e30() { // from class: l.nph
            @Override // p149l.e30
            public final void call(Object obj) {
                pph.m170718d(user, c19553a, z2, (Relationship) obj);
            }
        }, new e30() { // from class: l.oph
            @Override // p149l.e30
            public final void call(Object obj) {
                pph.m170717c(c19553a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public boolean m170721g(qph.C19553a c19553a) {
        SwipeDirection swipeDirection = c19553a.f155760d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }
}
