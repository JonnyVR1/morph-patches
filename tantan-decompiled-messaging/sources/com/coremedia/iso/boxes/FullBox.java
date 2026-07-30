package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;

/* JADX INFO: loaded from: classes.dex */
public interface FullBox extends pe3 {
    /* synthetic */ void getBox(WritableByteChannel writableByteChannel) throws IOException;

    int getFlags();

    /* synthetic */ long getOffset();

    @Override // p149l.pe3
    /* synthetic */ o06 getParent();

    /* synthetic */ long getSize();

    @Override // p149l.pe3
    /* synthetic */ String getType();

    int getVersion();

    /* synthetic */ void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException;

    void setFlags(int i);

    @Override // p149l.pe3
    /* synthetic */ void setParent(o06 o06Var);

    void setVersion(int i);
}
