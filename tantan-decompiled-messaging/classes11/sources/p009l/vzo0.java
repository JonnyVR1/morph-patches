package p009l;

import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.gul;
import l.h4t;
import l.p1k0;
import l.sds;
import l.vwb;
import l.zcu;
import l.ztr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vzo0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23765a(UserCardBean userCardBean, gul gulVar) {
        try {
            if (gulVar instanceof wjm0) {
                ((wjm0) gulVar).m24305k4(userCardBean);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            ztr.d(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <E> List<E> m23766b(List<E> list, List<E> list2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            arrayList.addAll(list);
        }
        if (!vwb.J(list2)) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m23767c(Collection<gul> collection, final UserCardBean userCardBean) {
        vwb.z(collection, new e30() { // from class: l.uzo0
            public final void call(Object obj) {
                vzo0.m23765a(userCardBean, (gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m23768d(h4t h4tVar, p1k0 p1k0Var, UserCardData userCardData, String str) {
        User user = p1k0Var == null ? null : (User) p1k0Var.c.a;
        if (user == null || user.matchedOrFollowed()) {
            return;
        }
        String str2 = ((DbObject) user).id.equals(((DbObject) h4tVar.E2().l0()).id) ? "liveProfilecard" : "live_watcher_profilecard";
        if (userCardData.getFrom() == 600) {
            str2 = "liveProfilecard_pkanchor";
        }
        sds.a aVarB = sds.k().b(h4tVar.E2(), false);
        aVarB.h(((DbObject) user).id).e(str2);
        zcu.d(str, aVarB.a());
    }
}
