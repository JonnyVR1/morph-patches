package p149l;

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

/* JADX INFO: loaded from: classes8.dex */
public class h0f<T> extends ggi<T> {

    /* JADX INFO: renamed from: k */
    public static final uqd0 f105213k = new uqd0("tantan_file_persistent", "");

    public h0f(ggi.InterfaceC17075b<String> interfaceC17075b, int i, ProtobufAdapter<T> protobufAdapter) {
        super(interfaceC17075b, i, protobufAdapter);
        m128952t();
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m128950r(byte[] bArr, String str) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = StandardCharsets.UTF_8;
        cipher.init(2, new SecretKeySpec(str.getBytes(charset), "AES"), new IvParameterSpec(str.substring(0, 16).getBytes(charset)));
        return cipher.doFinal(bArr);
    }

    @Override // p149l.ggi
    /* JADX INFO: renamed from: e */
    public T mo125968e(FileInputStream fileInputStream) throws Throwable {
        byte[] bArrM125975m = m125975m(fileInputStream);
        try {
            return this.f102509e.get(m128950r(bArrM125975m, f105213k.get()));
        } catch (Exception e) {
            CrashHelper.m81297d(e, 50);
            return this.f102509e.get(bArrM125975m);
        }
    }

    @Override // p149l.ggi
    /* JADX INFO: renamed from: q */
    public byte[] mo125979q(T t) throws IOException {
        byte[] bArrMo125979q = super.mo125979q(t);
        try {
            return m128951s(bArrMo125979q, f105213k.get());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return bArrMo125979q;
        }
    }

    /* JADX INFO: renamed from: s */
    public final byte[] m128951s(byte[] bArr, String str) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = StandardCharsets.UTF_8;
        cipher.init(1, new SecretKeySpec(str.getBytes(charset), "AES"), new IvParameterSpec(str.substring(0, 16).getBytes(charset)));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: t */
    public final void m128952t() {
        uqd0 uqd0Var = f105213k;
        if (TextUtils.isEmpty(uqd0Var.get())) {
            String string = UUID.randomUUID().toString();
            uqd0Var.put(ogw.m164284e(f16.m119092a().getPackageName() + string));
        }
    }
}
