package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileIntegrityOptView;
import p151v.VImage;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class soe {
    /* JADX INFO: renamed from: a */
    public static void m187189a(roe roeVar, View view) {
        roeVar.f164182u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        roeVar.f164183v = (VText) viewGroup.getChildAt(0);
        roeVar.f164184w = (ProfileIntegrityOptView) viewGroup.getChildAt(1);
        roeVar.f164185x = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        roeVar.f164186y = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        roeVar.f164187z = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        roeVar.f164171A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        roeVar.f164172B = (LinearLayout) viewGroup.getChildAt(2);
        roeVar.f164173C = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        roeVar.f164174D = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        roeVar.f164175E = (LinearLayout) viewGroup.getChildAt(3);
        roeVar.f164176F = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        roeVar.f164177G = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        roeVar.f164178H = (LinearLayout) viewGroup.getChildAt(4);
        roeVar.f164179I = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        roeVar.f164180J = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        roeVar.f164181K = (LinearLayout) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m187190b(roe roeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126154ya, viewGroup, false);
        m187189a(roeVar, viewInflate);
        return viewInflate;
    }
}
