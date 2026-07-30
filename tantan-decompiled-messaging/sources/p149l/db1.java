package p149l;

import android.util.Log;
import com.immomo.mediacore.audio.NonBlockingAudioTrack;

/* JADX INFO: loaded from: classes8.dex */
public class db1 {

    /* JADX INFO: renamed from: b */
    private NonBlockingAudioTrack f85282b;

    /* JADX INFO: renamed from: d */
    private int f85284d;

    /* JADX INFO: renamed from: a */
    private Object f85281a = new Object();

    /* JADX INFO: renamed from: c */
    private boolean f85283c = false;

    public db1(int i, int i2) {
        this.f85282b = null;
        this.f85284d = i2;
        Log.e("AudioLoopBack", " startRecord  AudioLoopBack audioSampleRate:" + i + ";mSampleChannels:" + i2);
        synchronized (this.f85281a) {
            try {
                if (this.f85282b == null) {
                    NonBlockingAudioTrack nonBlockingAudioTrack = new NonBlockingAudioTrack(i, i2);
                    this.f85282b = nonBlockingAudioTrack;
                    nonBlockingAudioTrack.play();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m110633a() {
        synchronized (this.f85281a) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.f85282b;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.stop();
                    this.f85282b.release();
                    this.f85282b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m110634b() {
        return this.f85284d;
    }

    /* JADX INFO: renamed from: c */
    public void m110635c(byte[] bArr, int i) {
        if (this.f85283c) {
            return;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        synchronized (this.f85281a) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.f85282b;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.write(bArr2, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
