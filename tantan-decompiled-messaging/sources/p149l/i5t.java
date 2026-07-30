package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f111634e;

    /* JADX INFO: renamed from: f */
    public MultiCallConnectionIconView f111635f;

    /* JADX INFO: renamed from: g */
    public VText f111636g;

    /* JADX INFO: renamed from: h */
    public VText f111637h;

    /* JADX INFO: renamed from: i */
    public VText f111638i;

    /* JADX INFO: renamed from: j */
    public VText f111639j;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168263Z3, viewGroup, false);
        m134534u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m134534u(ViewGroup viewGroup) {
        this.f111634e = (ConstraintLayout) viewGroup;
        MultiCallConnectionIconView multiCallConnectionIconView = (MultiCallConnectionIconView) viewGroup.getChildAt(0);
        this.f111635f = multiCallConnectionIconView;
        String str = multiCallConnectionIconView == null ? "_connection_icon_view" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f111636g = vText;
        if (vText == null) {
            str = "_apply_title";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f111637h = vText2;
        if (vText2 == null) {
            str = "_voice_call";
        }
        VText vText3 = (VText) viewGroup.getChildAt(3);
        this.f111638i = vText3;
        if (vText3 == null) {
            str = "_video_call";
        }
        VText vText4 = (VText) viewGroup.getChildAt(4);
        this.f111639j = vText4;
        if (vText4 == null) {
            str = "_apply_join";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
