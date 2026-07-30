package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BCoreLiveActivity;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class nm0 {

    /* JADX INFO: renamed from: a */
    public Links f142609a;

    /* JADX INFO: renamed from: b */
    public List<pm0> f142610b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ pf60 m163790a(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).lives)) {
            for (Live live : ((CoreData) envelope.getModuleData(CoreData.class)).lives) {
                map.put(live.f39615id, live);
            }
        }
        for (User user : ((CommonData) envelope.getModuleData(CommonData.class)).users) {
            map2.put(user.f56859id, user);
        }
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).liveActivities)) {
            for (BCoreLiveActivity bCoreLiveActivity : ((CoreData) envelope.getModuleData(CoreData.class)).liveActivities) {
                Live live2 = (Live) map.get(bCoreLiveActivity.reference.f39607id);
                User user2 = (User) map2.get(bCoreLiveActivity.owner.f39607id);
                if (user2 != null) {
                    arrayList.add(new pm0(user2, live2, bCoreLiveActivity));
                }
            }
        }
        return new pf60(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public List<pm0> m163791b() {
        return this.f142610b;
    }

    /* JADX INFO: renamed from: c */
    public Links m163792c() {
        return this.f142609a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m163793d() {
        return !jyb.m147479J(this.f142610b);
    }

    /* JADX INFO: renamed from: e */
    public boolean m163794e() {
        Links links = this.f142609a;
        if (links == null) {
            return false;
        }
        return !TextUtils.isEmpty(links.next);
    }

    /* JADX INFO: renamed from: f */
    public C22421c<pf60<Links, List<pm0>>> m163795f(String str) {
        return CoreModule.f18264c.f20367Z0.m210786c4(str).map(new qcj() { // from class: l.mm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return nm0.m163790a((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public C22421c<pf60<Links, List<pm0>>> m163796g(String str) {
        return m163795f(str);
    }

    /* JADX INFO: renamed from: h */
    public C22421c<pf60<Links, List<pm0>>> m163797h() {
        return m163795f("");
    }

    /* JADX INFO: renamed from: i */
    public void m163798i(Links links) {
        this.f142609a = links;
    }

    /* JADX INFO: renamed from: j */
    public void m163799j(List<pm0> list) {
        this.f142610b.addAll(list);
    }

    /* JADX INFO: renamed from: k */
    public void m163800k(List<pm0> list) {
        this.f142610b = list;
    }
}
