package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import p147v.VCheckBox;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class b6p0 {
    /* JADX INFO: renamed from: a */
    public static void m100468a(VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveItemInfoView.f52528d = (Guideline) viewGroup.getChildAt(0);
        voiceVirtualLoveItemInfoView.f52529e = (AnimEffectPlayer) viewGroup.getChildAt(1);
        voiceVirtualLoveItemInfoView.f52530f = (ImageView) viewGroup.getChildAt(2);
        voiceVirtualLoveItemInfoView.f52531g = (FrameLayout) viewGroup.getChildAt(3);
        voiceVirtualLoveItemInfoView.f52532h = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualLoveItemInfoView.f52533i = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        voiceVirtualLoveItemInfoView.f52534j = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceVirtualLoveItemInfoView.f52535k = (VLinear) viewGroup.getChildAt(4);
        voiceVirtualLoveItemInfoView.f52536l = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voiceVirtualLoveItemInfoView.f52537m = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        voiceVirtualLoveItemInfoView.f52538n = (VLinear) viewGroup.getChildAt(5);
        voiceVirtualLoveItemInfoView.f52539o = (ImageView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        voiceVirtualLoveItemInfoView.f52540p = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        voiceVirtualLoveItemInfoView.f52541q = (TextView) viewGroup.getChildAt(6);
        voiceVirtualLoveItemInfoView.f52542r = (VFrame) viewGroup.getChildAt(7);
        voiceVirtualLoveItemInfoView.f52543s = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
    }
}
