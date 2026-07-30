package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public class epd0 extends cqd0<AuthData> {

    /* JADX INFO: renamed from: p */
    public static hpd0 f92644p = new hpd0("ever_show_radar_on_main", Boolean.FALSE);

    /* JADX INFO: renamed from: q */
    public static byte[] f92645q = {1, 2, 3, 4, 5, 6, 7, 8};

    public epd0(Context context, String str, boolean z, String str2) {
        super(context, str, null, z, str2);
    }

    /* JADX INFO: renamed from: o */
    public static String m117616o(String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 0);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f92645q);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArrDecode));
    }

    /* JADX INFO: renamed from: p */
    public static String m117617p(String str, String str2) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f92645q);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
    }

    @Override // p149l.cqd0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean mo108249h(@NonNull AuthData authData, AuthData authData2) {
        return authData.equals(authData2);
    }

    @Override // p149l.cqd0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AuthData mo108252k(AuthData authData, @NonNull AuthData authData2) {
        return authData2.mo223809clone();
    }

    @Override // p149l.gpd0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public AuthData mo117618f() {
        String string = m127349d().getString(this.f103783a, null);
        String string2 = m127350e().getString(this.f103784b, null);
        if (TextUtils.isEmpty(string) && !TextUtils.equals(string, string2)) {
            CrashHelper.m81296c(new RuntimeException("MMKV retrieveValue id=" + this.f103783a));
            m127349d().edit().putString(this.f103783a, string2).apply();
            string = string2;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (!TextUtils.equals(string, string2)) {
            m127350e().edit().putString(this.f103784b, string).apply();
        }
        return (string.startsWith("{") && string.endsWith("}") && !f92644p.get().booleanValue()) ? m117624s(string) : m117623r(string);
    }

    /* JADX INFO: renamed from: r */
    public final AuthData m117623r(String str) {
        try {
            du2.m113670a("[putong-common][account]", "retrieve str: " + str);
            AuthData authData = AuthData.PROTOBUF_ADAPTER.parse(Base64.decode(str, 0));
            String strSubstring = "";
            try {
                String strM135009z = i95.m135009z();
                if (!TextUtils.isEmpty(strM135009z)) {
                    strSubstring = strM135009z.substring(0, 8);
                    authData.accessToken = m117616o(authData.accessToken, strSubstring);
                }
            } catch (Error e) {
                CrashHelper.m81296c(new RuntimeException("ClientTracking class load failed in retrieve", e));
            } catch (BadPaddingException e2) {
                CrashHelper.m81297d(new Exception("t = " + authData.accessToken + ", d5 =" + strSubstring, e2), 50);
            } catch (Exception e3) {
                CrashHelper.m81296c(e3);
            }
            if (authData.accessToken == null || authData.expiresIn == Integer.MIN_VALUE || authData.tokenType == null || authData.userId == null) {
                return null;
            }
            return authData;
        } catch (IOException e4) {
            CrashHelper.m81296c(e4);
            return null;
        } catch (IllegalArgumentException e5) {
            CrashHelper.m81296c(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final AuthData m117624s(String str) {
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
                    authData.accessToken = m117627v(strArrSplit2[1]);
                } else if (strArrSplit2[0].contains("token_type") || strArrSplit2[0].contains("tokenType")) {
                    authData.tokenType = m117627v(strArrSplit2[1]);
                } else if (strArrSplit2[0].contains("expires_in") || strArrSplit2[0].contains("expiresIn")) {
                    try {
                        authData.expiresIn = m117626u(strArrSplit2[1]);
                    } catch (Exception e) {
                        CrashHelper.m81296c(new Exception("AccountApi retrieveValue:" + e.getMessage(), e));
                    }
                } else {
                    if (!strArrSplit2[0].contains("user_id") && !strArrSplit2[0].contains("userId")) {
                        return null;
                    }
                    authData.userId = m117627v(strArrSplit2[1]);
                }
            }
            if (authData.accessToken != null && authData.expiresIn != Integer.MIN_VALUE && authData.tokenType != null && authData.userId != null) {
                return authData;
            }
        }
        return null;
    }

    @Override // p149l.gpd0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo117619g(AuthData authData) {
        AuthData authDataMo223809clone = authData.mo223809clone();
        String str = authDataMo223809clone.accessToken;
        try {
            String strM135009z = i95.m135009z();
            if (!TextUtils.isEmpty(strM135009z)) {
                authDataMo223809clone.accessToken = m117617p(str, strM135009z.substring(0, 8));
            }
            du2.m113670a("[putong-common][account]", "save t: " + authDataMo223809clone.accessToken);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
        f92644p.put(Boolean.TRUE);
        try {
            return new Pair<>(m127349d().edit().putString(this.f103783a, Base64.encodeToString(AuthData.PROTOBUF_ADAPTER.serialize(authDataMo223809clone), 0)), m127350e().edit().putString(this.f103784b, Base64.encodeToString(AuthData.PROTOBUF_ADAPTER.serialize(authDataMo223809clone), 0)));
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return new Pair<>(m127349d().edit().putString(this.f103783a, ""), m127350e().edit().putString(this.f103784b, ""));
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m117626u(String str) {
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
    public final String m117627v(String str) {
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
