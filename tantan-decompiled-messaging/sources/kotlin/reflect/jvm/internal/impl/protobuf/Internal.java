package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p149l.lck0;
import p149l.pkq0;

/* JADX INFO: loaded from: classes2.dex */
public class Internal {

    /* JADX INFO: renamed from: a */
    public static final byte[] f65669a;

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer f65670b;

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f65669a = bArr;
        f65670b = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m91347a(byte[] bArr) {
        return lck0.m149325e(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m91348b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            pkq0.m170054a("UTF-8 not supported?", e);
            return null;
        }
    }
}
