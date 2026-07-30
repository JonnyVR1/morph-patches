package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import l.jfd0;
import p002l.zi2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f21468e;

    /* JADX INFO: renamed from: f */
    public View f21469f;

    /* JADX INFO: renamed from: g */
    public VText f21470g;

    /* JADX INFO: renamed from: h */
    public View f21471h;

    /* JADX INFO: renamed from: i */
    public VText f21472i;

    /* JADX INFO: renamed from: j */
    public VText f21473j;

    /* JADX INFO: renamed from: k */
    public View f21474k;

    /* JADX INFO: renamed from: l */
    public VText f21475l;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20019t4, viewGroup, false);
        m24328u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m24328u(ViewGroup viewGroup) {
        this.f21468e = (ConstraintLayout) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f21469f = childAt;
        String str = childAt == null ? "_view_top" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f21470g = childAt2;
        if (childAt2 == null) {
            str = "_tv_title";
        }
        View childAt3 = viewGroup.getChildAt(2);
        this.f21471h = childAt3;
        if (childAt3 == null) {
            str = "_top_space";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f21472i = childAt4;
        if (childAt4 == null) {
            str = "_tv_again_pk";
        }
        VText childAt5 = viewGroup.getChildAt(4);
        this.f21473j = childAt5;
        if (childAt5 == null) {
            str = "_tv_over_pk";
        }
        View childAt6 = viewGroup.getChildAt(5);
        this.f21474k = childAt6;
        if (childAt6 == null) {
            str = "_bottom_space";
        }
        VText childAt7 = viewGroup.getChildAt(6);
        this.f21475l = childAt7;
        if (childAt7 == null) {
            str = "_tv_cancel";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
