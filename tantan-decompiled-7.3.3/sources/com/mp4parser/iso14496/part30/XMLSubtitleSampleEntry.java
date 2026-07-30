package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p153l.b1q;
import p153l.ff3;
import p153l.h6c;
import p153l.y0q;

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

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3);
        byteBufferAllocate.position(6);
        b1q.m101493e(byteBufferAllocate, this.dataReferenceIndex);
        b1q.m101500l(byteBufferAllocate, this.namespace);
        b1q.m101500l(byteBufferAllocate, this.schemaLocation);
        b1q.m101500l(byteBufferAllocate, this.auxiliaryMimeTypes);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + ((long) (this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3));
        return containerSize + ((long) ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        h6cVar.read((ByteBuffer) byteBufferAllocate.rewind());
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = y0q.m213893i(byteBufferAllocate);
        long jPosition = h6cVar.position();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1024);
        h6cVar.read((ByteBuffer) byteBufferAllocate2.rewind());
        String strM213891g = y0q.m213891g((ByteBuffer) byteBufferAllocate2.rewind());
        this.namespace = strM213891g;
        h6cVar.position(((long) strM213891g.length()) + jPosition + 1);
        h6cVar.read((ByteBuffer) byteBufferAllocate2.rewind());
        this.schemaLocation = y0q.m213891g((ByteBuffer) byteBufferAllocate2.rewind());
        h6cVar.position(((long) this.namespace.length()) + jPosition + ((long) this.schemaLocation.length()) + 2);
        h6cVar.read((ByteBuffer) byteBufferAllocate2.rewind());
        this.auxiliaryMimeTypes = y0q.m213891g((ByteBuffer) byteBufferAllocate2.rewind());
        h6cVar.position(jPosition + ((long) this.namespace.length()) + ((long) this.schemaLocation.length()) + ((long) this.auxiliaryMimeTypes.length()) + 3);
        initContainer(h6cVar, j - ((long) ((((byteBuffer.remaining() + this.namespace.length()) + this.schemaLocation.length()) + this.auxiliaryMimeTypes.length()) + 3)), ff3Var);
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
