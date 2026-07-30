package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class mxu implements iam<jxu> {

    /* JADX INFO: renamed from: a */
    public pus f139285a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f139286b;

    /* JADX INFO: renamed from: c */
    public jxu f139287c;

    /* JADX INFO: renamed from: d */
    public boolean f139288d = false;

    /* JADX INFO: renamed from: e */
    public boolean f139289e = false;

    public mxu(VDraweeView vDraweeView) {
        this.f139286b = vDraweeView;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m160698b(jxu.InterfaceC18055b interfaceC18055b, View view) {
        interfaceC18055b.mo147426c();
        view.setSelected(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m160699f(String str) {
        izs.m142868s("context_square", this.f139286b, str);
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
        return this.f139287c.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(jxu jxuVar) {
        this.f139287c = jxuVar;
    }

    /* JADX INFO: renamed from: d */
    public void m160701d(boolean z) {
        if (!z || this.f139288d) {
            bnl0.m105524M(this.f139286b, false);
        } else {
            bnl0.m105524M(this.f139286b, this.f139289e);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m160702e() {
        pus pusVar = this.f139285a;
        if (pusVar != null) {
            pusVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m160703i(final View view, List<d3q<?>> list, final jxu.InterfaceC18055b interfaceC18055b) {
        pus pusVar = this.f139285a;
        if (pusVar != null && pusVar.isShowing()) {
            this.f139285a.dismiss();
            return;
        }
        pus pusVar2 = new pus(getAct(), list);
        this.f139285a = pusVar2;
        pusVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.lxu
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                mxu.m160698b(interfaceC18055b, view);
            }
        });
        view.setSelected(true);
        kl80.m150358c(this.f139285a, this.f139286b, 0, qa00.f156318e, 80);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m160704j(boolean z) {
        boolean z2 = this.f139288d;
        VDraweeView vDraweeView = this.f139286b;
        if (z2) {
            bnl0.m105525M0(vDraweeView, false);
        } else {
            bnl0.m105525M0(vDraweeView, z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m160705k(String str) {
        xau.m209904n(str, new y20() { // from class: l.kxu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129247a.m160699f((String) obj);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
