package p153l;

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
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class wr2 {

    /* JADX INFO: renamed from: a */
    public ArrayList<InterfaceC21168a> f190462a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public c050 f190463b;

    /* JADX INFO: renamed from: l.wr2$a */
    public interface InterfaceC21168a {
        /* JADX INFO: renamed from: a */
        Intent mo96415a(PushMessage pushMessage, boolean z, Context context);
    }

    public wr2() {
        this.f190463b = null;
        this.f190463b = c050.m107319e(CoreModule.f18263b);
        sz40.m188624d();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m207527g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return PushMessageIntent.suggested_list.equals(str) || PushMessageIntent.conversation_single.equals(str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m207528h(String str) {
        return TextUtils.isEmpty(str) || str.startsWith("tantanapp://home") || str.startsWith("tantanapp://liveSquare") || str.startsWith("tantanapp://live") || str.startsWith("tantanapp://conversations") || str.startsWith("tantanapp://moment") || str.startsWith("tantanapp://profile");
    }

    /* JADX INFO: renamed from: a */
    public void m207529a(InterfaceC21168a interfaceC21168a) {
        this.f190462a.add(interfaceC21168a);
    }

    /* JADX INFO: renamed from: b */
    public void m207530b(int i) {
        toh0.m192047g(i);
    }

    /* JADX INFO: renamed from: c */
    public void m207531c() {
        toh0.m192048h();
    }

    /* JADX INFO: renamed from: d */
    public final Intent m207532d(PushMessage pushMessage, boolean z) {
        if (!"devicepush.list".equals(pushMessage.intent)) {
            return null;
        }
        Intent intent = new Intent(CoreModule.f18263b, (Class<?>) SplashProxyAct.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: e */
    public PendingIntent m207533e(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        Intent intentM207534f = m207534f(pushMessage, z);
        if (intentM207534f == null) {
            return null;
        }
        toh0.m192045e(intentM207534f, pushTrackData);
        return PendingIntent.getActivity(CoreModule.f18263b, (int) System.currentTimeMillis(), intentM207534f, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: f */
    public final Intent m207534f(PushMessage pushMessage, boolean z) {
        String str;
        Application application = CoreModule.f18263b;
        if (!CoreModule.m30929H().signedIn_()) {
            if (CoreModule.m30929H().mo29162a().mo105649c() && "devicepush.list".equals(pushMessage.intent)) {
                return m207532d(pushMessage, z);
            }
            return null;
        }
        Iterator<InterfaceC21168a> it = this.f190462a.iterator();
        while (it.hasNext()) {
            Intent intentMo96415a = it.next().mo96415a(pushMessage, z, application);
            if (NullChecker.m82486a(intentMo96415a) && m207527g(pushMessage.intent) && !yw0.m217560c() && (str = pushMessage.link) != null && !m207528h(str)) {
                Intent mainActIntent = CoreModule.f18276o.m132214d().getMainActIntent(application);
                mainActIntent.putExtra("extra_from_push_transfer", intentMo96415a);
                return mainActIntent;
            }
            if (NullChecker.m82486a(intentMo96415a)) {
                return intentMo96415a;
            }
        }
        return CoreModule.f18276o.m132214d().getMainActIntent(application);
    }

    /* JADX INFO: renamed from: i */
    public void m207535i(PushMessage pushMessage) {
        m207536j(pushMessage, null);
    }

    /* JADX INFO: renamed from: j */
    public void m207536j(PushMessage pushMessage, PushTrackData pushTrackData) {
        m207537k(pushMessage, pushTrackData, false);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public void m207537k(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        NotificationCompat.Action actionBuild;
        boolean z2 = false;
        PendingIntent pendingIntentM207533e = m207533e(pushMessage, pushTrackData, false);
        if (TextUtils.equals(PushMessageIntent.call_voiceinviting_single, pushMessage.intent)) {
            pushMessage.value = pushMessage.ticker;
        }
        if (TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent) && TextUtils.isEmpty(pushMessage.primaryPicture)) {
            pushMessage.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
        }
        if (CoreModule.f18276o.m132214d().mo34961z(pushMessage.content.f39652id)) {
            pushMessage.value = CoreModule.f18263b.getResources().getString(R$string.f56613b);
            z = false;
        }
        if (CoreModule.f18276o.m132214d().mo34774Vq(pushMessage.content.f39652id)) {
            pushMessage.value = CoreModule.f18263b.getResources().getString(R$string.f56629r);
        } else {
            z2 = z;
        }
        NotificationCompat.Action actionBuild2 = null;
        if ((PushMessageIntent.conversation_single.equals(pushMessage.intent) || PushMessageIntent.conversation_group.equals(pushMessage.intent) || "male.message.repeat".equals(pushMessage.intent) || PushMessageIntent.moment_single_comment.equals(pushMessage.intent)) && z2) {
            Intent intentM192051k = toh0.m192051k("read", SysnotifListener.class);
            intentM192051k.putExtra("user_id", pushMessage.content.f39652id);
            intentM192051k.putExtra(SysnotifListener.KEY_NOTIFICATION_ID, pushMessage.stackId);
            intentM192051k.putExtra(SysnotifListener.KEY_GROUP_TYPE, TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent));
            actionBuild = new NotificationCompat.Action.Builder(cbc0.f80799u0, CoreModule.f18263b.getResources().getString(R$string.f56628q), PendingIntent.getBroadcast(CoreModule.f18263b, (int) System.currentTimeMillis(), intentM192051k, 33554432)).build();
            if (!RomUtil.ROM_OPPO.equals(Build.BRAND)) {
                String string = CoreModule.f18263b.getResources().getString(R$string.f56612a);
                wyc0 wyc0VarM208603b = new wyc0.C21210d(SysnotifListener.ACTION_REPLY).m208608g(string).m208603b();
                Intent intentM192051k2 = toh0.m192051k(SysnotifListener.ACTION_REPLY, SysnotifListener.class);
                intentM192051k2.putExtra("user_id", pushMessage.content.f39652id);
                intentM192051k2.putExtra(SysnotifListener.KEY_NOTIFICATION_ID, pushMessage.stackId);
                intentM192051k2.putExtra(SysnotifListener.KEY_GROUP_TYPE, TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent));
                actionBuild2 = new NotificationCompat.Action.Builder(R.drawable.ic_menu_send, string, PendingIntent.getBroadcast(CoreModule.f18263b, (int) System.currentTimeMillis(), intentM192051k2, 33554432)).addRemoteInput(wyc0VarM208603b).build();
            }
        } else {
            actionBuild = null;
        }
        Intent intentM192051k3 = toh0.m192051k(SysnotifListener.ACTION_DISMISS, SysnotifListener.class);
        intentM192051k3.putExtra(SysnotifListener.KEY_NOTIFICATION_ID, pushMessage.stackId);
        intentM192051k3.putExtra(SysnotifListener.KEY_GROUP_TYPE, TextUtils.equals(PushMessageIntent.conversation_group, pushMessage.intent));
        toh0.m192046f(pushMessage, pendingIntentM207533e, intentM192051k3, actionBuild2, actionBuild);
    }

    /* JADX INFO: renamed from: l */
    public void m207538l(int i) {
        if (CoreModule.m30929H().signedIn_()) {
            CoreModule.f18275n.m193939M(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m207539m(int i, boolean z) {
        if (CoreModule.m30929H().signedIn_()) {
            CoreModule.f18275n.m193940N(i, z);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m207540n(int i) {
        return toh0.m192056p(i);
    }

    /* JADX INFO: renamed from: o */
    public Collection<Integer> m207541o() {
        return toh0.m192057q();
    }
}
