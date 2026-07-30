package p153l;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class mzv extends Writer {

    /* JADX INFO: renamed from: a */
    public final String f139566a;

    /* JADX INFO: renamed from: b */
    public StringBuilder f139567b = new StringBuilder(128);

    public mzv(String str) {
        this.f139566a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m160928k();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m160928k();
    }

    /* JADX INFO: renamed from: k */
    public final void m160928k() {
        if (this.f139567b.length() > 0) {
            this.f139567b.toString();
            StringBuilder sb = this.f139567b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m160928k();
            } else {
                this.f139567b.append(c);
            }
        }
    }
}
