package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.GiftWallPageView;
import com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.VoiceGiftWallBriefView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class c0k {
    /* JADX INFO: renamed from: a */
    public static void m104760a(GiftWallPageView giftWallPageView, View view) {
        giftWallPageView._root = (GiftWallPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        giftWallPageView._gift_wall_enter = (VoiceGiftWallBriefView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        giftWallPageView._mini_tabs = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        giftWallPageView._tab_all = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        giftWallPageView._tab_light = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        giftWallPageView._tab_dark = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        giftWallPageView._empty = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        giftWallPageView._empty_icon = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        giftWallPageView._empty_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        giftWallPageView._allRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        giftWallPageView._lightRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        giftWallPageView._darkRecyclerView = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
