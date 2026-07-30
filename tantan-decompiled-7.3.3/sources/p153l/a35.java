package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.item.ChatRoomBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class a35 {
    /* JADX INFO: renamed from: a */
    public static void m95769a(ChatRoomBubbleItemView chatRoomBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatRoomBubbleItemView.f36278d = (ConstraintLayout) viewGroup.getChildAt(0);
        chatRoomBubbleItemView.f36279e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chatRoomBubbleItemView.f36280f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        chatRoomBubbleItemView.f36281g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        chatRoomBubbleItemView.f36282h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        chatRoomBubbleItemView.f36283i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        chatRoomBubbleItemView.f36284j = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chatRoomBubbleItemView.f36285k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        chatRoomBubbleItemView.f36286l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        chatRoomBubbleItemView.f36287m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
