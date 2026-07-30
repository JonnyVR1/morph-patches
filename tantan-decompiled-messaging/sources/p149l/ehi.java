package p149l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public interface ehi {

    /* JADX INFO: renamed from: a */
    public static final ehi f91328a = new C16610a();

    /* JADX INFO: renamed from: l.ehi$a */
    public static class C16610a implements ehi {
        @Override // p149l.ehi
        /* JADX INFO: renamed from: a */
        public void mo116457a(File file) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                mll.m155165a("not a readable directory: ", file);
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    mo116457a(file2);
                }
                if (!file2.delete()) {
                    mll.m155165a("failed to delete ", file2);
                    return;
                }
            }
        }

        @Override // p149l.ehi
        /* JADX INFO: renamed from: b */
        public void mo116458b(File file, File file2) throws IOException {
            mo116459c(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // p149l.ehi
        /* JADX INFO: renamed from: c */
        public void mo116459c(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            mll.m155165a("failed to delete ", file);
        }

        @Override // p149l.ehi
        /* JADX INFO: renamed from: d */
        public boolean mo116460d(File file) {
            return file.exists();
        }

        @Override // p149l.ehi
        /* JADX INFO: renamed from: e */
        public Sink mo116461e(File file) throws FileNotFoundException {
            try {
                return Okio.appendingSink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.appendingSink(file);
            }
        }

        @Override // p149l.ehi
        /* JADX INFO: renamed from: f */
        public long mo116462f(File file) {
            return file.length();
        }

        @Override // p149l.ehi
        /* JADX INFO: renamed from: g */
        public Source mo116463g(File file) throws FileNotFoundException {
            return Okio.source(file);
        }

        @Override // p149l.ehi
        /* JADX INFO: renamed from: h */
        public Sink mo116464h(File file) throws FileNotFoundException {
            try {
                return Okio.sink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.sink(file);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo116457a(File file) throws IOException;

    /* JADX INFO: renamed from: b */
    void mo116458b(File file, File file2) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo116459c(File file) throws IOException;

    /* JADX INFO: renamed from: d */
    boolean mo116460d(File file);

    /* JADX INFO: renamed from: e */
    Sink mo116461e(File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: f */
    long mo116462f(File file);

    /* JADX INFO: renamed from: g */
    Source mo116463g(File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: h */
    Sink mo116464h(File file) throws FileNotFoundException;
}
