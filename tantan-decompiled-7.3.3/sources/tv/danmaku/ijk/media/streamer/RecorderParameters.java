package tv.danmaku.ijk.media.streamer;

import com.google.android.exoplayer2.PlaybackException;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes3.dex */
public class RecorderParameters {

    /* JADX INFO: renamed from: k */
    private static boolean f209457k = true;

    /* JADX INFO: renamed from: a */
    private int f209458a = 2;

    /* JADX INFO: renamed from: b */
    private int f209459b = 12;

    /* JADX INFO: renamed from: c */
    private int f209460c;

    /* JADX INFO: renamed from: d */
    private int f209461d;

    /* JADX INFO: renamed from: e */
    private int f209462e;

    /* JADX INFO: renamed from: f */
    private int f209463f;

    /* JADX INFO: renamed from: g */
    private int f209464g;

    /* JADX INFO: renamed from: h */
    private String f209465h;

    /* JADX INFO: renamed from: i */
    private int f209466i;

    /* JADX INFO: renamed from: j */
    private int f209467j;

    public final class avcodecType {
    }

    public RecorderParameters() {
        boolean z = f209457k;
        this.f209460c = !z ? 1 : 0;
        this.f209461d = 1;
        this.f209462e = 96000;
        this.f209463f = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        this.f209464g = z ? 44100 : TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.f209465h = z ? "mp4" : "3gp";
        this.f209466i = 480;
        this.f209467j = 480;
    }
}
