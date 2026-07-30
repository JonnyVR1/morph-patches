package p149l;

import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes12.dex */
public class ubx {

    /* JADX INFO: renamed from: a */
    public static hpd0 f175765a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f175766b;

    /* JADX INFO: renamed from: c */
    public static e30<d30> f175767c;

    static {
        Boolean bool = Boolean.FALSE;
        f175765a = new hpd0("hasShowTipForLike", bool);
        f175766b = new hpd0("hasShowTipForComment", bool);
        f175767c = xck0.m208120a(200, new e30() { // from class: l.tbx
            @Override // p149l.e30
            public final void call(Object obj) {
                ((d30) obj).call();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static boolean m192938b(User user) {
        Followship followship;
        return (user == null || (followship = user.localFollowship) == null || !TEnum.equals(followship.state, "matched")) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m192939c(User user) {
        Relationship relationship;
        return (user == null || (relationship = user.localRelationship) == null || !TEnum.equals(relationship.state, "matched")) ? false : true;
    }
}
