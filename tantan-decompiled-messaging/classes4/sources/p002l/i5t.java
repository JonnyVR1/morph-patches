package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallConnectionIconView;
import l.jfd0;
import p002l.zi2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class i5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f13058e;

    /* JADX INFO: renamed from: f */
    public MultiCallConnectionIconView f13059f;

    /* JADX INFO: renamed from: g */
    public VText f13060g;

    /* JADX INFO: renamed from: h */
    public VText f13061h;

    /* JADX INFO: renamed from: i */
    public VText f13062i;

    /* JADX INFO: renamed from: j */
    public VText f13063j;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19759Z3, viewGroup, false);
        m15014u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m15014u(ViewGroup viewGroup) {
        this.f13058e = (ConstraintLayout) viewGroup;
        MultiCallConnectionIconView childAt = viewGroup.getChildAt(0);
        this.f13059f = childAt;
        String str = childAt == null ? "_connection_icon_view" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f13060g = childAt2;
        if (childAt2 == null) {
            str = "_apply_title";
        }
        VText childAt3 = viewGroup.getChildAt(2);
        this.f13061h = childAt3;
        if (childAt3 == null) {
            str = "_voice_call";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f13062i = childAt4;
        if (childAt4 == null) {
            str = "_video_call";
        }
        VText childAt5 = viewGroup.getChildAt(4);
        this.f13063j = childAt5;
        if (childAt5 == null) {
            str = "_apply_join";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
