package p149l;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.livingroom.other.floatwindow.FloatView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public class g9t implements s7m<d9t> {

    /* JADX INFO: renamed from: a */
    public d9t f101589a;

    /* JADX INFO: renamed from: b */
    public FloatView f101590b;

    /* JADX INFO: renamed from: c */
    public WindowManager f101591c;

    /* JADX INFO: renamed from: d */
    public boolean f101592d = false;

    /* JADX INFO: renamed from: c */
    private void m124841c() {
        WindowManager windowManager;
        FloatView floatView = this.f101590b;
        if (floatView == null || (windowManager = this.f101591c) == null || !this.f101592d) {
            return;
        }
        try {
            windowManager.removeViewImmediate(floatView);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        this.f101592d = false;
        this.f101591c = null;
        this.f101590b = null;
    }

    /* JADX INFO: renamed from: e */
    private void m124842e(Context context) {
        if (this.f101590b != null) {
            return;
        }
        FloatView floatView = (FloatView) View.inflate(context, t6c0.f168312d1, null);
        this.f101590b = floatView;
        floatView.m75449g(this.f101589a.m110485s());
        this.f101590b.setUpdateWindowAction(new e30() { // from class: l.f9t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96521a.m124849l((WindowManager.LayoutParams) obj);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(d9t d9tVar) {
        this.f101589a = d9tVar;
    }

    /* JADX INFO: renamed from: d */
    public FloatView m124844d() {
        return this.f101590b;
    }

    @Override // p149l.s7m
    public void destroy() {
        m124841c();
    }

    /* JADX INFO: renamed from: f */
    public boolean m124845f() {
        return this.f101590b != null;
    }

    /* JADX INFO: renamed from: i */
    public void m124846i() {
        this.f101590b.m75447e(this.f101589a.m110481o());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m124847j() {
        boolean z = true;
        if (this.f101592d) {
            return true;
        }
        try {
            Application application = ypv.f199497e;
            m124842e(application);
            WindowManager windowManager = (WindowManager) application.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
            this.f101591c = windowManager;
            FloatView floatView = this.f101590b;
            windowManager.addView(floatView, floatView.getWindowParams());
            try {
                this.f101592d = true;
                return true;
            } catch (Exception e) {
                e = e;
                CrashHelper.m81296c(e);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m124848k(int i, int i2) {
        FloatView floatView = this.f101590b;
        if (floatView == null) {
            return;
        }
        WindowManager.LayoutParams windowParams = floatView.getWindowParams();
        windowParams.width = i;
        windowParams.height = i2;
        m124849l(windowParams);
        this.f101590b.m75457s(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public final void m124849l(WindowManager.LayoutParams layoutParams) {
        WindowManager windowManager;
        try {
            FloatView floatView = this.f101590b;
            if (floatView != null && (windowManager = this.f101591c) != null && this.f101592d) {
                windowManager.updateViewLayout(floatView, layoutParams);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }
}
