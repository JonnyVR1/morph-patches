package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class yyd0 extends eyd0<RememberUserInfo> {
    public yyd0(Context context, String str, boolean z, String str2) {
        super(context, str, null, z, str2);
    }

    @Override // p153l.eyd0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean mo123193h(@NonNull RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        return rememberUserInfo.equals(rememberUserInfo2);
    }

    @Override // p153l.eyd0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public RememberUserInfo mo123196k(RememberUserInfo rememberUserInfo, @NonNull RememberUserInfo rememberUserInfo2) {
        return rememberUserInfo2.mo225055clone();
    }

    /* JADX INFO: renamed from: o */
    public boolean m217963o(int i, String str, String str2, int i2, AuthData authData, String str3) {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.countryCode = i;
        rememberUserInfo.phoneNumber = str;
        rememberUserInfo.imgUrl = str2;
        rememberUserInfo.pwdLength = i2;
        rememberUserInfo.auth = authData;
        rememberUserInfo.name = str3;
        return m123197l(rememberUserInfo);
    }

    /* JADX INFO: renamed from: p */
    public boolean m217964p(String str, AuthData authData, String str2) {
        return m217963o(0, "", str, 0, authData, str2);
    }

    @Override // p153l.ixd0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public RememberUserInfo mo107144f() {
        String string = m142511d().getString(this.f117382a, null);
        String string2 = m142512e().getString(this.f117383b, null);
        if (TextUtils.isEmpty(string) && !TextUtils.equals(string, string2)) {
            m142511d().edit().putString(this.f117382a, string2).apply();
            string = string2;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (!TextUtils.equals(string, string2)) {
            m142512e().edit().putString(this.f117383b, string).apply();
        }
        return (string.startsWith("{") && string.endsWith("}") && !gxd0.f106931p.get().booleanValue()) ? m217967s(string) : m217966r(string);
    }

    /* JADX INFO: renamed from: r */
    public final RememberUserInfo m217966r(String str) {
        try {
            RememberUserInfo rememberUserInfo = RememberUserInfo.PROTOBUF_ADAPTER.parse(Base64.decode(str, 0));
            try {
                String strM143994z = ja5.m143994z();
                if (!TextUtils.isEmpty(strM143994z)) {
                    rememberUserInfo.auth.accessToken = gxd0.m132820o(rememberUserInfo.auth.accessToken, strM143994z.substring(0, 8));
                    return rememberUserInfo;
                }
            } catch (Exception e) {
                CrashHelper.m82480d(e, 50);
            }
            return rememberUserInfo;
        } catch (IOException e2) {
            CrashHelper.m82479c(e2);
            return null;
        } catch (IllegalArgumentException e3) {
            CrashHelper.m82479c(e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final RememberUserInfo m217967s(String str) {
        if (str == null) {
            return null;
        }
        try {
            return RememberUserInfo.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    @Override // p153l.ixd0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo107145g(RememberUserInfo rememberUserInfo) {
        RememberUserInfo rememberUserInfoMo225055clone = rememberUserInfo.mo225055clone();
        String str = rememberUserInfoMo225055clone.auth.accessToken;
        try {
            String strM143994z = ja5.m143994z();
            if (!TextUtils.isEmpty(strM143994z)) {
                rememberUserInfoMo225055clone.auth.accessToken = gxd0.m132821p(str, strM143994z.substring(0, 8));
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        try {
            return new Pair<>(m142511d().edit().putString(this.f117382a, Base64.encodeToString(RememberUserInfo.PROTOBUF_ADAPTER.serialize(rememberUserInfoMo225055clone), 0)), m142512e().edit().putString(this.f117383b, Base64.encodeToString(RememberUserInfo.PROTOBUF_ADAPTER.serialize(rememberUserInfoMo225055clone), 0)));
        } catch (IOException e2) {
            CrashHelper.m82479c(e2);
            return new Pair<>(m142511d().edit().putString(this.f117382a, ""), m142512e().edit().putString(this.f117383b, ""));
        }
    }
}
