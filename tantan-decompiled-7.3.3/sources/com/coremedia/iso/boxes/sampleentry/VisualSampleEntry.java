package com.coremedia.iso.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p153l.b1q;
import p153l.ff3;
import p153l.h6c;
import p153l.p7f;
import p153l.rn4;
import p153l.slk0;
import p153l.t16;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public final class VisualSampleEntry extends AbstractSampleEntry implements t16 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;

    public VisualSampleEntry() {
        super(TYPE3);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        byteBufferAllocate.position(6);
        b1q.m101493e(byteBufferAllocate, this.dataReferenceIndex);
        b1q.m101493e(byteBufferAllocate, 0);
        b1q.m101493e(byteBufferAllocate, 0);
        b1q.m101495g(byteBufferAllocate, this.predefined[0]);
        b1q.m101495g(byteBufferAllocate, this.predefined[1]);
        b1q.m101495g(byteBufferAllocate, this.predefined[2]);
        b1q.m101493e(byteBufferAllocate, getWidth());
        b1q.m101493e(byteBufferAllocate, getHeight());
        b1q.m101490b(byteBufferAllocate, getHorizresolution());
        b1q.m101490b(byteBufferAllocate, getVertresolution());
        b1q.m101495g(byteBufferAllocate, 0L);
        b1q.m101493e(byteBufferAllocate, getFrameCount());
        b1q.m101498j(byteBufferAllocate, slk0.m186594c(getCompressorname()));
        byteBufferAllocate.put(slk0.m186593b(getCompressorname()));
        int iM186594c = slk0.m186594c(getCompressorname());
        while (iM186594c < 31) {
            iM186594c++;
            byteBufferAllocate.put((byte) 0);
        }
        b1q.m101493e(byteBufferAllocate, getDepth());
        b1q.m101493e(byteBufferAllocate, p7f.COLOR_SPACE_UNCALIBRATED);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getCompressorname() {
        return this.compressorname;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public int getHeight() {
        return this.height;
    }

    public double getHorizresolution() {
        return this.horizresolution;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize();
        return 78 + containerSize + ((long) ((this.largeBox || containerSize + 86 >= 4294967296L) ? 16 : 8));
    }

    public double getVertresolution() {
        return this.vertresolution;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        long jPosition = h6cVar.position() + j;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        h6cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = y0q.m213893i(byteBufferAllocate);
        y0q.m213893i(byteBufferAllocate);
        y0q.m213893i(byteBufferAllocate);
        this.predefined[0] = y0q.m213895k(byteBufferAllocate);
        this.predefined[1] = y0q.m213895k(byteBufferAllocate);
        this.predefined[2] = y0q.m213895k(byteBufferAllocate);
        this.width = y0q.m213893i(byteBufferAllocate);
        this.height = y0q.m213893i(byteBufferAllocate);
        this.horizresolution = y0q.m213888d(byteBufferAllocate);
        this.vertresolution = y0q.m213888d(byteBufferAllocate);
        y0q.m213895k(byteBufferAllocate);
        this.frameCount = y0q.m213893i(byteBufferAllocate);
        int iM213898n = y0q.m213898n(byteBufferAllocate);
        if (iM213898n > 31) {
            iM213898n = 31;
        }
        byte[] bArr = new byte[iM213898n];
        byteBufferAllocate.get(bArr);
        this.compressorname = slk0.m186592a(bArr);
        if (iM213898n < 31) {
            byteBufferAllocate.get(new byte[31 - iM213898n]);
        }
        this.depth = y0q.m213893i(byteBufferAllocate);
        y0q.m213893i(byteBufferAllocate);
        initContainer(new C1431a(jPosition, h6cVar), j - 78, ff3Var);
    }

    public void setCompressorname(String str) {
        this.compressorname = str;
    }

    public void setDepth(int i) {
        this.depth = i;
    }

    public void setFrameCount(int i) {
        this.frameCount = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setHorizresolution(double d) {
        this.horizresolution = d;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVertresolution(double d) {
        this.vertresolution = d;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.sampleentry.VisualSampleEntry$a */
    public class C1431a implements h6c {

        /* JADX INFO: renamed from: b */
        private final /* synthetic */ long f5827b;

        /* JADX INFO: renamed from: c */
        private final /* synthetic */ h6c f5828c;

        public C1431a(long j, h6c h6cVar) {
            this.f5827b = j;
            this.f5828c = h6cVar;
        }

        @Override // p153l.h6c
        /* JADX INFO: renamed from: K */
        public ByteBuffer mo7441K(long j, long j2) throws IOException {
            return this.f5828c.mo7441K(j, j2);
        }

        @Override // p153l.h6c
        /* JADX INFO: renamed from: L */
        public long mo7442L(long j, long j2, WritableByteChannel writableByteChannel) throws IOException {
            return this.f5828c.mo7442L(j, j2, writableByteChannel);
        }

        @Override // p153l.h6c, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f5828c.close();
        }

        @Override // p153l.h6c
        public long position() throws IOException {
            return this.f5828c.position();
        }

        @Override // p153l.h6c
        public int read(ByteBuffer byteBuffer) throws IOException {
            if (this.f5827b == this.f5828c.position()) {
                return -1;
            }
            if (byteBuffer.remaining() <= this.f5827b - this.f5828c.position()) {
                return this.f5828c.read(byteBuffer);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(rn4.m182119a(this.f5827b - this.f5828c.position()));
            this.f5828c.read(byteBufferAllocate);
            byteBuffer.put((ByteBuffer) byteBufferAllocate.rewind());
            return byteBufferAllocate.capacity();
        }

        @Override // p153l.h6c
        public void position(long j) throws IOException {
            this.f5828c.position(j);
        }
    }

    public VisualSampleEntry(String str) {
        super(str);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }
}
