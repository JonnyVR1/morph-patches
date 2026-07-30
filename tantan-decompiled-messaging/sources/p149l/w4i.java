package p149l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.helper.exception.FeedGPException;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class w4i {
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public static PendingIntent m201509a(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        Intent intentM201510b = m201510b(pushMessage, z);
        if (intentM201510b == null) {
            return null;
        }
        if (NullChecker.m81303a(pushTrackData)) {
            mgh0.m154549e(intentM201510b, pushTrackData);
        }
        return PendingIntent.getActivity(FeedModule.f38852a, (int) System.currentTimeMillis(), intentM201510b, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m201510b(PushMessage pushMessage, boolean z) {
        Application application = FeedModule.f38852a;
        if (PushMessageIntent.moment_single_comment.equals(pushMessage.intent)) {
            if (User.isMatched(ijb0.m136560X(pushMessage.content.f38804id)) || User.isTeamAccount(pushMessage.content.f38804id)) {
                Intent intentM146204o = kjb0.m146204o(application, pushMessage);
                mgh0.m154548d(intentM146204o, true, false);
                return intentM146204o;
            }
            Intent intentM64971V1 = PhotoAlbumActivitiesAct.m64971V1(application, "activities", true, false, true);
            intentM64971V1.addFlags(268435456);
            mgh0.m154548d(intentM64971V1, true, false);
            return null;
        }
        if (PushMessageIntent.moment_single_like.equals(pushMessage.intent)) {
            Intent intentM64971V2 = PhotoAlbumActivitiesAct.m64971V1(application, "activities", true, false, true);
            intentM64971V2.addFlags(268435456);
            mgh0.m154548d(intentM64971V2, true, false);
            return null;
        }
        if (PushMessageIntent.moment_match_post.equals(pushMessage.intent)) {
            if (pushMessage.content.type.equals("user") && NullChecker.m81303a(pushMessage.content.parent) && pushMessage.content.parent.type.equals("moment")) {
                FeedGPException.reportPushFromGp(PushMessageIntent.moment_match_post);
                return null;
            }
        } else {
            if (PushMessageIntent.followship_conversation_list.equals(pushMessage.intent)) {
                Intent intentM146196g = kjb0.m146196g(application, NavigationIntent.get(NavigationIntent.menu));
                mgh0.m154548d(intentM146196g, true, false);
                return intentM146196g;
            }
            if (PushMessageIntent.followship_single.equals(pushMessage.intent)) {
                mgh0.m154548d(pushMessage.content.type.equals(Followship.TYPE) ? kjb0.m146213x(application, "album_user_id", pushMessage.content.f38804id) : kjb0.m146196g(application, null), true, false);
                return null;
            }
            if ("moment.match.like".equals(pushMessage.intent) || "moment.match.comment".equals(pushMessage.intent)) {
                Intent intentM64971V3 = PhotoAlbumActivitiesAct.m64971V1(application, "activities", true, false, true);
                intentM64971V3.addFlags(268435456);
                intentM64971V3.putExtra("bundle_from_notification", true);
                intentM64971V3.putExtra("bundle_is_idle_push", false);
                return null;
            }
            if ("moment.match.post.feed".equals(pushMessage.intent)) {
                if (pushMessage.content.type.equals("user") && NullChecker.m81303a(pushMessage.content.parent) && pushMessage.content.parent.type.equals("moment")) {
                    Intent intentM146196g2 = kjb0.m146196g(application, NavigationIntent.get("moment"));
                    CoreService coreServiceM60222H = FeedModule.m60222H();
                    PushMessageContent pushMessageContent = pushMessage.content;
                    coreServiceM60222H.mo30780jp("detail_square_follow", pushMessageContent.f38804id, pushMessageContent.parent.f38759id);
                    return intentM146196g2;
                }
            } else if ("state.match.post".equals(pushMessage.intent)) {
                if (pushMessage.content.type.equals("user") && NullChecker.m81303a(pushMessage.content.parent)) {
                    pushMessage.content.parent.type.equals("state");
                    return null;
                }
            } else if ("moment.match.post.like_feed".equals(pushMessage.intent) && pushMessage.content.type.equals("user") && NullChecker.m81303a(pushMessage.content.parent)) {
                pushMessage.content.parent.type.equals("moment");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m201511c() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (kjb0.m146209t(it2.next().f15343a.get())) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public static void m201512d(PushMessage pushMessage, PushTrackData pushTrackData) {
        PendingIntent pendingIntentM201509a = m201509a(pushMessage, pushTrackData, false);
        if (NullChecker.m81303a(pendingIntentM201509a)) {
            kjb0.m146200k(pushMessage, pendingIntentM201509a, null, null, null);
        }
    }
}
