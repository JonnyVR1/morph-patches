package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.s7m;
import l.v7c0;
import l.w0c0;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bm20 implements s7m<am20> {

    /* JADX INFO: renamed from: a */
    public NewCropperAct f10170a;

    public bm20(NewCropperAct newCropperAct) {
        this.f10170a = newCropperAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12104C0() {
        return this.f10170a;
    }

    @Nullable
    public Act act() {
        return this.f10170a;
    }

    /* JADX INFO: renamed from: b */
    public void m12106b(boolean z) {
        boolean zA = NullChecker.a(CoreModule.c);
        NewCropperAct newCropperAct = this.f10170a;
        if (zA) {
            if (NullChecker.a(newCropperAct.toolbar())) {
                this.f10170a.toolbar().setBackgroundColor(this.f10170a.color(w0c0.b));
            }
            if (z) {
                NewCropperAct newCropperAct2 = this.f10170a;
                newCropperAct2.setStatusBarColor(newCropperAct2.color(w0c0.b));
                return;
            }
            return;
        }
        if (NullChecker.a(newCropperAct.toolbar())) {
            this.f10170a.toolbar().setBackgroundResource(x2c0.Gt);
        }
        NewCropperAct newCropperAct3 = this.f10170a;
        if (z) {
            newCropperAct3.setGradientStatusBar();
        } else {
            newCropperAct3.setStatusBarColor(-16777216);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m12107c() {
        this.f10170a.setTheme(v7c0.v);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m12108i1(am20 am20Var) {
    }

    public void destroy() {
    }
}
