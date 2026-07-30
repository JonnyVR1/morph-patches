package com.coremedia.iso.boxes.mdat;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;
import p153l.ef3;
import p153l.ff3;
import p153l.h6c;
import p153l.t16;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDataBox implements ef3 {
    private static Logger LOG = Logger.getLogger(MediaDataBox.class.getName());
    public static final String TYPE = "mdat";
    private h6c dataSource;
    boolean largeBox = false;
    private long offset;
    t16 parent;
    private long size;

    private static void transfer(h6c h6cVar, long j, long j2, WritableByteChannel writableByteChannel) throws IOException {
        long jMo7442L = 0;
        while (jMo7442L < j2) {
            jMo7442L += h6cVar.mo7442L(j + jMo7442L, Math.min(67076096L, j2 - jMo7442L), writableByteChannel);
        }
    }

    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        transfer(this.dataSource, this.offset, this.size, writableByteChannel);
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // p153l.ef3
    public t16 getParent() {
        return this.parent;
    }

    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        return this.size;
    }

    @Override // p153l.ef3
    public String getType() {
        return TYPE;
    }

    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        this.offset = h6cVar.position() - ((long) byteBuffer.remaining());
        this.dataSource = h6cVar;
        this.size = ((long) byteBuffer.remaining()) + j;
        h6cVar.position(h6cVar.position() + j);
    }

    @Override // p153l.ef3
    public void setParent(t16 t16Var) {
        this.parent = t16Var;
    }

    public String toString() {
        return "MediaDataBox{size=" + this.size + '}';
    }
}
