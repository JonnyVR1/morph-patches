package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class w5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f184737e;

    /* JADX INFO: renamed from: f */
    public View f184738f;

    /* JADX INFO: renamed from: g */
    public VText f184739g;

    /* JADX INFO: renamed from: h */
    public View f184740h;

    /* JADX INFO: renamed from: i */
    public VText f184741i;

    /* JADX INFO: renamed from: j */
    public VText f184742j;

    /* JADX INFO: renamed from: k */
    public View f184743k;

    /* JADX INFO: renamed from: l */
    public VText f184744l;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168523t4, viewGroup, false);
        m201686u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m201686u(ViewGroup viewGroup) {
        this.f184737e = (ConstraintLayout) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f184738f = childAt;
        String str = childAt == null ? "_view_top" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f184739g = vText;
        if (vText == null) {
            str = "_tv_title";
        }
        View childAt2 = viewGroup.getChildAt(2);
        this.f184740h = childAt2;
        if (childAt2 == null) {
            str = "_top_space";
        }
        VText vText2 = (VText) viewGroup.getChildAt(3);
        this.f184741i = vText2;
        if (vText2 == null) {
            str = "_tv_again_pk";
        }
        VText vText3 = (VText) viewGroup.getChildAt(4);
        this.f184742j = vText3;
        if (vText3 == null) {
            str = "_tv_over_pk";
        }
        View childAt3 = viewGroup.getChildAt(5);
        this.f184743k = childAt3;
        if (childAt3 == null) {
            str = "_bottom_space";
        }
        VText vText4 = (VText) viewGroup.getChildAt(6);
        this.f184744l = vText4;
        if (vText4 == null) {
            str = "_tv_cancel";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
