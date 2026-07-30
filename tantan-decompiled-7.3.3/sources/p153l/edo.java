package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapPreviewBaseAct;
import com.p051p1.mobile.putong.data.MessageLocation;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class edo implements iam<bdo> {

    /* JADX INFO: renamed from: a */
    public VFrame f93560a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f93561b;

    /* JADX INFO: renamed from: c */
    public VText f93562c;

    /* JADX INFO: renamed from: d */
    public IntlMapPreviewBaseAct f93563d;

    /* JADX INFO: renamed from: e */
    public bdo f93564e;

    public edo(IntlMapPreviewBaseAct intlMapPreviewBaseAct) {
        this.f93563d = intlMapPreviewBaseAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f93563d;
    }

    /* JADX INFO: renamed from: c */
    public View m120505c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fdo.m125128b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public IntlMapPreviewBaseAct act() {
        return this.f93563d;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bdo bdoVar) {
        this.f93564e = bdoVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m120508f(y20 y20Var) {
        y20Var.call(this.f93561b);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m120509i(final y20 y20Var) {
        bnl0.m105574p0(this.f93561b);
        act().post(new Runnable() { // from class: l.ddo
            @Override // java.lang.Runnable
            public final void run() {
                this.f87950a.m120508f(y20Var);
            }
        });
        return Boolean.FALSE;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m120505c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m120510j(MessageLocation messageLocation, final y20<View> y20Var) {
        this.f93562c.setText(messageLocation.name);
        this.f93562c.invalidate();
        this.f93562c.buildDrawingCache();
        bnl0.m105546b0(this.f93561b, new pcj() { // from class: l.cdo
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f81247a.m120509i(y20Var);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
