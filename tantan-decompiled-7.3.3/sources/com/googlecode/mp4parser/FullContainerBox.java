package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FullBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.logging.Logger;
import p153l.b1q;
import p153l.ef3;
import p153l.ff3;
import p153l.h6c;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FullContainerBox extends AbstractContainerBox implements FullBox {
    private static Logger LOG = Logger.getLogger(FullContainerBox.class.getName());
    private int flags;
    private int version;

    public FullContainerBox(String str) {
        super(str);
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public <T extends ef3> List<T> getBoxes(Class<T> cls) {
        return getBoxes(cls, false);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        return this.flags;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox
    public ByteBuffer getHeader() {
        ByteBuffer byteBufferWrap;
        if (this.largeBox || getSize() >= 4294967296L) {
            byte[] bArr = new byte[20];
            bArr[3] = 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(8);
            b1q.m101497i(byteBufferWrap, getSize());
            writeVersionAndFlags(byteBufferWrap);
        } else {
            byte[] bArr2 = new byte[12];
            bArr2[4] = this.type.getBytes()[0];
            bArr2[5] = this.type.getBytes()[1];
            bArr2[6] = this.type.getBytes()[2];
            bArr2[7] = this.type.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr2);
            b1q.m101495g(byteBufferWrap, getSize());
            byteBufferWrap.position(8);
            writeVersionAndFlags(byteBufferWrap);
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        h6cVar.read(byteBufferAllocate);
        parseVersionAndFlags((ByteBuffer) byteBufferAllocate.rewind());
        super.parse(h6cVar, byteBuffer, j, ff3Var);
    }

    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = y0q.m213898n(byteBuffer);
        this.flags = y0q.m213894j(byteBuffer);
        return 4L;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i) {
        this.flags = i;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return getClass().getSimpleName().concat("[childBoxes]");
    }

    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        b1q.m101498j(byteBuffer, this.version);
        b1q.m101494f(byteBuffer, this.flags);
    }
}
