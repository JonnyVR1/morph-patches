package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p046p1.mobile.putong.core.p053ui.popup.ProfileFakeView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bm90 {
    /* JADX INFO: renamed from: a */
    public static void m102606a(ProfileFakeView profileFakeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileFakeView.f32837a = (RelativeLayout) viewGroup.getChildAt(0);
        profileFakeView.f32838b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileFakeView.f32839c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileFakeView.f32840d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        profileFakeView.f32841e = (FakeTwoCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        profileFakeView.f32842f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileFakeView.f32843g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
