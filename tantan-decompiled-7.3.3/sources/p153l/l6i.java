package p153l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.helper.exception.FeedGPException;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class l6i {
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public static PendingIntent m153060a(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        Intent intentM153061b = m153061b(pushMessage, z);
        if (intentM153061b == null) {
            return null;
        }
        if (NullChecker.m82486a(pushTrackData)) {
            toh0.m192045e(intentM153061b, pushTrackData);
        }
        return PendingIntent.getActivity(FeedModule.f39700a, (int) System.currentTimeMillis(), intentM153061b, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m153061b(PushMessage pushMessage, boolean z) {
        Application application = FeedModule.f39700a;
        if (PushMessageIntent.moment_single_comment.equals(pushMessage.intent)) {
            if (User.isMatched(mrb0.m159646X(pushMessage.content.f39652id)) || User.isTeamAccount(pushMessage.content.f39652id)) {
                Intent intentM168898o = orb0.m168898o(application, pushMessage);
                toh0.m192044d(intentM168898o, true, false);
                return intentM168898o;
            }
            Intent intentM66154X1 = PhotoAlbumActivitiesAct.m66154X1(application, "activities", true, false, true);
            intentM66154X1.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            toh0.m192044d(intentM66154X1, true, false);
            return null;
        }
        if (PushMessageIntent.moment_single_like.equals(pushMessage.intent)) {
            Intent intentM66154X2 = PhotoAlbumActivitiesAct.m66154X1(application, "activities", true, false, true);
            intentM66154X2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            toh0.m192044d(intentM66154X2, true, false);
            return null;
        }
        if (PushMessageIntent.moment_match_post.equals(pushMessage.intent)) {
            if (pushMessage.content.type.equals("user") && NullChecker.m82486a(pushMessage.content.parent) && pushMessage.content.parent.type.equals("moment")) {
                FeedGPException.reportPushFromGp(PushMessageIntent.moment_match_post);
                return null;
            }
        } else {
            if (PushMessageIntent.followship_conversation_list.equals(pushMessage.intent)) {
                Intent intentM168890g = orb0.m168890g(application, NavigationIntent.get(NavigationIntent.menu));
                toh0.m192044d(intentM168890g, true, false);
                return intentM168890g;
            }
            if (PushMessageIntent.followship_single.equals(pushMessage.intent)) {
                toh0.m192044d(pushMessage.content.type.equals(Followship.TYPE) ? orb0.m168907x(application, "album_user_id", pushMessage.content.f39652id) : orb0.m168890g(application, null), true, false);
                return null;
            }
            if ("moment.match.like".equals(pushMessage.intent) || "moment.match.comment".equals(pushMessage.intent)) {
                Intent intentM66154X3 = PhotoAlbumActivitiesAct.m66154X1(application, "activities", true, false, true);
                intentM66154X3.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intentM66154X3.putExtra("bundle_from_notification", true);
                intentM66154X3.putExtra("bundle_is_idle_push", false);
                return null;
            }
            if ("moment.match.post.feed".equals(pushMessage.intent)) {
                if (pushMessage.content.type.equals("user") && NullChecker.m82486a(pushMessage.content.parent) && pushMessage.content.parent.type.equals("moment")) {
                    Intent intentM168890g2 = orb0.m168890g(application, NavigationIntent.get("moment"));
                    CoreService coreServiceM61406H = FeedModule.m61406H();
                    PushMessageContent pushMessageContent = pushMessage.content;
                    coreServiceM61406H.mo31783jp("detail_square_follow", pushMessageContent.f39652id, pushMessageContent.parent.f39607id);
                    return intentM168890g2;
                }
            } else if ("state.match.post".equals(pushMessage.intent)) {
                if (pushMessage.content.type.equals("user") && NullChecker.m82486a(pushMessage.content.parent)) {
                    pushMessage.content.parent.type.equals("state");
                    return null;
                }
            } else if ("moment.match.post.like_feed".equals(pushMessage.intent) && pushMessage.content.type.equals("user") && NullChecker.m82486a(pushMessage.content.parent)) {
                pushMessage.content.parent.type.equals("moment");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m153062c() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (orb0.m168903t(it2.next().f16062a.get())) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public static void m153063d(PushMessage pushMessage, PushTrackData pushTrackData) {
        PendingIntent pendingIntentM153060a = m153060a(pushMessage, pushTrackData, false);
        if (NullChecker.m82486a(pendingIntentM153060a)) {
            orb0.m168894k(pushMessage, pendingIntentM153060a, null, null, null);
        }
    }
}
