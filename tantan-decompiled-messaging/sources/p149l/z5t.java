package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.p065ui.datepicker.p067ex.WheelSecondView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VSwitch;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class z5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f201846e;

    /* JADX INFO: renamed from: f */
    public VImage f201847f;

    /* JADX INFO: renamed from: g */
    public VText f201848g;

    /* JADX INFO: renamed from: h */
    public VText f201849h;

    /* JADX INFO: renamed from: i */
    public View f201850i;

    /* JADX INFO: renamed from: j */
    public VText f201851j;

    /* JADX INFO: renamed from: k */
    public VText f201852k;

    /* JADX INFO: renamed from: l */
    public VText f201853l;

    /* JADX INFO: renamed from: m */
    public VSwitch f201854m;

    /* JADX INFO: renamed from: n */
    public VFrame f201855n;

    /* JADX INFO: renamed from: o */
    public View f201856o;

    /* JADX INFO: renamed from: p */
    public WheelSecondView f201857p;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168562w4, viewGroup, false);
        m217369u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m217369u(ViewGroup viewGroup) {
        this.f201846e = (ConstraintLayout) viewGroup;
        VImage vImage = (VImage) viewGroup.getChildAt(0);
        this.f201847f = vImage;
        String str = vImage == null ? "_iv_back" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f201848g = vText;
        if (vText == null) {
            str = "_tv_title";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f201849h = vText2;
        if (vText2 == null) {
            str = "_iv_ok";
        }
        View childAt = viewGroup.getChildAt(3);
        this.f201850i = childAt;
        if (childAt == null) {
            str = "_top_space";
        }
        VText vText3 = (VText) viewGroup.getChildAt(4);
        this.f201851j = vText3;
        if (vText3 == null) {
            str = "_tv_time_title";
        }
        VText vText4 = (VText) viewGroup.getChildAt(5);
        this.f201852k = vText4;
        if (vText4 == null) {
            str = "_tv_time";
        }
        VText vText5 = (VText) viewGroup.getChildAt(6);
        this.f201853l = vText5;
        if (vText5 == null) {
            str = "_tv_pk_invite_title";
        }
        VSwitch vSwitch = (VSwitch) viewGroup.getChildAt(7);
        this.f201854m = vSwitch;
        if (vSwitch == null) {
            str = "_switcher";
        }
        VFrame vFrame = (VFrame) viewGroup.getChildAt(8);
        this.f201855n = vFrame;
        if (vFrame == null) {
            str = "_range_layout";
        }
        View childAt2 = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        this.f201856o = childAt2;
        if (childAt2 == null) {
            str = "_range_layout_range_bg";
        }
        WheelSecondView wheelSecondView = (WheelSecondView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        this.f201857p = wheelSecondView;
        if (wheelSecondView == null) {
            str = "_range_layout_wheel_pick";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
