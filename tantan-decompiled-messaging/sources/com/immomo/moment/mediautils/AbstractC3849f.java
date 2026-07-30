package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.f */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3849f {

    /* JADX INFO: renamed from: a */
    protected a f13316a;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo18699a(String str);
    }

    /* JADX INFO: renamed from: a */
    public int mo18755a() {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract List<MediaFormat> mo18756b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo18757c(String str);

    /* JADX INFO: renamed from: d */
    public abstract int mo18758d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: e */
    public abstract void mo18759e();

    /* JADX INFO: renamed from: f */
    public abstract void mo18760f(long j);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo18761g(MediaFormat mediaFormat);

    /* JADX INFO: renamed from: h */
    public void m18762h(a aVar) {
        this.f13316a = aVar;
    }
}
