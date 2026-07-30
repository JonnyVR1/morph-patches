package com.momo.pipline.codec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.EGLContext;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.core.glcore.util.Log4Cam;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.nio.ByteBuffer;
import p149l.ig3;
import p149l.jix;
import p149l.qjx;
import p149l.vlw;
import p149l.yt10;

/* JADX INFO: renamed from: com.momo.pipline.codec.a */
/* JADX INFO: loaded from: classes6.dex */
public class C4087a extends jix implements yt10 {

    /* JADX INFO: renamed from: l1 */
    private float f14288l1;

    /* JADX INFO: renamed from: m1 */
    private float f14289m1;

    /* JADX INFO: renamed from: n1 */
    private final String f14290n1;

    /* JADX INFO: renamed from: o1 */
    private int f14291o1;

    /* JADX INFO: renamed from: p1 */
    private int f14292p1;

    /* JADX INFO: renamed from: q1 */
    private int f14293q1;

    /* JADX INFO: renamed from: r1 */
    private int f14294r1;

    /* JADX INFO: renamed from: s1 */
    private Object f14295s1;

    /* JADX INFO: renamed from: t1 */
    private MediaMuxer f14296t1;

    /* JADX INFO: renamed from: u1 */
    private String f14297u1;

    /* JADX INFO: renamed from: v1 */
    private boolean f14298v1;

    /* JADX INFO: renamed from: w1 */
    private int f14299w1;

    /* JADX INFO: renamed from: x1 */
    private long f14300x1;

    public C4087a(Context context) {
        super(context);
        this.f14288l1 = Float.MAX_VALUE;
        this.f14289m1 = Float.MAX_VALUE;
        this.f14290n1 = "Filter_RecordFile";
        this.f14291o1 = 0;
        this.f14292p1 = 3;
        this.f14293q1 = -1;
        this.f14294r1 = -1;
        this.f14295s1 = new Object();
        this.f14296t1 = null;
        this.f14300x1 = 0L;
        Log.e("Filter_RecordFile", "init RecorderFilter");
        this.f118169X0 = false;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo19646A() {
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: B1 */
    public boolean mo19751B1(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f14300x1 == 0 && this.f118169X0) {
            this.f14300x1 = System.currentTimeMillis();
        }
        synchronized (this.f14295s1) {
            try {
                if (byteBuffer == null || bufferInfo == null) {
                    Log4Cam.m7323e("Filter_RecordFile", "[writeSampleData] Invalid Parameter !! ByteBuffer or BufferInfo is null");
                    return false;
                }
                if (this.f118169X0) {
                    MediaMuxer mediaMuxer = this.f14296t1;
                    if (mediaMuxer != null) {
                        mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
                    }
                    return true;
                }
                Log4Cam.m7328w("Filter_RecordFile", "Media muxer not started !!, already have media type:" + m19758U2());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C0 */
    public void mo19647C0() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C1 */
    public void mo19648C1(String str) {
    }

    @Override // p149l.jix
    /* JADX INFO: renamed from: G2 */
    public qjx mo19753G2() {
        return new qjx();
    }

    @Override // p149l.yt10
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: H1 */
    public void mo19754H1(int i) {
        Log.e("Filter_RecordFile", "prepared init mMediaMuxer");
        if (this.f14297u1 == null || i < 1 || i > 3) {
            ig3.m135964a("Invalid file path or media track info");
            return;
        }
        try {
            this.f14296t1 = new MediaMuxer(this.f14297u1, 0);
            this.f14292p1 = i;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: K0 */
    public boolean mo19755K0(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: O1 */
    public void mo19756O1() {
    }

    @Override // p149l.jix
    /* JADX INFO: renamed from: Q2 */
    public void mo19757Q2() {
        synchronized (this.f14295s1) {
            Log4Cam.m7328w("Filter_RecordFile", "startMuxing mMediaTrackInfo" + this.f14292p1 + "mAddedMediaTrack" + this.f14291o1);
            if (!this.f118169X0 && this.f14292p1 == this.f14291o1) {
                if (this.f14296t1 != null) {
                    Log4Cam.m7323e("Filter_RecordFile", "setOrientationHint" + this.f14299w1);
                    this.f14296t1.setOrientationHint(this.f14299w1);
                    if (Math.abs(this.f14289m1) <= 180.0f && Math.abs(this.f14288l1) <= 180.0f) {
                        this.f14296t1.setLocation(this.f14288l1, this.f14289m1);
                    }
                    try {
                        this.f14296t1.start();
                        this.f118169X0 = true;
                        this.f14300x1 = 0L;
                    } catch (Exception unused) {
                    }
                }
                return;
            }
            Log4Cam.m7328w("Filter_RecordFile", "Meida info not enough , need waitting, already have " + m19758U2());
        }
    }

    @Override // p149l.jix, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo19655R0(vlw vlwVar, EGLContext eGLContext) {
        super.mo19655R0(vlwVar, eGLContext);
    }

    /* JADX INFO: renamed from: U2 */
    public String m19758U2() {
        int i = this.f14291o1;
        if (i == 1) {
            return "audio";
        }
        return i == 2 ? "video" : "audio/video";
    }

    /* JADX INFO: renamed from: V2 */
    public void m19759V2(String str) {
        this.f14297u1 = str;
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: W */
    public void mo19760W(ByteBuffer byteBuffer) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: b0 */
    public void mo19658b0() {
    }

    @Override // p149l.jix, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo19662f() {
        try {
            super.mo19662f();
            this.f14298v1 = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: f0 */
    public void mo19761f0(ByteBuffer byteBuffer, long j) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    @Override // p149l.yt10
    public boolean isStarting() {
        return this.f118169X0;
    }

    @Override // p149l.yt10
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: k1 */
    public void mo19762k1() {
        Log.e("Filter_RecordFile", "stopMuxing muxer release" + toString());
        synchronized (this.f14295s1) {
            try {
                MediaMuxer mediaMuxer = this.f14296t1;
                if (mediaMuxer != null && this.f118169X0) {
                    this.f14300x1 = 0L;
                    mediaMuxer.stop();
                    this.f14296t1.release();
                    this.f14296t1 = null;
                    this.f118169X0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Log4Cam.m7321d("Filter_RecordFile", "Stop media muxing !" + this.f14292p1);
    }

    @Override // p149l.jix, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: m1 */
    public void mo19665m1(ByteBuffer byteBuffer) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o */
    public void mo19666o() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o1 */
    public boolean mo19667o1(ByteBuffer byteBuffer) {
        return true;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: p */
    public void mo19668p(String str, int i) {
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: p0 */
    public boolean mo19763p0(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: t1 */
    public boolean mo19764t1(ByteBuffer byteBuffer, long j) {
        return true;
    }

    @Override // p149l.jix, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: v0 */
    public void mo19670v0(ByteBuffer byteBuffer) {
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: x0 */
    public int mo19765x0(MediaFormat mediaFormat, int i) {
        int iAddTrack = -1;
        if (mediaFormat == null || i < 1 || i > 2) {
            Log4Cam.m7323e("Filter_RecordFile", "Add media track error ! Invalid parameter ! format=" + mediaFormat + " and track=" + i);
            return -1;
        }
        synchronized (this.f14295s1) {
            try {
                Log.e("Filter_RecordFile", "addMediaTrack " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + toString());
                if (this.f118169X0) {
                    return i;
                }
                MediaMuxer mediaMuxer = this.f14296t1;
                if (mediaMuxer != null) {
                    iAddTrack = mediaMuxer.addTrack(mediaFormat);
                    this.f14291o1 |= i;
                    Log4Cam.m7323e("Filter_RecordFile", "Add track info " + m19758U2());
                    mo19757Q2();
                }
                return iAddTrack;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.jix, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y0 */
    public void mo19672y0(int i, int i2, int i3) {
        super.mo19672y0(i, i2, i3);
    }

    @Override // p149l.yt10
    /* JADX INFO: renamed from: z0 */
    public boolean mo19766z0(ByteBuffer byteBuffer, long j) {
        return true;
    }

    @Override // p149l.jix
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: E2 */
    public yt10 mo19752E2() {
        return this;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo19664l0(vlw vlwVar, EGLContext eGLContext) {
    }
}
