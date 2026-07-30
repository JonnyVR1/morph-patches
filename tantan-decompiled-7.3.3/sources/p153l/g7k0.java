package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes10.dex */
public class g7k0 {
    /* JADX INFO: renamed from: a */
    public static void m129331a(Context context, nsv<User> nsvVar, boolean z) {
        m129332b(context, nsvVar, z, false, "", null);
    }

    /* JADX INFO: renamed from: b */
    public static void m129332b(Context context, nsv<User> nsvVar, boolean z, boolean z2, String str, String str2) {
        if (z2) {
            wrv wrvVar = zrv.f205799a;
            User user = nsvVar.f143542a;
            wrvVar.m207627B0(context, user, user.f56859id, str, !z, str2);
            return;
        }
        User user2 = nsvVar.f143542a;
        Followship followship = user2.localFollowship;
        Relationship relationship = user2.localRelationship;
        boolean z3 = false;
        boolean z4 = relationship != null && TEnum.equals(relationship.state, "matched");
        if (followship != null && (TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(followship.state, FollowshipStatus.followed) || TEnum.equals(followship.state, "matched"))) {
            z3 = true;
        }
        String str3 = (z4 || z3 || !z || zrv.f205799a.m207631D0().equals(nsvVar.f143542a.f56859id)) ? "live_user_card" : "live_profile_voice_mask_mode";
        wrv wrvVar2 = zrv.f205799a;
        User user3 = nsvVar.f143542a;
        wrvVar2.m207627B0(context, user3, user3.f56859id, str3, !z, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m129333c(Context context, vak0 vak0Var, String str, boolean z, String str2) {
        m129332b(context, vak0Var.f183108c, z, false, "", str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m129334d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return str + ":" + str2;
    }
}
