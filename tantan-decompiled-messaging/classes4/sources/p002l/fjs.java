package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.skin.list.LiveGiftSkinItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fjs {
    /* JADX INFO: renamed from: a */
    public static void m13265a(LiveGiftSkinItemView liveGiftSkinItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftSkinItemView._bg = viewGroup.getChildAt(0);
        liveGiftSkinItemView._icon = viewGroup.getChildAt(1);
        liveGiftSkinItemView._title = (TextView) viewGroup.getChildAt(2);
        liveGiftSkinItemView._sub_title = (TextView) viewGroup.getChildAt(3);
    }
}
