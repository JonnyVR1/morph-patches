package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallRollAnimView;
import p151v.VButton;
import p151v.VImage;
import p151v.VRadioButton;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class b8t<P extends hj2> extends BaseDialogHolder<P, LongLinkMultiCallMessage.MultiCallTurnOnGuide> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f75469e;

    /* JADX INFO: renamed from: f */
    public MultiCallRollAnimView f75470f;

    /* JADX INFO: renamed from: g */
    public VImage f75471g;

    /* JADX INFO: renamed from: h */
    public VText f75472h;

    /* JADX INFO: renamed from: i */
    public VText f75473i;

    /* JADX INFO: renamed from: j */
    public VButton f75474j;

    /* JADX INFO: renamed from: k */
    public VRadioButton f75475k;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199333z4, viewGroup, false);
        m103037u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m103037u(ViewGroup viewGroup) {
        this.f75469e = (ConstraintLayout) viewGroup;
        MultiCallRollAnimView multiCallRollAnimView = (MultiCallRollAnimView) viewGroup.getChildAt(0);
        this.f75470f = multiCallRollAnimView;
        String str = multiCallRollAnimView == null ? "_user_roll_view" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f75471g = vImage;
        if (vImage == null) {
            str = "_close";
        }
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f75472h = vText;
        if (vText == null) {
            str = "_top_title";
        }
        VText vText2 = (VText) viewGroup.getChildAt(3);
        this.f75473i = vText2;
        if (vText2 == null) {
            str = "_content";
        }
        VButton vButton = (VButton) viewGroup.getChildAt(4);
        this.f75474j = vButton;
        if (vButton == null) {
            str = "_openButton";
        }
        VRadioButton vRadioButton = (VRadioButton) viewGroup.getChildAt(5);
        this.f75475k = vRadioButton;
        if (vRadioButton == null) {
            str = "_checked";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
