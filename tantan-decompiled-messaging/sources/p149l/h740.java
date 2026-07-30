package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p046p1.mobile.putong.core.p053ui.popup.NewProfileFakeView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h740 {
    /* JADX INFO: renamed from: a */
    public static void m129619a(NewProfileFakeView newProfileFakeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newProfileFakeView.f32823a = (RelativeLayout) viewGroup.getChildAt(0);
        newProfileFakeView.f32824b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newProfileFakeView.f32825c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newProfileFakeView.f32826d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        newProfileFakeView.f32827e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        newProfileFakeView.f32828f = (FakeTwoCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newProfileFakeView.f32829g = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newProfileFakeView.f32830h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newProfileFakeView.f32831i = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        newProfileFakeView.f32832j = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        newProfileFakeView.f32833k = (VImage) viewGroup.getChildAt(2);
    }
}
