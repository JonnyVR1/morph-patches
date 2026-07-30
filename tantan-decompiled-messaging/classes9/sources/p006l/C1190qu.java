package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.account.AccountNewCropperAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.s7m;

/* JADX INFO: renamed from: l.qu */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1190qu implements s7m<C1150pu> {

    /* JADX INFO: renamed from: a */
    public AccountNewCropperAct f20060a;

    public C1190qu(AccountNewCropperAct accountNewCropperAct) {
        this.f20060a = accountNewCropperAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22378C0() {
        return this.f20060a;
    }

    @Nullable
    public Act act() {
        return this.f20060a;
    }

    /* JADX INFO: renamed from: b */
    public void m22380b(boolean z) {
        if (NullChecker.a(this.f20060a.toolbar())) {
            this.f20060a.toolbar().setBackgroundResource(v2c0.f23997S1);
        }
        AccountNewCropperAct accountNewCropperAct = this.f20060a;
        if (z) {
            accountNewCropperAct.setGradientStatusBar();
        } else {
            accountNewCropperAct.setStatusBarColor(-16777216);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m22381c() {
        this.f20060a.setTheme(o8c0.f18071b);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m22382i1(C1150pu c1150pu) {
    }
}
