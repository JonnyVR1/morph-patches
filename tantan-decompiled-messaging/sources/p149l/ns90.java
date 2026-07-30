package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
@eud(tags = {20})
public class ns90 extends vi2 {

    /* JADX INFO: renamed from: d */
    int f140253d;

    @Override // p149l.vi2
    /* JADX INFO: renamed from: e */
    public void mo106861e(ByteBuffer byteBuffer) throws IOException {
        this.f140253d = yyp.m216561n(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f140253d == ((ns90) obj).f140253d;
    }

    public int hashCode() {
        return this.f140253d;
    }

    @Override // p149l.vi2
    public String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.f140253d) + '}';
    }
}
