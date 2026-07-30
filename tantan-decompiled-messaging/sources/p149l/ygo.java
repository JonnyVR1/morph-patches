package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SuperlikeByCount;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ygo {

    /* JADX INFO: renamed from: l.ygo$a */
    public static class C21397a {

        /* JADX INFO: renamed from: a */
        public String f198213a;

        /* JADX INFO: renamed from: b */
        public int f198214b;

        public C21397a(String str, int i) {
            this.f198213a = str;
            this.f198214b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m214738a(String str) {
        if (vwb.m200296J(CoreModule.f17545c.f19690v0.f79723W)) {
            return false;
        }
        Iterator<SuperlikeByCount> it = CoreModule.f17545c.f19690v0.f79723W.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f20510id, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static C21397a m214739b(User user) {
        String string;
        String strM133878r;
        lfn.C18216a c18216aM149726a;
        long jM155944o = mqi0.m155944o();
        Location location = user.location;
        double d = location.updatedTime;
        long j = (jM155944o - ((long) d)) / 1000;
        int i = location.distance;
        int i2 = 0;
        if (i <= 13000) {
            strM133878r = i0g0.m133879s(i, false, true);
        } else if (j < 86400) {
            strM133878r = mqi0.m155935J(d, true);
        } else {
            List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
            if (vwb.m200296J(list) || (c18216aM149726a = lfn.INSTANCE.m149726a(list.get(0))) == null) {
                string = null;
            } else {
                string = App.f15369e.getString(c18216aM149726a.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                i2 = b3c0.f72946S;
            }
            String string2 = (string != null || j > 432000) ? string : App.f15369e.getString(R$string.f20635c1);
            strM133878r = string2 == null ? i0g0.m133878r(user.location.mo223809clone(), true, true) : string2;
        }
        if (App.f15369e.getString(R$string.f20599M).equals(strM133878r) || App.f15369e.getString(R$string.f20635c1).equals(strM133878r)) {
            i2 = b3c0.f72897L;
        }
        return new C21397a(strM133878r, i2);
    }

    /* JADX INFO: renamed from: c */
    public static String m214740c(User user) {
        long jM155944o = mqi0.m155944o();
        Location location = user.location;
        long j = (jM155944o - ((long) location.updatedTime)) / 1000;
        if (location.distance <= 13000) {
            return "distance_tag";
        }
        if (j < 86400) {
            return "active_tag";
        }
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        if (vwb.m200296J(list) || lfn.INSTANCE.m149726a(list.get(0)) == null) {
            return j <= 432000 ? "active_tag" : "distance_tag";
        }
        return "purpose_tag";
    }
}
