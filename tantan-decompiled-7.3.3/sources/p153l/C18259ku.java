package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.account.AccountNewCropperAct;
import com.tantanapp.common.utils.NullChecker;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: l.ku */
/* JADX INFO: loaded from: classes9.dex */
public class C18259ku implements iam<C18040ju> {

    /* JADX INFO: renamed from: a */
    public AccountNewCropperAct f128775a;

    public C18259ku(AccountNewCropperAct accountNewCropperAct) {
        this.f128775a = accountNewCropperAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f128775a;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f128775a;
    }

    /* JADX INFO: renamed from: b */
    public void m151412b(boolean z) {
        if (NullChecker.m82486a(this.f128775a.toolbar())) {
            this.f128775a.toolbar().setBackgroundResource(bbc0.f75839S1);
        }
        AccountNewCropperAct accountNewCropperAct = this.f128775a;
        if (z) {
            accountNewCropperAct.setGradientStatusBar();
        } else {
            accountNewCropperAct.setStatusBarColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m151413c() {
        this.f128775a.setTheme(yfc0.f199489b);
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
    public void mo22064i1(C18040ju c18040ju) {
    }
}
