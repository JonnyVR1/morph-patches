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

/* JADX INFO: loaded from: classes4.dex */
public class hbt implements iam<ebt> {

    /* JADX INFO: renamed from: a */
    public ebt f108649a;

    /* JADX INFO: renamed from: b */
    public FloatView f108650b;

    /* JADX INFO: renamed from: c */
    public WindowManager f108651c;

    /* JADX INFO: renamed from: d */
    public boolean f108652d = false;

    /* JADX INFO: renamed from: c */
    private void m134428c() {
        WindowManager windowManager;
        FloatView floatView = this.f108650b;
        if (floatView == null || (windowManager = this.f108651c) == null || !this.f108652d) {
            return;
        }
        try {
            windowManager.removeViewImmediate(floatView);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        this.f108652d = false;
        this.f108651c = null;
        this.f108650b = null;
    }

    /* JADX INFO: renamed from: e */
    private void m134429e(Context context) {
        if (this.f108650b != null) {
            return;
        }
        FloatView floatView = (FloatView) View.inflate(context, yec0.f199044d1, null);
        this.f108650b = floatView;
        floatView.m76632g(this.f108649a.m120239s());
        this.f108650b.setUpdateWindowAction(new y20() { // from class: l.gbt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103490a.m134436l((WindowManager.LayoutParams) obj);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ebt ebtVar) {
        this.f108649a = ebtVar;
    }

    /* JADX INFO: renamed from: d */
    public FloatView m134431d() {
        return this.f108650b;
    }

    @Override // p153l.iam
    public void destroy() {
        m134428c();
    }

    /* JADX INFO: renamed from: f */
    public boolean m134432f() {
        return this.f108650b != null;
    }

    /* JADX INFO: renamed from: i */
    public void m134433i() {
        this.f108650b.m76630e(this.f108649a.m120235o());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m134434j() {
        boolean z = true;
        if (this.f108652d) {
            return true;
        }
        try {
            Application application = zrv.f205803e;
            m134429e(application);
            WindowManager windowManager = (WindowManager) application.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
            this.f108651c = windowManager;
            FloatView floatView = this.f108650b;
            windowManager.addView(floatView, floatView.getWindowParams());
            try {
                this.f108652d = true;
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
    public void m134435k(int i, int i2) {
        FloatView floatView = this.f108650b;
        if (floatView == null) {
            return;
        }
        WindowManager.LayoutParams windowParams = floatView.getWindowParams();
        windowParams.width = i;
        windowParams.height = i2;
        m134436l(windowParams);
        this.f108650b.m76640s(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public final void m134436l(WindowManager.LayoutParams layoutParams) {
        WindowManager windowManager;
        try {
            FloatView floatView = this.f108650b;
            if (floatView != null && (windowManager = this.f108651c) != null && this.f108652d) {
                windowManager.updateViewLayout(floatView, layoutParams);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }
}
