package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.messages.newpic.PicExchangeEditAct;
import com.p046p1.mobile.putong.core.p053ui.messages.newpic.PicExchangeLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.newpic.PicExchangePresenter;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class dd70 implements s7m<PicExchangePresenter> {

    /* JADX INFO: renamed from: a */
    public final PicExchangeEditAct f85533a;

    /* JADX INFO: renamed from: b */
    public PicExchangePresenter f85534b;

    /* JADX INFO: renamed from: c */
    public PicExchangeLayout f85535c;

    public dd70(PicExchangeEditAct picExchangeEditAct) {
        this.f85533a = picExchangeEditAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f85533a;
    }

    /* JADX INFO: renamed from: a */
    public void m110893a() {
        PicExchangeLayout picExchangeLayout = this.f85535c;
        if (picExchangeLayout == null) {
            return;
        }
        picExchangeLayout.m49546p();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(PicExchangePresenter picExchangePresenter) {
        this.f85534b = picExchangePresenter;
    }

    /* JADX INFO: renamed from: c */
    public void m110895c() {
        this.f85533a.getWindow().setStatusBarColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f85533a.setLightStatusBar(16);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PicExchangeLayout picExchangeLayout = (PicExchangeLayout) layoutInflater.inflate(l6c0.f126492i4, viewGroup, false);
        this.f85535c = picExchangeLayout;
        return picExchangeLayout;
    }

    /* JADX INFO: renamed from: r */
    public void m110896r() {
        if (this.f85535c == null) {
            return;
        }
        m110895c();
        this.f85535c.m49549s(this);
        this.f85534b.m49583m0();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
