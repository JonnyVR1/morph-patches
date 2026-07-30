package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.mdat.MediaDataBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import p153l.a6j;
import p153l.b1q;
import p153l.ef3;
import p153l.ff3;
import p153l.h6c;
import p153l.rn4;
import p153l.t16;
import p153l.uwd0;
import p153l.w0q;
import p153l.xej0;

/* JADX INFO: loaded from: classes7.dex */
class FragmentedMp4Builder$1Mdat implements ef3 {
    t16 parent;
    long size_ = -1;
    final /* synthetic */ a6j this$0;
    private final /* synthetic */ long val$endSample;
    private final /* synthetic */ int val$i;
    private final /* synthetic */ long val$startSample;
    private final /* synthetic */ xej0 val$track;

    public FragmentedMp4Builder$1Mdat(a6j a6jVar, long j, long j2, xej0 xej0Var, int i) {
        this.this$0 = a6jVar;
        this.val$startSample = j;
        this.val$endSample = j2;
        this.val$track = xej0Var;
        this.val$i = i;
    }

    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        b1q.m101495g(byteBufferAllocate, rn4.m182119a(getSize()));
        byteBufferAllocate.put(w0q.m204214d(getType()));
        byteBufferAllocate.rewind();
        writableByteChannel.write(byteBufferAllocate);
        Iterator<uwd0> it = this.this$0.m96328a(this.val$startSample, this.val$endSample, this.val$track, this.val$i).iterator();
        while (it.hasNext()) {
            it.next().m198348a(writableByteChannel);
        }
    }

    public long getOffset() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }

    @Override // p153l.ef3
    public t16 getParent() {
        return this.parent;
    }

    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long j = this.size_;
        if (j != -1) {
            return j;
        }
        Iterator<uwd0> it = this.this$0.m96328a(this.val$startSample, this.val$endSample, this.val$track, this.val$i).iterator();
        long size = 8;
        while (it.hasNext()) {
            size += it.next().getSize();
        }
        this.size_ = size;
        return size;
    }

    @Override // p153l.ef3
    public String getType() {
        return MediaDataBox.TYPE;
    }

    @Override // p153l.ef3
    public void setParent(t16 t16Var) {
        this.parent = t16Var;
    }

    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
    }
}
