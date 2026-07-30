package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class j2i {
    /* JADX INFO: renamed from: a */
    public static void m11067a(Moment moment, String str) {
        if (NullChecker.a(moment)) {
            j760 j760Var = new j760("moment_type", zi60.m17436w().m17467y(moment));
            j760 j760Var2 = new j760("moment_id", ((DbObject) moment).id);
            j760 j760Var3 = new j760("owner_id", moment.owner);
            j760 j760Var4 = new j760("receiver_user_id", moment.owner);
            j760 j760Var5 = new j760("comment_detail", "comment");
            zi60.m17436w();
            p6j0.m12913c("e_comment", "p_user_moment_interactions_details_view", j760Var, j760Var2, j760Var3, j760Var4, j760Var5, new j760("moment_showfrom", zi60.m17435D(str)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11068b(Moment moment, String str, String str2, String str3, String str4) {
        p6j0.m12913c("e_comment", str2, (j760[]) m11069c(moment, str, str2, str3, str4).toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: c */
    public static List<j760<String, Object>> m11069c(Moment moment, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("moment_id", ((DbObject) moment).id));
        arrayList.add(j760.a("owner_id", moment.owner));
        zi60.m17436w();
        arrayList.add(j760.a("moment_showfrom", zi60.m17435D(str)));
        arrayList.add(j760.a("moment_type", zi60.m17436w().m17467y(moment)));
        arrayList.add(j760.a("comment_detail", str3));
        arrayList.add(j760.a("moment_distance", Long.valueOf(vqg.m15477G(moment))));
        arrayList.add(j760.a("moment_create_time", Long.valueOf(vqg.m15475F(moment))));
        arrayList.add(j760.a("owner_active_time", Long.valueOf(vqg.m15495S(FeedModule.f316d.m16628e8(moment.owner)))));
        arrayList.add(j760.a("comment_id", str4));
        return arrayList;
    }
}
