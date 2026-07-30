package p149l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* JADX INFO: loaded from: classes.dex */
public final class ibg0 implements kfg0 {

    /* JADX INFO: renamed from: a */
    public final File f112364a;

    /* JADX INFO: renamed from: b */
    public final OutputStream f112365b;

    /* JADX INFO: renamed from: c */
    public boolean f112366c;

    public ibg0(File file) throws FileNotFoundException {
        this.f112364a = file;
        try {
            this.f112365b = Files.newOutputStream(file.toPath(), new OpenOption[0]);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e2) {
            aag0.m95543a(e2);
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            if (!this.f112366c) {
                this.f112365b.close();
                this.f112366c = true;
            }
        } finally {
            if (this.f112364a.exists() && !this.f112364a.delete()) {
                this.f112364a.deleteOnExit();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final InputStream m135254k() {
        return Files.newInputStream(this.f112364a.toPath(), new OpenOption[0]);
    }
}
