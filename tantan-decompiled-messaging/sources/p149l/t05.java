package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.partner.ChatPartnerUserItem;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t05 {
    /* JADX INFO: renamed from: a */
    public static void m186812a(s05 s05Var, View view) {
        s05Var.f161723a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        s05Var.f161724b = (VImage) viewGroup.getChildAt(1);
        s05Var.f161725c = (VImage) viewGroup.getChildAt(2);
        s05Var.f161726d = (VText_Bold) viewGroup.getChildAt(3);
        s05Var.f161727e = (VText) viewGroup.getChildAt(4);
        s05Var.f161728f = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        s05Var.f161729g = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        s05Var.f161730h = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        s05Var.f161731i = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        s05Var.f161732j = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        s05Var.f161733k = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        s05Var.f161734l = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        s05Var.f161735m = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(7);
        s05Var.f161736n = (ChatPartnerUserItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        s05Var.f161737o = (VText_Bold) viewGroup.getChildAt(6);
        s05Var.f161738p = (VText_Bold) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m186813b(s05 s05Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95870l1, viewGroup, false);
        m186812a(s05Var, viewInflate);
        return viewInflate;
    }
}
