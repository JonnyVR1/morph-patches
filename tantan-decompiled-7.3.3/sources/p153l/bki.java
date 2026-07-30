package p153l;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public interface bki {

    /* JADX INFO: renamed from: a */
    public static final bki f77078a = new C16029a();

    /* JADX INFO: renamed from: l.bki$a */
    public static class C16029a implements bki {
        @Override // p153l.bki
        /* JADX INFO: renamed from: a */
        public void mo104810a(File file) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                bol.m105705a("not a readable directory: ", file);
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    mo104810a(file2);
                }
                if (!file2.delete()) {
                    bol.m105705a("failed to delete ", file2);
                    return;
                }
            }
        }

        @Override // p153l.bki
        /* JADX INFO: renamed from: b */
        public void mo104811b(File file, File file2) throws IOException {
            mo104812c(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // p153l.bki
        /* JADX INFO: renamed from: c */
        public void mo104812c(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            bol.m105705a("failed to delete ", file);
        }

        @Override // p153l.bki
        /* JADX INFO: renamed from: d */
        public boolean mo104813d(File file) {
            return file.exists();
        }

        @Override // p153l.bki
        /* JADX INFO: renamed from: e */
        public Sink mo104814e(File file) throws FileNotFoundException {
            try {
                return Okio.appendingSink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.appendingSink(file);
            }
        }

        @Override // p153l.bki
        /* JADX INFO: renamed from: f */
        public long mo104815f(File file) {
            return file.length();
        }

        @Override // p153l.bki
        /* JADX INFO: renamed from: g */
        public Source mo104816g(File file) throws FileNotFoundException {
            return Okio.source(file);
        }

        @Override // p153l.bki
        /* JADX INFO: renamed from: h */
        public Sink mo104817h(File file) throws FileNotFoundException {
            try {
                return Okio.sink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.sink(file);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo104810a(File file) throws IOException;

    /* JADX INFO: renamed from: b */
    void mo104811b(File file, File file2) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo104812c(File file) throws IOException;

    /* JADX INFO: renamed from: d */
    boolean mo104813d(File file);

    /* JADX INFO: renamed from: e */
    Sink mo104814e(File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: f */
    long mo104815f(File file);

    /* JADX INFO: renamed from: g */
    Source mo104816g(File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: h */
    Sink mo104817h(File file) throws FileNotFoundException;
}
