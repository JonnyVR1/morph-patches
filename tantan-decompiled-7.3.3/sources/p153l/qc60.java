package p153l;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class qc60 {

    /* JADX INFO: renamed from: l.qc60$a */
    @RequiresApi(28)
    public static class C19551a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static long m176116a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m176115a(@NonNull PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C19551a.m176116a(packageInfo) : packageInfo.versionCode;
    }
}
