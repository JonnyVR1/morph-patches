package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu.IntlLiveHomeMenuPresenter;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class txn implements iam<IntlLiveHomeMenuPresenter> {

    /* JADX INFO: renamed from: a */
    public fxn f176583a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f176584b;

    /* JADX INFO: renamed from: c */
    public IntlLiveHomeMenuPresenter f176585c;

    public txn(VDraweeView vDraweeView) {
        this.f176584b = vDraweeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m193518e(String str) {
        izs.m142868s("context_square", this.f176584b, str);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f176585c.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(IntlLiveHomeMenuPresenter intlLiveHomeMenuPresenter) {
        this.f176585c = intlLiveHomeMenuPresenter;
    }

    /* JADX INFO: renamed from: d */
    public void m193520d() {
        fxn fxnVar = this.f176583a;
        if (fxnVar != null) {
            fxnVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m193521f(final View view, List<d3q<?>> list) {
        fxn fxnVar = this.f176583a;
        if (fxnVar != null && fxnVar.isShowing()) {
            this.f176583a.dismiss();
            return;
        }
        fxn fxnVar2 = new fxn(getAct(), list);
        this.f176583a = fxnVar2;
        fxnVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.sxn
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                view.setSelected(false);
            }
        });
        view.setSelected(true);
        kl80.m150358c(this.f176583a, this.f176584b, 0, qa00.f156318e, 80);
    }

    /* JADX INFO: renamed from: i */
    public void m193522i(boolean z) {
        bnl0.m105525M0(this.f176584b, z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m193523j(String str) {
        xau.m209904n(str, new y20() { // from class: l.rxn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165360a.m193518e((String) obj);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
