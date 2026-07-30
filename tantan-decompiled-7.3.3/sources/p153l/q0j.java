package p153l;

import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class q0j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static String m174710a(Gender gender) {
        return TEnum.equals(gender, "male") ? zrv.f205803e.getString(R$string.f47585I4) : zrv.f205803e.getString(R$string.f47607J4);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m174711b(User user, Followship followship) {
        User userM207633E0;
        if (user == null) {
            return false;
        }
        if (user.localRelationship == null && (userM207633E0 = zrv.f205799a.m207633E0(user.f56859id)) != null) {
            user.localRelationship = userM207633E0.localRelationship;
        }
        Relationship relationship = user.localRelationship;
        if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
            return followship != null && (TEnum.equals(followship.state, "matched") || TEnum.equals(followship.state, FollowshipStatus.following));
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m174712c(User user, Followship followship) {
        return (user == null || followship == null || (!TEnum.equals(followship.state, "matched") && !TEnum.equals(followship.state, FollowshipStatus.following))) ? false : true;
    }
}
