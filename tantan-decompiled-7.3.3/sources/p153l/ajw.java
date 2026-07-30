package p153l;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public class ajw {

    /* JADX INFO: renamed from: a */
    private Window f71887a;

    /* JADX INFO: renamed from: b */
    private View f71888b;

    /* JADX INFO: renamed from: c */
    private int f71889c;

    /* JADX INFO: renamed from: d */
    private FrameLayout.LayoutParams f71890d;

    /* JADX INFO: renamed from: e */
    private int f71891e;

    /* JADX INFO: renamed from: f */
    private boolean f71892f = true;

    /* JADX INFO: renamed from: l.ajw$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC15729a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC15729a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ajw.this.f71888b != null) {
                if (ajw.this.f71892f) {
                    ajw ajwVar = ajw.this;
                    ajwVar.f71891e = ajwVar.f71888b.getHeight();
                    ajw.this.f71892f = false;
                }
                ajw.m98496e(ajw.this);
                ajw.this.m98501j();
            }
        }
    }

    /* JADX INFO: renamed from: l.ajw$b */
    public interface InterfaceC15730b {
    }

    private ajw(Activity activity) {
        View childAt = ((FrameLayout) activity.findViewById(R.id.content)).getChildAt(0);
        this.f71888b = childAt;
        if (childAt == null || childAt.getViewTreeObserver() == null) {
            return;
        }
        this.f71887a = activity.getWindow();
        this.f71888b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC15729a());
        this.f71890d = (FrameLayout.LayoutParams) this.f71888b.getLayoutParams();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC15730b m98496e(ajw ajwVar) {
        ajwVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static ajw m98498g(Activity activity, InterfaceC15730b interfaceC15730b) {
        try {
            return new ajw(activity);
        } catch (Throwable th) {
            jzv.m147730c("MKAndroidBug5497Workaround", "", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private int m98499h() {
        Rect rect = new Rect();
        this.f71888b.getWindowVisibleDisplayFrame(rect);
        boolean zM98500i = m98500i(this.f71887a);
        int i = rect.bottom;
        return zM98500i ? (i - rect.top) + q4g0.m175215c(this.f71888b.getContext()) : i - rect.top;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m98500i(Window window) {
        if (window != null) {
            try {
                if (window.getDecorView() != null) {
                    boolean z = window.getStatusBarColor() == 0;
                    boolean z2 = (window.getDecorView().getSystemUiVisibility() & 1024) != 0;
                    if (z && z2) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m98501j() {
        int iM98499h = m98499h();
        if (iM98499h != this.f71889c) {
            int height = this.f71888b.getRootView().getHeight();
            int i = height - iM98499h;
            int i2 = height / 4;
            FrameLayout.LayoutParams layoutParams = this.f71890d;
            if (i > i2) {
                layoutParams.height = height - i;
            } else {
                layoutParams.height = this.f71891e;
            }
            this.f71888b.requestLayout();
            this.f71889c = iM98499h;
        }
    }
}
