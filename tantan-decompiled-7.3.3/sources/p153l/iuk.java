package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LiveTagView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.GuardHeaderItemView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iuk {
    /* JADX INFO: renamed from: a */
    public static void m142198a(GuardHeaderItemView guardHeaderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        guardHeaderItemView.f51301a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        guardHeaderItemView.f51302b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        guardHeaderItemView.f51303c = (LiveTagView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        guardHeaderItemView.f51304d = (VLinear) viewGroup.getChildAt(1);
        guardHeaderItemView.f51305e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        guardHeaderItemView.f51306f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
