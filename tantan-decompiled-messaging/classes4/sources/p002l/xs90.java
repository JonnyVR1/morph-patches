package p002l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import l.d30;
import l.e30;
import l.juk;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xs90 {

    /* JADX INFO: renamed from: a */
    public static xs90 f22440a = null;

    /* JADX INFO: renamed from: b */
    public static String f22441b = "input_text";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m26089a(Act act, e30 e30Var, Relationship relationship) {
        if (TEnum.equals(relationship.state, "matched")) {
            int i = 0;
            if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("superLiked")) {
                i = 11;
            } else if (relationship.status.size() != 0 && relationship.status.get(0) == MatchFrom.get("secretcrush")) {
                i = 1;
            }
            act.startActivityWithCustomTransition(MatchAct.e2(act, vwb.f0(new String[]{relationship.id}), i, new ArrayList()), new MatchAct.b());
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call(relationship);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m26090b(d30 d30Var, Throwable th) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static xs90 m26091c() {
        if (f22440a == null) {
            synchronized (xs90.class) {
                try {
                    if (f22440a == null) {
                        f22440a = new xs90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22440a;
    }

    /* JADX INFO: renamed from: e */
    public static void m26092e() {
        f22440a = null;
    }

    /* JADX INFO: renamed from: f */
    public static void m26093f(final Act act, User user, String str, boolean z, boolean z2, String str2, final e30<Relationship> e30Var, final d30 d30Var) {
        LikeFrom likeFrom = TextUtils.equals(str2, "p_received_profile_like") ? LikeFrom.get("likers") : LikeFrom.get("home");
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.profileLikeId = str;
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(str2).isLike(z).isSuperLiked(z2).user(((DbObject) user).id).pageId(str2).build();
        act.duringCreated(CoreModule.c.m0.U7(z, z2, (Map) null, user, likeExtraDataNew_, likeFrom)).subscribe(mkd0.H(new e30() { // from class: l.vs90
            public final void call(Object obj) {
                xs90.m26089a(act, e30Var, (Relationship) obj);
            }
        }, new e30() { // from class: l.ws90
            public final void call(Object obj) {
                xs90.m26090b(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public String m26094d(int i) {
        if (juk.e()) {
            return "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating2-material/index.html?speed=true&_bid=1004821&hideNavigationBar=1&hideNotch=1&visitorCount=" + i + "#/complimentsReceived";
        }
        return "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/dating2-material/index.html?speed=true&_bid=1004821&hideNavigationBar=1&hideNotch=1&visitorCount=" + i + "#/complimentsReceived";
    }
}
