package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p153l.b1q;
import p153l.ef3;
import p153l.ff3;
import p153l.g2l;
import p153l.h6c;
import p153l.rn4;
import p153l.szv;
import p153l.t16;
import p153l.w0q;
import p153l.xi60;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractBox implements ef3 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static szv LOG = szv.m188683a(AbstractBox.class);
    private ByteBuffer content;
    long contentStartPosition;
    h6c dataSource;
    long offset;
    private t16 parent;
    protected String type;
    private byte[] userType;
    long memMapSize = -1;
    private ByteBuffer deadBytes = null;
    boolean isRead = true;
    boolean isParsed = true;

    public AbstractBox(String str, byte[] bArr) {
        this.type = str;
        this.userType = bArr;
    }

    private void getHeader(ByteBuffer byteBuffer) {
        if (isSmallBox()) {
            b1q.m101495g(byteBuffer, getSize());
            byteBuffer.put(w0q.m204214d(getType()));
        } else {
            b1q.m101495g(byteBuffer, 1L);
            byteBuffer.put(w0q.m204214d(getType()));
            b1q.m101497i(byteBuffer, getSize());
        }
        if ("uuid".equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }

    private boolean isSmallBox() {
        int i = "uuid".equals(getType()) ? 24 : 8;
        if (!this.isRead) {
            return this.memMapSize + ((long) i) < 4294967296L;
        }
        if (!this.isParsed) {
            return ((long) (this.content.limit() + i)) < 4294967296L;
        }
        long contentSize = getContentSize();
        ByteBuffer byteBuffer = this.deadBytes;
        return (contentSize + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
    }

    private synchronized void readContent() {
        try {
            if (!this.isRead) {
                try {
                    LOG.mo99049b("mem mapping " + getType());
                    this.content = this.dataSource.mo7441K(this.contentStartPosition, this.memMapSize);
                    this.isRead = true;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean verify(ByteBuffer byteBuffer) {
        long contentSize = getContentSize();
        ByteBuffer byteBuffer2 = this.deadBytes;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(rn4.m182119a(contentSize + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0))));
        getContent(byteBufferAllocate);
        ByteBuffer byteBuffer3 = this.deadBytes;
        if (byteBuffer3 != null) {
            byteBuffer3.rewind();
            while (this.deadBytes.remaining() > 0) {
                byteBufferAllocate.put(this.deadBytes);
            }
        }
        byteBuffer.rewind();
        byteBufferAllocate.rewind();
        if (byteBuffer.remaining() != byteBufferAllocate.remaining()) {
            System.err.print(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + byteBufferAllocate.remaining());
            LOG.mo99050c(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + byteBufferAllocate.remaining());
            return false;
        }
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 1;
        int iLimit2 = byteBufferAllocate.limit() - 1;
        while (iLimit >= iPosition) {
            byte b = byteBuffer.get(iLimit);
            byte b2 = byteBufferAllocate.get(iLimit2);
            if (b != b2) {
                LOG.mo99050c(String.format("%s: buffers differ at %d: %2X/%2X", getType(), Integer.valueOf(iLimit), Byte.valueOf(b), Byte.valueOf(b2)));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[byteBufferAllocate.remaining()];
                byteBuffer.get(bArr);
                byteBufferAllocate.get(bArr2);
                System.err.println("original      : " + g2l.m128634b(bArr, 4));
                System.err.println("reconstructed : " + g2l.m128634b(bArr2, 4));
                return false;
            }
            iLimit--;
            iLimit2--;
        }
        return true;
    }

    public abstract void _parseDetails(ByteBuffer byteBuffer);

    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        if (!this.isRead) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((isSmallBox() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
            getHeader(byteBufferAllocate);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
            this.dataSource.mo7442L(this.contentStartPosition, this.memMapSize, writableByteChannel);
            return;
        }
        if (!this.isParsed) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((isSmallBox() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
            getHeader(byteBufferAllocate2);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate2.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
            return;
        }
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(rn4.m182119a(getSize()));
        getHeader(byteBufferAllocate3);
        getContent(byteBufferAllocate3);
        ByteBuffer byteBuffer = this.deadBytes;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            while (this.deadBytes.remaining() > 0) {
                byteBufferAllocate3.put(this.deadBytes);
            }
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate3.rewind());
    }

    public abstract void getContent(ByteBuffer byteBuffer);

    public abstract long getContentSize();

    public long getOffset() {
        return this.offset;
    }

    @Override // p153l.ef3
    public t16 getParent() {
        return this.parent;
    }

    public String getPath() {
        return xi60.m211122a(this);
    }

    @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long jLimit;
        if (!this.isRead) {
            jLimit = this.memMapSize;
        } else if (this.isParsed) {
            jLimit = getContentSize();
        } else {
            ByteBuffer byteBuffer = this.content;
            jLimit = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        long j = jLimit + ((long) ((jLimit >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(getType()) ? 16 : 0)));
        ByteBuffer byteBuffer2 = this.deadBytes;
        return j + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0));
    }

    @Override // p153l.ef3
    public String getType() {
        return this.type;
    }

    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        long jPosition = h6cVar.position();
        this.contentStartPosition = jPosition;
        this.offset = jPosition - ((long) byteBuffer.remaining());
        this.memMapSize = j;
        this.dataSource = h6cVar;
        h6cVar.position(h6cVar.position() + j);
        this.isRead = false;
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        try {
            readContent();
            LOG.mo99049b("parsing details of " + getType());
            ByteBuffer byteBuffer = this.content;
            if (byteBuffer != null) {
                this.isParsed = true;
                byteBuffer.rewind();
                _parseDetails(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.deadBytes = byteBuffer.slice();
                }
                this.content = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setDeadBytes(ByteBuffer byteBuffer) {
        this.deadBytes = byteBuffer;
    }

    @Override // p153l.ef3
    public void setParent(t16 t16Var) {
        this.parent = t16Var;
    }

    public AbstractBox(String str) {
        this.type = str;
    }
}
