package tech.sud.logger;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class Sudnew implements Runnable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ File f210136Suddo;

    public Sudnew(File file) {
        this.f210136Suddo = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f210136Suddo.delete()) {
            return;
        }
        Log.e("LogUtils", "delete " + this.f210136Suddo + " failed!");
    }
}
