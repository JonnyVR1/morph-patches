package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileItemTextView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import p147v.VButton;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class phj {
    /* JADX INFO: renamed from: a */
    public static void m168974a(ohj ohjVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ohjVar.f143983a = (VText_Default_Bold) viewGroup.getChildAt(0);
        ohjVar.f143984b = (TextView) viewGroup.getChildAt(1);
        ohjVar.f143985c = (EditProfileItemTextView) viewGroup.getChildAt(2);
        ohjVar.f143986d = (EditProfileItemTextView) viewGroup.getChildAt(3);
        ohjVar.f143987e = (EditProfileItemTextView) viewGroup.getChildAt(4);
        ohjVar.f143988f = (EditProfileItemTextView) viewGroup.getChildAt(5);
        ohjVar.f143989g = (VLinear) viewGroup.getChildAt(6);
        ohjVar.f143990h = (VLinear) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        ohjVar.f143991i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        ohjVar.f143992j = (VLinear) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        ohjVar.f143993k = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        ohjVar.f143994l = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        ohjVar.f143995m = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(2);
        ohjVar.f143996n = (ProfileLoopActionLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        ohjVar.f143997o = (VButton) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m168975b(ohj ohjVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137376s, viewGroup, false);
        m168974a(ohjVar, viewInflate);
        return viewInflate;
    }
}
