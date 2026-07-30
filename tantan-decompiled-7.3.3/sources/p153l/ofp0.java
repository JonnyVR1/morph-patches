package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.view.VoiceVirtualLovePlanetWidgetView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ofp0 {
    /* JADX INFO: renamed from: a */
    public static void m167472a(VoiceVirtualLovePlanetWidgetView voiceVirtualLovePlanetWidgetView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLovePlanetWidgetView.f53432d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceVirtualLovePlanetWidgetView.f53433e = (Guideline) viewGroup.getChildAt(1);
        voiceVirtualLovePlanetWidgetView.f53434f = (AnimEffectPlayer) viewGroup.getChildAt(2);
        voiceVirtualLovePlanetWidgetView.f53435g = (CommonMaskAvatarView) viewGroup.getChildAt(3);
        voiceVirtualLovePlanetWidgetView.f53436h = (VLinear) viewGroup.getChildAt(4);
        voiceVirtualLovePlanetWidgetView.f53437i = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voiceVirtualLovePlanetWidgetView.f53438j = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        voiceVirtualLovePlanetWidgetView.f53439k = (TextView) viewGroup.getChildAt(5);
        voiceVirtualLovePlanetWidgetView.f53440l = (TextView) viewGroup.getChildAt(6);
        voiceVirtualLovePlanetWidgetView.f53441m = (TextView) viewGroup.getChildAt(7);
        voiceVirtualLovePlanetWidgetView.f53442n = (TextView) viewGroup.getChildAt(8);
        voiceVirtualLovePlanetWidgetView.f53443o = (TextView) viewGroup.getChildAt(9);
        voiceVirtualLovePlanetWidgetView.f53444p = (CommonMaskAvatarView) viewGroup.getChildAt(10);
        voiceVirtualLovePlanetWidgetView.f53445q = (VLinear) viewGroup.getChildAt(11);
        voiceVirtualLovePlanetWidgetView.f53446r = (ImageView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        voiceVirtualLovePlanetWidgetView.f53447s = (FocusTextView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        voiceVirtualLovePlanetWidgetView.f53448t = viewGroup.getChildAt(12);
        voiceVirtualLovePlanetWidgetView.f53449u = (TextView) viewGroup.getChildAt(13);
        voiceVirtualLovePlanetWidgetView.f53450v = (ImageView) viewGroup.getChildAt(14);
        voiceVirtualLovePlanetWidgetView.f53451w = (FrameLayout) viewGroup.getChildAt(15);
    }
}
