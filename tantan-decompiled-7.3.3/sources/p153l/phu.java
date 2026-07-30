package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class phu {
    /* JADX INFO: renamed from: a */
    public static void m172337a(LiveVChatCallingView liveVChatCallingView, View view) {
        liveVChatCallingView.f46214a = (LiveVChatCallingView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCallingView.f46215b = (VImage) viewGroup.getChildAt(0);
        liveVChatCallingView.f46216c = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveVChatCallingView.f46217d = (VDraweeView) viewGroup.getChildAt(2);
        liveVChatCallingView.f46218e = (VImage) viewGroup.getChildAt(3);
        liveVChatCallingView.f46219f = (VLinear) viewGroup.getChildAt(4);
        liveVChatCallingView.f46220g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveVChatCallingView.f46221h = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveVChatCallingView.f46222i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        liveVChatCallingView.f46223j = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        liveVChatCallingView.f46224k = (VFrame) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveVChatCallingView.f46225l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        liveVChatCallingView.f46226m = (VRelative) viewGroup.getChildAt(6);
        liveVChatCallingView.f46227n = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        liveVChatCallingView.f46228o = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
    }
}
