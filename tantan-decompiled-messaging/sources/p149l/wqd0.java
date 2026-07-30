package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class wqd0 extends cqd0<RememberUserInfo> {
    public wqd0(Context context, String str, boolean z, String str2) {
        super(context, str, null, z, str2);
    }

    @Override // p149l.cqd0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean mo108249h(@NonNull RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        return rememberUserInfo.equals(rememberUserInfo2);
    }

    @Override // p149l.cqd0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public RememberUserInfo mo108252k(RememberUserInfo rememberUserInfo, @NonNull RememberUserInfo rememberUserInfo2) {
        return rememberUserInfo2.mo223809clone();
    }

    /* JADX INFO: renamed from: o */
    public boolean m205062o(int i, String str, String str2, int i2, AuthData authData, String str3) {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.countryCode = i;
        rememberUserInfo.phoneNumber = str;
        rememberUserInfo.imgUrl = str2;
        rememberUserInfo.pwdLength = i2;
        rememberUserInfo.auth = authData;
        rememberUserInfo.name = str3;
        return m108253l(rememberUserInfo);
    }

    /* JADX INFO: renamed from: p */
    public boolean m205063p(String str, AuthData authData, String str2) {
        return m205062o(0, "", str, 0, authData, str2);
    }

    @Override // p149l.gpd0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public RememberUserInfo mo117618f() {
        String string = m127349d().getString(this.f103783a, null);
        String string2 = m127350e().getString(this.f103784b, null);
        if (TextUtils.isEmpty(string) && !TextUtils.equals(string, string2)) {
            m127349d().edit().putString(this.f103783a, string2).apply();
            string = string2;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (!TextUtils.equals(string, string2)) {
            m127350e().edit().putString(this.f103784b, string).apply();
        }
        return (string.startsWith("{") && string.endsWith("}") && !epd0.f92644p.get().booleanValue()) ? m205066s(string) : m205065r(string);
    }

    /* JADX INFO: renamed from: r */
    public final RememberUserInfo m205065r(String str) {
        try {
            RememberUserInfo rememberUserInfo = RememberUserInfo.PROTOBUF_ADAPTER.parse(Base64.decode(str, 0));
            try {
                String strM135009z = i95.m135009z();
                if (!TextUtils.isEmpty(strM135009z)) {
                    rememberUserInfo.auth.accessToken = epd0.m117616o(rememberUserInfo.auth.accessToken, strM135009z.substring(0, 8));
                    return rememberUserInfo;
                }
            } catch (Exception e) {
                CrashHelper.m81297d(e, 50);
            }
            return rememberUserInfo;
        } catch (IOException e2) {
            CrashHelper.m81296c(e2);
            return null;
        } catch (IllegalArgumentException e3) {
            CrashHelper.m81296c(e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final RememberUserInfo m205066s(String str) {
        if (str == null) {
            return null;
        }
        try {
            return RememberUserInfo.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    @Override // p149l.gpd0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo117619g(RememberUserInfo rememberUserInfo) {
        RememberUserInfo rememberUserInfoMo223809clone = rememberUserInfo.mo223809clone();
        String str = rememberUserInfoMo223809clone.auth.accessToken;
        try {
            String strM135009z = i95.m135009z();
            if (!TextUtils.isEmpty(strM135009z)) {
                rememberUserInfoMo223809clone.auth.accessToken = epd0.m117617p(str, strM135009z.substring(0, 8));
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        try {
            return new Pair<>(m127349d().edit().putString(this.f103783a, Base64.encodeToString(RememberUserInfo.PROTOBUF_ADAPTER.serialize(rememberUserInfoMo223809clone), 0)), m127350e().edit().putString(this.f103784b, Base64.encodeToString(RememberUserInfo.PROTOBUF_ADAPTER.serialize(rememberUserInfoMo223809clone), 0)));
        } catch (IOException e2) {
            CrashHelper.m81296c(e2);
            return new Pair<>(m127349d().edit().putString(this.f103783a, ""), m127350e().edit().putString(this.f103784b, ""));
        }
    }
}
