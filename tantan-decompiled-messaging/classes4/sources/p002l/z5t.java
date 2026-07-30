package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.ui.datepicker.ex.WheelSecondView;
import l.jfd0;
import p002l.zi2;
import v.VFrame;
import v.VImage;
import v.VSwitch;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f23262e;

    /* JADX INFO: renamed from: f */
    public VImage f23263f;

    /* JADX INFO: renamed from: g */
    public VText f23264g;

    /* JADX INFO: renamed from: h */
    public VText f23265h;

    /* JADX INFO: renamed from: i */
    public View f23266i;

    /* JADX INFO: renamed from: j */
    public VText f23267j;

    /* JADX INFO: renamed from: k */
    public VText f23268k;

    /* JADX INFO: renamed from: l */
    public VText f23269l;

    /* JADX INFO: renamed from: m */
    public VSwitch f23270m;

    /* JADX INFO: renamed from: n */
    public VFrame f23271n;

    /* JADX INFO: renamed from: o */
    public View f23272o;

    /* JADX INFO: renamed from: p */
    public WheelSecondView f23273p;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20058w4, viewGroup, false);
        m27098u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m27098u(ViewGroup viewGroup) {
        this.f23262e = (ConstraintLayout) viewGroup;
        VImage childAt = viewGroup.getChildAt(0);
        this.f23263f = childAt;
        String str = childAt == null ? "_iv_back" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f23264g = childAt2;
        if (childAt2 == null) {
            str = "_tv_title";
        }
        VText childAt3 = viewGroup.getChildAt(2);
        this.f23265h = childAt3;
        if (childAt3 == null) {
            str = "_iv_ok";
        }
        View childAt4 = viewGroup.getChildAt(3);
        this.f23266i = childAt4;
        if (childAt4 == null) {
            str = "_top_space";
        }
        VText childAt5 = viewGroup.getChildAt(4);
        this.f23267j = childAt5;
        if (childAt5 == null) {
            str = "_tv_time_title";
        }
        VText childAt6 = viewGroup.getChildAt(5);
        this.f23268k = childAt6;
        if (childAt6 == null) {
            str = "_tv_time";
        }
        VText childAt7 = viewGroup.getChildAt(6);
        this.f23269l = childAt7;
        if (childAt7 == null) {
            str = "_tv_pk_invite_title";
        }
        VSwitch childAt8 = viewGroup.getChildAt(7);
        this.f23270m = childAt8;
        if (childAt8 == null) {
            str = "_switcher";
        }
        VFrame childAt9 = viewGroup.getChildAt(8);
        this.f23271n = childAt9;
        if (childAt9 == null) {
            str = "_range_layout";
        }
        View childAt10 = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        this.f23272o = childAt10;
        if (childAt10 == null) {
            str = "_range_layout_range_bg";
        }
        WheelSecondView childAt11 = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        this.f23273p = childAt11;
        if (childAt11 == null) {
            str = "_range_layout_wheel_pick";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
