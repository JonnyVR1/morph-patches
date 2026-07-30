package p153l;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class bmj extends c7b0 {

    /* JADX INFO: renamed from: c */
    public static UUID f77309c;

    /* JADX INFO: renamed from: b */
    ByteBuffer f77310b;

    static {
        UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
        f77309c = uuidFromString;
        c7b0.f80101a.put(uuidFromString, bmj.class);
    }

    @Override // p153l.c7b0
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo105063b() {
        return this.f77310b;
    }

    @Override // p153l.c7b0
    /* JADX INFO: renamed from: c */
    public void mo105064c(ByteBuffer byteBuffer) {
        this.f77310b = byteBuffer;
    }
}
