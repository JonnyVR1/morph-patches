package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C1056a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fzf0 implements wvc0<InputStream, lkj> {

    /* JADX INFO: renamed from: a */
    private final List<ImageHeaderParser> f99960a;

    /* JADX INFO: renamed from: b */
    private final wvc0<ByteBuffer, lkj> f99961b;

    /* JADX INFO: renamed from: c */
    private final h01 f99962c;

    public fzf0(List<ImageHeaderParser> list, wvc0<ByteBuffer, lkj> wvc0Var, h01 h01Var) {
        this.f99960a = list;
        this.f99961b = wvc0Var;
        this.f99962c = h01Var;
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m123842e(InputStream inputStream) {
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

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rvc0<lkj> mo5553b(@NonNull InputStream inputStream, int i, int i2, @NonNull px50 px50Var) throws IOException {
        byte[] bArrM123842e = m123842e(inputStream);
        if (bArrM123842e == null) {
            return null;
        }
        return this.f99961b.mo5553b(ByteBuffer.wrap(bArrM123842e), i, i2, px50Var);
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5552a(@NonNull InputStream inputStream, @NonNull px50 px50Var) throws IOException {
        return !((Boolean) px50Var.m171822c(vkj.f181821b)).booleanValue() && C1056a.m5348d(this.f99960a, inputStream, this.f99962c) == ImageHeaderParser.ImageType.GIF;
    }
}
