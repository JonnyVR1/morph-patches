package com.coremedia.iso.boxes;

import com.clevertap.android.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ChunkOffsetBox extends AbstractFullBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public ChunkOffsetBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ChunkOffsetBox.java", ChunkOffsetBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }

    public abstract long[] getChunkOffsets();

    public abstract void setChunkOffsets(long[] jArr);

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return getClass().getSimpleName() + "[entryCount=" + getChunkOffsets().length + Constants.AES_SUFFIX;
    }
}
