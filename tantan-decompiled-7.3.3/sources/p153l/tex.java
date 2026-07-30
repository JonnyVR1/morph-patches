package p153l;

import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes13.dex */
public class tex {

    /* JADX INFO: renamed from: a */
    public static jxd0 f173906a;

    /* JADX INFO: renamed from: b */
    public static jxd0 f173907b;

    /* JADX INFO: renamed from: c */
    public static y20<x20> f173908c;

    static {
        Boolean bool = Boolean.FALSE;
        f173906a = new jxd0("hasShowTipForLike", bool);
        f173907b = new jxd0("hasShowTipForComment", bool);
        f173908c = dmk0.m116962a(200, new y20() { // from class: l.sex
            @Override // p153l.y20
            public final void call(Object obj) {
                ((x20) obj).call();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static boolean m190901b(User user) {
        Followship followship;
        return (user == null || (followship = user.localFollowship) == null || !TEnum.equals(followship.state, "matched")) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m190902c(User user) {
        Relationship relationship;
        return (user == null || (relationship = user.localRelationship) == null || !TEnum.equals(relationship.state, "matched")) ? false : true;
    }
}
