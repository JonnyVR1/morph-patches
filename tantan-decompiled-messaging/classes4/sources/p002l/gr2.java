package p002l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p1.mobile.putong.api.push.PushTrackData;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantan.core.base.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import l.dr40;
import l.mgh0;
import l.nr40;
import l.rqc0;
import l.rw0;
import l.w2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gr2 {

    /* JADX INFO: renamed from: a */
    public ArrayList<InterfaceC0597a> f11583a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public nr40 f11584b;

    /* JADX INFO: renamed from: l.gr2$a */
    public interface InterfaceC0597a {
        /* JADX INFO: renamed from: a */
        Intent mo14018a(PushMessage pushMessage, boolean z, Context context);
    }

    public gr2() {
        this.f11584b = null;
        this.f11584b = nr40.e(CoreModule.b);
        dr40.d();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m14003g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "suggested.list".equals(str) || "conversation.single".equals(str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14004h(String str) {
        return TextUtils.isEmpty(str) || str.startsWith("tantanapp://home") || str.startsWith("tantanapp://liveSquare") || str.startsWith("tantanapp://live") || str.startsWith("tantanapp://conversations") || str.startsWith("tantanapp://moment") || str.startsWith("tantanapp://profile");
    }

    /* JADX INFO: renamed from: a */
    public void m14005a(InterfaceC0597a interfaceC0597a) {
        this.f11583a.add(interfaceC0597a);
    }

    /* JADX INFO: renamed from: b */
    public void m14006b(int i) {
        mgh0.g(i);
    }

    /* JADX INFO: renamed from: c */
    public void m14007c() {
        mgh0.h();
    }

    /* JADX INFO: renamed from: d */
    public final Intent m14008d(PushMessage pushMessage, boolean z) {
        if (!"devicepush.list".equals(pushMessage.intent)) {
            return null;
        }
        Intent intent = new Intent(CoreModule.b, (Class<?>) SplashProxyAct.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: e */
    public PendingIntent m14009e(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        Intent intentM14010f = m14010f(pushMessage, z);
        if (intentM14010f == null) {
            return null;
        }
        mgh0.e(intentM14010f, pushTrackData);
        return PendingIntent.getActivity(CoreModule.b, (int) System.currentTimeMillis(), intentM14010f, 67108864);
    }

    /* JADX INFO: renamed from: f */
    public final Intent m14010f(PushMessage pushMessage, boolean z) {
        String str;
        Application application = CoreModule.b;
        if (!CoreModule.H().signedIn_()) {
            if (CoreModule.H().a().c() && "devicepush.list".equals(pushMessage.intent)) {
                return m14008d(pushMessage, z);
            }
            return null;
        }
        Iterator<InterfaceC0597a> it = this.f11583a.iterator();
        while (it.hasNext()) {
            Intent intentMo14018a = it.next().mo14018a(pushMessage, z, application);
            if (NullChecker.a(intentMo14018a) && m14003g(pushMessage.intent) && !rw0.c() && (str = pushMessage.link) != null && !m14004h(str)) {
                Intent mainActIntent = CoreModule.o.d().getMainActIntent(application);
                mainActIntent.putExtra("extra_from_push_transfer", intentMo14018a);
                return mainActIntent;
            }
            if (NullChecker.a(intentMo14018a)) {
                return intentMo14018a;
            }
        }
        return CoreModule.o.d().getMainActIntent(application);
    }

    /* JADX INFO: renamed from: i */
    public void m14011i(PushMessage pushMessage) {
        m14012j(pushMessage, null);
    }

    /* JADX INFO: renamed from: j */
    public void m14012j(PushMessage pushMessage, PushTrackData pushTrackData) {
        m14013k(pushMessage, pushTrackData, false);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public void m14013k(PushMessage pushMessage, PushTrackData pushTrackData, boolean z) {
        NotificationCompat.Action actionBuild;
        boolean z2 = false;
        PendingIntent pendingIntentM14009e = m14009e(pushMessage, pushTrackData, false);
        if (TextUtils.equals("call.voiceinviting.single", pushMessage.intent)) {
            pushMessage.value = pushMessage.ticker;
        }
        if (TextUtils.equals("conversation.group", pushMessage.intent) && TextUtils.isEmpty(pushMessage.primaryPicture)) {
            pushMessage.primaryPicture = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ?format=128x128";
        }
        if (CoreModule.o.d().z(pushMessage.content.id)) {
            pushMessage.value = CoreModule.b.getResources().getString(R.string.b);
            z = false;
        }
        if (CoreModule.o.d().Vq(pushMessage.content.id)) {
            pushMessage.value = CoreModule.b.getResources().getString(R.string.r);
        } else {
            z2 = z;
        }
        NotificationCompat.Action actionBuild2 = null;
        if (("conversation.single".equals(pushMessage.intent) || "conversation.group".equals(pushMessage.intent) || "male.message.repeat".equals(pushMessage.intent) || "moment.single.comment".equals(pushMessage.intent)) && z2) {
            Intent intentK = mgh0.k(SysnotifListener.ACTION_READ, SysnotifListener.class);
            intentK.putExtra(SysnotifListener.KEY_USER_ID, pushMessage.content.id);
            intentK.putExtra(SysnotifListener.KEY_NOTIFICATION_ID, pushMessage.stackId);
            intentK.putExtra(SysnotifListener.KEY_GROUP_TYPE, TextUtils.equals("conversation.group", pushMessage.intent));
            actionBuild = new NotificationCompat.Action.Builder(w2c0.u0, CoreModule.b.getResources().getString(R.string.q), PendingIntent.getBroadcast(CoreModule.b, (int) System.currentTimeMillis(), intentK, 33554432)).build();
            if (!"OPPO".equals(Build.BRAND)) {
                String string = CoreModule.b.getResources().getString(R.string.a);
                rqc0 rqc0VarB = new rqc0.d(SysnotifListener.ACTION_REPLY).g(string).b();
                Intent intentK2 = mgh0.k(SysnotifListener.ACTION_REPLY, SysnotifListener.class);
                intentK2.putExtra(SysnotifListener.KEY_USER_ID, pushMessage.content.id);
                intentK2.putExtra(SysnotifListener.KEY_NOTIFICATION_ID, pushMessage.stackId);
                intentK2.putExtra(SysnotifListener.KEY_GROUP_TYPE, TextUtils.equals("conversation.group", pushMessage.intent));
                actionBuild2 = new NotificationCompat.Action.Builder(android.R.drawable.ic_menu_send, string, PendingIntent.getBroadcast(CoreModule.b, (int) System.currentTimeMillis(), intentK2, 33554432)).addRemoteInput(rqc0VarB).build();
            }
        } else {
            actionBuild = null;
        }
        Intent intentK3 = mgh0.k(SysnotifListener.ACTION_DISMISS, SysnotifListener.class);
        intentK3.putExtra(SysnotifListener.KEY_NOTIFICATION_ID, pushMessage.stackId);
        intentK3.putExtra(SysnotifListener.KEY_GROUP_TYPE, TextUtils.equals("conversation.group", pushMessage.intent));
        mgh0.f(pushMessage, pendingIntentM14009e, intentK3, actionBuild2, actionBuild);
    }

    /* JADX INFO: renamed from: l */
    public void m14014l(int i) {
        if (CoreModule.H().signedIn_()) {
            CoreModule.n.m21699M(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m14015m(int i, boolean z) {
        if (CoreModule.H().signedIn_()) {
            CoreModule.n.m21700N(i, z);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m14016n(int i) {
        return mgh0.p(i);
    }

    /* JADX INFO: renamed from: o */
    public Collection<Integer> m14017o() {
        return mgh0.q();
    }
}
