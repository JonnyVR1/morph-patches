package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.skin.list.LiveGiftSkinItemView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class gls {
    /* JADX INFO: renamed from: a */
    public static void m130696a(LiveGiftSkinItemView liveGiftSkinItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftSkinItemView._bg = (VImage) viewGroup.getChildAt(0);
        liveGiftSkinItemView._icon = (VDraweeView) viewGroup.getChildAt(1);
        liveGiftSkinItemView._title = (TextView) viewGroup.getChildAt(2);
        liveGiftSkinItemView._sub_title = (TextView) viewGroup.getChildAt(3);
    }
}
