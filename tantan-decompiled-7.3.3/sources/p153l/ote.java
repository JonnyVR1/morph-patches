package p153l;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ote implements Closeable {

    /* JADX INFO: renamed from: a */
    private final int f148950a = 1179403647;

    /* JADX INFO: renamed from: b */
    private final FileChannel f148951b;

    public ote(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            wg3.m206174a("File is null or does not exist");
            throw null;
        }
        this.f148951b = new FileInputStream(file).getChannel();
    }

    /* JADX INFO: renamed from: b */
    private long m169083b(jte jteVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            kte kteVarMo146906b = jteVar.mo146906b(j3);
            if (kteVarMo146906b.f128677a == 1) {
                long j4 = kteVarMo146906b.f128679c;
                if (j4 <= j2 && j2 <= kteVarMo146906b.f128680d + j4) {
                    return (j2 - j4) + kteVarMo146906b.f128678b;
                }
            }
        }
        wtq0.m207906a("Could not map vma to file offset!");
        return 0L;
    }

    /* JADX INFO: renamed from: B */
    public long m169084B(ByteBuffer byteBuffer, long j) throws IOException {
        m169087n(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f148951b.close();
    }

    /* JADX INFO: renamed from: k */
    public jte m169085k() throws IOException {
        this.f148951b.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m169084B(byteBufferAllocate, 0L) != 1179403647) {
            wg3.m206174a("Invalid ELF Magic!");
            return null;
        }
        short sM169088q = m169088q(byteBufferAllocate, 4L);
        boolean z = m169088q(byteBufferAllocate, 5L) == 2;
        if (sM169088q == 1) {
            return new mte(z, this);
        }
        if (sM169088q == 2) {
            return new nte(z, this);
        }
        wtq0.m207906a("Invalid class type!");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public List<String> m169086m() throws IOException {
        long j;
        long j2;
        this.f148951b.position(0L);
        ArrayList arrayList = new ArrayList();
        jte jteVarM169085k = m169085k();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(jteVarM169085k.f122576a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = jteVarM169085k.f122581f;
        int i = 0;
        if (j3 == 65535) {
            j3 = jteVarM169085k.mo146907c(0).f133540a;
        }
        long j4 = 0;
        while (true) {
            j = 1;
            if (j4 >= j3) {
                j2 = 0;
                break;
            }
            kte kteVarMo146906b = jteVarM169085k.mo146906b(j4);
            if (kteVarMo146906b.f128677a == 2) {
                j2 = kteVarMo146906b.f128678b;
                break;
            }
            j4++;
        }
        if (j2 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j5 = 0;
        while (true) {
            ite iteVarMo146905a = jteVarM169085k.mo146905a(j2, i);
            long j6 = j;
            long j7 = iteVarMo146905a.f116825a;
            if (j7 == j6) {
                arrayList2.add(Long.valueOf(iteVarMo146905a.f116826b));
            } else if (j7 == 5) {
                j5 = iteVarMo146905a.f116826b;
            }
            i++;
            if (iteVarMo146905a.f116825a == 0) {
                break;
            }
            j = j6;
            j3 = j3;
        }
        if (j5 == 0) {
            wtq0.m207906a("String table offset not found!");
            return null;
        }
        long jM169083b = m169083b(jteVarM169085k, j3, j5);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(m169091v(byteBufferAllocate, ((Long) it.next()).longValue() + jM169083b));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m169087n(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int i2 = this.f148951b.read(byteBuffer, j + j2);
            if (i2 == -1) {
                vg3.m201207a();
                return;
            }
            j2 += (long) i2;
        }
        byteBuffer.position(0);
    }

    /* JADX INFO: renamed from: q */
    public short m169088q(ByteBuffer byteBuffer, long j) throws IOException {
        m169087n(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: renamed from: t */
    public int m169089t(ByteBuffer byteBuffer, long j) throws IOException {
        m169087n(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* JADX INFO: renamed from: u */
    public long m169090u(ByteBuffer byteBuffer, long j) throws IOException {
        m169087n(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* JADX INFO: renamed from: v */
    public String m169091v(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short sM169088q = m169088q(byteBuffer, j);
            if (sM169088q == 0) {
                return sb.toString();
            }
            sb.append((char) sM169088q);
            j = j2;
        }
    }
}
