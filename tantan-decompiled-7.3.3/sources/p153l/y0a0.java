package p153l;

import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes12.dex */
public class y0a0 {

    /* JADX INFO: renamed from: a */
    public static volatile y0a0 f196954a;

    /* JADX INFO: renamed from: b */
    public static y0a0 m213839b() {
        if (f196954a == null) {
            synchronized (y0a0.class) {
                try {
                    if (f196954a == null) {
                        f196954a = new y0a0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f196954a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m213840a(User user, User user2) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public String m213841c(User user) {
        Profile profile;
        Long l2;
        if (user == null || user.isBanedOrInactivated() || (profile = user.profile) == null || (l2 = profile.receivedLikes) == null || l2.longValue() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m213842d(user.profile.receivedLikes.longValue()));
        sb.append("人喜欢了");
        if (user.isMe()) {
            sb.append("你");
        } else if (user.isFemale()) {
            sb.append("她");
        } else {
            sb.append("他");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public String m213842d(long j) {
        return j < 10000 ? String.valueOf(j) : String.format("%.1fw", Float.valueOf(Math.round((j / 10000.0f) * 10.0f) / 10.0f));
    }
}
