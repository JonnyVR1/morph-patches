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
import com.tencent.liteav.basic.datareport.C14026a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14049c;
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
    private static LicenceCheck f58414d;

    /* JADX INFO: renamed from: a */
    private Context f58415a;

    /* JADX INFO: renamed from: b */
    private String f58416b = "YTFaceSDK.licence";

    /* JADX INFO: renamed from: c */
    private String f58417c = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq4teqkW/TUruU89ElNVd\nKrpSL+HCITruyb6BS9mW6M4mqmxDhazDmQgMKNfsA0d2kxFucCsXTyesFNajaisk\nrAzVJpNGO75bQFap4jYzJYskIuas6fgIS7zSmGXgRcp6i0ZBH3pkVCXcgfLfsVCO\n+sN01jFhFgOC0LY2f1pJ+3jqktAlMIxy8Q9t7XwwL5/n8/Sledp7TwuRdnl2OPl3\nycCTRkXtOIoRNB9vgd9XooTKiEdCXC7W9ryvtwCiAB82vEfHWXXgzhsPC13URuFy\n1JqbWJtTCCcfsCVxuBplhVJAQ7JsF5SMntdJDkp7rJLhprgsaim2CRjcVseNmw97\nbwIDAQAB";

    /* JADX INFO: renamed from: e */
    private C14029a f58418e = new C14029a("TXUgcSDK.licence");

    /* JADX INFO: renamed from: f */
    private C14029a f58419f = new C14029a("TXLiveSDK.licence");

    /* JADX INFO: renamed from: com.tencent.liteav.basic.license.LicenceCheck$a */
    public class C14029a {

        /* JADX INFO: renamed from: a */
        String f58422a;

        /* JADX INFO: renamed from: b */
        String f58423b;

        /* JADX INFO: renamed from: c */
        String f58424c = "";

        /* JADX INFO: renamed from: d */
        String f58425d = "";

        /* JADX INFO: renamed from: e */
        String f58426e = "";

        /* JADX INFO: renamed from: f */
        boolean f58427f = false;

        /* JADX INFO: renamed from: g */
        boolean f58428g = false;

        /* JADX INFO: renamed from: h */
        int f58429h = -1;

        /* JADX INFO: renamed from: i */
        String f58430i = "";

        public C14029a(String str) {
            this.f58422a = str;
            this.f58423b = str + ".tmp";
        }
    }

    private LicenceCheck() {
    }

    /* JADX INFO: renamed from: a */
    private int m82923a(C14029a c14029a, String str, String str2) throws Throwable {
        boolean zM82931a;
        try {
            zM82931a = m82931a(Base64.decode(str, 0), Base64.decode(str2, 0), m82952a(this.f58417c));
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.m82966e("LicenceCheck", "verifyLicence, exception is : " + e);
            zM82931a = false;
        }
        if (!zM82931a) {
            m82927a(-2);
            TXCLog.m82966e("LicenceCheck", "verifyLicence, signature not pass!");
            return -2;
        }
        String strM82939c = m82939c(c14029a, str);
        if (TextUtils.isEmpty(strM82939c)) {
            m82927a(-3);
            TXCLog.m82966e("LicenceCheck", "verifyLicence, decodeValue is empty!");
            return -3;
        }
        c14029a.f58430i = strM82939c;
        try {
            JSONObject jSONObject = new JSONObject(strM82939c);
            String string = jSONObject.getString("pituLicense");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("appData");
            if (jSONArrayOptJSONArray == null) {
                TXCLog.m82966e("LicenceCheck", "verifyLicence, appDataArray is null!");
                m82927a(-1);
                return -1;
            }
            boolean z = false;
            boolean z2 = false;
            boolean zM82930a = false;
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                String strOptString = jSONObject2.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                TXCLog.m82969i("LicenceCheck", "verifyLicence, packageName:" + strOptString);
                if (!strOptString.equals(this.f58415a.getPackageName())) {
                    TXCLog.m82966e("LicenceCheck", "verifyLicence, packageName not match!");
                } else if (!m82943d(jSONObject2.optString(Message.END_DATE))) {
                    zM82930a = m82930a(c14029a, jSONObject2, string);
                    if (zM82930a) {
                        z = true;
                        z2 = true;
                        zM82930a = true;
                        break;
                    }
                    z = true;
                    z2 = true;
                } else {
                    z = true;
                }
            }
            if (!z) {
                m82927a(-4);
                return -4;
            }
            if (!z2) {
                m82927a(-5);
                return -5;
            }
            if (!zM82930a) {
                m82927a(-11);
                return -11;
            }
            if (!TextUtils.isEmpty(string)) {
                try {
                    byte[] bArrDecode = Base64.decode(string, 0);
                    File externalFilesDir = this.f58415a.getExternalFilesDir(null);
                    if (externalFilesDir == null) {
                        return -10;
                    }
                    File file = new File(externalFilesDir.getAbsolutePath() + File.separator + this.f58416b);
                    C14049c.m83022a(file.getAbsolutePath(), bArrDecode);
                    TXCCommonUtil.setPituLicencePath(file.getAbsolutePath());
                } catch (Exception e2) {
                    TXCLog.m82966e("LicenceCheck", "decode pitu license error:" + e2);
                }
            }
            TXCDRApi.txReportDAU(this.f58415a, C14026a.f58302aI);
            return 0;
        } catch (JSONException e3) {
            e3.printStackTrace();
            TXCLog.m82966e("LicenceCheck", "verifyLicence, json format error ! exception = " + e3);
            m82927a(-1);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82934b(C14029a c14029a, String str) {
        Context context = this.f58415a;
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("LicenceCheck.lastModified", 0).edit();
        editorEdit.putString(c14029a.f58422a + ".lastModified", str);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: c */
    private int m82937c(C14029a c14029a) throws Throwable {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            TXCLog.m82966e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
            return -10;
        }
        File externalFilesDir = this.f58415a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m82966e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
            return -10;
        }
        String str = externalFilesDir.getAbsolutePath() + File.separator + c14029a.f58422a;
        if (!m82936b(str)) {
            return -7;
        }
        String strM83028b = C14049c.m83028b(str);
        if (!TextUtils.isEmpty(strM83028b)) {
            return m82950a(c14029a, strM83028b);
        }
        TXCLog.m82966e("LicenceCheck", "checkSdcardLicence, licenceSdcardStr is empty");
        return -8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public int m82942d(C14029a c14029a, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(RemoteConfigConstants.RequestFieldKey.APP_ID);
            String string = jSONObject.getString("encryptedLicense");
            String string2 = jSONObject.getString(SocialOperation.GAME_SIGNATURE);
            TXCLog.m82969i("LicenceCheck", "appid:" + iOptInt);
            TXCLog.m82969i("LicenceCheck", "encryptedLicense:" + string);
            TXCLog.m82969i("LicenceCheck", "signature:" + string2);
            return m82923a(c14029a, string, string2);
        } catch (JSONException e) {
            e.printStackTrace();
            m82927a(-1);
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    private int m82944e(C14029a c14029a, String str) {
        String strM82945e = m82945e(str);
        if (TextUtils.isEmpty(strM82945e)) {
            TXCLog.m82966e("LicenceCheck", "verifyOldLicence, decryptStr is empty");
            return -3;
        }
        c14029a.f58430i = strM82945e;
        try {
            JSONObject jSONObject = new JSONObject(strM82945e);
            if (!jSONObject.getString("packagename").equals(m82925a(this.f58415a))) {
                TXCLog.m82966e("LicenceCheck", "packagename not match!");
                m82927a(-4);
                return -4;
            }
            if (m82943d(jSONObject.getString("enddate"))) {
                return -5;
            }
            c14029a.f58429h = 5;
            TXCDRApi.txReportDAU(this.f58415a, C14026a.f58302aI);
            return 0;
        } catch (JSONException e) {
            e.printStackTrace();
            TXCLog.m82966e("LicenceCheck", "verifyOldLicence, json format error !");
            m82927a(-1);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m82947f(C14029a c14029a) {
        File externalFilesDir = this.f58415a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m82969i("LicenceCheck", "saveTempLocal sdcardDir is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(externalFilesDir.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(c14029a.f58422a);
        File file = new File(sb.toString());
        if (file.exists()) {
            TXCLog.m82969i("LicenceCheck", "delete dst file:" + file.delete());
        }
        File file2 = new File(c14029a.f58424c + str + c14029a.f58423b);
        if (file2.exists()) {
            TXCLog.m82969i("LicenceCheck", "rename file:" + file2.renameTo(file));
        }
        c14029a.f58428g = true;
    }

    /* JADX INFO: renamed from: g */
    private int m82948g(C14029a c14029a) {
        return c14029a.f58429h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public String m82949h(C14029a c14029a) {
        return C14049c.m83028b(new File(c14029a.f58424c + File.separator + c14029a.f58423b).getAbsolutePath());
    }

    private native byte[] nativeIvParameterSpec(byte[] bArr);

    /* JADX INFO: renamed from: b */
    private String m82933b(C14029a c14029a) {
        Context context = this.f58415a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("LicenceCheck.lastModified", 0).getString(c14029a.f58422a + ".lastModified", null);
    }

    /* JADX INFO: renamed from: b */
    private boolean m82936b(String str) {
        return C14049c.m83026a(str);
    }

    /* JADX INFO: renamed from: b */
    public int m82955b() {
        return m82948g(this.f58419f);
    }

    /* JADX INFO: renamed from: d */
    private int m82941d(C14029a c14029a) {
        if (!m82946e(c14029a)) {
            return -6;
        }
        String strM83027b = C14049c.m83027b(this.f58415a, c14029a.f58422a);
        if (TextUtils.isEmpty(strM83027b)) {
            TXCLog.m82966e("LicenceCheck", "checkAssetLicence, licenceSdcardStr is empty");
            return -8;
        }
        return m82950a(c14029a, strM83027b);
    }

    /* JADX INFO: renamed from: c */
    private boolean m82940c() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            TXCLog.m82966e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
            return false;
        }
        if (this.f58415a.getExternalFilesDir(null) != null) {
            return true;
        }
        TXCLog.m82966e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
        return false;
    }

    /* JADX INFO: renamed from: d */
    private boolean m82943d(String str) {
        long jM82938c = m82938c(str);
        if (jM82938c < 0) {
            TXCLog.m82966e("LicenceCheck", "checkEndDate, end date millis < 0!");
            return true;
        }
        if (jM82938c >= System.currentTimeMillis()) {
            return false;
        }
        TXCLog.m82966e("LicenceCheck", "checkEndDate, end date expire!");
        return true;
    }

    /* JADX INFO: renamed from: e */
    private boolean m82946e(C14029a c14029a) {
        return C14049c.m83025a(this.f58415a, c14029a.f58422a);
    }

    /* JADX INFO: renamed from: e */
    private String m82945e(String str) {
        try {
            return new String(C14037h.m82963b(Base64.decode(str, 0), Base64.decode("MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKfMXaF6wx9lev2U\nIzkk6ydI2sdaSQAD2ZvDBLq+5Fm6nGwSSWawl03D4vHcWIUa3wnz6f19/y8wzrj4\nnTfcEnT94SPdB6GhGsqPwbwRp9MHAqd/2gWZxSb005il2yiOZafk6X4NGKCn2tGd\nyNaCF+m9rLykuLdZHB0Z53ivgseNAgMBAAECgYAvXI2pAH+Goxwd6uwuOu9svTGT\nRzaHnI6VWmxBUZQeh3+TOW4iYAG03291GN6bY0RFCOWouSGH7lzK9NFbbPCAQ/hx\ncO48PqioHoq7K8sqzd3XaYBv39HrRnM8JvZsqv0PLJwX/LGm2y/MRaKAC6bcHtse\npgh+NNmUxXNRcTMRAQJBANezmenBcR8HTcY5YaEk3SQRzOo+QhIXuuD4T/FESpVJ\nmVQGxJjLsEBua1j38WG2QuepE5JiVbkQ0jQSvhUiZK0CQQDHJa+vWu6l72lQAvIx\nwmRISorvLb/tnu5bH0Ele42oX+w4p/tm03awdVjhVANnpDjYS2H6EzrF/pfis7k9\nV2phAkB4E4gz47bYYhV+qsTZkw70HGCpab0YG1OyFylRkwW983nCl/3rXUChrZZe\nsbATCAZYtfuqOsmju2R5DpH4a+wFAkBmHlcWbmSNxlSUaM5U4b+WqlLQDv+qE6Na\nKo63b8HWI0n4S3tI4QqttZ7b/L66OKXFk/Ir0AyFVuX/o/VLFTZBAkAdSTEkGwE5\nGQmhxu95sKxmdlUY6Q0Gwwpi06C1BPBrj2VkGXpBP0twhPVAq/3xVjjb+2KXVTUW\nIpRLc06M4vhv", 0)));
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.m82966e("LicenceCheck", "decryptLicenceStr, exception is : " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m82938c(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime();
        } catch (Exception e) {
            TXCLog.m82967e("LicenceCheck", "time str to millsecond failed.", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: c */
    private String m82939c(C14029a c14029a, String str) {
        if (TextUtils.isEmpty(c14029a.f58425d)) {
            TXCLog.m82966e("LicenceCheck", "decodeLicence, mKey is empty!!!");
            return "";
        }
        byte[] bytes = c14029a.f58425d.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(nativeIvParameterSpec(bytes));
        byte[] bArrDecode = Base64.decode(str, 0);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            String str2 = new String(cipher.doFinal(bArrDecode), "UTF-8");
            TXCLog.m82969i("LicenceCheck", "decodeLicence : ".concat(str2));
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static LicenceCheck m82924a() {
        if (f58414d == null) {
            f58414d = new LicenceCheck();
        }
        return f58414d;
    }

    /* JADX INFO: renamed from: a */
    public void m82953a(Context context, String str, String str2) {
        m82928a(this.f58419f, context, str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m82928a(C14029a c14029a, Context context, String str, String str2) {
        if (context != null) {
            this.f58415a = context.getApplicationContext();
            TXCCommonUtil.setAppContext(context);
        }
        c14029a.f58425d = str2;
        c14029a.f58426e = str;
        if (this.f58415a == null || !m82940c()) {
            return;
        }
        File externalFilesDir = this.f58415a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            c14029a.f58424c = externalFilesDir.getAbsolutePath();
        }
        if (!m82936b(c14029a.f58424c + File.separator + c14029a.f58422a)) {
            TXCLog.m82969i("LicenceCheck", "setLicense, sdcard file not exist, to download");
            m82934b(c14029a, "");
        }
        m82954a(c14029a);
    }

    /* JADX INFO: renamed from: a */
    public void m82954a(final C14029a c14029a) {
        if (TextUtils.isEmpty(c14029a.f58426e)) {
            TXCLog.m82966e("LicenceCheck", "downloadLicense, mUrl is empty, ignore!");
            return;
        }
        if (c14029a.f58427f) {
            TXCLog.m82969i("LicenceCheck", "downloadLicense, in downloading, ignore");
            return;
        }
        InterfaceC14031b interfaceC14031b = new InterfaceC14031b() { // from class: com.tencent.liteav.basic.license.LicenceCheck.1
            @Override // com.tencent.liteav.basic.license.InterfaceC14031b
            /* JADX INFO: renamed from: a */
            public void mo82959a(File file, String str) {
                if (file == null) {
                    TXCLog.m82969i("LicenceCheck", "downloadLicense, license not modified");
                    return;
                }
                LicenceCheck.this.m82934b(c14029a, str);
                TXCLog.m82969i("LicenceCheck", "downloadLicense, onSaveSuccess");
                String strM82949h = LicenceCheck.this.m82949h(c14029a);
                if (TextUtils.isEmpty(strM82949h)) {
                    TXCLog.m82966e("LicenceCheck", "downloadLicense, readDownloadTempLicence is empty!");
                    c14029a.f58427f = false;
                } else if (LicenceCheck.this.m82942d(c14029a, strM82949h) == 0) {
                    LicenceCheck.this.m82947f(c14029a);
                }
            }

            @Override // com.tencent.liteav.basic.license.InterfaceC14031b
            /* JADX INFO: renamed from: a */
            public void mo82958a(File file, Exception exc) {
                TXCLog.m82969i("LicenceCheck", "downloadLicense, onSaveFailed");
            }

            @Override // com.tencent.liteav.basic.license.InterfaceC14031b
            /* JADX INFO: renamed from: a */
            public void mo82957a(int i) {
                TXCLog.m82969i("LicenceCheck", "downloadLicense, onProgressUpdate");
            }

            @Override // com.tencent.liteav.basic.license.InterfaceC14031b
            /* JADX INFO: renamed from: a */
            public void mo82956a() {
                TXCLog.m82969i("LicenceCheck", "downloadLicense, onProcessEnd");
                c14029a.f58427f = false;
            }
        };
        Context context = this.f58415a;
        if (context == null) {
            TXCLog.m82966e("LicenceCheck", "context is NULL !!! Please set context in method:setLicense(Context context, String url, String key)");
            return;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m82966e("LicenceCheck", "Please check permission WRITE_EXTERNAL_STORAGE permission has been set !!!");
            return;
        }
        String strM82933b = m82933b(c14029a);
        c14029a.f58424c = externalFilesDir.getAbsolutePath();
        new Thread(new C14032c(this.f58415a, c14029a.f58426e, c14029a.f58424c, c14029a.f58423b, interfaceC14031b, false, strM82933b)).start();
        c14029a.f58427f = true;
    }

    /* JADX INFO: renamed from: a */
    public int m82951a(C14035f c14035f, Context context) {
        return m82922a(this.f58419f, c14035f, context);
    }

    /* JADX INFO: renamed from: a */
    private int m82922a(C14029a c14029a, C14035f c14035f, Context context) throws Throwable {
        int iM82921a = m82921a(c14029a, context);
        if (iM82921a != 0) {
            m82954a(c14029a);
        }
        if (c14035f != null) {
            c14035f.f58442a = c14029a.f58430i;
        }
        return iM82921a;
    }

    /* JADX INFO: renamed from: a */
    private int m82921a(C14029a c14029a, Context context) throws Throwable {
        if (c14029a.f58428g) {
            return 0;
        }
        if (this.f58415a == null) {
            this.f58415a = context;
        }
        if (m82941d(c14029a) == 0) {
            c14029a.f58428g = true;
            return 0;
        }
        int iM82937c = m82937c(c14029a);
        if (iM82937c != 0) {
            return iM82937c;
        }
        c14029a.f58428g = true;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public int m82950a(C14029a c14029a, String str) {
        try {
            new JSONObject(str);
            return m82942d(c14029a, str);
        } catch (JSONException unused) {
            if (c14029a == this.f58419f) {
                return -1;
            }
            return m82944e(c14029a, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public PublicKey m82952a(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    /* JADX INFO: renamed from: a */
    private boolean m82930a(C14029a c14029a, JSONObject jSONObject, String str) {
        int iOptInt = jSONObject.optInt("feature");
        boolean z = true;
        if (c14029a == this.f58419f) {
            int i = (iOptInt >> 4) & 15;
            if (i >= 1) {
                c14029a.f58429h = i;
            } else {
                z = false;
            }
            TXCLog.m82969i("LicenceCheck", "live parseVersionType, mLicenceVersionType = " + c14029a.f58429h);
            return z;
        }
        if (c14029a != this.f58418e) {
            return false;
        }
        int i2 = iOptInt & 15;
        if (i2 > 1) {
            c14029a.f58429h = i2;
        } else if (i2 != 1 && iOptInt != 0) {
            z = false;
        } else if (!TextUtils.isEmpty(str)) {
            c14029a.f58429h = 5;
        } else {
            c14029a.f58429h = 3;
        }
        TXCLog.m82969i("LicenceCheck", "ugc parseVersionType, mLicenceVersionType = " + c14029a.f58429h);
        return z;
    }

    /* JADX INFO: renamed from: a */
    private void m82927a(int i) {
        TXCDRApi.txReportDAU(this.f58415a, C14026a.f58303aJ, i, "");
    }

    /* JADX INFO: renamed from: a */
    private static String m82925a(Context context) {
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m82931a(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature = Signature.getInstance("SHA256WithRSA");
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }
}
