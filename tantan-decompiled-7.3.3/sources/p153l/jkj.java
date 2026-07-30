package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileItemTextView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class jkj {
    /* JADX INFO: renamed from: a */
    public static void m145847a(ikj ikjVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ikjVar.f115379a = (VText_Default_Bold) viewGroup.getChildAt(0);
        ikjVar.f115380b = (TextView) viewGroup.getChildAt(1);
        ikjVar.f115381c = (EditProfileItemTextView) viewGroup.getChildAt(2);
        ikjVar.f115382d = (EditProfileItemTextView) viewGroup.getChildAt(3);
        ikjVar.f115383e = (EditProfileItemTextView) viewGroup.getChildAt(4);
        ikjVar.f115384f = (EditProfileItemTextView) viewGroup.getChildAt(5);
        ikjVar.f115385g = (VLinear) viewGroup.getChildAt(6);
        ikjVar.f115386h = (VLinear) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        ikjVar.f115387i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        ikjVar.f115388j = (VLinear) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        ikjVar.f115389k = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        ikjVar.f115390l = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        ikjVar.f115391m = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(2);
        ikjVar.f115392n = (ProfileLoopActionLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        ikjVar.f115393o = (VButton) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m145848b(ikj ikjVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167590s, viewGroup, false);
        m145847a(ikjVar, viewInflate);
        return viewInflate;
    }
}
