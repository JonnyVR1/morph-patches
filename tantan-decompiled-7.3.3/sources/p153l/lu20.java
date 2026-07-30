package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.tantanapp.common.utils.NullChecker;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class lu20 implements iam<ku20> {

    /* JADX INFO: renamed from: a */
    public NewCropperAct f133591a;

    public lu20(NewCropperAct newCropperAct) {
        this.f133591a = newCropperAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f133591a;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f133591a;
    }

    /* JADX INFO: renamed from: b */
    public void m155843b(boolean z) {
        boolean zM82486a = NullChecker.m82486a(CoreModule.f18264c);
        NewCropperAct newCropperAct = this.f133591a;
        if (zM82486a) {
            if (NullChecker.m82486a(newCropperAct.toolbar())) {
                this.f133591a.toolbar().setBackgroundColor(this.f133591a.color(c9c0.f80400b));
            }
            if (z) {
                NewCropperAct newCropperAct2 = this.f133591a;
                newCropperAct2.setStatusBarColor(newCropperAct2.color(c9c0.f80400b));
                return;
            }
            return;
        }
        if (NullChecker.m82486a(newCropperAct.toolbar())) {
            this.f133591a.toolbar().setBackgroundResource(dbc0.f87496uu);
        }
        NewCropperAct newCropperAct3 = this.f133591a;
        if (z) {
            newCropperAct3.setGradientStatusBar();
        } else {
            newCropperAct3.setStatusBarColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m155844c() {
        this.f133591a.setTheme(agc0.f71136v);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ku20 ku20Var) {
    }
}
