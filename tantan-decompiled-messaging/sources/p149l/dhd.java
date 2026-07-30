package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class dhd {

    /* JADX INFO: renamed from: a */
    public int f86262a;

    /* JADX INFO: renamed from: b */
    public int f86263b;

    /* JADX INFO: renamed from: c */
    public int f86264c;

    /* JADX INFO: renamed from: d */
    public int f86265d;

    /* JADX INFO: renamed from: e */
    public int f86266e;

    /* JADX INFO: renamed from: f */
    public int f86267f;

    /* JADX INFO: renamed from: g */
    public int f86268g;

    /* JADX INFO: renamed from: h */
    public int f86269h;

    /* JADX INFO: renamed from: i */
    public int f86270i;

    /* JADX INFO: renamed from: j */
    public int f86271j;

    /* JADX INFO: renamed from: k */
    public long f86272k;

    /* JADX INFO: renamed from: l */
    public int f86273l;

    /* JADX INFO: renamed from: a */
    public void m111815a(long j) {
        m111816b(j, 1);
    }

    /* JADX INFO: renamed from: b */
    public final void m111816b(long j, int i) {
        this.f86272k += j;
        this.f86273l += i;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m111817c() {
    }

    public String toString() {
        return vck0.m197793D("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f86262a), Integer.valueOf(this.f86263b), Integer.valueOf(this.f86264c), Integer.valueOf(this.f86265d), Integer.valueOf(this.f86266e), Integer.valueOf(this.f86267f), Integer.valueOf(this.f86268g), Integer.valueOf(this.f86269h), Integer.valueOf(this.f86270i), Integer.valueOf(this.f86271j), Long.valueOf(this.f86272k), Integer.valueOf(this.f86273l));
    }
}
