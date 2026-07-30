package p153l;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class t7b0 {

    /* JADX INFO: renamed from: l.t7b0$a */
    public static class C20251a {

        /* JADX INFO: renamed from: a */
        public final UUID f172412a;

        /* JADX INFO: renamed from: b */
        public final int f172413b;

        /* JADX INFO: renamed from: c */
        public final byte[] f172414c;

        public C20251a(UUID uuid, int i, byte[] bArr) {
            this.f172412a = uuid;
            this.f172413b = i;
            this.f172414c = bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m189554a(UUID uuid, @Nullable byte[] bArr) {
        return m189555b(uuid, null, bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m189555b(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
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
    public static boolean m189556c(byte[] bArr) {
        return m189557d(bArr) != null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static C20251a m189557d(byte[] bArr) {
        ig60 ig60Var = new ig60(bArr);
        if (ig60Var.m139817g() < 32) {
            return null;
        }
        ig60Var.m139808U(0);
        if (ig60Var.m139827q() != ig60Var.m139811a() + 4 || ig60Var.m139827q() != 1886614376) {
            return null;
        }
        int iM123699c = f31.m123699c(ig60Var.m139827q());
        if (iM123699c > 1) {
            kyv.m152151i("PsshAtomUtil", "Unsupported pssh version: " + iM123699c);
            return null;
        }
        UUID uuid = new UUID(ig60Var.m139788A(), ig60Var.m139788A());
        if (iM123699c == 1) {
            ig60Var.m139809V(ig60Var.m139799L() * 16);
        }
        int iM139799L = ig60Var.m139799L();
        if (iM139799L != ig60Var.m139811a()) {
            return null;
        }
        byte[] bArr2 = new byte[iM139799L];
        ig60Var.m139822l(bArr2, 0, iM139799L);
        return new C20251a(uuid, iM123699c, bArr2);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static byte[] m189558e(byte[] bArr, UUID uuid) {
        C20251a c20251aM189557d = m189557d(bArr);
        if (c20251aM189557d == null) {
            return null;
        }
        if (uuid.equals(c20251aM189557d.f172412a)) {
            return c20251aM189557d.f172414c;
        }
        kyv.m152151i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + c20251aM189557d.f172412a + ".");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static UUID m189559f(byte[] bArr) {
        C20251a c20251aM189557d = m189557d(bArr);
        if (c20251aM189557d == null) {
            return null;
        }
        return c20251aM189557d.f172412a;
    }

    /* JADX INFO: renamed from: g */
    public static int m189560g(byte[] bArr) {
        C20251a c20251aM189557d = m189557d(bArr);
        if (c20251aM189557d == null) {
            return -1;
        }
        return c20251aM189557d.f172413b;
    }
}
