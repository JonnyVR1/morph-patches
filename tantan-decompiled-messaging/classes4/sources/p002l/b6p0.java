package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class b6p0 {
    /* JADX INFO: renamed from: a */
    public static void m10171a(VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveItemInfoView.d = viewGroup.getChildAt(0);
        voiceVirtualLoveItemInfoView.e = viewGroup.getChildAt(1);
        voiceVirtualLoveItemInfoView.f = (ImageView) viewGroup.getChildAt(2);
        voiceVirtualLoveItemInfoView.g = (FrameLayout) viewGroup.getChildAt(3);
        voiceVirtualLoveItemInfoView.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualLoveItemInfoView.i = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        voiceVirtualLoveItemInfoView.j = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        voiceVirtualLoveItemInfoView.k = viewGroup.getChildAt(4);
        voiceVirtualLoveItemInfoView.l = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voiceVirtualLoveItemInfoView.m = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        voiceVirtualLoveItemInfoView.n = viewGroup.getChildAt(5);
        voiceVirtualLoveItemInfoView.o = (ImageView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        voiceVirtualLoveItemInfoView.p = (TextView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        voiceVirtualLoveItemInfoView.q = (TextView) viewGroup.getChildAt(6);
        voiceVirtualLoveItemInfoView.r = viewGroup.getChildAt(7);
        voiceVirtualLoveItemInfoView.s = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
    }
}
