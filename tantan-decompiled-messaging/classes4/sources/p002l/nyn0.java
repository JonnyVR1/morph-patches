package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMemberItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nyn0 {
    /* JADX INFO: renamed from: a */
    public static void m19166a(VoiceMemberItemView voiceMemberItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMemberItemView.d = viewGroup.getChildAt(0);
        voiceMemberItemView.e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        voiceMemberItemView.f = (ImageView) viewGroup.getChildAt(2);
        voiceMemberItemView.g = viewGroup.getChildAt(3);
        voiceMemberItemView.h = viewGroup.getChildAt(4);
        voiceMemberItemView.i = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voiceMemberItemView.j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        voiceMemberItemView.k = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        voiceMemberItemView.l = viewGroup.getChildAt(5);
        voiceMemberItemView.m = viewGroup.getChildAt(6);
    }
}
