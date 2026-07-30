package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h7t<P extends hj2> extends BaseDialogHolder<P, BLiveMultiCallInvite> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f108157e;

    /* JADX INFO: renamed from: f */
    public MultiCallConnectionIconView f108158f;

    /* JADX INFO: renamed from: g */
    public VText f108159g;

    /* JADX INFO: renamed from: h */
    public VText f108160h;

    /* JADX INFO: renamed from: i */
    public VText f108161i;

    /* JADX INFO: renamed from: j */
    public VText f108162j;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198971X3, viewGroup, false);
        m133836u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m133836u(ViewGroup viewGroup) {
        this.f108157e = (ConstraintLayout) viewGroup;
        MultiCallConnectionIconView multiCallConnectionIconView = (MultiCallConnectionIconView) viewGroup.getChildAt(0);
        this.f108158f = multiCallConnectionIconView;
        String str = multiCallConnectionIconView == null ? "_connection_icon_view" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f108159g = vText;
        if (vText == null) {
            str = "_apply_title";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f108160h = vText2;
        if (vText2 == null) {
            str = "_reject";
        }
        VText vText3 = (VText) viewGroup.getChildAt(3);
        this.f108161i = vText3;
        if (vText3 == null) {
            str = "_voice_call";
        }
        VText vText4 = (VText) viewGroup.getChildAt(4);
        this.f108162j = vText4;
        if (vText4 == null) {
            str = "_video_call";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
