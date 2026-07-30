package p149l;

import android.R;
import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.cosmos.photon.push.thirdparty.RomUtil;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class gr2 {

    /* JADX INFO: renamed from: a */
    public ArrayList<InterfaceC17143a> f104007a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public nr40 f104008b;

    /* JADX INFO: renamed from: l.gr2$a */
    public interface InterfaceC17143a {
        /* JADX INFO: renamed from: a */
        Intent mo104991a(PushMessage pushMessage, boolean z, Context context);
    }

    public gr2() {
        this.f104008b = null;
        this.f104008b = nr40.m160709e(CoreModule.f17544b);
        dr40.m113273d();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m127646g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return PushMessageIntent.suggested_list.equals(str) || PushMessageIntent.conversation_single.equals(str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m127647h(String str) {
        return TextUtils.isEmpty(str) || str.startsWith("tantanapp://home") || str.startsWith("tantanapp://liveSquare") || str.startsWith("tantanapp://live") || str.startsWith("tantanapp://conversations") || str.startsWith("tantanapp://moment") || str.startsWith("tantanapp://profile");
    }

    /* JADX INFO: renamed from: a */
    public void m127648a(InterfaceC17143a interfaceC17143a) {
        this.f104007a.add(interfaceC17143a);
    }

    /* JADX INFO: renamed from: b */
    public void m127649b(int i) {
        mgh0.m154551g(i);
    }

    /* JADX INFO: renamed from: c */
    public void m127650c() {
        mgh0.m154552h();
    }

    /* JADX INFO: renamed from: d */
    public final Intent m127651d(PushMessage pushMessage, boolean z) {
        if (!"devicepush.list".equals(pushMessage.intent)) {
            return null;
        }
        Intent intent = new Intent(CoreModule.f17544b, (Class<?>) SplashProxyAct.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: e */
    public PendingIntent m127652e(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        Intent intentM127653f = m127653f(pushMessage, z);
        if (intentM127653f == null) {
            return null;
        }
        mgh0.m154549e(intentM127653f, pushTrackData);
        return PendingIntent.getActivity(CoreModule.f17544b, (int) System.currentTimeMillis(), intentM127653f, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: f */
    public final Intent m127653f(PushMessage pushMessage, boolean z) {
        String str;
        Application application = CoreModule.f17544b;
        if (!CoreModule.m29931H().signedIn_()) {
            if (CoreModule.m29931H().mo28163a().mo132033c() && "devicepush.list".equals(pushMessage.intent)) {
                return m127651d(pushMessage, z);
            }
            return null;
        }
        Iterator<InterfaceC17143a> it = this.f104007a.iterator();
        while (it.hasNext()) {
            Intent intentMo104991a = it.next().mo104991a(pushMessage, z, application);
            if (NullChecker.m81303a(intentMo104991a) && m127646g(pushMessage.intent) && !rw0.m181369c() && (str = pushMessage.link) != null && !m127647h(str)) {
                Intent mainActIntent = CoreModule.f17557o.m195057d().getMainActIntent(application);
                mainActIntent.putExtra("extra_from_push_transfer", intentMo104991a);
                return mainActIntent;
            }
            if (NullChecker.m81303a(intentMo104991a)) {
                return intentMo104991a;
            }
        }
        return CoreModule.f17557o.m195057d().getMainActIntent(application);
    }

    /* JADX INFO: renamed from: i */
    public void m127654i(PushMessage pushMessage) {
        m127655j(pushMessage, null);
    }

    /* JADX INFO: renamed from: j */
    public void m127655j(PushMessage pushMessage, PushTrackData pushTrackData) {
        m127656k(pushMessage, pushTrackData, false);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public void m127656k(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        NotificationCompat.Action actionBuild;
        boolean z2 = false;
        PendingIntent pendingIntentM127652e = m127652e(pushMessage, pushTrackData, false);
        if (TextUtils.equals(PushMessageIntent.call_voiceinviting_single, pushMessage.intent)) {
            pushMessage.value = pushMessage.ticker;
        }
        if (TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent) && TextUtils.isEmpty(pushMessage.primaryPicture)) {
            pushMessage.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
        }
        if (CoreModule.f17557o.m195057d().mo33958z(pushMessage.content.f38804id)) {
            pushMessage.value = CoreModule.f17544b.getResources().getString(R$string.f55765b);
            z = false;
        }
        if (CoreModule.f17557o.m195057d().mo33771Vq(pushMessage.content.f38804id)) {
            pushMessage.value = CoreModule.f17544b.getResources().getString(R$string.f55781r);
        } else {
            z2 = z;
        }
        NotificationCompat.Action actionBuild2 = null;
        if ((PushMessageIntent.conversation_single.equals(pushMessage.intent) || PushMessageIntent.conversation_group.equals(pushMessage.intent) || "male.message.repeat".equals(pushMessage.intent) || PushMessageIntent.moment_single_comment.equals(pushMessage.intent)) && z2) {
            Intent intentM154555k = mgh0.m154555k("read", SysnotifListener.class);
            intentM154555k.putExtra("user_id", pushMessage.content.f38804id);
            intentM154555k.putExtra(SysnotifListener.KEY_NOTIFICATION_ID, pushMessage.stackId);
            intentM154555k.putExtra(SysnotifListener.KEY_GROUP_TYPE, TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent));
            actionBuild = new NotificationCompat.Action.Builder(w2c0.f184203u0, CoreModule.f17544b.getResources().getString(R$string.f55780q), PendingIntent.getBroadcast(CoreModule.f17544b, (int) System.currentTimeMillis(), intentM154555k, 33554432)).build();
            if (!RomUtil.ROM_OPPO.equals(Build.BRAND)) {
                String string = CoreModule.f17544b.getResources().getString(R$string.f55764a);
                rqc0 rqc0VarM180431b = new rqc0.C19756d(SysnotifListener.ACTION_REPLY).m180436g(string).m180431b();
                Intent intentM154555k2 = mgh0.m154555k(SysnotifListener.ACTION_REPLY, SysnotifListener.class);
                intentM154555k2.putExtra("user_id", pushMessage.content.f38804id);
                intentM154555k2.putExtra(SysnotifListener.KEY_NOTIFICATION_ID, pushMessage.stackId);
                intentM154555k2.putExtra(SysnotifListener.KEY_GROUP_TYPE, TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent));
                actionBuild2 = new NotificationCompat.Action.Builder(R.drawable.ic_menu_send, string, PendingIntent.getBroadcast(CoreModule.f17544b, (int) System.currentTimeMillis(), intentM154555k2, 33554432)).addRemoteInput(rqc0VarM180431b).build();
            }
        } else {
            actionBuild = null;
        }
        Intent intentM154555k3 = mgh0.m154555k(SysnotifListener.ACTION_DISMISS, SysnotifListener.class);
        intentM154555k3.putExtra(SysnotifListener.KEY_NOTIFICATION_ID, pushMessage.stackId);
        intentM154555k3.putExtra(SysnotifListener.KEY_GROUP_TYPE, TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent));
        mgh0.m154550f(pushMessage, pendingIntentM127652e, intentM154555k3, actionBuild2, actionBuild);
    }

    /* JADX INFO: renamed from: l */
    public void m127657l(int i) {
        if (CoreModule.m29931H().signedIn_()) {
            CoreModule.f17556n.m177370M(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m127658m(int i, boolean z) {
        if (CoreModule.m29931H().signedIn_()) {
            CoreModule.f17556n.m177371N(i, z);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m127659n(int i) {
        return mgh0.m154560p(i);
    }

    /* JADX INFO: renamed from: o */
    public Collection<Integer> m127660o() {
        return mgh0.m154561q();
    }
}
