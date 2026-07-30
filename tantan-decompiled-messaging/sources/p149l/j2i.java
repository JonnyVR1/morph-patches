package p149l;

import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class j2i {
    /* JADX INFO: renamed from: a */
    public static void m139462a(Moment moment, String str) {
        if (NullChecker.m81303a(moment)) {
            j760 j760Var = new j760("moment_type", zi60.m218961w().m218992y(moment));
            j760 j760Var2 = new j760("moment_id", moment.f56011id);
            j760 j760Var3 = new j760("owner_id", moment.owner);
            j760 j760Var4 = new j760("receiver_user_id", moment.owner);
            j760 j760Var5 = new j760("comment_detail", "comment");
            zi60.m218961w();
            p6j0.m167669c("e_comment", "p_user_moment_interactions_details_view", j760Var, j760Var2, j760Var3, j760Var4, j760Var5, new j760("moment_showfrom", zi60.m218960D(str)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m139463b(Moment moment, String str, String str2, String str3, String str4) {
        p6j0.m167669c("e_comment", str2, (j760[]) m139464c(moment, str, str2, str3, str4).toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: c */
    public static List<j760<String, Object>> m139464c(Moment moment, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("moment_id", moment.f56011id));
        arrayList.add(j760.m140076a("owner_id", moment.owner));
        zi60.m218961w();
        arrayList.add(j760.m140076a("moment_showfrom", zi60.m218960D(str)));
        arrayList.add(j760.m140076a("moment_type", zi60.m218961w().m218992y(moment)));
        arrayList.add(j760.m140076a("comment_detail", str3));
        arrayList.add(j760.m140076a("moment_distance", Long.valueOf(vqg.m199507G(moment))));
        arrayList.add(j760.m140076a("moment_create_time", Long.valueOf(vqg.m199505F(moment))));
        arrayList.add(j760.m140076a("owner_active_time", Long.valueOf(vqg.m199525S(FeedModule.f38855d.m209447e8(moment.owner)))));
        arrayList.add(j760.m140076a("comment_id", str4));
        return arrayList;
    }
}
