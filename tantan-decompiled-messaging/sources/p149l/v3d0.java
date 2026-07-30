package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightMedalItemView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class v3d0 {
    /* JADX INFO: renamed from: a */
    public static void m196848a(RightMedalItemView rightMedalItemView, View view) {
        rightMedalItemView.f46078a = (RightMedalItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightMedalItemView.f46079b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightMedalItemView.f46080c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightMedalItemView.f46081d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightMedalItemView.f46082e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightMedalItemView.f46083f = (CommonMedalView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightMedalItemView.f46084g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightMedalItemView.f46085h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightMedalItemView.f46086i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        rightMedalItemView.f46087j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
