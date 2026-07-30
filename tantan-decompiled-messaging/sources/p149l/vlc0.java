package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.RedPacketUserItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vlc0 {
    /* JADX INFO: renamed from: a */
    public static void m198795a(RedPacketUserItemView redPacketUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        redPacketUserItemView.f32277a = (VDraweeView) viewGroup.getChildAt(0);
        redPacketUserItemView.f32278b = (LinearLayout) viewGroup.getChildAt(1);
        redPacketUserItemView.f32279c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        redPacketUserItemView.f32280d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        redPacketUserItemView.f32281e = (LinearLayout) viewGroup.getChildAt(2);
        redPacketUserItemView.f32282f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        redPacketUserItemView.f32283g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        redPacketUserItemView.f32284h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        redPacketUserItemView.f32285i = viewGroup.getChildAt(3);
    }
}
