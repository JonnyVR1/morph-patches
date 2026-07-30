package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class jav<P extends zi2> extends BaseDialogHolder<P, LongLinkLiveMessage.VoiceSettleGuideMessage> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f117121e;

    /* JADX INFO: renamed from: f */
    public ImageView f117122f;

    /* JADX INFO: renamed from: g */
    public LiveMainlandTagView f117123g;

    /* JADX INFO: renamed from: h */
    public VText f117124h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f117125i;

    /* JADX INFO: renamed from: j */
    public VText f117126j;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168386ia, viewGroup, false);
        m140718u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m140718u(ViewGroup viewGroup) {
        this.f117121e = (ConstraintLayout) viewGroup;
        ImageView imageView = (ImageView) viewGroup.getChildAt(0);
        this.f117122f = imageView;
        String str = imageView == null ? "_room_avatars" : null;
        LiveMainlandTagView liveMainlandTagView = (LiveMainlandTagView) viewGroup.getChildAt(1);
        this.f117123g = liveMainlandTagView;
        if (liveMainlandTagView == null) {
            str = "_live_tag";
        }
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f117124h = vText;
        if (vText == null) {
            str = "_title";
        }
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(3);
        this.f117125i = linearLayout;
        if (linearLayout == null) {
            str = "_tag_layout";
        }
        VText vText2 = (VText) viewGroup.getChildAt(4);
        this.f117126j = vText2;
        if (vText2 == null) {
            str = "_settle_start";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
