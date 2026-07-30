package p149l;

import com.xiaomi.push.C14784il;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class vuq0 extends yuq0 {

    /* JADX INFO: renamed from: a */
    protected InputStream f183100a = null;

    /* JADX INFO: renamed from: b */
    protected OutputStream f183101b;

    public vuq0(OutputStream outputStream) {
        this.f183101b = outputStream;
    }

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: a */
    public int mo200088a(byte[] bArr, int i, int i2) throws C14784il {
        InputStream inputStream = this.f183100a;
        if (inputStream == null) {
            throw new C14784il(1, "Cannot read from null inputStream");
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            throw new C14784il(4);
        } catch (IOException e) {
            throw new C14784il(0, e);
        }
    }

    @Override // p149l.yuq0
    /* JADX INFO: renamed from: c */
    public void mo200089c(byte[] bArr, int i, int i2) throws C14784il {
        OutputStream outputStream = this.f183101b;
        if (outputStream == null) {
            throw new C14784il(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C14784il(0, e);
        }
    }
}
