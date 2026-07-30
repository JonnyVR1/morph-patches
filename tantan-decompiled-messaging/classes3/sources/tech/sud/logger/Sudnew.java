package tech.sud.logger;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class Sudnew implements Runnable {
    public final /* synthetic */ File Suddo;

    public Sudnew(File file) {
        this.Suddo = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.Suddo.delete()) {
            return;
        }
        Log.e("LogUtils", "delete " + this.Suddo + " failed!");
    }
}
