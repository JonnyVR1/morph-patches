package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCalledView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jhu {
    /* JADX INFO: renamed from: a */
    public static void m144935a(LiveVChatCalledView liveVChatCalledView, View view) {
        liveVChatCalledView.f46190a = (LiveVChatCalledView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCalledView.f46191b = (VImage) viewGroup.getChildAt(0);
        liveVChatCalledView.f46192c = (VDraweeView) viewGroup.getChildAt(1);
        liveVChatCalledView.f46193d = (VImage) viewGroup.getChildAt(2);
        liveVChatCalledView.f46194e = (VLinear) viewGroup.getChildAt(3);
        liveVChatCalledView.f46195f = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveVChatCalledView.f46196g = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        liveVChatCalledView.f46197h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        liveVChatCalledView.f46198i = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        liveVChatCalledView.f46199j = (VFrame) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveVChatCalledView.f46200k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        liveVChatCalledView.f46201l = (VFrame) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveVChatCalledView.f46202m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        liveVChatCalledView.f46203n = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        liveVChatCalledView.f46204o = (VRelative) viewGroup.getChildAt(5);
        liveVChatCalledView.f46205p = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveVChatCalledView.f46206q = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }
}
