package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallRollAnimView;
import l.jfd0;
import p002l.zi2;
import v.VButton;
import v.VImage;
import v.VRadioButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a6t<P extends zi2> extends BaseDialogHolder<P, LongLinkMultiCallMessage.MultiCallTurnOnGuide> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f7422e;

    /* JADX INFO: renamed from: f */
    public MultiCallRollAnimView f7423f;

    /* JADX INFO: renamed from: g */
    public VImage f7424g;

    /* JADX INFO: renamed from: h */
    public VText f7425h;

    /* JADX INFO: renamed from: i */
    public VText f7426i;

    /* JADX INFO: renamed from: j */
    public VButton f7427j;

    /* JADX INFO: renamed from: k */
    public VRadioButton f7428k;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20097z4, viewGroup, false);
        m9444u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m9444u(ViewGroup viewGroup) {
        this.f7422e = (ConstraintLayout) viewGroup;
        MultiCallRollAnimView childAt = viewGroup.getChildAt(0);
        this.f7423f = childAt;
        String str = childAt == null ? "_user_roll_view" : null;
        VImage childAt2 = viewGroup.getChildAt(1);
        this.f7424g = childAt2;
        if (childAt2 == null) {
            str = "_close";
        }
        VText childAt3 = viewGroup.getChildAt(2);
        this.f7425h = childAt3;
        if (childAt3 == null) {
            str = "_top_title";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f7426i = childAt4;
        if (childAt4 == null) {
            str = "_content";
        }
        VButton childAt5 = viewGroup.getChildAt(4);
        this.f7427j = childAt5;
        if (childAt5 == null) {
            str = "_openButton";
        }
        VRadioButton childAt6 = viewGroup.getChildAt(5);
        this.f7428k = childAt6;
        if (childAt6 == null) {
            str = "_checked";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
