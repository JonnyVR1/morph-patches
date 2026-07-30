package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightMedalItemView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ybd0 {
    /* JADX INFO: renamed from: a */
    public static void m215018a(RightMedalItemView rightMedalItemView, View view) {
        rightMedalItemView.f46926a = (RightMedalItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightMedalItemView.f46927b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightMedalItemView.f46928c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightMedalItemView.f46929d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightMedalItemView.f46930e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightMedalItemView.f46931f = (CommonMedalView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightMedalItemView.f46932g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightMedalItemView.f46933h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightMedalItemView.f46934i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        rightMedalItemView.f46935j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
