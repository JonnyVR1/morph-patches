package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveCallInvite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class wxp {

    /* JADX INFO: renamed from: a */
    public List<BLiveCallInvite> f188504a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, User> f188505b = new HashMap<>();

    public wxp(List<BLiveCallInvite> list, List<User> list2) {
        this.f188504a = list;
        if (vwb.m200296J(list2)) {
            return;
        }
        vwb.m200354z(list2, new e30() { // from class: l.vxp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183469a.m206023d((User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public User m206021b(String str) {
        return this.f188505b.get(str);
    }

    /* JADX INFO: renamed from: c */
    public List<BLiveCallInvite> m206022c() {
        if (this.f188504a == null) {
            this.f188504a = new ArrayList();
        }
        return this.f188504a;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m206023d(User user) {
        this.f188505b.put(user.f56011id, user);
    }
}
