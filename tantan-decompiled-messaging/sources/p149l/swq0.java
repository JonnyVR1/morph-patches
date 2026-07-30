package p149l;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class swq0 {

    /* JADX INFO: renamed from: e */
    private static final Set<String> f166709e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: a */
    private Context f166710a;

    /* JADX INFO: renamed from: b */
    private FileLock f166711b;

    /* JADX INFO: renamed from: c */
    private String f166712c;

    /* JADX INFO: renamed from: d */
    private RandomAccessFile f166713d;

    private swq0(Context context) {
        this.f166710a = context;
    }

    /* JADX INFO: renamed from: a */
    public static swq0 m186333a(Context context, File file) throws IOException {
        ilq0.m137053z("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        if (!f166709e.add(str)) {
            rhg0.m179353a("abtain lock failure");
            return null;
        }
        swq0 swq0Var = new swq0(context);
        swq0Var.f166712c = str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            swq0Var.f166713d = randomAccessFile;
            swq0Var.f166711b = randomAccessFile.getChannel().lock();
            ilq0.m137053z("Locked: " + str + " :" + swq0Var.f166711b);
            if (swq0Var.f166711b == null) {
                RandomAccessFile randomAccessFile2 = swq0Var.f166713d;
                if (randomAccessFile2 != null) {
                    dxq0.m114018b(randomAccessFile2);
                }
            }
            return swq0Var;
        } finally {
            if (swq0Var.f166711b == null) {
                RandomAccessFile randomAccessFile3 = swq0Var.f166713d;
                if (randomAccessFile3 != null) {
                    dxq0.m114018b(randomAccessFile3);
                }
                f166709e.remove(swq0Var.f166712c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m186334b() {
        ilq0.m137053z("unLock: " + this.f166711b);
        FileLock fileLock = this.f166711b;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f166711b.release();
            } catch (IOException unused) {
            }
            this.f166711b = null;
        }
        RandomAccessFile randomAccessFile = this.f166713d;
        if (randomAccessFile != null) {
            dxq0.m114018b(randomAccessFile);
        }
        f166709e.remove(this.f166712c);
    }
}
