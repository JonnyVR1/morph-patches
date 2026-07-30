package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j7t<P extends hj2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f118720e;

    /* JADX INFO: renamed from: f */
    public MultiCallConnectionIconView f118721f;

    /* JADX INFO: renamed from: g */
    public VText f118722g;

    /* JADX INFO: renamed from: h */
    public VText f118723h;

    /* JADX INFO: renamed from: i */
    public VText f118724i;

    /* JADX INFO: renamed from: j */
    public VText f118725j;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198995Z3, viewGroup, false);
        m143788u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m143788u(ViewGroup viewGroup) {
        this.f118720e = (ConstraintLayout) viewGroup;
        MultiCallConnectionIconView multiCallConnectionIconView = (MultiCallConnectionIconView) viewGroup.getChildAt(0);
        this.f118721f = multiCallConnectionIconView;
        String str = multiCallConnectionIconView == null ? "_connection_icon_view" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f118722g = vText;
        if (vText == null) {
            str = "_apply_title";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f118723h = vText2;
        if (vText2 == null) {
            str = "_voice_call";
        }
        VText vText3 = (VText) viewGroup.getChildAt(3);
        this.f118724i = vText3;
        if (vText3 == null) {
            str = "_video_call";
        }
        VText vText4 = (VText) viewGroup.getChildAt(4);
        this.f118725j = vText4;
        if (vText4 == null) {
            str = "_apply_join";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
