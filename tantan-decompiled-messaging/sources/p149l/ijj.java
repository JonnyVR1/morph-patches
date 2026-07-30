package p149l;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class ijj extends yya0 {

    /* JADX INFO: renamed from: c */
    public static UUID f113549c;

    /* JADX INFO: renamed from: b */
    ByteBuffer f113550b;

    static {
        UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
        f113549c = uuidFromString;
        yya0.f200719a.put(uuidFromString, ijj.class);
    }

    @Override // p149l.yya0
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo136611b() {
        return this.f113550b;
    }

    @Override // p149l.yya0
    /* JADX INFO: renamed from: c */
    public void mo136612c(ByteBuffer byteBuffer) {
        this.f113550b = byteBuffer;
    }
}
