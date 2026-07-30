package com.coremedia.iso.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import p153l.b1q;
import p153l.ff3;
import p153l.h6c;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class MpegSampleEntry extends AbstractSampleEntry {
    public MpegSampleEntry() {
        super("mp4s");
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.position(6);
        b1q.m101493e(byteBufferAllocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 8;
        return containerSize + ((long) ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        h6cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = y0q.m213893i(byteBufferAllocate);
        initContainer(h6cVar, j - 8, ff3Var);
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return "MpegSampleEntry" + Arrays.asList(getBoxes());
    }

    public MpegSampleEntry(String str) {
        super(str);
    }
}
