package p149l;

import com.coremedia.iso.boxes.MovieHeaderBox;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tfx0 extends rfx0 implements zor0 {

    /* JADX INFO: renamed from: k */
    public int f170030k;

    public tfx0(String str) {
        super(MovieHeaderBox.TYPE);
    }

    /* JADX INFO: renamed from: f */
    public final int m188752f() {
        if (!this.f159211c) {
            m179151e();
        }
        return this.f170030k;
    }

    /* JADX INFO: renamed from: g */
    public final long m188753g(ByteBuffer byteBuffer) {
        this.f170030k = yor0.m215547c(byteBuffer.get());
        yor0.m215548d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
