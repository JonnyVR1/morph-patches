package tech.sud.logger;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class Sudbyte implements Runnable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ File f210128Suddo;

    public Sudbyte(File file) {
        this.f210128Suddo = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f210128Suddo.delete()) {
            return;
        }
        Log.e("LogUtils", "delete " + this.f210128Suddo + " failed!");
    }
}
