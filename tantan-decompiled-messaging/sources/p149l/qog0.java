package p149l;

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
public abstract class qog0 {

    /* JADX INFO: renamed from: a */
    public static boolean f155565a = true;

    /* JADX INFO: renamed from: a */
    public static File m175736a(File file, File file2) {
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
                    byte[] bytes = yog0.m215499b(UUID.randomUUID().toString()).getBytes(StandardCharsets.UTF_8);
                    HashMap map = smg0.f165343a;
                    PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(sdg0.m183493b("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA84624QluMte2OQf27WRmq4q3nVjVCQX0o+2lZm3ktKHG2PZf5AjxjZiCuNjqfWSo1gJDsyJZC4FSubhhjDSXrPcJRKS6lXt5DKuhABWWqgkUhcJX3/loigHG4Abyi/+b0NkKPaqTbJ64j9jylyXvO6fj1TMmOw+5zJ/6rV0FMVHosyTUX0zTCt6T5OooGiSt+wCvxlj1IT6vqJ4k8EyM6zYhPzQMK7xZniUyYfdl4OeS9NMT1wW62scuEQ5y2VVeHxFSeauGw9CaQLMIjZl2yj87N8gEtsRj5+hQWmG2kEQOZMv9jRwLGpsH0JoBdJwiThf0fYdB3T1jtgL5eyUnewIDAQAB")));
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
                            p6g0.m167665c(fileInputStream);
                            p6g0.m167665c(dataOutputStream);
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
                        p6g0.m167665c(fileInputStream);
                        p6g0.m167665c(dataOutputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        fileInputStream = fileInputStream2;
                        dataOutputStream2 = dataOutputStream;
                        p6g0.m167665c(fileInputStream);
                        p6g0.m167665c(dataOutputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataOutputStream2 = dataOutputStream;
                    p6g0.m167665c(fileInputStream);
                    p6g0.m167665c(dataOutputStream2);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                dataOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                p6g0.m167665c(fileInputStream);
                p6g0.m167665c(dataOutputStream2);
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
            p6g0.m167665c(fileInputStream);
            p6g0.m167665c(dataOutputStream2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX INFO: renamed from: b */
    public static void m175737b(File file) {
        long jOptLong;
        String strOptString;
        String strOptString2;
        String strOptString3;
        ymg0 ymg0Var;
        j9g0 j9g0Var;
        if (file == null) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            cbg0.m105995a("TechSudMGPCLog.sp").m105996b();
            f155565a = false;
            return;
        }
        f155565a = false;
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            String str = null;
            try {
                JSONObject jSONObject = new JSONObject(cbg0.m105995a("TechSudMGPCLog.sp").f80140a.getString(name, ""));
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
                            cbg0.m105995a("TechSudMGPCLog.sp").m105998d(name);
                            file2.delete();
                        } else {
                            cbg0.m105995a("TechSudMGPCLog.sp").m105998d(name);
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
                cbg0.m105995a("TechSudMGPCLog.sp").m105998d(name);
                file2.delete();
            } else if (!TextUtils.isEmpty(strOptString3)) {
                File file3 = new File(strOptString3);
                if (file3.exists() && file3.length() > 0) {
                    asg0 asg0Var = mlg0.f134430e;
                    if (asg0Var != null && (ymg0Var = asg0Var.f71451c) != null && (j9g0Var = ymg0Var.f199002d) != null) {
                        str = j9g0Var.f116902e;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (m175738c(str, strOptString2, file3, strOptString, jOptLong + "")) {
                            file3.delete();
                            cbg0.m105995a("TechSudMGPCLog.sp").m105998d(strOptString2);
                        } else {
                            f155565a = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m175738c(String str, String str2, File file, String str3, String str4) {
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        rmg0 rmg0Var = new rmg0();
        rmg0Var.f160096c = 3;
        rmg0Var.f160095b.f176392a = "UploadHttpLoggingInterceptor";
        odg0 odg0Var = new odg0();
        odg0Var.f143204a = "UploadLoggingEventListener";
        k850.C17954b c17954b = new k850.C17954b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k850 k850VarM144882c = c17954b.m144885f(15L, timeUnit).m144899t(30L, timeUnit).m144880a(rmg0Var).m144903x(30L, timeUnit).m144891l(odg0Var).m144889j(new zrg0("UploadLoggingIpv4PreferredDns")).m144882c();
        cm10 cm10VarM107599e = new cm10.C16191a().m107600f(cm10.f81492j).m107596b("file", file.getName(), utc0.create(hyx.m133627c(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), file)).m107595a(Constants.JumpUrlConstants.URL_KEY_APPID, str3).m107595a("mg_id", str4).m107599e();
        stc0.C20027a c20027aM155897e = mqg0.m155897e(str2, new tog0(), null);
        String str5 = mlg0.f134426a;
        try {
            exc0 exc0VarExecute = k850VarM144882c.mo144849a(c20027aM155897e.m185882a("sud-sdk-signature", bcg0.m101061a(mlg0.f134433h, str2 + "&" + str3 + "&" + String.valueOf(2) + "&" + mlg0.m155145d())).m185898q(str).m185893l(cm10VarM107599e).m185883b()).execute();
            if (!exc0VarExecute.m118597I()) {
                return false;
            }
            LogUtils.file("ReportCLogUtils", "upload response:" + (exc0VarExecute.m118606k() != null ? exc0VarExecute.m118606k().string() : null));
            return true;
        } catch (Exception e) {
            LogUtils.file("ReportCLogUtils", LogUtils.getErrorInfo(e));
            return false;
        }
    }
}
