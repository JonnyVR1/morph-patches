package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ze70 {
    /* JADX INFO: renamed from: a */
    public static void m218278a(PicksItemView picksItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        picksItemView._personal_info = (VRelative) viewGroup.getChildAt(1);
        picksItemView._age = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        picksItemView._name = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        picksItemView._action_btn = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        picksItemView._verification_icon = (VImage) viewGroup.getChildAt(2);
        picksItemView._mask = viewGroup.getChildAt(3);
    }
}
