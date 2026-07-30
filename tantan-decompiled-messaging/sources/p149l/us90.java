package p149l;

import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes10.dex */
public class us90 {

    /* JADX INFO: renamed from: a */
    public static volatile us90 f177949a;

    /* JADX INFO: renamed from: b */
    public static us90 m195178b() {
        if (f177949a == null) {
            synchronized (us90.class) {
                try {
                    if (f177949a == null) {
                        f177949a = new us90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f177949a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m195179a(User user, User user2) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public String m195180c(User user) {
        Profile profile;
        Long l2;
        if (user == null || user.isBanedOrInactivated() || (profile = user.profile) == null || (l2 = profile.receivedLikes) == null || l2.longValue() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m195181d(user.profile.receivedLikes.longValue()));
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
    public String m195181d(long j) {
        return j < 10000 ? String.valueOf(j) : String.format("%.1fw", Float.valueOf(Math.round((j / 10000.0f) * 10.0f) / 10.0f));
    }
}
