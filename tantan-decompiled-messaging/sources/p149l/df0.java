package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PaymentOrderStatus;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumPickerView;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumRenderView;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumResultView;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumTemplatesView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes9.dex */
public class df0 implements s7m<cf0> {

    /* JADX INFO: renamed from: a */
    public VLinear f85872a;

    /* JADX INFO: renamed from: b */
    public View f85873b;

    /* JADX INFO: renamed from: c */
    public VFrame f85874c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f85875d;

    /* JADX INFO: renamed from: e */
    public VImage f85876e;

    /* JADX INFO: renamed from: f */
    public AiAlbumTemplatesView f85877f;

    /* JADX INFO: renamed from: g */
    public AiAlbumPickerView f85878g;

    /* JADX INFO: renamed from: h */
    public AiAlbumRenderView f85879h;

    /* JADX INFO: renamed from: i */
    public AiAlbumResultView f85880i;

    /* JADX INFO: renamed from: j */
    public Act f85881j;

    /* JADX INFO: renamed from: k */
    public cf0 f85882k;

    public df0(Act act) {
        this.f85881j = act;
    }

    /* JADX INFO: renamed from: r */
    private void m111409r() {
        cf0 cf0Var = this.f85882k;
        if (cf0Var != null) {
            this.f85877f.setPresenter(cf0Var);
            this.f85878g.setPresenter(this.f85882k);
            this.f85879h.setPresenter(this.f85882k);
            this.f85880i.setPresenter(this.f85882k);
        }
        qib0.f154691G.m102331L0(this.f85875d, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkVCRjVaR0FFWjNBVkk1SlhZQjczTUdWV0dDTUkyNTE0IiwidyI6MTEyNSwiaCI6Nzk1LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjcxMjgxMTQ2MTkzMDkxNzZ9.webp");
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View m111410a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ef0.m116017b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cf0 cf0Var) {
        this.f85882k = cf0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m111412c(String str) {
        xdl0.m208344M(this.f85877f, "init".equals(str));
        xdl0.m208344M(this.f85878g, "checking".equals(str));
        xdl0.m208344M(this.f85879h, PaymentOrderStatus.processing.equals(str));
        xdl0.m208344M(this.f85880i, "finished".equals(str));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM111410a = m111410a(layoutInflater, viewGroup);
        m111409r();
        return viewM111410a;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
