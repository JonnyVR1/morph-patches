package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class v1a {

    /* JADX INFO: renamed from: a */
    public g1a f179211a;

    /* JADX INFO: renamed from: b */
    public Act f179212b;

    /* JADX INFO: renamed from: c */
    public Links f179213c;

    public v1a(g1a g1aVar, Act act) {
        this.f179211a = g1aVar;
        this.f179212b = act;
    }

    /* JADX INFO: renamed from: b */
    public void m196544b() {
        Links links = this.f179213c;
        if (links == null || TextUtils.isEmpty(links.next)) {
            return;
        }
        C22306c c22306cDuringCreated = this.f179212b.duringCreated(CoreModule.m29934N().mo60402xl(this.f179213c.next));
        t1a t1aVar = new t1a(this);
        g1a g1aVar = this.f179211a;
        Objects.requireNonNull(g1aVar);
        c22306cDuringCreated.subscribe(mkd0.m154956H(t1aVar, new u1a(g1aVar)));
    }

    /* JADX INFO: renamed from: c */
    public final void m196545c(Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        HashMap map = new HashMap();
        List<CoreMomentInfo> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).moments;
        if (!vwb.m200296J(list2)) {
            for (CoreMomentInfo coreMomentInfo : list2) {
                String str = coreMomentInfo.owner;
                List arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(coreMomentInfo);
                map.put(str, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (User user : list) {
            w39 w39Var = new w39();
            w39Var.m201270j(user);
            w39Var.m201268h((List) map.get(user.f56011id));
            arrayList2.add(w39Var);
        }
        g1a g1aVar = this.f179211a;
        Pagination pagination = envelope.pagination;
        g1aVar.mo42632c(pagination.total, arrayList2, pagination.links);
        this.f179213c = envelope.pagination.links;
    }

    /* JADX INFO: renamed from: d */
    public void m196546d() {
        C22306c c22306cDuringCreated = this.f179212b.duringCreated(CoreModule.m29934N().mo60287Ke());
        t1a t1aVar = new t1a(this);
        g1a g1aVar = this.f179211a;
        Objects.requireNonNull(g1aVar);
        c22306cDuringCreated.subscribe(mkd0.m154956H(t1aVar, new u1a(g1aVar)));
    }
}
