package p007l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p000p1.mobile.putong.data.PushMessage;
import com.p000p1.mobile.putong.data.PushMessageContent;
import com.p000p1.mobile.putong.data.PushMessageIntent;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.helper.exception.FeedGPException;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.mgh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w4i {
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public static PendingIntent m15690a(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        Intent intentM15691b = m15691b(pushMessage, z);
        if (intentM15691b == null) {
            return null;
        }
        if (NullChecker.a(pushTrackData)) {
            mgh0.e(intentM15691b, pushTrackData);
        }
        return PendingIntent.getActivity(FeedModule.f313a, (int) System.currentTimeMillis(), intentM15691b, 67108864);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m15691b(PushMessage pushMessage, boolean z) {
        Application application = FeedModule.f313a;
        if (PushMessageIntent.moment_single_comment.equals(pushMessage.intent)) {
            if (User.isMatched(ijb0.m10913X(pushMessage.content.f265id)) || User.isTeamAccount(pushMessage.content.f265id)) {
                Intent intentM11463o = kjb0.m11463o(application, pushMessage);
                mgh0.d(intentM11463o, true, false);
                return intentM11463o;
            }
            Intent intentM6071V1 = PhotoAlbumActivitiesAct.m6071V1(application, "activities", true, false, true);
            intentM6071V1.addFlags(268435456);
            mgh0.d(intentM6071V1, true, false);
            return null;
        }
        if (PushMessageIntent.moment_single_like.equals(pushMessage.intent)) {
            Intent intentM6071V2 = PhotoAlbumActivitiesAct.m6071V1(application, "activities", true, false, true);
            intentM6071V2.addFlags(268435456);
            mgh0.d(intentM6071V2, true, false);
            return null;
        }
        if (PushMessageIntent.moment_match_post.equals(pushMessage.intent)) {
            if (pushMessage.content.type.equals("user") && NullChecker.a(pushMessage.content.parent) && pushMessage.content.parent.type.equals("moment")) {
                FeedGPException.reportPushFromGp(PushMessageIntent.moment_match_post);
                return null;
            }
        } else {
            if (PushMessageIntent.followship_conversation_list.equals(pushMessage.intent)) {
                Intent intentM11455g = kjb0.m11455g(application, NavigationIntent.get(NavigationIntent.menu));
                mgh0.d(intentM11455g, true, false);
                return intentM11455g;
            }
            if (PushMessageIntent.followship_single.equals(pushMessage.intent)) {
                mgh0.d(pushMessage.content.type.equals(Followship.TYPE) ? kjb0.m11472x(application, "album_user_id", pushMessage.content.f265id) : kjb0.m11455g(application, null), true, false);
                return null;
            }
            if ("moment.match.like".equals(pushMessage.intent) || "moment.match.comment".equals(pushMessage.intent)) {
                Intent intentM6071V3 = PhotoAlbumActivitiesAct.m6071V1(application, "activities", true, false, true);
                intentM6071V3.addFlags(268435456);
                intentM6071V3.putExtra("bundle_from_notification", true);
                intentM6071V3.putExtra("bundle_is_idle_push", false);
                return null;
            }
            if ("moment.match.post.feed".equals(pushMessage.intent)) {
                if (pushMessage.content.type.equals("user") && NullChecker.a(pushMessage.content.parent) && pushMessage.content.parent.type.equals("moment")) {
                    Intent intentM11455g2 = kjb0.m11455g(application, NavigationIntent.get("moment"));
                    CoreService coreServiceM1140H = FeedModule.m1140H();
                    PushMessageContent pushMessageContent = pushMessage.content;
                    coreServiceM1140H.jp("detail_square_follow", pushMessageContent.f265id, pushMessageContent.parent.f220id);
                    return intentM11455g2;
                }
            } else if ("state.match.post".equals(pushMessage.intent)) {
                if (pushMessage.content.type.equals("user") && NullChecker.a(pushMessage.content.parent)) {
                    pushMessage.content.parent.type.equals(Channel.state);
                    return null;
                }
            } else if ("moment.match.post.like_feed".equals(pushMessage.intent) && pushMessage.content.type.equals("user") && NullChecker.a(pushMessage.content.parent)) {
                pushMessage.content.parent.type.equals("moment");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15692c() {
        Iterator it = Act.globalLifeCycle_().values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                if (kjb0.m11468t((Activity) ((Act.r) it2.next()).a.get())) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public static void m15693d(PushMessage pushMessage, PushTrackData pushTrackData) {
        PendingIntent pendingIntentM15690a = m15690a(pushMessage, pushTrackData, false);
        if (NullChecker.a(pendingIntentM15690a)) {
            kjb0.m11459k(pushMessage, pendingIntentM15690a, null, null, null);
        }
    }
}
