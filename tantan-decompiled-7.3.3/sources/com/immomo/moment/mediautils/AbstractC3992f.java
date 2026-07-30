package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.f */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3992f {

    /* JADX INFO: renamed from: a */
    protected a f14010a;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo19679a(String str);
    }

    /* JADX INFO: renamed from: a */
    public int mo19735a() {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract List<MediaFormat> mo19736b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo19737c(String str);

    /* JADX INFO: renamed from: d */
    public abstract int mo19738d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: e */
    public abstract void mo19739e();

    /* JADX INFO: renamed from: f */
    public abstract void mo19740f(long j);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo19741g(MediaFormat mediaFormat);

    /* JADX INFO: renamed from: h */
    public void m19742h(a aVar) {
        this.f14010a = aVar;
    }
}
