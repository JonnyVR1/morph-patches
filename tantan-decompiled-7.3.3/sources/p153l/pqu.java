package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatOptItemView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatOptView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class pqu {
    /* JADX INFO: renamed from: a */
    public static void m173420a(LiveVChatOptView liveVChatOptView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatOptView.f46251d = (VText) viewGroup.getChildAt(0);
        liveVChatOptView.f46252e = (LiveVChatOptItemView) viewGroup.getChildAt(1);
        liveVChatOptView.f46253f = (LiveVChatOptItemView) viewGroup.getChildAt(2);
        liveVChatOptView.f46254g = (LiveVChatOptItemView) viewGroup.getChildAt(3);
        liveVChatOptView.f46255h = (LiveVChatOptItemView) viewGroup.getChildAt(4);
        liveVChatOptView.f46256i = (VDraweeView) viewGroup.getChildAt(5);
    }
}
