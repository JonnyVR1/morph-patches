package p149l;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.momoap.pitchshift.PitchShift;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class kb1 extends ub1 {

    /* JADX INFO: renamed from: i */
    private PitchShift f122170i;

    /* JADX INFO: renamed from: j */
    private ByteBuffer f122171j;

    /* JADX INFO: renamed from: k */
    private ByteBuffer f122172k;

    /* JADX INFO: renamed from: l */
    byte[] f122173l;

    /* JADX INFO: renamed from: m */
    byte[] f122174m;

    /* JADX INFO: renamed from: d */
    private String f122165d = "AudioPitchShiftProcessor";

    /* JADX INFO: renamed from: e */
    private final int f122166e = -100;

    /* JADX INFO: renamed from: f */
    private final int f122167f = -101;

    /* JADX INFO: renamed from: g */
    private boolean f122168g = false;

    /* JADX INFO: renamed from: n */
    private boolean f122175n = false;

    /* JADX INFO: renamed from: o */
    Object f122176o = new Object();

    /* JADX INFO: renamed from: p */
    private String f122177p = null;

    /* JADX INFO: renamed from: q */
    private tmw f122178q = null;

    /* JADX INFO: renamed from: h */
    private ByteBuffer f122169h = ByteBuffer.allocate(5767168);

    /* JADX INFO: renamed from: e */
    private ByteBuffer m145194e(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        if (byteBuffer == null || byteBuffer2 == null || i == 0) {
            return null;
        }
        byte[] bArr = this.f122173l;
        if (bArr == null || bArr.length < i) {
            this.f122173l = new byte[i];
        }
        byte[] bArr2 = this.f122174m;
        if (bArr2 == null || bArr2.length < i) {
            this.f122174m = new byte[i];
        }
        byte[] bArr3 = this.f122173l;
        byte[] bArr4 = this.f122174m;
        byteBuffer.get(bArr3, 0, i);
        byteBuffer2.get(bArr4, 0, i);
        for (int i2 = 0; i2 < i / 2; i2++) {
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            short s = (short) (((short) (((short) (((bArr3[i4] << 8) & 65280) | (bArr3[i3] & 255))) * 0.0f)) + ((short) (((short) (((bArr4[i4] << 8) & 65280) | (bArr4[i3] & 255))) * 1.0f)));
            bArr3[i4] = (byte) ((s >> 8) & 255);
            bArr3[i3] = (byte) (s & 255);
        }
        byteBuffer.clear();
        byteBuffer.put(bArr3);
        byteBuffer.rewind();
        return byteBuffer;
    }

    @Override // p149l.ub1
    /* JADX INFO: renamed from: b */
    public u460 mo130258b(u460 u460Var, int i, long j) {
        ByteBuffer byteBuffer = this.f122171j;
        if (byteBuffer == null || i > byteBuffer.capacity()) {
            this.f122171j = ByteBuffer.allocate(i);
        }
        ByteBuffer byteBuffer2 = this.f122172k;
        if (byteBuffer2 == null || i > byteBuffer2.capacity()) {
            this.f122172k = ByteBuffer.allocate(i);
        }
        ByteBuffer byteBufferM191672a = u460Var.m191672a();
        byteBufferM191672a.position(0);
        byteBufferM191672a.get(this.f122171j.array(), 0, i);
        int iRemaining = this.f122169h.remaining();
        ByteBuffer byteBuffer3 = this.f122172k;
        if (iRemaining > 0) {
            byteBuffer3.clear();
            this.f122169h.get(this.f122172k.array());
        } else {
            byteBuffer3.clear();
        }
        this.f122172k.position(0);
        this.f122171j.position(0);
        m145194e(this.f122171j, this.f122172k, i);
        u460Var.m191676e(this.f122171j);
        return u460Var;
    }

    @Override // p149l.ub1
    /* JADX INFO: renamed from: c */
    public boolean mo130259c() {
        MDLog.m7395i(MDLogTag.AUDIO_PITCH_TAG, "Audio pitch reset !!!");
        ByteBuffer byteBuffer = this.f122169h;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        return super.mo130259c();
    }

    /* JADX INFO: renamed from: f */
    public void m145195f() {
        MDLog.m7395i(MDLogTag.AUDIO_PITCH_TAG, "Audio pitch release !!!");
        this.f122170i = null;
        this.f122175n = true;
        synchronized (this.f122176o) {
            PitchShift.pitchRelease();
        }
        if (this.f122178q != null) {
            this.f122178q = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m145196g(long j, long j2) {
        MDLog.m7395i(MDLogTag.AUDIO_PITCH_TAG, "Audio pitch seek time = " + j + " mTotalDuration = " + j2);
        ByteBuffer byteBuffer = this.f122169h;
        if (byteBuffer == null || this.f175667a == 0 || this.f175669c == 0) {
            return;
        }
        int length = (int) ((j / j2) * byteBuffer.array().length);
        this.f122169h.position(length - (length % this.f175667a));
    }
}
