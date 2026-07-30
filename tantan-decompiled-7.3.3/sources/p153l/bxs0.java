package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class bxs0 extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public Activity f78907a;

    public bxs0(Application application) {
        super(application);
    }

    /* JADX INFO: renamed from: a */
    public final void m106903a(Activity activity) {
        this.f78907a = activity;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.f78907a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f78907a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            super.startActivity(intent);
        }
    }
}
