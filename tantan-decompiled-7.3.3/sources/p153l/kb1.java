package p153l;

import android.util.Log;
import com.immomo.mediacore.audio.NonBlockingAudioTrack;

/* JADX INFO: loaded from: classes8.dex */
public class kb1 {

    /* JADX INFO: renamed from: b */
    private NonBlockingAudioTrack f124743b;

    /* JADX INFO: renamed from: d */
    private int f124745d;

    /* JADX INFO: renamed from: a */
    private Object f124742a = new Object();

    /* JADX INFO: renamed from: c */
    private boolean f124744c = false;

    public kb1(int i, int i2) {
        this.f124743b = null;
        this.f124745d = i2;
        Log.e("AudioLoopBack", " startRecord  AudioLoopBack audioSampleRate:" + i + ";mSampleChannels:" + i2);
        synchronized (this.f124742a) {
            try {
                if (this.f124743b == null) {
                    NonBlockingAudioTrack nonBlockingAudioTrack = new NonBlockingAudioTrack(i, i2);
                    this.f124743b = nonBlockingAudioTrack;
                    nonBlockingAudioTrack.play();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m149021a() {
        synchronized (this.f124742a) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.f124743b;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.stop();
                    this.f124743b.release();
                    this.f124743b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m149022b() {
        return this.f124745d;
    }

    /* JADX INFO: renamed from: c */
    public void m149023c(byte[] bArr, int i) {
        if (this.f124744c) {
            return;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        synchronized (this.f124742a) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.f124743b;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.write(bArr2, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
