package p153l;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class y5r0 {

    /* JADX INFO: renamed from: e */
    private static final Set<String> f197578e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: a */
    private Context f197579a;

    /* JADX INFO: renamed from: b */
    private FileLock f197580b;

    /* JADX INFO: renamed from: c */
    private String f197581c;

    /* JADX INFO: renamed from: d */
    private RandomAccessFile f197582d;

    private y5r0(Context context) {
        this.f197579a = context;
    }

    /* JADX INFO: renamed from: a */
    public static y5r0 m214315a(Context context, File file) throws IOException {
        ouq0.m169406z("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        if (!f197578e.add(str)) {
            zpg0.m220844a("abtain lock failure");
            return null;
        }
        y5r0 y5r0Var = new y5r0(context);
        y5r0Var.f197581c = str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            y5r0Var.f197582d = randomAccessFile;
            y5r0Var.f197580b = randomAccessFile.getChannel().lock();
            ouq0.m169406z("Locked: " + str + " :" + y5r0Var.f197580b);
            if (y5r0Var.f197580b == null) {
                RandomAccessFile randomAccessFile2 = y5r0Var.f197582d;
                if (randomAccessFile2 != null) {
                    j6r0.m143691b(randomAccessFile2);
                }
            }
            return y5r0Var;
        } finally {
            if (y5r0Var.f197580b == null) {
                RandomAccessFile randomAccessFile3 = y5r0Var.f197582d;
                if (randomAccessFile3 != null) {
                    j6r0.m143691b(randomAccessFile3);
                }
                f197578e.remove(y5r0Var.f197581c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m214316b() {
        ouq0.m169406z("unLock: " + this.f197580b);
        FileLock fileLock = this.f197580b;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f197580b.release();
            } catch (IOException unused) {
            }
            this.f197580b = null;
        }
        RandomAccessFile randomAccessFile = this.f197582d;
        if (randomAccessFile != null) {
            j6r0.m143691b(randomAccessFile);
        }
        f197578e.remove(this.f197581c);
    }
}
