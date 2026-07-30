package p153l;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(19)
public final class mry0 {

    /* JADX INFO: renamed from: a */
    public final AudioTrack f138428a;

    /* JADX INFO: renamed from: b */
    public final AudioTimestamp f138429b = new AudioTimestamp();

    /* JADX INFO: renamed from: c */
    public long f138430c;

    /* JADX INFO: renamed from: d */
    public long f138431d;

    /* JADX INFO: renamed from: e */
    public long f138432e;

    public mry0(AudioTrack audioTrack) {
        this.f138428a = audioTrack;
    }

    /* JADX INFO: renamed from: a */
    public final long m159716a() {
        return this.f138432e;
    }

    /* JADX INFO: renamed from: b */
    public final long m159717b() {
        return this.f138429b.nanoTime / 1000;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m159718c() {
        boolean timestamp = this.f138428a.getTimestamp(this.f138429b);
        if (timestamp) {
            long j = this.f138429b.framePosition;
            if (this.f138431d > j) {
                this.f138430c++;
            }
            this.f138431d = j;
            this.f138432e = j + (this.f138430c << 32);
        }
        return timestamp;
    }
}
