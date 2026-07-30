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
public class bri implements s7m<yqi> {

    /* JADX INFO: renamed from: a */
    public yqi f76903a;

    /* JADX INFO: renamed from: b */
    public FloatView f76904b;

    /* JADX INFO: renamed from: c */
    public WindowManager f76905c;

    /* JADX INFO: renamed from: d */
    public boolean f76906d = false;

    /* JADX INFO: renamed from: e */
    private void m103540e(Context context) {
        if (this.f76904b != null) {
            return;
        }
        FloatView floatView = (FloatView) View.inflate(context, t6c0.f168312d1, null);
        this.f76904b = floatView;
        floatView.m75449g(this.f76903a.m215740s());
        this.f76904b.setUpdateWindowAction(new e30() { // from class: l.ari
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71272a.m103541l((WindowManager.LayoutParams) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m103541l(WindowManager.LayoutParams layoutParams) {
        WindowManager windowManager;
        try {
            FloatView floatView = this.f76904b;
            if (floatView != null && (windowManager = this.f76905c) != null && this.f76906d) {
                windowManager.updateViewLayout(floatView, layoutParams);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(yqi yqiVar) {
        this.f76903a = yqiVar;
    }

    /* JADX INFO: renamed from: c */
    public void m103543c() {
        WindowManager windowManager;
        FloatView floatView = this.f76904b;
        if (floatView == null || (windowManager = this.f76905c) == null || !this.f76906d) {
            return;
        }
        try {
            windowManager.removeViewImmediate(floatView);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        this.f76906d = false;
    }

    /* JADX INFO: renamed from: d */
    public FloatView m103544d() {
        return this.f76904b;
    }

    @Override // p149l.s7m
    public void destroy() {
        m103543c();
        this.f76905c = null;
        this.f76904b = null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m103545f() {
        return this.f76904b != null;
    }

    /* JADX INFO: renamed from: i */
    public void m103546i() {
        this.f76904b.m75447e(this.f76903a.m215738o());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m103547j() {
        boolean z = true;
        if (this.f76906d) {
            return true;
        }
        try {
            Application application = ypv.f199497e;
            m103540e(application);
            WindowManager windowManager = (WindowManager) application.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
            this.f76905c = windowManager;
            FloatView floatView = this.f76904b;
            windowManager.addView(floatView, floatView.getWindowParams());
            try {
                this.f76906d = true;
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
    public void m103548k(int i, int i2) {
        FloatView floatView = this.f76904b;
        if (floatView == null) {
            return;
        }
        WindowManager.LayoutParams windowParams = floatView.getWindowParams();
        windowParams.width = i;
        windowParams.height = i2;
        m103541l(windowParams);
        this.f76904b.m75457s(i, i2);
    }
}
