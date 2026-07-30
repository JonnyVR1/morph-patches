package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.view.LiveHeadAnimView;
import com.p051p1.mobile.putong.newui.view.InnerClickSpanTextView;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class kbi {
    /* JADX INFO: renamed from: a */
    public static void m149059a(jbi jbiVar, View view) {
        jbiVar.f119882J = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jbiVar.f119884K = viewGroup.getChildAt(0);
        jbiVar.f119886L = (LinearLayout) viewGroup.getChildAt(1);
        jbiVar.f119888M = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        jbiVar.f119890N = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        jbiVar.f119892O = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        jbiVar.f119894P = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        jbiVar.f119896Q = viewGroup.getChildAt(2);
        jbiVar.f119898R = (ConstraintLayout) viewGroup.getChildAt(3);
        jbiVar.f119900S = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        jbiVar.f119902T = (InnerClickSpanTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        jbiVar.f119904U = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        jbiVar.f119906V = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        jbiVar.f119908W = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        jbiVar.f119910X = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(0);
        jbiVar.f119912Y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(1);
        jbiVar.f119914Z = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5);
        jbiVar.f119926k0 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5)).getChildAt(0);
        jbiVar.f119931p0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(6);
        jbiVar.f119877E0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(7);
        jbiVar.f119878F0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(8);
        jbiVar.f119879G0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(9);
        jbiVar.f119880H0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(10);
        jbiVar.f119881I0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(11);
        jbiVar.f119883J0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(12);
        jbiVar.f119885K0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(13);
        jbiVar.f119887L0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(14);
        jbiVar.f119889M0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(15);
        jbiVar.f119891N0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(16);
        jbiVar.f119893O0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(17);
        jbiVar.f119895P0 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(18);
        jbiVar.f119897Q0 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(19);
        jbiVar.f119899R0 = (LiveHeadAnimView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(20);
        jbiVar.f119901S0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(21);
        jbiVar.f119903T0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(22);
        jbiVar.f119905U0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(23);
        jbiVar.f119907V0 = (LinearLayout) viewGroup.getChildAt(4);
        jbiVar.f119909W0 = (LinearLayout) viewGroup.getChildAt(4);
        jbiVar.f119911X0 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        jbiVar.f119913Y0 = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        jbiVar.f119915Z0 = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        jbiVar.f119916a1 = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        jbiVar.f119917b1 = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m149060b(jbi jbiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173552O2, viewGroup, false);
        m149059a(jbiVar, viewInflate);
        return viewInflate;
    }
}
