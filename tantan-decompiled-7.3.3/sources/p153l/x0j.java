package p153l;

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
public class x0j {

    /* JADX INFO: renamed from: l.x0j$a */
    public static class C21222a {

        /* JADX INFO: renamed from: a */
        public final int f191908a;

        /* JADX INFO: renamed from: b */
        public final C21223b[] f191909b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public C21222a(int i, @Nullable C21223b[] c21223bArr) {
            this.f191908a = i;
            this.f191909b = c21223bArr;
        }

        /* JADX INFO: renamed from: a */
        public static C21222a m208858a(int i, @Nullable C21223b[] c21223bArr) {
            return new C21222a(i, c21223bArr);
        }

        /* JADX INFO: renamed from: b */
        public C21223b[] m208859b() {
            return this.f191909b;
        }

        /* JADX INFO: renamed from: c */
        public int m208860c() {
            return this.f191908a;
        }
    }

    /* JADX INFO: renamed from: l.x0j$b */
    public static class C21223b {

        /* JADX INFO: renamed from: a */
        public final Uri f191910a;

        /* JADX INFO: renamed from: b */
        public final int f191911b;

        /* JADX INFO: renamed from: c */
        public final int f191912c;

        /* JADX INFO: renamed from: d */
        public final boolean f191913d;

        /* JADX INFO: renamed from: e */
        public final int f191914e;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public C21223b(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, to = 1000) int i2, boolean z, int i3) {
            this.f191910a = (Uri) yn80.m216775e(uri);
            this.f191911b = i;
            this.f191912c = i2;
            this.f191913d = z;
            this.f191914e = i3;
        }

        /* JADX INFO: renamed from: a */
        public static C21223b m208861a(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, to = 1000) int i2, boolean z, int i3) {
            return new C21223b(uri, i, i2, z, i3);
        }

        /* JADX INFO: renamed from: b */
        public int m208862b() {
            return this.f191914e;
        }

        @IntRange(from = 0)
        /* JADX INFO: renamed from: c */
        public int m208863c() {
            return this.f191911b;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public Uri m208864d() {
            return this.f191910a;
        }

        @IntRange(from = 1, to = 1000)
        /* JADX INFO: renamed from: e */
        public int m208865e() {
            return this.f191912c;
        }

        /* JADX INFO: renamed from: f */
        public boolean m208866f() {
            return this.f191913d;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Typeface m208855a(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull C21223b[] c21223bArr) {
        return foj0.m126457b(context, cancellationSignal, c21223bArr, 0);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C21222a m208856b(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull t0j t0jVar) throws PackageManager.NameNotFoundException {
        return s0j.m183955e(context, t0jVar, cancellationSignal);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public static Typeface m208857c(@NonNull Context context, @NonNull t0j t0jVar, int i, boolean z, @IntRange(from = 0) int i2, @NonNull Handler handler, @NonNull C21224c c21224c) {
        c94 c94Var = new c94(c21224c, handler);
        return z ? v0j.m198904e(context, t0jVar, c94Var, i, i2) : v0j.m198903d(context, t0jVar, i, null, c94Var);
    }

    /* JADX INFO: renamed from: l.x0j$c */
    public static class C21224c {
        /* JADX INFO: renamed from: a */
        public void mo126463a(int i) {
        }

        /* JADX INFO: renamed from: b */
        public void mo126464b(Typeface typeface) {
        }
    }
}
