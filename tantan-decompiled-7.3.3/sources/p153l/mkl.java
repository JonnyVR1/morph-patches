package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LiveTagView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeaderItemView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mkl {
    /* JADX INFO: renamed from: a */
    public static void m158811a(HourHeaderItemView hourHeaderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourHeaderItemView.f51442a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hourHeaderItemView.f51443b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hourHeaderItemView.f51444c = (LiveTagView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        hourHeaderItemView.f51445d = (VLinear) viewGroup.getChildAt(1);
        hourHeaderItemView.f51446e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hourHeaderItemView.f51447f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
