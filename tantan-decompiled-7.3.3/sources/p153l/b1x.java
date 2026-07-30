package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemView;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b1x {
    /* JADX INFO: renamed from: a */
    public static void m101508a(a1x a1xVar, View view) {
        a1xVar.f67888c = (VScroll) view;
        ViewGroup viewGroup = (ViewGroup) view;
        a1xVar.f67889d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        a1xVar.f67890e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        a1xVar.f67891f = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        a1xVar.f67892g = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        a1xVar.f67893h = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        a1xVar.f67894i = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        a1xVar.f67895j = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4);
        a1xVar.f67896k = (MarryEditProfileItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5);
        a1xVar.f67897l = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        a1xVar.f67898m = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        a1xVar.f67899n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        a1xVar.f67900o = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m101509b(a1x a1xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167549Z, viewGroup, false);
        m101508a(a1xVar, viewInflate);
        return viewInflate;
    }
}
