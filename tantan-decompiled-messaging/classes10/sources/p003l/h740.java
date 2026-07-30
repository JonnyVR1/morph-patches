package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p001ui.growth.fakeexperience.view.FakeTwoCardView;
import com.p1.mobile.putong.core.ui.popup.NewProfileFakeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h740 {
    /* JADX INFO: renamed from: a */
    public static void m6929a(NewProfileFakeView newProfileFakeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newProfileFakeView.a = (RelativeLayout) viewGroup.getChildAt(0);
        newProfileFakeView.b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newProfileFakeView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newProfileFakeView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        newProfileFakeView.e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        newProfileFakeView.f = (FakeTwoCardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newProfileFakeView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        newProfileFakeView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newProfileFakeView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        newProfileFakeView.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        newProfileFakeView.k = viewGroup.getChildAt(2);
    }
}
