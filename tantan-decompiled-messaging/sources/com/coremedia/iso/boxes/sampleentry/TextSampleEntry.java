package com.coremedia.iso.boxes.sampleentry;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import p149l.b5c;
import p149l.bzp;
import p149l.qe3;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class TextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private C1406a boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private C1407b styleRecord;
    private int verticalJustification;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.sampleentry.TextSampleEntry$a */
    public static class C1406a {

        /* JADX INFO: renamed from: a */
        int f5779a;

        /* JADX INFO: renamed from: b */
        int f5780b;

        /* JADX INFO: renamed from: c */
        int f5781c;

        /* JADX INFO: renamed from: d */
        int f5782d;

        /* JADX INFO: renamed from: a */
        public void m7383a(ByteBuffer byteBuffer) {
            bzp.m104633e(byteBuffer, this.f5779a);
            bzp.m104633e(byteBuffer, this.f5780b);
            bzp.m104633e(byteBuffer, this.f5781c);
            bzp.m104633e(byteBuffer, this.f5782d);
        }

        /* JADX INFO: renamed from: b */
        public void m7384b(ByteBuffer byteBuffer) {
            this.f5779a = yyp.m216556i(byteBuffer);
            this.f5780b = yyp.m216556i(byteBuffer);
            this.f5781c = yyp.m216556i(byteBuffer);
            this.f5782d = yyp.m216556i(byteBuffer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1406a c1406a = (C1406a) obj;
            return this.f5781c == c1406a.f5781c && this.f5780b == c1406a.f5780b && this.f5782d == c1406a.f5782d && this.f5779a == c1406a.f5779a;
        }

        public int hashCode() {
            return (((((this.f5779a * 31) + this.f5780b) * 31) + this.f5781c) * 31) + this.f5782d;
        }
    }

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.sampleentry.TextSampleEntry$b */
    public static class C1407b {

        /* JADX INFO: renamed from: a */
        int f5783a;

        /* JADX INFO: renamed from: b */
        int f5784b;

        /* JADX INFO: renamed from: c */
        int f5785c;

        /* JADX INFO: renamed from: d */
        int f5786d;

        /* JADX INFO: renamed from: e */
        int f5787e;

        /* JADX INFO: renamed from: f */
        int[] f5788f = {255, 255, 255, 255};

        /* JADX INFO: renamed from: a */
        public void m7385a(ByteBuffer byteBuffer) {
            bzp.m104633e(byteBuffer, this.f5783a);
            bzp.m104633e(byteBuffer, this.f5784b);
            bzp.m104633e(byteBuffer, this.f5785c);
            bzp.m104638j(byteBuffer, this.f5786d);
            bzp.m104638j(byteBuffer, this.f5787e);
            bzp.m104638j(byteBuffer, this.f5788f[0]);
            bzp.m104638j(byteBuffer, this.f5788f[1]);
            bzp.m104638j(byteBuffer, this.f5788f[2]);
            bzp.m104638j(byteBuffer, this.f5788f[3]);
        }

        /* JADX INFO: renamed from: b */
        public void m7386b(ByteBuffer byteBuffer) {
            this.f5783a = yyp.m216556i(byteBuffer);
            this.f5784b = yyp.m216556i(byteBuffer);
            this.f5785c = yyp.m216556i(byteBuffer);
            this.f5786d = yyp.m216561n(byteBuffer);
            this.f5787e = yyp.m216561n(byteBuffer);
            int[] iArr = new int[4];
            this.f5788f = iArr;
            iArr[0] = yyp.m216561n(byteBuffer);
            this.f5788f[1] = yyp.m216561n(byteBuffer);
            this.f5788f[2] = yyp.m216561n(byteBuffer);
            this.f5788f[3] = yyp.m216561n(byteBuffer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1407b c1407b = (C1407b) obj;
            return this.f5784b == c1407b.f5784b && this.f5786d == c1407b.f5786d && this.f5785c == c1407b.f5785c && this.f5787e == c1407b.f5787e && this.f5783a == c1407b.f5783a && Arrays.equals(this.f5788f, c1407b.f5788f);
        }

        public int hashCode() {
            int i = ((((((((this.f5783a * 31) + this.f5784b) * 31) + this.f5785c) * 31) + this.f5786d) * 31) + this.f5787e) * 31;
            int[] iArr = this.f5788f;
            return i + (iArr != null ? Arrays.hashCode(iArr) : 0);
        }
    }

    public TextSampleEntry() {
        super(TYPE1);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new C1406a();
        this.styleRecord = new C1407b();
    }

    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(38);
        byteBufferAllocate.position(6);
        bzp.m104633e(byteBufferAllocate, this.dataReferenceIndex);
        bzp.m104635g(byteBufferAllocate, this.displayFlags);
        bzp.m104638j(byteBufferAllocate, this.horizontalJustification);
        bzp.m104638j(byteBufferAllocate, this.verticalJustification);
        bzp.m104638j(byteBufferAllocate, this.backgroundColorRgba[0]);
        bzp.m104638j(byteBufferAllocate, this.backgroundColorRgba[1]);
        bzp.m104638j(byteBufferAllocate, this.backgroundColorRgba[2]);
        bzp.m104638j(byteBufferAllocate, this.backgroundColorRgba[3]);
        this.boxRecord.m7383a(byteBufferAllocate);
        this.styleRecord.m7385a(byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    public C1406a getBoxRecord() {
        return this.boxRecord;
    }

    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 38;
        return containerSize + ((long) ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8));
    }

    public C1407b getStyleRecord() {
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
    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(38);
        b5cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = yyp.m216556i(byteBufferAllocate);
        this.displayFlags = yyp.m216558k(byteBufferAllocate);
        this.horizontalJustification = yyp.m216561n(byteBufferAllocate);
        this.verticalJustification = yyp.m216561n(byteBufferAllocate);
        int[] iArr = new int[4];
        this.backgroundColorRgba = iArr;
        iArr[0] = yyp.m216561n(byteBufferAllocate);
        this.backgroundColorRgba[1] = yyp.m216561n(byteBufferAllocate);
        this.backgroundColorRgba[2] = yyp.m216561n(byteBufferAllocate);
        this.backgroundColorRgba[3] = yyp.m216561n(byteBufferAllocate);
        C1406a c1406a = new C1406a();
        this.boxRecord = c1406a;
        c1406a.m7384b(byteBufferAllocate);
        C1407b c1407b = new C1407b();
        this.styleRecord = c1407b;
        c1407b.m7386b(byteBufferAllocate);
        initContainer(b5cVar, j - 38, qe3Var);
    }

    public void setBackgroundColorRgba(int[] iArr) {
        this.backgroundColorRgba = iArr;
    }

    public void setBoxRecord(C1406a c1406a) {
        this.boxRecord = c1406a;
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

    public void setStyleRecord(C1407b c1407b) {
        this.styleRecord = c1407b;
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
        this.boxRecord = new C1406a();
        this.styleRecord = new C1407b();
    }
}
