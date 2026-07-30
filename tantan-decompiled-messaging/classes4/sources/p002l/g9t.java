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
public class g9t implements s7m<d9t> {

    /* JADX INFO: renamed from: a */
    public d9t f11311a;

    /* JADX INFO: renamed from: b */
    public FloatView f11312b;

    /* JADX INFO: renamed from: c */
    public WindowManager f11313c;

    /* JADX INFO: renamed from: d */
    public boolean f11314d = false;

    /* JADX INFO: renamed from: c */
    private void m13661c() {
        WindowManager windowManager;
        FloatView floatView = this.f11312b;
        if (floatView == null || (windowManager = this.f11313c) == null || !this.f11314d) {
            return;
        }
        try {
            windowManager.removeViewImmediate(floatView);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        this.f11314d = false;
        this.f11313c = null;
        this.f11312b = null;
    }

    /* JADX INFO: renamed from: e */
    private void m13662e(Context context) {
        if (this.f11312b != null) {
            return;
        }
        FloatView floatView = (FloatView) View.inflate(context, t6c0.f19808d1, null);
        this.f11312b = floatView;
        floatView.m9082g(this.f11311a.m11686s());
        this.f11312b.setUpdateWindowAction(new e30() { // from class: l.f9t
            public final void call(Object obj) {
                this.f10199a.m13671l((WindowManager.LayoutParams) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13663C0() {
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m13668i1(d9t d9tVar) {
        this.f11311a = d9tVar;
    }

    /* JADX INFO: renamed from: d */
    public FloatView m13665d() {
        return this.f11312b;
    }

    public void destroy() {
        m13661c();
    }

    /* JADX INFO: renamed from: f */
    public boolean m13666f() {
        return this.f11312b != null;
    }

    /* JADX INFO: renamed from: i */
    public void m13667i() {
        this.f11312b.m9080e(this.f11311a.m11682o());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m13669j() {
        boolean z = true;
        if (this.f11314d) {
            return true;
        }
        try {
            Application application = ypv.e;
            m13662e(application);
            WindowManager windowManager = (WindowManager) application.getSystemService("window");
            this.f11313c = windowManager;
            FloatView floatView = this.f11312b;
            windowManager.addView(floatView, floatView.getWindowParams());
            try {
                this.f11314d = true;
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
    public void m13670k(int i, int i2) {
        FloatView floatView = this.f11312b;
        if (floatView == null) {
            return;
        }
        WindowManager.LayoutParams windowParams = floatView.getWindowParams();
        windowParams.width = i;
        windowParams.height = i2;
        m13671l(windowParams);
        this.f11312b.m9090s(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public final void m13671l(WindowManager.LayoutParams layoutParams) {
        WindowManager windowManager;
        try {
            FloatView floatView = this.f11312b;
            if (floatView != null && (windowManager = this.f11313c) != null && this.f11314d) {
                windowManager.updateViewLayout(floatView, layoutParams);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }
}
