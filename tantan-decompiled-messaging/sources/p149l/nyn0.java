package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMemberItemView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nyn0 {
    /* JADX INFO: renamed from: a */
    public static void m162027a(VoiceMemberItemView voiceMemberItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMemberItemView.f52810d = viewGroup.getChildAt(0);
        voiceMemberItemView.f52811e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        voiceMemberItemView.f52812f = (ImageView) viewGroup.getChildAt(2);
        voiceMemberItemView.f52813g = (VDraweeView) viewGroup.getChildAt(3);
        voiceMemberItemView.f52814h = (VLinear) viewGroup.getChildAt(4);
        voiceMemberItemView.f52815i = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voiceMemberItemView.f52816j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        voiceMemberItemView.f52817k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        voiceMemberItemView.f52818l = (AnimEffectPlayer) viewGroup.getChildAt(5);
        voiceMemberItemView.f52819m = (AnimEffectPlayer) viewGroup.getChildAt(6);
    }
}
