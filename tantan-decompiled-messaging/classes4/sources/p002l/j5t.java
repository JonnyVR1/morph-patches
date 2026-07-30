package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;
import l.jfd0;
import p002l.zi2;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f13589e;

    /* JADX INFO: renamed from: f */
    public VText f13590f;

    /* JADX INFO: renamed from: g */
    public VText f13591g;

    /* JADX INFO: renamed from: h */
    public View f13592h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f13593i;

    /* JADX INFO: renamed from: j */
    public VLinear f13594j;

    /* JADX INFO: renamed from: k */
    public View f13595k;

    /* JADX INFO: renamed from: l */
    public View f13596l;

    /* JADX INFO: renamed from: m */
    public MultiCallPkBoardItemView f13597m;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19824e4, viewGroup, false);
        m15667u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m15667u(ViewGroup viewGroup) {
        this.f13589e = (ConstraintLayout) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f13590f = childAt;
        String str = childAt == null ? "_tv_title_top" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f13591g = childAt2;
        if (childAt2 == null) {
            str = "_tv_title_bottom";
        }
        View childAt3 = viewGroup.getChildAt(2);
        this.f13592h = childAt3;
        if (childAt3 == null) {
            str = "_top_space";
        }
        VRecyclerView childAt4 = viewGroup.getChildAt(3);
        this.f13593i = childAt4;
        if (childAt4 == null) {
            str = "_recycler_view";
        }
        VLinear childAt5 = viewGroup.getChildAt(4);
        this.f13594j = childAt5;
        if (childAt5 == null) {
            str = "_empty";
        }
        View childAt6 = viewGroup.getChildAt(5);
        this.f13595k = childAt6;
        if (childAt6 == null) {
            str = "_view_bottom_1";
        }
        View childAt7 = viewGroup.getChildAt(6);
        this.f13596l = childAt7;
        if (childAt7 == null) {
            str = "_view_bottom_2";
        }
        MultiCallPkBoardItemView childAt8 = viewGroup.getChildAt(7);
        this.f13597m = childAt8;
        if (childAt8 == null) {
            str = "_item_bottom";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
