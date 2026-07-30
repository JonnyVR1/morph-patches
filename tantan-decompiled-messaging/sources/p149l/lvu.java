package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class lvu implements s7m<ivu> {

    /* JADX INFO: renamed from: a */
    public oss f130198a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f130199b;

    /* JADX INFO: renamed from: c */
    public ivu f130200c;

    /* JADX INFO: renamed from: d */
    public boolean f130201d = false;

    /* JADX INFO: renamed from: e */
    public boolean f130202e = false;

    public lvu(VDraweeView vDraweeView) {
        this.f130199b = vDraweeView;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m151908b(ivu.InterfaceC17629b interfaceC17629b, View view) {
        interfaceC17629b.mo138665c();
        view.setSelected(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m151909f(String str) {
        hxs.m133406s("context_square", this.f130199b, str);
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
        return this.f130200c.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ivu ivuVar) {
        this.f130200c = ivuVar;
    }

    /* JADX INFO: renamed from: d */
    public void m151911d(boolean z) {
        if (!z || this.f130201d) {
            xdl0.m208344M(this.f130199b, false);
        } else {
            xdl0.m208344M(this.f130199b, this.f130202e);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m151912e() {
        oss ossVar = this.f130198a;
        if (ossVar != null) {
            ossVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m151913i(final View view, List<d1q<?>> list, final ivu.InterfaceC17629b interfaceC17629b) {
        oss ossVar = this.f130198a;
        if (ossVar != null && ossVar.isShowing()) {
            this.f130198a.dismiss();
            return;
        }
        oss ossVar2 = new oss(getAct(), list);
        this.f130198a = ossVar2;
        ossVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.kvu
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                lvu.m151908b(interfaceC17629b, view);
            }
        });
        view.setSelected(true);
        ed80.m115791c(this.f130198a, this.f130199b, 0, t100.f167256e, 80);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m151914j(boolean z) {
        boolean z2 = this.f130201d;
        VDraweeView vDraweeView = this.f130199b;
        if (z2) {
            xdl0.m208345M0(vDraweeView, false);
        } else {
            xdl0.m208345M0(vDraweeView, z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m151915k(String str) {
        w8u.m202211n(str, new e30() { // from class: l.jvu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119989a.m151909f((String) obj);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
