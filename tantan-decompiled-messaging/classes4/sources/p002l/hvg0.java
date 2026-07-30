package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.SummonFansItemView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hvg0 {
    /* JADX INFO: renamed from: a */
    public static void m14835a(SummonFansItemView summonFansItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        summonFansItemView.f4584a = (BottomViewGroup) viewGroup.getChildAt(0);
        summonFansItemView.f4585b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        summonFansItemView.f4586c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        summonFansItemView.f4587d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        summonFansItemView.f4588e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        summonFansItemView.f4589f = viewGroup.getChildAt(1);
        summonFansItemView.f4590g = (TextView) viewGroup.getChildAt(2);
    }
}
