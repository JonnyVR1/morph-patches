package p002l;

import android.widget.ImageView;
import com.p1.mobile.putong.core.data.ProfileGoodc;
import com.p1.mobile.putong.core.data.ProfileGoodcInfoBadge;
import com.p1.mobile.putong.core.data.ProfileGoodcNameBadge;
import com.p1.mobile.putong.core.data.ProfileGoodcNameRules;
import com.p1.mobile.putong.core.data.ProfileGoodcPhotoBadge;
import com.p1.mobile.putong.core.data.ProfileGoodcPhotoRules;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import l.vwb;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tm90 {

    /* JADX INFO: renamed from: a */
    public static tm90 f20304a;

    /* JADX INFO: renamed from: d */
    public static tm90 m23008d() {
        if (f20304a == null) {
            synchronized (tm90.class) {
                try {
                    if (f20304a == null) {
                        f20304a = new tm90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20304a;
    }

    /* JADX INFO: renamed from: a */
    public int m23009a(User user) {
        if (!m23015h(user)) {
            return -1;
        }
        try {
            ProfileGoodc profileGoodc = (ProfileGoodc) RemoteConfig.x().v("intl_good_c_bage_config", ProfileGoodc.JSON_ADAPTER);
            if (profileGoodc == null) {
                return -1;
            }
            profileGoodc.nullCheck();
            if (!profileGoodc.enabled) {
                return -1;
            }
            ProfileGoodcPhotoBadge profileGoodcPhotoBadge = profileGoodc.photo_badge;
            int iM23012e = m23012e(((DbObject) user).id, profileGoodcPhotoBadge.divisor);
            if (iM23012e == -1) {
                return -1;
            }
            ProfileGoodcPhotoRules profileGoodcPhotoRules = profileGoodcPhotoBadge.rules;
            int iM23011c = m23011c(profileGoodcPhotoRules.real_user, "real_user", iM23012e);
            return (iM23011c == -1 && (iM23011c = m23011c(profileGoodcPhotoRules.facebook, "facebook", iM23012e)) == -1) ? m23011c(profileGoodcPhotoRules.vip, "vip", iM23012e) : iM23011c;
        } catch (RemoteConfigException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m23010b() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: c */
    public final int m23011c(List<Integer> list, String str, int i) {
        if (!vwb.J(list) && list.contains(Integer.valueOf(i))) {
            str.getClass();
            switch (str) {
                case "real_user":
                    return 1;
                case "vip":
                    return 3;
                case "facebook":
                    return 2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m23012e(String str, int i) {
        long j = Long.parseLong(str);
        if (i == 0) {
            return -1;
        }
        return (int) (j % ((long) i));
    }

    /* JADX INFO: renamed from: f */
    public int m23013f(User user) {
        if (!m23015h(user)) {
            return -1;
        }
        try {
            ProfileGoodc profileGoodc = (ProfileGoodc) RemoteConfig.x().v("intl_good_c_bage_config", ProfileGoodc.JSON_ADAPTER);
            if (profileGoodc == null) {
                return -1;
            }
            profileGoodc.nullCheck();
            if (!profileGoodc.enabled) {
                return -1;
            }
            ProfileGoodcNameBadge profileGoodcNameBadge = profileGoodc.name_badge;
            int iM23012e = m23012e(((DbObject) user).id, profileGoodcNameBadge.divisor);
            if (iM23012e == -1) {
                return -1;
            }
            ProfileGoodcNameRules profileGoodcNameRules = profileGoodcNameBadge.rules;
            int iM23011c = m23011c(profileGoodcNameRules.real_user, "real_user", iM23012e);
            return iM23011c == -1 ? m23011c(profileGoodcNameRules.facebook, "facebook", iM23012e) : iM23011c;
        } catch (RemoteConfigException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m23014g(User user) {
        if (!m23015h(user)) {
            return false;
        }
        try {
            ProfileGoodc profileGoodc = (ProfileGoodc) RemoteConfig.x().v("intl_good_c_bage_config", ProfileGoodc.JSON_ADAPTER);
            if (profileGoodc == null) {
                return false;
            }
            profileGoodc.nullCheck();
            if (!profileGoodc.enabled) {
                return false;
            }
            ProfileGoodcInfoBadge profileGoodcInfoBadge = profileGoodc.info_badge;
            int iM23012e = m23012e(((DbObject) user).id, profileGoodcInfoBadge.divisor);
            if (iM23012e != -1 && m23011c(profileGoodcInfoBadge.rules.vip, "vip", iM23012e) == 3) {
                return true;
            }
        } catch (RemoteConfigException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m23015h(User user) {
        return NullChecker.a(user) && NullChecker.a(user.status) && user.status.size() > 0 && user.status.contains(UserStatus.get("RISK_TAG_GOOD_FACELESS_STATUS_3"));
    }

    /* JADX INFO: renamed from: i */
    public void m23016i(int i, ImageView imageView) {
        int i2;
        if (i != 1) {
            if (i == 2) {
                imageView.setBackgroundResource(x2c0.A1);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                imageView.setBackgroundResource(x2c0.I1);
                return;
            }
        }
        String strM23010b = m23010b();
        if ("in".equals(strM23010b) || "id".equals(strM23010b)) {
            i2 = x2c0.C1;
        } else if ("ja".equals(strM23010b)) {
            i2 = x2c0.D1;
        } else if ("ko".equals(strM23010b)) {
            i2 = x2c0.E1;
        } else if ("th".equals(strM23010b)) {
            i2 = x2c0.G1;
        } else if ("zh".equals(strM23010b)) {
            i2 = x2c0.H1;
        } else {
            i2 = strM23010b.contains("zh") ? x2c0.F1 : x2c0.B1;
        }
        imageView.setBackgroundResource(i2);
    }

    /* JADX INFO: renamed from: j */
    public void m23017j(int i, ImageView imageView, boolean z) {
        if (i == 1) {
            if (z) {
                imageView.setBackgroundResource(x2c0.z1);
                return;
            } else {
                imageView.setBackgroundResource(x2c0.lp);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        if (z) {
            imageView.setBackgroundResource(x2c0.y1);
        } else {
            imageView.setBackgroundResource(x2c0.kp);
        }
    }
}
