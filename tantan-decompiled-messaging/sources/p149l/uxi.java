package p149l;

import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class uxi {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static String m196180a(Gender gender) {
        return TEnum.equals(gender, "male") ? ypv.f199497e.getString(R$string.f46737I4) : ypv.f199497e.getString(R$string.f46759J4);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m196181b(User user, Followship followship) {
        User userM199311E0;
        if (user == null) {
            return false;
        }
        if (user.localRelationship == null && (userM199311E0 = ypv.f199493a.m199311E0(user.f56011id)) != null) {
            user.localRelationship = userM199311E0.localRelationship;
        }
        Relationship relationship = user.localRelationship;
        if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
            return followship != null && (TEnum.equals(followship.state, "matched") || TEnum.equals(followship.state, FollowshipStatus.following));
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m196182c(User user, Followship followship) {
        return (user == null || followship == null || (!TEnum.equals(followship.state, "matched") && !TEnum.equals(followship.state, FollowshipStatus.following))) ? false : true;
    }
}
