package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class t90 {
    /* JADX INFO: renamed from: a */
    public static void m189710a(AdmissionNewMessageView admissionNewMessageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        admissionNewMessageView.f52683a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        admissionNewMessageView.f52684b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        admissionNewMessageView.f52685c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        admissionNewMessageView.f52686d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        admissionNewMessageView.f52687e = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        admissionNewMessageView.f52688f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        admissionNewMessageView.f52689g = (VideoEffectPlayer) viewGroup.getChildAt(1);
        admissionNewMessageView.f52690h = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        admissionNewMessageView.f52691i = (XEGiftView) viewGroup.getChildAt(3);
    }
}
