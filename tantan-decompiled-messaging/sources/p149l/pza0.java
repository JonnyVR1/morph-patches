package p149l;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class pza0 {

    /* JADX INFO: renamed from: l.pza0$a */
    public static class C19378a {

        /* JADX INFO: renamed from: a */
        public final UUID f151932a;

        /* JADX INFO: renamed from: b */
        public final int f151933b;

        /* JADX INFO: renamed from: c */
        public final byte[] f151934c;

        public C19378a(UUID uuid, int i, byte[] bArr) {
            this.f151932a = uuid;
            this.f151933b = i;
            this.f151934c = bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m172215a(UUID uuid, @Nullable byte[] bArr) {
        return m172216b(uuid, null, bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m172216b(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m172217c(byte[] bArr) {
        return m172218d(bArr) != null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static C19378a m172218d(byte[] bArr) {
        d860 d860Var = new d860(bArr);
        if (d860Var.m110301g() < 32) {
            return null;
        }
        d860Var.m110292U(0);
        if (d860Var.m110311q() != d860Var.m110295a() + 4 || d860Var.m110311q() != 1886614376) {
            return null;
        }
        int iM212343c = y21.m212343c(d860Var.m110311q());
        if (iM212343c > 1) {
            jwv.m143689i("PsshAtomUtil", "Unsupported pssh version: " + iM212343c);
            return null;
        }
        UUID uuid = new UUID(d860Var.m110272A(), d860Var.m110272A());
        if (iM212343c == 1) {
            d860Var.m110293V(d860Var.m110283L() * 16);
        }
        int iM110283L = d860Var.m110283L();
        if (iM110283L != d860Var.m110295a()) {
            return null;
        }
        byte[] bArr2 = new byte[iM110283L];
        d860Var.m110306l(bArr2, 0, iM110283L);
        return new C19378a(uuid, iM212343c, bArr2);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static byte[] m172219e(byte[] bArr, UUID uuid) {
        C19378a c19378aM172218d = m172218d(bArr);
        if (c19378aM172218d == null) {
            return null;
        }
        if (uuid.equals(c19378aM172218d.f151932a)) {
            return c19378aM172218d.f151934c;
        }
        jwv.m143689i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + c19378aM172218d.f151932a + ".");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static UUID m172220f(byte[] bArr) {
        C19378a c19378aM172218d = m172218d(bArr);
        if (c19378aM172218d == null) {
            return null;
        }
        return c19378aM172218d.f151932a;
    }

    /* JADX INFO: renamed from: g */
    public static int m172221g(byte[] bArr) {
        C19378a c19378aM172218d = m172218d(bArr);
        if (c19378aM172218d == null) {
            return -1;
        }
        return c19378aM172218d.f151933b;
    }
}
