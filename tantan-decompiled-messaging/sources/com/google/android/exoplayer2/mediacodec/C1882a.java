package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.mediacodec.C1882a;
import java.nio.ByteBuffer;
import p149l.iwb;
import p149l.j5j0;
import p149l.phg0;
import p149l.t21;
import p149l.tyg0;
import p149l.v21;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.a */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
@Deprecated
public final class C1882a implements InterfaceC1884c {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f7882a;

    /* JADX INFO: renamed from: b */
    public final v21 f7883b;

    /* JADX INFO: renamed from: c */
    public final t21 f7884c;

    /* JADX INFO: renamed from: d */
    public final boolean f7885d;

    /* JADX INFO: renamed from: e */
    public boolean f7886e;

    /* JADX INFO: renamed from: f */
    public int f7887f;

    public C1882a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f7882a = mediaCodec;
        this.f7883b = new v21(handlerThread);
        this.f7884c = new t21(mediaCodec, handlerThread2);
        this.f7885d = z;
        this.f7887f = 0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10472f(C1882a c1882a, InterfaceC1884c.c cVar, MediaCodec mediaCodec, long j, long j2) {
        c1882a.getClass();
        cVar.mo10492a(c1882a, j, j2);
    }

    /* JADX INFO: renamed from: j */
    public static String m10476j(int i) {
        return m10478l(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: renamed from: k */
    public static String m10477k(int i) {
        return m10478l(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: renamed from: l */
    public static String m10478l(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    /* JADX INFO: renamed from: a */
    public boolean mo10479a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    /* JADX INFO: renamed from: b */
    public void mo10480b(int i, int i2, iwb iwbVar, long j, int i3) {
        this.f7884c.m186950n(i, i2, iwbVar, j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    /* JADX INFO: renamed from: c */
    public int mo10481c(MediaCodec.BufferInfo bufferInfo) {
        this.f7884c.m186948l();
        return this.f7883b.m196692d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    /* JADX INFO: renamed from: d */
    public void mo10482d(final InterfaceC1884c.c cVar, Handler handler) {
        m10485n();
        this.f7882a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: l.q21
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C1882a.m10472f(this.f152189a, cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    /* JADX INFO: renamed from: e */
    public int mo10483e() {
        this.f7884c.m186948l();
        return this.f7883b.m196691c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void flush() {
        this.f7884c.m186946i();
        this.f7882a.flush();
        this.f7883b.m196693e();
        this.f7882a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    @Nullable
    public ByteBuffer getInputBuffer(int i) {
        return this.f7882a.getInputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    @Nullable
    public ByteBuffer getOutputBuffer(int i) {
        return this.f7882a.getOutputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public MediaFormat getOutputFormat() {
        return this.f7883b.m196695g();
    }

    /* JADX INFO: renamed from: m */
    public final void m10484m(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
        this.f7883b.m196696h(this.f7882a);
        j5j0.m139865a("configureCodec");
        this.f7882a.configure(mediaFormat, surface, mediaCrypto, i);
        j5j0.m139867c();
        this.f7884c.m186952q();
        j5j0.m139865a("startCodec");
        this.f7882a.start();
        j5j0.m139867c();
        this.f7887f = 1;
    }

    /* JADX INFO: renamed from: n */
    public final void m10485n() {
        if (this.f7885d) {
            try {
                this.f7884c.m186953r();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                phg0.m168968a(e);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f7884c.m186949m(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void release() {
        try {
            if (this.f7887f == 1) {
                this.f7884c.m186951p();
                this.f7883b.m196703o();
            }
            this.f7887f = 2;
        } finally {
            if (!this.f7886e) {
                this.f7882a.release();
                this.f7886e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void releaseOutputBuffer(int i, boolean z) {
        this.f7882a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void setOutputSurface(Surface surface) {
        m10485n();
        this.f7882a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void setParameters(Bundle bundle) {
        m10485n();
        this.f7882a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void setVideoScalingMode(int i) {
        m10485n();
        this.f7882a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void releaseOutputBuffer(int i, long j) {
        this.f7882a.releaseOutputBuffer(i, j);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.a$b */
    public static final class b implements InterfaceC1884c.b {

        /* JADX INFO: renamed from: a */
        public final tyg0<HandlerThread> f7888a;

        /* JADX INFO: renamed from: b */
        public final tyg0<HandlerThread> f7889b;

        /* JADX INFO: renamed from: c */
        public final boolean f7890c;

        public b(final int i, boolean z) {
            this(new tyg0() { // from class: l.r21
                @Override // p149l.tyg0
                public final Object get() {
                    return C1882a.b.m10486b(i);
                }
            }, new tyg0() { // from class: l.s21
                @Override // p149l.tyg0
                public final Object get() {
                    return C1882a.b.m10487c(i);
                }
            }, z);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ HandlerThread m10486b(int i) {
            return new HandlerThread(C1882a.m10476j(i));
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ HandlerThread m10487c(int i) {
            return new HandlerThread(C1882a.m10477k(i));
        }

        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1882a mo10488a(InterfaceC1884c.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f7893a.f7899a;
            C1882a c1882a = null;
            try {
                j5j0.m139865a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    C1882a c1882a2 = new C1882a(mediaCodecCreateByCodecName, this.f7888a.get(), this.f7889b.get(), this.f7890c);
                    try {
                        j5j0.m139867c();
                        c1882a2.m10484m(aVar.f7894b, aVar.f7896d, aVar.f7897e, aVar.f7898f);
                        return c1882a2;
                    } catch (Exception e) {
                        exc = e;
                        c1882a = c1882a2;
                        if (c1882a != null) {
                            c1882a.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e2) {
                    exc = e2;
                }
            } catch (Exception e3) {
                exc = e3;
                mediaCodecCreateByCodecName = null;
            }
        }

        @VisibleForTesting
        public b(tyg0<HandlerThread> tyg0Var, tyg0<HandlerThread> tyg0Var2, boolean z) {
            this.f7888a = tyg0Var;
            this.f7889b = tyg0Var2;
            this.f7890c = z;
        }
    }
}
