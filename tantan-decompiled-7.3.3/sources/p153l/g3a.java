package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class g3a {

    /* JADX INFO: renamed from: a */
    public r2a f101969a;

    /* JADX INFO: renamed from: b */
    public Act f101970b;

    /* JADX INFO: renamed from: c */
    public Links f101971c;

    public g3a(r2a r2aVar, Act act) {
        this.f101969a = r2aVar;
        this.f101970b = act;
    }

    /* JADX INFO: renamed from: b */
    public void m128721b() {
        Links links = this.f101971c;
        if (links == null || TextUtils.isEmpty(links.next)) {
            return;
        }
        C22421c c22421cDuringCreated = this.f101970b.duringCreated(CoreModule.m30932N().mo61586xl(this.f101971c.next));
        e3a e3aVar = new e3a(this);
        r2a r2aVar = this.f101969a;
        Objects.requireNonNull(r2aVar);
        c22421cDuringCreated.subscribe(psd0.m173597H(e3aVar, new f3a(r2aVar)));
    }

    /* JADX INFO: renamed from: c */
    public final void m128722c(Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        HashMap map = new HashMap();
        List<CoreMomentInfo> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).moments;
        if (!jyb.m147479J(list2)) {
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
            f59 f59Var = new f59();
            f59Var.m124116j(user);
            f59Var.m124114h((List) map.get(user.f56859id));
            arrayList2.add(f59Var);
        }
        r2a r2aVar = this.f101969a;
        Pagination pagination = envelope.pagination;
        r2aVar.mo43643c(pagination.total, arrayList2, pagination.links);
        this.f101971c = envelope.pagination.links;
    }

    /* JADX INFO: renamed from: d */
    public void m128723d() {
        C22421c c22421cDuringCreated = this.f101970b.duringCreated(CoreModule.m30932N().mo61471Ke());
        e3a e3aVar = new e3a(this);
        r2a r2aVar = this.f101969a;
        Objects.requireNonNull(r2aVar);
        c22421cDuringCreated.subscribe(psd0.m173597H(e3aVar, new f3a(r2aVar)));
    }
}
