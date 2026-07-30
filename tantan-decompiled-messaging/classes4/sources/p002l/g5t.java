package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import l.jfd0;
import p002l.zi2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class g5t<P extends zi2> extends BaseDialogHolder<P, BLiveMultiCallInvite> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f11273e;

    /* JADX INFO: renamed from: f */
    public MultiCallConnectionIconView f11274f;

    /* JADX INFO: renamed from: g */
    public VText f11275g;

    /* JADX INFO: renamed from: h */
    public VText f11276h;

    /* JADX INFO: renamed from: i */
    public VText f11277i;

    /* JADX INFO: renamed from: j */
    public VText f11278j;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19735X3, viewGroup, false);
        m13644u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m13644u(ViewGroup viewGroup) {
        this.f11273e = (ConstraintLayout) viewGroup;
        MultiCallConnectionIconView childAt = viewGroup.getChildAt(0);
        this.f11274f = childAt;
        String str = childAt == null ? "_connection_icon_view" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f11275g = childAt2;
        if (childAt2 == null) {
            str = "_apply_title";
        }
        VText childAt3 = viewGroup.getChildAt(2);
        this.f11276h = childAt3;
        if (childAt3 == null) {
            str = "_reject";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f11277i = childAt4;
        if (childAt4 == null) {
            str = "_voice_call";
        }
        VText childAt5 = viewGroup.getChildAt(4);
        this.f11278j = childAt5;
        if (childAt5 == null) {
            str = "_video_call";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
