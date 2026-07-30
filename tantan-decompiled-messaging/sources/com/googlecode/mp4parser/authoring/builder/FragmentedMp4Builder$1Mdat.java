package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.mdat.MediaDataBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import p149l.b5c;
import p149l.bzp;
import p149l.f3j;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;
import p149l.sm4;
import p149l.sod0;
import p149l.t5j0;
import p149l.wyp;

/* JADX INFO: loaded from: classes7.dex */
class FragmentedMp4Builder$1Mdat implements pe3 {
    o06 parent;
    long size_ = -1;
    final /* synthetic */ f3j this$0;
    private final /* synthetic */ long val$endSample;
    private final /* synthetic */ int val$i;
    private final /* synthetic */ long val$startSample;
    private final /* synthetic */ t5j0 val$track;

    public FragmentedMp4Builder$1Mdat(f3j f3jVar, long j, long j2, t5j0 t5j0Var, int i) {
        this.this$0 = f3jVar;
        this.val$startSample = j;
        this.val$endSample = j2;
        this.val$track = t5j0Var;
        this.val$i = i;
    }

    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        bzp.m104635g(byteBufferAllocate, sm4.m184929a(getSize()));
        byteBufferAllocate.put(wyp.m206118d(getType()));
        byteBufferAllocate.rewind();
        writableByteChannel.write(byteBufferAllocate);
        Iterator<sod0> it = this.this$0.m119260a(this.val$startSample, this.val$endSample, this.val$track, this.val$i).iterator();
        while (it.hasNext()) {
            it.next().m185290a(writableByteChannel);
        }
    }

    public long getOffset() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }

    @Override // p149l.pe3
    public o06 getParent() {
        return this.parent;
    }

    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long j = this.size_;
        if (j != -1) {
            return j;
        }
        Iterator<sod0> it = this.this$0.m119260a(this.val$startSample, this.val$endSample, this.val$track, this.val$i).iterator();
        long size = 8;
        while (it.hasNext()) {
            size += it.next().getSize();
        }
        this.size_ = size;
        return size;
    }

    @Override // p149l.pe3
    public String getType() {
        return MediaDataBox.TYPE;
    }

    @Override // p149l.pe3
    public void setParent(o06 o06Var) {
        this.parent = o06Var;
    }

    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
    }
}
