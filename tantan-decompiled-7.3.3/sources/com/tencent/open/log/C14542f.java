package com.tencent.open.log;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.open.log.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14542f implements Iterable<String> {

    /* JADX INFO: renamed from: a */
    private ConcurrentLinkedQueue<String> f61149a;

    /* JADX INFO: renamed from: b */
    private AtomicInteger f61150b;

    public C14542f() {
        this.f61149a = null;
        this.f61150b = null;
        this.f61149a = new ConcurrentLinkedQueue<>();
        this.f61150b = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public void m85542a(Writer writer, char[] cArr) throws IOException {
        if (writer == null || cArr == null || cArr.length == 0) {
            return;
        }
        int length = cArr.length;
        int i = length;
        int i2 = 0;
        for (String str : this) {
            int length2 = str.length();
            int i3 = 0;
            while (length2 > 0) {
                int i4 = i > length2 ? length2 : i;
                int i5 = i3 + i4;
                str.getChars(i3, i5, cArr, i2);
                i -= i4;
                i2 += i4;
                length2 -= i4;
                if (i == 0) {
                    try {
                        writer.write(cArr, 0, length);
                    } catch (Exception unused) {
                    }
                    i = length;
                    i2 = 0;
                }
                i3 = i5;
            }
        }
        if (i2 > 0) {
            try {
                writer.write(cArr, 0, i2);
            } catch (Exception unused2) {
            }
        }
        try {
            writer.flush();
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m85543b() {
        this.f61149a.clear();
        this.f61150b.set(0);
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.f61149a.iterator();
    }

    /* JADX INFO: renamed from: a */
    public int m85541a(String str) {
        int length = str.length();
        this.f61149a.add(str);
        return this.f61150b.addAndGet(length);
    }

    /* JADX INFO: renamed from: a */
    public int m85540a() {
        return this.f61150b.get();
    }
}
