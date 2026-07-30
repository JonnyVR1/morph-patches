package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileIntegrityOptView;
import p151v.VImage;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class loe {
    /* JADX INFO: renamed from: a */
    public static void m155048a(koe koeVar, View view) {
        koeVar.f127717u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        koeVar.f127718v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        koeVar.f127719w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        koeVar.f127720x = (ProfileIntegrityOptView) viewGroup.getChildAt(1);
        koeVar.f127721y = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        koeVar.f127722z = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        koeVar.f127714A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        koeVar.f127715B = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        koeVar.f127716C = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m155049b(koe koeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125442H9, viewGroup, false);
        m155048a(koeVar, viewInflate);
        return viewInflate;
    }
}
