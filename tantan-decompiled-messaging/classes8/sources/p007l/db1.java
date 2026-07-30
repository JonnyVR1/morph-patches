package p007l;

import android.util.Log;
import com.immomo.mediacore.audio.NonBlockingAudioTrack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class db1 {

    /* JADX INFO: renamed from: b */
    private NonBlockingAudioTrack f2518b;

    /* JADX INFO: renamed from: d */
    private int f2520d;

    /* JADX INFO: renamed from: a */
    private Object f2517a = new Object();

    /* JADX INFO: renamed from: c */
    private boolean f2519c = false;

    public db1(int i, int i2) {
        this.f2518b = null;
        this.f2520d = i2;
        Log.e("AudioLoopBack", " startRecord  AudioLoopBack audioSampleRate:" + i + ";mSampleChannels:" + i2);
        synchronized (this.f2517a) {
            try {
                if (this.f2518b == null) {
                    NonBlockingAudioTrack nonBlockingAudioTrack = new NonBlockingAudioTrack(i, i2);
                    this.f2518b = nonBlockingAudioTrack;
                    nonBlockingAudioTrack.play();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m8879a() {
        synchronized (this.f2517a) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.f2518b;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.stop();
                    this.f2518b.release();
                    this.f2518b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m8880b() {
        return this.f2520d;
    }

    /* JADX INFO: renamed from: c */
    public void m8881c(byte[] bArr, int i) {
        if (this.f2519c) {
            return;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        synchronized (this.f2517a) {
            try {
                NonBlockingAudioTrack nonBlockingAudioTrack = this.f2518b;
                if (nonBlockingAudioTrack != null) {
                    nonBlockingAudioTrack.write(bArr2, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
