package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class b1a0 {

    /* JADX INFO: renamed from: a */
    public static b1a0 f74350a = null;

    /* JADX INFO: renamed from: b */
    public static String f74351b = "input_text";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m101459a(Act act, y20 y20Var, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                i = 11;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                i = 1;
            }
            act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(relationship.f39654id), i, new ArrayList()), new MatchAct.C8617b());
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(relationship);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m101460b(x20 x20Var, Throwable th) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static b1a0 m101461c() {
        if (f74350a == null) {
            synchronized (b1a0.class) {
                try {
                    if (f74350a == null) {
                        f74350a = new b1a0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f74350a;
    }

    /* JADX INFO: renamed from: e */
    public static void m101462e() {
        f74350a = null;
    }

    /* JADX INFO: renamed from: f */
    public static void m101463f(final Act act, User user, String str, boolean z, boolean z2, String str2, final y20<Relationship> y20Var, final x20 x20Var) {
        LikeFrom likeFrom = TextUtils.equals(str2, "p_received_profile_like") ? LikeFrom.get("likers") : LikeFrom.get("home");
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.profileLikeId = str;
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(str2).isLike(z).isSuperLiked(z2).user(user.f56859id).pageId(str2).build();
        act.duringCreated(CoreModule.f18264c.f20405m0.m32060U7(z, z2, null, user, likeExtraDataNew_, likeFrom)).subscribe(psd0.m173597H(new y20() { // from class: l.z0a0
            @Override // p153l.y20
            public final void call(Object obj) {
                b1a0.m101459a(act, y20Var, (Relationship) obj);
            }
        }, new y20() { // from class: l.a1a0
            @Override // p153l.y20
            public final void call(Object obj) {
                b1a0.m101460b(x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public String m101464d(int i) {
        if (zwk.m221905e()) {
            return "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating2-material/index.html?speed=true&_bid=1004821&hideNavigationBar=1&hideNotch=1&visitorCount=" + i + "#/complimentsReceived";
        }
        return "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating2-material/index.html?speed=true&_bid=1004821&hideNavigationBar=1&hideNotch=1&visitorCount=" + i + "#/complimentsReceived";
    }
}
