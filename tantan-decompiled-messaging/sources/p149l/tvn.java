package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.intl.livesquare.home.submodule.menu.IntlLiveHomeMenuPresenter;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class tvn implements s7m<IntlLiveHomeMenuPresenter> {

    /* JADX INFO: renamed from: a */
    public fvn f172327a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f172328b;

    /* JADX INFO: renamed from: c */
    public IntlLiveHomeMenuPresenter f172329c;

    public tvn(VDraweeView vDraweeView) {
        this.f172328b = vDraweeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m190762e(String str) {
        hxs.m133406s("context_square", this.f172328b, str);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f172329c.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(IntlLiveHomeMenuPresenter intlLiveHomeMenuPresenter) {
        this.f172329c = intlLiveHomeMenuPresenter;
    }

    /* JADX INFO: renamed from: d */
    public void m190764d() {
        fvn fvnVar = this.f172327a;
        if (fvnVar != null) {
            fvnVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m190765f(final View view, List<d1q<?>> list) {
        fvn fvnVar = this.f172327a;
        if (fvnVar != null && fvnVar.isShowing()) {
            this.f172327a.dismiss();
            return;
        }
        fvn fvnVar2 = new fvn(getAct(), list);
        this.f172327a = fvnVar2;
        fvnVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.svn
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                view.setSelected(false);
            }
        });
        view.setSelected(true);
        ed80.m115791c(this.f172327a, this.f172328b, 0, t100.f167256e, 80);
    }

    /* JADX INFO: renamed from: i */
    public void m190766i(boolean z) {
        xdl0.m208345M0(this.f172328b, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m190767j(String str) {
        w8u.m202211n(str, new e30() { // from class: l.rvn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161234a.m190762e((String) obj);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
