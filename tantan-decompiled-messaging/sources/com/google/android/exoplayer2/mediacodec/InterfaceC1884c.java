package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1871k;
import java.io.IOException;
import java.nio.ByteBuffer;
import p149l.iwb;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1884c {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C1885d f7893a;

        /* JADX INFO: renamed from: b */
        public final MediaFormat f7894b;

        /* JADX INFO: renamed from: c */
        public final C1871k f7895c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final Surface f7896d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final MediaCrypto f7897e;

        /* JADX INFO: renamed from: f */
        public final int f7898f;

        public a(C1885d c1885d, MediaFormat mediaFormat, C1871k c1871k, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
            this.f7893a = c1885d;
            this.f7894b = mediaFormat;
            this.f7895c = c1871k;
            this.f7896d = surface;
            this.f7897e = mediaCrypto;
            this.f7898f = i;
        }

        /* JADX INFO: renamed from: a */
        public static a m10490a(C1885d c1885d, MediaFormat mediaFormat, C1871k c1871k, @Nullable MediaCrypto mediaCrypto) {
            return new a(c1885d, mediaFormat, c1871k, null, mediaCrypto, 0);
        }

        /* JADX INFO: renamed from: b */
        public static a m10491b(C1885d c1885d, MediaFormat mediaFormat, C1871k c1871k, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            return new a(c1885d, mediaFormat, c1871k, surface, mediaCrypto, 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        InterfaceC1884c mo10488a(a aVar) throws IOException;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo10492a(InterfaceC1884c interfaceC1884c, long j, long j2);
    }

    /* JADX INFO: renamed from: a */
    boolean mo10479a();

    /* JADX INFO: renamed from: b */
    void mo10480b(int i, int i2, iwb iwbVar, long j, int i3);

    /* JADX INFO: renamed from: c */
    int mo10481c(MediaCodec.BufferInfo bufferInfo);

    @RequiresApi(23)
    /* JADX INFO: renamed from: d */
    void mo10482d(c cVar, Handler handler);

    /* JADX INFO: renamed from: e */
    int mo10483e();

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
