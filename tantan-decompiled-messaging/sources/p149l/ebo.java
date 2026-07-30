package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapPreviewBaseAct;
import com.p046p1.mobile.putong.data.MessageLocation;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ebo implements s7m<bbo> {

    /* JADX INFO: renamed from: a */
    public VFrame f90365a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f90366b;

    /* JADX INFO: renamed from: c */
    public VText f90367c;

    /* JADX INFO: renamed from: d */
    public IntlMapPreviewBaseAct f90368d;

    /* JADX INFO: renamed from: e */
    public bbo f90369e;

    public ebo(IntlMapPreviewBaseAct intlMapPreviewBaseAct) {
        this.f90368d = intlMapPreviewBaseAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f90368d;
    }

    /* JADX INFO: renamed from: c */
    public View m115510c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fbo.m120384b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public IntlMapPreviewBaseAct act() {
        return this.f90368d;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bbo bboVar) {
        this.f90369e = bboVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m115513f(e30 e30Var) {
        e30Var.call(this.f90366b);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m115514i(final e30 e30Var) {
        xdl0.m208394p0(this.f90366b);
        act().post(new Runnable() { // from class: l.dbo
            @Override // java.lang.Runnable
            public final void run() {
                this.f85330a.m115513f(e30Var);
            }
        });
        return Boolean.FALSE;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m115510c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m115515j(MessageLocation messageLocation, final e30<View> e30Var) {
        this.f90367c.setText(messageLocation.name);
        this.f90367c.invalidate();
        this.f90367c.buildDrawingCache();
        xdl0.m208366b0(this.f90366b, new v9j() { // from class: l.cbo
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f80173a.m115514i(e30Var);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
