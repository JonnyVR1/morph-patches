package p009l;

import android.content.Context;
import android.text.TextUtils;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import l.mqv;
import l.p1k0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ayj0 {
    /* JADX INFO: renamed from: a */
    public static void m11766a(Context context, mqv<User> mqvVar, boolean z) {
        m11767b(context, mqvVar, z, false, "", null);
    }

    /* JADX INFO: renamed from: b */
    public static void m11767b(Context context, mqv<User> mqvVar, boolean z, boolean z2, String str, String str2) {
        if (z2) {
            vpv vpvVar = ypv.f23196a;
            Object obj = mqvVar.a;
            vpvVar.m23615B0(context, (User) obj, ((DbObject) ((User) obj)).id, str, !z, str2);
            return;
        }
        Object obj2 = mqvVar.a;
        Followship followship = ((User) obj2).localFollowship;
        Relationship relationship = ((User) obj2).localRelationship;
        boolean z3 = false;
        boolean z4 = relationship != null && TEnum.equals(relationship.state, "matched");
        if (followship != null && (TEnum.equals(followship.state, "following") || TEnum.equals(followship.state, "followed") || TEnum.equals(followship.state, "matched"))) {
            z3 = true;
        }
        String str3 = (z4 || z3 || !z || ypv.f23196a.m23619D0().equals(((DbObject) ((User) mqvVar.a)).id)) ? "live_user_card" : "live_profile_voice_mask_mode";
        vpv vpvVar2 = ypv.f23196a;
        Object obj3 = mqvVar.a;
        vpvVar2.m23615B0(context, (User) obj3, ((DbObject) ((User) obj3)).id, str3, !z, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m11768c(Context context, p1k0 p1k0Var, String str, boolean z, String str2) {
        m11767b(context, p1k0Var.c, z, false, "", str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m11769d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return str + ":" + str2;
    }
}
