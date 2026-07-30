package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyItemView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class u6p0 {
    /* JADX INFO: renamed from: a */
    public static void m192016a(VoiceVirtualNineDeputyItemView voiceVirtualNineDeputyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualNineDeputyItemView.f52247a = (FrameLayout) viewGroup.getChildAt(0);
        voiceVirtualNineDeputyItemView.f52248b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceVirtualNineDeputyItemView.f52249c = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceVirtualNineDeputyItemView.f52250d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceVirtualNineDeputyItemView.f52251e = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voiceVirtualNineDeputyItemView.f52252f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voiceVirtualNineDeputyItemView.f52253g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        voiceVirtualNineDeputyItemView.f52254h = (VLinear) viewGroup.getChildAt(1);
        voiceVirtualNineDeputyItemView.f52255i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceVirtualNineDeputyItemView.f52256j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceVirtualNineDeputyItemView.f52257k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualNineDeputyItemView.f52258l = (VLinear) viewGroup.getChildAt(2);
        voiceVirtualNineDeputyItemView.f52259m = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceVirtualNineDeputyItemView.f52260n = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceVirtualNineDeputyItemView.f52261o = (AnimEffectPlayer) viewGroup.getChildAt(3);
    }
}
