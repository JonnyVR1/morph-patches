package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMemberItemView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r7o0 {
    /* JADX INFO: renamed from: a */
    public static void m180163a(VoiceMemberItemView voiceMemberItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMemberItemView.f53658d = viewGroup.getChildAt(0);
        voiceMemberItemView.f53659e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        voiceMemberItemView.f53660f = (ImageView) viewGroup.getChildAt(2);
        voiceMemberItemView.f53661g = (VDraweeView) viewGroup.getChildAt(3);
        voiceMemberItemView.f53662h = (VLinear) viewGroup.getChildAt(4);
        voiceMemberItemView.f53663i = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voiceMemberItemView.f53664j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        voiceMemberItemView.f53665k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        voiceMemberItemView.f53666l = (AnimEffectPlayer) viewGroup.getChildAt(5);
        voiceMemberItemView.f53667m = (AnimEffectPlayer) viewGroup.getChildAt(6);
    }
}
