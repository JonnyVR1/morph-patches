package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class xs90 {

    /* JADX INFO: renamed from: a */
    public static xs90 f194213a = null;

    /* JADX INFO: renamed from: b */
    public static String f194214b = "input_text";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m210733a(Act act, e30 e30Var, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get(MatchFrom.superLiked)) {
                i = 11;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                i = 1;
            }
            act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(relationship);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m210734b(d30 d30Var, Throwable th) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static xs90 m210735c() {
        if (f194213a == null) {
            synchronized (xs90.class) {
                try {
                    if (f194213a == null) {
                        f194213a = new xs90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f194213a;
    }

    /* JADX INFO: renamed from: e */
    public static void m210736e() {
        f194213a = null;
    }

    /* JADX INFO: renamed from: f */
    public static void m210737f(final Act act, User user, String str, boolean z, boolean z2, String str2, final e30<Relationship> e30Var, final d30 d30Var) {
        LikeFrom likeFrom = TextUtils.equals(str2, "p_received_profile_like") ? LikeFrom.get("likers") : LikeFrom.get("home");
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.profileLikeId = str;
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(str2).isLike(z).isSuperLiked(z2).user(user.f56011id).pageId(str2).build();
        act.duringCreated(CoreModule.f17545c.f19663m0.m31057U7(z, z2, null, user, likeExtraDataNew_, likeFrom)).subscribe(mkd0.m154956H(new e30() { // from class: l.vs90
            @Override // p149l.e30
            public final void call(Object obj) {
                xs90.m210733a(act, e30Var, (Relationship) obj);
            }
        }, new e30() { // from class: l.ws90
            @Override // p149l.e30
            public final void call(Object obj) {
                xs90.m210734b(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public String m210738d(int i) {
        if (juk.m143323e()) {
            return "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating2-material/index.html?speed=true&_bid=1004821&hideNavigationBar=1&hideNotch=1&visitorCount=" + i + "#/complimentsReceived";
        }
        return "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating2-material/index.html?speed=true&_bid=1004821&hideNavigationBar=1&hideNotch=1&visitorCount=" + i + "#/complimentsReceived";
    }
}
