package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class j5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f116342e;

    /* JADX INFO: renamed from: f */
    public VText f116343f;

    /* JADX INFO: renamed from: g */
    public VText f116344g;

    /* JADX INFO: renamed from: h */
    public View f116345h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f116346i;

    /* JADX INFO: renamed from: j */
    public VLinear f116347j;

    /* JADX INFO: renamed from: k */
    public View f116348k;

    /* JADX INFO: renamed from: l */
    public View f116349l;

    /* JADX INFO: renamed from: m */
    public MultiCallPkBoardItemView f116350m;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168328e4, viewGroup, false);
        m139871u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m139871u(ViewGroup viewGroup) {
        this.f116342e = (ConstraintLayout) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f116343f = vText;
        String str = vText == null ? "_tv_title_top" : null;
        VText vText2 = (VText) viewGroup.getChildAt(1);
        this.f116344g = vText2;
        if (vText2 == null) {
            str = "_tv_title_bottom";
        }
        View childAt = viewGroup.getChildAt(2);
        this.f116345h = childAt;
        if (childAt == null) {
            str = "_top_space";
        }
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(3);
        this.f116346i = vRecyclerView;
        if (vRecyclerView == null) {
            str = "_recycler_view";
        }
        VLinear vLinear = (VLinear) viewGroup.getChildAt(4);
        this.f116347j = vLinear;
        if (vLinear == null) {
            str = "_empty";
        }
        View childAt2 = viewGroup.getChildAt(5);
        this.f116348k = childAt2;
        if (childAt2 == null) {
            str = "_view_bottom_1";
        }
        View childAt3 = viewGroup.getChildAt(6);
        this.f116349l = childAt3;
        if (childAt3 == null) {
            str = "_view_bottom_2";
        }
        MultiCallPkBoardItemView multiCallPkBoardItemView = (MultiCallPkBoardItemView) viewGroup.getChildAt(7);
        this.f116350m = multiCallPkBoardItemView;
        if (multiCallPkBoardItemView == null) {
            str = "_item_bottom";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
