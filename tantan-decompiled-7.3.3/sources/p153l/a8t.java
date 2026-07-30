package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.p070ui.datepicker.p072ex.WheelSecondView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VSwitch;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class a8t<P extends hj2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f68947e;

    /* JADX INFO: renamed from: f */
    public VImage f68948f;

    /* JADX INFO: renamed from: g */
    public VText f68949g;

    /* JADX INFO: renamed from: h */
    public VText f68950h;

    /* JADX INFO: renamed from: i */
    public View f68951i;

    /* JADX INFO: renamed from: j */
    public VText f68952j;

    /* JADX INFO: renamed from: k */
    public VText f68953k;

    /* JADX INFO: renamed from: l */
    public VText f68954l;

    /* JADX INFO: renamed from: m */
    public VSwitch f68955m;

    /* JADX INFO: renamed from: n */
    public VFrame f68956n;

    /* JADX INFO: renamed from: o */
    public View f68957o;

    /* JADX INFO: renamed from: p */
    public WheelSecondView f68958p;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199294w4, viewGroup, false);
        m96488u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m96488u(ViewGroup viewGroup) {
        this.f68947e = (ConstraintLayout) viewGroup;
        VImage vImage = (VImage) viewGroup.getChildAt(0);
        this.f68948f = vImage;
        String str = vImage == null ? "_iv_back" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f68949g = vText;
        if (vText == null) {
            str = "_tv_title";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f68950h = vText2;
        if (vText2 == null) {
            str = "_iv_ok";
        }
        View childAt = viewGroup.getChildAt(3);
        this.f68951i = childAt;
        if (childAt == null) {
            str = "_top_space";
        }
        VText vText3 = (VText) viewGroup.getChildAt(4);
        this.f68952j = vText3;
        if (vText3 == null) {
            str = "_tv_time_title";
        }
        VText vText4 = (VText) viewGroup.getChildAt(5);
        this.f68953k = vText4;
        if (vText4 == null) {
            str = "_tv_time";
        }
        VText vText5 = (VText) viewGroup.getChildAt(6);
        this.f68954l = vText5;
        if (vText5 == null) {
            str = "_tv_pk_invite_title";
        }
        VSwitch vSwitch = (VSwitch) viewGroup.getChildAt(7);
        this.f68955m = vSwitch;
        if (vSwitch == null) {
            str = "_switcher";
        }
        VFrame vFrame = (VFrame) viewGroup.getChildAt(8);
        this.f68956n = vFrame;
        if (vFrame == null) {
            str = "_range_layout";
        }
        View childAt2 = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        this.f68957o = childAt2;
        if (childAt2 == null) {
            str = "_range_layout_range_bg";
        }
        WheelSecondView wheelSecondView = (WheelSecondView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        this.f68958p = wheelSecondView;
        if (wheelSecondView == null) {
            str = "_range_layout_wheel_pick";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
