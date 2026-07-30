package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u6p0 {
    /* JADX INFO: renamed from: a */
    public static void m23289a(VoiceVirtualNineDeputyItemView voiceVirtualNineDeputyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualNineDeputyItemView.a = (FrameLayout) viewGroup.getChildAt(0);
        voiceVirtualNineDeputyItemView.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceVirtualNineDeputyItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceVirtualNineDeputyItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceVirtualNineDeputyItemView.e = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voiceVirtualNineDeputyItemView.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voiceVirtualNineDeputyItemView.g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        voiceVirtualNineDeputyItemView.h = viewGroup.getChildAt(1);
        voiceVirtualNineDeputyItemView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceVirtualNineDeputyItemView.j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceVirtualNineDeputyItemView.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualNineDeputyItemView.l = viewGroup.getChildAt(2);
        voiceVirtualNineDeputyItemView.m = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceVirtualNineDeputyItemView.n = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceVirtualNineDeputyItemView.o = viewGroup.getChildAt(3);
    }
}
