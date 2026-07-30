package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.newpic.PicExchangeEditAct;
import com.p000p1.mobile.putong.core.p001ui.messages.newpic.PicExchangeLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.newpic.PicExchangePresenter;
import l.l6c0;
import l.s7m;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dd70 implements s7m<PicExchangePresenter> {

    /* JADX INFO: renamed from: a */
    public final PicExchangeEditAct f2942a;

    /* JADX INFO: renamed from: b */
    public PicExchangePresenter f2943b;

    /* JADX INFO: renamed from: c */
    public PicExchangeLayout f2944c;

    public dd70(PicExchangeEditAct picExchangeEditAct) {
        this.f2942a = picExchangeEditAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3525C0() {
        return this.f2942a;
    }

    /* JADX INFO: renamed from: a */
    public void m3526a() {
        PicExchangeLayout picExchangeLayout = this.f2944c;
        if (picExchangeLayout == null) {
            return;
        }
        picExchangeLayout.m2695p();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m3529i1(PicExchangePresenter picExchangePresenter) {
        this.f2943b = picExchangePresenter;
    }

    /* JADX INFO: renamed from: c */
    public void m3528c() {
        this.f2942a.getWindow().setStatusBarColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f2942a.setLightStatusBar(16);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PicExchangeLayout picExchangeLayout = (PicExchangeLayout) layoutInflater.inflate(l6c0.i4, viewGroup, false);
        this.f2944c = picExchangeLayout;
        return picExchangeLayout;
    }

    /* JADX INFO: renamed from: r */
    public void m3530r() {
        if (this.f2944c == null) {
            return;
        }
        m3528c();
        this.f2944c.m2698s(this);
        this.f2943b.m2733m0();
    }

    public void destroy() {
    }
}
