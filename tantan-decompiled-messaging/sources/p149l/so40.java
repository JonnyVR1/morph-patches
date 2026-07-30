package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class so40 {
    /* JADX INFO: renamed from: a */
    public static void m185235a(NormalVoiceDeputyItemView normalVoiceDeputyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        normalVoiceDeputyItemView.f52985a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        normalVoiceDeputyItemView.f52986b = (FrameLayout) viewGroup.getChildAt(1);
        normalVoiceDeputyItemView.f52987c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        normalVoiceDeputyItemView.f52988d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        normalVoiceDeputyItemView.f52989e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        normalVoiceDeputyItemView.f52990f = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        normalVoiceDeputyItemView.f52991g = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        normalVoiceDeputyItemView.f52992h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        normalVoiceDeputyItemView.f52993i = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        normalVoiceDeputyItemView.f52994j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        normalVoiceDeputyItemView.f52995k = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        normalVoiceDeputyItemView.f52996l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        normalVoiceDeputyItemView.f52997m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        normalVoiceDeputyItemView.f52998n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        normalVoiceDeputyItemView.f52999o = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11)).getChildAt(0);
        normalVoiceDeputyItemView.f53000p = (VoiceTripleDiceView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11)).getChildAt(1);
        normalVoiceDeputyItemView.f53001q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11)).getChildAt(2);
        normalVoiceDeputyItemView.f53002r = (VLinear) viewGroup.getChildAt(2);
        normalVoiceDeputyItemView.f53003s = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        normalVoiceDeputyItemView.f53004t = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        normalVoiceDeputyItemView.f53005u = (VLinear) viewGroup.getChildAt(3);
        normalVoiceDeputyItemView.f53006v = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        normalVoiceDeputyItemView.f53007w = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        normalVoiceDeputyItemView.f53008x = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
