package p153l;

import android.widget.ImageView;
import com.p051p1.mobile.putong.core.data.ProfileGoodc;
import com.p051p1.mobile.putong.core.data.ProfileGoodcInfoBadge;
import com.p051p1.mobile.putong.core.data.ProfileGoodcNameBadge;
import com.p051p1.mobile.putong.core.data.ProfileGoodcNameRules;
import com.p051p1.mobile.putong.core.data.ProfileGoodcPhotoBadge;
import com.p051p1.mobile.putong.core.data.ProfileGoodcPhotoRules;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class xu90 {

    /* JADX INFO: renamed from: a */
    public static xu90 f196267a;

    /* JADX INFO: renamed from: d */
    public static xu90 m213122d() {
        if (f196267a == null) {
            synchronized (xu90.class) {
                try {
                    if (f196267a == null) {
                        f196267a = new xu90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f196267a;
    }

    /* JADX INFO: renamed from: a */
    public int m213123a(User user) {
        if (!m213129h(user)) {
            return -1;
        }
        try {
            ProfileGoodc profileGoodc = (ProfileGoodc) RemoteConfig.m80481x().m80516v("intl_good_c_bage_config", ProfileGoodc.JSON_ADAPTER);
            if (profileGoodc == null) {
                return -1;
            }
            profileGoodc.nullCheck();
            if (!profileGoodc.enabled) {
                return -1;
            }
            ProfileGoodcPhotoBadge profileGoodcPhotoBadge = profileGoodc.photo_badge;
            int iM213126e = m213126e(user.f56859id, profileGoodcPhotoBadge.divisor);
            if (iM213126e == -1) {
                return -1;
            }
            ProfileGoodcPhotoRules profileGoodcPhotoRules = profileGoodcPhotoBadge.rules;
            int iM213125c = m213125c(profileGoodcPhotoRules.real_user, "real_user", iM213126e);
            return (iM213125c == -1 && (iM213125c = m213125c(profileGoodcPhotoRules.facebook, "facebook", iM213126e)) == -1) ? m213125c(profileGoodcPhotoRules.vip, "vip", iM213126e) : iM213125c;
        } catch (RemoteConfigException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m213124b() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: renamed from: c */
    public final int m213125c(List<Integer> list, String str, int i) {
        if (!jyb.m147479J(list) && list.contains(Integer.valueOf(i))) {
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
    public final int m213126e(String str, int i) {
        long j = Long.parseLong(str);
        if (i == 0) {
            return -1;
        }
        return (int) (j % ((long) i));
    }

    /* JADX INFO: renamed from: f */
    public int m213127f(User user) {
        if (!m213129h(user)) {
            return -1;
        }
        try {
            ProfileGoodc profileGoodc = (ProfileGoodc) RemoteConfig.m80481x().m80516v("intl_good_c_bage_config", ProfileGoodc.JSON_ADAPTER);
            if (profileGoodc == null) {
                return -1;
            }
            profileGoodc.nullCheck();
            if (!profileGoodc.enabled) {
                return -1;
            }
            ProfileGoodcNameBadge profileGoodcNameBadge = profileGoodc.name_badge;
            int iM213126e = m213126e(user.f56859id, profileGoodcNameBadge.divisor);
            if (iM213126e == -1) {
                return -1;
            }
            ProfileGoodcNameRules profileGoodcNameRules = profileGoodcNameBadge.rules;
            int iM213125c = m213125c(profileGoodcNameRules.real_user, "real_user", iM213126e);
            return iM213125c == -1 ? m213125c(profileGoodcNameRules.facebook, "facebook", iM213126e) : iM213125c;
        } catch (RemoteConfigException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m213128g(User user) {
        if (!m213129h(user)) {
            return false;
        }
        try {
            ProfileGoodc profileGoodc = (ProfileGoodc) RemoteConfig.m80481x().m80516v("intl_good_c_bage_config", ProfileGoodc.JSON_ADAPTER);
            if (profileGoodc == null) {
                return false;
            }
            profileGoodc.nullCheck();
            if (!profileGoodc.enabled) {
                return false;
            }
            ProfileGoodcInfoBadge profileGoodcInfoBadge = profileGoodc.info_badge;
            int iM213126e = m213126e(user.f56859id, profileGoodcInfoBadge.divisor);
            if (iM213126e != -1 && m213125c(profileGoodcInfoBadge.rules.vip, "vip", iM213126e) == 3) {
                return true;
            }
        } catch (RemoteConfigException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m213129h(User user) {
        return NullChecker.m82486a(user) && NullChecker.m82486a(user.status) && user.status.size() > 0 && user.status.contains(UserStatus.get(UserStatus.RISK_TAG_GOOD_FACELESS_STATUS_3));
    }

    /* JADX INFO: renamed from: i */
    public void m213130i(int i, ImageView imageView) {
        int i2;
        if (i != 1) {
            if (i == 2) {
                imageView.setBackgroundResource(dbc0.f86010B1);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                imageView.setBackgroundResource(dbc0.f86266J1);
                return;
            }
        }
        String strM213124b = m213124b();
        if ("in".equals(strM213124b) || "id".equals(strM213124b)) {
            i2 = dbc0.f86074D1;
        } else if ("ja".equals(strM213124b)) {
            i2 = dbc0.f86106E1;
        } else if ("ko".equals(strM213124b)) {
            i2 = dbc0.f86138F1;
        } else if ("th".equals(strM213124b)) {
            i2 = dbc0.f86202H1;
        } else if ("zh".equals(strM213124b)) {
            i2 = dbc0.f86234I1;
        } else {
            i2 = strM213124b.contains("zh") ? dbc0.f86170G1 : dbc0.f86042C1;
        }
        imageView.setBackgroundResource(i2);
    }

    /* JADX INFO: renamed from: j */
    public void m213131j(int i, ImageView imageView, boolean z) {
        if (i == 1) {
            if (z) {
                imageView.setBackgroundResource(dbc0.f85978A1);
                return;
            } else {
                imageView.setBackgroundResource(dbc0.f86802Zp);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        if (z) {
            imageView.setBackgroundResource(dbc0.f87627z1);
        } else {
            imageView.setBackgroundResource(dbc0.f86770Yp);
        }
    }
}
