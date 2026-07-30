package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class kcv<P extends hj2> extends BaseDialogHolder<P, LongLinkLiveMessage.VoiceSettleGuideMessage> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f125101e;

    /* JADX INFO: renamed from: f */
    public ImageView f125102f;

    /* JADX INFO: renamed from: g */
    public LiveMainlandTagView f125103g;

    /* JADX INFO: renamed from: h */
    public VText f125104h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f125105i;

    /* JADX INFO: renamed from: j */
    public VText f125106j;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199118ia, viewGroup, false);
        m149133u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m149133u(ViewGroup viewGroup) {
        this.f125101e = (ConstraintLayout) viewGroup;
        ImageView imageView = (ImageView) viewGroup.getChildAt(0);
        this.f125102f = imageView;
        String str = imageView == null ? "_room_avatars" : null;
        LiveMainlandTagView liveMainlandTagView = (LiveMainlandTagView) viewGroup.getChildAt(1);
        this.f125103g = liveMainlandTagView;
        if (liveMainlandTagView == null) {
            str = "_live_tag";
        }
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f125104h = vText;
        if (vText == null) {
            str = "_title";
        }
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(3);
        this.f125105i = linearLayout;
        if (linearLayout == null) {
            str = "_tag_layout";
        }
        VText vText2 = (VText) viewGroup.getChildAt(4);
        this.f125106j = vText2;
        if (vText2 == null) {
            str = "_settle_start";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
