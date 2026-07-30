package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class l7t<P extends hj2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f130376e;

    /* JADX INFO: renamed from: f */
    public VText f130377f;

    /* JADX INFO: renamed from: g */
    public VImage f130378g;

    /* JADX INFO: renamed from: h */
    public View f130379h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f130380i;

    /* JADX INFO: renamed from: j */
    public VText f130381j;

    /* JADX INFO: renamed from: k */
    public VText f130382k;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199112i4, viewGroup, false);
        m153147u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m153147u(ViewGroup viewGroup) {
        this.f130376e = (ConstraintLayout) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f130377f = vText;
        String str = vText == null ? "_tv_title" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f130378g = vImage;
        if (vImage == null) {
            str = "_iv_setting";
        }
        View childAt = viewGroup.getChildAt(2);
        this.f130379h = childAt;
        if (childAt == null) {
            str = "_top_space";
        }
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(3);
        this.f130380i = vRecyclerView;
        if (vRecyclerView == null) {
            str = "_recycler_view";
        }
        VText vText2 = (VText) viewGroup.getChildAt(4);
        this.f130381j = vText2;
        if (vText2 == null) {
            str = "_tv_start_pk";
        }
        VText vText3 = (VText) viewGroup.getChildAt(5);
        this.f130382k = vText3;
        if (vText3 == null) {
            str = "_tv_bottom";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
