package p153l;

import com.immomo.mediacore.audio.AudioProcess;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class jc00 implements fb1 {

    /* JADX INFO: renamed from: b */
    protected int f120006b;

    /* JADX INFO: renamed from: d */
    public int f120008d;

    /* JADX INFO: renamed from: f */
    public int f120010f;

    /* JADX INFO: renamed from: g */
    protected ByteBuffer f120011g;

    /* JADX INFO: renamed from: h */
    protected AudioProcess f120012h;

    /* JADX INFO: renamed from: i */
    private dc1 f120013i;

    /* JADX INFO: renamed from: a */
    private Object f120005a = new Object();

    /* JADX INFO: renamed from: c */
    private int f120007c = 0;

    /* JADX INFO: renamed from: e */
    public int f120009e = 16;

    /* JADX INFO: renamed from: j */
    public fb1 f120014j = null;

    /* JADX INFO: renamed from: k */
    protected boolean f120015k = false;

    public jc00(int i, int i2, int i3, boolean z) {
        this.f120006b = i;
        this.f120008d = i2;
        this.f120010f = i3;
        if (!z) {
            this.f120013i = new dc1();
        } else if (this.f120012h == null) {
            AudioProcess audioProcess = new AudioProcess();
            this.f120012h = audioProcess;
            audioProcess.openSabineEf(i2, i3, this.f120006b / 2);
            this.f120012h.setSlaveAudioGain(1.0f);
            this.f120012h.setSlaveAudioLevel(1.0f);
            this.f120012h.setMasterAudioLevel(1.0f);
        }
        this.f120011g = ByteBuffer.allocate(this.f120006b);
    }

    /* JADX INFO: renamed from: n2 */
    private ByteBuffer m144335n2(oxd0 oxd0Var, oxd0 oxd0Var2) {
        byte[] bArrM169687c = oxd0Var != null ? oxd0Var.m169687c() : null;
        if (bArrM169687c == null || oxd0Var2 == null || oxd0Var2.m169687c() == null || oxd0Var2.f149642e != oxd0Var.f149642e) {
            return null;
        }
        return this.f120012h.normalize_mix(oxd0Var2.m169687c(), bArrM169687c, oxd0Var2.f149642e);
    }

    /* JADX INFO: renamed from: o2 */
    public static byte[] m144336o2(byte[] bArr, int i) {
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
    public static byte[] m144337q2(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i / 2];
        for (int i2 = 0; i2 < i / 4; i2++) {
            int i3 = i2 * 2;
            int i4 = i2 * 4;
            bArr2[i3] = bArr[i4];
            bArr2[i3 + 1] = bArr[i4 + 1];
        }
        return bArr2;
    }

    @Override // p153l.fb1
    /* JADX INFO: renamed from: C */
    public oxd0 mo19373C(oxd0 oxd0Var) {
        AudioProcess audioProcess = this.f120012h;
        ByteBuffer byteBufferM144335n2 = audioProcess != null ? m144335n2(audioProcess.getSurroundData(), oxd0Var) : null;
        dc1 dc1Var = this.f120013i;
        if (dc1Var != null) {
            byteBufferM144335n2 = m144335n2(dc1Var.m115189g(), oxd0Var);
        }
        synchronized (this.f120005a) {
            try {
                fb1 fb1Var = this.f120014j;
                if (fb1Var != null) {
                    if (this.f120010f == 1) {
                        byte[] bArrM144336o2 = byteBufferM144335n2 != null ? m144336o2(byteBufferM144335n2.array(), byteBufferM144335n2.array().length) : m144336o2(oxd0Var.m169687c(), oxd0Var.m169689e());
                        if (bArrM144336o2 != null) {
                            this.f120014j.mo19373C(new oxd0(bArrM144336o2, bArrM144336o2.length, this.f120010f));
                        }
                    } else if (byteBufferM144335n2 != null) {
                        fb1Var.mo19373C(new oxd0(byteBufferM144335n2.array(), byteBufferM144335n2.array().length, this.f120010f));
                    } else {
                        fb1Var.mo19373C(oxd0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteBufferM144335n2 != null ? new oxd0(byteBufferM144335n2, oxd0Var.m169688d(), this.f120010f) : oxd0Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void m144338G0(byte[] bArr, int i, int i2, Object obj, int i3) {
        int i4;
        oq70.m168791d().m168795c("ExtAudioWrapper", "onPcmDateCallback:" + bArr.length + ";recording: mRemainAudioIndex=" + this.f120007c + Constants.PACKNAME_END + this.f120006b);
        if (i3 != 0 && i3 != (i4 = this.f120010f)) {
            bArr = i4 == 2 ? m144336o2(bArr, bArr.length) : m144337q2(bArr, bArr.length);
        }
        int length = bArr.length + this.f120007c;
        int i5 = 0;
        while (true) {
            try {
                int i6 = this.f120006b;
                if (length < i6) {
                    break;
                }
                if (this.f120007c > 0) {
                    byte[] bArr2 = new byte[i6];
                    this.f120011g.rewind();
                    this.f120011g.get(bArr2, 0, this.f120007c);
                    this.f120011g.clear();
                    oq70.m168791d().m168795c("ExtAudioWrapper", "mRemainAudioIndex > 0 arraycopy :" + i5 + ";mRemainAudioIndex:" + this.f120007c);
                    int i7 = this.f120007c;
                    System.arraycopy(bArr, i5, bArr2, i7, this.f120006b - i7);
                    int i8 = this.f120006b;
                    i5 += i8 - this.f120007c;
                    length -= i8;
                    if (this.f120012h != null) {
                        oq70.m168791d().m168795c("ExtAudioWrapper", "mRemainAudioIndex > 0 putSurroundData :" + i5 + ";lens:" + length);
                        this.f120012h.putSurroundData(new oxd0(bArr2, System.nanoTime() / 1000, this.f120010f));
                    } else {
                        dc1 dc1Var = this.f120013i;
                        if (dc1Var != null) {
                            dc1Var.m115191i(new oxd0(bArr2, System.nanoTime() / 1000, this.f120010f));
                        }
                    }
                    this.f120007c = 0;
                } else {
                    byte[] bArr3 = new byte[i6];
                    System.arraycopy(bArr, i5, bArr3, 0, i6);
                    if (this.f120012h != null) {
                        oq70.m168791d().m168795c("ExtAudioWrapper", "mRemainAudioIndex == 0 putSurroundData pos :" + i5 + ";lens:" + length);
                        this.f120012h.putSurroundData(new oxd0(bArr3, System.nanoTime() / 1000, this.f120010f));
                    } else {
                        dc1 dc1Var2 = this.f120013i;
                        if (dc1Var2 != null) {
                            dc1Var2.m115191i(new oxd0(bArr3, System.nanoTime() / 1000, this.f120010f));
                        }
                    }
                    int i9 = this.f120006b;
                    length -= i9;
                    i5 += i9;
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.f120007c = 0;
                this.f120011g.clear();
                oq70.m168791d().m168795c("ExtAudioWrapper", "onMediaDateCallback:exception;" + jq70.m146558d());
                return;
            }
        }
        if (length >= bArr.length && i5 == 0) {
            this.f120011g.put(bArr, 0, bArr.length);
            this.f120007c += bArr.length;
            oq70.m168791d().m168795c("ExtAudioWrapper", "mRemainAudio.put: pos:" + i5 + ";lens:" + this.f120007c);
            return;
        }
        if (length > 0) {
            this.f120011g.put(bArr, i5, length);
            this.f120007c += length;
            oq70.m168791d().m168795c("ExtAudioWrapper", "mRemainAudio.put:pos:" + i5 + ";lens:" + this.f120007c);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m144339R(fb1 fb1Var) {
        this.f120014j = fb1Var;
    }

    /* JADX INFO: renamed from: W1 */
    public void mo21100W1(float f) {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void mo21103a1() {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.clear();
        }
        dc1 dc1Var = this.f120013i;
        if (dc1Var != null) {
            dc1Var.m115188f();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m144340g0(float f) {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.setMasterAudioLevel(f);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public void mo21123p2() {
        synchronized (this.f120005a) {
            this.f120014j = null;
        }
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
            this.f120012h.release();
        }
        dc1 dc1Var = this.f120013i;
        if (dc1Var != null) {
            dc1Var.m115188f();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public void m144341r2() {
        AudioProcess audioProcess = this.f120012h;
        if (audioProcess != null) {
            audioProcess.clearSurroundFrames();
        }
        dc1 dc1Var = this.f120013i;
        if (dc1Var != null) {
            dc1Var.m115188f();
        }
    }
}
