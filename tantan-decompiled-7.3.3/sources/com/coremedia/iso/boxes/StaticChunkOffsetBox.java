package com.coremedia.iso.boxes;

import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class StaticChunkOffsetBox extends ChunkOffsetBox {
    public static final String TYPE = "stco";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private long[] chunkOffsets;

    static {
        ajc$preClinit();
    }

    public StaticChunkOffsetBox() {
        super(TYPE);
        this.chunkOffsets = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("StaticChunkOffsetBox.java", StaticChunkOffsetBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "", "[J"), 39);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "", Constants.VOID), 48);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.chunkOffsets = new long[iM182119a];
        for (int i = 0; i < iM182119a; i++) {
            this.chunkOffsets[i] = y0q.m213895k(byteBuffer);
        }
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public long[] getChunkOffsets() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.chunkOffsets;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.chunkOffsets.length);
        for (long j : this.chunkOffsets) {
            b1q.m101495g(byteBuffer, j);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.chunkOffsets.length * 4) + 8;
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public void setChunkOffsets(long[] jArr) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, jArr));
        this.chunkOffsets = jArr;
    }
}
