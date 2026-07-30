package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SuperlikeByCount;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class yio {

    /* JADX INFO: renamed from: l.yio$a */
    public static class C21610a {

        /* JADX INFO: renamed from: a */
        public String f200227a;

        /* JADX INFO: renamed from: b */
        public int f200228b;

        public C21610a(String str, int i) {
            this.f200227a = str;
            this.f200228b = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m216341a(String str) {
        if (jyb.m147479J(CoreModule.f18264c.f20432v0.f130575X)) {
            return false;
        }
        Iterator<SuperlikeByCount> it = CoreModule.f18264c.f20432v0.f130575X.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f21252id, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static C21610a m216342b(User user) {
        String string;
        String strM175813r;
        lhn.C18395a c18395aM154230a;
        long jM174454o = pzi0.m174454o();
        Location location = user.location;
        double d = location.updatedTime;
        long j = (jM174454o - ((long) d)) / 1000;
        int i = location.distance;
        int i2 = 0;
        if (i <= 13000) {
            strM175813r = q8g0.m175814s(i, false, true);
        } else if (j < 86400) {
            strM175813r = pzi0.m174445J(d, true);
        } else {
            List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
            if (jyb.m147479J(list) || (c18395aM154230a = lhn.INSTANCE.m154230a(list.get(0))) == null) {
                string = null;
            } else {
                string = App.f16088e.getString(c18395aM154230a.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                i2 = gbc0.f103197S;
            }
            String string2 = (string != null || j > 432000) ? string : App.f16088e.getString(R$string.f21377c1);
            strM175813r = string2 == null ? q8g0.m175813r(user.location.mo225055clone(), true, true) : string2;
        }
        if (App.f16088e.getString(R$string.f21341M).equals(strM175813r) || App.f16088e.getString(R$string.f21377c1).equals(strM175813r)) {
            i2 = gbc0.f103148L;
        }
        return new C21610a(strM175813r, i2);
    }

    /* JADX INFO: renamed from: c */
    public static String m216343c(User user) {
        long jM174454o = pzi0.m174454o();
        Location location = user.location;
        long j = (jM174454o - ((long) location.updatedTime)) / 1000;
        if (location.distance <= 13000) {
            return "distance_tag";
        }
        if (j < 86400) {
            return "active_tag";
        }
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        if (jyb.m147479J(list) || lhn.INSTANCE.m154230a(list.get(0)) == null) {
            return j <= 432000 ? "active_tag" : "distance_tag";
        }
        return "purpose_tag";
    }
}
