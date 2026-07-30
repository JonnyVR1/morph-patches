package p153l;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.livingroom.other.floatwindow.FloatView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes5.dex */
public class xti implements iam<uti> {

    /* JADX INFO: renamed from: a */
    public uti f196217a;

    /* JADX INFO: renamed from: b */
    public FloatView f196218b;

    /* JADX INFO: renamed from: c */
    public WindowManager f196219c;

    /* JADX INFO: renamed from: d */
    public boolean f196220d = false;

    /* JADX INFO: renamed from: e */
    private void m213088e(Context context) {
        if (this.f196218b != null) {
            return;
        }
        FloatView floatView = (FloatView) View.inflate(context, yec0.f199044d1, null);
        this.f196218b = floatView;
        floatView.m76632g(this.f196217a.m198057s());
        this.f196218b.setUpdateWindowAction(new y20() { // from class: l.wti
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190784a.m213089l((WindowManager.LayoutParams) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m213089l(WindowManager.LayoutParams layoutParams) {
        WindowManager windowManager;
        try {
            FloatView floatView = this.f196218b;
            if (floatView != null && (windowManager = this.f196219c) != null && this.f196220d) {
                windowManager.updateViewLayout(floatView, layoutParams);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(uti utiVar) {
        this.f196217a = utiVar;
    }

    /* JADX INFO: renamed from: c */
    public void m213091c() {
        WindowManager windowManager;
        FloatView floatView = this.f196218b;
        if (floatView == null || (windowManager = this.f196219c) == null || !this.f196220d) {
            return;
        }
        try {
            windowManager.removeViewImmediate(floatView);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        this.f196220d = false;
    }

    /* JADX INFO: renamed from: d */
    public FloatView m213092d() {
        return this.f196218b;
    }

    @Override // p153l.iam
    public void destroy() {
        m213091c();
        this.f196219c = null;
        this.f196218b = null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m213093f() {
        return this.f196218b != null;
    }

    /* JADX INFO: renamed from: i */
    public void m213094i() {
        this.f196218b.m76630e(this.f196217a.m198055o());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m213095j() {
        boolean z = true;
        if (this.f196220d) {
            return true;
        }
        try {
            Application application = zrv.f205803e;
            m213088e(application);
            WindowManager windowManager = (WindowManager) application.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
            this.f196219c = windowManager;
            FloatView floatView = this.f196218b;
            windowManager.addView(floatView, floatView.getWindowParams());
            try {
                this.f196220d = true;
                return true;
            } catch (Exception e) {
                e = e;
                CrashHelper.m82479c(e);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m213096k(int i, int i2) {
        FloatView floatView = this.f196218b;
        if (floatView == null) {
            return;
        }
        WindowManager.LayoutParams windowParams = floatView.getWindowParams();
        windowParams.width = i;
        windowParams.height = i2;
        m213089l(windowParams);
        this.f196218b.m76640s(i, i2);
    }
}
