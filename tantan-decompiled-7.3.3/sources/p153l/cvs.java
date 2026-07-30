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
public class cvs implements iam<zus> {

    /* JADX INFO: renamed from: a */
    public pus f84058a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f84059b;

    /* JADX INFO: renamed from: c */
    public zus f84060c;

    /* JADX INFO: renamed from: d */
    public boolean f84061d = false;

    /* JADX INFO: renamed from: e */
    public boolean f84062e = false;

    public cvs(VDraweeView vDraweeView) {
        this.f84059b = vDraweeView;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m112862a(zus.InterfaceC21902b interfaceC21902b, View view) {
        interfaceC21902b.mo221728c();
        view.setSelected(false);
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
        return this.f84060c.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zus zusVar) {
        this.f84060c = zusVar;
    }

    /* JADX INFO: renamed from: d */
    public void m112865d(boolean z) {
        if (!z || this.f84061d) {
            bnl0.m105524M(this.f84059b, false);
        } else {
            bnl0.m105524M(this.f84059b, this.f84062e);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m112866e() {
        pus pusVar = this.f84058a;
        if (pusVar != null) {
            pusVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m112867f(String str) {
        izs.m142868s("context_square", this.f84059b, str);
    }

    /* JADX INFO: renamed from: i */
    public final void m112868i(final View view, List<d3q<?>> list, final zus.InterfaceC21902b interfaceC21902b) {
        pus pusVar = this.f84058a;
        if (pusVar != null && pusVar.isShowing()) {
            this.f84058a.dismiss();
            return;
        }
        pus pusVar2 = new pus(getAct(), list);
        this.f84058a = pusVar2;
        pusVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.bvs
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                cvs.m112862a(interfaceC21902b, view);
            }
        });
        view.setSelected(true);
        kl80.m150358c(this.f84058a, this.f84059b, 0, qa00.f156318e, 80);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m112869j(boolean z) {
        boolean z2 = this.f84061d;
        VDraweeView vDraweeView = this.f84059b;
        if (z2) {
            bnl0.m105525M0(vDraweeView, false);
        } else {
            bnl0.m105525M0(vDraweeView, z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m112870k(String str) {
        xau.m209904n(str, new y20() { // from class: l.avs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73654a.m112867f((String) obj);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
