package p007l;

import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import l.d30;
import l.e30;
import l.hpd0;
import l.xck0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ubx {

    /* JADX INFO: renamed from: a */
    public static hpd0 f13802a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f13803b;

    /* JADX INFO: renamed from: c */
    public static e30<d30> f13804c;

    static {
        Boolean bool = Boolean.FALSE;
        f13802a = new hpd0("hasShowTipForLike", bool);
        f13803b = new hpd0("hasShowTipForComment", bool);
        f13804c = xck0.a(GivenGiftBrief.ADVANCED_GIFT_LEVEL, new e30() { // from class: l.tbx
            public final void call(Object obj) {
                ((d30) obj).call();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15072b(User user) {
        Followship followship;
        return (user == null || (followship = user.localFollowship) == null || !TEnum.equals(followship.state, "matched")) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15073c(User user) {
        Relationship relationship;
        return (user == null || (relationship = user.localRelationship) == null || !TEnum.equals(relationship.state, "matched")) ? false : true;
    }
}
