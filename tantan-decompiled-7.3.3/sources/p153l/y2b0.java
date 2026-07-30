package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.popup.ProfileThinPopup;
import com.p051p1.mobile.putong.core.p058ui.popup.ProfileThinPopup_LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.popup.ProfileThinPopup_MovableImage;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y2b0 {
    /* JADX INFO: renamed from: a */
    public static void m214048a(ProfileThinPopup profileThinPopup, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileThinPopup.f33692c = (LinearLayout) viewGroup.getChildAt(0);
        profileThinPopup.f33693d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileThinPopup.f33694e = (ProfileThinPopup_LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileThinPopup.f33695f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileThinPopup.f33696g = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileThinPopup.f33697h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileThinPopup.f33698i = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(1);
        profileThinPopup.f33699j = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(2);
        profileThinPopup.f33700k = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(3);
        profileThinPopup.f33701l = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(4);
        profileThinPopup.f33702m = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(5);
        profileThinPopup.f33703n = (ProfileThinPopup_MovableImage) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m214049b(ProfileThinPopup profileThinPopup, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125380Dd, viewGroup, false);
        m214048a(profileThinPopup, viewInflate);
        return viewInflate;
    }
}
