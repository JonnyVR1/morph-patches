package p002l;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.other.floatwindow.FloatView;
import com.tantanapp.common.utils.CrashHelper;
import l.e30;
import l.s7m;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bri implements s7m<yqi> {

    /* JADX INFO: renamed from: a */
    public yqi f8315a;

    /* JADX INFO: renamed from: b */
    public FloatView f8316b;

    /* JADX INFO: renamed from: c */
    public WindowManager f8317c;

    /* JADX INFO: renamed from: d */
    public boolean f8318d = false;

    /* JADX INFO: renamed from: e */
    private void m10560e(Context context) {
        if (this.f8316b != null) {
            return;
        }
        FloatView floatView = (FloatView) View.inflate(context, t6c0.f19808d1, null);
        this.f8316b = floatView;
        floatView.m9082g(this.f8315a.m26905s());
        this.f8316b.setUpdateWindowAction(new e30() { // from class: l.ari
            public final void call(Object obj) {
                this.f7870a.m10561l((WindowManager.LayoutParams) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m10561l(WindowManager.LayoutParams layoutParams) {
        WindowManager windowManager;
        try {
            FloatView floatView = this.f8316b;
            if (floatView != null && (windowManager = this.f8317c) != null && this.f8318d) {
                windowManager.updateViewLayout(floatView, layoutParams);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10562C0() {
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m10568i1(yqi yqiVar) {
        this.f8315a = yqiVar;
    }

    /* JADX INFO: renamed from: c */
    public void m10564c() {
        WindowManager windowManager;
        FloatView floatView = this.f8316b;
        if (floatView == null || (windowManager = this.f8317c) == null || !this.f8318d) {
            return;
        }
        try {
            windowManager.removeViewImmediate(floatView);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        this.f8318d = false;
    }

    /* JADX INFO: renamed from: d */
    public FloatView m10565d() {
        return this.f8316b;
    }

    public void destroy() {
        m10564c();
        this.f8317c = null;
        this.f8316b = null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m10566f() {
        return this.f8316b != null;
    }

    /* JADX INFO: renamed from: i */
    public void m10567i() {
        this.f8316b.m9080e(this.f8315a.m26903o());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m10569j() {
        boolean z = true;
        if (this.f8318d) {
            return true;
        }
        try {
            Application application = ypv.e;
            m10560e(application);
            WindowManager windowManager = (WindowManager) application.getSystemService("window");
            this.f8317c = windowManager;
            FloatView floatView = this.f8316b;
            windowManager.addView(floatView, floatView.getWindowParams());
            try {
                this.f8318d = true;
                return true;
            } catch (Exception e) {
                e = e;
                CrashHelper.c(e);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m10570k(int i, int i2) {
        FloatView floatView = this.f8316b;
        if (floatView == null) {
            return;
        }
        WindowManager.LayoutParams windowParams = floatView.getWindowParams();
        windowParams.width = i;
        windowParams.height = i2;
        m10561l(windowParams);
        this.f8316b.m9090s(i, i2);
    }
}
