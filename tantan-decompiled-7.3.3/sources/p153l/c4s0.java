package p153l;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public final class c4s0 {

    /* JADX INFO: renamed from: a */
    public long f79730a = -1;

    /* JADX INFO: renamed from: b */
    public long f79731b = -1;

    /* JADX INFO: renamed from: c */
    public long f79732c = -1;

    /* JADX INFO: renamed from: d */
    public long f79733d = -1;

    /* JADX INFO: renamed from: e */
    public long f79734e = -1;

    /* JADX INFO: renamed from: f */
    public long f79735f = -1;

    /* JADX INFO: renamed from: g */
    public long f79736g = -1;

    /* JADX INFO: renamed from: h */
    public long f79737h = -1;

    /* JADX INFO: renamed from: l */
    public static DisplayMetrics m107958l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m107959m(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m107960a() {
        return this.f79736g;
    }

    /* JADX INFO: renamed from: b */
    public final long m107961b() {
        return this.f79734e;
    }

    /* JADX INFO: renamed from: c */
    public final long m107962c() {
        return this.f79730a;
    }

    /* JADX INFO: renamed from: d */
    public final long m107963d() {
        return this.f79732c;
    }

    /* JADX INFO: renamed from: e */
    public final long m107964e() {
        return this.f79737h;
    }

    /* JADX INFO: renamed from: f */
    public final long m107965f() {
        return this.f79735f;
    }

    /* JADX INFO: renamed from: g */
    public final long m107966g() {
        return this.f79731b;
    }

    /* JADX INFO: renamed from: h */
    public final long m107967h() {
        return this.f79733d;
    }

    /* JADX INFO: renamed from: i */
    public final void m107968i() {
        this.f79737h = this.f79736g;
        this.f79736g = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: j */
    public final void m107969j() {
        this.f79731b = this.f79730a;
        this.f79730a = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: k */
    public final void m107970k(Context context, View view) {
        this.f79733d = this.f79732c;
        this.f79732c = SystemClock.uptimeMillis();
        long j = this.f79734e;
        if (j != -1) {
            this.f79735f = j;
        }
        DisplayMetrics displayMetricsM107958l = m107958l(context);
        int i = displayMetricsM107958l.widthPixels * displayMetricsM107958l.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsM107958l.widthPixels) * Math.min(view.getHeight(), displayMetricsM107958l.heightPixels);
            if (iMin + iMin >= i || (iMin == 0 && m107959m(view))) {
                this.f79734e = this.f79732c;
                return;
            }
        }
        this.f79734e = -1L;
    }
}
