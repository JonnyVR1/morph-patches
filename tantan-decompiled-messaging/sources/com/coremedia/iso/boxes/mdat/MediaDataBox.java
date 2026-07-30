package com.coremedia.iso.boxes.mdat;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;
import p149l.b5c;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDataBox implements pe3 {
    private static Logger LOG = Logger.getLogger(MediaDataBox.class.getName());
    public static final String TYPE = "mdat";
    private b5c dataSource;
    boolean largeBox = false;
    private long offset;
    o06 parent;
    private long size;

    private static void transfer(b5c b5cVar, long j, long j2, WritableByteChannel writableByteChannel) throws IOException {
        long jMo7388L = 0;
        while (jMo7388L < j2) {
            jMo7388L += b5cVar.mo7388L(j + jMo7388L, Math.min(67076096L, j2 - jMo7388L), writableByteChannel);
        }
    }

    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        transfer(this.dataSource, this.offset, this.size, writableByteChannel);
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // p149l.pe3
    public o06 getParent() {
        return this.parent;
    }

    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        return this.size;
    }

    @Override // p149l.pe3
    public String getType() {
        return TYPE;
    }

    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        this.offset = b5cVar.position() - ((long) byteBuffer.remaining());
        this.dataSource = b5cVar;
        this.size = ((long) byteBuffer.remaining()) + j;
        b5cVar.position(b5cVar.position() + j);
    }

    @Override // p149l.pe3
    public void setParent(o06 o06Var) {
        this.parent = o06Var;
    }

    public String toString() {
        return "MediaDataBox{size=" + this.size + '}';
    }
}
