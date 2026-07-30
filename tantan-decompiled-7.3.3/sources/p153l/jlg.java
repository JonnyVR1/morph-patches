package p153l;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* JADX INFO: loaded from: classes2.dex */
public class jlg extends ForwardingSink {

    /* JADX INFO: renamed from: a */
    public boolean f121552a;

    public jlg(Sink sink) {
        super(sink);
    }

    /* JADX INFO: renamed from: b */
    public void mo146061b(IOException iOException) {
        throw null;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f121552a) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f121552a = true;
            mo146061b(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.f121552a) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f121552a = true;
            mo146061b(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        if (this.f121552a) {
            buffer.skip(j);
            return;
        }
        try {
            super.write(buffer, j);
        } catch (IOException e) {
            this.f121552a = true;
            mo146061b(e);
        }
    }
}
