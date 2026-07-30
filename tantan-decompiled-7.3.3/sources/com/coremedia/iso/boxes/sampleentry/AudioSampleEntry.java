package com.coremedia.iso.boxes.sampleentry;

import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p153l.b1q;
import p153l.ef3;
import p153l.ff3;
import p153l.gig0;
import p153l.h6c;
import p153l.rn4;
import p153l.t16;
import p153l.y0q;

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

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        int i = this.soundVersion;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0));
        byteBufferAllocate.position(6);
        b1q.m101493e(byteBufferAllocate, this.dataReferenceIndex);
        b1q.m101493e(byteBufferAllocate, this.soundVersion);
        b1q.m101493e(byteBufferAllocate, this.reserved1);
        b1q.m101495g(byteBufferAllocate, this.reserved2);
        b1q.m101493e(byteBufferAllocate, this.channelCount);
        b1q.m101493e(byteBufferAllocate, this.sampleSize);
        b1q.m101493e(byteBufferAllocate, this.compressionId);
        b1q.m101493e(byteBufferAllocate, this.packetSize);
        if (this.type.equals(TYPE10)) {
            b1q.m101495g(byteBufferAllocate, getSampleRate());
        } else {
            b1q.m101495g(byteBufferAllocate, getSampleRate() << 16);
        }
        if (this.soundVersion == 1) {
            b1q.m101495g(byteBufferAllocate, this.samplesPerPacket);
            b1q.m101495g(byteBufferAllocate, this.bytesPerPacket);
            b1q.m101495g(byteBufferAllocate, this.bytesPerFrame);
            b1q.m101495g(byteBufferAllocate, this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            b1q.m101495g(byteBufferAllocate, this.samplesPerPacket);
            b1q.m101495g(byteBufferAllocate, this.bytesPerPacket);
            b1q.m101495g(byteBufferAllocate, this.bytesPerFrame);
            b1q.m101495g(byteBufferAllocate, this.bytesPerSample);
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

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
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
    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(28);
        h6cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = y0q.m213893i(byteBufferAllocate);
        this.soundVersion = y0q.m213893i(byteBufferAllocate);
        this.reserved1 = y0q.m213893i(byteBufferAllocate);
        this.reserved2 = y0q.m213895k(byteBufferAllocate);
        this.channelCount = y0q.m213893i(byteBufferAllocate);
        this.sampleSize = y0q.m213893i(byteBufferAllocate);
        this.compressionId = y0q.m213893i(byteBufferAllocate);
        this.packetSize = y0q.m213893i(byteBufferAllocate);
        this.sampleRate = y0q.m213895k(byteBufferAllocate);
        if (!this.type.equals(TYPE10)) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            h6cVar.read(byteBufferAllocate2);
            byteBufferAllocate2.rewind();
            this.samplesPerPacket = y0q.m213895k(byteBufferAllocate2);
            this.bytesPerPacket = y0q.m213895k(byteBufferAllocate2);
            this.bytesPerFrame = y0q.m213895k(byteBufferAllocate2);
            this.bytesPerSample = y0q.m213895k(byteBufferAllocate2);
        }
        if (this.soundVersion == 2) {
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(36);
            h6cVar.read(byteBufferAllocate3);
            byteBufferAllocate3.rewind();
            this.samplesPerPacket = y0q.m213895k(byteBufferAllocate3);
            this.bytesPerPacket = y0q.m213895k(byteBufferAllocate3);
            this.bytesPerFrame = y0q.m213895k(byteBufferAllocate3);
            this.bytesPerSample = y0q.m213895k(byteBufferAllocate3);
            byte[] bArr = new byte[20];
            this.soundVersion2Data = bArr;
            byteBufferAllocate3.get(bArr);
        }
        if (!TYPE7.equals(this.type)) {
            long j2 = j - 28;
            int i = this.soundVersion;
            initContainer(h6cVar, (j2 - ((long) (i != 1 ? 0 : 16))) - ((long) (i != 2 ? 0 : 36)), ff3Var);
            return;
        }
        System.err.println(TYPE7);
        long j3 = j - 28;
        int i2 = this.soundVersion;
        final long j4 = (j3 - ((long) (i2 != 1 ? 0 : 16))) - ((long) (i2 != 2 ? 0 : 36));
        final ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(rn4.m182119a(j4));
        h6cVar.read(byteBufferAllocate4);
        addBox(new ef3() { // from class: com.coremedia.iso.boxes.sampleentry.AudioSampleEntry.1
            @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
            public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                byteBufferAllocate4.rewind();
                writableByteChannel.write(byteBufferAllocate4);
            }

            public long getOffset() {
                return 0L;
            }

            @Override // p153l.ef3
            public t16 getParent() {
                return AudioSampleEntry.this;
            }

            @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
            public long getSize() {
                return j4;
            }

            @Override // p153l.ef3
            public String getType() {
                return InternalFrame.f7969ID;
            }

            public void parse(h6c h6cVar2, ByteBuffer byteBuffer2, long j5, ff3 ff3Var2) throws IOException {
                throw new RuntimeException("NotImplemented");
            }

            @Override // p153l.ef3
            public void setParent(t16 t16Var) {
                if (AudioSampleEntry.$assertionsDisabled || t16Var == AudioSampleEntry.this) {
                    return;
                }
                gig0.m130323a("you cannot diswown this special box");
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
