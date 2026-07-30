package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ebp0 {
    /* JADX INFO: renamed from: a */
    public static void m12305a(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView, View view) {
        voiceVirtualSettleSuccessView.d = (VoiceVirtualSettleSuccessView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualSettleSuccessView.e = viewGroup.getChildAt(0);
        voiceVirtualSettleSuccessView.f = viewGroup.getChildAt(1);
        voiceVirtualSettleSuccessView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceVirtualSettleSuccessView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualSettleSuccessView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        voiceVirtualSettleSuccessView.j = viewGroup.getChildAt(2);
    }
}
