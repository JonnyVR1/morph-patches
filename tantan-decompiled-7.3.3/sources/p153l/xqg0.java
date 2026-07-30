package p153l;

import Sudthrow.Sudfor;
import Sudthrow.Sudint;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes.dex */
public final class xqg0 extends stg0 {

    /* JADX INFO: renamed from: h */
    public int f195803h;

    /* JADX INFO: renamed from: i */
    public String f195804i;

    public xqg0() {
        super(6);
        this.f195804i = "";
        CodingErrorAction codingErrorAction = rrg0.f164578a;
        try {
            byte[] bytes = "".getBytes(StringUtil.__UTF8Alt);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.putInt(this.f195803h);
            byteBufferAllocate.position(2);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bytes.length + 2);
            byteBufferAllocate2.put(byteBufferAllocate);
            byteBufferAllocate2.put(bytes);
            byteBufferAllocate2.rewind();
            this.f152434c = byteBufferAllocate2;
            this.f195803h = 1000;
            try {
                byte[] bytes2 = this.f195804i.getBytes(StringUtil.__UTF8Alt);
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                byteBufferAllocate3.putInt(this.f195803h);
                byteBufferAllocate3.position(2);
                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(bytes2.length + 2);
                byteBufferAllocate4.put(byteBufferAllocate3);
                byteBufferAllocate4.put(bytes2);
                byteBufferAllocate4.rewind();
                this.f152434c = byteBufferAllocate4;
            } catch (UnsupportedEncodingException e) {
                iig0.m140070a(e);
                throw null;
            }
        } catch (UnsupportedEncodingException e2) {
            iig0.m140070a(e2);
            throw null;
        }
    }

    @Override // p153l.stg0, p153l.phg0
    /* JADX INFO: renamed from: a */
    public final void mo122951a() throws Sudfor {
        super.mo122951a();
        int i = this.f195803h;
        if (i == 1007 && this.f195804i == null) {
            throw new Sudfor(1007, "Received text is no valid utf8 string!");
        }
        if (i == 1005 && this.f195804i.length() > 0) {
            throw new Sudfor(1002, "A close frame must have a closecode if it has a reason");
        }
        int i2 = this.f195803h;
        if (i2 > 1015 && i2 < 3000) {
            throw new Sudfor(1002, "Trying to send an illegal close code!");
        }
        if (i2 == 1006 || i2 == 1015 || i2 == 1005 || i2 > 4999 || i2 < 1000 || i2 == 1004) {
            throw new Sudint("closecode must not be sent over the wire: " + this.f195803h);
        }
    }

    @Override // p153l.phg0
    /* JADX INFO: renamed from: b */
    public final void mo172323b(ByteBuffer byteBuffer) {
        this.f195803h = 1005;
        this.f195804i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f195803h = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.f195803h = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.f195803h = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            int iPosition = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.f195804i = rrg0.m182785a(byteBuffer);
                    byteBuffer.position(iPosition);
                } catch (IllegalArgumentException unused) {
                    throw new Sudfor(1007);
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                throw th;
            }
        } catch (Sudfor unused2) {
            this.f195803h = 1007;
            this.f195804i = null;
        }
    }

    @Override // p153l.phg0, p153l.ueg0
    /* JADX INFO: renamed from: d */
    public final ByteBuffer mo172324d() {
        return this.f195803h == 1005 ? ByteBuffer.allocate(0) : this.f152434c;
    }

    @Override // p153l.phg0
    public final String toString() {
        return super.toString() + "code: " + this.f195803h;
    }
}
