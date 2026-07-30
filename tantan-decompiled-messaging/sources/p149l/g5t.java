package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g5t<P extends zi2> extends BaseDialogHolder<P, BLiveMultiCallInvite> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f101191e;

    /* JADX INFO: renamed from: f */
    public MultiCallConnectionIconView f101192f;

    /* JADX INFO: renamed from: g */
    public VText f101193g;

    /* JADX INFO: renamed from: h */
    public VText f101194h;

    /* JADX INFO: renamed from: i */
    public VText f101195i;

    /* JADX INFO: renamed from: j */
    public VText f101196j;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168239X3, viewGroup, false);
        m124542u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m124542u(ViewGroup viewGroup) {
        this.f101191e = (ConstraintLayout) viewGroup;
        MultiCallConnectionIconView multiCallConnectionIconView = (MultiCallConnectionIconView) viewGroup.getChildAt(0);
        this.f101192f = multiCallConnectionIconView;
        String str = multiCallConnectionIconView == null ? "_connection_icon_view" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f101193g = vText;
        if (vText == null) {
            str = "_apply_title";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f101194h = vText2;
        if (vText2 == null) {
            str = "_reject";
        }
        VText vText3 = (VText) viewGroup.getChildAt(3);
        this.f101195i = vText3;
        if (vText3 == null) {
            str = "_voice_call";
        }
        VText vText4 = (VText) viewGroup.getChildAt(4);
        this.f101196j = vText4;
        if (vText4 == null) {
            str = "_video_call";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
