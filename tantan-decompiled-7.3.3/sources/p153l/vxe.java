package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.EmailVerifyCodeView;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VImage;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class vxe {
    /* JADX INFO: renamed from: a */
    public static void m203842a(uxe uxeVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uxeVar.f181432c = (VScroll) viewGroup.getChildAt(0);
        uxeVar.f181433d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        uxeVar.f181434e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        uxeVar.f181435f = (EmailVerifyCodeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        uxeVar.f181436g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        uxeVar.f181437h = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        uxeVar.f181438i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        uxeVar.f181439j = (ConstraintLayout) viewGroup.getChildAt(1);
        uxeVar.f181440k = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        uxeVar.f181441l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m203843b(uxe uxeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109132r, viewGroup, false);
        m203842a(uxeVar, viewInflate);
        return viewInflate;
    }
}
