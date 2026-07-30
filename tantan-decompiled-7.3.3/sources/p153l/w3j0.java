package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w3j0 {
    /* JADX INFO: renamed from: a */
    public static void m204767a(TopChatView topChatView, View view) {
        topChatView.f49799d = (TopChatView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topChatView.f49800e = (CardView) viewGroup.getChildAt(0);
        topChatView.f49801f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topChatView.f49802g = (VDraweeView) viewGroup.getChildAt(1);
        topChatView.f49803h = (VDraweeView) viewGroup.getChildAt(2);
        topChatView.f49804i = (VText) viewGroup.getChildAt(3);
        topChatView.f49805j = (AnimEffectPlayer) viewGroup.getChildAt(4);
    }
}
