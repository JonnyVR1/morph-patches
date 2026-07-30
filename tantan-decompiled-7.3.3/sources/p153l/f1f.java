package p153l;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.Network;
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
public class f1f {

    /* JADX INFO: renamed from: a */
    public static final String f96786a = niw.m163316f("P9mO9X1N5gZ4W6yFwnFdElykFu03MWhngr0eNHSYH4Am7HCYjh", true);

    /* JADX INFO: renamed from: b */
    public static List<String> f96787b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static List<String> f96788c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static List<String> f96789d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static List<Pattern> f96790e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static volatile boolean f96791f;

    static {
        f96787b.add("/v2/phone/verify");
        f96787b.add("/v2/email/verify");
        f96787b.add("/v2/phone/code/send");
        f96787b.add("/v2/email/code/send");
        f96787b.add("/v2/phone/code/verify");
        f96787b.add("/v2/email/code/verify");
        f96787b.add("/v2/phone/stage/signup");
        f96787b.add("/v2/email/stage/signup");
        f96787b.add("/v2/ttt-signup");
        f96787b.add("/v2/ttc/tokenSignin");
        f96787b.add("/v2/ttt-token-signin");
        f96787b.add("/v2/phone/signin");
        f96787b.add("/v2/email/signin");
        f96787b.add("/v2/phone/signup");
        f96787b.add("/v2/phone/activate");
        f96787b.add("/v2/email/activate");
        f96787b.add("/v2/thirdparty/signup");
        f96787b.add("/v2/thirdparty/stage/signup");
        f96787b.add("/v2/thirdparty/signin");
        f96787b.add("/v2/thirdparty/activate");
        f96787b.add("/v2/oneclick/signup");
        f96787b.add("/v2/oneclick/stage/signup");
        f96787b.add("/v2/oneclick/signin");
        f96787b.add("/v2/oneclick/activate");
        f96787b.add("/v2/stage/signup/info");
        f96787b.add("/v2/reset-password");
        f96787b.add("/v2/bind-phone");
        f96787b.add("/v2/email/bind");
        f96787b.add("/v2/change-phone");
        f96787b.add("/v2/email/change");
        f96787b.add("/v2/retrieve");
        f96787b.add("/v2/retrieve/code/send");
        f96787b.add("/v2/retrieve/code/verify");
        f96787b.add("/v2/retrieve/identity/verify");
        f96787b.add("/v2/retrieve/verification-tokens");
        f96788c.add("/v2/pois/nearby");
        f96788c.add("/v2/users/me/devices");
        f96788c.add("/v2/users/me/contacts");
        f96788c.add("/v2/users/me/verification-tokens");
        f96788c.add("/v2/users/me/devices/me");
        f96788c.add("/v2/confirmation-code/send");
        f96788c.add("/v2/confirmation-code/verify");
        f96789d.add("/oneid/createid");
        f96789d.add("/abtest/abgroup");
        f96789d.add("/ttt/abtest/abgroup");
        f96790e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/devices"));
        f96790e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/contacts"));
        f96790e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/verification-tokens"));
        f96790e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/devices\\/\\d+"));
        f96790e.add(Pattern.compile("^.*\\/v2\\/users\\/me\\/devices\\/\\d+"));
        f96790e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/devices\\/me"));
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m123562e(byte[] bArr, String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(bArr, 2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES"), new IvParameterSpec(m123572o(str)));
        return cipher.doFinal(bArrDecode);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static String m123563f(String str, @NonNull String str2) throws Exception {
        return m123564g(str, f96786a, m123567j(str2));
    }

    /* JADX INFO: renamed from: g */
    public static String m123564g(String str, String str2, String str3) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = StandardCharsets.UTF_8;
        cipher.init(1, new SecretKeySpec(str2.getBytes(charset), "AES"), new IvParameterSpec(str3.getBytes(charset)));
        return Base64.encodeToString(cipher.doFinal(str.getBytes(charset)), 2);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static k5d0 m123565h(@NonNull i5d0 i5d0Var) {
        if (!TextUtils.equals(i5d0Var.m138675u("X-Janus-Response-Encrypted"), "1")) {
            return i5d0Var.m138670k();
        }
        String strM138675u = i5d0Var.m138675u("X-Janus-Cipher-Suite");
        if (!TextUtils.equals(strM138675u, "tt")) {
            mce.m157919a("not support decrypt suite ", strM138675u);
            return null;
        }
        try {
            byte[] bArrM123571n = m123571n(i5d0Var.m138670k().byteStream());
            try {
                byte[] bArrM123566i = m123566i(bArrM123571n, i5d0Var.m138668Z().m209018c("Authorization"));
                if (TextUtils.equals(i5d0Var.m138675u("x-janus-response-raw-encoding"), "br")) {
                    bArrM123566i = m123573p(bArrM123566i);
                } else if (TextUtils.equals(i5d0Var.m138675u("x-janus-response-raw-encoding"), HttpHeaderValues.GZIP)) {
                    bArrM123566i = m123574q(bArrM123566i);
                }
                int length = bArrM123566i.length;
                return k5d0.create(i5d0Var.m138670k().contentType(), bArrM123566i);
            } catch (Throwable th) {
                RuntimeException runtimeException = new RuntimeException("decodeResponse error url=" + i5d0Var.m138668Z().m209026k() + ", encryptSrc=" + new String(bArrM123571n, StandardCharsets.UTF_8) + ", auth=" + i5d0Var.m138668Z().m209018c("Authorization") + ", encoding=" + i5d0Var.m138675u("x-janus-response-raw-encoding"), th);
                CrashHelper.m82480d(runtimeException, 10);
                f96791f = true;
                throw runtimeException;
            }
        } catch (Throwable th2) {
            vtq0.m202761a("decodeResponse readBytes error", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m123566i(byte[] bArr, String str) {
        String strValueOf;
        try {
            long j = new JSONArray(str.replace(Network.MAC, "")).getLong(2);
            if (j > 9999999999999999L) {
                strValueOf = String.valueOf(j);
                try {
                    strValueOf = strValueOf.substring(strValueOf.length() - 16, strValueOf.length());
                } catch (Exception e) {
                    e = e;
                    u1d0.m193953a("decryptWithAuth error，ivPam=", strValueOf, e);
                    return null;
                }
            } else {
                strValueOf = String.format("%016d", Long.valueOf(j));
            }
            return m123562e(bArr, strValueOf, f96786a);
        } catch (Exception e2) {
            e = e2;
            strValueOf = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m123567j(@NonNull String str) {
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
    public static String m123568k(@Nullable z1d0 z1d0Var) {
        if (z1d0Var == null) {
            return null;
        }
        Buffer buffer = new Buffer();
        try {
            z1d0Var.writeTo(buffer);
            Charset charsetM119775b = StandardCharsets.UTF_8;
            e7y e7yVarContentType = z1d0Var.contentType();
            if (e7yVarContentType != null) {
                charsetM119775b = e7yVarContentType.m119775b(charsetM119775b);
            }
            return buffer.readString(charsetM119775b);
        } catch (IOException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m123569l() {
        return f96791f;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m123570m(final rnl rnlVar) {
        String string = rnlVar.toString();
        String str = qv5.f159718v;
        if ((string.startsWith(str) || rnlVar.toString().startsWith(lhl.INSTANCE.m154220m(str))) && jyb.m147520m(f96787b, new qcj() { // from class: l.b1f
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(rnlVar.m182282h().equals((String) obj));
            }
        })) {
            return true;
        }
        String string2 = rnlVar.toString();
        String str2 = qv5.f159701e;
        if ((string2.startsWith(str2) || rnlVar.toString().startsWith(lhl.INSTANCE.m154220m(str2))) && jyb.m147520m(f96788c, new qcj() { // from class: l.c1f
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(rnlVar.m182282h().equals((String) obj));
            }
        })) {
            return true;
        }
        return ((rnlVar.m182286m().equals("deviceid.tantanapp.com") || rnlVar.m182286m().equals(lhl.INSTANCE.m154222o("deviceid.tantanapp.com")) || rnlVar.m182286m().equals("deviceid.staging.tantantribe.com") || rnlVar.m182286m().equals("deviceid.staging2.p1staff.com")) && jyb.m147520m(f96789d, new qcj() { // from class: l.d1f
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(rnlVar.m182282h().equals((String) obj));
            }
        })) || jyb.m147520m(f96790e, new qcj() { // from class: l.e1f
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Pattern) obj).matcher(rnlVar.m182282h()).matches());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m123571n(InputStream inputStream) throws IOException {
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
    public static byte[] m123572o(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m123573p(byte[] bArr) throws IOException {
        BrotliInputStream brotliInputStream = new BrotliInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArrM123571n = m123571n(brotliInputStream);
            brotliInputStream.close();
            return bArrM123571n;
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
    public static byte[] m123574q(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArrM123571n = m123571n(gZIPInputStream);
            gZIPInputStream.close();
            return bArrM123571n;
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
