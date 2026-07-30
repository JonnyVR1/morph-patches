package p149l;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(19)
public final class giy0 {

    /* JADX INFO: renamed from: a */
    public final AudioTrack f102981a;

    /* JADX INFO: renamed from: b */
    public final AudioTimestamp f102982b = new AudioTimestamp();

    /* JADX INFO: renamed from: c */
    public long f102983c;

    /* JADX INFO: renamed from: d */
    public long f102984d;

    /* JADX INFO: renamed from: e */
    public long f102985e;

    public giy0(AudioTrack audioTrack) {
        this.f102981a = audioTrack;
    }

    /* JADX INFO: renamed from: a */
    public final long m126418a() {
        return this.f102985e;
    }

    /* JADX INFO: renamed from: b */
    public final long m126419b() {
        return this.f102982b.nanoTime / 1000;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m126420c() {
        boolean timestamp = this.f102981a.getTimestamp(this.f102982b);
        if (timestamp) {
            long j = this.f102982b.framePosition;
            if (this.f102984d > j) {
                this.f102983c++;
            }
            this.f102984d = j;
            this.f102985e = j + (this.f102983c << 32);
        }
        return timestamp;
    }
}
