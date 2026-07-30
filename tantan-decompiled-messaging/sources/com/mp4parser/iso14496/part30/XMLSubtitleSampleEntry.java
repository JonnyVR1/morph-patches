package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.bzp;
import p149l.qe3;
import p149l.yyp;

/* JADX INFO: loaded from: classes8.dex */
public class XMLSubtitleSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "stpp";
    private String auxiliaryMimeTypes;
    private String namespace;
    private String schemaLocation;

    public XMLSubtitleSampleEntry() {
        super(TYPE);
        this.namespace = "";
        this.schemaLocation = "";
        this.auxiliaryMimeTypes = "";
    }

    public String getAuxiliaryMimeTypes() {
        return this.auxiliaryMimeTypes;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3);
        byteBufferAllocate.position(6);
        bzp.m104633e(byteBufferAllocate, this.dataReferenceIndex);
        bzp.m104640l(byteBufferAllocate, this.namespace);
        bzp.m104640l(byteBufferAllocate, this.schemaLocation);
        bzp.m104640l(byteBufferAllocate, this.auxiliaryMimeTypes);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + ((long) (this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3));
        return containerSize + ((long) ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        b5cVar.read((ByteBuffer) byteBufferAllocate.rewind());
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = yyp.m216556i(byteBufferAllocate);
        long jPosition = b5cVar.position();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1024);
        b5cVar.read((ByteBuffer) byteBufferAllocate2.rewind());
        String strM216554g = yyp.m216554g((ByteBuffer) byteBufferAllocate2.rewind());
        this.namespace = strM216554g;
        b5cVar.position(((long) strM216554g.length()) + jPosition + 1);
        b5cVar.read((ByteBuffer) byteBufferAllocate2.rewind());
        this.schemaLocation = yyp.m216554g((ByteBuffer) byteBufferAllocate2.rewind());
        b5cVar.position(((long) this.namespace.length()) + jPosition + ((long) this.schemaLocation.length()) + 2);
        b5cVar.read((ByteBuffer) byteBufferAllocate2.rewind());
        this.auxiliaryMimeTypes = yyp.m216554g((ByteBuffer) byteBufferAllocate2.rewind());
        b5cVar.position(jPosition + ((long) this.namespace.length()) + ((long) this.schemaLocation.length()) + ((long) this.auxiliaryMimeTypes.length()) + 3);
        initContainer(b5cVar, j - ((long) ((((byteBuffer.remaining() + this.namespace.length()) + this.schemaLocation.length()) + this.auxiliaryMimeTypes.length()) + 3)), qe3Var);
    }

    public void setAuxiliaryMimeTypes(String str) {
        this.auxiliaryMimeTypes = str;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public void setSchemaLocation(String str) {
        this.schemaLocation = str;
    }
}
