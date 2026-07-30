package p007l;

import android.text.TextUtils;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l.f16;
import l.ogw;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class h0f<T> extends ggi<T> {

    /* JADX INFO: renamed from: k */
    public static final uqd0 f2805k = new uqd0("tantan_file_persistent", "");

    public h0f(ggi.InterfaceC0552b<String> interfaceC0552b, int i, ProtobufAdapter<T> protobufAdapter) {
        super(interfaceC0552b, i, protobufAdapter);
        m9290t();
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m9288r(byte[] bArr, String str) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = StandardCharsets.UTF_8;
        cipher.init(2, new SecretKeySpec(str.getBytes(charset), "AES"), new IvParameterSpec(str.substring(0, 16).getBytes(charset)));
        return cipher.doFinal(bArr);
    }

    @Override // p007l.ggi
    /* JADX INFO: renamed from: e */
    public T mo9258e(FileInputStream fileInputStream) throws Throwable {
        byte[] bArrM9265m = m9265m(fileInputStream);
        try {
            return (T) this.f2774e.get(m9288r(bArrM9265m, (String) f2805k.get()));
        } catch (Exception e) {
            CrashHelper.d(e, 50);
            return (T) this.f2774e.get(bArrM9265m);
        }
    }

    @Override // p007l.ggi
    /* JADX INFO: renamed from: q */
    public byte[] mo9269q(T t) throws IOException {
        byte[] bArrMo9269q = super.mo9269q(t);
        try {
            return m9289s(bArrMo9269q, (String) f2805k.get());
        } catch (Exception e) {
            CrashHelper.c(e);
            return bArrMo9269q;
        }
    }

    /* JADX INFO: renamed from: s */
    public final byte[] m9289s(byte[] bArr, String str) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = StandardCharsets.UTF_8;
        cipher.init(1, new SecretKeySpec(str.getBytes(charset), "AES"), new IvParameterSpec(str.substring(0, 16).getBytes(charset)));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: t */
    public final void m9290t() {
        uqd0 uqd0Var = f2805k;
        if (TextUtils.isEmpty((String) uqd0Var.get())) {
            String string = UUID.randomUUID().toString();
            uqd0Var.put(ogw.e(f16.a().getPackageName() + string));
        }
    }
}
