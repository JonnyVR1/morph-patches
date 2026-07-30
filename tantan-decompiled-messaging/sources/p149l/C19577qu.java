package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.account.AccountNewCropperAct;
import com.tantanapp.common.utils.NullChecker;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: l.qu */
/* JADX INFO: loaded from: classes9.dex */
public class C19577qu implements s7m<C19337pu> {

    /* JADX INFO: renamed from: a */
    public AccountNewCropperAct f156412a;

    public C19577qu(AccountNewCropperAct accountNewCropperAct) {
        this.f156412a = accountNewCropperAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f156412a;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f156412a;
    }

    /* JADX INFO: renamed from: b */
    public void m176492b(boolean z) {
        if (NullChecker.m81303a(this.f156412a.toolbar())) {
            this.f156412a.toolbar().setBackgroundResource(v2c0.f179433S1);
        }
        AccountNewCropperAct accountNewCropperAct = this.f156412a;
        if (z) {
            accountNewCropperAct.setGradientStatusBar();
        } else {
            accountNewCropperAct.setStatusBarColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m176493c() {
        this.f156412a.setTheme(o8c0.f142608b);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C19337pu c19337pu) {
    }
}
