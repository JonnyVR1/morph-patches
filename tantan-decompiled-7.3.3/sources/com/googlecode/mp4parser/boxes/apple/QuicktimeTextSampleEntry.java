package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import p153l.b1q;
import p153l.ef3;
import p153l.ff3;
import p153l.h6c;
import p153l.p7f;
import p153l.rn4;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class QuicktimeTextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "text";
    int backgroundB;
    int backgroundG;
    int backgroundR;
    int dataReferenceIndex;
    long defaultTextBox;
    int displayFlags;
    short fontFace;
    String fontName;
    short fontNumber;
    int foregroundB;
    int foregroundG;
    int foregroundR;
    long reserved1;
    byte reserved2;
    short reserved3;
    int textJustification;

    public QuicktimeTextSampleEntry() {
        super("text");
        this.foregroundR = p7f.COLOR_SPACE_UNCALIBRATED;
        this.foregroundG = p7f.COLOR_SPACE_UNCALIBRATED;
        this.foregroundB = p7f.COLOR_SPACE_UNCALIBRATED;
        this.fontName = "";
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void addBox(ef3 ef3Var) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public int getBackgroundB() {
        return this.backgroundB;
    }

    public int getBackgroundG() {
        return this.backgroundG;
    }

    public int getBackgroundR() {
        return this.backgroundR;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        String str = this.fontName;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((str != null ? str.length() : 0) + 52);
        byteBufferAllocate.position(6);
        b1q.m101493e(byteBufferAllocate, this.dataReferenceIndex);
        byteBufferAllocate.putInt(this.displayFlags);
        byteBufferAllocate.putInt(this.textJustification);
        b1q.m101493e(byteBufferAllocate, this.backgroundR);
        b1q.m101493e(byteBufferAllocate, this.backgroundG);
        b1q.m101493e(byteBufferAllocate, this.backgroundB);
        b1q.m101497i(byteBufferAllocate, this.defaultTextBox);
        b1q.m101497i(byteBufferAllocate, this.reserved1);
        byteBufferAllocate.putShort(this.fontNumber);
        byteBufferAllocate.putShort(this.fontFace);
        byteBufferAllocate.put(this.reserved2);
        byteBufferAllocate.putShort(this.reserved3);
        b1q.m101493e(byteBufferAllocate, this.foregroundR);
        b1q.m101493e(byteBufferAllocate, this.foregroundG);
        b1q.m101493e(byteBufferAllocate, this.foregroundB);
        String str2 = this.fontName;
        if (str2 != null) {
            b1q.m101498j(byteBufferAllocate, str2.length());
            byteBufferAllocate.put(this.fontName.getBytes());
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
    }

    public long getDefaultTextBox() {
        return this.defaultTextBox;
    }

    public int getDisplayFlags() {
        return this.displayFlags;
    }

    public short getFontFace() {
        return this.fontFace;
    }

    public String getFontName() {
        return this.fontName;
    }

    public short getFontNumber() {
        return this.fontNumber;
    }

    public int getForegroundB() {
        return this.foregroundB;
    }

    public int getForegroundG() {
        return this.foregroundG;
    }

    public int getForegroundR() {
        return this.foregroundR;
    }

    public long getReserved1() {
        return this.reserved1;
    }

    public byte getReserved2() {
        return this.reserved2;
    }

    public short getReserved3() {
        return this.reserved3;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 52;
        String str = this.fontName;
        long length = containerSize + ((long) (str != null ? str.length() : 0));
        return length + ((long) ((this.largeBox || 8 + length >= 4294967296L) ? 16 : 8));
    }

    public int getTextJustification() {
        return this.textJustification;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(rn4.m182119a(j));
        h6cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = y0q.m213893i(byteBufferAllocate);
        this.displayFlags = byteBufferAllocate.getInt();
        this.textJustification = byteBufferAllocate.getInt();
        this.backgroundR = y0q.m213893i(byteBufferAllocate);
        this.backgroundG = y0q.m213893i(byteBufferAllocate);
        this.backgroundB = y0q.m213893i(byteBufferAllocate);
        this.defaultTextBox = y0q.m213897m(byteBufferAllocate);
        this.reserved1 = y0q.m213897m(byteBufferAllocate);
        this.fontNumber = byteBufferAllocate.getShort();
        this.fontFace = byteBufferAllocate.getShort();
        this.reserved2 = byteBufferAllocate.get();
        this.reserved3 = byteBufferAllocate.getShort();
        this.foregroundR = y0q.m213893i(byteBufferAllocate);
        this.foregroundG = y0q.m213893i(byteBufferAllocate);
        this.foregroundB = y0q.m213893i(byteBufferAllocate);
        if (byteBufferAllocate.remaining() <= 0) {
            this.fontName = null;
            return;
        }
        byte[] bArr = new byte[y0q.m213898n(byteBufferAllocate)];
        byteBufferAllocate.get(bArr);
        this.fontName = new String(bArr);
    }

    public void setBackgroundB(int i) {
        this.backgroundB = i;
    }

    public void setBackgroundG(int i) {
        this.backgroundG = i;
    }

    public void setBackgroundR(int i) {
        this.backgroundR = i;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void setBoxes(List<ef3> list) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public void setDefaultTextBox(long j) {
        this.defaultTextBox = j;
    }

    public void setDisplayFlags(int i) {
        this.displayFlags = i;
    }

    public void setFontFace(short s) {
        this.fontFace = s;
    }

    public void setFontName(String str) {
        this.fontName = str;
    }

    public void setFontNumber(short s) {
        this.fontNumber = s;
    }

    public void setForegroundB(int i) {
        this.foregroundB = i;
    }

    public void setForegroundG(int i) {
        this.foregroundG = i;
    }

    public void setForegroundR(int i) {
        this.foregroundR = i;
    }

    public void setReserved1(long j) {
        this.reserved1 = j;
    }

    public void setReserved2(byte b) {
        this.reserved2 = b;
    }

    public void setReserved3(short s) {
        this.reserved3 = s;
    }

    public void setTextJustification(int i) {
        this.textJustification = i;
    }
}
