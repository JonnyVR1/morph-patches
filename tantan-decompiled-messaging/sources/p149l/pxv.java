package p149l;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class pxv extends Writer {

    /* JADX INFO: renamed from: a */
    public final String f151731a;

    /* JADX INFO: renamed from: b */
    public StringBuilder f151732b = new StringBuilder(128);

    public pxv(String str) {
        this.f151731a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m171955k();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m171955k();
    }

    /* JADX INFO: renamed from: k */
    public final void m171955k() {
        if (this.f151732b.length() > 0) {
            this.f151732b.toString();
            StringBuilder sb = this.f151732b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m171955k();
            } else {
                this.f151732b.append(c);
            }
        }
    }
}
