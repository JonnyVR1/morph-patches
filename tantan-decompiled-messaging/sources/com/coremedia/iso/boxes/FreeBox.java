package com.coremedia.iso.boxes;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p149l.b5c;
import p149l.bzp;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;
import p149l.sm4;

/* JADX INFO: loaded from: classes.dex */
public class FreeBox implements pe3 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private o06 parent;
    List<pe3> replacers;

    public FreeBox() {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.wrap(new byte[0]);
    }

    public void addAndReplace(pe3 pe3Var) {
        this.data.position(sm4.m184929a(pe3Var.getSize()));
        this.data = this.data.slice();
        this.replacers.add(pe3Var);
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

    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        Iterator<pe3> it = this.replacers.iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        bzp.m104635g(byteBufferAllocate, this.data.limit() + 8);
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

    @Override // p149l.pe3
    public o06 getParent() {
        return this.parent;
    }

    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        Iterator<pe3> it = this.replacers.iterator();
        long size = 8;
        while (it.hasNext()) {
            size += it.next().getSize();
        }
        return size + ((long) this.data.limit());
    }

    @Override // p149l.pe3
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

    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        this.offset = b5cVar.position() - ((long) byteBuffer.remaining());
        if (j > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            this.data = b5cVar.mo7387K(b5cVar.position(), j);
            b5cVar.position(b5cVar.position() + j);
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sm4.m184929a(j));
            this.data = byteBufferAllocate;
            b5cVar.read(byteBufferAllocate);
        }
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    @Override // p149l.pe3
    public void setParent(o06 o06Var) {
        this.parent = o06Var;
    }

    public FreeBox(int i) {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.allocate(i);
    }
}
