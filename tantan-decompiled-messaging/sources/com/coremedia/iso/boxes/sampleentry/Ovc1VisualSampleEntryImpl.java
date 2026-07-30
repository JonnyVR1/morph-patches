package com.coremedia.iso.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.bzp;
import p149l.qe3;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class Ovc1VisualSampleEntryImpl extends AbstractSampleEntry {
    public static final String TYPE = "ovc1";
    private byte[] vc1Content;

    public Ovc1VisualSampleEntryImpl() {
        super(TYPE);
        this.vc1Content = new byte[0];
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.position(6);
        bzp.m104633e(byteBufferAllocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writableByteChannel.write(ByteBuffer.wrap(this.vc1Content));
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        int i = 16;
        if (!this.largeBox && this.vc1Content.length + 16 < 4294967296L) {
            i = 8;
        }
        return ((long) i) + ((long) this.vc1Content.length) + 8;
    }

    public byte[] getVc1Content() {
        return this.vc1Content;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sm4.m184929a(j));
        b5cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = yyp.m216556i(byteBufferAllocate);
        byte[] bArr = new byte[byteBufferAllocate.remaining()];
        this.vc1Content = bArr;
        byteBufferAllocate.get(bArr);
    }

    public void setVc1Content(byte[] bArr) {
        this.vc1Content = bArr;
    }
}
