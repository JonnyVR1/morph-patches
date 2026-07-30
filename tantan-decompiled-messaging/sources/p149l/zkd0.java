package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
@eud(tags = {6})
public class zkd0 extends vi2 {

    /* JADX INFO: renamed from: d */
    int f203529d;

    @Override // p149l.vi2
    /* JADX INFO: renamed from: e */
    public void mo106861e(ByteBuffer byteBuffer) throws IOException {
        this.f203529d = yyp.m216561n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f203529d == ((zkd0) obj).f203529d;
    }

    public int hashCode() {
        return this.f203529d;
    }

    @Override // p149l.vi2
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.f203529d + '}';
    }
}
