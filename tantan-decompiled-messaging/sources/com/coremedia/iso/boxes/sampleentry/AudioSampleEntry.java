package com.coremedia.iso.boxes.sampleentry;

import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.bzp;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;
import p149l.sm4;
import p149l.y9g0;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSampleEntry extends AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;

    public AudioSampleEntry(String str) {
        super(str);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        int i = this.soundVersion;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0));
        byteBufferAllocate.position(6);
        bzp.m104633e(byteBufferAllocate, this.dataReferenceIndex);
        bzp.m104633e(byteBufferAllocate, this.soundVersion);
        bzp.m104633e(byteBufferAllocate, this.reserved1);
        bzp.m104635g(byteBufferAllocate, this.reserved2);
        bzp.m104633e(byteBufferAllocate, this.channelCount);
        bzp.m104633e(byteBufferAllocate, this.sampleSize);
        bzp.m104633e(byteBufferAllocate, this.compressionId);
        bzp.m104633e(byteBufferAllocate, this.packetSize);
        if (this.type.equals(TYPE10)) {
            bzp.m104635g(byteBufferAllocate, getSampleRate());
        } else {
            bzp.m104635g(byteBufferAllocate, getSampleRate() << 16);
        }
        if (this.soundVersion == 1) {
            bzp.m104635g(byteBufferAllocate, this.samplesPerPacket);
            bzp.m104635g(byteBufferAllocate, this.bytesPerPacket);
            bzp.m104635g(byteBufferAllocate, this.bytesPerFrame);
            bzp.m104635g(byteBufferAllocate, this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            bzp.m104635g(byteBufferAllocate, this.samplesPerPacket);
            bzp.m104635g(byteBufferAllocate, this.bytesPerPacket);
            bzp.m104635g(byteBufferAllocate, this.bytesPerFrame);
            bzp.m104635g(byteBufferAllocate, this.bytesPerSample);
            byteBufferAllocate.put(this.soundVersion2Data);
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public long getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public long getBytesPerPacket() {
        return this.bytesPerPacket;
    }

    public long getBytesPerSample() {
        return this.bytesPerSample;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getCompressionId() {
        return this.compressionId;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getReserved1() {
        return this.reserved1;
    }

    public long getReserved2() {
        return this.reserved2;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        int i = this.soundVersion;
        int i2 = 16;
        long containerSize = ((long) ((i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0))) + getContainerSize();
        if (!this.largeBox && 8 + containerSize < 4294967296L) {
            i2 = 8;
        }
        return containerSize + ((long) i2);
    }

    public int getSoundVersion() {
        return this.soundVersion;
    }

    public byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(28);
        b5cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = yyp.m216556i(byteBufferAllocate);
        this.soundVersion = yyp.m216556i(byteBufferAllocate);
        this.reserved1 = yyp.m216556i(byteBufferAllocate);
        this.reserved2 = yyp.m216558k(byteBufferAllocate);
        this.channelCount = yyp.m216556i(byteBufferAllocate);
        this.sampleSize = yyp.m216556i(byteBufferAllocate);
        this.compressionId = yyp.m216556i(byteBufferAllocate);
        this.packetSize = yyp.m216556i(byteBufferAllocate);
        this.sampleRate = yyp.m216558k(byteBufferAllocate);
        if (!this.type.equals(TYPE10)) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            b5cVar.read(byteBufferAllocate2);
            byteBufferAllocate2.rewind();
            this.samplesPerPacket = yyp.m216558k(byteBufferAllocate2);
            this.bytesPerPacket = yyp.m216558k(byteBufferAllocate2);
            this.bytesPerFrame = yyp.m216558k(byteBufferAllocate2);
            this.bytesPerSample = yyp.m216558k(byteBufferAllocate2);
        }
        if (this.soundVersion == 2) {
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(36);
            b5cVar.read(byteBufferAllocate3);
            byteBufferAllocate3.rewind();
            this.samplesPerPacket = yyp.m216558k(byteBufferAllocate3);
            this.bytesPerPacket = yyp.m216558k(byteBufferAllocate3);
            this.bytesPerFrame = yyp.m216558k(byteBufferAllocate3);
            this.bytesPerSample = yyp.m216558k(byteBufferAllocate3);
            byte[] bArr = new byte[20];
            this.soundVersion2Data = bArr;
            byteBufferAllocate3.get(bArr);
        }
        if (!TYPE7.equals(this.type)) {
            long j2 = j - 28;
            int i = this.soundVersion;
            initContainer(b5cVar, (j2 - ((long) (i != 1 ? 0 : 16))) - ((long) (i != 2 ? 0 : 36)), qe3Var);
            return;
        }
        System.err.println(TYPE7);
        long j3 = j - 28;
        int i2 = this.soundVersion;
        final long j4 = (j3 - ((long) (i2 != 1 ? 0 : 16))) - ((long) (i2 != 2 ? 0 : 36));
        final ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(sm4.m184929a(j4));
        b5cVar.read(byteBufferAllocate4);
        addBox(new pe3() { // from class: com.coremedia.iso.boxes.sampleentry.AudioSampleEntry.1
            @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
            public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                byteBufferAllocate4.rewind();
                writableByteChannel.write(byteBufferAllocate4);
            }

            public long getOffset() {
                return 0L;
            }

            @Override // p149l.pe3
            public o06 getParent() {
                return AudioSampleEntry.this;
            }

            @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
            public long getSize() {
                return j4;
            }

            @Override // p149l.pe3
            public String getType() {
                return InternalFrame.f7932ID;
            }

            public void parse(b5c b5cVar2, ByteBuffer byteBuffer2, long j5, qe3 qe3Var2) throws IOException {
                throw new RuntimeException("NotImplemented");
            }

            @Override // p149l.pe3
            public void setParent(o06 o06Var) {
                if (AudioSampleEntry.$assertionsDisabled || o06Var == AudioSampleEntry.this) {
                    return;
                }
                y9g0.m213537a("you cannot diswown this special box");
            }
        });
    }

    public void setBytesPerFrame(long j) {
        this.bytesPerFrame = j;
    }

    public void setBytesPerPacket(long j) {
        this.bytesPerPacket = j;
    }

    public void setBytesPerSample(long j) {
        this.bytesPerSample = j;
    }

    public void setChannelCount(int i) {
        this.channelCount = i;
    }

    public void setCompressionId(int i) {
        this.compressionId = i;
    }

    public void setPacketSize(int i) {
        this.packetSize = i;
    }

    public void setReserved1(int i) {
        this.reserved1 = i;
    }

    public void setReserved2(long j) {
        this.reserved2 = j;
    }

    public void setSampleRate(long j) {
        this.sampleRate = j;
    }

    public void setSampleSize(int i) {
        this.sampleSize = i;
    }

    public void setSamplesPerPacket(long j) {
        this.samplesPerPacket = j;
    }

    public void setSoundVersion(int i) {
        this.soundVersion = i;
    }

    public void setSoundVersion2Data(byte[] bArr) {
        this.soundVersion2Data = bArr;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.bytesPerSample + ", bytesPerFrame=" + this.bytesPerFrame + ", bytesPerPacket=" + this.bytesPerPacket + ", samplesPerPacket=" + this.samplesPerPacket + ", packetSize=" + this.packetSize + ", compressionId=" + this.compressionId + ", soundVersion=" + this.soundVersion + ", sampleRate=" + this.sampleRate + ", sampleSize=" + this.sampleSize + ", channelCount=" + this.channelCount + ", boxes=" + getBoxes() + '}';
    }
}
