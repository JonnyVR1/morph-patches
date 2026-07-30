package p153l;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c7b0 {

    /* JADX INFO: renamed from: a */
    protected static Map<UUID, Class<? extends c7b0>> f80101a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static c7b0 m108293a(UUID uuid, ByteBuffer byteBuffer) throws IllegalAccessException, InstantiationException {
        Class<? extends c7b0> cls = f80101a.get(uuid);
        c7b0 c7b0VarNewInstance = null;
        if (cls != null) {
            try {
                c7b0VarNewInstance = cls.newInstance();
            } catch (IllegalAccessException e) {
                iig0.m140070a(e);
                return null;
            } catch (InstantiationException e2) {
                iig0.m140070a(e2);
                return null;
            }
        }
        if (c7b0VarNewInstance == null) {
            c7b0VarNewInstance = new bmj();
        }
        c7b0VarNewInstance.mo105064c(byteBuffer);
        return c7b0VarNewInstance;
    }

    /* JADX INFO: renamed from: b */
    public abstract ByteBuffer mo105063b();

    /* JADX INFO: renamed from: c */
    public abstract void mo105064c(ByteBuffer byteBuffer);

    public boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProtectionSpecificHeader{data=");
        ByteBuffer byteBufferDuplicate = mo105063b().duplicate();
        byteBufferDuplicate.rewind();
        byte[] bArr = new byte[byteBufferDuplicate.limit()];
        byteBufferDuplicate.get(bArr);
        sb.append(g2l.m128633a(bArr));
        sb.append('}');
        return sb.toString();
    }
}
