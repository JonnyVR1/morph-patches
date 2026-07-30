package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import java.util.HashMap;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class er40 {

    /* JADX INFO: renamed from: a */
    public static final b<String> f9948a = b.b();

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, Integer> f9949b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static c<String> m12674a() {
        return f9948a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public static HashMap<String, Integer> m12675b() {
        return f9949b;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12676c(o7t o7tVar) {
        return "accompany".equals(o7tVar.m19283g());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12677d(String str, String str2) {
        return str.equals("fansClub") && str2.equals("fanbase-notice-join");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12678e(LiveMessage liveMessage) {
        return liveMessage.isNotifyMessage() && liveMessage.notificationData.m19283g().equals("fanbase-notice-join");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12679f(LiveMessage liveMessage) {
        return liveMessage.isNotifyMessage() && liveMessage.notificationData.m19283g().equals("follow");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12680g(String str, String str2) {
        return (str.equals("follow") || str.equals("voiceFollow")) && str2.equals("follow");
    }

    /* JADX INFO: renamed from: h */
    public static void m12681h(String str) {
        f9948a.onNext(str);
    }

    /* JADX INFO: renamed from: i */
    public static o7t m12682i(LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
        return new o7t(userWithBgColorSocketNotification);
    }
}
