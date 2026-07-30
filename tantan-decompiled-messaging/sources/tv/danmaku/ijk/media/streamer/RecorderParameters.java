package tv.danmaku.ijk.media.streamer;

import com.google.android.exoplayer2.PlaybackException;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes3.dex */
public class RecorderParameters {

    /* JADX INFO: renamed from: k */
    private static boolean f208535k = true;

    /* JADX INFO: renamed from: a */
    private int f208536a = 2;

    /* JADX INFO: renamed from: b */
    private int f208537b = 12;

    /* JADX INFO: renamed from: c */
    private int f208538c;

    /* JADX INFO: renamed from: d */
    private int f208539d;

    /* JADX INFO: renamed from: e */
    private int f208540e;

    /* JADX INFO: renamed from: f */
    private int f208541f;

    /* JADX INFO: renamed from: g */
    private int f208542g;

    /* JADX INFO: renamed from: h */
    private String f208543h;

    /* JADX INFO: renamed from: i */
    private int f208544i;

    /* JADX INFO: renamed from: j */
    private int f208545j;

    public final class avcodecType {
    }

    public RecorderParameters() {
        boolean z = f208535k;
        this.f208538c = !z ? 1 : 0;
        this.f208539d = 1;
        this.f208540e = 96000;
        this.f208541f = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        this.f208542g = z ? 44100 : TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f208543h = z ? "mp4" : "3gp";
        this.f208544i = 480;
        this.f208545j = 480;
    }
}
