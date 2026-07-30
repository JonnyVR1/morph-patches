package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p001ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p1.mobile.putong.core.ui.popup.ProfileFakeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bm90 {
    /* JADX INFO: renamed from: a */
    public static void m5742a(ProfileFakeView profileFakeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileFakeView.a = (RelativeLayout) viewGroup.getChildAt(0);
        profileFakeView.b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileFakeView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileFakeView.d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        profileFakeView.e = (FakeTwoCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        profileFakeView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileFakeView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
