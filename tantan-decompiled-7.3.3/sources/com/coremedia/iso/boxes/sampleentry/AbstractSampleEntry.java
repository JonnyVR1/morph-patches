package com.coremedia.iso.boxes.sampleentry;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p153l.ff3;
import p153l.h6c;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry {
    protected int dataReferenceIndex;

    public AbstractSampleEntry(String str) {
        super(str);
        this.dataReferenceIndex = 1;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public abstract void getBox(WritableByteChannel writableByteChannel) throws IOException;

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.FullBox
    public abstract void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException;

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int i) {
        this.dataReferenceIndex = i;
    }
}
