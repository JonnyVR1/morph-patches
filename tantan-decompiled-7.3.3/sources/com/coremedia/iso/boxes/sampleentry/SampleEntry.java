package com.coremedia.iso.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p153l.ef3;
import p153l.ff3;
import p153l.h6c;
import p153l.t16;

/* JADX INFO: loaded from: classes.dex */
public interface SampleEntry extends ef3 {
    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    /* synthetic */ void getBox(WritableByteChannel writableByteChannel) throws IOException;

    int getDataReferenceIndex();

    /* synthetic */ long getOffset();

    @Override // p153l.ef3
    /* synthetic */ t16 getParent();

    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    /* synthetic */ long getSize();

    @Override // p153l.ef3
    /* synthetic */ String getType();

    /* synthetic */ void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException;

    void setDataReferenceIndex(int i);

    @Override // p153l.ef3
    /* synthetic */ void setParent(t16 t16Var);
}
