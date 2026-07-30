package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.messages.newpic.PicExchangeEditAct;
import com.p051p1.mobile.putong.core.p058ui.messages.newpic.PicExchangeLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.newpic.PicExchangePresenter;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class jl70 implements iam<PicExchangePresenter> {

    /* JADX INFO: renamed from: a */
    public final PicExchangeEditAct f121481a;

    /* JADX INFO: renamed from: b */
    public PicExchangePresenter f121482b;

    /* JADX INFO: renamed from: c */
    public PicExchangeLayout f121483c;

    public jl70(PicExchangeEditAct picExchangeEditAct) {
        this.f121481a = picExchangeEditAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f121481a;
    }

    /* JADX INFO: renamed from: a */
    public void m145949a() {
        PicExchangeLayout picExchangeLayout = this.f121483c;
        if (picExchangeLayout == null) {
            return;
        }
        picExchangeLayout.m50729p();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(PicExchangePresenter picExchangePresenter) {
        this.f121482b = picExchangePresenter;
    }

    /* JADX INFO: renamed from: c */
    public void m145951c() {
        this.f121481a.getWindow().setStatusBarColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f121481a.setLightStatusBar(16);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PicExchangeLayout picExchangeLayout = (PicExchangeLayout) layoutInflater.inflate(qec0.f157048i4, viewGroup, false);
        this.f121483c = picExchangeLayout;
        return picExchangeLayout;
    }

    /* JADX INFO: renamed from: r */
    public void m145952r() {
        if (this.f121483c == null) {
            return;
        }
        m145951c();
        this.f121483c.m50732s(this);
        this.f121482b.m50766m0();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
