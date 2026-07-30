package p009l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import l.mkd0;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class v1a {

    /* JADX INFO: renamed from: a */
    public g1a f21410a;

    /* JADX INFO: renamed from: b */
    public Act f21411b;

    /* JADX INFO: renamed from: c */
    public Links f21412c;

    public v1a(g1a g1aVar, Act act) {
        this.f21410a = g1aVar;
        this.f21411b = act;
    }

    /* JADX INFO: renamed from: b */
    public void m23228b() {
        Links links = this.f21412c;
        if (links == null || TextUtils.isEmpty(links.next)) {
            return;
        }
        c cVarDuringCreated = this.f21411b.duringCreated(CoreModule.N().xl(this.f21412c.next));
        t1a t1aVar = new t1a(this);
        g1a g1aVar = this.f21410a;
        Objects.requireNonNull(g1aVar);
        cVarDuringCreated.subscribe(mkd0.H(t1aVar, new u1a(g1aVar)));
    }

    /* JADX INFO: renamed from: c */
    public final void m23229c(Envelope envelope) {
        List<User> list = envelope.getModuleData(CommonData.class).users;
        HashMap map = new HashMap();
        List<CoreMomentInfo> list2 = envelope.getModuleData(CoreData.class).moments;
        if (!vwb.J(list2)) {
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
            w39Var.m23806j(user);
            w39Var.m23804h((List) map.get(((DbObject) user).id));
            arrayList2.add(w39Var);
        }
        g1a g1aVar = this.f21410a;
        Pagination pagination = envelope.pagination;
        g1aVar.mo6795c(pagination.total, arrayList2, pagination.links);
        this.f21412c = envelope.pagination.links;
    }

    /* JADX INFO: renamed from: d */
    public void m23230d() {
        c cVarDuringCreated = this.f21411b.duringCreated(CoreModule.N().Ke());
        t1a t1aVar = new t1a(this);
        g1a g1aVar = this.f21410a;
        Objects.requireNonNull(g1aVar);
        cVarDuringCreated.subscribe(mkd0.H(t1aVar, new u1a(g1aVar)));
    }
}
