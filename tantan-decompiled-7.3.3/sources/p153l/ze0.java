package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PaymentOrderStatus;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumPickerView;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumRenderView;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumResultView;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumTemplatesView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes9.dex */
public class ze0 implements iam<ye0> {

    /* JADX INFO: renamed from: a */
    public VLinear f203956a;

    /* JADX INFO: renamed from: b */
    public View f203957b;

    /* JADX INFO: renamed from: c */
    public VFrame f203958c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f203959d;

    /* JADX INFO: renamed from: e */
    public VImage f203960e;

    /* JADX INFO: renamed from: f */
    public AiAlbumTemplatesView f203961f;

    /* JADX INFO: renamed from: g */
    public AiAlbumPickerView f203962g;

    /* JADX INFO: renamed from: h */
    public AiAlbumRenderView f203963h;

    /* JADX INFO: renamed from: i */
    public AiAlbumResultView f203964i;

    /* JADX INFO: renamed from: j */
    public Act f203965j;

    /* JADX INFO: renamed from: k */
    public ye0 f203966k;

    public ze0(Act act) {
        this.f203965j = act;
    }

    /* JADX INFO: renamed from: r */
    private void m219389r() {
        ye0 ye0Var = this.f203966k;
        if (ye0Var != null) {
            this.f203961f.setPresenter(ye0Var);
            this.f203962g.setPresenter(this.f203966k);
            this.f203963h.setPresenter(this.f203966k);
            this.f203964i.setPresenter(this.f203966k);
        }
        uqb0.f180374G.m127115L0(this.f203959d, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkVCRjVaR0FFWjNBVkk1SlhZQjczTUdWV0dDTUkyNTE0IiwidyI6MTEyNSwiaCI6Nzk1LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjcxMjgxMTQ2MTkzMDkxNzZ9.webp");
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View m219390a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return af0.m97265b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ye0 ye0Var) {
        this.f203966k = ye0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m219392c(String str) {
        bnl0.m105524M(this.f203961f, "init".equals(str));
        bnl0.m105524M(this.f203962g, "checking".equals(str));
        bnl0.m105524M(this.f203963h, PaymentOrderStatus.processing.equals(str));
        bnl0.m105524M(this.f203964i, "finished".equals(str));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM219390a = m219390a(layoutInflater, viewGroup);
        m219389r();
        return viewM219390a;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
