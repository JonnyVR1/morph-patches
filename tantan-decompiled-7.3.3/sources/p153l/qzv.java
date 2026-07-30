package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class qzv {

    /* JADX INFO: renamed from: a */
    public static final Object f160304a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile qzv f160305b = null;

    /* JADX INFO: renamed from: c */
    public static final int f160306c = 20;

    public qzv(int i) {
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static qzv m178829e() {
        qzv qzvVar;
        synchronized (f160304a) {
            try {
                if (f160305b == null) {
                    f160305b = new C19700a(3);
                }
                qzvVar = f160305b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qzvVar;
    }

    /* JADX INFO: renamed from: h */
    public static void m178830h(@NonNull qzv qzvVar) {
        synchronized (f160304a) {
            try {
                if (f160305b == null) {
                    f160305b = qzvVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static String m178831i(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f160306c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo178832a(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: b */
    public abstract void mo178833b(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    /* JADX INFO: renamed from: c */
    public abstract void mo178834c(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: d */
    public abstract void mo178835d(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    /* JADX INFO: renamed from: f */
    public abstract void mo178836f(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: g */
    public abstract void mo178837g(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    /* JADX INFO: renamed from: j */
    public abstract void mo178838j(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: k */
    public abstract void mo178839k(@NonNull String str, @NonNull String str2);

    /* JADX INFO: renamed from: l */
    public abstract void mo178840l(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    /* JADX INFO: renamed from: l.qzv$a */
    public static class C19700a extends qzv {

        /* JADX INFO: renamed from: d */
        public final int f160307d;

        public C19700a(int i) {
            super(i);
            this.f160307d = i;
        }

        @Override // p153l.qzv
        /* JADX INFO: renamed from: c */
        public void mo178834c(@NonNull String str, @NonNull String str2) {
            if (this.f160307d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // p153l.qzv
        /* JADX INFO: renamed from: d */
        public void mo178835d(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.f160307d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // p153l.qzv
        /* JADX INFO: renamed from: a */
        public void mo178832a(@NonNull String str, @NonNull String str2) {
        }

        @Override // p153l.qzv
        /* JADX INFO: renamed from: f */
        public void mo178836f(@NonNull String str, @NonNull String str2) {
        }

        @Override // p153l.qzv
        /* JADX INFO: renamed from: j */
        public void mo178838j(@NonNull String str, @NonNull String str2) {
        }

        @Override // p153l.qzv
        /* JADX INFO: renamed from: k */
        public void mo178839k(@NonNull String str, @NonNull String str2) {
        }

        @Override // p153l.qzv
        /* JADX INFO: renamed from: b */
        public void mo178833b(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        }

        @Override // p153l.qzv
        /* JADX INFO: renamed from: g */
        public void mo178837g(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        }

        @Override // p153l.qzv
        /* JADX INFO: renamed from: l */
        public void mo178840l(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        }
    }
}
