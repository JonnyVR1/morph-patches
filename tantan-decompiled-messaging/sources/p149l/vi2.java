package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
@eud(tags = {0})
public abstract class vi2 {

    /* JADX INFO: renamed from: a */
    int f181547a;

    /* JADX INFO: renamed from: b */
    int f181548b;

    /* JADX INFO: renamed from: c */
    int f181549c;

    /* JADX INFO: renamed from: a */
    public int m198491a() {
        return this.f181548b + 1 + this.f181549c;
    }

    /* JADX INFO: renamed from: b */
    public int m198492b() {
        return this.f181549c;
    }

    /* JADX INFO: renamed from: c */
    public int m198493c() {
        return this.f181548b;
    }

    /* JADX INFO: renamed from: d */
    public final void m198494d(int i, ByteBuffer byteBuffer) throws IOException {
        this.f181547a = i;
        int iM216561n = yyp.m216561n(byteBuffer);
        this.f181548b = iM216561n & 127;
        int i2 = 1;
        while ((iM216561n >>> 7) == 1) {
            iM216561n = yyp.m216561n(byteBuffer);
            i2++;
            this.f181548b = (this.f181548b << 7) | (iM216561n & 127);
        }
        this.f181549c = i2;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.f181548b);
        mo106861e(byteBufferSlice);
        byteBuffer.position(byteBuffer.position() + this.f181548b);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo106861e(ByteBuffer byteBuffer) throws IOException;

    public String toString() {
        return "BaseDescriptor{tag=" + this.f181547a + ", sizeOfInstance=" + this.f181548b + '}';
    }
}
