package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.quickaudio.recyclerview.item.ChatRoomBubbleItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b25 {
    /* JADX INFO: renamed from: a */
    public static void m5675a(ChatRoomBubbleItemView chatRoomBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatRoomBubbleItemView.d = viewGroup.getChildAt(0);
        chatRoomBubbleItemView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chatRoomBubbleItemView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        chatRoomBubbleItemView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        chatRoomBubbleItemView.h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        chatRoomBubbleItemView.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        chatRoomBubbleItemView.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chatRoomBubbleItemView.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        chatRoomBubbleItemView.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        chatRoomBubbleItemView.m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
