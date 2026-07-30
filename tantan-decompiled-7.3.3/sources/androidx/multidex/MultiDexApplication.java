package androidx.multidex;

import android.app.Application;
import android.content.Context;
import p153l.tr10;

/* JADX INFO: loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        tr10.m192393k(this);
    }
}
