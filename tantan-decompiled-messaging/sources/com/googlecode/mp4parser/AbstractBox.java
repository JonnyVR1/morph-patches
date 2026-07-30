package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p149l.b5c;
import p149l.bzp;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;
import p149l.qzk;
import p149l.sa60;
import p149l.sm4;
import p149l.vxv;
import p149l.wyp;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractBox implements pe3 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static vxv LOG = vxv.m200598a(AbstractBox.class);
    private ByteBuffer content;
    long contentStartPosition;
    b5c dataSource;
    long offset;
    private o06 parent;
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
            bzp.m104635g(byteBuffer, getSize());
            byteBuffer.put(wyp.m206118d(getType()));
        } else {
            bzp.m104635g(byteBuffer, 1L);
            byteBuffer.put(wyp.m206118d(getType()));
            bzp.m104637i(byteBuffer, getSize());
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
                    LOG.mo108288b("mem mapping " + getType());
                    this.content = this.dataSource.mo7387K(this.contentStartPosition, this.memMapSize);
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
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sm4.m184929a(contentSize + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0))));
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
            LOG.mo108289c(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + byteBufferAllocate.remaining());
            return false;
        }
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 1;
        int iLimit2 = byteBufferAllocate.limit() - 1;
        while (iLimit >= iPosition) {
            byte b = byteBuffer.get(iLimit);
            byte b2 = byteBufferAllocate.get(iLimit2);
            if (b != b2) {
                LOG.mo108289c(String.format("%s: buffers differ at %d: %2X/%2X", getType(), Integer.valueOf(iLimit), Byte.valueOf(b), Byte.valueOf(b2)));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[byteBufferAllocate.remaining()];
                byteBuffer.get(bArr);
                byteBufferAllocate.get(bArr2);
                System.err.println("original      : " + qzk.m177233b(bArr, 4));
                System.err.println("reconstructed : " + qzk.m177233b(bArr2, 4));
                return false;
            }
            iLimit--;
            iLimit2--;
        }
        return true;
    }

    public abstract void _parseDetails(ByteBuffer byteBuffer);

    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        if (!this.isRead) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((isSmallBox() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
            getHeader(byteBufferAllocate);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
            this.dataSource.mo7388L(this.contentStartPosition, this.memMapSize, writableByteChannel);
            return;
        }
        if (!this.isParsed) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((isSmallBox() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
            getHeader(byteBufferAllocate2);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate2.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
            return;
        }
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(sm4.m184929a(getSize()));
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

    @Override // p149l.pe3
    public o06 getParent() {
        return this.parent;
    }

    public String getPath() {
        return sa60.m182849a(this);
    }

    @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
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

    @Override // p149l.pe3
    public String getType() {
        return this.type;
    }

    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        long jPosition = b5cVar.position();
        this.contentStartPosition = jPosition;
        this.offset = jPosition - ((long) byteBuffer.remaining());
        this.memMapSize = j;
        this.dataSource = b5cVar;
        b5cVar.position(b5cVar.position() + j);
        this.isRead = false;
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        try {
            readContent();
            LOG.mo108288b("parsing details of " + getType());
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

    @Override // p149l.pe3
    public void setParent(o06 o06Var) {
        this.parent = o06Var;
    }

    public AbstractBox(String str) {
        this.type = str;
    }
}
