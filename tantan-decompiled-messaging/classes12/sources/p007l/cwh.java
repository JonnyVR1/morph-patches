package p007l;

import android.app.PendingIntent;
import com.p000p1.mobile.putong.data.PushMessage;
import com.p000p1.mobile.putong.data.PushMessageIntent;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.putong.app.TantanApp;
import com.tantanapp.common.utils.NullChecker;
import l.qib0;
import l.vwb;
import l.ydb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cwh {

    /* JADX INFO: renamed from: l.cwh$a */
    public class C2357a implements ydb0.g {
        /* JADX INFO: renamed from: a */
        public boolean m9247a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (qib0.b0.a.signedIn_() && !vqg.m15552y0() && NullChecker.a(FeedModule.f316d)) {
                return cwh.m9245a(pushMessage, pushTrackData);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public PendingIntent m9248b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return w4i.m15690a(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9245a(PushMessage pushMessage, PushTrackData pushTrackData) {
        boolean z = false;
        if (NullChecker.a(pushMessage)) {
            if (PushMessageIntent.moment_single_like.equals(pushMessage.intent)) {
                ijb0.m10898I();
                FeedModule.f315c.m1624S2();
                if (!TantanApp.c.N()) {
                    return true;
                }
            } else if (PushMessageIntent.moment_single_comment.equals(pushMessage.intent)) {
                ijb0.m10898I();
                FeedModule.f315c.m1624S2();
                if (!TantanApp.c.N()) {
                    return true;
                }
            } else {
                if (PushMessageIntent.moment_single_unlike.equals(pushMessage.intent)) {
                    FeedModule.f315c.m1677s4(rib0.m13904a(), pushMessage.content.parent.f220id);
                    TantanApp.c.N();
                    return true;
                }
                if (PushMessageIntent.followship_conversation_list.equals(pushMessage.intent)) {
                    ijb0.m10898I();
                    return true;
                }
                if (PushMessageIntent.followship_single.equals(pushMessage.intent)) {
                    ijb0.m10898I();
                } else {
                    if (PushMessageIntent.moment_match_post.equals(pushMessage.intent) || "moment.match.like".equals(pushMessage.intent) || "moment.match.comment".equals(pushMessage.intent) || "moment.match.post.feed".equals(pushMessage.intent) || "state.match.post".equals(pushMessage.intent) || "moment.match.post.like_feed".equals(pushMessage.intent)) {
                    }
                    if (!pushMessage.silent && z) {
                        w4i.m15693d(pushMessage, pushTrackData);
                    }
                }
            }
            z = true;
            if (!pushMessage.silent) {
                w4i.m15693d(pushMessage, pushTrackData);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static void m9246b() {
        TantanApp.c.a0(new C2357a(), vwb.f0(new String[]{PushMessageIntent.moment_single_unlike, PushMessageIntent.moment_single_like, PushMessageIntent.moment_single_comment, PushMessageIntent.followship_single, PushMessageIntent.followship_conversation_list, "moment.match.like", "moment.match.comment", PushMessageIntent.moment_match_post, "moment.match.post.feed", "state.match.post", "moment.match.post.like_feed"}));
    }
}
