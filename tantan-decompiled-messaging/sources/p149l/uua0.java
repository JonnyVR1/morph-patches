package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.popup.ProfileThinPopup;
import com.p046p1.mobile.putong.core.p053ui.popup.ProfileThinPopup_LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.popup.ProfileThinPopup_MovableImage;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uua0 {
    /* JADX INFO: renamed from: a */
    public static void m195329a(ProfileThinPopup profileThinPopup, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileThinPopup.f32844c = (LinearLayout) viewGroup.getChildAt(0);
        profileThinPopup.f32845d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileThinPopup.f32846e = (ProfileThinPopup_LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileThinPopup.f32847f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileThinPopup.f32848g = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileThinPopup.f32849h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileThinPopup.f32850i = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(1);
        profileThinPopup.f32851j = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(2);
        profileThinPopup.f32852k = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(3);
        profileThinPopup.f32853l = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(4);
        profileThinPopup.f32854m = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(5);
        profileThinPopup.f32855n = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m195330b(ProfileThinPopup profileThinPopup, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96069wd, viewGroup, false);
        m195329a(profileThinPopup, viewInflate);
        return viewInflate;
    }
}
