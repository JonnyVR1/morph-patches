package tv.danmaku.ijk.media.streamer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RecorderParameters {

    /* JADX INFO: renamed from: k */
    private static boolean f12160k = true;

    /* JADX INFO: renamed from: a */
    private int f12161a = 2;

    /* JADX INFO: renamed from: b */
    private int f12162b = 12;

    /* JADX INFO: renamed from: c */
    private int f12163c;

    /* JADX INFO: renamed from: d */
    private int f12164d;

    /* JADX INFO: renamed from: e */
    private int f12165e;

    /* JADX INFO: renamed from: f */
    private int f12166f;

    /* JADX INFO: renamed from: g */
    private int f12167g;

    /* JADX INFO: renamed from: h */
    private String f12168h;

    /* JADX INFO: renamed from: i */
    private int f12169i;

    /* JADX INFO: renamed from: j */
    private int f12170j;

    public final class avcodecType {
    }

    public RecorderParameters() {
        boolean z = f12160k;
        this.f12163c = !z ? 1 : 0;
        this.f12164d = 1;
        this.f12165e = 96000;
        this.f12166f = 1000000;
        this.f12167g = z ? 44100 : 8000;
        this.f12168h = z ? "mp4" : "3gp";
        this.f12169i = 480;
        this.f12170j = 480;
    }
}
