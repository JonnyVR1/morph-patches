package p153l;

import com.coremedia.iso.boxes.MovieHeaderBox;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zox0 extends xox0 implements fyr0 {

    /* JADX INFO: renamed from: k */
    public int f205400k;

    public zox0(String str) {
        super(MovieHeaderBox.TYPE);
    }

    /* JADX INFO: renamed from: f */
    public final int m220798f() {
        if (!this.f195614c) {
            m212486e();
        }
        return this.f205400k;
    }

    /* JADX INFO: renamed from: g */
    public final long m220799g(ByteBuffer byteBuffer) {
        this.f205400k = eyr0.m123238c(byteBuffer.get());
        eyr0.m123239d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
