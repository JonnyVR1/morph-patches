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
public class bts implements s7m<yss> {

    /* JADX INFO: renamed from: a */
    public oss f77259a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f77260b;

    /* JADX INFO: renamed from: c */
    public yss f77261c;

    /* JADX INFO: renamed from: d */
    public boolean f77262d = false;

    /* JADX INFO: renamed from: e */
    public boolean f77263e = false;

    public bts(VDraweeView vDraweeView) {
        this.f77260b = vDraweeView;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m103885a(yss.InterfaceC21505b interfaceC21505b, View view) {
        interfaceC21505b.mo215953c();
        view.setSelected(false);
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
        return this.f77261c.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(yss yssVar) {
        this.f77261c = yssVar;
    }

    /* JADX INFO: renamed from: d */
    public void m103888d(boolean z) {
        if (!z || this.f77262d) {
            xdl0.m208344M(this.f77260b, false);
        } else {
            xdl0.m208344M(this.f77260b, this.f77263e);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m103889e() {
        oss ossVar = this.f77259a;
        if (ossVar != null) {
            ossVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m103890f(String str) {
        hxs.m133406s("context_square", this.f77260b, str);
    }

    /* JADX INFO: renamed from: i */
    public final void m103891i(final View view, List<d1q<?>> list, final yss.InterfaceC21505b interfaceC21505b) {
        oss ossVar = this.f77259a;
        if (ossVar != null && ossVar.isShowing()) {
            this.f77259a.dismiss();
            return;
        }
        oss ossVar2 = new oss(getAct(), list);
        this.f77259a = ossVar2;
        ossVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.ats
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                bts.m103885a(interfaceC21505b, view);
            }
        });
        view.setSelected(true);
        ed80.m115791c(this.f77259a, this.f77260b, 0, t100.f167256e, 80);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m103892j(boolean z) {
        boolean z2 = this.f77262d;
        VDraweeView vDraweeView = this.f77260b;
        if (z2) {
            xdl0.m208345M0(vDraweeView, false);
        } else {
            xdl0.m208345M0(vDraweeView, z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m103893k(String str) {
        w8u.m202211n(str, new e30() { // from class: l.zss
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204638a.m103890f((String) obj);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
