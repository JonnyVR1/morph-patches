package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.live.base.view.LiveMainlandTagView;
import l.jfd0;
import p002l.zi2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jav<P extends zi2> extends BaseDialogHolder<P, LongLinkLiveMessage.VoiceSettleGuideMessage> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f13657e;

    /* JADX INFO: renamed from: f */
    public ImageView f13658f;

    /* JADX INFO: renamed from: g */
    public LiveMainlandTagView f13659g;

    /* JADX INFO: renamed from: h */
    public VText f13660h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f13661i;

    /* JADX INFO: renamed from: j */
    public VText f13662j;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19882ia, viewGroup, false);
        m15789u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m15789u(ViewGroup viewGroup) {
        this.f13657e = (ConstraintLayout) viewGroup;
        ImageView imageView = (ImageView) viewGroup.getChildAt(0);
        this.f13658f = imageView;
        String str = imageView == null ? "_room_avatars" : null;
        LiveMainlandTagView childAt = viewGroup.getChildAt(1);
        this.f13659g = childAt;
        if (childAt == null) {
            str = "_live_tag";
        }
        VText childAt2 = viewGroup.getChildAt(2);
        this.f13660h = childAt2;
        if (childAt2 == null) {
            str = "_title";
        }
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(3);
        this.f13661i = linearLayout;
        if (linearLayout == null) {
            str = "_tag_layout";
        }
        VText childAt3 = viewGroup.getChildAt(4);
        this.f13662j = childAt3;
        if (childAt3 == null) {
            str = "_settle_start";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
