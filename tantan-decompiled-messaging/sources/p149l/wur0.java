package p149l;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public final class wur0 {

    /* JADX INFO: renamed from: a */
    public long f188157a = -1;

    /* JADX INFO: renamed from: b */
    public long f188158b = -1;

    /* JADX INFO: renamed from: c */
    public long f188159c = -1;

    /* JADX INFO: renamed from: d */
    public long f188160d = -1;

    /* JADX INFO: renamed from: e */
    public long f188161e = -1;

    /* JADX INFO: renamed from: f */
    public long f188162f = -1;

    /* JADX INFO: renamed from: g */
    public long f188163g = -1;

    /* JADX INFO: renamed from: h */
    public long f188164h = -1;

    /* JADX INFO: renamed from: l */
    public static DisplayMetrics m205668l(Context context) {
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
    public static boolean m205669m(View view) {
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
    public final long m205670a() {
        return this.f188163g;
    }

    /* JADX INFO: renamed from: b */
    public final long m205671b() {
        return this.f188161e;
    }

    /* JADX INFO: renamed from: c */
    public final long m205672c() {
        return this.f188157a;
    }

    /* JADX INFO: renamed from: d */
    public final long m205673d() {
        return this.f188159c;
    }

    /* JADX INFO: renamed from: e */
    public final long m205674e() {
        return this.f188164h;
    }

    /* JADX INFO: renamed from: f */
    public final long m205675f() {
        return this.f188162f;
    }

    /* JADX INFO: renamed from: g */
    public final long m205676g() {
        return this.f188158b;
    }

    /* JADX INFO: renamed from: h */
    public final long m205677h() {
        return this.f188160d;
    }

    /* JADX INFO: renamed from: i */
    public final void m205678i() {
        this.f188164h = this.f188163g;
        this.f188163g = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: j */
    public final void m205679j() {
        this.f188158b = this.f188157a;
        this.f188157a = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: k */
    public final void m205680k(Context context, View view) {
        this.f188160d = this.f188159c;
        this.f188159c = SystemClock.uptimeMillis();
        long j = this.f188161e;
        if (j != -1) {
            this.f188162f = j;
        }
        DisplayMetrics displayMetricsM205668l = m205668l(context);
        int i = displayMetricsM205668l.widthPixels * displayMetricsM205668l.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsM205668l.widthPixels) * Math.min(view.getHeight(), displayMetricsM205668l.heightPixels);
            if (iMin + iMin >= i || (iMin == 0 && m205669m(view))) {
                this.f188161e = this.f188159c;
                return;
            }
        }
        this.f188161e = -1L;
    }
}
