package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class p6s0 {

    /* JADX INFO: renamed from: a */
    public final Context f147437a;

    public p6s0(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.f147437a = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m167690a(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        return !this.f147437a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m167691b() {
        return m167690a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m167692c() {
        return ((Boolean) k6t0.m144630a(this.f147437a, new Callable() { // from class: l.o6s0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && Wrappers.packageManager(this.f147437a).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
