package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import p151v.VCheckBox;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ffp0 {
    /* JADX INFO: renamed from: a */
    public static void m125409a(VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveItemInfoView.f53376d = (Guideline) viewGroup.getChildAt(0);
        voiceVirtualLoveItemInfoView.f53377e = (AnimEffectPlayer) viewGroup.getChildAt(1);
        voiceVirtualLoveItemInfoView.f53378f = (ImageView) viewGroup.getChildAt(2);
        voiceVirtualLoveItemInfoView.f53379g = (FrameLayout) viewGroup.getChildAt(3);
        voiceVirtualLoveItemInfoView.f53380h = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualLoveItemInfoView.f53381i = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        voiceVirtualLoveItemInfoView.f53382j = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceVirtualLoveItemInfoView.f53383k = (VLinear) viewGroup.getChildAt(4);
        voiceVirtualLoveItemInfoView.f53384l = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voiceVirtualLoveItemInfoView.f53385m = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        voiceVirtualLoveItemInfoView.f53386n = (VLinear) viewGroup.getChildAt(5);
        voiceVirtualLoveItemInfoView.f53387o = (ImageView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        voiceVirtualLoveItemInfoView.f53388p = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        voiceVirtualLoveItemInfoView.f53389q = (TextView) viewGroup.getChildAt(6);
        voiceVirtualLoveItemInfoView.f53390r = (VFrame) viewGroup.getChildAt(7);
        voiceVirtualLoveItemInfoView.f53391s = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
    }
}
