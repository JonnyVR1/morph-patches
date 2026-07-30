package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jid {

    /* JADX INFO: renamed from: a */
    public int f121063a;

    /* JADX INFO: renamed from: b */
    public int f121064b;

    /* JADX INFO: renamed from: c */
    public int f121065c;

    /* JADX INFO: renamed from: d */
    public int f121066d;

    /* JADX INFO: renamed from: e */
    public int f121067e;

    /* JADX INFO: renamed from: f */
    public int f121068f;

    /* JADX INFO: renamed from: g */
    public int f121069g;

    /* JADX INFO: renamed from: h */
    public int f121070h;

    /* JADX INFO: renamed from: i */
    public int f121071i;

    /* JADX INFO: renamed from: j */
    public int f121072j;

    /* JADX INFO: renamed from: k */
    public long f121073k;

    /* JADX INFO: renamed from: l */
    public int f121074l;

    /* JADX INFO: renamed from: a */
    public void m144976a(long j) {
        m144977b(j, 1);
    }

    /* JADX INFO: renamed from: b */
    public final void m144977b(long j, int i) {
        this.f121073k += j;
        this.f121074l += i;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m144978c() {
    }

    public String toString() {
        return bmk0.m105071D("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f121063a), Integer.valueOf(this.f121064b), Integer.valueOf(this.f121065c), Integer.valueOf(this.f121066d), Integer.valueOf(this.f121067e), Integer.valueOf(this.f121068f), Integer.valueOf(this.f121069g), Integer.valueOf(this.f121070h), Integer.valueOf(this.f121071i), Integer.valueOf(this.f121072j), Long.valueOf(this.f121073k), Integer.valueOf(this.f121074l));
    }
}
