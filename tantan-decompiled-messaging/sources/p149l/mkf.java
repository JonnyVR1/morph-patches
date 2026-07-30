package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mkf {
    /* JADX INFO: renamed from: a */
    public static void m155003a(lkf lkfVar, View view) {
        lkfVar.f128499a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lkfVar.f128500b = (VLinear) viewGroup.getChildAt(0);
        lkfVar.f128501c = (VLinear_FillerMeasure) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        lkfVar.f128502d = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        lkfVar.f128503e = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        lkfVar.f128504f = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        lkfVar.f128505g = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        lkfVar.f128506h = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        lkfVar.f128507i = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        lkfVar.f128508j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        lkfVar.f128509k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        lkfVar.f128510l = (ProfileLikeRemainingSwitcherView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        lkfVar.f128511m = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        lkfVar.f128512n = (VFrame) viewGroup.getChildAt(1);
        lkfVar.f128513o = (VLinear) viewGroup.getChildAt(2);
        lkfVar.f128514p = (VEditText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        lkfVar.f128515q = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m155004b(lkf lkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95557S2, viewGroup, false);
        m155003a(lkfVar, viewInflate);
        return viewInflate;
    }
}
