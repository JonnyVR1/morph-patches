package p149l;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class k460 {

    /* JADX INFO: renamed from: l.k460$a */
    @RequiresApi(28)
    public static class C17925a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static long m144481a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m144480a(@NonNull PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C17925a.m144481a(packageInfo) : packageInfo.versionCode;
    }
}
