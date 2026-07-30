package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatCallingView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ofu {
    /* JADX INFO: renamed from: a */
    public static void m164108a(LiveVChatCallingView liveVChatCallingView, View view) {
        liveVChatCallingView.f45366a = (LiveVChatCallingView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatCallingView.f45367b = (VImage) viewGroup.getChildAt(0);
        liveVChatCallingView.f45368c = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveVChatCallingView.f45369d = (VDraweeView) viewGroup.getChildAt(2);
        liveVChatCallingView.f45370e = (VImage) viewGroup.getChildAt(3);
        liveVChatCallingView.f45371f = (VLinear) viewGroup.getChildAt(4);
        liveVChatCallingView.f45372g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        liveVChatCallingView.f45373h = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        liveVChatCallingView.f45374i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        liveVChatCallingView.f45375j = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        liveVChatCallingView.f45376k = (VFrame) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        liveVChatCallingView.f45377l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        liveVChatCallingView.f45378m = (VRelative) viewGroup.getChildAt(6);
        liveVChatCallingView.f45379n = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        liveVChatCallingView.f45380o = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
    }
}
