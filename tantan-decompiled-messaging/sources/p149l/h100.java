package p149l;

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
public class h100 {

    /* JADX INFO: renamed from: l.h100$a */
    public static class C17215a implements InterfaceC17217c {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f105268a;

        public C17215a(ByteBuffer byteBuffer) {
            this.f105268a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p149l.h100.InterfaceC17217c
        /* JADX INFO: renamed from: a */
        public int mo128999a() throws IOException {
            return this.f105268a.getInt();
        }

        @Override // p149l.h100.InterfaceC17217c
        /* JADX INFO: renamed from: b */
        public long mo129000b() throws IOException {
            return h100.m128997c(this.f105268a.getInt());
        }

        @Override // p149l.h100.InterfaceC17217c
        public long getPosition() {
            return this.f105268a.position();
        }

        @Override // p149l.h100.InterfaceC17217c
        public int readUnsignedShort() throws IOException {
            return h100.m128998d(this.f105268a.getShort());
        }

        @Override // p149l.h100.InterfaceC17217c
        public void skip(int i) throws IOException {
            ByteBuffer byteBuffer = this.f105268a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* JADX INFO: renamed from: l.h100$b */
    public static class C17216b {

        /* JADX INFO: renamed from: a */
        public final long f105269a;

        /* JADX INFO: renamed from: b */
        public final long f105270b;

        public C17216b(long j, long j2) {
            this.f105269a = j;
            this.f105270b = j2;
        }

        /* JADX INFO: renamed from: a */
        public long m129001a() {
            return this.f105269a;
        }
    }

    /* JADX INFO: renamed from: l.h100$c */
    public interface InterfaceC17217c {
        /* JADX INFO: renamed from: a */
        int mo128999a() throws IOException;

        /* JADX INFO: renamed from: b */
        long mo129000b() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;

        void skip(int i) throws IOException;
    }

    /* JADX INFO: renamed from: a */
    public static C17216b m128995a(InterfaceC17217c interfaceC17217c) throws IOException {
        long jMo129000b;
        interfaceC17217c.skip(4);
        int unsignedShort = interfaceC17217c.readUnsignedShort();
        if (unsignedShort > 100) {
            rhg0.m179353a("Cannot read metadata.");
            return null;
        }
        interfaceC17217c.skip(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                jMo129000b = -1;
                break;
            }
            int iMo128999a = interfaceC17217c.mo128999a();
            interfaceC17217c.skip(4);
            jMo129000b = interfaceC17217c.mo129000b();
            interfaceC17217c.skip(4);
            if (1835365473 == iMo128999a) {
                break;
            }
            i++;
        }
        if (jMo129000b != -1) {
            interfaceC17217c.skip((int) (jMo129000b - interfaceC17217c.getPosition()));
            interfaceC17217c.skip(12);
            long jMo129000b2 = interfaceC17217c.mo129000b();
            for (int i2 = 0; i2 < jMo129000b2; i2++) {
                int iMo128999a2 = interfaceC17217c.mo128999a();
                long jMo129000b3 = interfaceC17217c.mo129000b();
                long jMo129000b4 = interfaceC17217c.mo129000b();
                if (1164798569 == iMo128999a2 || 1701669481 == iMo128999a2) {
                    return new C17216b(jMo129000b3 + jMo129000b, jMo129000b4);
                }
            }
        }
        rhg0.m179353a("Cannot read metadata.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static g100 m128996b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) m128995a(new C17215a(byteBufferDuplicate)).m129001a());
        return g100.m124042g(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: c */
    public static long m128997c(int i) {
        return ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: d */
    public static int m128998d(short s) {
        return s & 65535;
    }
}
