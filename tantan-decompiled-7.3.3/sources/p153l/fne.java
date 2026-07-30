package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileItemTextView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class fne {
    /* JADX INFO: renamed from: a */
    public static void m126364a(ene eneVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        eneVar.f94772u = (EditProfileItemTextView) viewGroup.getChildAt(1);
        eneVar.f94773v = (EditProfileItemTextView) viewGroup.getChildAt(2);
        eneVar.f94774w = (EditProfileItemTextView) viewGroup.getChildAt(3);
        eneVar.f94775x = (EditProfileItemTextView) viewGroup.getChildAt(4);
        eneVar.f94776y = (VLinear) viewGroup.getChildAt(5);
        eneVar.f94777z = (VLinear) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        eneVar.f94764A = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        eneVar.f94765B = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        eneVar.f94766C = (VLinear) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        eneVar.f94767D = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        eneVar.f94768E = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1);
        eneVar.f94769F = (EditProfileGameImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m126365b(ene eneVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125376D9, viewGroup, false);
        m126364a(eneVar, viewInflate);
        return viewInflate;
    }
}
