package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vzo0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m200774a(UserCardBean userCardBean, gul gulVar) {
        try {
            if (gulVar instanceof wjm0) {
                ((wjm0) gulVar).m203478k4(userCardBean);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            ztr.m220139d(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <E> List<E> m200775b(List<E> list, List<E> list2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            arrayList.addAll(list);
        }
        if (!vwb.m200296J(list2)) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m200776c(Collection<gul> collection, final UserCardBean userCardBean) {
        vwb.m200354z(collection, new e30() { // from class: l.uzo0
            @Override // p149l.e30
            public final void call(Object obj) {
                vzo0.m200774a(userCardBean, (gul) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d */
    public static void m200777d(h4t h4tVar, p1k0 p1k0Var, UserCardData userCardData, String str) {
        User user = p1k0Var == null ? null : p1k0Var.f146688c.f135304a;
        if (user == null || user.matchedOrFollowed()) {
            return;
        }
        String str2 = user.f56011id.equals(h4tVar.m206027E2().m132146l0().f56011id) ? "liveProfilecard" : "live_watcher_profilecard";
        if (userCardData.getFrom() == 600) {
            str2 = "liveProfilecard_pkanchor";
        }
        sds.C19911a c19911aM183543b = sds.m183540k().m183543b(h4tVar.m206027E2(), false);
        c19911aM183543b.m183549h(user.f56011id).m183546e(str2);
        zcu.m218089d(str, c19911aM183543b.m183542a());
    }
}
