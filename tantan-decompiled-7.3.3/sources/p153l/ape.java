package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.MbtiLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileIntegrityOptView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ape {
    /* JADX INFO: renamed from: a */
    public static void m99312a(zoe zoeVar, View view) {
        zoeVar.f205328u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zoeVar.f205329v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        zoeVar.f205330w = (ProfileIntegrityOptView) viewGroup.getChildAt(1);
        zoeVar.f205331x = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zoeVar.f205332y = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        zoeVar.f205333z = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        zoeVar.f205321A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        zoeVar.f205322B = (LinearLayout) viewGroup.getChildAt(2);
        zoeVar.f205323C = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        zoeVar.f205324D = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        zoeVar.f205325E = (MbtiLayout) viewGroup.getChildAt(3);
        zoeVar.f205326F = (VLinear) viewGroup.getChildAt(4);
        zoeVar.f205327G = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m99313b(zoe zoeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125475Ja, viewGroup, false);
        m99312a(zoeVar, viewInflate);
        return viewInflate;
    }
}
