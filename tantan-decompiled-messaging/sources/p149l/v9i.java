package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.view.LiveHeadAnimView;
import com.p046p1.mobile.putong.newui.view.InnerClickSpanTextView;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class v9i {
    /* JADX INFO: renamed from: a */
    public static void m197574a(u9i u9iVar, View view) {
        u9iVar.f175277J = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        u9iVar.f175279K = viewGroup.getChildAt(0);
        u9iVar.f175281L = (LinearLayout) viewGroup.getChildAt(1);
        u9iVar.f175283M = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        u9iVar.f175285N = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        u9iVar.f175287O = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        u9iVar.f175289P = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        u9iVar.f175291Q = viewGroup.getChildAt(2);
        u9iVar.f175293R = (ConstraintLayout) viewGroup.getChildAt(3);
        u9iVar.f175295S = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        u9iVar.f175297T = (InnerClickSpanTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        u9iVar.f175299U = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        u9iVar.f175301V = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        u9iVar.f175303W = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        u9iVar.f175305X = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(0);
        u9iVar.f175307Y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4)).getChildAt(1);
        u9iVar.f175309Z = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5);
        u9iVar.f175321k0 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5)).getChildAt(0);
        u9iVar.f175326p0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(6);
        u9iVar.f175272E0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(7);
        u9iVar.f175273F0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(8);
        u9iVar.f175274G0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(9);
        u9iVar.f175275H0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(10);
        u9iVar.f175276I0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(11);
        u9iVar.f175278J0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(12);
        u9iVar.f175280K0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(13);
        u9iVar.f175282L0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(14);
        u9iVar.f175284M0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(15);
        u9iVar.f175286N0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(16);
        u9iVar.f175288O0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(17);
        u9iVar.f175290P0 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(18);
        u9iVar.f175292Q0 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(19);
        u9iVar.f175294R0 = (LiveHeadAnimView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(20);
        u9iVar.f175296S0 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(21);
        u9iVar.f175298T0 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(22);
        u9iVar.f175300U0 = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(23);
        u9iVar.f175302V0 = (LinearLayout) viewGroup.getChildAt(4);
        u9iVar.f175304W0 = (LinearLayout) viewGroup.getChildAt(4);
        u9iVar.f175306X0 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        u9iVar.f175308Y0 = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        u9iVar.f175310Z0 = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        u9iVar.f175311a1 = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        u9iVar.f175312b1 = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m197575b(u9i u9iVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142083O2, viewGroup, false);
        m197574a(u9iVar, viewInflate);
        return viewInflate;
    }
}
