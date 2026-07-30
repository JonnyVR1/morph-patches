package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import p149l.b5c;
import p149l.bzp;
import p149l.j6f;
import p149l.pe3;
import p149l.qe3;
import p149l.sm4;
import p149l.yyp;

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
        this.foregroundR = j6f.COLOR_SPACE_UNCALIBRATED;
        this.foregroundG = j6f.COLOR_SPACE_UNCALIBRATED;
        this.foregroundB = j6f.COLOR_SPACE_UNCALIBRATED;
        this.fontName = "";
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void addBox(pe3 pe3Var) {
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

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        String str = this.fontName;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((str != null ? str.length() : 0) + 52);
        byteBufferAllocate.position(6);
        bzp.m104633e(byteBufferAllocate, this.dataReferenceIndex);
        byteBufferAllocate.putInt(this.displayFlags);
        byteBufferAllocate.putInt(this.textJustification);
        bzp.m104633e(byteBufferAllocate, this.backgroundR);
        bzp.m104633e(byteBufferAllocate, this.backgroundG);
        bzp.m104633e(byteBufferAllocate, this.backgroundB);
        bzp.m104637i(byteBufferAllocate, this.defaultTextBox);
        bzp.m104637i(byteBufferAllocate, this.reserved1);
        byteBufferAllocate.putShort(this.fontNumber);
        byteBufferAllocate.putShort(this.fontFace);
        byteBufferAllocate.put(this.reserved2);
        byteBufferAllocate.putShort(this.reserved3);
        bzp.m104633e(byteBufferAllocate, this.foregroundR);
        bzp.m104633e(byteBufferAllocate, this.foregroundG);
        bzp.m104633e(byteBufferAllocate, this.foregroundB);
        String str2 = this.fontName;
        if (str2 != null) {
            bzp.m104638j(byteBufferAllocate, str2.length());
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

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
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
    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sm4.m184929a(j));
        b5cVar.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.dataReferenceIndex = yyp.m216556i(byteBufferAllocate);
        this.displayFlags = byteBufferAllocate.getInt();
        this.textJustification = byteBufferAllocate.getInt();
        this.backgroundR = yyp.m216556i(byteBufferAllocate);
        this.backgroundG = yyp.m216556i(byteBufferAllocate);
        this.backgroundB = yyp.m216556i(byteBufferAllocate);
        this.defaultTextBox = yyp.m216560m(byteBufferAllocate);
        this.reserved1 = yyp.m216560m(byteBufferAllocate);
        this.fontNumber = byteBufferAllocate.getShort();
        this.fontFace = byteBufferAllocate.getShort();
        this.reserved2 = byteBufferAllocate.get();
        this.reserved3 = byteBufferAllocate.getShort();
        this.foregroundR = yyp.m216556i(byteBufferAllocate);
        this.foregroundG = yyp.m216556i(byteBufferAllocate);
        this.foregroundB = yyp.m216556i(byteBufferAllocate);
        if (byteBufferAllocate.remaining() <= 0) {
            this.fontName = null;
            return;
        }
        byte[] bArr = new byte[yyp.m216561n(byteBufferAllocate)];
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
    public void setBoxes(List<pe3> list) {
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
