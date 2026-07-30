package p149l;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* JADX INFO: loaded from: classes6.dex */
public final class zly0 implements tmy0 {

    /* JADX INFO: renamed from: b */
    public final zfw0 f203677b;

    /* JADX INFO: renamed from: c */
    public final zfw0 f203678c;

    /* JADX INFO: renamed from: d */
    public boolean f203679d;

    public zly0(int i) {
        wly0 wly0Var = new wly0(i);
        xly0 xly0Var = new xly0(i);
        this.f203677b = wly0Var;
        this.f203678c = xly0Var;
        this.f203679d = true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ HandlerThread m219298a(int i) {
        return new HandlerThread(cmy0.m107721k(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ HandlerThread m219299b(int i) {
        return new HandlerThread(cmy0.m107721k(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:4:0x001c, B:6:0x0020, B:9:0x0029, B:11:0x0031, B:15:0x004a, B:14:0x003a), top: B:27:0x001c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.bmy0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.cmy0] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: c */
    public final cmy0 m219300c(rmy0 rmy0Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        xmy0 hmy0Var;
        int i;
        String str = rmy0Var.f160222a.f76460a;
        ?? r2 = 0;
        r2 = 0;
        try {
            int i2 = ggw0.f102568a;
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (this.f203679d) {
                    mhr0 mhr0Var = rmy0Var.f160224c;
                    if (ggw0.f102568a >= 34 && uys0.m196371h(mhr0Var.f133892l)) {
                        hmy0Var = new loy0(mediaCodecCreateByCodecName);
                        i = 4;
                    } else {
                        hmy0Var = new hmy0(mediaCodecCreateByCodecName, m219299b(((xly0) this.f203678c).f193509a));
                        i = 0;
                    }
                } else {
                    hmy0Var = new hmy0(mediaCodecCreateByCodecName, m219299b(((xly0) this.f203678c).f193509a));
                    i = 0;
                }
                cmy0 cmy0Var = new cmy0(mediaCodecCreateByCodecName, m219298a(((wly0) this.f203677b).f187038a), hmy0Var, r2);
                try {
                    Trace.endSection();
                    cmy0.m107720j(cmy0Var, rmy0Var.f160223b, rmy0Var.f160225d, null, i);
                    return cmy0Var;
                } catch (Exception e) {
                    e = e;
                    r2 = cmy0Var;
                    if (r2 != 0) {
                        r2.zzl();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m219301d(boolean z) {
        this.f203679d = true;
    }
}
