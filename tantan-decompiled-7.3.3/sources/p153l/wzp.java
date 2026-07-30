package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveCallInvite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class wzp {

    /* JADX INFO: renamed from: a */
    public List<BLiveCallInvite> f191815a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, User> f191816b = new HashMap<>();

    public wzp(List<BLiveCallInvite> list, List<User> list2) {
        this.f191815a = list;
        if (jyb.m147479J(list2)) {
            return;
        }
        jyb.m147537z(list2, new y20() { // from class: l.vzp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186505a.m208740d((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public User m208738b(String str) {
        return this.f191816b.get(str);
    }

    /* JADX INFO: renamed from: c */
    public List<BLiveCallInvite> m208739c() {
        if (this.f191815a == null) {
            this.f191815a = new ArrayList();
        }
        return this.f191815a;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m208740d(User user) {
        this.f191816b.put(user.f56859id, user);
    }
}
