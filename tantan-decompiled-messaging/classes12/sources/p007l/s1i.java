package p007l;

import com.p000p1.mobile.putong.data.KanKanStatus;
import com.p000p1.mobile.putong.data.KanPostData;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.lsi0;
import l.osi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s1i {
    /* JADX INFO: renamed from: c */
    public static boolean m13979c(Act act) {
        return m13980d(act, "");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m13980d(final Act act, String str) {
        if (NullChecker.a(FeedModule.f317e.f8795H) && NullChecker.a(FeedModule.f317e.f8795H.e()) && TEnum.equals(((KanPostData) FeedModule.f317e.f8795H.e()).status, KanKanStatus.start)) {
            osi0.g("状态发布中...");
            return true;
        }
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return true;
        }
        if (!sti.m14315a()) {
            return false;
        }
        v1h.m15219P0(act, new d30() { // from class: l.q1i
            public final void call() {
                lsi0.w(R$string.f444U1);
            }
        }, false, new d30() { // from class: l.r1i
            public final void call() {
                s1i.m13981e(act);
            }
        }, w1h.f14361a);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m13981e(Act act) {
        if (m13979c(act)) {
            return;
        }
        if (nkg.m12199A()) {
            FeedSelectAndPostStatusAct.m6960s2(act);
        } else {
            FeedSelectStatusAct.m6963D2(act);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m13982f(Act act, String str) {
        if (m13979c(act)) {
            return;
        }
        if (nkg.m12199A()) {
            FeedSelectAndPostStatusAct.m6961u2(act, str);
        } else {
            FeedSelectStatusAct.m6964E2(act, str);
        }
    }
}
