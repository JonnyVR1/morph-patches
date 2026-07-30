package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ifu {
    /* JADX INFO: renamed from: a */
    public static void m135952a(LiveVChatCalledView liveVChatCalledView, View view) {
        liveVChatCalledView.f45342a = (LiveVChatCalledView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCalledView.f45343b = (VImage) viewGroup.getChildAt(0);
        liveVChatCalledView.f45344c = (VDraweeView) viewGroup.getChildAt(1);
        liveVChatCalledView.f45345d = (VImage) viewGroup.getChildAt(2);
        liveVChatCalledView.f45346e = (VLinear) viewGroup.getChildAt(3);
        liveVChatCalledView.f45347f = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveVChatCalledView.f45348g = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveVChatCalledView.f45349h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        liveVChatCalledView.f45350i = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        liveVChatCalledView.f45351j = (VFrame) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveVChatCalledView.f45352k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        liveVChatCalledView.f45353l = (VFrame) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveVChatCalledView.f45354m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        liveVChatCalledView.f45355n = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        liveVChatCalledView.f45356o = (VRelative) viewGroup.getChildAt(5);
        liveVChatCalledView.f45357p = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveVChatCalledView.f45358q = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }
}
