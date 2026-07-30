package p153l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* JADX INFO: loaded from: classes.dex */
public final class qjg0 implements sng0 {

    /* JADX INFO: renamed from: a */
    public final File f157968a;

    /* JADX INFO: renamed from: b */
    public final OutputStream f157969b;

    /* JADX INFO: renamed from: c */
    public boolean f157970c;

    public qjg0(File file) throws FileNotFoundException {
        this.f157968a = file;
        try {
            this.f157969b = Files.newOutputStream(file.toPath(), new OpenOption[0]);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e2) {
            iig0.m140070a(e2);
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            if (!this.f157970c) {
                this.f157969b.close();
                this.f157970c = true;
            }
        } finally {
            if (this.f157968a.exists() && !this.f157968a.delete()) {
                this.f157968a.deleteOnExit();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final InputStream m176832k() {
        return Files.newInputStream(this.f157968a.toPath(), new OpenOption[0]);
    }
}
