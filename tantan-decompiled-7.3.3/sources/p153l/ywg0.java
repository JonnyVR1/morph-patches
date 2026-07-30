package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.connect.common.Constants;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ywg0 {

    /* JADX INFO: renamed from: a */
    public static boolean f201836a = true;

    /* JADX INFO: renamed from: a */
    public static File m217611a(File file, File file2) {
        Throwable th;
        DataOutputStream dataOutputStream;
        Exception e;
        FileInputStream fileInputStream;
        byte[] bArrDoFinal;
        FileInputStream fileInputStream2 = null;
        DataOutputStream dataOutputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                dataOutputStream = new DataOutputStream(new FileOutputStream(file2.getAbsolutePath()));
                try {
                    byte[] bytes = gxg0.m132863b(UUID.randomUUID().toString()).getBytes(StandardCharsets.UTF_8);
                    HashMap map = avg0.f73619a;
                    PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(amg0.m98822b("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA84624QluMte2OQf27WRmq4q3nVjVCQX0o+2lZm3ktKHG2PZf5AjxjZiCuNjqfWSo1gJDsyJZC4FSubhhjDSXrPcJRKS6lXt5DKuhABWWqgkUhcJX3/loigHG4Abyi/+b0NkKPaqTbJ64j9jylyXvO6fj1TMmOw+5zJ/6rV0FMVHosyTUX0zTCt6T5OooGiSt+wCvxlj1IT6vqJ4k8EyM6zYhPzQMK7xZniUyYfdl4OeS9NMT1wW62scuEQ5y2VVeHxFSeauGw9CaQLMIjZl2yj87N8gEtsRj5+hQWmG2kEQOZMv9jRwLGpsH0JoBdJwiThf0fYdB3T1jtgL5eyUnewIDAQAB")));
                    if (bytes == null || bytes.length == 0) {
                        bArrDoFinal = null;
                    } else {
                        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
                        cipher.init(1, publicKeyGeneratePublic);
                        bArrDoFinal = cipher.doFinal(bytes);
                    }
                    dataOutputStream.writeInt(bArrDoFinal.length);
                    dataOutputStream.write(bArrDoFinal);
                    byte[] bArr = new byte[10240];
                    int length = 0;
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            xeg0.m210678c(fileInputStream);
                            xeg0.m210678c(dataOutputStream);
                            return file2;
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            bArr[i2] = (byte) (bArr[i2] ^ bytes[length]);
                            length = (length + 1) % bytes.length;
                        }
                        dataOutputStream.write(bArr, 0, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        LogUtils.file("ReportCLogUtils", "encryptFile error:" + LogUtils.getErrorInfo(e));
                        xeg0.m210678c(fileInputStream);
                        xeg0.m210678c(dataOutputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        fileInputStream = fileInputStream2;
                        dataOutputStream2 = dataOutputStream;
                        xeg0.m210678c(fileInputStream);
                        xeg0.m210678c(dataOutputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataOutputStream2 = dataOutputStream;
                    xeg0.m210678c(fileInputStream);
                    xeg0.m210678c(dataOutputStream2);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                dataOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                xeg0.m210678c(fileInputStream);
                xeg0.m210678c(dataOutputStream2);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            dataOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            dataOutputStream = null;
            fileInputStream = fileInputStream2;
            dataOutputStream2 = dataOutputStream;
            xeg0.m210678c(fileInputStream);
            xeg0.m210678c(dataOutputStream2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX INFO: renamed from: b */
    public static void m217612b(File file) {
        long jOptLong;
        String strOptString;
        String strOptString2;
        String strOptString3;
        gvg0 gvg0Var;
        rhg0 rhg0Var;
        if (file == null) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            kjg0.m150043a("TechSudMGPCLog.sp").m150044b();
            f201836a = false;
            return;
        }
        f201836a = false;
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            String str = null;
            try {
                JSONObject jSONObject = new JSONObject(kjg0.m150043a("TechSudMGPCLog.sp").f127100a.getString(name, ""));
                strOptString = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID);
                try {
                    jOptLong = jSONObject.optLong("mgId");
                    try {
                        strOptString2 = jSONObject.optString("requestId");
                        try {
                            strOptString3 = jSONObject.optString("filePath");
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            strOptString3 = null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strOptString2 = null;
                        e.printStackTrace();
                        strOptString3 = null;
                        if (TextUtils.isEmpty(strOptString2)) {
                            kjg0.m150043a("TechSudMGPCLog.sp").m150046d(name);
                            file2.delete();
                        } else {
                            kjg0.m150043a("TechSudMGPCLog.sp").m150046d(name);
                            file2.delete();
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    jOptLong = 0;
                }
            } catch (Exception e4) {
                e = e4;
                jOptLong = 0;
                strOptString = null;
                strOptString2 = null;
            }
            if (TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString)) {
                kjg0.m150043a("TechSudMGPCLog.sp").m150046d(name);
                file2.delete();
            } else if (!TextUtils.isEmpty(strOptString3)) {
                File file3 = new File(strOptString3);
                if (file3.exists() && file3.length() > 0) {
                    i0h0 i0h0Var = utg0.f180950e;
                    if (i0h0Var != null && (gvg0Var = i0h0Var.f112370c) != null && (rhg0Var = gvg0Var.f106633d) != null) {
                        str = rhg0Var.f163167e;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (m217613c(str, strOptString2, file3, strOptString, jOptLong + "")) {
                            file3.delete();
                            kjg0.m150043a("TechSudMGPCLog.sp").m150046d(strOptString2);
                        } else {
                            f201836a = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m217613c(String str, String str2, File file, String str3, String str4) {
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        zug0 zug0Var = new zug0();
        zug0Var.f206126c = 3;
        zug0Var.f206125b.f82998a = "UploadHttpLoggingInterceptor";
        wlg0 wlg0Var = new wlg0();
        wlg0Var.f189692a = "UploadLoggingEventListener";
        rg50.C19837b c19837b = new rg50.C19837b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        rg50 rg50VarM181365c = c19837b.m181368f(15L, timeUnit).m181383u(30L, timeUnit).m181363a(zug0Var).m181387y(30L, timeUnit).m181374l(wlg0Var).m181372j(new h0h0("UploadLoggingIpv4PreferredDns")).m181365c();
        ku10 ku10VarM151431e = new ku10.C18260a().m151432f(ku10.f128786j).m151428b("file", file.getName(), z1d0.create(e7y.m119772c(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), file)).m151427a(Constants.JumpUrlConstants.URL_KEY_APPID, str3).m151427a("mg_id", str4).m151431e();
        x1d0.C21228a c21228aM198630e = uyg0.m198630e(str2, new bxg0(), null);
        String str5 = utg0.f180946a;
        try {
            i5d0 i5d0VarExecute = rg50VarM181365c.mo181341a(c21228aM198630e.m209027a("sud-sdk-signature", jkg0.m145845a(utg0.f180953h, str2 + "&" + str3 + "&" + String.valueOf(2) + "&" + utg0.m198036d())).m209043q(str).m209038l(ku10VarM151431e).m209028b()).execute();
            if (!i5d0VarExecute.m138661I()) {
                return false;
            }
            LogUtils.file("ReportCLogUtils", "upload response:" + (i5d0VarExecute.m138670k() != null ? i5d0VarExecute.m138670k().string() : null));
            return true;
        } catch (Exception e) {
            LogUtils.file("ReportCLogUtils", LogUtils.getErrorInfo(e));
            return false;
        }
    }
}
