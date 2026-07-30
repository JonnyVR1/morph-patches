package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.view.VoiceVirtualLovePlanetWidgetView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class k6p0 {
    /* JADX INFO: renamed from: a */
    public static void m144628a(VoiceVirtualLovePlanetWidgetView voiceVirtualLovePlanetWidgetView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLovePlanetWidgetView.f52584d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceVirtualLovePlanetWidgetView.f52585e = (Guideline) viewGroup.getChildAt(1);
        voiceVirtualLovePlanetWidgetView.f52586f = (AnimEffectPlayer) viewGroup.getChildAt(2);
        voiceVirtualLovePlanetWidgetView.f52587g = (CommonMaskAvatarView) viewGroup.getChildAt(3);
        voiceVirtualLovePlanetWidgetView.f52588h = (VLinear) viewGroup.getChildAt(4);
        voiceVirtualLovePlanetWidgetView.f52589i = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voiceVirtualLovePlanetWidgetView.f52590j = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        voiceVirtualLovePlanetWidgetView.f52591k = (TextView) viewGroup.getChildAt(5);
        voiceVirtualLovePlanetWidgetView.f52592l = (TextView) viewGroup.getChildAt(6);
        voiceVirtualLovePlanetWidgetView.f52593m = (TextView) viewGroup.getChildAt(7);
        voiceVirtualLovePlanetWidgetView.f52594n = (TextView) viewGroup.getChildAt(8);
        voiceVirtualLovePlanetWidgetView.f52595o = (TextView) viewGroup.getChildAt(9);
        voiceVirtualLovePlanetWidgetView.f52596p = (CommonMaskAvatarView) viewGroup.getChildAt(10);
        voiceVirtualLovePlanetWidgetView.f52597q = (VLinear) viewGroup.getChildAt(11);
        voiceVirtualLovePlanetWidgetView.f52598r = (ImageView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        voiceVirtualLovePlanetWidgetView.f52599s = (FocusTextView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        voiceVirtualLovePlanetWidgetView.f52600t = viewGroup.getChildAt(12);
        voiceVirtualLovePlanetWidgetView.f52601u = (TextView) viewGroup.getChildAt(13);
        voiceVirtualLovePlanetWidgetView.f52602v = (ImageView) viewGroup.getChildAt(14);
        voiceVirtualLovePlanetWidgetView.f52603w = (FrameLayout) viewGroup.getChildAt(15);
    }
}
