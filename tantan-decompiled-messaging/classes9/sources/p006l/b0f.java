package p006l;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.api.Network;
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
import l.cll;
import l.exc0;
import l.gxc0;
import l.hyx;
import l.ibe;
import l.ogw;
import l.pkq0;
import l.ptc0;
import l.utc0;
import l.vwb;
import l.w9j;
import okio.Buffer;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Deprecated
public class b0f {

    /* JADX INFO: renamed from: a */
    public static final String f8642a = ogw.f("P9mO9X1N5gZ4W6yFwnFdElykFu03MWhngr0eNHSYH4Am7HCYjh", true);

    /* JADX INFO: renamed from: b */
    public static List<String> f8643b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static List<String> f8644c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static List<String> f8645d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static List<Pattern> f8646e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static volatile boolean f8647f;

    static {
        f8643b.add("/v2/phone/verify");
        f8643b.add("/v2/email/verify");
        f8643b.add("/v2/phone/code/send");
        f8643b.add("/v2/email/code/send");
        f8643b.add("/v2/phone/code/verify");
        f8643b.add("/v2/email/code/verify");
        f8643b.add("/v2/phone/stage/signup");
        f8643b.add("/v2/email/stage/signup");
        f8643b.add("/v2/ttt-signup");
        f8643b.add("/v2/ttc/tokenSignin");
        f8643b.add("/v2/ttt-token-signin");
        f8643b.add("/v2/phone/signin");
        f8643b.add("/v2/email/signin");
        f8643b.add("/v2/phone/signup");
        f8643b.add("/v2/phone/activate");
        f8643b.add("/v2/email/activate");
        f8643b.add("/v2/thirdparty/signup");
        f8643b.add("/v2/thirdparty/stage/signup");
        f8643b.add("/v2/thirdparty/signin");
        f8643b.add("/v2/thirdparty/activate");
        f8643b.add("/v2/oneclick/signup");
        f8643b.add("/v2/oneclick/stage/signup");
        f8643b.add("/v2/oneclick/signin");
        f8643b.add("/v2/oneclick/activate");
        f8643b.add("/v2/stage/signup/info");
        f8643b.add("/v2/reset-password");
        f8643b.add("/v2/bind-phone");
        f8643b.add("/v2/email/bind");
        f8643b.add("/v2/change-phone");
        f8643b.add("/v2/email/change");
        f8643b.add("/v2/retrieve");
        f8643b.add("/v2/retrieve/code/send");
        f8643b.add("/v2/retrieve/code/verify");
        f8643b.add("/v2/retrieve/identity/verify");
        f8643b.add("/v2/retrieve/verification-tokens");
        f8644c.add("/v2/pois/nearby");
        f8644c.add("/v2/users/me/devices");
        f8644c.add("/v2/users/me/contacts");
        f8644c.add("/v2/users/me/verification-tokens");
        f8644c.add("/v2/users/me/devices/me");
        f8644c.add("/v2/confirmation-code/send");
        f8644c.add("/v2/confirmation-code/verify");
        f8645d.add("/oneid/createid");
        f8645d.add("/abtest/abgroup");
        f8645d.add("/ttt/abtest/abgroup");
        f8646e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/devices"));
        f8646e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/contacts"));
        f8646e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/verification-tokens"));
        f8646e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/devices\\/\\d+"));
        f8646e.add(Pattern.compile("^.*\\/v2\\/users\\/me\\/devices\\/\\d+"));
        f8646e.add(Pattern.compile("^.*\\/v2\\/users\\/\\d+\\/devices\\/me"));
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m12417e(byte[] bArr, String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(bArr, 2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES"), new IvParameterSpec(m12427o(str)));
        return cipher.doFinal(bArrDecode);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static String m12418f(String str, @NonNull String str2) throws Exception {
        return m12419g(str, f8642a, m12422j(str2));
    }

    /* JADX INFO: renamed from: g */
    public static String m12419g(String str, String str2, String str3) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = StandardCharsets.UTF_8;
        cipher.init(1, new SecretKeySpec(str2.getBytes(charset), "AES"), new IvParameterSpec(str3.getBytes(charset)));
        return Base64.encodeToString(cipher.doFinal(str.getBytes(charset)), 2);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static gxc0 m12420h(@NonNull exc0 exc0Var) {
        if (!TextUtils.equals(exc0Var.u("X-Janus-Response-Encrypted"), "1")) {
            return exc0Var.k();
        }
        String strU = exc0Var.u("X-Janus-Cipher-Suite");
        if (!TextUtils.equals(strU, "tt")) {
            ibe.a("not support decrypt suite ", strU);
            return null;
        }
        try {
            byte[] bArrM12426n = m12426n(exc0Var.k().byteStream());
            try {
                byte[] bArrM12421i = m12421i(bArrM12426n, exc0Var.Y().c(Network.AUTH));
                if (TextUtils.equals(exc0Var.u("x-janus-response-raw-encoding"), "br")) {
                    bArrM12421i = m12428p(bArrM12421i);
                } else if (TextUtils.equals(exc0Var.u("x-janus-response-raw-encoding"), "gzip")) {
                    bArrM12421i = m12429q(bArrM12421i);
                }
                int length = bArrM12421i.length;
                return gxc0.create(exc0Var.k().contentType(), bArrM12421i);
            } catch (Throwable th) {
                RuntimeException runtimeException = new RuntimeException("decodeResponse error url=" + exc0Var.Y().k() + ", encryptSrc=" + new String(bArrM12426n, StandardCharsets.UTF_8) + ", auth=" + exc0Var.Y().c(Network.AUTH) + ", encoding=" + exc0Var.u("x-janus-response-raw-encoding"), th);
                CrashHelper.d(runtimeException, 10);
                f8647f = true;
                throw runtimeException;
            }
        } catch (Throwable th2) {
            pkq0.a("decodeResponse readBytes error", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m12421i(byte[] bArr, String str) {
        String strValueOf;
        try {
            long j = new JSONArray(str.replace(Network.MAC, "")).getLong(2);
            if (j > 9999999999999999L) {
                strValueOf = String.valueOf(j);
                try {
                    strValueOf = strValueOf.substring(strValueOf.length() - 16, strValueOf.length());
                } catch (Exception e) {
                    e = e;
                    ptc0.a("decryptWithAuth error，ivPam=", strValueOf, e);
                    return null;
                }
            } else {
                strValueOf = String.format("%016d", Long.valueOf(j));
            }
            return m12417e(bArr, strValueOf, f8642a);
        } catch (Exception e2) {
            e = e2;
            strValueOf = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m12422j(@NonNull String str) {
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
    public static String m12423k(@Nullable utc0 utc0Var) {
        if (utc0Var == null) {
            return null;
        }
        Buffer buffer = new Buffer();
        try {
            utc0Var.writeTo(buffer);
            Charset charsetB = StandardCharsets.UTF_8;
            hyx hyxVarContentType = utc0Var.contentType();
            if (hyxVarContentType != null) {
                charsetB = hyxVarContentType.b(charsetB);
            }
            return buffer.readString(charsetB);
        } catch (IOException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m12424l() {
        return f8647f;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m12425m(final cll cllVar) {
        if (cllVar.toString().startsWith(mu5.f17273v) && vwb.m(f8643b, new w9j() { // from class: l.xze
            public final Object call(Object obj) {
                return Boolean.valueOf(cllVar.h().equals((String) obj));
            }
        })) {
            return true;
        }
        if (cllVar.toString().startsWith(mu5.f17256e) && vwb.m(f8644c, new w9j() { // from class: l.yze
            public final Object call(Object obj) {
                return Boolean.valueOf(cllVar.h().equals((String) obj));
            }
        })) {
            return true;
        }
        return ((cllVar.m().equals("deviceid.tantanapp.com") || cllVar.m().equals("deviceid.tantantribe.com") || cllVar.m().equals("deviceid.staging.tantantribe.com") || cllVar.m().equals("deviceid.staging2.p1staff.com")) && vwb.m(f8645d, new w9j() { // from class: l.zze
            public final Object call(Object obj) {
                return Boolean.valueOf(cllVar.h().equals((String) obj));
            }
        })) || vwb.m(f8646e, new w9j() { // from class: l.a0f
            public final Object call(Object obj) {
                return Boolean.valueOf(((Pattern) obj).matcher(cllVar.h()).matches());
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m12426n(InputStream inputStream) throws IOException {
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
    public static byte[] m12427o(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m12428p(byte[] bArr) throws IOException {
        BrotliInputStream brotliInputStream = new BrotliInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArrM12426n = m12426n(brotliInputStream);
            brotliInputStream.close();
            return bArrM12426n;
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
    public static byte[] m12429q(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArrM12426n = m12426n(gZIPInputStream);
            gZIPInputStream.close();
            return bArrM12426n;
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
