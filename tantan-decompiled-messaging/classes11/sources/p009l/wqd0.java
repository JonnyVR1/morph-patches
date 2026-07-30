package p009l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.cqd0;
import l.gpd0;
import l.i95;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wqd0 extends cqd0<RememberUserInfo> {
    public wqd0(Context context, String str, boolean z, String str2) {
        super(context, str, (Object) null, z, str2);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean m24464h(@NonNull RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        return rememberUserInfo.equals(rememberUserInfo2);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public RememberUserInfo m24465k(RememberUserInfo rememberUserInfo, @NonNull RememberUserInfo rememberUserInfo2) {
        return rememberUserInfo2.clone();
    }

    /* JADX INFO: renamed from: o */
    public boolean m24468o(int i, String str, String str2, int i2, AuthData authData, String str3) {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.countryCode = i;
        rememberUserInfo.phoneNumber = str;
        rememberUserInfo.imgUrl = str2;
        rememberUserInfo.pwdLength = i2;
        rememberUserInfo.auth = authData;
        rememberUserInfo.name = str3;
        return l(rememberUserInfo);
    }

    /* JADX INFO: renamed from: p */
    public boolean m24469p(String str, AuthData authData, String str2) {
        return m24468o(0, "", str, 0, authData, str2);
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public RememberUserInfo m24462f() {
        String string = d().getString(((gpd0) this).a, null);
        String string2 = e().getString(((gpd0) this).b, null);
        if (TextUtils.isEmpty(string) && !TextUtils.equals(string, string2)) {
            d().edit().putString(((gpd0) this).a, string2).apply();
            string = string2;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (!TextUtils.equals(string, string2)) {
            e().edit().putString(((gpd0) this).b, string).apply();
        }
        return (string.startsWith("{") && string.endsWith("}") && !((Boolean) epd0.f12645p.get()).booleanValue()) ? m24472s(string) : m24471r(string);
    }

    /* JADX INFO: renamed from: r */
    public final RememberUserInfo m24471r(String str) {
        try {
            RememberUserInfo rememberUserInfo = (RememberUserInfo) RememberUserInfo.PROTOBUF_ADAPTER.parse(Base64.decode(str, 0));
            try {
                String strZ = i95.z();
                if (!TextUtils.isEmpty(strZ)) {
                    rememberUserInfo.auth.accessToken = epd0.m14057o(rememberUserInfo.auth.accessToken, strZ.substring(0, 8));
                    return rememberUserInfo;
                }
            } catch (Exception e) {
                CrashHelper.d(e, 50);
            }
            return rememberUserInfo;
        } catch (IOException e2) {
            CrashHelper.c(e2);
            return null;
        } catch (IllegalArgumentException e3) {
            CrashHelper.c(e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final RememberUserInfo m24472s(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (RememberUserInfo) RememberUserInfo.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Pair<SharedPreferences.Editor, SharedPreferences.Editor> m24463g(RememberUserInfo rememberUserInfo) {
        RememberUserInfo rememberUserInfoClone = rememberUserInfo.clone();
        String str = rememberUserInfoClone.auth.accessToken;
        try {
            String strZ = i95.z();
            if (!TextUtils.isEmpty(strZ)) {
                rememberUserInfoClone.auth.accessToken = epd0.m14058p(str, strZ.substring(0, 8));
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        try {
            return new Pair<>(d().edit().putString(((gpd0) this).a, Base64.encodeToString(RememberUserInfo.PROTOBUF_ADAPTER.serialize(rememberUserInfoClone), 0)), e().edit().putString(((gpd0) this).b, Base64.encodeToString(RememberUserInfo.PROTOBUF_ADAPTER.serialize(rememberUserInfoClone), 0)));
        } catch (IOException e2) {
            CrashHelper.c(e2);
            return new Pair<>(d().edit().putString(((gpd0) this).a, ""), e().edit().putString(((gpd0) this).b, ""));
        }
    }
}
