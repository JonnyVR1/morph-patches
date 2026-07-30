package androidx.multidex;

import android.app.Application;
import android.content.Context;
import p149l.jj10;

/* JADX INFO: loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        jj10.m141730k(this);
    }
}
