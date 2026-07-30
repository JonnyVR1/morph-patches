package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import l.jfd0;
import p002l.zi2;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f14207e;

    /* JADX INFO: renamed from: f */
    public VText f14208f;

    /* JADX INFO: renamed from: g */
    public VImage f14209g;

    /* JADX INFO: renamed from: h */
    public View f14210h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f14211i;

    /* JADX INFO: renamed from: j */
    public VText f14212j;

    /* JADX INFO: renamed from: k */
    public VText f14213k;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19876i4, viewGroup, false);
        m16498u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m16498u(ViewGroup viewGroup) {
        this.f14207e = (ConstraintLayout) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f14208f = childAt;
        String str = childAt == null ? "_tv_title" : null;
        VImage childAt2 = viewGroup.getChildAt(1);
        this.f14209g = childAt2;
        if (childAt2 == null) {
            str = "_iv_setting";
        }
        View childAt3 = viewGroup.getChildAt(2);
        this.f14210h = childAt3;
        if (childAt3 == null) {
            str = "_top_space";
        }
        VRecyclerView childAt4 = viewGroup.getChildAt(3);
        this.f14211i = childAt4;
        if (childAt4 == null) {
            str = "_recycler_view";
        }
        VText childAt5 = viewGroup.getChildAt(4);
        this.f14212j = childAt5;
        if (childAt5 == null) {
            str = "_tv_start_pk";
        }
        VText childAt6 = viewGroup.getChildAt(5);
        this.f14213k = childAt6;
        if (childAt6 == null) {
            str = "_tv_bottom";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
