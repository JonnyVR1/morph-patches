package com.googlecode.mp4parser.boxes.adobe;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.bzp;
import p149l.qe3;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public class ActionMessageFormat0SampleEntryBox extends AbstractSampleEntry {
    public static final String TYPE = "amf0";

    public ActionMessageFormat0SampleEntryBox() {
        super(TYPE);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.position(6);
        bzp.m104633e(byteBufferAllocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 8;
        return containerSize + ((long) ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        b5cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = yyp.m216556i(byteBufferAllocate);
        initContainer(b5cVar, j - 8, qe3Var);
    }
}
