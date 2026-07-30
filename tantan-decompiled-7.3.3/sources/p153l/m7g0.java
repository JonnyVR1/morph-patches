package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C1062a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m7g0 implements z3d0<InputStream, bnj> {

    /* JADX INFO: renamed from: a */
    private final List<ImageHeaderParser> f135077a;

    /* JADX INFO: renamed from: b */
    private final z3d0<ByteBuffer, bnj> f135078b;

    /* JADX INFO: renamed from: c */
    private final o01 f135079c;

    public m7g0(List<ImageHeaderParser> list, z3d0<ByteBuffer, bnj> z3d0Var, o01 o01Var) {
        this.f135077a = list;
        this.f135078b = z3d0Var;
        this.f135079c = o01Var;
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m157281e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            return null;
        }
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u3d0<bnj> mo5554b(@NonNull InputStream inputStream, int i, int i2, @NonNull u560 u560Var) throws IOException {
        byte[] bArrM157281e = m157281e(inputStream);
        if (bArrM157281e == null) {
            return null;
        }
        return this.f135078b.mo5554b(ByteBuffer.wrap(bArrM157281e), i, i2, u560Var);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull InputStream inputStream, @NonNull u560 u560Var) throws IOException {
        return !((Boolean) u560Var.m194542c(lnj.f132826b)).booleanValue() && C1062a.m5363f(this.f135077a, inputStream, this.f135079c) == ImageHeaderParser.ImageType.GIF;
    }
}
