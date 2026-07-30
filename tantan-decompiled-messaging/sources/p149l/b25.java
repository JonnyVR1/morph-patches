package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.item.ChatRoomBubbleItemView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class b25 {
    /* JADX INFO: renamed from: a */
    public static void m99897a(ChatRoomBubbleItemView chatRoomBubbleItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatRoomBubbleItemView.f35430d = (ConstraintLayout) viewGroup.getChildAt(0);
        chatRoomBubbleItemView.f35431e = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chatRoomBubbleItemView.f35432f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        chatRoomBubbleItemView.f35433g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        chatRoomBubbleItemView.f35434h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        chatRoomBubbleItemView.f35435i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        chatRoomBubbleItemView.f35436j = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chatRoomBubbleItemView.f35437k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        chatRoomBubbleItemView.f35438l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        chatRoomBubbleItemView.f35439m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
