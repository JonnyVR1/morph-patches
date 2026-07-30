package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class gxd0 extends eyd0<AuthData> {

    /* JADX INFO: renamed from: p */
    public static jxd0 f106931p = new jxd0("ever_show_radar_on_main", Boolean.FALSE);

    /* JADX INFO: renamed from: q */
    public static byte[] f106932q = {1, 2, 3, 4, 5, 6, 7, 8};

    public gxd0(Context context, String str, boolean z, String str2) {
        super(context, str, null, z, str2);
    }

    /* JADX INFO: renamed from: o */
    public static String m132820o(String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 0);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f106932q);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArrDecode));
    }

    /* JADX INFO: renamed from: p */
    public static String m132821p(String str, String str2) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f106932q);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
    }

    @Override // p153l.eyd0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean mo123193h(@NonNull AuthData authData, AuthData authData2) {
        return authData.equals(authData2);
    }

    @Override // p153l.eyd0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AuthData mo123196k(AuthData authData, @NonNull AuthData authData2) {
        return authData2.mo225055clone();
    }

    @Override // p153l.ixd0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public AuthData mo107144f() {
        String string = m142511d().getString(this.f117382a, null);
        String string2 = m142512e().getString(this.f117383b, null);
        if (TextUtils.isEmpty(string) && !TextUtils.equals(string, string2)) {
            CrashHelper.m82479c(new RuntimeException("MMKV retrieveValue id=" + this.f117382a));
            m142511d().edit().putString(this.f117382a, string2).apply();
            string = string2;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (!TextUtils.equals(string, string2)) {
            m142512e().edit().putString(this.f117383b, string).apply();
        }
        return (string.startsWith("{") && string.endsWith("}") && !f106931p.get().booleanValue()) ? m132826s(string) : m132825r(string);
    }

    /* JADX INFO: renamed from: r */
    public final AuthData m132825r(String str) {
        try {
            tu2.m192703a("[putong-common][account]", "retrieve str: " + str);
            AuthData authData = AuthData.PROTOBUF_ADAPTER.parse(Base64.decode(str, 0));
            String strSubstring = "";
            try {
                String strM143994z = ja5.m143994z();
                if (!TextUtils.isEmpty(strM143994z)) {
                    strSubstring = strM143994z.substring(0, 8);
                    authData.accessToken = m132820o(authData.accessToken, strSubstring);
                }
            } catch (Error e) {
                CrashHelper.m82479c(new RuntimeException("ClientTracking class load failed in retrieve", e));
            } catch (BadPaddingException e2) {
                CrashHelper.m82480d(new Exception("t = " + authData.accessToken + ", d5 =" + strSubstring, e2), 50);
            } catch (Exception e3) {
                CrashHelper.m82479c(e3);
            }
            if (authData.accessToken == null || authData.expiresIn == Integer.MIN_VALUE || authData.tokenType == null || authData.userId == null) {
                return null;
            }
            return authData;
        } catch (IOException e4) {
            CrashHelper.m82479c(e4);
            return null;
        } catch (IllegalArgumentException e5) {
            CrashHelper.m82479c(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final AuthData m132826s(String str) {
        if (str != null) {
            AuthData authData = new AuthData();
            authData.expiresIn = Integer.MIN_VALUE;
            String[] strArrSplit = str.substring(0, str.lastIndexOf("}")).split(Constants.SEPARATOR_COMMA);
            if (strArrSplit.length != 4) {
                return null;
            }
            for (int i = 0; i < 4; i++) {
                String[] strArrSplit2 = strArrSplit[i].split(":");
                if (strArrSplit2.length != 2) {
                    return null;
                }
                if (strArrSplit2[0].contains("access_token") || strArrSplit2[0].contains("accessToken")) {
                    authData.accessToken = m132829v(strArrSplit2[1]);
                } else if (strArrSplit2[0].contains("token_type") || strArrSplit2[0].contains("tokenType")) {
                    authData.tokenType = m132829v(strArrSplit2[1]);
                } else if (strArrSplit2[0].contains("expires_in") || strArrSplit2[0].contains("expiresIn")) {
                    try {
                        authData.expiresIn = m132828u(strArrSplit2[1]);
                    } catch (Exception e) {
                        CrashHelper.m82479c(new Exception("AccountApi retrieveValue:" + e.getMessage(), e));
                    }
                } else {
                    if (!strArrSplit2[0].contains("user_id") && !strArrSplit2[0].contains("userId")) {
                        return null;
                    }
                    authData.userId = m132829v(strArrSplit2[1]);
                }
            }
            if (authData.accessToken != null && authData.expiresIn != Integer.MIN_VALUE && authData.tokenType != null && authData.userId != null) {
                return authData;
            }
        }
        return null;
    }

    @Override // p153l.ixd0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo107145g(AuthData authData) {
        AuthData authDataMo225055clone = authData.mo225055clone();
        String str = authDataMo225055clone.accessToken;
        try {
            String strM143994z = ja5.m143994z();
            if (!TextUtils.isEmpty(strM143994z)) {
                authDataMo225055clone.accessToken = m132821p(str, strM143994z.substring(0, 8));
            }
            tu2.m192703a("[putong-common][account]", "save t: " + authDataMo225055clone.accessToken);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
        f106931p.put(Boolean.TRUE);
        try {
            return new Pair<>(m142511d().edit().putString(this.f117382a, Base64.encodeToString(AuthData.PROTOBUF_ADAPTER.serialize(authDataMo225055clone), 0)), m142512e().edit().putString(this.f117383b, Base64.encodeToString(AuthData.PROTOBUF_ADAPTER.serialize(authDataMo225055clone), 0)));
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return new Pair<>(m142511d().edit().putString(this.f117382a, ""), m142512e().edit().putString(this.f117383b, ""));
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m132828u(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        while (charArray[i] == ' ') {
            i++;
        }
        int length = charArray.length;
        while (charArray[length - 1] == ' ') {
            length--;
        }
        return Integer.parseInt(new String(charArray, i, length - i));
    }

    /* JADX INFO: renamed from: v */
    public final String m132829v(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        while (true) {
            char c = charArray[i];
            if (c != ' ' && c != '\"') {
                break;
            }
            i++;
        }
        int length = charArray.length;
        while (true) {
            char c2 = charArray[length - 1];
            if (c2 != ' ' && c2 != '\"') {
                return new String(charArray, i, length - i);
            }
            length--;
        }
    }
}
