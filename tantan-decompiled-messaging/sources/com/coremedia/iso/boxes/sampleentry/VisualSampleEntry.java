package com.coremedia.iso.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.bzp;
import p149l.j6f;
import p149l.mck0;
import p149l.o06;
import p149l.qe3;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public final class VisualSampleEntry extends AbstractSampleEntry implements o06 {
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

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        byteBufferAllocate.position(6);
        bzp.m104633e(byteBufferAllocate, this.dataReferenceIndex);
        bzp.m104633e(byteBufferAllocate, 0);
        bzp.m104633e(byteBufferAllocate, 0);
        bzp.m104635g(byteBufferAllocate, this.predefined[0]);
        bzp.m104635g(byteBufferAllocate, this.predefined[1]);
        bzp.m104635g(byteBufferAllocate, this.predefined[2]);
        bzp.m104633e(byteBufferAllocate, getWidth());
        bzp.m104633e(byteBufferAllocate, getHeight());
        bzp.m104630b(byteBufferAllocate, getHorizresolution());
        bzp.m104630b(byteBufferAllocate, getVertresolution());
        bzp.m104635g(byteBufferAllocate, 0L);
        bzp.m104633e(byteBufferAllocate, getFrameCount());
        bzp.m104638j(byteBufferAllocate, mck0.m154018c(getCompressorname()));
        byteBufferAllocate.put(mck0.m154017b(getCompressorname()));
        int iM154018c = mck0.m154018c(getCompressorname());
        while (iM154018c < 31) {
            iM154018c++;
            byteBufferAllocate.put((byte) 0);
        }
        bzp.m104633e(byteBufferAllocate, getDepth());
        bzp.m104633e(byteBufferAllocate, j6f.COLOR_SPACE_UNCALIBRATED);
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

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
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
    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        long jPosition = b5cVar.position() + j;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        b5cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = yyp.m216556i(byteBufferAllocate);
        yyp.m216556i(byteBufferAllocate);
        yyp.m216556i(byteBufferAllocate);
        this.predefined[0] = yyp.m216558k(byteBufferAllocate);
        this.predefined[1] = yyp.m216558k(byteBufferAllocate);
        this.predefined[2] = yyp.m216558k(byteBufferAllocate);
        this.width = yyp.m216556i(byteBufferAllocate);
        this.height = yyp.m216556i(byteBufferAllocate);
        this.horizresolution = yyp.m216551d(byteBufferAllocate);
        this.vertresolution = yyp.m216551d(byteBufferAllocate);
        yyp.m216558k(byteBufferAllocate);
        this.frameCount = yyp.m216556i(byteBufferAllocate);
        int iM216561n = yyp.m216561n(byteBufferAllocate);
        if (iM216561n > 31) {
            iM216561n = 31;
        }
        byte[] bArr = new byte[iM216561n];
        byteBufferAllocate.get(bArr);
        this.compressorname = mck0.m154016a(bArr);
        if (iM216561n < 31) {
            byteBufferAllocate.get(new byte[31 - iM216561n]);
        }
        this.depth = yyp.m216556i(byteBufferAllocate);
        yyp.m216556i(byteBufferAllocate);
        initContainer(new C1408a(jPosition, b5cVar), j - 78, qe3Var);
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
    public class C1408a implements b5c {

        /* JADX INFO: renamed from: b */
        private final /* synthetic */ long f5790b;

        /* JADX INFO: renamed from: c */
        private final /* synthetic */ b5c f5791c;

        public C1408a(long j, b5c b5cVar) {
            this.f5790b = j;
            this.f5791c = b5cVar;
        }

        @Override // p149l.b5c
        /* JADX INFO: renamed from: K */
        public ByteBuffer mo7387K(long j, long j2) throws IOException {
            return this.f5791c.mo7387K(j, j2);
        }

        @Override // p149l.b5c
        /* JADX INFO: renamed from: L */
        public long mo7388L(long j, long j2, WritableByteChannel writableByteChannel) throws IOException {
            return this.f5791c.mo7388L(j, j2, writableByteChannel);
        }

        @Override // p149l.b5c, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f5791c.close();
        }

        @Override // p149l.b5c
        public long position() throws IOException {
            return this.f5791c.position();
        }

        @Override // p149l.b5c
        public int read(ByteBuffer byteBuffer) throws IOException {
            if (this.f5790b == this.f5791c.position()) {
                return -1;
            }
            if (byteBuffer.remaining() <= this.f5790b - this.f5791c.position()) {
                return this.f5791c.read(byteBuffer);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sm4.m184929a(this.f5790b - this.f5791c.position()));
            this.f5791c.read(byteBufferAllocate);
            byteBuffer.put((ByteBuffer) byteBufferAllocate.rewind());
            return byteBufferAllocate.capacity();
        }

        @Override // p149l.b5c
        public void position(long j) throws IOException {
            this.f5791c.position(j);
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
