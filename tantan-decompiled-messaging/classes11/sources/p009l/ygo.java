package p009l;

import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SuperlikeByCount;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import l.b3c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ygo {

    /* JADX INFO: renamed from: l.ygo$a */
    public static class C1331a {

        /* JADX INFO: renamed from: a */
        public String f23056a;

        /* JADX INFO: renamed from: b */
        public int f23057b;

        public C1331a(String str, int i) {
            this.f23056a = str;
            this.f23057b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m25370a(String str) {
        if (vwb.J(CoreModule.c.v0.W)) {
            return false;
        }
        Iterator it = CoreModule.c.v0.W.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((SuperlikeByCount) it.next()).id, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static C1331a m25371b(User user) {
        String string;
        String strM16146r;
        lfn.C1015a c1015aM17877a;
        long jM18550o = mqi0.m18550o();
        Location location = user.location;
        double d = location.updatedTime;
        long j = (jM18550o - ((long) d)) / 1000;
        int i = location.distance;
        int i2 = 0;
        if (i <= 13000) {
            strM16146r = i0g0.m16147s(i, false, true);
        } else if (j < 86400) {
            strM16146r = mqi0.m18541J(d, true);
        } else {
            List list = user.profile.extensions.basic.intlFriendPurposeV2;
            if (vwb.J(list) || (c1015aM17877a = lfn.INSTANCE.m17877a((String) list.get(0))) == null) {
                string = null;
            } else {
                string = App.e.getString(c1015aM17877a.getName());
                i2 = b3c0.S;
            }
            String string2 = (string != null || j > 432000) ? string : App.e.getString(R.string.c1);
            strM16146r = string2 == null ? i0g0.m16146r(user.location.clone(), true, true) : string2;
        }
        if (App.e.getString(R.string.M).equals(strM16146r) || App.e.getString(R.string.c1).equals(strM16146r)) {
            i2 = b3c0.L;
        }
        return new C1331a(strM16146r, i2);
    }

    /* JADX INFO: renamed from: c */
    public static String m25372c(User user) {
        long jM18550o = mqi0.m18550o();
        Location location = user.location;
        long j = (jM18550o - ((long) location.updatedTime)) / 1000;
        if (location.distance <= 13000) {
            return "distance_tag";
        }
        if (j < 86400) {
            return "active_tag";
        }
        List list = user.profile.extensions.basic.intlFriendPurposeV2;
        if (vwb.J(list) || lfn.INSTANCE.m17877a((String) list.get(0)) == null) {
            return j <= 432000 ? "active_tag" : "distance_tag";
        }
        return "purpose_tag";
    }
}
