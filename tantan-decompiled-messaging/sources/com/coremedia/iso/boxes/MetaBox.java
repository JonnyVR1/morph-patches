package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.bzp;
import p149l.qe3;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class MetaBox extends AbstractContainerBox {
    public static final String TYPE = "meta";
    private int flags;
    private int version;

    public MetaBox() {
        super("meta");
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        writeVersionAndFlags(byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public int getFlags() {
        return this.flags;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 4;
        return containerSize + ((long) ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8));
    }

    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        b5cVar.read(byteBufferAllocate);
        parseVersionAndFlags((ByteBuffer) byteBufferAllocate.rewind());
        initContainer(b5cVar, j - 4, qe3Var);
    }

    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = yyp.m216561n(byteBuffer);
        this.flags = yyp.m216557j(byteBuffer);
        return 4L;
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        bzp.m104638j(byteBuffer, this.version);
        bzp.m104634f(byteBuffer, this.flags);
    }
}
