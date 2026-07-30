package p007l;

import com.immomo.mediacore.audio.AudioProcess;
import java.nio.ByteBuffer;
import l.di70;
import l.ii70;
import l.mpd0;
import l.wb1;
import l.ya1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class m300 implements ya1 {

    /* JADX INFO: renamed from: b */
    protected int f3276b;

    /* JADX INFO: renamed from: d */
    public int f3278d;

    /* JADX INFO: renamed from: f */
    public int f3280f;

    /* JADX INFO: renamed from: g */
    protected ByteBuffer f3281g;

    /* JADX INFO: renamed from: h */
    protected AudioProcess f3282h;

    /* JADX INFO: renamed from: i */
    private wb1 f3283i;

    /* JADX INFO: renamed from: a */
    private Object f3275a = new Object();

    /* JADX INFO: renamed from: c */
    private int f3277c = 0;

    /* JADX INFO: renamed from: e */
    public int f3279e = 16;

    /* JADX INFO: renamed from: j */
    public ya1 f3284j = null;

    /* JADX INFO: renamed from: k */
    protected boolean f3285k = false;

    public m300(int i, int i2, int i3, boolean z) {
        this.f3276b = i;
        this.f3278d = i2;
        this.f3280f = i3;
        if (!z) {
            this.f3283i = new wb1();
        } else if (this.f3282h == null) {
            AudioProcess audioProcess = new AudioProcess();
            this.f3282h = audioProcess;
            audioProcess.openSabineEf(i2, i3, this.f3276b / 2);
            this.f3282h.setSlaveAudioGain(1.0f);
            this.f3282h.setSlaveAudioLevel(1.0f);
            this.f3282h.setMasterAudioLevel(1.0f);
        }
        this.f3281g = ByteBuffer.allocate(this.f3276b);
    }

    /* JADX INFO: renamed from: n2 */
    private ByteBuffer m9855n2(mpd0 mpd0Var, mpd0 mpd0Var2) {
        byte[] bArrC = mpd0Var != null ? mpd0Var.c() : null;
        if (bArrC == null || mpd0Var2 == null || mpd0Var2.c() == null || mpd0Var2.e != mpd0Var.e) {
            return null;
        }
        return this.f3282h.normalize_mix(mpd0Var2.c(), bArrC, mpd0Var2.e);
    }

    /* JADX INFO: renamed from: o2 */
    public static byte[] m9856o2(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i * 2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 * 4;
            byte b = bArr[i2];
            bArr2[i4 + 2] = b;
            bArr2[i4] = b;
            byte b2 = bArr[i2 + 1];
            bArr2[i4 + 3] = b2;
            bArr2[i4 + 1] = b2;
            i2 += 2;
            i3++;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: q2 */
    public static byte[] m9857q2(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i / 2];
        for (int i2 = 0; i2 < i / 4; i2++) {
            int i3 = i2 * 2;
            int i4 = i2 * 4;
            bArr2[i3] = bArr[i4];
            bArr2[i3 + 1] = bArr[i4 + 1];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: C */
    public mpd0 mo345C(mpd0 mpd0Var) {
        AudioProcess audioProcess = this.f3282h;
        ByteBuffer byteBufferM9855n2 = audioProcess != null ? m9855n2(audioProcess.getSurroundData(), mpd0Var) : null;
        wb1 wb1Var = this.f3283i;
        if (wb1Var != null) {
            byteBufferM9855n2 = m9855n2(wb1Var.g(), mpd0Var);
        }
        synchronized (this.f3275a) {
            try {
                ya1 ya1Var = this.f3284j;
                if (ya1Var != null) {
                    if (this.f3280f == 1) {
                        byte[] bArrM9856o2 = byteBufferM9855n2 != null ? m9856o2(byteBufferM9855n2.array(), byteBufferM9855n2.array().length) : m9856o2(mpd0Var.c(), mpd0Var.e());
                        if (bArrM9856o2 != null) {
                            this.f3284j.C(new mpd0(bArrM9856o2, bArrM9856o2.length, this.f3280f));
                        }
                    } else if (byteBufferM9855n2 != null) {
                        ya1Var.C(new mpd0(byteBufferM9855n2.array(), byteBufferM9855n2.array().length, this.f3280f));
                    } else {
                        ya1Var.C(mpd0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteBufferM9855n2 != null ? new mpd0(byteBufferM9855n2, mpd0Var.d(), this.f3280f) : mpd0Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void m9858G0(byte[] bArr, int i, int i2, Object obj, int i3) {
        int i4;
        ii70.d().c("ExtAudioWrapper", "onPcmDateCallback:" + bArr.length + ";recording: mRemainAudioIndex=" + this.f3277c + ";" + this.f3276b);
        if (i3 != 0 && i3 != (i4 = this.f3280f)) {
            bArr = i4 == 2 ? m9856o2(bArr, bArr.length) : m9857q2(bArr, bArr.length);
        }
        int length = bArr.length + this.f3277c;
        int i5 = 0;
        while (true) {
            try {
                int i6 = this.f3276b;
                if (length < i6) {
                    break;
                }
                if (this.f3277c > 0) {
                    byte[] bArr2 = new byte[i6];
                    this.f3281g.rewind();
                    this.f3281g.get(bArr2, 0, this.f3277c);
                    this.f3281g.clear();
                    ii70.d().c("ExtAudioWrapper", "mRemainAudioIndex > 0 arraycopy :" + i5 + ";mRemainAudioIndex:" + this.f3277c);
                    int i7 = this.f3277c;
                    System.arraycopy(bArr, i5, bArr2, i7, this.f3276b - i7);
                    int i8 = this.f3276b;
                    i5 += i8 - this.f3277c;
                    length -= i8;
                    if (this.f3282h != null) {
                        ii70.d().c("ExtAudioWrapper", "mRemainAudioIndex > 0 putSurroundData :" + i5 + ";lens:" + length);
                        this.f3282h.putSurroundData(new mpd0(bArr2, System.nanoTime() / 1000, this.f3280f));
                    } else {
                        wb1 wb1Var = this.f3283i;
                        if (wb1Var != null) {
                            wb1Var.i(new mpd0(bArr2, System.nanoTime() / 1000, this.f3280f));
                        }
                    }
                    this.f3277c = 0;
                } else {
                    byte[] bArr3 = new byte[i6];
                    System.arraycopy(bArr, i5, bArr3, 0, i6);
                    if (this.f3282h != null) {
                        ii70.d().c("ExtAudioWrapper", "mRemainAudioIndex == 0 putSurroundData pos :" + i5 + ";lens:" + length);
                        this.f3282h.putSurroundData(new mpd0(bArr3, System.nanoTime() / 1000, this.f3280f));
                    } else {
                        wb1 wb1Var2 = this.f3283i;
                        if (wb1Var2 != null) {
                            wb1Var2.i(new mpd0(bArr3, System.nanoTime() / 1000, this.f3280f));
                        }
                    }
                    int i9 = this.f3276b;
                    length -= i9;
                    i5 += i9;
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.f3277c = 0;
                this.f3281g.clear();
                ii70.d().c("ExtAudioWrapper", "onMediaDateCallback:exception;" + di70.d());
                return;
            }
        }
        if (length >= bArr.length && i5 == 0) {
            this.f3281g.put(bArr, 0, bArr.length);
            this.f3277c += bArr.length;
            ii70.d().c("ExtAudioWrapper", "mRemainAudio.put: pos:" + i5 + ";lens:" + this.f3277c);
            return;
        }
        if (length > 0) {
            this.f3281g.put(bArr, i5, length);
            this.f3277c += length;
            ii70.d().c("ExtAudioWrapper", "mRemainAudio.put:pos:" + i5 + ";lens:" + this.f3277c);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m9859R(ya1 ya1Var) {
        this.f3284j = ya1Var;
    }

    /* JADX INFO: renamed from: W1 */
    public void mo367W1(float f) {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void mo370a1() {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.clear();
        }
        wb1 wb1Var = this.f3283i;
        if (wb1Var != null) {
            wb1Var.f();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m9860g0(float f) {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.setMasterAudioLevel(f);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public void mo390p2() {
        synchronized (this.f3275a) {
            this.f3284j = null;
        }
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
            this.f3282h.release();
        }
        wb1 wb1Var = this.f3283i;
        if (wb1Var != null) {
            wb1Var.f();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public void m9861r2() {
        AudioProcess audioProcess = this.f3282h;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        wb1 wb1Var = this.f3283i;
        if (wb1Var != null) {
            wb1Var.f();
        }
    }
}
