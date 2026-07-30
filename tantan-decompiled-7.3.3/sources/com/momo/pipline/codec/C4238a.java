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
import p153l.g220;
import p153l.grx;
import p153l.nsx;
import p153l.uow;
import p153l.wg3;

/* JADX INFO: renamed from: com.momo.pipline.codec.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4238a extends grx implements g220 {

    /* JADX INFO: renamed from: l1 */
    private float f15007l1;

    /* JADX INFO: renamed from: m1 */
    private float f15008m1;

    /* JADX INFO: renamed from: n1 */
    private final String f15009n1;

    /* JADX INFO: renamed from: o1 */
    private int f15010o1;

    /* JADX INFO: renamed from: p1 */
    private int f15011p1;

    /* JADX INFO: renamed from: q1 */
    private int f15012q1;

    /* JADX INFO: renamed from: r1 */
    private int f15013r1;

    /* JADX INFO: renamed from: s1 */
    private Object f15014s1;

    /* JADX INFO: renamed from: t1 */
    private MediaMuxer f15015t1;

    /* JADX INFO: renamed from: u1 */
    private String f15016u1;

    /* JADX INFO: renamed from: v1 */
    private boolean f15017v1;

    /* JADX INFO: renamed from: w1 */
    private int f15018w1;

    /* JADX INFO: renamed from: x1 */
    private long f15019x1;

    public C4238a(Context context) {
        super(context);
        this.f15007l1 = Float.MAX_VALUE;
        this.f15008m1 = Float.MAX_VALUE;
        this.f15009n1 = "Filter_RecordFile";
        this.f15010o1 = 0;
        this.f15011p1 = 3;
        this.f15012q1 = -1;
        this.f15013r1 = -1;
        this.f15014s1 = new Object();
        this.f15015t1 = null;
        this.f15019x1 = 0L;
        Log.e("Filter_RecordFile", "init RecorderFilter");
        this.f106174X0 = false;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo20645A() {
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: B1 */
    public boolean mo20750B1(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f15019x1 == 0 && this.f106174X0) {
            this.f15019x1 = System.currentTimeMillis();
        }
        synchronized (this.f15014s1) {
            try {
                if (byteBuffer == null || bufferInfo == null) {
                    Log4Cam.m7377e("Filter_RecordFile", "[writeSampleData] Invalid Parameter !! ByteBuffer or BufferInfo is null");
                    return false;
                }
                if (this.f106174X0) {
                    MediaMuxer mediaMuxer = this.f15015t1;
                    if (mediaMuxer != null) {
                        mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
                    }
                    return true;
                }
                Log4Cam.m7382w("Filter_RecordFile", "Media muxer not started !!, already have media type:" + m20757U2());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C0 */
    public void mo20646C0() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C1 */
    public void mo20647C1(String str) {
    }

    @Override // p153l.grx
    /* JADX INFO: renamed from: G2 */
    public nsx mo20752G2() {
        return new nsx();
    }

    @Override // p153l.g220
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: H1 */
    public void mo20753H1(int i) {
        Log.e("Filter_RecordFile", "prepared init mMediaMuxer");
        if (this.f15016u1 == null || i < 1 || i > 3) {
            wg3.m206174a("Invalid file path or media track info");
            return;
        }
        try {
            this.f15015t1 = new MediaMuxer(this.f15016u1, 0);
            this.f15011p1 = i;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: K0 */
    public boolean mo20754K0(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: O1 */
    public void mo20755O1() {
    }

    @Override // p153l.grx
    /* JADX INFO: renamed from: Q2 */
    public void mo20756Q2() {
        synchronized (this.f15014s1) {
            Log4Cam.m7382w("Filter_RecordFile", "startMuxing mMediaTrackInfo" + this.f15011p1 + "mAddedMediaTrack" + this.f15010o1);
            if (!this.f106174X0 && this.f15011p1 == this.f15010o1) {
                if (this.f15015t1 != null) {
                    Log4Cam.m7377e("Filter_RecordFile", "setOrientationHint" + this.f15018w1);
                    this.f15015t1.setOrientationHint(this.f15018w1);
                    if (Math.abs(this.f15008m1) <= 180.0f && Math.abs(this.f15007l1) <= 180.0f) {
                        this.f15015t1.setLocation(this.f15007l1, this.f15008m1);
                    }
                    try {
                        this.f15015t1.start();
                        this.f106174X0 = true;
                        this.f15019x1 = 0L;
                    } catch (Exception unused) {
                    }
                }
                return;
            }
            Log4Cam.m7382w("Filter_RecordFile", "Meida info not enough , need waitting, already have " + m20757U2());
        }
    }

    @Override // p153l.grx, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo20654R0(uow uowVar, EGLContext eGLContext) {
        super.mo20654R0(uowVar, eGLContext);
    }

    /* JADX INFO: renamed from: U2 */
    public String m20757U2() {
        int i = this.f15010o1;
        if (i == 1) {
            return "audio";
        }
        return i == 2 ? "video" : "audio/video";
    }

    /* JADX INFO: renamed from: V2 */
    public void m20758V2(String str) {
        this.f15016u1 = str;
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: W */
    public void mo20759W(ByteBuffer byteBuffer) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: b0 */
    public void mo20657b0() {
    }

    @Override // p153l.grx, com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo20661f() {
        try {
            super.mo20661f();
            this.f15017v1 = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: f0 */
    public void mo20760f0(ByteBuffer byteBuffer, long j) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    @Override // p153l.g220
    public boolean isStarting() {
        return this.f106174X0;
    }

    @Override // p153l.g220
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: k1 */
    public void mo20761k1() {
        Log.e("Filter_RecordFile", "stopMuxing muxer release" + toString());
        synchronized (this.f15014s1) {
            try {
                MediaMuxer mediaMuxer = this.f15015t1;
                if (mediaMuxer != null && this.f106174X0) {
                    this.f15019x1 = 0L;
                    mediaMuxer.stop();
                    this.f15015t1.release();
                    this.f15015t1 = null;
                    this.f106174X0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Log4Cam.m7375d("Filter_RecordFile", "Stop media muxing !" + this.f15011p1);
    }

    @Override // p153l.grx, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: m1 */
    public void mo20664m1(ByteBuffer byteBuffer) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o */
    public void mo20665o() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o1 */
    public boolean mo20666o1(ByteBuffer byteBuffer) {
        return true;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: p */
    public void mo20667p(String str, int i) {
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: p0 */
    public boolean mo20762p0(ByteBuffer byteBuffer) {
        return false;
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: t1 */
    public boolean mo20763t1(ByteBuffer byteBuffer, long j) {
        return true;
    }

    @Override // p153l.grx, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: v0 */
    public void mo20669v0(ByteBuffer byteBuffer) {
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: x0 */
    public int mo20764x0(MediaFormat mediaFormat, int i) {
        int iAddTrack = -1;
        if (mediaFormat == null || i < 1 || i > 2) {
            Log4Cam.m7377e("Filter_RecordFile", "Add media track error ! Invalid parameter ! format=" + mediaFormat + " and track=" + i);
            return -1;
        }
        synchronized (this.f15014s1) {
            try {
                Log.e("Filter_RecordFile", "addMediaTrack " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + toString());
                if (this.f106174X0) {
                    return i;
                }
                MediaMuxer mediaMuxer = this.f15015t1;
                if (mediaMuxer != null) {
                    iAddTrack = mediaMuxer.addTrack(mediaFormat);
                    this.f15010o1 |= i;
                    Log4Cam.m7377e("Filter_RecordFile", "Add track info " + m20757U2());
                    mo20756Q2();
                }
                return iAddTrack;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.grx, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y0 */
    public void mo20671y0(int i, int i2, int i3) {
        super.mo20671y0(i, i2, i3);
    }

    @Override // p153l.g220
    /* JADX INFO: renamed from: z0 */
    public boolean mo20765z0(ByteBuffer byteBuffer, long j) {
        return true;
    }

    @Override // p153l.grx
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: E2 */
    public g220 mo20751E2() {
        return this;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo20663l0(uow uowVar, EGLContext eGLContext) {
    }
}
