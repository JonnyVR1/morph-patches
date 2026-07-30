package p153l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public interface g220 {
    /* JADX INFO: renamed from: B1 */
    boolean mo20750B1(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: H1 */
    void mo20753H1(int i);

    /* JADX INFO: renamed from: K0 */
    boolean mo20754K0(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: O1 */
    void mo20755O1();

    /* JADX INFO: renamed from: W */
    void mo20759W(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: f0 */
    void mo20760f0(ByteBuffer byteBuffer, long j);

    boolean isStarting();

    /* JADX INFO: renamed from: k1 */
    void mo20761k1();

    /* JADX INFO: renamed from: p0 */
    boolean mo20762p0(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: t1 */
    boolean mo20763t1(ByteBuffer byteBuffer, long j);

    /* JADX INFO: renamed from: x0 */
    int mo20764x0(MediaFormat mediaFormat, int i);

    /* JADX INFO: renamed from: z0 */
    boolean mo20765z0(ByteBuffer byteBuffer, long j);
}
