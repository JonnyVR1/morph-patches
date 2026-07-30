package p149l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class tya0 {

    /* JADX INFO: renamed from: c */
    private static final File f172567c;

    /* JADX INFO: renamed from: d */
    private static final boolean f172568d;

    /* JADX INFO: renamed from: a */
    private ByteBuffer f172569a;

    /* JADX INFO: renamed from: b */
    private int f172570b;

    /* JADX INFO: renamed from: l.tya0$a */
    public interface InterfaceC20310a {
        /* JADX INFO: renamed from: a */
        void mo186639a(ByteBuffer byteBuffer, int i);
    }

    static {
        File file = new File(sgw.m184137a(new byte[]{31, 2, 84, 65, 78, 57, 111, 22, 67, 88, 17, 3, 66, 18, 88, 82, 18, 57, 111}));
        f172567c = file;
        f172568d = file.isFile();
    }

    public tya0(String str) throws IOException {
        File file;
        if (f172568d) {
            file = f172567c;
        } else {
            File file2 = new File(f172567c, sgw.m184137a(new byte[]{69, 92, 94, 85, 11, 3, 83, 18, 110, 69, 91}) + str + sgw.m184137a(new byte[]{10, 21, 1}));
            if (!file2.isFile()) {
                throw new FileNotFoundException(sgw.m184137a(new byte[]{126, 9, 69, 23, 0, 70, 86, 15, 93, 82, 91, 70}) + file2);
            }
            file = file2;
        }
        long length = file.length();
        if (length <= 0 || length >= 2147483647L) {
            throw new IllegalArgumentException(sgw.m184137a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84, 70, 87, 94, HttpTokens.CARRIAGE_RETURN, 3, Tnaf.POW_2_WIDTH, 21, 88, 77, 4, 70}) + length);
        }
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            this.f172569a = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).order(ByteOrder.nativeOrder());
            channel.close();
            this.f172570b = this.f172569a.getInt();
            this.f172569a.getInt();
            int i = this.f172569a.getInt();
            if (i != 1347375696) {
                throw new IllegalArgumentException(sgw.m184137a(new byte[]{114, 7, 85, 23, 7, 15, 92, 3, 17, 90, 0, 1, 89, 5, 11, 23}) + i);
            }
            int i2 = this.f172569a.getInt();
            if (i2 == -59846485) {
                ByteBuffer byteBuffer = this.f172569a;
                byteBuffer.position(byteBuffer.position() + 28);
            } else {
                throw new IllegalArgumentException(sgw.m184137a(new byte[]{114, 7, 85, 23, 0, 20, 85, 7, 17, 65, 4, 20, 67, 15, 95, HttpTokens.CARRIAGE_RETURN, 65}) + i2);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (channel == null) {
                    throw th2;
                }
                try {
                    channel.close();
                    throw th2;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m191006a(List list, ByteBuffer byteBuffer, int i) {
        if (i >= 96 && (byteBuffer.getInt(i - 96) & 65536) == 0) {
            list.add(m191009e(byteBuffer, i - 92, 92));
        }
    }

    /* JADX INFO: renamed from: b */
    public static tya0 m191007b(String... strArr) {
        for (String str : strArr) {
            try {
                return new tya0(str);
            } catch (FileNotFoundException unused) {
            } catch (IOException e) {
                throw new RuntimeException(sgw.m184137a(new byte[]{95, 22, 84, 89, 65}) + str, e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static void m191008c(ByteBuffer byteBuffer, byte[] bArr, InterfaceC20310a interfaceC20310a) {
        for (int i = 0; i < byteBuffer.capacity(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= bArr.length) {
                    interfaceC20310a.mo186639a(byteBuffer, i);
                    break;
                } else if (byteBuffer.get(i + i2) != bArr[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m191009e(ByteBuffer byteBuffer, int i, int i2) {
        StringBuilder sb = new StringBuilder(16);
        int i3 = 0;
        while (true) {
            try {
                byte b = byteBuffer.get(i3 + i);
                if (b == 0) {
                    return sb.toString();
                }
                if (i3 > i2) {
                    return sgw.m184137a(new byte[]{12, 15, 95, 83, 4, 30, Tnaf.POW_2_WIDTH, 20, 84, 86, 2, 14, 85, 2, 17, 91, 8, 11, 89, 18, 17, 85, 20, 18, Tnaf.POW_2_WIDTH, 8, 94, 23, 15, 19, 92, 10, 17, 67, 4, 20, 93, 15, 95, 86, 21, 9, 66, 70, 87, 88, 20, 8, 84, 88});
                }
                sb.append((char) b);
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                return sgw.m184137a(new byte[]{12, 15, 95, 83, 4, 30, Tnaf.POW_2_WIDTH, 9, 68, 67, 65, 9, 86, 70, 83, 88, 20, 8, 84, 21, 15});
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public List<String> m191010d(String str) {
        final ArrayList arrayList = new ArrayList(2);
        m191008c(this.f172569a.slice(), str.getBytes(StandardCharsets.UTF_8), new InterfaceC20310a() { // from class: l.sya0
            @Override // p149l.tya0.InterfaceC20310a
            /* JADX INFO: renamed from: a */
            public final void mo186639a(ByteBuffer byteBuffer, int i) {
                tya0.m191006a(arrayList, byteBuffer, i);
            }
        });
        return arrayList;
    }
}
