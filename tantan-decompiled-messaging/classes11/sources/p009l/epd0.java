package p009l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.data.AuthData;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l.cqd0;
import l.du2;
import l.gpd0;
import l.hpd0;
import l.i95;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class epd0 extends cqd0<AuthData> {

    /* JADX INFO: renamed from: p */
    public static hpd0 f12645p = new hpd0("ever_show_radar_on_main", Boolean.FALSE);

    /* JADX INFO: renamed from: q */
    public static byte[] f12646q = {1, 2, 3, 4, 5, 6, 7, 8};

    public epd0(Context context, String str, boolean z, String str2) {
        super(context, str, (Object) null, z, str2);
    }

    /* JADX INFO: renamed from: o */
    public static String m14057o(String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 0);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f12646q);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArrDecode));
    }

    /* JADX INFO: renamed from: p */
    public static String m14058p(String str, String str2) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f12646q);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean m14061h(@NonNull AuthData authData, AuthData authData2) {
        return authData.equals(authData2);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AuthData m14062k(AuthData authData, @NonNull AuthData authData2) {
        return authData2.clone();
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public AuthData m14059f() {
        String string = d().getString(((gpd0) this).a, null);
        String string2 = e().getString(((gpd0) this).b, null);
        if (TextUtils.isEmpty(string) && !TextUtils.equals(string, string2)) {
            CrashHelper.c(new RuntimeException("MMKV retrieveValue id=" + ((gpd0) this).a));
            d().edit().putString(((gpd0) this).a, string2).apply();
            string = string2;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (!TextUtils.equals(string, string2)) {
            e().edit().putString(((gpd0) this).b, string).apply();
        }
        return (string.startsWith("{") && string.endsWith("}") && !((Boolean) f12645p.get()).booleanValue()) ? m14067s(string) : m14066r(string);
    }

    /* JADX INFO: renamed from: r */
    public final AuthData m14066r(String str) {
        try {
            du2.a("[putong-common][account]", "retrieve str: " + str);
            AuthData authData = (AuthData) AuthData.PROTOBUF_ADAPTER.parse(Base64.decode(str, 0));
            String strSubstring = "";
            try {
                String strZ = i95.z();
                if (!TextUtils.isEmpty(strZ)) {
                    strSubstring = strZ.substring(0, 8);
                    authData.accessToken = m14057o(authData.accessToken, strSubstring);
                }
            } catch (Error e) {
                CrashHelper.c(new RuntimeException("ClientTracking class load failed in retrieve", e));
            } catch (BadPaddingException e2) {
                CrashHelper.d(new Exception("t = " + authData.accessToken + ", d5 =" + strSubstring, e2), 50);
            } catch (Exception e3) {
                CrashHelper.c(e3);
            }
            if (authData.accessToken == null || authData.expiresIn == Integer.MIN_VALUE || authData.tokenType == null || authData.userId == null) {
                return null;
            }
            return authData;
        } catch (IOException e4) {
            CrashHelper.c(e4);
            return null;
        } catch (IllegalArgumentException e5) {
            CrashHelper.c(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final AuthData m14067s(String str) {
        if (str != null) {
            AuthData authData = new AuthData();
            authData.expiresIn = Integer.MIN_VALUE;
            String[] strArrSplit = str.substring(0, str.lastIndexOf("}")).split(",");
            if (strArrSplit.length != 4) {
                return null;
            }
            for (int i = 0; i < 4; i++) {
                String[] strArrSplit2 = strArrSplit[i].split(":");
                if (strArrSplit2.length != 2) {
                    return null;
                }
                if (strArrSplit2[0].contains(Oauth2AccessToken.KEY_ACCESS_TOKEN) || strArrSplit2[0].contains("accessToken")) {
                    authData.accessToken = m14070v(strArrSplit2[1]);
                } else if (strArrSplit2[0].contains("token_type") || strArrSplit2[0].contains("tokenType")) {
                    authData.tokenType = m14070v(strArrSplit2[1]);
                } else if (strArrSplit2[0].contains(Oauth2AccessToken.KEY_EXPIRES_IN) || strArrSplit2[0].contains("expiresIn")) {
                    try {
                        authData.expiresIn = m14069u(strArrSplit2[1]);
                    } catch (Exception e) {
                        CrashHelper.c(new Exception("AccountApi retrieveValue:" + e.getMessage(), e));
                    }
                } else {
                    if (!strArrSplit2[0].contains("user_id") && !strArrSplit2[0].contains("userId")) {
                        return null;
                    }
                    authData.userId = m14070v(strArrSplit2[1]);
                }
            }
            if (authData.accessToken != null && authData.expiresIn != Integer.MIN_VALUE && authData.tokenType != null && authData.userId != null) {
                return authData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Pair<SharedPreferences.Editor, SharedPreferences.Editor> m14060g(AuthData authData) {
        AuthData authDataClone = authData.clone();
        String str = authDataClone.accessToken;
        try {
            String strZ = i95.z();
            if (!TextUtils.isEmpty(strZ)) {
                authDataClone.accessToken = m14058p(str, strZ.substring(0, 8));
            }
            du2.a("[putong-common][account]", "save t: " + authDataClone.accessToken);
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
        f12645p.put(Boolean.TRUE);
        try {
            return new Pair<>(d().edit().putString(((gpd0) this).a, Base64.encodeToString(AuthData.PROTOBUF_ADAPTER.serialize(authDataClone), 0)), e().edit().putString(((gpd0) this).b, Base64.encodeToString(AuthData.PROTOBUF_ADAPTER.serialize(authDataClone), 0)));
        } catch (IOException e) {
            CrashHelper.c(e);
            return new Pair<>(d().edit().putString(((gpd0) this).a, ""), e().edit().putString(((gpd0) this).b, ""));
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m14069u(String str) {
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
    public final String m14070v(String str) {
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
