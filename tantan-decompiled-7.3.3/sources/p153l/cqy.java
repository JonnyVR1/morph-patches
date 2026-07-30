package p153l;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class cqy {

    /* JADX INFO: renamed from: a */
    private final int f83248a;

    /* JADX INFO: renamed from: b */
    private final int f83249b;

    /* JADX INFO: renamed from: c */
    private final Context f83250c;

    /* JADX INFO: renamed from: d */
    private final int f83251d;

    /* JADX INFO: renamed from: l.cqy$a */
    public static final class C16338a {

        /* JADX INFO: renamed from: i */
        static final int f83252i;

        /* JADX INFO: renamed from: a */
        final Context f83253a;

        /* JADX INFO: renamed from: b */
        ActivityManager f83254b;

        /* JADX INFO: renamed from: c */
        InterfaceC16340c f83255c;

        /* JADX INFO: renamed from: e */
        float f83257e;

        /* JADX INFO: renamed from: d */
        float f83256d = 2.0f;

        /* JADX INFO: renamed from: f */
        float f83258f = 0.4f;

        /* JADX INFO: renamed from: g */
        float f83259g = 0.33f;

        /* JADX INFO: renamed from: h */
        int f83260h = 4194304;

        static {
            f83252i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public C16338a(Context context) {
            this.f83257e = f83252i;
            this.f83253a = context;
            this.f83254b = (ActivityManager) context.getSystemService("activity");
            this.f83255c = new C16339b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !cqy.m112002e(this.f83254b)) {
                return;
            }
            this.f83257e = 0.0f;
        }

        /* JADX INFO: renamed from: a */
        public cqy m112007a() {
            return new cqy(this);
        }
    }

    /* JADX INFO: renamed from: l.cqy$b */
    public static final class C16339b implements InterfaceC16340c {

        /* JADX INFO: renamed from: a */
        private final DisplayMetrics f83261a;

        public C16339b(DisplayMetrics displayMetrics) {
            this.f83261a = displayMetrics;
        }

        @Override // p153l.cqy.InterfaceC16340c
        /* JADX INFO: renamed from: a */
        public int mo112008a() {
            return this.f83261a.heightPixels;
        }

        @Override // p153l.cqy.InterfaceC16340c
        /* JADX INFO: renamed from: b */
        public int mo112009b() {
            return this.f83261a.widthPixels;
        }
    }

    /* JADX INFO: renamed from: l.cqy$c */
    public interface InterfaceC16340c {
        /* JADX INFO: renamed from: a */
        int mo112008a();

        /* JADX INFO: renamed from: b */
        int mo112009b();
    }

    public cqy(C16338a c16338a) {
        this.f83250c = c16338a.f83253a;
        boolean zM112002e = m112002e(c16338a.f83254b);
        int i = c16338a.f83260h;
        i = zM112002e ? i / 2 : i;
        this.f83251d = i;
        int iM112001c = m112001c(c16338a.f83254b, c16338a.f83258f, c16338a.f83259g);
        float fMo112009b = c16338a.f83255c.mo112009b() * c16338a.f83255c.mo112008a() * 4;
        int iRound = Math.round(c16338a.f83257e * fMo112009b);
        int iRound2 = Math.round(fMo112009b * c16338a.f83256d);
        int i2 = iM112001c - i;
        if (iRound2 + iRound <= i2) {
            this.f83249b = iRound2;
            this.f83248a = iRound;
        } else {
            float f = i2;
            float f2 = c16338a.f83257e;
            float f3 = c16338a.f83256d;
            float f4 = f / (f2 + f3);
            this.f83249b = Math.round(f3 * f4);
            this.f83248a = Math.round(f4 * c16338a.f83257e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            m112003f(this.f83249b);
            m112003f(this.f83248a);
            m112003f(i);
            m112003f(iM112001c);
            c16338a.f83254b.getMemoryClass();
            m112002e(c16338a.f83254b);
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m112001c(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m112002e(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: e */
    public static boolean m112002e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* JADX INFO: renamed from: f */
    private String m112003f(int i) {
        return Formatter.formatFileSize(this.f83250c, i);
    }

    /* JADX INFO: renamed from: a */
    public int m112004a() {
        return this.f83251d;
    }

    /* JADX INFO: renamed from: b */
    public int m112005b() {
        return this.f83248a;
    }

    /* JADX INFO: renamed from: d */
    public int m112006d() {
        return this.f83249b;
    }
}
