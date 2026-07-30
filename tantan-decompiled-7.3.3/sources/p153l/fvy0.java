package p153l;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* JADX INFO: loaded from: classes6.dex */
public final class fvy0 implements zvy0 {

    /* JADX INFO: renamed from: b */
    public final fpw0 f101111b;

    /* JADX INFO: renamed from: c */
    public final fpw0 f101112c;

    /* JADX INFO: renamed from: d */
    public boolean f101113d;

    public fvy0(int i) {
        cvy0 cvy0Var = new cvy0(i);
        dvy0 dvy0Var = new dvy0(i);
        this.f101111b = cvy0Var;
        this.f101112c = dvy0Var;
        this.f101113d = true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ HandlerThread m127746a(int i) {
        return new HandlerThread(ivy0.m142367k(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ HandlerThread m127747b(int i) {
        return new HandlerThread(ivy0.m142367k(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:4:0x001c, B:6:0x0020, B:9:0x0029, B:11:0x0031, B:15:0x004a, B:14:0x003a), top: B:27:0x001c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.hvy0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ivy0] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: c */
    public final ivy0 m127748c(xvy0 xvy0Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        dwy0 nvy0Var;
        int i;
        String str = xvy0Var.f196444a.f111951a;
        ?? r2 = 0;
        r2 = 0;
        try {
            int i2 = mpw0.f137957a;
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (this.f101113d) {
                    sqr0 sqr0Var = xvy0Var.f196446c;
                    if (mpw0.f137957a >= 34 && a8t0.m96496h(sqr0Var.f170251l)) {
                        nvy0Var = new rxy0(mediaCodecCreateByCodecName);
                        i = 4;
                    } else {
                        nvy0Var = new nvy0(mediaCodecCreateByCodecName, m127747b(((dvy0) this.f101112c).f90986a));
                        i = 0;
                    }
                } else {
                    nvy0Var = new nvy0(mediaCodecCreateByCodecName, m127747b(((dvy0) this.f101112c).f90986a));
                    i = 0;
                }
                ivy0 ivy0Var = new ivy0(mediaCodecCreateByCodecName, m127746a(((cvy0) this.f101111b).f84082a), nvy0Var, r2);
                try {
                    Trace.endSection();
                    ivy0.m142366j(ivy0Var, xvy0Var.f196445b, xvy0Var.f196447d, null, i);
                    return ivy0Var;
                } catch (Exception e) {
                    e = e;
                    r2 = ivy0Var;
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
    public final void m127749d(boolean z) {
        this.f101113d = true;
    }
}
