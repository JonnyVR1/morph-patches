package com.coremedia.iso.boxes.sampleentry;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import p153l.b1q;
import p153l.ff3;
import p153l.h6c;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class TextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private C1429a boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private C1430b styleRecord;
    private int verticalJustification;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.sampleentry.TextSampleEntry$a */
    public static class C1429a {

        /* JADX INFO: renamed from: a */
        int f5816a;

        /* JADX INFO: renamed from: b */
        int f5817b;

        /* JADX INFO: renamed from: c */
        int f5818c;

        /* JADX INFO: renamed from: d */
        int f5819d;

        /* JADX INFO: renamed from: a */
        public void m7437a(ByteBuffer byteBuffer) {
            b1q.m101493e(byteBuffer, this.f5816a);
            b1q.m101493e(byteBuffer, this.f5817b);
            b1q.m101493e(byteBuffer, this.f5818c);
            b1q.m101493e(byteBuffer, this.f5819d);
        }

        /* JADX INFO: renamed from: b */
        public void m7438b(ByteBuffer byteBuffer) {
            this.f5816a = y0q.m213893i(byteBuffer);
            this.f5817b = y0q.m213893i(byteBuffer);
            this.f5818c = y0q.m213893i(byteBuffer);
            this.f5819d = y0q.m213893i(byteBuffer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1429a c1429a = (C1429a) obj;
            return this.f5818c == c1429a.f5818c && this.f5817b == c1429a.f5817b && this.f5819d == c1429a.f5819d && this.f5816a == c1429a.f5816a;
        }

        public int hashCode() {
            return (((((this.f5816a * 31) + this.f5817b) * 31) + this.f5818c) * 31) + this.f5819d;
        }
    }

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.sampleentry.TextSampleEntry$b */
    public static class C1430b {

        /* JADX INFO: renamed from: a */
        int f5820a;

        /* JADX INFO: renamed from: b */
        int f5821b;

        /* JADX INFO: renamed from: c */
        int f5822c;

        /* JADX INFO: renamed from: d */
        int f5823d;

        /* JADX INFO: renamed from: e */
        int f5824e;

        /* JADX INFO: renamed from: f */
        int[] f5825f = {255, 255, 255, 255};

        /* JADX INFO: renamed from: a */
        public void m7439a(ByteBuffer byteBuffer) {
            b1q.m101493e(byteBuffer, this.f5820a);
            b1q.m101493e(byteBuffer, this.f5821b);
            b1q.m101493e(byteBuffer, this.f5822c);
            b1q.m101498j(byteBuffer, this.f5823d);
            b1q.m101498j(byteBuffer, this.f5824e);
            b1q.m101498j(byteBuffer, this.f5825f[0]);
            b1q.m101498j(byteBuffer, this.f5825f[1]);
            b1q.m101498j(byteBuffer, this.f5825f[2]);
            b1q.m101498j(byteBuffer, this.f5825f[3]);
        }

        /* JADX INFO: renamed from: b */
        public void m7440b(ByteBuffer byteBuffer) {
            this.f5820a = y0q.m213893i(byteBuffer);
            this.f5821b = y0q.m213893i(byteBuffer);
            this.f5822c = y0q.m213893i(byteBuffer);
            this.f5823d = y0q.m213898n(byteBuffer);
            this.f5824e = y0q.m213898n(byteBuffer);
            int[] iArr = new int[4];
            this.f5825f = iArr;
            iArr[0] = y0q.m213898n(byteBuffer);
            this.f5825f[1] = y0q.m213898n(byteBuffer);
            this.f5825f[2] = y0q.m213898n(byteBuffer);
            this.f5825f[3] = y0q.m213898n(byteBuffer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1430b c1430b = (C1430b) obj;
            return this.f5821b == c1430b.f5821b && this.f5823d == c1430b.f5823d && this.f5822c == c1430b.f5822c && this.f5824e == c1430b.f5824e && this.f5820a == c1430b.f5820a && Arrays.equals(this.f5825f, c1430b.f5825f);
        }

        public int hashCode() {
            int i = ((((((((this.f5820a * 31) + this.f5821b) * 31) + this.f5822c) * 31) + this.f5823d) * 31) + this.f5824e) * 31;
            int[] iArr = this.f5825f;
            return i + (iArr != null ? Arrays.hashCode(iArr) : 0);
        }
    }

    public TextSampleEntry() {
        super(TYPE1);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new C1429a();
        this.styleRecord = new C1430b();
    }

    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(38);
        byteBufferAllocate.position(6);
        b1q.m101493e(byteBufferAllocate, this.dataReferenceIndex);
        b1q.m101495g(byteBufferAllocate, this.displayFlags);
        b1q.m101498j(byteBufferAllocate, this.horizontalJustification);
        b1q.m101498j(byteBufferAllocate, this.verticalJustification);
        b1q.m101498j(byteBufferAllocate, this.backgroundColorRgba[0]);
        b1q.m101498j(byteBufferAllocate, this.backgroundColorRgba[1]);
        b1q.m101498j(byteBufferAllocate, this.backgroundColorRgba[2]);
        b1q.m101498j(byteBufferAllocate, this.backgroundColorRgba[3]);
        this.boxRecord.m7437a(byteBufferAllocate);
        this.styleRecord.m7439a(byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public C1429a getBoxRecord() {
        return this.boxRecord;
    }

    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 38;
        return containerSize + ((long) ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8));
    }

    public C1430b getStyleRecord() {
        return this.styleRecord;
    }

    public int getVerticalJustification() {
        return this.verticalJustification;
    }

    public boolean isContinuousKaraoke() {
        return (this.displayFlags & 2048) == 2048;
    }

    public boolean isFillTextRegion() {
        return (this.displayFlags & PlaybackStateCompat.ACTION_SET_REPEAT_MODE) == PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public boolean isScrollDirection() {
        return (this.displayFlags & 384) == 384;
    }

    public boolean isScrollIn() {
        return (this.displayFlags & 32) == 32;
    }

    public boolean isScrollOut() {
        return (this.displayFlags & 64) == 64;
    }

    public boolean isWriteTextVertically() {
        return (this.displayFlags & 131072) == 131072;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(38);
        h6cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = y0q.m213893i(byteBufferAllocate);
        this.displayFlags = y0q.m213895k(byteBufferAllocate);
        this.horizontalJustification = y0q.m213898n(byteBufferAllocate);
        this.verticalJustification = y0q.m213898n(byteBufferAllocate);
        int[] iArr = new int[4];
        this.backgroundColorRgba = iArr;
        iArr[0] = y0q.m213898n(byteBufferAllocate);
        this.backgroundColorRgba[1] = y0q.m213898n(byteBufferAllocate);
        this.backgroundColorRgba[2] = y0q.m213898n(byteBufferAllocate);
        this.backgroundColorRgba[3] = y0q.m213898n(byteBufferAllocate);
        C1429a c1429a = new C1429a();
        this.boxRecord = c1429a;
        c1429a.m7438b(byteBufferAllocate);
        C1430b c1430b = new C1430b();
        this.styleRecord = c1430b;
        c1430b.m7440b(byteBufferAllocate);
        initContainer(h6cVar, j - 38, ff3Var);
    }

    public void setBackgroundColorRgba(int[] iArr) {
        this.backgroundColorRgba = iArr;
    }

    public void setBoxRecord(C1429a c1429a) {
        this.boxRecord = c1429a;
    }

    public void setContinuousKaraoke(boolean z) {
        long j = this.displayFlags;
        if (z) {
            this.displayFlags = j | 2048;
        } else {
            this.displayFlags = j & (-2049);
        }
    }

    public void setFillTextRegion(boolean z) {
        long j = this.displayFlags;
        if (z) {
            this.displayFlags = j | PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        } else {
            this.displayFlags = j & (-262145);
        }
    }

    public void setHorizontalJustification(int i) {
        this.horizontalJustification = i;
    }

    public void setScrollDirection(boolean z) {
        long j = this.displayFlags;
        if (z) {
            this.displayFlags = j | 384;
        } else {
            this.displayFlags = j & (-385);
        }
    }

    public void setScrollIn(boolean z) {
        long j = this.displayFlags;
        if (z) {
            this.displayFlags = j | 32;
        } else {
            this.displayFlags = j & (-33);
        }
    }

    public void setScrollOut(boolean z) {
        long j = this.displayFlags;
        if (z) {
            this.displayFlags = j | 64;
        } else {
            this.displayFlags = j & (-65);
        }
    }

    public void setStyleRecord(C1430b c1430b) {
        this.styleRecord = c1430b;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVerticalJustification(int i) {
        this.verticalJustification = i;
    }

    public void setWriteTextVertically(boolean z) {
        long j = this.displayFlags;
        if (z) {
            this.displayFlags = j | 131072;
        } else {
            this.displayFlags = j & (-131073);
        }
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return "TextSampleEntry";
    }

    public TextSampleEntry(String str) {
        super(str);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new C1429a();
        this.styleRecord = new C1430b();
    }
}
