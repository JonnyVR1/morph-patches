package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ebp0 {
    /* JADX INFO: renamed from: a */
    public static void m115524a(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView, View view) {
        voiceVirtualSettleSuccessView._root = (VoiceVirtualSettleSuccessView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualSettleSuccessView._bg = viewGroup.getChildAt(0);
        voiceVirtualSettleSuccessView._content_layout = (VLinear) viewGroup.getChildAt(1);
        voiceVirtualSettleSuccessView._avatar = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceVirtualSettleSuccessView._title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualSettleSuccessView._summary = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceVirtualSettleSuccessView._svga = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
