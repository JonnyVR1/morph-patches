package com.coremedia.iso.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;

/* JADX INFO: loaded from: classes.dex */
public interface SampleEntry extends pe3 {
    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
    /* synthetic */ void getBox(WritableByteChannel writableByteChannel) throws IOException;

    int getDataReferenceIndex();

    /* synthetic */ long getOffset();

    @Override // p149l.pe3
    /* synthetic */ o06 getParent();

    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
    /* synthetic */ long getSize();

    @Override // p149l.pe3
    /* synthetic */ String getType();

    /* synthetic */ void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException;

    void setDataReferenceIndex(int i);

    @Override // p149l.pe3
    /* synthetic */ void setParent(o06 o06Var);
}
