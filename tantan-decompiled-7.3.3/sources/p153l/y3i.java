package p153l;

import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class y3i {
    /* JADX INFO: renamed from: a */
    public static void m214147a(Moment moment, String str) {
        if (NullChecker.m82486a(moment)) {
            pf60 pf60Var = new pf60("moment_type", er60.m122104w().m122135y(moment));
            pf60 pf60Var2 = new pf60("moment_id", moment.f56859id);
            pf60 pf60Var3 = new pf60("owner_id", moment.owner);
            pf60 pf60Var4 = new pf60("receiver_user_id", moment.owner);
            pf60 pf60Var5 = new pf60("comment_detail", "comment");
            er60.m122104w();
            tfj0.m190940c("e_comment", "p_user_moment_interactions_details_view", pf60Var, pf60Var2, pf60Var3, pf60Var4, pf60Var5, new pf60("moment_showfrom", er60.m122103D(str)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m214148b(Moment moment, String str, String str2, String str3, String str4) {
        tfj0.m190940c("e_comment", str2, (pf60[]) m214149c(moment, str, str2, str3, str4).toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: c */
    public static List<pf60<String, Object>> m214149c(Moment moment, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("moment_id", moment.f56859id));
        arrayList.add(pf60.m172085a("owner_id", moment.owner));
        er60.m122104w();
        arrayList.add(pf60.m172085a("moment_showfrom", er60.m122103D(str)));
        arrayList.add(pf60.m172085a("moment_type", er60.m122104w().m122135y(moment)));
        arrayList.add(pf60.m172085a("comment_detail", str3));
        arrayList.add(pf60.m172085a("moment_distance", Long.valueOf(ksg.m151166G(moment))));
        arrayList.add(pf60.m172085a("moment_create_time", Long.valueOf(ksg.m151164F(moment))));
        arrayList.add(pf60.m172085a("owner_active_time", Long.valueOf(ksg.m151184S(FeedModule.f39703d.m145688e8(moment.owner)))));
        arrayList.add(pf60.m172085a("comment_id", str4));
        return arrayList;
    }
}
