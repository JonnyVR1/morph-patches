package p149l;

import android.widget.ImageView;
import com.p046p1.mobile.putong.core.data.ProfileGoodc;
import com.p046p1.mobile.putong.core.data.ProfileGoodcInfoBadge;
import com.p046p1.mobile.putong.core.data.ProfileGoodcNameBadge;
import com.p046p1.mobile.putong.core.data.ProfileGoodcNameRules;
import com.p046p1.mobile.putong.core.data.ProfileGoodcPhotoBadge;
import com.p046p1.mobile.putong.core.data.ProfileGoodcPhotoRules;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class tm90 {

    /* JADX INFO: renamed from: a */
    public static tm90 f171141a;

    /* JADX INFO: renamed from: d */
    public static tm90 m189643d() {
        if (f171141a == null) {
            synchronized (tm90.class) {
                try {
                    if (f171141a == null) {
                        f171141a = new tm90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f171141a;
    }

    /* JADX INFO: renamed from: a */
    public int m189644a(User user) {
        if (!m189650h(user)) {
            return -1;
        }
        try {
            ProfileGoodc profileGoodc = (ProfileGoodc) RemoteConfig.m79298x().m79333v("intl_good_c_bage_config", ProfileGoodc.JSON_ADAPTER);
            if (profileGoodc == null) {
                return -1;
            }
            profileGoodc.nullCheck();
            if (!profileGoodc.enabled) {
                return -1;
            }
            ProfileGoodcPhotoBadge profileGoodcPhotoBadge = profileGoodc.photo_badge;
            int iM189647e = m189647e(user.f56011id, profileGoodcPhotoBadge.divisor);
            if (iM189647e == -1) {
                return -1;
            }
            ProfileGoodcPhotoRules profileGoodcPhotoRules = profileGoodcPhotoBadge.rules;
            int iM189646c = m189646c(profileGoodcPhotoRules.real_user, "real_user", iM189647e);
            return (iM189646c == -1 && (iM189646c = m189646c(profileGoodcPhotoRules.facebook, "facebook", iM189647e)) == -1) ? m189646c(profileGoodcPhotoRules.vip, "vip", iM189647e) : iM189646c;
        } catch (RemoteConfigException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m189645b() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: c */
    public final int m189646c(List<Integer> list, String str, int i) {
        if (!vwb.m200296J(list) && list.contains(Integer.valueOf(i))) {
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
    public final int m189647e(String str, int i) {
        long j = Long.parseLong(str);
        if (i == 0) {
            return -1;
        }
        return (int) (j % ((long) i));
    }

    /* JADX INFO: renamed from: f */
    public int m189648f(User user) {
        if (!m189650h(user)) {
            return -1;
        }
        try {
            ProfileGoodc profileGoodc = (ProfileGoodc) RemoteConfig.m79298x().m79333v("intl_good_c_bage_config", ProfileGoodc.JSON_ADAPTER);
            if (profileGoodc == null) {
                return -1;
            }
            profileGoodc.nullCheck();
            if (!profileGoodc.enabled) {
                return -1;
            }
            ProfileGoodcNameBadge profileGoodcNameBadge = profileGoodc.name_badge;
            int iM189647e = m189647e(user.f56011id, profileGoodcNameBadge.divisor);
            if (iM189647e == -1) {
                return -1;
            }
            ProfileGoodcNameRules profileGoodcNameRules = profileGoodcNameBadge.rules;
            int iM189646c = m189646c(profileGoodcNameRules.real_user, "real_user", iM189647e);
            return iM189646c == -1 ? m189646c(profileGoodcNameRules.facebook, "facebook", iM189647e) : iM189646c;
        } catch (RemoteConfigException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m189649g(User user) {
        if (!m189650h(user)) {
            return false;
        }
        try {
            ProfileGoodc profileGoodc = (ProfileGoodc) RemoteConfig.m79298x().m79333v("intl_good_c_bage_config", ProfileGoodc.JSON_ADAPTER);
            if (profileGoodc == null) {
                return false;
            }
            profileGoodc.nullCheck();
            if (!profileGoodc.enabled) {
                return false;
            }
            ProfileGoodcInfoBadge profileGoodcInfoBadge = profileGoodc.info_badge;
            int iM189647e = m189647e(user.f56011id, profileGoodcInfoBadge.divisor);
            if (iM189647e != -1 && m189646c(profileGoodcInfoBadge.rules.vip, "vip", iM189647e) == 3) {
                return true;
            }
        } catch (RemoteConfigException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m189650h(User user) {
        return NullChecker.m81303a(user) && NullChecker.m81303a(user.status) && user.status.size() > 0 && user.status.contains(UserStatus.get(UserStatus.RISK_TAG_GOOD_FACELESS_STATUS_3));
    }

    /* JADX INFO: renamed from: i */
    public void m189651i(int i, ImageView imageView) {
        int i2;
        if (i != 1) {
            if (i == 2) {
                imageView.setBackgroundResource(x2c0.f189155A1);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                imageView.setBackgroundResource(x2c0.f189409I1);
                return;
            }
        }
        String strM189645b = m189645b();
        if ("in".equals(strM189645b) || "id".equals(strM189645b)) {
            i2 = x2c0.f189219C1;
        } else if ("ja".equals(strM189645b)) {
            i2 = x2c0.f189251D1;
        } else if ("ko".equals(strM189645b)) {
            i2 = x2c0.f189283E1;
        } else if ("th".equals(strM189645b)) {
            i2 = x2c0.f189347G1;
        } else if ("zh".equals(strM189645b)) {
            i2 = x2c0.f189378H1;
        } else {
            i2 = strM189645b.contains("zh") ? x2c0.f189315F1 : x2c0.f189187B1;
        }
        imageView.setBackgroundResource(i2);
    }

    /* JADX INFO: renamed from: j */
    public void m189652j(int i, ImageView imageView, boolean z) {
        if (i == 1) {
            if (z) {
                imageView.setBackgroundResource(x2c0.f190764z1);
                return;
            } else {
                imageView.setBackgroundResource(x2c0.f190340lp);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        if (z) {
            imageView.setBackgroundResource(x2c0.f190732y1);
        } else {
            imageView.setBackgroundResource(x2c0.f190308kp);
        }
    }
}
