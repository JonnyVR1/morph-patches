package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.RedPacketUserItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cuc0 {
    /* JADX INFO: renamed from: a */
    public static void m112665a(RedPacketUserItemView redPacketUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        redPacketUserItemView.f33125a = (VDraweeView) viewGroup.getChildAt(0);
        redPacketUserItemView.f33126b = (LinearLayout) viewGroup.getChildAt(1);
        redPacketUserItemView.f33127c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        redPacketUserItemView.f33128d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        redPacketUserItemView.f33129e = (LinearLayout) viewGroup.getChildAt(2);
        redPacketUserItemView.f33130f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        redPacketUserItemView.f33131g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        redPacketUserItemView.f33132h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        redPacketUserItemView.f33133i = viewGroup.getChildAt(3);
    }
}
