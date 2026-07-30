package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p153l.b1q;
import p153l.ef3;
import p153l.ff3;
import p153l.h6c;
import p153l.t16;

/* JADX INFO: loaded from: classes7.dex */
public class AbstractContainerBox extends BasicContainer implements ef3 {
    protected boolean largeBox;
    private long offset;
    t16 parent;
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
            b1q.m101497i(byteBufferWrap, getSize());
        } else {
            byteBufferWrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.type.getBytes()[0], this.type.getBytes()[1], this.type.getBytes()[2], this.type.getBytes()[3]});
            b1q.m101495g(byteBufferWrap, getSize());
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // p153l.ef3
    public t16 getParent() {
        return this.parent;
    }

    public long getSize() {
        long containerSize = getContainerSize();
        return containerSize + ((long) ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // p153l.ef3
    public String getType() {
        return this.type;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void initContainer(h6c h6cVar, long j, ff3 ff3Var) throws IOException {
        this.dataSource = h6cVar;
        long jPosition = h6cVar.position();
        this.parsePosition = jPosition;
        this.startPosition = jPosition - ((long) ((this.largeBox || 8 + j >= 4294967296L) ? 16 : 8));
        h6cVar.position(h6cVar.position() + j);
        this.endPosition = h6cVar.position();
    }

    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        this.offset = h6cVar.position() - ((long) byteBuffer.remaining());
        this.largeBox = byteBuffer.remaining() == 16;
        initContainer(h6cVar, j, ff3Var);
    }

    @Override // p153l.ef3
    public void setParent(t16 t16Var) {
        this.parent = t16Var;
    }
}
