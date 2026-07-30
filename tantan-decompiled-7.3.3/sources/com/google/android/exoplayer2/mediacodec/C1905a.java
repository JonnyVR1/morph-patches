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
import com.google.android.exoplayer2.mediacodec.C1905a;
import java.nio.ByteBuffer;
import p153l.a31;
import p153l.b7h0;
import p153l.c31;
import p153l.nej0;
import p153l.wxb;
import p153l.xpg0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.a */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
@Deprecated
public final class C1905a implements InterfaceC1907c {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f7919a;

    /* JADX INFO: renamed from: b */
    public final c31 f7920b;

    /* JADX INFO: renamed from: c */
    public final a31 f7921c;

    /* JADX INFO: renamed from: d */
    public final boolean f7922d;

    /* JADX INFO: renamed from: e */
    public boolean f7923e;

    /* JADX INFO: renamed from: f */
    public int f7924f;

    public C1905a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f7919a = mediaCodec;
        this.f7920b = new c31(handlerThread);
        this.f7921c = new a31(mediaCodec, handlerThread2);
        this.f7922d = z;
        this.f7924f = 0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10526f(C1905a c1905a, InterfaceC1907c.c cVar, MediaCodec mediaCodec, long j, long j2) {
        c1905a.getClass();
        cVar.mo10546a(c1905a, j, j2);
    }

    /* JADX INFO: renamed from: j */
    public static String m10530j(int i) {
        return m10532l(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: renamed from: k */
    public static String m10531k(int i) {
        return m10532l(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: renamed from: l */
    public static String m10532l(int i, String str) {
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

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    /* JADX INFO: renamed from: a */
    public boolean mo10533a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    /* JADX INFO: renamed from: b */
    public void mo10534b(int i, int i2, wxb wxbVar, long j, int i3) {
        this.f7921c.m95750n(i, i2, wxbVar, j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    /* JADX INFO: renamed from: c */
    public int mo10535c(MediaCodec.BufferInfo bufferInfo) {
        this.f7921c.m95748l();
        return this.f7920b.m107753d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    /* JADX INFO: renamed from: d */
    public void mo10536d(final InterfaceC1907c.c cVar, Handler handler) {
        m10539n();
        this.f7919a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: l.x21
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C1905a.m10526f(this.f192110a, cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    /* JADX INFO: renamed from: e */
    public int mo10537e() {
        this.f7921c.m95748l();
        return this.f7920b.m107752c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void flush() {
        this.f7921c.m95746i();
        this.f7919a.flush();
        this.f7920b.m107754e();
        this.f7919a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    @Nullable
    public ByteBuffer getInputBuffer(int i) {
        return this.f7919a.getInputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    @Nullable
    public ByteBuffer getOutputBuffer(int i) {
        return this.f7919a.getOutputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public MediaFormat getOutputFormat() {
        return this.f7920b.m107756g();
    }

    /* JADX INFO: renamed from: m */
    public final void m10538m(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
        this.f7920b.m107757h(this.f7919a);
        nej0.m162903a("configureCodec");
        this.f7919a.configure(mediaFormat, surface, mediaCrypto, i);
        nej0.m162905c();
        this.f7921c.m95752q();
        nej0.m162903a("startCodec");
        this.f7919a.start();
        nej0.m162905c();
        this.f7924f = 1;
    }

    /* JADX INFO: renamed from: n */
    public final void m10539n() {
        if (this.f7922d) {
            try {
                this.f7921c.m95753r();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                xpg0.m212648a(e);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f7921c.m95749m(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void release() {
        try {
            if (this.f7924f == 1) {
                this.f7921c.m95751p();
                this.f7920b.m107764o();
            }
            this.f7924f = 2;
        } finally {
            if (!this.f7923e) {
                this.f7919a.release();
                this.f7923e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void releaseOutputBuffer(int i, boolean z) {
        this.f7919a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void setOutputSurface(Surface surface) {
        m10539n();
        this.f7919a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void setParameters(Bundle bundle) {
        m10539n();
        this.f7919a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void setVideoScalingMode(int i) {
        m10539n();
        this.f7919a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void releaseOutputBuffer(int i, long j) {
        this.f7919a.releaseOutputBuffer(i, j);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.a$b */
    public static final class b implements InterfaceC1907c.b {

        /* JADX INFO: renamed from: a */
        public final b7h0<HandlerThread> f7925a;

        /* JADX INFO: renamed from: b */
        public final b7h0<HandlerThread> f7926b;

        /* JADX INFO: renamed from: c */
        public final boolean f7927c;

        public b(final int i, boolean z) {
            this(new b7h0() { // from class: l.y21
                @Override // p153l.b7h0
                public final Object get() {
                    return C1905a.b.m10540b(i);
                }
            }, new b7h0() { // from class: l.z21
                @Override // p153l.b7h0
                public final Object get() {
                    return C1905a.b.m10541c(i);
                }
            }, z);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ HandlerThread m10540b(int i) {
            return new HandlerThread(C1905a.m10530j(i));
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ HandlerThread m10541c(int i) {
            return new HandlerThread(C1905a.m10531k(i));
        }

        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1905a mo10542a(InterfaceC1907c.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f7930a.f7936a;
            C1905a c1905a = null;
            try {
                nej0.m162903a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    C1905a c1905a2 = new C1905a(mediaCodecCreateByCodecName, this.f7925a.get(), this.f7926b.get(), this.f7927c);
                    try {
                        nej0.m162905c();
                        c1905a2.m10538m(aVar.f7931b, aVar.f7933d, aVar.f7934e, aVar.f7935f);
                        return c1905a2;
                    } catch (Exception e) {
                        exc = e;
                        c1905a = c1905a2;
                        if (c1905a != null) {
                            c1905a.release();
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
        public b(b7h0<HandlerThread> b7h0Var, b7h0<HandlerThread> b7h0Var2, boolean z) {
            this.f7925a = b7h0Var;
            this.f7926b = b7h0Var2;
            this.f7927c = z;
        }
    }
}
