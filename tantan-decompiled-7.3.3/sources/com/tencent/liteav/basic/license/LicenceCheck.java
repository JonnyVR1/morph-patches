package com.tencent.liteav.basic.license;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.heytap.mcssdk.mode.Message;
import com.tencent.liteav.basic.datareport.C14189a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14212c;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.open.SocialOperation;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LicenceCheck {

    /* JADX INFO: renamed from: d */
    private static LicenceCheck f59262d;

    /* JADX INFO: renamed from: a */
    private Context f59263a;

    /* JADX INFO: renamed from: b */
    private String f59264b = "YTFaceSDK.licence";

    /* JADX INFO: renamed from: c */
    private String f59265c = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq4teqkW/TUruU89ElNVd\nKrpSL+HCITruyb6BS9mW6M4mqmxDhazDmQgMKNfsA0d2kxFucCsXTyesFNajaisk\nrAzVJpNGO75bQFap4jYzJYskIuas6fgIS7zSmGXgRcp6i0ZBH3pkVCXcgfLfsVCO\n+sN01jFhFgOC0LY2f1pJ+3jqktAlMIxy8Q9t7XwwL5/n8/Sledp7TwuRdnl2OPl3\nycCTRkXtOIoRNB9vgd9XooTKiEdCXC7W9ryvtwCiAB82vEfHWXXgzhsPC13URuFy\n1JqbWJtTCCcfsCVxuBplhVJAQ7JsF5SMntdJDkp7rJLhprgsaim2CRjcVseNmw97\nbwIDAQAB";

    /* JADX INFO: renamed from: e */
    private C14192a f59266e = new C14192a("TXUgcSDK.licence");

    /* JADX INFO: renamed from: f */
    private C14192a f59267f = new C14192a("TXLiveSDK.licence");

    /* JADX INFO: renamed from: com.tencent.liteav.basic.license.LicenceCheck$a */
    public class C14192a {

        /* JADX INFO: renamed from: a */
        String f59270a;

        /* JADX INFO: renamed from: b */
        String f59271b;

        /* JADX INFO: renamed from: c */
        String f59272c = "";

        /* JADX INFO: renamed from: d */
        String f59273d = "";

        /* JADX INFO: renamed from: e */
        String f59274e = "";

        /* JADX INFO: renamed from: f */
        boolean f59275f = false;

        /* JADX INFO: renamed from: g */
        boolean f59276g = false;

        /* JADX INFO: renamed from: h */
        int f59277h = -1;

        /* JADX INFO: renamed from: i */
        String f59278i = "";

        public C14192a(String str) {
            this.f59270a = str;
            this.f59271b = str + ".tmp";
        }
    }

    private LicenceCheck() {
    }

    /* JADX INFO: renamed from: a */
    private int m84106a(C14192a c14192a, String str, String str2) throws Throwable {
        boolean zM84114a;
        try {
            zM84114a = m84114a(Base64.decode(str, 0), Base64.decode(str2, 0), m84135a(this.f59265c));
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.m84149e("LicenceCheck", "verifyLicence, exception is : " + e);
            zM84114a = false;
        }
        if (!zM84114a) {
            m84110a(-2);
            TXCLog.m84149e("LicenceCheck", "verifyLicence, signature not pass!");
            return -2;
        }
        String strM84122c = m84122c(c14192a, str);
        if (TextUtils.isEmpty(strM84122c)) {
            m84110a(-3);
            TXCLog.m84149e("LicenceCheck", "verifyLicence, decodeValue is empty!");
            return -3;
        }
        c14192a.f59278i = strM84122c;
        try {
            JSONObject jSONObject = new JSONObject(strM84122c);
            String string = jSONObject.getString("pituLicense");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("appData");
            if (jSONArrayOptJSONArray == null) {
                TXCLog.m84149e("LicenceCheck", "verifyLicence, appDataArray is null!");
                m84110a(-1);
                return -1;
            }
            boolean z = false;
            boolean z2 = false;
            boolean zM84113a = false;
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                String strOptString = jSONObject2.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                TXCLog.m84152i("LicenceCheck", "verifyLicence, packageName:" + strOptString);
                if (!strOptString.equals(this.f59263a.getPackageName())) {
                    TXCLog.m84149e("LicenceCheck", "verifyLicence, packageName not match!");
                } else if (!m84126d(jSONObject2.optString(Message.END_DATE))) {
                    zM84113a = m84113a(c14192a, jSONObject2, string);
                    if (zM84113a) {
                        z = true;
                        z2 = true;
                        zM84113a = true;
                        break;
                    }
                    z = true;
                    z2 = true;
                } else {
                    z = true;
                }
            }
            if (!z) {
                m84110a(-4);
                return -4;
            }
            if (!z2) {
                m84110a(-5);
                return -5;
            }
            if (!zM84113a) {
                m84110a(-11);
                return -11;
            }
            if (!TextUtils.isEmpty(string)) {
                try {
                    byte[] bArrDecode = Base64.decode(string, 0);
                    File externalFilesDir = this.f59263a.getExternalFilesDir(null);
                    if (externalFilesDir == null) {
                        return -10;
                    }
                    File file = new File(externalFilesDir.getAbsolutePath() + File.separator + this.f59264b);
                    C14212c.m84205a(file.getAbsolutePath(), bArrDecode);
                    TXCCommonUtil.setPituLicencePath(file.getAbsolutePath());
                } catch (Exception e2) {
                    TXCLog.m84149e("LicenceCheck", "decode pitu license error:" + e2);
                }
            }
            TXCDRApi.txReportDAU(this.f59263a, C14189a.f59150aI);
            return 0;
        } catch (JSONException e3) {
            e3.printStackTrace();
            TXCLog.m84149e("LicenceCheck", "verifyLicence, json format error ! exception = " + e3);
            m84110a(-1);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m84117b(C14192a c14192a, String str) {
        Context context = this.f59263a;
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("LicenceCheck.lastModified", 0).edit();
        editorEdit.putString(c14192a.f59270a + ".lastModified", str);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: c */
    private int m84120c(C14192a c14192a) throws Throwable {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            TXCLog.m84149e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
            return -10;
        }
        File externalFilesDir = this.f59263a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m84149e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
            return -10;
        }
        String str = externalFilesDir.getAbsolutePath() + File.separator + c14192a.f59270a;
        if (!m84119b(str)) {
            return -7;
        }
        String strM84211b = C14212c.m84211b(str);
        if (!TextUtils.isEmpty(strM84211b)) {
            return m84133a(c14192a, strM84211b);
        }
        TXCLog.m84149e("LicenceCheck", "checkSdcardLicence, licenceSdcardStr is empty");
        return -8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public int m84125d(C14192a c14192a, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(RemoteConfigConstants.RequestFieldKey.APP_ID);
            String string = jSONObject.getString("encryptedLicense");
            String string2 = jSONObject.getString(SocialOperation.GAME_SIGNATURE);
            TXCLog.m84152i("LicenceCheck", "appid:" + iOptInt);
            TXCLog.m84152i("LicenceCheck", "encryptedLicense:" + string);
            TXCLog.m84152i("LicenceCheck", "signature:" + string2);
            return m84106a(c14192a, string, string2);
        } catch (JSONException e) {
            e.printStackTrace();
            m84110a(-1);
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    private int m84127e(C14192a c14192a, String str) {
        String strM84128e = m84128e(str);
        if (TextUtils.isEmpty(strM84128e)) {
            TXCLog.m84149e("LicenceCheck", "verifyOldLicence, decryptStr is empty");
            return -3;
        }
        c14192a.f59278i = strM84128e;
        try {
            JSONObject jSONObject = new JSONObject(strM84128e);
            if (!jSONObject.getString("packagename").equals(m84108a(this.f59263a))) {
                TXCLog.m84149e("LicenceCheck", "packagename not match!");
                m84110a(-4);
                return -4;
            }
            if (m84126d(jSONObject.getString("enddate"))) {
                return -5;
            }
            c14192a.f59277h = 5;
            TXCDRApi.txReportDAU(this.f59263a, C14189a.f59150aI);
            return 0;
        } catch (JSONException e) {
            e.printStackTrace();
            TXCLog.m84149e("LicenceCheck", "verifyOldLicence, json format error !");
            m84110a(-1);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m84130f(C14192a c14192a) {
        File externalFilesDir = this.f59263a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m84152i("LicenceCheck", "saveTempLocal sdcardDir is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(externalFilesDir.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(c14192a.f59270a);
        File file = new File(sb.toString());
        if (file.exists()) {
            TXCLog.m84152i("LicenceCheck", "delete dst file:" + file.delete());
        }
        File file2 = new File(c14192a.f59272c + str + c14192a.f59271b);
        if (file2.exists()) {
            TXCLog.m84152i("LicenceCheck", "rename file:" + file2.renameTo(file));
        }
        c14192a.f59276g = true;
    }

    /* JADX INFO: renamed from: g */
    private int m84131g(C14192a c14192a) {
        return c14192a.f59277h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public String m84132h(C14192a c14192a) {
        return C14212c.m84211b(new File(c14192a.f59272c + File.separator + c14192a.f59271b).getAbsolutePath());
    }

    private native byte[] nativeIvParameterSpec(byte[] bArr);

    /* JADX INFO: renamed from: b */
    private String m84116b(C14192a c14192a) {
        Context context = this.f59263a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("LicenceCheck.lastModified", 0).getString(c14192a.f59270a + ".lastModified", null);
    }

    /* JADX INFO: renamed from: b */
    private boolean m84119b(String str) {
        return C14212c.m84209a(str);
    }

    /* JADX INFO: renamed from: b */
    public int m84138b() {
        return m84131g(this.f59267f);
    }

    /* JADX INFO: renamed from: d */
    private int m84124d(C14192a c14192a) {
        if (!m84129e(c14192a)) {
            return -6;
        }
        String strM84210b = C14212c.m84210b(this.f59263a, c14192a.f59270a);
        if (TextUtils.isEmpty(strM84210b)) {
            TXCLog.m84149e("LicenceCheck", "checkAssetLicence, licenceSdcardStr is empty");
            return -8;
        }
        return m84133a(c14192a, strM84210b);
    }

    /* JADX INFO: renamed from: c */
    private boolean m84123c() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            TXCLog.m84149e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
            return false;
        }
        if (this.f59263a.getExternalFilesDir(null) != null) {
            return true;
        }
        TXCLog.m84149e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
        return false;
    }

    /* JADX INFO: renamed from: d */
    private boolean m84126d(String str) {
        long jM84121c = m84121c(str);
        if (jM84121c < 0) {
            TXCLog.m84149e("LicenceCheck", "checkEndDate, end date millis < 0!");
            return true;
        }
        if (jM84121c >= System.currentTimeMillis()) {
            return false;
        }
        TXCLog.m84149e("LicenceCheck", "checkEndDate, end date expire!");
        return true;
    }

    /* JADX INFO: renamed from: e */
    private boolean m84129e(C14192a c14192a) {
        return C14212c.m84208a(this.f59263a, c14192a.f59270a);
    }

    /* JADX INFO: renamed from: e */
    private String m84128e(String str) {
        try {
            return new String(C14200h.m84146b(Base64.decode(str, 0), Base64.decode("MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKfMXaF6wx9lev2U\nIzkk6ydI2sdaSQAD2ZvDBLq+5Fm6nGwSSWawl03D4vHcWIUa3wnz6f19/y8wzrj4\nnTfcEnT94SPdB6GhGsqPwbwRp9MHAqd/2gWZxSb005il2yiOZafk6X4NGKCn2tGd\nyNaCF+m9rLykuLdZHB0Z53ivgseNAgMBAAECgYAvXI2pAH+Goxwd6uwuOu9svTGT\nRzaHnI6VWmxBUZQeh3+TOW4iYAG03291GN6bY0RFCOWouSGH7lzK9NFbbPCAQ/hx\ncO48PqioHoq7K8sqzd3XaYBv39HrRnM8JvZsqv0PLJwX/LGm2y/MRaKAC6bcHtse\npgh+NNmUxXNRcTMRAQJBANezmenBcR8HTcY5YaEk3SQRzOo+QhIXuuD4T/FESpVJ\nmVQGxJjLsEBua1j38WG2QuepE5JiVbkQ0jQSvhUiZK0CQQDHJa+vWu6l72lQAvIx\nwmRISorvLb/tnu5bH0Ele42oX+w4p/tm03awdVjhVANnpDjYS2H6EzrF/pfis7k9\nV2phAkB4E4gz47bYYhV+qsTZkw70HGCpab0YG1OyFylRkwW983nCl/3rXUChrZZe\nsbATCAZYtfuqOsmju2R5DpH4a+wFAkBmHlcWbmSNxlSUaM5U4b+WqlLQDv+qE6Na\nKo63b8HWI0n4S3tI4QqttZ7b/L66OKXFk/Ir0AyFVuX/o/VLFTZBAkAdSTEkGwE5\nGQmhxu95sKxmdlUY6Q0Gwwpi06C1BPBrj2VkGXpBP0twhPVAq/3xVjjb+2KXVTUW\nIpRLc06M4vhv", 0)));
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.m84149e("LicenceCheck", "decryptLicenceStr, exception is : " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m84121c(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime();
        } catch (Exception e) {
            TXCLog.m84150e("LicenceCheck", "time str to millsecond failed.", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: c */
    private String m84122c(C14192a c14192a, String str) {
        if (TextUtils.isEmpty(c14192a.f59273d)) {
            TXCLog.m84149e("LicenceCheck", "decodeLicence, mKey is empty!!!");
            return "";
        }
        byte[] bytes = c14192a.f59273d.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(nativeIvParameterSpec(bytes));
        byte[] bArrDecode = Base64.decode(str, 0);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            String str2 = new String(cipher.doFinal(bArrDecode), "UTF-8");
            TXCLog.m84152i("LicenceCheck", "decodeLicence : ".concat(str2));
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static LicenceCheck m84107a() {
        if (f59262d == null) {
            f59262d = new LicenceCheck();
        }
        return f59262d;
    }

    /* JADX INFO: renamed from: a */
    public void m84136a(Context context, String str, String str2) {
        m84111a(this.f59267f, context, str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m84111a(C14192a c14192a, Context context, String str, String str2) {
        if (context != null) {
            this.f59263a = context.getApplicationContext();
            TXCCommonUtil.setAppContext(context);
        }
        c14192a.f59273d = str2;
        c14192a.f59274e = str;
        if (this.f59263a == null || !m84123c()) {
            return;
        }
        File externalFilesDir = this.f59263a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            c14192a.f59272c = externalFilesDir.getAbsolutePath();
        }
        if (!m84119b(c14192a.f59272c + File.separator + c14192a.f59270a)) {
            TXCLog.m84152i("LicenceCheck", "setLicense, sdcard file not exist, to download");
            m84117b(c14192a, "");
        }
        m84137a(c14192a);
    }

    /* JADX INFO: renamed from: a */
    public void m84137a(final C14192a c14192a) {
        if (TextUtils.isEmpty(c14192a.f59274e)) {
            TXCLog.m84149e("LicenceCheck", "downloadLicense, mUrl is empty, ignore!");
            return;
        }
        if (c14192a.f59275f) {
            TXCLog.m84152i("LicenceCheck", "downloadLicense, in downloading, ignore");
            return;
        }
        InterfaceC14194b interfaceC14194b = new InterfaceC14194b() { // from class: com.tencent.liteav.basic.license.LicenceCheck.1
            @Override // com.tencent.liteav.basic.license.InterfaceC14194b
            /* JADX INFO: renamed from: a */
            public void mo84142a(File file, String str) {
                if (file == null) {
                    TXCLog.m84152i("LicenceCheck", "downloadLicense, license not modified");
                    return;
                }
                LicenceCheck.this.m84117b(c14192a, str);
                TXCLog.m84152i("LicenceCheck", "downloadLicense, onSaveSuccess");
                String strM84132h = LicenceCheck.this.m84132h(c14192a);
                if (TextUtils.isEmpty(strM84132h)) {
                    TXCLog.m84149e("LicenceCheck", "downloadLicense, readDownloadTempLicence is empty!");
                    c14192a.f59275f = false;
                } else if (LicenceCheck.this.m84125d(c14192a, strM84132h) == 0) {
                    LicenceCheck.this.m84130f(c14192a);
                }
            }

            @Override // com.tencent.liteav.basic.license.InterfaceC14194b
            /* JADX INFO: renamed from: a */
            public void mo84141a(File file, Exception exc) {
                TXCLog.m84152i("LicenceCheck", "downloadLicense, onSaveFailed");
            }

            @Override // com.tencent.liteav.basic.license.InterfaceC14194b
            /* JADX INFO: renamed from: a */
            public void mo84140a(int i) {
                TXCLog.m84152i("LicenceCheck", "downloadLicense, onProgressUpdate");
            }

            @Override // com.tencent.liteav.basic.license.InterfaceC14194b
            /* JADX INFO: renamed from: a */
            public void mo84139a() {
                TXCLog.m84152i("LicenceCheck", "downloadLicense, onProcessEnd");
                c14192a.f59275f = false;
            }
        };
        Context context = this.f59263a;
        if (context == null) {
            TXCLog.m84149e("LicenceCheck", "context is NULL !!! Please set context in method:setLicense(Context context, String url, String key)");
            return;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m84149e("LicenceCheck", "Please check permission WRITE_EXTERNAL_STORAGE permission has been set !!!");
            return;
        }
        String strM84116b = m84116b(c14192a);
        c14192a.f59272c = externalFilesDir.getAbsolutePath();
        new Thread(new C14195c(this.f59263a, c14192a.f59274e, c14192a.f59272c, c14192a.f59271b, interfaceC14194b, false, strM84116b)).start();
        c14192a.f59275f = true;
    }

    /* JADX INFO: renamed from: a */
    public int m84134a(C14198f c14198f, Context context) {
        return m84105a(this.f59267f, c14198f, context);
    }

    /* JADX INFO: renamed from: a */
    private int m84105a(C14192a c14192a, C14198f c14198f, Context context) throws Throwable {
        int iM84104a = m84104a(c14192a, context);
        if (iM84104a != 0) {
            m84137a(c14192a);
        }
        if (c14198f != null) {
            c14198f.f59290a = c14192a.f59278i;
        }
        return iM84104a;
    }

    /* JADX INFO: renamed from: a */
    private int m84104a(C14192a c14192a, Context context) throws Throwable {
        if (c14192a.f59276g) {
            return 0;
        }
        if (this.f59263a == null) {
            this.f59263a = context;
        }
        if (m84124d(c14192a) == 0) {
            c14192a.f59276g = true;
            return 0;
        }
        int iM84120c = m84120c(c14192a);
        if (iM84120c != 0) {
            return iM84120c;
        }
        c14192a.f59276g = true;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public int m84133a(C14192a c14192a, String str) {
        try {
            new JSONObject(str);
            return m84125d(c14192a, str);
        } catch (JSONException unused) {
            if (c14192a == this.f59267f) {
                return -1;
            }
            return m84127e(c14192a, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public PublicKey m84135a(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    /* JADX INFO: renamed from: a */
    private boolean m84113a(C14192a c14192a, JSONObject jSONObject, String str) {
        int iOptInt = jSONObject.optInt("feature");
        boolean z = true;
        if (c14192a == this.f59267f) {
            int i = (iOptInt >> 4) & 15;
            if (i >= 1) {
                c14192a.f59277h = i;
            } else {
                z = false;
            }
            TXCLog.m84152i("LicenceCheck", "live parseVersionType, mLicenceVersionType = " + c14192a.f59277h);
            return z;
        }
        if (c14192a != this.f59266e) {
            return false;
        }
        int i2 = iOptInt & 15;
        if (i2 > 1) {
            c14192a.f59277h = i2;
        } else if (i2 != 1 && iOptInt != 0) {
            z = false;
        } else if (!TextUtils.isEmpty(str)) {
            c14192a.f59277h = 5;
        } else {
            c14192a.f59277h = 3;
        }
        TXCLog.m84152i("LicenceCheck", "ugc parseVersionType, mLicenceVersionType = " + c14192a.f59277h);
        return z;
    }

    /* JADX INFO: renamed from: a */
    private void m84110a(int i) {
        TXCDRApi.txReportDAU(this.f59263a, C14189a.f59151aJ, i, "");
    }

    /* JADX INFO: renamed from: a */
    private static String m84108a(Context context) {
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84114a(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature = Signature.getInstance("SHA256WithRSA");
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }
}
