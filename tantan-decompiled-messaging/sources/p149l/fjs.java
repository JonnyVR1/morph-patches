package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.skin.list.LiveGiftSkinItemView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class fjs {
    /* JADX INFO: renamed from: a */
    public static void m121629a(LiveGiftSkinItemView liveGiftSkinItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftSkinItemView._bg = (VImage) viewGroup.getChildAt(0);
        liveGiftSkinItemView._icon = (VDraweeView) viewGroup.getChildAt(1);
        liveGiftSkinItemView._title = (TextView) viewGroup.getChildAt(2);
        liveGiftSkinItemView._sub_title = (TextView) viewGroup.getChildAt(3);
    }
}
