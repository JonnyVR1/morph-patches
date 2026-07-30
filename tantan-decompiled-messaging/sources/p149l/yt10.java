package p149l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public interface yt10 {
    /* JADX INFO: renamed from: B1 */
    boolean mo19751B1(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: H1 */
    void mo19754H1(int i);

    /* JADX INFO: renamed from: K0 */
    boolean mo19755K0(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: O1 */
    void mo19756O1();

    /* JADX INFO: renamed from: W */
    void mo19760W(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: f0 */
    void mo19761f0(ByteBuffer byteBuffer, long j);

    boolean isStarting();

    /* JADX INFO: renamed from: k1 */
    void mo19762k1();

    /* JADX INFO: renamed from: p0 */
    boolean mo19763p0(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: t1 */
    boolean mo19764t1(ByteBuffer byteBuffer, long j);

    /* JADX INFO: renamed from: x0 */
    int mo19765x0(MediaFormat mediaFormat, int i);

    /* JADX INFO: renamed from: z0 */
    boolean mo19766z0(ByteBuffer byteBuffer, long j);
}
