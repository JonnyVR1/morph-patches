package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.aialbum.view.AiAlbumPickerView;
import com.p000p1.mobile.putong.core.p004ui.aialbum.view.AiAlbumRenderView;
import com.p000p1.mobile.putong.core.p004ui.aialbum.view.AiAlbumResultView;
import com.p000p1.mobile.putong.core.p004ui.aialbum.view.AiAlbumTemplatesView;
import com.p1.mobile.android.app.Act;
import l.ef0;
import l.s7m;
import l.xdl0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class df0 implements s7m<cf0> {

    /* JADX INFO: renamed from: a */
    public VLinear f10363a;

    /* JADX INFO: renamed from: b */
    public View f10364b;

    /* JADX INFO: renamed from: c */
    public VFrame f10365c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f10366d;

    /* JADX INFO: renamed from: e */
    public VImage f10367e;

    /* JADX INFO: renamed from: f */
    public AiAlbumTemplatesView f10368f;

    /* JADX INFO: renamed from: g */
    public AiAlbumPickerView f10369g;

    /* JADX INFO: renamed from: h */
    public AiAlbumRenderView f10370h;

    /* JADX INFO: renamed from: i */
    public AiAlbumResultView f10371i;

    /* JADX INFO: renamed from: j */
    public Act f10372j;

    /* JADX INFO: renamed from: k */
    public cf0 f10373k;

    public df0(Act act) {
        this.f10372j = act;
    }

    /* JADX INFO: renamed from: r */
    private void m14007r() {
        cf0 cf0Var = this.f10373k;
        if (cf0Var != null) {
            this.f10368f.setPresenter(cf0Var);
            this.f10369g.setPresenter(this.f10373k);
            this.f10370h.setPresenter(this.f10373k);
            this.f10371i.setPresenter(this.f10373k);
        }
        qib0.f19782G.m12744L0(this.f10366d, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkVCRjVaR0FFWjNBVkk1SlhZQjczTUdWV0dDTUkyNTE0IiwidyI6MTEyNSwiaCI6Nzk1LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjcxMjgxMTQ2MTkzMDkxNzZ9.webp");
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14008C0() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View m14009a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ef0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m14012i1(cf0 cf0Var) {
        this.f10373k = cf0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m14011c(String str) {
        xdl0.M(this.f10368f, "init".equals(str));
        xdl0.M(this.f10369g, "checking".equals(str));
        xdl0.M(this.f10370h, "processing".equals(str));
        xdl0.M(this.f10371i, "finished".equals(str));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM14009a = m14009a(layoutInflater, viewGroup);
        m14007r();
        return viewM14009a;
    }

    public void destroy() {
    }
}
