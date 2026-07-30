package p153l;

import android.app.PendingIntent;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class rxh {

    /* JADX INFO: renamed from: l.rxh$a */
    public class C19930a implements cmb0.InterfaceC16312g {
        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: a */
        public boolean mo103259a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (uqb0.f180396b0.f170324a.signedIn_() && !ksg.m151241y0() && NullChecker.m82486a(FeedModule.f39703d)) {
                return rxh.m183542a(pushMessage, pushTrackData);
            }
            return false;
        }

        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo103260b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return l6i.m153060a(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m183542a(PushMessage pushMessage, PushTrackData pushTrackData) {
        boolean z = false;
        if (NullChecker.m82486a(pushMessage)) {
            if (PushMessageIntent.moment_single_like.equals(pushMessage.intent)) {
                mrb0.m159631I();
                FeedModule.f39702c.m61882S2();
                if (!TantanApp.f17899c.m111127N()) {
                    return true;
                }
            } else if (PushMessageIntent.moment_single_comment.equals(pushMessage.intent)) {
                mrb0.m159631I();
                FeedModule.f39702c.m61882S2();
                if (!TantanApp.f17899c.m111127N()) {
                    return true;
                }
            } else {
                if (PushMessageIntent.moment_single_unlike.equals(pushMessage.intent)) {
                    FeedModule.f39702c.m61935s4(vqb0.m202371a(), pushMessage.content.parent.f39607id);
                    TantanApp.f17899c.m111127N();
                    return true;
                }
                if (PushMessageIntent.followship_conversation_list.equals(pushMessage.intent)) {
                    mrb0.m159631I();
                    return true;
                }
                if (PushMessageIntent.followship_single.equals(pushMessage.intent)) {
                    mrb0.m159631I();
                } else {
                    if (PushMessageIntent.moment_match_post.equals(pushMessage.intent) || "moment.match.like".equals(pushMessage.intent) || "moment.match.comment".equals(pushMessage.intent) || "moment.match.post.feed".equals(pushMessage.intent) || "state.match.post".equals(pushMessage.intent) || "moment.match.post.like_feed".equals(pushMessage.intent)) {
                    }
                    if (!pushMessage.silent && z) {
                        l6i.m153063d(pushMessage, pushTrackData);
                    }
                }
            }
            z = true;
            if (!pushMessage.silent) {
                l6i.m153063d(pushMessage, pushTrackData);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static void m183543b() {
        TantanApp.f17899c.m111140a0(new C19930a(), jyb.m147507f0(PushMessageIntent.moment_single_unlike, PushMessageIntent.moment_single_like, PushMessageIntent.moment_single_comment, PushMessageIntent.followship_single, PushMessageIntent.followship_conversation_list, "moment.match.like", "moment.match.comment", PushMessageIntent.moment_match_post, "moment.match.post.feed", "state.match.post", "moment.match.post.like_feed"));
    }
}
