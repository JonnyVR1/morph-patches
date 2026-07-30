package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p153l.rlk0;
import p153l.vtq0;

/* JADX INFO: loaded from: classes2.dex */
public class Internal {

    /* JADX INFO: renamed from: a */
    public static final byte[] f66343a;

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer f66344b;

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f66343a = bArr;
        f66344b = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m92238a(byte[] bArr) {
        return rlk0.m182000e(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m92239b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            vtq0.m202761a("UTF-8 not supported?", e);
            return null;
        }
    }
}
