package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class x90 {
    /* JADX INFO: renamed from: a */
    public static void m207458a(AdmissionNewMessageView admissionNewMessageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        admissionNewMessageView.f51835a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        admissionNewMessageView.f51836b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        admissionNewMessageView.f51837c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        admissionNewMessageView.f51838d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        admissionNewMessageView.f51839e = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        admissionNewMessageView.f51840f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        admissionNewMessageView.f51841g = (VideoEffectPlayer) viewGroup.getChildAt(1);
        admissionNewMessageView.f51842h = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        admissionNewMessageView.f51843i = (XEGiftView) viewGroup.getChildAt(3);
    }
}
