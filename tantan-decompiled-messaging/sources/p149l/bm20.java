package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.tantanapp.common.utils.NullChecker;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class bm20 implements s7m<am20> {

    /* JADX INFO: renamed from: a */
    public NewCropperAct f76231a;

    public bm20(NewCropperAct newCropperAct) {
        this.f76231a = newCropperAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76231a;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f76231a;
    }

    /* JADX INFO: renamed from: b */
    public void m102570b(boolean z) {
        boolean zM81303a = NullChecker.m81303a(CoreModule.f17545c);
        NewCropperAct newCropperAct = this.f76231a;
        if (zM81303a) {
            if (NullChecker.m81303a(newCropperAct.toolbar())) {
                this.f76231a.toolbar().setBackgroundColor(this.f76231a.color(w0c0.f183831b));
            }
            if (z) {
                NewCropperAct newCropperAct2 = this.f76231a;
                newCropperAct2.setStatusBarColor(newCropperAct2.color(w0c0.f183831b));
                return;
            }
            return;
        }
        if (NullChecker.m81303a(newCropperAct.toolbar())) {
            this.f76231a.toolbar().setBackgroundResource(x2c0.f189375Gt);
        }
        NewCropperAct newCropperAct3 = this.f76231a;
        if (z) {
            newCropperAct3.setGradientStatusBar();
        } else {
            newCropperAct3.setStatusBarColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m102571c() {
        this.f76231a.setTheme(v7c0.f180375v);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(am20 am20Var) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
