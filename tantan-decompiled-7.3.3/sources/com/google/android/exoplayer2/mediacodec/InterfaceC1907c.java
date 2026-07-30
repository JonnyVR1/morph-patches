package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1894k;
import java.io.IOException;
import java.nio.ByteBuffer;
import p153l.wxb;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1907c {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C1908d f7930a;

        /* JADX INFO: renamed from: b */
        public final MediaFormat f7931b;

        /* JADX INFO: renamed from: c */
        public final C1894k f7932c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final Surface f7933d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final MediaCrypto f7934e;

        /* JADX INFO: renamed from: f */
        public final int f7935f;

        public a(C1908d c1908d, MediaFormat mediaFormat, C1894k c1894k, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
            this.f7930a = c1908d;
            this.f7931b = mediaFormat;
            this.f7932c = c1894k;
            this.f7933d = surface;
            this.f7934e = mediaCrypto;
            this.f7935f = i;
        }

        /* JADX INFO: renamed from: a */
        public static a m10544a(C1908d c1908d, MediaFormat mediaFormat, C1894k c1894k, @Nullable MediaCrypto mediaCrypto) {
            return new a(c1908d, mediaFormat, c1894k, null, mediaCrypto, 0);
        }

        /* JADX INFO: renamed from: b */
        public static a m10545b(C1908d c1908d, MediaFormat mediaFormat, C1894k c1894k, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            return new a(c1908d, mediaFormat, c1894k, surface, mediaCrypto, 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        InterfaceC1907c mo10542a(a aVar) throws IOException;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo10546a(InterfaceC1907c interfaceC1907c, long j, long j2);
    }

    /* JADX INFO: renamed from: a */
    boolean mo10533a();

    /* JADX INFO: renamed from: b */
    void mo10534b(int i, int i2, wxb wxbVar, long j, int i3);

    /* JADX INFO: renamed from: c */
    int mo10535c(MediaCodec.BufferInfo bufferInfo);

    @RequiresApi(23)
    /* JADX INFO: renamed from: d */
    void mo10536d(c cVar, Handler handler);

    /* JADX INFO: renamed from: e */
    int mo10537e();

    void flush();

    @Nullable
    ByteBuffer getInputBuffer(int i);

    @Nullable
    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void release();

    @RequiresApi(21)
    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    @RequiresApi(23)
    void setOutputSurface(Surface surface);

    @RequiresApi(19)
    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);
}
