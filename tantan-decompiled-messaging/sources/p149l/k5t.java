package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class k5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f121223e;

    /* JADX INFO: renamed from: f */
    public VText f121224f;

    /* JADX INFO: renamed from: g */
    public VImage f121225g;

    /* JADX INFO: renamed from: h */
    public View f121226h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f121227i;

    /* JADX INFO: renamed from: j */
    public VText f121228j;

    /* JADX INFO: renamed from: k */
    public VText f121229k;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168380i4, viewGroup, false);
        m144547u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m144547u(ViewGroup viewGroup) {
        this.f121223e = (ConstraintLayout) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f121224f = vText;
        String str = vText == null ? "_tv_title" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f121225g = vImage;
        if (vImage == null) {
            str = "_iv_setting";
        }
        View childAt = viewGroup.getChildAt(2);
        this.f121226h = childAt;
        if (childAt == null) {
            str = "_top_space";
        }
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(3);
        this.f121227i = vRecyclerView;
        if (vRecyclerView == null) {
            str = "_recycler_view";
        }
        VText vText2 = (VText) viewGroup.getChildAt(4);
        this.f121228j = vText2;
        if (vText2 == null) {
            str = "_tv_start_pk";
        }
        VText vText3 = (VText) viewGroup.getChildAt(5);
        this.f121229k = vText3;
        if (vText3 == null) {
            str = "_tv_bottom";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
