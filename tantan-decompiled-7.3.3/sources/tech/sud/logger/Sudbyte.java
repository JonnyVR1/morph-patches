package tech.sud.logger;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class Sudbyte implements Runnable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ File f211049Suddo;

    public Sudbyte(File file) {
        this.f211049Suddo = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f211049Suddo.delete()) {
            return;
        }
        Log.e("LogUtils", "delete " + this.f211049Suddo + " failed!");
    }
}
