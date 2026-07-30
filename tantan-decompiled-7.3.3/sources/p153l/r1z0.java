package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class r1z0 {

    /* JADX INFO: renamed from: a */
    public final Context f160865a;

    /* JADX INFO: renamed from: b */
    public int f160866b;

    /* JADX INFO: renamed from: c */
    public int f160867c = 0;

    public r1z0(Context context) {
        this.f160865a = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m179458a() {
        PackageInfo packageInfo;
        if (this.f160866b == 0) {
            try {
                packageInfo = Wrappers.packageManager(this.f160865a).getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f160866b = packageInfo.versionCode;
            }
        }
        return this.f160866b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x001d, B:14:0x0028, B:16:0x002f, B:18:0x0041, B:26:0x0062, B:21:0x0048, B:23:0x005b, B:29:0x0066, B:33:0x006e), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX INFO: renamed from: b */
    public final synchronized int m179459b() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i = this.f160867c;
        if (i != 0) {
            return i;
        }
        Context context = this.f160865a;
        PackageManager packageManager = context.getPackageManager();
        if (Wrappers.packageManager(context).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            if (true != PlatformVersion.isAtLeastO()) {
                i2 = 2;
            }
            this.f160867c = i2;
            return i2;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                if (true != PlatformVersion.isAtLeastO()) {
                    i2 = 2;
                }
                this.f160867c = i2;
                return i2;
            }
            i2 = 2;
        }
        this.f160867c = i2;
        return i2;
    }
}
