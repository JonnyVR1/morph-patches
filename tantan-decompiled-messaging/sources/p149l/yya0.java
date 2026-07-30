package p149l;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public abstract class yya0 {

    /* JADX INFO: renamed from: a */
    protected static Map<UUID, Class<? extends yya0>> f200719a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static yya0 m216513a(UUID uuid, ByteBuffer byteBuffer) throws IllegalAccessException, InstantiationException {
        Class<? extends yya0> cls = f200719a.get(uuid);
        yya0 yya0VarNewInstance = null;
        if (cls != null) {
            try {
                yya0VarNewInstance = cls.newInstance();
            } catch (IllegalAccessException e) {
                aag0.m95543a(e);
                return null;
            } catch (InstantiationException e2) {
                aag0.m95543a(e2);
                return null;
            }
        }
        if (yya0VarNewInstance == null) {
            yya0VarNewInstance = new ijj();
        }
        yya0VarNewInstance.mo136612c(byteBuffer);
        return yya0VarNewInstance;
    }

    /* JADX INFO: renamed from: b */
    public abstract ByteBuffer mo136611b();

    /* JADX INFO: renamed from: c */
    public abstract void mo136612c(ByteBuffer byteBuffer);

    public boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProtectionSpecificHeader{data=");
        ByteBuffer byteBufferDuplicate = mo136611b().duplicate();
        byteBufferDuplicate.rewind();
        byte[] bArr = new byte[byteBufferDuplicate.limit()];
        byteBufferDuplicate.get(bArr);
        sb.append(qzk.m177232a(bArr));
        sb.append('}');
        return sb.toString();
    }
}
