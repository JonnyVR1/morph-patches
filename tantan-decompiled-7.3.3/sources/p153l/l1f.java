package p153l;

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
public class l1f<T> extends dji<T> {

    /* JADX INFO: renamed from: k */
    public static final wyd0 f129668k = new wyd0("tantan_file_persistent", "");

    public l1f(dji.InterfaceC16550b<String> interfaceC16550b, int i, ProtobufAdapter<T> protobufAdapter) {
        super(interfaceC16550b, i, protobufAdapter);
        m152472t();
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m152470r(byte[] bArr, String str) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = StandardCharsets.UTF_8;
        cipher.init(2, new SecretKeySpec(str.getBytes(charset), "AES"), new IvParameterSpec(str.substring(0, 16).getBytes(charset)));
        return cipher.doFinal(bArr);
    }

    @Override // p153l.dji
    /* JADX INFO: renamed from: e */
    public T mo116100e(FileInputStream fileInputStream) throws Throwable {
        byte[] bArrM116107m = m116107m(fileInputStream);
        try {
            return this.f88858e.get(m152470r(bArrM116107m, f129668k.get()));
        } catch (Exception e) {
            CrashHelper.m82480d(e, 50);
            return this.f88858e.get(bArrM116107m);
        }
    }

    @Override // p153l.dji
    /* JADX INFO: renamed from: q */
    public byte[] mo116111q(T t) throws IOException {
        byte[] bArrMo116111q = super.mo116111q(t);
        try {
            return m152471s(bArrMo116111q, f129668k.get());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return bArrMo116111q;
        }
    }

    /* JADX INFO: renamed from: s */
    public final byte[] m152471s(byte[] bArr, String str) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        Charset charset = StandardCharsets.UTF_8;
        cipher.init(1, new SecretKeySpec(str.getBytes(charset), "AES"), new IvParameterSpec(str.substring(0, 16).getBytes(charset)));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: t */
    public final void m152472t() {
        wyd0 wyd0Var = f129668k;
        if (TextUtils.isEmpty(wyd0Var.get())) {
            String string = UUID.randomUUID().toString();
            wyd0Var.put(niw.m163315e(k26.m147943a().getPackageName() + string));
        }
    }
}
