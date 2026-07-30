package p149l;

import com.immomo.mediacore.audio.AudioProcess;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class m300 implements ya1 {

    /* JADX INFO: renamed from: b */
    protected int f130958b;

    /* JADX INFO: renamed from: d */
    public int f130960d;

    /* JADX INFO: renamed from: f */
    public int f130962f;

    /* JADX INFO: renamed from: g */
    protected ByteBuffer f130963g;

    /* JADX INFO: renamed from: h */
    protected AudioProcess f130964h;

    /* JADX INFO: renamed from: i */
    private wb1 f130965i;

    /* JADX INFO: renamed from: a */
    private Object f130957a = new Object();

    /* JADX INFO: renamed from: c */
    private int f130959c = 0;

    /* JADX INFO: renamed from: e */
    public int f130961e = 16;

    /* JADX INFO: renamed from: j */
    public ya1 f130966j = null;

    /* JADX INFO: renamed from: k */
    protected boolean f130967k = false;

    public m300(int i, int i2, int i3, boolean z) {
        this.f130958b = i;
        this.f130960d = i2;
        this.f130962f = i3;
        if (!z) {
            this.f130965i = new wb1();
        } else if (this.f130964h == null) {
            AudioProcess audioProcess = new AudioProcess();
            this.f130964h = audioProcess;
            audioProcess.openSabineEf(i2, i3, this.f130958b / 2);
            this.f130964h.setSlaveAudioGain(1.0f);
            this.f130964h.setSlaveAudioLevel(1.0f);
            this.f130964h.setMasterAudioLevel(1.0f);
        }
        this.f130963g = ByteBuffer.allocate(this.f130958b);
    }

    /* JADX INFO: renamed from: n2 */
    private ByteBuffer m152743n2(mpd0 mpd0Var, mpd0 mpd0Var2) {
        byte[] bArrM155800c = mpd0Var != null ? mpd0Var.m155800c() : null;
        if (bArrM155800c == null || mpd0Var2 == null || mpd0Var2.m155800c() == null || mpd0Var2.f135039e != mpd0Var.f135039e) {
            return null;
        }
        return this.f130964h.normalize_mix(mpd0Var2.m155800c(), bArrM155800c, mpd0Var2.f135039e);
    }

    /* JADX INFO: renamed from: o2 */
    public static byte[] m152744o2(byte[] bArr, int i) {
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
    public static byte[] m152745q2(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i / 2];
        for (int i2 = 0; i2 < i / 4; i2++) {
            int i3 = i2 * 2;
            int i4 = i2 * 4;
            bArr2[i3] = bArr[i4];
            bArr2[i3 + 1] = bArr[i4 + 1];
        }
        return bArr2;
    }

    @Override // p149l.ya1
    /* JADX INFO: renamed from: C */
    public mpd0 mo18364C(mpd0 mpd0Var) {
        AudioProcess audioProcess = this.f130964h;
        ByteBuffer byteBufferM152743n2 = audioProcess != null ? m152743n2(audioProcess.getSurroundData(), mpd0Var) : null;
        wb1 wb1Var = this.f130965i;
        if (wb1Var != null) {
            byteBufferM152743n2 = m152743n2(wb1Var.m202491g(), mpd0Var);
        }
        synchronized (this.f130957a) {
            try {
                ya1 ya1Var = this.f130966j;
                if (ya1Var != null) {
                    if (this.f130962f == 1) {
                        byte[] bArrM152744o2 = byteBufferM152743n2 != null ? m152744o2(byteBufferM152743n2.array(), byteBufferM152743n2.array().length) : m152744o2(mpd0Var.m155800c(), mpd0Var.m155802e());
                        if (bArrM152744o2 != null) {
                            this.f130966j.mo18364C(new mpd0(bArrM152744o2, bArrM152744o2.length, this.f130962f));
                        }
                    } else if (byteBufferM152743n2 != null) {
                        ya1Var.mo18364C(new mpd0(byteBufferM152743n2.array(), byteBufferM152743n2.array().length, this.f130962f));
                    } else {
                        ya1Var.mo18364C(mpd0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteBufferM152743n2 != null ? new mpd0(byteBufferM152743n2, mpd0Var.m155801d(), this.f130962f) : mpd0Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void m152746G0(byte[] bArr, int i, int i2, Object obj, int i3) {
        int i4;
        ii70.m136344d().m136348c("ExtAudioWrapper", "onPcmDateCallback:" + bArr.length + ";recording: mRemainAudioIndex=" + this.f130959c + Constants.PACKNAME_END + this.f130958b);
        if (i3 != 0 && i3 != (i4 = this.f130962f)) {
            bArr = i4 == 2 ? m152744o2(bArr, bArr.length) : m152745q2(bArr, bArr.length);
        }
        int length = bArr.length + this.f130959c;
        int i5 = 0;
        while (true) {
            try {
                int i6 = this.f130958b;
                if (length < i6) {
                    break;
                }
                if (this.f130959c > 0) {
                    byte[] bArr2 = new byte[i6];
                    this.f130963g.rewind();
                    this.f130963g.get(bArr2, 0, this.f130959c);
                    this.f130963g.clear();
                    ii70.m136344d().m136348c("ExtAudioWrapper", "mRemainAudioIndex > 0 arraycopy :" + i5 + ";mRemainAudioIndex:" + this.f130959c);
                    int i7 = this.f130959c;
                    System.arraycopy(bArr, i5, bArr2, i7, this.f130958b - i7);
                    int i8 = this.f130958b;
                    i5 += i8 - this.f130959c;
                    length -= i8;
                    if (this.f130964h != null) {
                        ii70.m136344d().m136348c("ExtAudioWrapper", "mRemainAudioIndex > 0 putSurroundData :" + i5 + ";lens:" + length);
                        this.f130964h.putSurroundData(new mpd0(bArr2, System.nanoTime() / 1000, this.f130962f));
                    } else {
                        wb1 wb1Var = this.f130965i;
                        if (wb1Var != null) {
                            wb1Var.m202493i(new mpd0(bArr2, System.nanoTime() / 1000, this.f130962f));
                        }
                    }
                    this.f130959c = 0;
                } else {
                    byte[] bArr3 = new byte[i6];
                    System.arraycopy(bArr, i5, bArr3, 0, i6);
                    if (this.f130964h != null) {
                        ii70.m136344d().m136348c("ExtAudioWrapper", "mRemainAudioIndex == 0 putSurroundData pos :" + i5 + ";lens:" + length);
                        this.f130964h.putSurroundData(new mpd0(bArr3, System.nanoTime() / 1000, this.f130962f));
                    } else {
                        wb1 wb1Var2 = this.f130965i;
                        if (wb1Var2 != null) {
                            wb1Var2.m202493i(new mpd0(bArr3, System.nanoTime() / 1000, this.f130962f));
                        }
                    }
                    int i9 = this.f130958b;
                    length -= i9;
                    i5 += i9;
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.f130959c = 0;
                this.f130963g.clear();
                ii70.m136344d().m136348c("ExtAudioWrapper", "onMediaDateCallback:exception;" + di70.m111867d());
                return;
            }
        }
        if (length >= bArr.length && i5 == 0) {
            this.f130963g.put(bArr, 0, bArr.length);
            this.f130959c += bArr.length;
            ii70.m136344d().m136348c("ExtAudioWrapper", "mRemainAudio.put: pos:" + i5 + ";lens:" + this.f130959c);
            return;
        }
        if (length > 0) {
            this.f130963g.put(bArr, i5, length);
            this.f130959c += length;
            ii70.m136344d().m136348c("ExtAudioWrapper", "mRemainAudio.put:pos:" + i5 + ";lens:" + this.f130959c);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m152747R(ya1 ya1Var) {
        this.f130966j = ya1Var;
    }

    /* JADX INFO: renamed from: W1 */
    public void mo20101W1(float f) {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void mo20104a1() {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.clear();
        }
        wb1 wb1Var = this.f130965i;
        if (wb1Var != null) {
            wb1Var.m202490f();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m152748g0(float f) {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.setMasterAudioLevel(f);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public void mo20124p2() {
        synchronized (this.f130957a) {
            this.f130966j = null;
        }
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
            this.f130964h.release();
        }
        wb1 wb1Var = this.f130965i;
        if (wb1Var != null) {
            wb1Var.m202490f();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public void m152749r2() {
        AudioProcess audioProcess = this.f130964h;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        wb1 wb1Var = this.f130965i;
        if (wb1Var != null) {
            wb1Var.m202490f();
        }
    }
}
