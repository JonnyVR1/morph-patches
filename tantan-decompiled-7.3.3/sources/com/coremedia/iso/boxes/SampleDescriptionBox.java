package com.coremedia.iso.boxes;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import p153l.b1q;
import p153l.ff3;
import p153l.h6c;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class SampleDescriptionBox extends AbstractContainerBox implements FullBox {
    public static final String TYPE = "stsd";
    private int flags;
    private int version;

    public SampleDescriptionBox() {
        super(TYPE);
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        b1q.m101498j(byteBufferAllocate, this.version);
        b1q.m101494f(byteBufferAllocate, this.flags);
        b1q.m101495g(byteBufferAllocate, getBoxes().size());
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        return this.flags;
    }

    public AbstractSampleEntry getSampleEntry() {
        Iterator it = getBoxes(AbstractSampleEntry.class).iterator();
        if (it.hasNext()) {
            return (AbstractSampleEntry) it.next();
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize();
        return 8 + containerSize + ((long) ((this.largeBox || containerSize + 16 >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        h6cVar.read(byteBufferAllocate);
        byteBufferAllocate.rewind();
        this.version = y0q.m213898n(byteBufferAllocate);
        this.flags = y0q.m213894j(byteBufferAllocate);
        initContainer(h6cVar, j - 8, ff3Var);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i) {
        this.flags = i;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i) {
        this.version = i;
    }
}
