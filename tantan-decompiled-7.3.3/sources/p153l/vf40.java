package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p051p1.mobile.putong.core.p058ui.popup.NewProfileFakeView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vf40 {
    /* JADX INFO: renamed from: a */
    public static void m201116a(NewProfileFakeView newProfileFakeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newProfileFakeView.f33671a = (RelativeLayout) viewGroup.getChildAt(0);
        newProfileFakeView.f33672b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newProfileFakeView.f33673c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newProfileFakeView.f33674d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        newProfileFakeView.f33675e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        newProfileFakeView.f33676f = (FakeTwoCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newProfileFakeView.f33677g = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newProfileFakeView.f33678h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newProfileFakeView.f33679i = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        newProfileFakeView.f33680j = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        newProfileFakeView.f33681k = (VImage) viewGroup.getChildAt(2);
    }
}
