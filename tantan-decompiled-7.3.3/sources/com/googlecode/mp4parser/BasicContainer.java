package com.googlecode.mp4parser;

import com.meituan.robust.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p153l.ef3;
import p153l.ff3;
import p153l.h6c;
import p153l.mor;
import p153l.pbr;
import p153l.rn4;
import p153l.szv;
import p153l.t16;

/* JADX INFO: loaded from: classes7.dex */
public class BasicContainer implements t16, Iterator<ef3>, Closeable {
    private static final ef3 EOF = new AbstractBox("eof ") { // from class: com.googlecode.mp4parser.BasicContainer.1
        @Override // com.googlecode.mp4parser.AbstractBox
        public void _parseDetails(ByteBuffer byteBuffer) {
        }

        @Override // com.googlecode.mp4parser.AbstractBox
        public void getContent(ByteBuffer byteBuffer) {
        }

        @Override // com.googlecode.mp4parser.AbstractBox
        public long getContentSize() {
            return 0L;
        }
    };
    private static szv LOG = szv.m188683a(BasicContainer.class);
    protected ff3 boxParser;
    protected h6c dataSource;
    ef3 lookahead = null;
    long parsePosition = 0;
    long startPosition = 0;
    long endPosition = 0;
    private List<ef3> boxes = new ArrayList();

    public void addBox(ef3 ef3Var) {
        if (ef3Var != null) {
            this.boxes = new ArrayList(getBoxes());
            ef3Var.setParent(this);
            this.boxes.add(ef3Var);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.dataSource.close();
    }

    public <T extends ef3> List<T> getBoxes(Class<T> cls) {
        List<ef3> boxes = getBoxes();
        ArrayList arrayList = null;
        ef3 ef3Var = null;
        for (int i = 0; i < boxes.size(); i++) {
            ef3 ef3Var2 = boxes.get(i);
            if (cls.isInstance(ef3Var2)) {
                if (ef3Var == null) {
                    ef3Var = ef3Var2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(ef3Var);
                    }
                    arrayList.add(ef3Var2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        return ef3Var != null ? Collections.singletonList(ef3Var) : Collections.EMPTY_LIST;
    }

    public ByteBuffer getByteBuffer(long j, long j2) throws IOException {
        ByteBuffer byteBufferMo7441K;
        h6c h6cVar = this.dataSource;
        if (h6cVar != null) {
            synchronized (h6cVar) {
                byteBufferMo7441K = this.dataSource.mo7441K(this.startPosition + j, j2);
            }
            return byteBufferMo7441K;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(rn4.m182119a(j2));
        long j3 = j2 + j;
        long j4 = 0;
        for (ef3 ef3Var : this.boxes) {
            long size = ef3Var.getSize() + j4;
            if (size > j && j4 < j3) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(byteArrayOutputStream);
                ef3Var.getBox(writableByteChannelNewChannel);
                writableByteChannelNewChannel.close();
                if (j4 >= j && size <= j3) {
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray());
                } else if (j4 < j && size > j3) {
                    long j5 = j - j4;
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), rn4.m182119a(j5), rn4.m182119a((ef3Var.getSize() - j5) - (size - j3)));
                } else if (j4 < j && size <= j3) {
                    long j6 = j - j4;
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), rn4.m182119a(j6), rn4.m182119a(ef3Var.getSize() - j6));
                } else if (j4 >= j && size > j3) {
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), 0, rn4.m182119a(ef3Var.getSize() - (size - j3)));
                }
            }
            j4 = size;
        }
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    public long getContainerSize() {
        long size = 0;
        for (int i = 0; i < getBoxes().size(); i++) {
            size += this.boxes.get(i).getSize();
        }
        return size;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ef3 ef3Var = this.lookahead;
        if (ef3Var == EOF) {
            return false;
        }
        if (ef3Var != null) {
            return true;
        }
        try {
            this.lookahead = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.lookahead = EOF;
            return false;
        }
    }

    public void initContainer(h6c h6cVar, long j, ff3 ff3Var) throws IOException {
        this.dataSource = h6cVar;
        long jPosition = h6cVar.position();
        this.startPosition = jPosition;
        this.parsePosition = jPosition;
        h6cVar.position(h6cVar.position() + j);
        this.endPosition = h6cVar.position();
    }

    @Override // java.util.Iterator
    public ef3 next() {
        ef3 ef3Var = this.lookahead;
        if (ef3Var != null && ef3Var != EOF) {
            this.lookahead = null;
            return ef3Var;
        }
        h6c h6cVar = this.dataSource;
        if (h6cVar == null || this.parsePosition >= this.endPosition) {
            this.lookahead = EOF;
            mor.m159308a();
            return null;
        }
        try {
            synchronized (h6cVar) {
                this.dataSource.position(this.parsePosition);
                throw null;
            }
        } catch (EOFException unused) {
            mor.m159308a();
            return null;
        } catch (IOException unused2) {
            mor.m159308a();
            return null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void setBoxes(List<ef3> list) {
        this.boxes = new ArrayList(list);
        this.lookahead = EOF;
        this.dataSource = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.boxes.size(); i++) {
            if (i > 0) {
                sb.append(Constants.PACKNAME_END);
            }
            sb.append(this.boxes.get(i).toString());
        }
        sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return sb.toString();
    }

    public final void writeContainer(WritableByteChannel writableByteChannel) throws IOException {
        Iterator<ef3> it = getBoxes().iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
    }

    @Override // p153l.t16
    public List<ef3> getBoxes() {
        if (this.dataSource != null && this.lookahead != EOF) {
            return new pbr(this.boxes, this);
        }
        return this.boxes;
    }

    @Override // p153l.t16
    public <T extends ef3> List<T> getBoxes(Class<T> cls, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        List<ef3> boxes = getBoxes();
        for (int i = 0; i < boxes.size(); i++) {
            ef3 ef3Var = boxes.get(i);
            if (cls.isInstance(ef3Var)) {
                arrayList.add(ef3Var);
            }
            if (z && (ef3Var instanceof t16)) {
                arrayList.addAll(((t16) ef3Var).getBoxes(cls, z));
            }
        }
        return arrayList;
    }
}
