package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class vfs0 {

    /* JADX INFO: renamed from: a */
    public final Context f183973a;

    public vfs0(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.f183973a = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m201181a(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        return !this.f183973a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m201182b() {
        return m201181a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m201183c() {
        return ((Boolean) qft0.m176409a(this.f183973a, new Callable() { // from class: l.ufs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && Wrappers.packageManager(this.f183973a).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
