package p153l;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ea00 {

    /* JADX INFO: renamed from: l.ea00$a */
    public static class C16739a implements InterfaceC16741c {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f92721a;

        public C16739a(ByteBuffer byteBuffer) {
            this.f92721a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p153l.ea00.InterfaceC16741c
        /* JADX INFO: renamed from: a */
        public int mo119991a() throws IOException {
            return this.f92721a.getInt();
        }

        @Override // p153l.ea00.InterfaceC16741c
        /* JADX INFO: renamed from: b */
        public long mo119992b() throws IOException {
            return ea00.m119989c(this.f92721a.getInt());
        }

        @Override // p153l.ea00.InterfaceC16741c
        public long getPosition() {
            return this.f92721a.position();
        }

        @Override // p153l.ea00.InterfaceC16741c
        public int readUnsignedShort() throws IOException {
            return ea00.m119990d(this.f92721a.getShort());
        }

        @Override // p153l.ea00.InterfaceC16741c
        public void skip(int i) throws IOException {
            ByteBuffer byteBuffer = this.f92721a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* JADX INFO: renamed from: l.ea00$b */
    public static class C16740b {

        /* JADX INFO: renamed from: a */
        public final long f92722a;

        /* JADX INFO: renamed from: b */
        public final long f92723b;

        public C16740b(long j, long j2) {
            this.f92722a = j;
            this.f92723b = j2;
        }

        /* JADX INFO: renamed from: a */
        public long m119993a() {
            return this.f92722a;
        }
    }

    /* JADX INFO: renamed from: l.ea00$c */
    public interface InterfaceC16741c {
        /* JADX INFO: renamed from: a */
        int mo119991a() throws IOException;

        /* JADX INFO: renamed from: b */
        long mo119992b() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;

        void skip(int i) throws IOException;
    }

    /* JADX INFO: renamed from: a */
    public static C16740b m119987a(InterfaceC16741c interfaceC16741c) throws IOException {
        long jMo119992b;
        interfaceC16741c.skip(4);
        int unsignedShort = interfaceC16741c.readUnsignedShort();
        if (unsignedShort > 100) {
            zpg0.m220844a("Cannot read metadata.");
            return null;
        }
        interfaceC16741c.skip(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                jMo119992b = -1;
                break;
            }
            int iMo119991a = interfaceC16741c.mo119991a();
            interfaceC16741c.skip(4);
            jMo119992b = interfaceC16741c.mo119992b();
            interfaceC16741c.skip(4);
            if (1835365473 == iMo119991a) {
                break;
            }
            i++;
        }
        if (jMo119992b != -1) {
            interfaceC16741c.skip((int) (jMo119992b - interfaceC16741c.getPosition()));
            interfaceC16741c.skip(12);
            long jMo119992b2 = interfaceC16741c.mo119992b();
            for (int i2 = 0; i2 < jMo119992b2; i2++) {
                int iMo119991a2 = interfaceC16741c.mo119991a();
                long jMo119992b3 = interfaceC16741c.mo119992b();
                long jMo119992b4 = interfaceC16741c.mo119992b();
                if (1164798569 == iMo119991a2 || 1701669481 == iMo119991a2) {
                    return new C16740b(jMo119992b3 + jMo119992b, jMo119992b4);
                }
            }
        }
        zpg0.m220844a("Cannot read metadata.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static da00 m119988b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) m119987a(new C16739a(byteBufferDuplicate)).m119993a());
        return da00.m115105g(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: c */
    public static long m119989c(int i) {
        return ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: d */
    public static int m119990d(short s) {
        return s & 65535;
    }
}
