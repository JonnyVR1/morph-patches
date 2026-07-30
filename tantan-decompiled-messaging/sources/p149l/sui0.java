package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class sui0 {
    /* JADX INFO: renamed from: a */
    public static void m186014a(TopChatView topChatView, View view) {
        topChatView.f48951d = (TopChatView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topChatView.f48952e = (CardView) viewGroup.getChildAt(0);
        topChatView.f48953f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topChatView.f48954g = (VDraweeView) viewGroup.getChildAt(1);
        topChatView.f48955h = (VDraweeView) viewGroup.getChildAt(2);
        topChatView.f48956i = (VText) viewGroup.getChildAt(3);
        topChatView.f48957j = (AnimEffectPlayer) viewGroup.getChildAt(4);
    }
}
