package p149l;

import java.io.File;
import java.util.Locale;
import tech.sud.gip.logger.SudLogger;

/* JADX INFO: loaded from: classes.dex */
public final class cgg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ erg0 f80742a;

    public cgg0(erg0 erg0Var) {
        this.f80742a = erg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale = Locale.US;
        erg0 erg0Var = this.f80742a;
        String str = erg0Var.f92919c;
        long j = erg0Var.f92920d;
        String str2 = "sud/mgp/user/" + str + "/" + j + "/data/" + str + "/" + j + "/tmp";
        erg0 erg0Var2 = this.f80742a;
        String str3 = "sud/mgp/user/" + erg0Var2.f92919c + "/" + erg0Var2.f92920d + "/data_clean_tmp";
        String str4 = str3 + "/" + System.currentTimeMillis();
        String absolutePath = new File(this.f80742a.f92917a.getFilesDir(), str3).getAbsolutePath();
        g7g0.m124690a(absolutePath);
        if (!new File(this.f80742a.f92917a.getFilesDir(), str2).renameTo(new File(this.f80742a.f92917a.getFilesDir(), str4))) {
            SudLogger.m221567e(erg0.f92914k, "renameTo tmp failed");
        }
        erg0.f92915l.execute(new qjg0(absolutePath));
    }
}
