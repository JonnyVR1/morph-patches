package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.set.LiveGiftWallSetItemView;

/* JADX INFO: loaded from: classes4.dex */
public class hns {
    /* JADX INFO: renamed from: a */
    public static void m132013a(LiveGiftWallSetItemView liveGiftWallSetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftWallSetItemView._title = (TextView) viewGroup.getChildAt(0);
        liveGiftWallSetItemView._recycler = (RecyclerView) viewGroup.getChildAt(2);
    }
}
