package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import l.b5c;
import l.bzp;
import l.qe3;
import l.yyp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
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

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3);
        byteBufferAllocate.position(6);
        bzp.e(byteBufferAllocate, ((AbstractSampleEntry) this).dataReferenceIndex);
        bzp.l(byteBufferAllocate, this.namespace);
        bzp.l(byteBufferAllocate, this.schemaLocation);
        bzp.l(byteBufferAllocate, this.auxiliaryMimeTypes);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    public long getSize() {
        long containerSize = getContainerSize() + ((long) (this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3));
        return containerSize + ((long) ((((AbstractContainerBox) this).largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        b5cVar.read((ByteBuffer) byteBufferAllocate.rewind());
        byteBufferAllocate.position(6);
        ((AbstractSampleEntry) this).dataReferenceIndex = yyp.i(byteBufferAllocate);
        long jPosition = b5cVar.position();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1024);
        b5cVar.read((ByteBuffer) byteBufferAllocate2.rewind());
        String strG = yyp.g((ByteBuffer) byteBufferAllocate2.rewind());
        this.namespace = strG;
        b5cVar.position(((long) strG.length()) + jPosition + 1);
        b5cVar.read((ByteBuffer) byteBufferAllocate2.rewind());
        this.schemaLocation = yyp.g((ByteBuffer) byteBufferAllocate2.rewind());
        b5cVar.position(((long) this.namespace.length()) + jPosition + ((long) this.schemaLocation.length()) + 2);
        b5cVar.read((ByteBuffer) byteBufferAllocate2.rewind());
        this.auxiliaryMimeTypes = yyp.g((ByteBuffer) byteBufferAllocate2.rewind());
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
