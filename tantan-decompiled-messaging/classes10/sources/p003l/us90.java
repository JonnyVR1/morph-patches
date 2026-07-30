package p003l;

import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class us90 {

    /* JADX INFO: renamed from: a */
    public static volatile us90 f7812a;

    /* JADX INFO: renamed from: b */
    public static us90 m9769b() {
        if (f7812a == null) {
            synchronized (us90.class) {
                try {
                    if (f7812a == null) {
                        f7812a = new us90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7812a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m9770a(User user, User user2) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public String m9771c(User user) {
        Profile profile;
        Long l2;
        if (user == null || user.isBanedOrInactivated() || (profile = user.profile) == null || (l2 = profile.receivedLikes) == null || l2.longValue() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m9772d(user.profile.receivedLikes.longValue()));
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
    public String m9772d(long j) {
        return j < 10000 ? String.valueOf(j) : String.format("%.1fw", Float.valueOf(Math.round((j / 10000.0f) * 10.0f) / 10.0f));
    }
}
