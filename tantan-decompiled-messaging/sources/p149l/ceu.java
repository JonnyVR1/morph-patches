package p149l;

import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.p046p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class ceu {

    /* JADX INFO: renamed from: a */
    public String f80496a = "liveUserManager";

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, User> f80497b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, User> f80498c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    public int f80499d = 0;

    /* JADX INFO: renamed from: e */
    public int f80500e = 0;

    @MainThread
    /* JADX INFO: renamed from: a */
    public void m106349a(User user, String str) {
        str.getClass();
        if (str.equals("scene_out_live_room")) {
            this.f80497b.put(user.f56011id, user);
        } else if (str.equals("scene_inner_live_room")) {
            this.f80498c.put(user.f56011id, user);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m106350b() {
        this.f80500e++;
        this.f80499d += this.f80498c.size();
        hfw.m130790a(this.f80496a, " clean room user map total size: " + this.f80499d + ", clean count:" + this.f80500e);
        this.f80498c.clear();
    }

    /* JADX INFO: renamed from: c */
    public User m106351c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        User user = this.f80498c.get(str);
        return user != null ? user : this.f80497b.get(str);
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m106352d(List<User> list, String str) {
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            m106349a(it.next(), str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m106353e(User user) {
        User user2 = this.f80498c.get(user.f56011id);
        User user3 = this.f80497b.get(user.f56011id);
        if (user2 != null) {
            m106349a(user, "scene_inner_live_room");
        }
        if (user3 != null) {
            m106349a(user, "scene_out_live_room");
        }
    }
}
