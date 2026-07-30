package p153l;

import java.io.File;
import java.util.Locale;
import tech.sud.gip.logger.SudLogger;

/* JADX INFO: loaded from: classes.dex */
public final class kog0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mzg0 f127728a;

    public kog0(mzg0 mzg0Var) {
        this.f127728a = mzg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale = Locale.US;
        mzg0 mzg0Var = this.f127728a;
        String str = mzg0Var.f139511c;
        long j = mzg0Var.f139512d;
        String str2 = "sud/mgp/user/" + str + "/" + j + "/data/" + str + "/" + j + "/tmp";
        mzg0 mzg0Var2 = this.f127728a;
        String str3 = "sud/mgp/user/" + mzg0Var2.f139511c + "/" + mzg0Var2.f139512d + "/data_clean_tmp";
        String str4 = str3 + "/" + System.currentTimeMillis();
        String absolutePath = new File(this.f127728a.f139509a.getFilesDir(), str3).getAbsolutePath();
        ofg0.m167448a(absolutePath);
        if (!new File(this.f127728a.f139509a.getFilesDir(), str2).renameTo(new File(this.f127728a.f139509a.getFilesDir(), str4))) {
            SudLogger.m222813e(mzg0.f139506k, "renameTo tmp failed");
        }
        mzg0.f139507l.execute(new yrg0(absolutePath));
    }
}
