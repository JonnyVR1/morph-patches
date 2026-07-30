package com.coremedia.iso.boxes;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p153l.b1q;
import p153l.ef3;
import p153l.ff3;
import p153l.h6c;
import p153l.rn4;
import p153l.t16;

/* JADX INFO: loaded from: classes.dex */
public class FreeBox implements ef3 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private t16 parent;
    List<ef3> replacers;

    public FreeBox() {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.wrap(new byte[0]);
    }

    public void addAndReplace(ef3 ef3Var) {
        this.data.position(rn4.m182119a(ef3Var.getSize()));
        this.data = this.data.slice();
        this.replacers.add(ef3Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FreeBox freeBox = (FreeBox) obj;
        return getData() == null ? freeBox.getData() == null : getData().equals(freeBox.getData());
    }

    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        Iterator<ef3> it = this.replacers.iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        b1q.m101495g(byteBufferAllocate, this.data.limit() + 8);
        byteBufferAllocate.put("free".getBytes());
        byteBufferAllocate.rewind();
        writableByteChannel.write(byteBufferAllocate);
        byteBufferAllocate.rewind();
        this.data.rewind();
        writableByteChannel.write(this.data);
        this.data.rewind();
    }

    public ByteBuffer getData() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return (ByteBuffer) byteBuffer.duplicate().rewind();
        }
        return null;
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // p153l.ef3
    public t16 getParent() {
        return this.parent;
    }

    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        Iterator<ef3> it = this.replacers.iterator();
        long size = 8;
        while (it.hasNext()) {
            size += it.next().getSize();
        }
        return size + ((long) this.data.limit());
    }

    @Override // p153l.ef3
    public String getType() {
        return "free";
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        this.offset = h6cVar.position() - ((long) byteBuffer.remaining());
        if (j > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            this.data = h6cVar.mo7441K(h6cVar.position(), j);
            h6cVar.position(h6cVar.position() + j);
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(rn4.m182119a(j));
            this.data = byteBufferAllocate;
            h6cVar.read(byteBufferAllocate);
        }
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    @Override // p153l.ef3
    public void setParent(t16 t16Var) {
        this.parent = t16Var;
    }

    public FreeBox(int i) {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.allocate(i);
    }
}
