package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallRollAnimView;
import p147v.VButton;
import p147v.VImage;
import p147v.VRadioButton;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class a6t<P extends zi2> extends BaseDialogHolder<P, LongLinkMultiCallMessage.MultiCallTurnOnGuide> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f67794e;

    /* JADX INFO: renamed from: f */
    public MultiCallRollAnimView f67795f;

    /* JADX INFO: renamed from: g */
    public VImage f67796g;

    /* JADX INFO: renamed from: h */
    public VText f67797h;

    /* JADX INFO: renamed from: i */
    public VText f67798i;

    /* JADX INFO: renamed from: j */
    public VButton f67799j;

    /* JADX INFO: renamed from: k */
    public VRadioButton f67800k;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168601z4, viewGroup, false);
        m95159u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m95159u(ViewGroup viewGroup) {
        this.f67794e = (ConstraintLayout) viewGroup;
        MultiCallRollAnimView multiCallRollAnimView = (MultiCallRollAnimView) viewGroup.getChildAt(0);
        this.f67795f = multiCallRollAnimView;
        String str = multiCallRollAnimView == null ? "_user_roll_view" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f67796g = vImage;
        if (vImage == null) {
            str = "_close";
        }
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f67797h = vText;
        if (vText == null) {
            str = "_top_title";
        }
        VText vText2 = (VText) viewGroup.getChildAt(3);
        this.f67798i = vText2;
        if (vText2 == null) {
            str = "_content";
        }
        VButton vButton = (VButton) viewGroup.getChildAt(4);
        this.f67799j = vButton;
        if (vButton == null) {
            str = "_openButton";
        }
        VRadioButton vRadioButton = (VRadioButton) viewGroup.getChildAt(5);
        this.f67800k = vRadioButton;
        if (vRadioButton == null) {
            str = "_checked";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
