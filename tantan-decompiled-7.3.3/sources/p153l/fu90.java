package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p051p1.mobile.putong.core.p058ui.popup.ProfileFakeView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fu90 {
    /* JADX INFO: renamed from: a */
    public static void m127439a(ProfileFakeView profileFakeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileFakeView.f33685a = (RelativeLayout) viewGroup.getChildAt(0);
        profileFakeView.f33686b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileFakeView.f33687c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileFakeView.f33688d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        profileFakeView.f33689e = (FakeTwoCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        profileFakeView.f33690f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileFakeView.f33691g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
