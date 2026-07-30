package p149l;

import Sudthrow.Sudfor;
import Sudthrow.Sudint;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes.dex */
public final class pig0 extends klg0 {

    /* JADX INFO: renamed from: h */
    public int f149556h;

    /* JADX INFO: renamed from: i */
    public String f149557i;

    public pig0() {
        super(6);
        this.f149557i = "";
        CodingErrorAction codingErrorAction = jjg0.f118294a;
        try {
            byte[] bytes = "".getBytes(StringUtil.__UTF8Alt);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.putInt(this.f149556h);
            byteBufferAllocate.position(2);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bytes.length + 2);
            byteBufferAllocate2.put(byteBufferAllocate);
            byteBufferAllocate2.put(bytes);
            byteBufferAllocate2.rewind();
            this.f106582c = byteBufferAllocate2;
            this.f149556h = 1000;
            try {
                byte[] bytes2 = this.f149557i.getBytes(StringUtil.__UTF8Alt);
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                byteBufferAllocate3.putInt(this.f149556h);
                byteBufferAllocate3.position(2);
                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(bytes2.length + 2);
                byteBufferAllocate4.put(byteBufferAllocate3);
                byteBufferAllocate4.put(bytes2);
                byteBufferAllocate4.rewind();
                this.f106582c = byteBufferAllocate4;
            } catch (UnsupportedEncodingException e) {
                aag0.m95543a(e);
                throw null;
            }
        } catch (UnsupportedEncodingException e2) {
            aag0.m95543a(e2);
            throw null;
        }
    }

    @Override // p149l.klg0, p149l.h9g0
    /* JADX INFO: renamed from: a */
    public final void mo127138a() throws Sudfor {
        super.mo127138a();
        int i = this.f149556h;
        if (i == 1007 && this.f149557i == null) {
            throw new Sudfor(1007, "Received text is no valid utf8 string!");
        }
        if (i == 1005 && this.f149557i.length() > 0) {
            throw new Sudfor(1002, "A close frame must have a closecode if it has a reason");
        }
        int i2 = this.f149556h;
        if (i2 > 1015 && i2 < 3000) {
            throw new Sudfor(1002, "Trying to send an illegal close code!");
        }
        if (i2 == 1006 || i2 == 1015 || i2 == 1005 || i2 > 4999 || i2 < 1000 || i2 == 1004) {
            throw new Sudint("closecode must not be sent over the wire: " + this.f149556h);
        }
    }

    @Override // p149l.h9g0
    /* JADX INFO: renamed from: b */
    public final void mo130004b(ByteBuffer byteBuffer) {
        this.f149556h = 1005;
        this.f149557i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f149556h = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.f149556h = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.f149556h = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            int iPosition = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.f149557i = jjg0.m141802a(byteBuffer);
                    byteBuffer.position(iPosition);
                } catch (IllegalArgumentException unused) {
                    throw new Sudfor(1007);
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                throw th;
            }
        } catch (Sudfor unused2) {
            this.f149556h = 1007;
            this.f149557i = null;
        }
    }

    @Override // p149l.h9g0, p149l.m6g0
    /* JADX INFO: renamed from: d */
    public final ByteBuffer mo130005d() {
        return this.f149556h == 1005 ? ByteBuffer.allocate(0) : this.f106582c;
    }

    @Override // p149l.h9g0
    public final String toString() {
        return super.toString() + "code: " + this.f149556h;
    }
}
