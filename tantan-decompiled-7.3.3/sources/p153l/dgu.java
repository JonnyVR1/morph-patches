package p153l;

import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.p051p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class dgu {

    /* JADX INFO: renamed from: a */
    public String f88391a = "liveUserManager";

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, User> f88392b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, User> f88393c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    public int f88394d = 0;

    /* JADX INFO: renamed from: e */
    public int f88395e = 0;

    @MainThread
    /* JADX INFO: renamed from: a */
    public void m115752a(User user, String str) {
        str.getClass();
        if (str.equals("scene_out_live_room")) {
            this.f88392b.put(user.f56859id, user);
        } else if (str.equals("scene_inner_live_room")) {
            this.f88393c.put(user.f56859id, user);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m115753b() {
        this.f88395e++;
        this.f88394d += this.f88393c.size();
        fhw.m125605a(this.f88391a, " clean room user map total size: " + this.f88394d + ", clean count:" + this.f88395e);
        this.f88393c.clear();
    }

    /* JADX INFO: renamed from: c */
    public User m115754c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        User user = this.f88393c.get(str);
        return user != null ? user : this.f88392b.get(str);
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m115755d(List<User> list, String str) {
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            m115752a(it.next(), str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m115756e(User user) {
        User user2 = this.f88393c.get(user.f56859id);
        User user3 = this.f88392b.get(user.f56859id);
        if (user2 != null) {
            m115752a(user, "scene_inner_live_room");
        }
        if (user3 != null) {
            m115752a(user, "scene_out_live_room");
        }
    }
}
