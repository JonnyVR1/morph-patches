package p149l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.live.external.internal.vchat.IntentBridgeAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes13.dex */
public class bdt {
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public static PendingIntent m101232a(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        Intent intentM101234c = m101234c(pushMessage, z);
        if (intentM101234c == null) {
            return null;
        }
        mgh0.m154549e(intentM101234c, pushTrackData);
        return PendingIntent.getActivity(s9s.f163227a, (int) System.currentTimeMillis(), intentM101234c, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: b */
    public static PendingIntent m101233b(String str, PushTrackData pushTrackData) {
        Intent intentM139438e = j2e0.m139438e(s9s.f163227a, Uri.parse(str));
        if (intentM139438e == null) {
            return null;
        }
        mgh0.m154549e(intentM139438e, pushTrackData);
        return PendingIntent.getActivity(s9s.f163227a, (int) System.currentTimeMillis(), intentM139438e, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static Intent m101234c(PushMessage pushMessage, boolean z) {
        Intent intentMo118174a;
        Application application = s9s.f163227a;
        if (pushMessage == null || TextUtils.isEmpty(pushMessage.intent)) {
            return mwj0.m156660I().mo118174a(application, "1", "from_push", null);
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
                return mwj0.m156660I().mo118177d(application, pushMessage.link);
            case 1:
                PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                intentMo118174a = mwj0.m156660I().mo118174a(application, pushMessageCustom.tabId, "from_push", pushMessageCustom.extTabId);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                intentMo118174a = mwj0.m156660I().mo118175b(application, pushMessage.intent, pushMessage);
                break;
            case 6:
                if (fnk0.m122316b().m122318c()) {
                    return IntentBridgeAct.m69160V1(application, "video.chat.notify.push");
                }
                Intent intentM69164Z1 = LiveVChatAct.m69164Z1(application);
                intentM69164Z1.addFlags(536870912);
                return intentM69164Z1;
            case 11:
            case 13:
                intentMo118174a = mwj0.m156660I().mo118177d(application, pushMessage.link);
                break;
            case 12:
                return mwj0.m156660I().mo118176c(application, q2u.m172512d(pushMessage.messageCustom.extra, null));
            default:
                intentMo118174a = mwj0.m156660I().mo118174a(application, "1", "from_push", null);
                break;
        }
        if (pushMessage.intent.contains("voice.enterroom.push")) {
            intentMo118174a = mwj0.m156660I().mo118175b(application, pushMessage.intent, pushMessage);
        }
        mgh0.m154548d(intentMo118174a, true, false);
        return intentMo118174a;
    }

    /* JADX INFO: renamed from: d */
    public static void m101235d(PushMessage pushMessage, PushTrackData pushTrackData) {
        l9s.m149074f(pushMessage, m101232a(pushMessage, pushTrackData, false), null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m101236e(e30<Activity> e30Var) {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity != null) {
                    e30Var.call(activity);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m101237f() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity != null && s9s.f163232f.m134380m(activity)) {
                    return true;
                }
            }
        }
        return false;
    }
}
