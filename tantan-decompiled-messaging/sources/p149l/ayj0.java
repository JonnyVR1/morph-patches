package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class ayj0 {
    /* JADX INFO: renamed from: a */
    public static void m99566a(Context context, mqv<User> mqvVar, boolean z) {
        m99567b(context, mqvVar, z, false, "", null);
    }

    /* JADX INFO: renamed from: b */
    public static void m99567b(Context context, mqv<User> mqvVar, boolean z, boolean z2, String str, String str2) {
        if (z2) {
            vpv vpvVar = ypv.f199493a;
            User user = mqvVar.f135304a;
            vpvVar.m199305B0(context, user, user.f56011id, str, !z, str2);
            return;
        }
        User user2 = mqvVar.f135304a;
        Followship followship = user2.localFollowship;
        Relationship relationship = user2.localRelationship;
        boolean z3 = false;
        boolean z4 = relationship != null && TEnum.equals(relationship.state, "matched");
        if (followship != null && (TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(followship.state, FollowshipStatus.followed) || TEnum.equals(followship.state, "matched"))) {
            z3 = true;
        }
        String str3 = (z4 || z3 || !z || ypv.f199493a.m199309D0().equals(mqvVar.f135304a.f56011id)) ? "live_user_card" : "live_profile_voice_mask_mode";
        vpv vpvVar2 = ypv.f199493a;
        User user3 = mqvVar.f135304a;
        vpvVar2.m199305B0(context, user3, user3.f56011id, str3, !z, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m99568c(Context context, p1k0 p1k0Var, String str, boolean z, String str2) {
        m99567b(context, p1k0Var.f146688c, z, false, "", str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m99569d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return str + ":" + str2;
    }
}
