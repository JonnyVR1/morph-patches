package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class k7t<P extends hj2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f124291e;

    /* JADX INFO: renamed from: f */
    public VText f124292f;

    /* JADX INFO: renamed from: g */
    public VText f124293g;

    /* JADX INFO: renamed from: h */
    public View f124294h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f124295i;

    /* JADX INFO: renamed from: j */
    public VLinear f124296j;

    /* JADX INFO: renamed from: k */
    public View f124297k;

    /* JADX INFO: renamed from: l */
    public View f124298l;

    /* JADX INFO: renamed from: m */
    public MultiCallPkBoardItemView f124299m;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199060e4, viewGroup, false);
        m148643u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m148643u(ViewGroup viewGroup) {
        this.f124291e = (ConstraintLayout) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f124292f = vText;
        String str = vText == null ? "_tv_title_top" : null;
        VText vText2 = (VText) viewGroup.getChildAt(1);
        this.f124293g = vText2;
        if (vText2 == null) {
            str = "_tv_title_bottom";
        }
        View childAt = viewGroup.getChildAt(2);
        this.f124294h = childAt;
        if (childAt == null) {
            str = "_top_space";
        }
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(3);
        this.f124295i = vRecyclerView;
        if (vRecyclerView == null) {
            str = "_recycler_view";
        }
        VLinear vLinear = (VLinear) viewGroup.getChildAt(4);
        this.f124296j = vLinear;
        if (vLinear == null) {
            str = "_empty";
        }
        View childAt2 = viewGroup.getChildAt(5);
        this.f124297k = childAt2;
        if (childAt2 == null) {
            str = "_view_bottom_1";
        }
        View childAt3 = viewGroup.getChildAt(6);
        this.f124298l = childAt3;
        if (childAt3 == null) {
            str = "_view_bottom_2";
        }
        MultiCallPkBoardItemView multiCallPkBoardItemView = (MultiCallPkBoardItemView) viewGroup.getChildAt(7);
        this.f124299m = multiCallPkBoardItemView;
        if (multiCallPkBoardItemView == null) {
            str = "_item_bottom";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
