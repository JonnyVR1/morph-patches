package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class s1i {
    /* JADX INFO: renamed from: c */
    public static boolean m181963c(Act act) {
        return m181964d(act, "");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m181964d(final Act act, String str) {
        if (NullChecker.m81303a(FeedModule.f38856e.f109186H) && NullChecker.m81303a(FeedModule.f38856e.f109186H.m221515e()) && TEnum.equals(FeedModule.f38856e.f109186H.m221515e().status, "start")) {
            osi0.m165783g("状态发布中...");
            return true;
        }
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return true;
        }
        if (!sti.m185955a()) {
            return false;
        }
        v1h.m196580P0(act, new d30() { // from class: l.q1i
            @Override // p149l.d30
            public final void call() {
                lsi0.m151593w(R$string.f38983U1);
            }
        }, false, new d30() { // from class: l.r1i
            @Override // p149l.d30
            public final void call() {
                s1i.m181965e(act);
            }
        }, w1h.f184003a);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m181965e(Act act) {
        if (m181963c(act)) {
            return;
        }
        if (nkg.m159840A()) {
            FeedSelectAndPostStatusAct.m65814s2(act);
        } else {
            FeedSelectStatusAct.m65817D2(act);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m181966f(Act act, String str) {
        if (m181963c(act)) {
            return;
        }
        if (nkg.m159840A()) {
            FeedSelectAndPostStatusAct.m65815u2(act, str);
        } else {
            FeedSelectStatusAct.m65818E2(act, str);
        }
    }
}
