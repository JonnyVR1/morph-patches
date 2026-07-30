package p149l;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.api.Network;
import com.tantanapp.common.utils.CrashHelper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.Buffer;
import org.brotli.dec.BrotliInputStream;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class b0f {

    /* JADX INFO: renamed from: a */
    public static final String f72427a = ogw.m164285f("P9mO9X1N5gZ4W6yFwnFdElykFu03MWhngr0eNHSYH4Am7HCYjh", true);

    /* JADX INFO: renamed from: b */
    public static List<String> f72428b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static List<String> f72429c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static List<String> f72430d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static List<Pattern> f72431e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static volatile boolean f72432f;

    static {
        f72428b.add("/v2/phone/verify");
        f72428b.add("/v2/email/verify");
        f72428b.add("/v2/phone/code/send");
        f72428b.add("/v2/email/code/send");
        f72428b.add("/v2/phone/code/verify");
        f72428b.add("/v2/email/code/verify");
        f72428b.add("/v2/phone/stage/signup");
        f72428b.add("/v2/email/stage/signup");
        f72428b.add("/v2/ttt-signup");
        f72428b.add("/v2/ttc/tokenSignin");
        f72428b.add("/v2/ttt-token-signin");
        f72428b.add("/v2/phone/signin");
        f72428b.add("/v2/email/signin");
        f72428b.add("/v2/phone/signup");
        f72428b.add("/v2/phone/activate");
        f72428b.add("/v2/email/activate");
        f72428b.add("/v2/thirdparty/signup");
        f72428b.add("/v2/thirdparty/stage/signup");
        f72428b.add("/v2/thirdparty/signin");
        f72428b.add("/v2/thirdparty/activate");
        f72428b.add("/v2/oneclick/signup");
        f72428b.add("/v2/oneclick/stage/signup");
        f72428b.add("/v2/oneclick/signin");
        f72428b.add("/v2/oneclick/activate");
        f72428b.add("/v2/stage/signup/info");
        f72428b.add("/v2/reset-password");
        f72428b.add("/v2/bind-phone");
        f72428b.add("/v2/email/bind");
        f72428b.add("/v2/change-phone");
        f72428b.add("/v2/email/change");
        f72428b.add("/v2/retrieve");
        f72428b.add("/v2/retrieve/code/send");
        f72428b.add("/v2/retrieve/code/verify");
        f72428b.add("/v2/retrieve/identity/verify");
        f72428b.add("/v2/retrieve/verification-tokens");
        f72429c.add("/v2/pois/nearby");
        f72429c.add("/v2/users/me/devices");
        f72429c.add("/v2/users/me/contacts");
        f72429c.add("/v2/users/me/verification-tokens");
        f72429c.add("/v2/users/me/devices/me");
        f72429c.add("/v2/confirmation-code/send");
        f72429c.add("/v2/confirmation-code/verify");
        f72430d.add("/oneid/createid");
        f72430d.add("/abtest/abgroup");
        f72430d.add("/ttt/abtest/abgroup");
        f72431e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/devices"));
        f72431e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/contacts"));
        f72431e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/verification-tokens"));
        f72431e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/devices\\/\\d+"));
        f72431e.add(Pattern.compile("^.*\\/v2\\/users\\/me\\/devices\\/\\d+"));
        f72431e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/devices\\/me"));
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m99755e(byte[] bArr, String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(bArr, 2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES"), new IvParameterSpec(m99765o(str)));
        return cipher.doFinal(bArrDecode);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static String m99756f(String str, @NonNull String str2) throws Exception {
        return m99757g(str, f72427a, m99760j(str2));
    }

    /* JADX INFO: renamed from: g */
    public static String m99757g(String str, String str2, String str3) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = StandardCharsets.UTF_8;
        cipher.init(1, new SecretKeySpec(str2.getBytes(charset), "AES"), new IvParameterSpec(str3.getBytes(charset)));
        return Base64.encodeToString(cipher.doFinal(str.getBytes(charset)), 2);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static gxc0 m99758h(@NonNull exc0 exc0Var) {
        if (!TextUtils.equals(exc0Var.m118611u("X-Janus-Response-Encrypted"), "1")) {
            return exc0Var.m118606k();
        }
        String strM118611u = exc0Var.m118611u("X-Janus-Cipher-Suite");
        if (!TextUtils.equals(strM118611u, "tt")) {
            ibe.m135253a("not support decrypt suite ", strM118611u);
            return null;
        }
        try {
            byte[] bArrM99764n = m99764n(exc0Var.m118606k().byteStream());
            try {
                byte[] bArrM99759i = m99759i(bArrM99764n, exc0Var.m118604Y().m185873c("Authorization"));
                if (TextUtils.equals(exc0Var.m118611u("x-janus-response-raw-encoding"), "br")) {
                    bArrM99759i = m99766p(bArrM99759i);
                } else if (TextUtils.equals(exc0Var.m118611u("x-janus-response-raw-encoding"), HttpHeaderValues.GZIP)) {
                    bArrM99759i = m99767q(bArrM99759i);
                }
                int length = bArrM99759i.length;
                return gxc0.create(exc0Var.m118606k().contentType(), bArrM99759i);
            } catch (Throwable th) {
                RuntimeException runtimeException = new RuntimeException("decodeResponse error url=" + exc0Var.m118604Y().m185881k() + ", encryptSrc=" + new String(bArrM99764n, StandardCharsets.UTF_8) + ", auth=" + exc0Var.m118604Y().m185873c("Authorization") + ", encoding=" + exc0Var.m118611u("x-janus-response-raw-encoding"), th);
                CrashHelper.m81297d(runtimeException, 10);
                f72432f = true;
                throw runtimeException;
            }
        } catch (Throwable th2) {
            pkq0.m170054a("decodeResponse readBytes error", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m99759i(byte[] bArr, String str) {
        String strValueOf;
        try {
            long j = new JSONArray(str.replace(Network.MAC, "")).getLong(2);
            if (j > 9999999999999999L) {
                strValueOf = String.valueOf(j);
                try {
                    strValueOf = strValueOf.substring(strValueOf.length() - 16, strValueOf.length());
                } catch (Exception e) {
                    e = e;
                    ptc0.m171306a("decryptWithAuth error，ivPam=", strValueOf, e);
                    return null;
                }
            } else {
                strValueOf = String.format("%016d", Long.valueOf(j));
            }
            return m99755e(bArr, strValueOf, f72427a);
        } catch (Exception e2) {
            e = e2;
            strValueOf = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m99760j(@NonNull String str) {
        int length = str.length();
        if (length >= 16) {
            return length > 16 ? str.substring(length - 16) : str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16 - length; i++) {
            sb.append("0");
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m99761k(@Nullable utc0 utc0Var) {
        if (utc0Var == null) {
            return null;
        }
        Buffer buffer = new Buffer();
        try {
            utc0Var.writeTo(buffer);
            Charset charsetM133630b = StandardCharsets.UTF_8;
            hyx hyxVarContentType = utc0Var.contentType();
            if (hyxVarContentType != null) {
                charsetM133630b = hyxVarContentType.m133630b(charsetM133630b);
            }
            return buffer.readString(charsetM133630b);
        } catch (IOException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m99762l() {
        return f72432f;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m99763m(final cll cllVar) {
        if (cllVar.toString().startsWith(mu5.f135754v) && vwb.m200337m(f72428b, new w9j() { // from class: l.xze
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(cllVar.m107518h().equals((String) obj));
            }
        })) {
            return true;
        }
        if (cllVar.toString().startsWith(mu5.f135737e) && vwb.m200337m(f72429c, new w9j() { // from class: l.yze
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(cllVar.m107518h().equals((String) obj));
            }
        })) {
            return true;
        }
        return ((cllVar.m107522m().equals("deviceid.tantanapp.com") || cllVar.m107522m().equals("deviceid.tantantribe.com") || cllVar.m107522m().equals("deviceid.staging.tantantribe.com") || cllVar.m107522m().equals("deviceid.staging2.p1staff.com")) && vwb.m200337m(f72430d, new w9j() { // from class: l.zze
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(cllVar.m107518h().equals((String) obj));
            }
        })) || vwb.m200337m(f72431e, new w9j() { // from class: l.a0f
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Pattern) obj).matcher(cllVar.m107518h()).matches());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m99764n(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m99765o(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m99766p(byte[] bArr) throws IOException {
        BrotliInputStream brotliInputStream = new BrotliInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArrM99764n = m99764n(brotliInputStream);
            brotliInputStream.close();
            return bArrM99764n;
        } catch (Throwable th) {
            try {
                brotliInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m99767q(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArrM99764n = m99764n(gZIPInputStream);
            gZIPInputStream.close();
            return bArrM99764n;
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
