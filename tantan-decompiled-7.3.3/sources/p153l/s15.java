package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.partner.ChatPartnerUserItem;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s15 {
    /* JADX INFO: renamed from: a */
    public static void m184015a(r15 r15Var, View view) {
        r15Var.f160757a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r15Var.f160758b = (VImage) viewGroup.getChildAt(1);
        r15Var.f160759c = (VImage) viewGroup.getChildAt(2);
        r15Var.f160760d = (VText_Bold) viewGroup.getChildAt(3);
        r15Var.f160761e = (VText) viewGroup.getChildAt(4);
        r15Var.f160762f = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        r15Var.f160763g = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        r15Var.f160764h = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        r15Var.f160765i = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        r15Var.f160766j = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        r15Var.f160767k = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        r15Var.f160768l = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        r15Var.f160769m = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(7);
        r15Var.f160770n = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        r15Var.f160771o = (VText_Bold) viewGroup.getChildAt(6);
        r15Var.f160772p = (VText_Bold) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m184016b(r15 r15Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125924l1, viewGroup, false);
        m184015a(r15Var, viewInflate);
        return viewInflate;
    }
}
