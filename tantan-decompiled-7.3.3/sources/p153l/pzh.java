package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.AutoVDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class pzh {
    /* JADX INFO: renamed from: a */
    public static void m174434a(ozh ozhVar, View view) {
        ozhVar.f149896a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ozhVar.f149897b = (VLinear) viewGroup.getChildAt(0);
        ozhVar.f149898c = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ozhVar.f149899d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ozhVar.f149900e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ozhVar.f149901f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        ozhVar.f149902g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        ozhVar.f149903h = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        ozhVar.f149904i = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        ozhVar.f149905j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        ozhVar.f149906k = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ozhVar.f149907l = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m174435b(ozh ozhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173754t, viewGroup, false);
        m174434a(ozhVar, viewInflate);
        return viewInflate;
    }
}
