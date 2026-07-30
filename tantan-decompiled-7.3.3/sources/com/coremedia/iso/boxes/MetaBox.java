package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p153l.b1q;
import p153l.ff3;
import p153l.h6c;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class MetaBox extends AbstractContainerBox {
    public static final String TYPE = "meta";
    private int flags;
    private int version;

    public MetaBox() {
        super("meta");
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
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

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 4;
        return containerSize + ((long) ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8));
    }

    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        h6cVar.read(byteBufferAllocate);
        parseVersionAndFlags((ByteBuffer) byteBufferAllocate.rewind());
        initContainer(h6cVar, j - 4, ff3Var);
    }

    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = y0q.m213898n(byteBuffer);
        this.flags = y0q.m213894j(byteBuffer);
        return 4L;
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        b1q.m101498j(byteBuffer, this.version);
        b1q.m101494f(byteBuffer, this.flags);
    }
}
