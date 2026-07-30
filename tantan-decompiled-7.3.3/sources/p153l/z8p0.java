package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class z8p0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m219017a(UserCardBean userCardBean, uwl uwlVar) {
        try {
            if (uwlVar instanceof atm0) {
                ((atm0) uwlVar).m100223k4(userCardBean);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            awr.m100710d(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <E> List<E> m219018b(List<E> list, List<E> list2) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            arrayList.addAll(list);
        }
        if (!jyb.m147479J(list2)) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m219019c(Collection<uwl> collection, final UserCardBean userCardBean) {
        jyb.m147537z(collection, new y20() { // from class: l.y8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                z8p0.m219017a(userCardBean, (uwl) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: d */
    public static void m219020d(i6t i6tVar, vak0 vak0Var, UserCardData userCardData, String str) {
        User user = vak0Var == null ? null : vak0Var.f183108c.f143542a;
        if (user == null || user.matchedOrFollowed()) {
            return;
        }
        String str2 = user.f56859id.equals(i6tVar.m213810E2().m168532l0().f56859id) ? "liveProfilecard" : "live_watcher_profilecard";
        if (userCardData.getFrom() == 600) {
            str2 = "liveProfilecard_pkanchor";
        }
        tfs.C20303a c20303aM190972b = tfs.m190969k().m190972b(i6tVar.m213810E2(), false);
        c20303aM190972b.m190978h(user.f56859id).m190975e(str2);
        afu.m97555d(str, c20303aM190972b.m190971a());
    }
}
