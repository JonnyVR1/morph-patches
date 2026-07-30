package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BCoreLiveActivity;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class rm0 {

    /* JADX INFO: renamed from: a */
    public Links f160051a;

    /* JADX INFO: renamed from: b */
    public List<tm0> f160052b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ j760 m179946a(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).lives)) {
            for (Live live : ((CoreData) envelope.getModuleData(CoreData.class)).lives) {
                map.put(live.f38767id, live);
            }
        }
        for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
            map2.put(user.f56011id, user);
        }
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).liveActivities)) {
            for (BCoreLiveActivity bCoreLiveActivity : ((CoreData) envelope.getModuleData(CoreData.class)).liveActivities) {
                Live live2 = (Live) map.get(bCoreLiveActivity.reference.f38759id);
                User user2 = (User) map2.get(bCoreLiveActivity.owner.f38759id);
                if (user2 != null) {
                    arrayList.add(new tm0(user2, live2, bCoreLiveActivity));
                }
            }
        }
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public List<tm0> m179947b() {
        return this.f160052b;
    }

    /* JADX INFO: renamed from: c */
    public Links m179948c() {
        return this.f160051a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m179949d() {
        return !vwb.m200296J(this.f160052b);
    }

    /* JADX INFO: renamed from: e */
    public boolean m179950e() {
        Links links = this.f160051a;
        if (links == null) {
            return false;
        }
        return !TextUtils.isEmpty(links.next);
    }

    /* JADX INFO: renamed from: f */
    public C22306c<j760<Links, List<tm0>>> m179951f(String str) {
        return CoreModule.f17545c.f19625Z0.m163928c4(str).map(new w9j() { // from class: l.qm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rm0.m179946a((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public C22306c<j760<Links, List<tm0>>> m179952g(String str) {
        return m179951f(str);
    }

    /* JADX INFO: renamed from: h */
    public C22306c<j760<Links, List<tm0>>> m179953h() {
        return m179951f("");
    }

    /* JADX INFO: renamed from: i */
    public void m179954i(Links links) {
        this.f160051a = links;
    }

    /* JADX INFO: renamed from: j */
    public void m179955j(List<tm0> list) {
        this.f160052b.addAll(list);
    }

    /* JADX INFO: renamed from: k */
    public void m179956k(List<tm0> list) {
        this.f160052b = list;
    }
}
