package p153l;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.momoap.pitchshift.PitchShift;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class rb1 extends bc1 {

    /* JADX INFO: renamed from: i */
    private PitchShift f161965i;

    /* JADX INFO: renamed from: j */
    private ByteBuffer f161966j;

    /* JADX INFO: renamed from: k */
    private ByteBuffer f161967k;

    /* JADX INFO: renamed from: l */
    byte[] f161968l;

    /* JADX INFO: renamed from: m */
    byte[] f161969m;

    /* JADX INFO: renamed from: d */
    private String f161960d = "AudioPitchShiftProcessor";

    /* JADX INFO: renamed from: e */
    private final int f161961e = -100;

    /* JADX INFO: renamed from: f */
    private final int f161962f = -101;

    /* JADX INFO: renamed from: g */
    private boolean f161963g = false;

    /* JADX INFO: renamed from: n */
    private boolean f161970n = false;

    /* JADX INFO: renamed from: o */
    Object f161971o = new Object();

    /* JADX INFO: renamed from: p */
    private String f161972p = null;

    /* JADX INFO: renamed from: q */
    private spw f161973q = null;

    /* JADX INFO: renamed from: h */
    private ByteBuffer f161964h = ByteBuffer.allocate(5767168);

    /* JADX INFO: renamed from: e */
    private ByteBuffer m180721e(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        if (byteBuffer == null || byteBuffer2 == null || i == 0) {
            return null;
        }
        byte[] bArr = this.f161968l;
        if (bArr == null || bArr.length < i) {
            this.f161968l = new byte[i];
        }
        byte[] bArr2 = this.f161969m;
        if (bArr2 == null || bArr2.length < i) {
            this.f161969m = new byte[i];
        }
        byte[] bArr3 = this.f161968l;
        byte[] bArr4 = this.f161969m;
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

    @Override // p153l.bc1
    /* JADX INFO: renamed from: b */
    public ad60 mo103472b(ad60 ad60Var, int i, long j) {
        ByteBuffer byteBuffer = this.f161966j;
        if (byteBuffer == null || i > byteBuffer.capacity()) {
            this.f161966j = ByteBuffer.allocate(i);
        }
        ByteBuffer byteBuffer2 = this.f161967k;
        if (byteBuffer2 == null || i > byteBuffer2.capacity()) {
            this.f161967k = ByteBuffer.allocate(i);
        }
        ByteBuffer byteBufferM97015a = ad60Var.m97015a();
        byteBufferM97015a.position(0);
        byteBufferM97015a.get(this.f161966j.array(), 0, i);
        int iRemaining = this.f161964h.remaining();
        ByteBuffer byteBuffer3 = this.f161967k;
        if (iRemaining > 0) {
            byteBuffer3.clear();
            this.f161964h.get(this.f161967k.array());
        } else {
            byteBuffer3.clear();
        }
        this.f161967k.position(0);
        this.f161966j.position(0);
        m180721e(this.f161966j, this.f161967k, i);
        ad60Var.m97019e(this.f161966j);
        return ad60Var;
    }

    @Override // p153l.bc1
    /* JADX INFO: renamed from: c */
    public boolean mo103473c() {
        MDLog.m7449i(MDLogTag.AUDIO_PITCH_TAG, "Audio pitch reset !!!");
        ByteBuffer byteBuffer = this.f161964h;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        return super.mo103473c();
    }

    /* JADX INFO: renamed from: f */
    public void m180722f() {
        MDLog.m7449i(MDLogTag.AUDIO_PITCH_TAG, "Audio pitch release !!!");
        this.f161965i = null;
        this.f161970n = true;
        synchronized (this.f161971o) {
            PitchShift.pitchRelease();
        }
        if (this.f161973q != null) {
            this.f161973q = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m180723g(long j, long j2) {
        MDLog.m7449i(MDLogTag.AUDIO_PITCH_TAG, "Audio pitch seek time = " + j + " mTotalDuration = " + j2);
        ByteBuffer byteBuffer = this.f161964h;
        if (byteBuffer == null || this.f76086a == 0 || this.f76088c == 0) {
            return;
        }
        int length = (int) ((j / j2) * byteBuffer.array().length);
        this.f161964h.position(length - (length % this.f76086a));
    }
}
