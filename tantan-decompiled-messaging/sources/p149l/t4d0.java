package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightProfileCardView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class t4d0 {
    /* JADX INFO: renamed from: a */
    public static void m187177a(RightProfileCardView rightProfileCardView, View view) {
        rightProfileCardView.f46108a = (RightProfileCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightProfileCardView.f46109b = (ConstraintLayout) viewGroup.getChildAt(0);
        rightProfileCardView.f46110c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rightProfileCardView.f46111d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rightProfileCardView.f46112e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rightProfileCardView.f46113f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rightProfileCardView.f46114g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        rightProfileCardView.f46115h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        rightProfileCardView.f46116i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        rightProfileCardView.f46117j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
