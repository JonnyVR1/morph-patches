package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.bzp;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;

/* JADX INFO: loaded from: classes7.dex */
public class AbstractContainerBox extends BasicContainer implements pe3 {
    protected boolean largeBox;
    private long offset;
    o06 parent;
    protected String type;

    public AbstractContainerBox(String str) {
        this.type = str;
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }

    public ByteBuffer getHeader() {
        ByteBuffer byteBufferWrap;
        if (this.largeBox || getSize() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(8);
            bzp.m104637i(byteBufferWrap, getSize());
        } else {
            byteBufferWrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.type.getBytes()[0], this.type.getBytes()[1], this.type.getBytes()[2], this.type.getBytes()[3]});
            bzp.m104635g(byteBufferWrap, getSize());
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // p149l.pe3
    public o06 getParent() {
        return this.parent;
    }

    public long getSize() {
        long containerSize = getContainerSize();
        return containerSize + ((long) ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // p149l.pe3
    public String getType() {
        return this.type;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void initContainer(b5c b5cVar, long j, qe3 qe3Var) throws IOException {
        this.dataSource = b5cVar;
        long jPosition = b5cVar.position();
        this.parsePosition = jPosition;
        this.startPosition = jPosition - ((long) ((this.largeBox || 8 + j >= 4294967296L) ? 16 : 8));
        b5cVar.position(b5cVar.position() + j);
        this.endPosition = b5cVar.position();
    }

    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        this.offset = b5cVar.position() - ((long) byteBuffer.remaining());
        this.largeBox = byteBuffer.remaining() == 16;
        initContainer(b5cVar, j, qe3Var);
    }

    @Override // p149l.pe3
    public void setParent(o06 o06Var) {
        this.parent = o06Var;
    }
}
