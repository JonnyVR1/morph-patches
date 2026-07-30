package p149l;

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
public class kse implements Closeable {

    /* JADX INFO: renamed from: a */
    private final int f124443a = 1179403647;

    /* JADX INFO: renamed from: b */
    private final FileChannel f124444b;

    public kse(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            ig3.m135964a("File is null or does not exist");
            throw null;
        }
        this.f124444b = new FileInputStream(file).getChannel();
    }

    /* JADX INFO: renamed from: b */
    private long m147055b(fse fseVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            gse gseVarMo122928b = fseVar.mo122928b(j3);
            if (gseVarMo122928b.f104168a == 1) {
                long j4 = gseVarMo122928b.f104170c;
                if (j4 <= j2 && j2 <= gseVarMo122928b.f104171d + j4) {
                    return (j2 - j4) + gseVarMo122928b.f104169b;
                }
            }
        }
        qkq0.m175383a("Could not map vma to file offset!");
        return 0L;
    }

    /* JADX INFO: renamed from: B */
    public long m147056B(ByteBuffer byteBuffer, long j) throws IOException {
        m147059n(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f124444b.close();
    }

    /* JADX INFO: renamed from: k */
    public fse m147057k() throws IOException {
        this.f124444b.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m147056B(byteBufferAllocate, 0L) != 1179403647) {
            ig3.m135964a("Invalid ELF Magic!");
            return null;
        }
        short sM147060q = m147060q(byteBufferAllocate, 4L);
        boolean z = m147060q(byteBufferAllocate, 5L) == 2;
        if (sM147060q == 1) {
            return new ise(z, this);
        }
        if (sM147060q == 2) {
            return new jse(z, this);
        }
        qkq0.m175383a("Invalid class type!");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public List<String> m147058m() throws IOException {
        long j;
        long j2;
        this.f124444b.position(0L);
        ArrayList arrayList = new ArrayList();
        fse fseVarM147057k = m147057k();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(fseVarM147057k.f99061a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = fseVarM147057k.f99066f;
        int i = 0;
        if (j3 == 65535) {
            j3 = fseVarM147057k.mo122929c(0).f109314a;
        }
        long j4 = 0;
        while (true) {
            j = 1;
            if (j4 >= j3) {
                j2 = 0;
                break;
            }
            gse gseVarMo122928b = fseVarM147057k.mo122928b(j4);
            if (gseVarMo122928b.f104168a == 2) {
                j2 = gseVarMo122928b.f104169b;
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
            ese eseVarMo122927a = fseVarM147057k.mo122927a(j2, i);
            long j6 = j;
            long j7 = eseVarMo122927a.f93005a;
            if (j7 == j6) {
                arrayList2.add(Long.valueOf(eseVarMo122927a.f93006b));
            } else if (j7 == 5) {
                j5 = eseVarMo122927a.f93006b;
            }
            i++;
            if (eseVarMo122927a.f93005a == 0) {
                break;
            }
            j = j6;
            j3 = j3;
        }
        if (j5 == 0) {
            qkq0.m175383a("String table offset not found!");
            return null;
        }
        long jM147055b = m147055b(fseVarM147057k, j3, j5);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(m147063v(byteBufferAllocate, ((Long) it.next()).longValue() + jM147055b));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m147059n(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int i2 = this.f124444b.read(byteBuffer, j + j2);
            if (i2 == -1) {
                hg3.m130807a();
                return;
            }
            j2 += (long) i2;
        }
        byteBuffer.position(0);
    }

    /* JADX INFO: renamed from: q */
    public short m147060q(ByteBuffer byteBuffer, long j) throws IOException {
        m147059n(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: renamed from: t */
    public int m147061t(ByteBuffer byteBuffer, long j) throws IOException {
        m147059n(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* JADX INFO: renamed from: u */
    public long m147062u(ByteBuffer byteBuffer, long j) throws IOException {
        m147059n(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* JADX INFO: renamed from: v */
    public String m147063v(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short sM147060q = m147060q(byteBuffer, j);
            if (sM147060q == 0) {
                return sb.toString();
            }
            sb.append((char) sM147060q);
            j = j2;
        }
    }
}
