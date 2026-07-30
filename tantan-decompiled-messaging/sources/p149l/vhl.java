package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.LiveTagView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourHeaderItemView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vhl {
    /* JADX INFO: renamed from: a */
    public static void m198465a(HourHeaderItemView hourHeaderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourHeaderItemView.f50594a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hourHeaderItemView.f50595b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hourHeaderItemView.f50596c = (LiveTagView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        hourHeaderItemView.f50597d = (VLinear) viewGroup.getChildAt(1);
        hourHeaderItemView.f50598e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hourHeaderItemView.f50599f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
