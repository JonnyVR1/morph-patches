package p149l;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class fhy {

    /* JADX INFO: renamed from: a */
    private final int f97585a;

    /* JADX INFO: renamed from: b */
    private final int f97586b;

    /* JADX INFO: renamed from: c */
    private final Context f97587c;

    /* JADX INFO: renamed from: d */
    private final int f97588d;

    /* JADX INFO: renamed from: l.fhy$a */
    public static final class C16839a {

        /* JADX INFO: renamed from: i */
        static final int f97589i;

        /* JADX INFO: renamed from: a */
        final Context f97590a;

        /* JADX INFO: renamed from: b */
        ActivityManager f97591b;

        /* JADX INFO: renamed from: c */
        InterfaceC16841c f97592c;

        /* JADX INFO: renamed from: e */
        float f97594e;

        /* JADX INFO: renamed from: d */
        float f97593d = 2.0f;

        /* JADX INFO: renamed from: f */
        float f97595f = 0.4f;

        /* JADX INFO: renamed from: g */
        float f97596g = 0.33f;

        /* JADX INFO: renamed from: h */
        int f97597h = 4194304;

        static {
            f97589i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public C16839a(Context context) {
            this.f97594e = f97589i;
            this.f97590a = context;
            this.f97591b = (ActivityManager) context.getSystemService("activity");
            this.f97592c = new C16840b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !fhy.m121472e(this.f97591b)) {
                return;
            }
            this.f97594e = 0.0f;
        }

        /* JADX INFO: renamed from: a */
        public fhy m121477a() {
            return new fhy(this);
        }
    }

    /* JADX INFO: renamed from: l.fhy$b */
    public static final class C16840b implements InterfaceC16841c {

        /* JADX INFO: renamed from: a */
        private final DisplayMetrics f97598a;

        public C16840b(DisplayMetrics displayMetrics) {
            this.f97598a = displayMetrics;
        }

        @Override // p149l.fhy.InterfaceC16841c
        /* JADX INFO: renamed from: a */
        public int mo121478a() {
            return this.f97598a.heightPixels;
        }

        @Override // p149l.fhy.InterfaceC16841c
        /* JADX INFO: renamed from: b */
        public int mo121479b() {
            return this.f97598a.widthPixels;
        }
    }

    /* JADX INFO: renamed from: l.fhy$c */
    public interface InterfaceC16841c {
        /* JADX INFO: renamed from: a */
        int mo121478a();

        /* JADX INFO: renamed from: b */
        int mo121479b();
    }

    public fhy(C16839a c16839a) {
        this.f97587c = c16839a.f97590a;
        boolean zM121472e = m121472e(c16839a.f97591b);
        int i = c16839a.f97597h;
        i = zM121472e ? i / 2 : i;
        this.f97588d = i;
        int iM121471c = m121471c(c16839a.f97591b, c16839a.f97595f, c16839a.f97596g);
        float fMo121479b = c16839a.f97592c.mo121479b() * c16839a.f97592c.mo121478a() * 4;
        int iRound = Math.round(c16839a.f97594e * fMo121479b);
        int iRound2 = Math.round(fMo121479b * c16839a.f97593d);
        int i2 = iM121471c - i;
        if (iRound2 + iRound <= i2) {
            this.f97586b = iRound2;
            this.f97585a = iRound;
        } else {
            float f = i2;
            float f2 = c16839a.f97594e;
            float f3 = c16839a.f97593d;
            float f4 = f / (f2 + f3);
            this.f97586b = Math.round(f3 * f4);
            this.f97585a = Math.round(f4 * c16839a.f97594e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            m121473f(this.f97586b);
            m121473f(this.f97585a);
            m121473f(i);
            m121473f(iM121471c);
            c16839a.f97591b.getMemoryClass();
            m121472e(c16839a.f97591b);
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m121471c(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m121472e(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: e */
    public static boolean m121472e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* JADX INFO: renamed from: f */
    private String m121473f(int i) {
        return Formatter.formatFileSize(this.f97587c, i);
    }

    /* JADX INFO: renamed from: a */
    public int m121474a() {
        return this.f97588d;
    }

    /* JADX INFO: renamed from: b */
    public int m121475b() {
        return this.f97585a;
    }

    /* JADX INFO: renamed from: d */
    public int m121476d() {
        return this.f97586b;
    }
}
