package p149l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class byi {

    /* JADX INFO: renamed from: l.byi$a */
    public static class C16013a {

        /* JADX INFO: renamed from: a */
        public final int f77922a;

        /* JADX INFO: renamed from: b */
        public final C16014b[] f77923b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public C16013a(int i, @Nullable C16014b[] c16014bArr) {
            this.f77922a = i;
            this.f77923b = c16014bArr;
        }

        /* JADX INFO: renamed from: a */
        public static C16013a m104461a(int i, @Nullable C16014b[] c16014bArr) {
            return new C16013a(i, c16014bArr);
        }

        /* JADX INFO: renamed from: b */
        public C16014b[] m104462b() {
            return this.f77923b;
        }

        /* JADX INFO: renamed from: c */
        public int m104463c() {
            return this.f77922a;
        }
    }

    /* JADX INFO: renamed from: l.byi$b */
    public static class C16014b {

        /* JADX INFO: renamed from: a */
        public final Uri f77924a;

        /* JADX INFO: renamed from: b */
        public final int f77925b;

        /* JADX INFO: renamed from: c */
        public final int f77926c;

        /* JADX INFO: renamed from: d */
        public final boolean f77927d;

        /* JADX INFO: renamed from: e */
        public final int f77928e;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public C16014b(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, to = 1000) int i2, boolean z, int i3) {
            this.f77924a = (Uri) tf80.m188658e(uri);
            this.f77925b = i;
            this.f77926c = i2;
            this.f77927d = z;
            this.f77928e = i3;
        }

        /* JADX INFO: renamed from: a */
        public static C16014b m104464a(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, to = 1000) int i2, boolean z, int i3) {
            return new C16014b(uri, i, i2, z, i3);
        }

        /* JADX INFO: renamed from: b */
        public int m104465b() {
            return this.f77928e;
        }

        @IntRange(from = 0)
        /* JADX INFO: renamed from: c */
        public int m104466c() {
            return this.f77925b;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public Uri m104467d() {
            return this.f77924a;
        }

        @IntRange(from = 1, to = 1000)
        /* JADX INFO: renamed from: e */
        public int m104468e() {
            return this.f77926c;
        }

        /* JADX INFO: renamed from: f */
        public boolean m104469f() {
            return this.f77927d;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Typeface m104458a(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull C16014b[] c16014bArr) {
        return bfj0.m101538b(context, cancellationSignal, c16014bArr, 0);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C16013a m104459b(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull xxi xxiVar) throws PackageManager.NameNotFoundException {
        return wxi.m206006e(context, xxiVar, cancellationSignal);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public static Typeface m104460c(@NonNull Context context, @NonNull xxi xxiVar, int i, boolean z, @IntRange(from = 0) int i2, @NonNull Handler handler, @NonNull C16015c c16015c) {
        d84 d84Var = new d84(c16015c, handler);
        return z ? zxi.m220830e(context, xxiVar, d84Var, i, i2) : zxi.m220829d(context, xxiVar, i, null, d84Var);
    }

    /* JADX INFO: renamed from: l.byi$c */
    public static class C16015c {
        /* JADX INFO: renamed from: a */
        public void mo101544a(int i) {
        }

        /* JADX INFO: renamed from: b */
        public void mo101545b(Typeface typeface) {
        }
    }
}
