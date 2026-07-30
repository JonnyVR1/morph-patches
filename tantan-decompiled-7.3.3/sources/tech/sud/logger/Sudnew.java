package tech.sud.logger;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class Sudnew implements Runnable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ File f211057Suddo;

    public Sudnew(File file) {
        this.f211057Suddo = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f211057Suddo.delete()) {
            return;
        }
        Log.e("LogUtils", "delete " + this.f211057Suddo + " failed!");
    }
}
