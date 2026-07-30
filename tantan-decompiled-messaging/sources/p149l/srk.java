package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.LiveTagView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.GuardHeaderItemView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class srk {
    /* JADX INFO: renamed from: a */
    public static void m185693a(GuardHeaderItemView guardHeaderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        guardHeaderItemView.f50453a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        guardHeaderItemView.f50454b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        guardHeaderItemView.f50455c = (LiveTagView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        guardHeaderItemView.f50456d = (VLinear) viewGroup.getChildAt(1);
        guardHeaderItemView.f50457e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        guardHeaderItemView.f50458f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
