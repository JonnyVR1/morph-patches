package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class txv {

    /* JADX INFO: renamed from: a */
    public static final Object f172533a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile txv f172534b = null;

    /* JADX INFO: renamed from: c */
    public static final int f172535c = 20;

    public txv(int i) {
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static txv m190976e() {
        txv txvVar;
        synchronized (f172533a) {
            try {
                if (f172534b == null) {
                    f172534b = new C20308a(3);
                }
                txvVar = f172534b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return txvVar;
    }

    /* JADX INFO: renamed from: h */
    public static void m190977h(@NonNull txv txvVar) {
        synchronized (f172533a) {
            try {
                if (f172534b == null) {
                    f172534b = txvVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static String m190978i(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f172535c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo190979a(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: b */
    public abstract void mo190980b(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    /* JADX INFO: renamed from: c */
    public abstract void mo190981c(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: d */
    public abstract void mo190982d(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    /* JADX INFO: renamed from: f */
    public abstract void mo190983f(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: g */
    public abstract void mo190984g(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    /* JADX INFO: renamed from: j */
    public abstract void mo190985j(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: k */
    public abstract void mo190986k(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: l */
    public abstract void mo190987l(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    /* JADX INFO: renamed from: l.txv$a */
    public static class C20308a extends txv {

        /* JADX INFO: renamed from: d */
        public final int f172536d;

        public C20308a(int i) {
            super(i);
            this.f172536d = i;
        }

        @Override // p149l.txv
        /* JADX INFO: renamed from: c */
        public void mo190981c(@NonNull String str, @NonNull String str2) {
            if (this.f172536d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // p149l.txv
        /* JADX INFO: renamed from: d */
        public void mo190982d(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.f172536d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // p149l.txv
        /* JADX INFO: renamed from: a */
        public void mo190979a(@NonNull String str, @NonNull String str2) {
        }

        @Override // p149l.txv
        /* JADX INFO: renamed from: f */
        public void mo190983f(@NonNull String str, @NonNull String str2) {
        }

        @Override // p149l.txv
        /* JADX INFO: renamed from: j */
        public void mo190985j(@NonNull String str, @NonNull String str2) {
        }

        @Override // p149l.txv
        /* JADX INFO: renamed from: k */
        public void mo190986k(@NonNull String str, @NonNull String str2) {
        }

        @Override // p149l.txv
        /* JADX INFO: renamed from: b */
        public void mo190980b(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        }

        @Override // p149l.txv
        /* JADX INFO: renamed from: g */
        public void mo190984g(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        }

        @Override // p149l.txv
        /* JADX INFO: renamed from: l */
        public void mo190987l(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        }
    }
}
