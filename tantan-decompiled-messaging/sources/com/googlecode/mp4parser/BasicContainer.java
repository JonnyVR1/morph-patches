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
import p149l.b5c;
import p149l.lmr;
import p149l.n9r;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;
import p149l.sm4;
import p149l.vxv;

/* JADX INFO: loaded from: classes7.dex */
public class BasicContainer implements o06, Iterator<pe3>, Closeable {
    private static final pe3 EOF = new AbstractBox("eof ") { // from class: com.googlecode.mp4parser.BasicContainer.1
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
    private static vxv LOG = vxv.m200598a(BasicContainer.class);
    protected qe3 boxParser;
    protected b5c dataSource;
    pe3 lookahead = null;
    long parsePosition = 0;
    long startPosition = 0;
    long endPosition = 0;
    private List<pe3> boxes = new ArrayList();

    public void addBox(pe3 pe3Var) {
        if (pe3Var != null) {
            this.boxes = new ArrayList(getBoxes());
            pe3Var.setParent(this);
            this.boxes.add(pe3Var);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.dataSource.close();
    }

    public <T extends pe3> List<T> getBoxes(Class<T> cls) {
        List<pe3> boxes = getBoxes();
        ArrayList arrayList = null;
        pe3 pe3Var = null;
        for (int i = 0; i < boxes.size(); i++) {
            pe3 pe3Var2 = boxes.get(i);
            if (cls.isInstance(pe3Var2)) {
                if (pe3Var == null) {
                    pe3Var = pe3Var2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(pe3Var);
                    }
                    arrayList.add(pe3Var2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        return pe3Var != null ? Collections.singletonList(pe3Var) : Collections.EMPTY_LIST;
    }

    public ByteBuffer getByteBuffer(long j, long j2) throws IOException {
        ByteBuffer byteBufferMo7387K;
        b5c b5cVar = this.dataSource;
        if (b5cVar != null) {
            synchronized (b5cVar) {
                byteBufferMo7387K = this.dataSource.mo7387K(this.startPosition + j, j2);
            }
            return byteBufferMo7387K;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sm4.m184929a(j2));
        long j3 = j2 + j;
        long j4 = 0;
        for (pe3 pe3Var : this.boxes) {
            long size = pe3Var.getSize() + j4;
            if (size > j && j4 < j3) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(byteArrayOutputStream);
                pe3Var.getBox(writableByteChannelNewChannel);
                writableByteChannelNewChannel.close();
                if (j4 >= j && size <= j3) {
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray());
                } else if (j4 < j && size > j3) {
                    long j5 = j - j4;
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), sm4.m184929a(j5), sm4.m184929a((pe3Var.getSize() - j5) - (size - j3)));
                } else if (j4 < j && size <= j3) {
                    long j6 = j - j4;
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), sm4.m184929a(j6), sm4.m184929a(pe3Var.getSize() - j6));
                } else if (j4 >= j && size > j3) {
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), 0, sm4.m184929a(pe3Var.getSize() - (size - j3)));
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
        pe3 pe3Var = this.lookahead;
        if (pe3Var == EOF) {
            return false;
        }
        if (pe3Var != null) {
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

    public void initContainer(b5c b5cVar, long j, qe3 qe3Var) throws IOException {
        this.dataSource = b5cVar;
        long jPosition = b5cVar.position();
        this.startPosition = jPosition;
        this.parsePosition = jPosition;
        b5cVar.position(b5cVar.position() + j);
        this.endPosition = b5cVar.position();
    }

    @Override // java.util.Iterator
    public pe3 next() {
        pe3 pe3Var = this.lookahead;
        if (pe3Var != null && pe3Var != EOF) {
            this.lookahead = null;
            return pe3Var;
        }
        b5c b5cVar = this.dataSource;
        if (b5cVar == null || this.parsePosition >= this.endPosition) {
            this.lookahead = EOF;
            lmr.m150601a();
            return null;
        }
        try {
            synchronized (b5cVar) {
                this.dataSource.position(this.parsePosition);
                throw null;
            }
        } catch (EOFException unused) {
            lmr.m150601a();
            return null;
        } catch (IOException unused2) {
            lmr.m150601a();
            return null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void setBoxes(List<pe3> list) {
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
        Iterator<pe3> it = getBoxes().iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
    }

    @Override // p149l.o06
    public List<pe3> getBoxes() {
        if (this.dataSource != null && this.lookahead != EOF) {
            return new n9r(this.boxes, this);
        }
        return this.boxes;
    }

    @Override // p149l.o06
    public <T extends pe3> List<T> getBoxes(Class<T> cls, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        List<pe3> boxes = getBoxes();
        for (int i = 0; i < boxes.size(); i++) {
            pe3 pe3Var = boxes.get(i);
            if (cls.isInstance(pe3Var)) {
                arrayList.add(pe3Var);
            }
            if (z && (pe3Var instanceof o06)) {
                arrayList.addAll(((o06) pe3Var).getBoxes(cls, z));
            }
        }
        return arrayList;
    }
}
