package p149l;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class g5j implements hwb {

    /* JADX INFO: renamed from: d */
    public static final boolean f101162d;

    /* JADX INFO: renamed from: a */
    public final UUID f101163a;

    /* JADX INFO: renamed from: b */
    public final byte[] f101164b;

    /* JADX INFO: renamed from: c */
    public final boolean f101165c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(vck0.f180950c)) {
            String str = vck0.f180951d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f101162d = z;
    }

    public g5j(UUID uuid, byte[] bArr, boolean z) {
        this.f101163a = uuid;
        this.f101164b = bArr;
        this.f101165c = z;
    }
}
