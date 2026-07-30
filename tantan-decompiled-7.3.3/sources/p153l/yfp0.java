package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyItemView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yfp0 {
    /* JADX INFO: renamed from: a */
    public static void m215809a(VoiceVirtualNineDeputyItemView voiceVirtualNineDeputyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualNineDeputyItemView.f53095a = (FrameLayout) viewGroup.getChildAt(0);
        voiceVirtualNineDeputyItemView.f53096b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceVirtualNineDeputyItemView.f53097c = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceVirtualNineDeputyItemView.f53098d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceVirtualNineDeputyItemView.f53099e = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voiceVirtualNineDeputyItemView.f53100f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voiceVirtualNineDeputyItemView.f53101g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        voiceVirtualNineDeputyItemView.f53102h = (VLinear) viewGroup.getChildAt(1);
        voiceVirtualNineDeputyItemView.f53103i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceVirtualNineDeputyItemView.f53104j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceVirtualNineDeputyItemView.f53105k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualNineDeputyItemView.f53106l = (VLinear) viewGroup.getChildAt(2);
        voiceVirtualNineDeputyItemView.f53107m = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceVirtualNineDeputyItemView.f53108n = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceVirtualNineDeputyItemView.f53109o = (AnimEffectPlayer) viewGroup.getChildAt(3);
    }
}
