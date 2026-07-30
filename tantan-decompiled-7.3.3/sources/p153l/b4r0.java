package p153l;

import com.xiaomi.push.C14932il;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class b4r0 extends e4r0 {

    /* JADX INFO: renamed from: a */
    protected InputStream f74965a = null;

    /* JADX INFO: renamed from: b */
    protected OutputStream f74966b;

    public b4r0(OutputStream outputStream) {
        this.f74966b = outputStream;
    }

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: a */
    public int mo102509a(byte[] bArr, int i, int i2) throws C14932il {
        InputStream inputStream = this.f74965a;
        if (inputStream == null) {
            throw new C14932il(1, "Cannot read from null inputStream");
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            throw new C14932il(4);
        } catch (IOException e) {
            throw new C14932il(0, e);
        }
    }

    @Override // p153l.e4r0
    /* JADX INFO: renamed from: c */
    public void mo102510c(byte[] bArr, int i, int i2) throws C14932il {
        OutputStream outputStream = this.f74966b;
        if (outputStream == null) {
            throw new C14932il(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C14932il(0, e);
        }
    }
}
