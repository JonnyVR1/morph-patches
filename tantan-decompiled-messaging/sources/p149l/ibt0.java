package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ibt0 extends MutableContextWrapper {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Activity f112378a;

    /* JADX INFO: renamed from: b */
    public Context f112379b;

    /* JADX INFO: renamed from: c */
    public Context f112380c;

    public ibt0(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Activity m135270a() {
        return this.f112378a;
    }

    /* JADX INFO: renamed from: b */
    public final Context m135271b() {
        return this.f112380c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f112380c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f112379b = applicationContext;
        this.f112378a = context instanceof Activity ? (Activity) context : null;
        this.f112380c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f112378a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f112379b.startActivity(intent);
        }
    }
}
