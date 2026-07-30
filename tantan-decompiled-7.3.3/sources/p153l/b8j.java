package p153l;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class b8j implements vxb {

    /* JADX INFO: renamed from: d */
    public static final boolean f75434d;

    /* JADX INFO: renamed from: a */
    public final UUID f75435a;

    /* JADX INFO: renamed from: b */
    public final byte[] f75436b;

    /* JADX INFO: renamed from: c */
    public final boolean f75437c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(bmk0.f77315c)) {
            String str = bmk0.f77316d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f75434d = z;
    }

    public b8j(UUID uuid, byte[] bArr, boolean z) {
        this.f75435a = uuid;
        this.f75436b = bArr;
        this.f75437c = z;
    }
}
