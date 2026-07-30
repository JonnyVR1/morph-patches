package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public final class vns0 extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public Activity f182275a;

    public vns0(Application application) {
        super(application);
    }

    /* JADX INFO: renamed from: a */
    public final void m199052a(Activity activity) {
        this.f182275a = activity;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.f182275a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f182275a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }
}
