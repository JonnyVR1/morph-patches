package p149l;

import com.p046p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.HashMap;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class er40 {

    /* JADX INFO: renamed from: a */
    public static final C22393b<String> f92883a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, Integer> f92884b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static C22306c<String> m117813a() {
        return f92883a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public static HashMap<String, Integer> m117814b() {
        return f92884b;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m117815c(o7t o7tVar) {
        return "accompany".equals(o7tVar.m163055g());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m117816d(String str, String str2) {
        return str.equals("fansClub") && str2.equals("fanbase-notice-join");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m117817e(LiveMessage liveMessage) {
        return liveMessage.isNotifyMessage() && liveMessage.notificationData.m163055g().equals("fanbase-notice-join");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m117818f(LiveMessage liveMessage) {
        return liveMessage.isNotifyMessage() && liveMessage.notificationData.m163055g().equals("follow");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m117819g(String str, String str2) {
        return (str.equals("follow") || str.equals("voiceFollow")) && str2.equals("follow");
    }

    /* JADX INFO: renamed from: h */
    public static void m117820h(String str) {
        f92883a.onNext(str);
    }

    /* JADX INFO: renamed from: i */
    public static o7t m117821i(LongLinkAdminMessage.UserWithBgColorSocketNotification userWithBgColorSocketNotification) {
        return new o7t(userWithBgColorSocketNotification);
    }
}
