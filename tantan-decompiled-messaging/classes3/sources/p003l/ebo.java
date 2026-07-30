package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.map.intl.IntlMapPreviewBaseAct;
import com.p1.mobile.putong.data.MessageLocation;
import l.fbo;
import l.s7m;
import l.xdl0;
import p028v.VFrame;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ebo implements s7m<bbo> {

    /* JADX INFO: renamed from: a */
    public VFrame f3241a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f3242b;

    /* JADX INFO: renamed from: c */
    public VText f3243c;

    /* JADX INFO: renamed from: d */
    public IntlMapPreviewBaseAct f3244d;

    /* JADX INFO: renamed from: e */
    public bbo f3245e;

    public ebo(IntlMapPreviewBaseAct intlMapPreviewBaseAct) {
        this.f3244d = intlMapPreviewBaseAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3811C0() {
        return this.f3244d;
    }

    /* JADX INFO: renamed from: c */
    public View m3812c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fbo.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public IntlMapPreviewBaseAct act() {
        return this.f3244d;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m3817i1(bbo bboVar) {
        this.f3245e = bboVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m3815f(e30 e30Var) {
        e30Var.call(this.f3242b);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m3816i(final e30 e30Var) {
        xdl0.p0(this.f3242b);
        act().post(new Runnable() { // from class: l.dbo
            @Override // java.lang.Runnable
            public final void run() {
                this.f2932a.m3815f(e30Var);
            }
        });
        return Boolean.FALSE;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3812c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m3818j(MessageLocation messageLocation, final e30<View> e30Var) {
        this.f3243c.setText(messageLocation.name);
        this.f3243c.invalidate();
        this.f3243c.buildDrawingCache();
        xdl0.b0(this.f3242b, new v9j() { // from class: l.cbo
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f2610a.m3816i(e30Var);
            }
        });
    }

    public void destroy() {
    }
}
