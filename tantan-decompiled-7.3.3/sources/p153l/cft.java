package p153l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.live.external.internal.vchat.IntentBridgeAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes9.dex */
public class cft {
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public static PendingIntent m109591a(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        Intent intentM109593c = m109593c(pushMessage, z);
        if (intentM109593c == null) {
            return null;
        }
        toh0.m192045e(intentM109593c, pushTrackData);
        return PendingIntent.getActivity(tbs.f172988a, (int) System.currentTimeMillis(), intentM109593c, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: b */
    public static PendingIntent m109592b(String str, PushTrackData pushTrackData) {
        Intent intentM162075e = nae0.m162075e(tbs.f172988a, Uri.parse(str));
        if (intentM162075e == null) {
            return null;
        }
        toh0.m192045e(intentM162075e, pushTrackData);
        return PendingIntent.getActivity(tbs.f172988a, (int) System.currentTimeMillis(), intentM162075e, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static Intent m109593c(PushMessage pushMessage, boolean z) {
        Intent intentMo175424a;
        Application application = tbs.f172988a;
        if (pushMessage == null || TextUtils.isEmpty(pushMessage.intent)) {
            return q5k0.m175372I().mo175424a(application, "1", "from_push", null);
        }
        String str = pushMessage.intent;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1525566612:
                if (str.equals("live.audience.suggest.push")) {
                    b = 0;
                }
                break;
            case -1329782967:
                if (str.equals(PushMessageIntent.live_square_push)) {
                    b = 1;
                }
                break;
            case -958891091:
                if (str.equals("live.chatNewMsg.push")) {
                    b = 2;
                }
                break;
            case -906558609:
                if (str.equals("live.voiceLiving.push")) {
                    b = 3;
                }
                break;
            case -825674494:
                if (str.equals("voice.enterroom.push-managerRecall")) {
                    b = 4;
                }
                break;
            case -812254115:
                if (str.equals("live.voiceFriendOncall.push")) {
                    b = 5;
                }
                break;
            case -505056740:
                if (str.equals("video.chat.notify.push")) {
                    b = 6;
                }
                break;
            case -321221135:
                if (str.equals("live.voiceFriendLiving.push")) {
                    b = 7;
                }
                break;
            case -11580099:
                if (str.equals(PushMessageIntent.live_living_push)) {
                    b = 8;
                }
                break;
            case -4977488:
                if (str.equals("live.voiceLikeOrFollowOncall.push")) {
                    b = 9;
                }
                break;
            case 486055492:
                if (str.equals("live.voiceLikeOrFollowLiving.push")) {
                    b = 10;
                }
                break;
            case 1033958577:
                if (str.equals(PushMessageIntent.live_anchor_push)) {
                    b = 11;
                }
                break;
            case 1567716677:
                if (str.equals("live.schema.push")) {
                    b = 12;
                }
                break;
            case 1964178093:
                if (str.equals("live.voiceLiving.start")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
        }
        switch (b) {
            case 0:
                return q5k0.m175372I().mo175430d(application, pushMessage.link);
            case 1:
                PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                intentMo175424a = q5k0.m175372I().mo175424a(application, pushMessageCustom.tabId, "from_push", pushMessageCustom.extTabId);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                intentMo175424a = q5k0.m175372I().mo175426b(application, pushMessage.intent, pushMessage);
                break;
            case 6:
                if (lwk0.m156066b().m156068c()) {
                    return IntentBridgeAct.m70343X1(application, "video.chat.notify.push");
                }
                Intent intentM70347a2 = LiveVChatAct.m70347a2(application);
                intentM70347a2.addFlags(536870912);
                return intentM70347a2;
            case 11:
            case 13:
                intentMo175424a = q5k0.m175372I().mo175430d(application, pushMessage.link);
                break;
            case 12:
                return q5k0.m175372I().mo175428c(application, r4u.m179821d(pushMessage.messageCustom.extra, null));
            default:
                intentMo175424a = q5k0.m175372I().mo175424a(application, "1", "from_push", null);
                break;
        }
        if (pushMessage.intent.contains("voice.enterroom.push")) {
            intentMo175424a = q5k0.m175372I().mo175426b(application, pushMessage.intent, pushMessage);
        }
        toh0.m192044d(intentMo175424a, true, false);
        return intentMo175424a;
    }

    /* JADX INFO: renamed from: d */
    public static void m109594d(PushMessage pushMessage, PushTrackData pushTrackData) {
        mbs.m157851f(pushMessage, m109591a(pushMessage, pushTrackData, false), null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m109595e(y20<Activity> y20Var) {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null) {
                    y20Var.call(activity);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m109596f() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null && tbs.f172993f.m143711m(activity)) {
                    return true;
                }
            }
        }
        return false;
    }
}
