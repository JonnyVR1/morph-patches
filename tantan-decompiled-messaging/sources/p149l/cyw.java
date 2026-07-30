package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemView;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cyw {
    /* JADX INFO: renamed from: a */
    public static void m109392a(byw bywVar, View view) {
        bywVar.f77973c = (VScroll) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bywVar.f77974d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bywVar.f77975e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bywVar.f77976f = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        bywVar.f77977g = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        bywVar.f77978h = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        bywVar.f77979i = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        bywVar.f77980j = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4);
        bywVar.f77981k = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5);
        bywVar.f77982l = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        bywVar.f77983m = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        bywVar.f77984n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        bywVar.f77985o = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m109393b(byw bywVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137335Z, viewGroup, false);
        m109392a(bywVar, viewInflate);
        return viewInflate;
    }
}
