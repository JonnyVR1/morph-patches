package p153l;

import com.p051p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.HashMap;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class tz40 {

    /* JADX INFO: renamed from: a */
    public static final C22508b<String> f176740a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, Integer> f176741b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static C22421c<String> m193642a() {
        return f176740a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public static HashMap<String, Integer> m193643b() {
        return f176741b;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m193644c(p9t p9tVar) {
        return "accompany".equals(p9tVar.m171384g());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m193645d(String str, String str2) {
        return str.equals("fansClub") && str2.equals("fanbase-notice-join");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m193646e(LiveMessage liveMessage) {
        return liveMessage.isNotifyMessage() && liveMessage.notificationData.m171384g().equals("fanbase-notice-join");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m193647f(LiveMessage liveMessage) {
        return liveMessage.isNotifyMessage() && liveMessage.notificationData.m171384g().equals("follow");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m193648g(String str, String str2) {
        return (str.equals("follow") || str.equals("voiceFollow")) && str2.equals("follow");
    }

    /* JADX INFO: renamed from: h */
    public static void m193649h(String str) {
        f176740a.onNext(str);
    }

    /* JADX INFO: renamed from: i */
    public static p9t m193650i(LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
        return new p9t(userWithBgColorSocketNotification);
    }
}
