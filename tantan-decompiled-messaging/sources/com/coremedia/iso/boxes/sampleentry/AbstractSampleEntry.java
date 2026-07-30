package com.coremedia.iso.boxes.sampleentry;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.qe3;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry {
    protected int dataReferenceIndex;

    public AbstractSampleEntry(String str) {
        super(str);
        this.dataReferenceIndex = 1;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public abstract void getBox(WritableByteChannel writableByteChannel) throws IOException;

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public abstract void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException;

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int i) {
        this.dataReferenceIndex = i;
    }
}
