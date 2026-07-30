package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class slf {
    /* JADX INFO: renamed from: a */
    public static void m186562a(rlf rlfVar, View view) {
        rlfVar.f163728a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rlfVar.f163729b = (VLinear) viewGroup.getChildAt(0);
        rlfVar.f163730c = (VLinear_FillerMeasure) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rlfVar.f163731d = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        rlfVar.f163732e = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        rlfVar.f163733f = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rlfVar.f163734g = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        rlfVar.f163735h = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        rlfVar.f163736i = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rlfVar.f163737j = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        rlfVar.f163738k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        rlfVar.f163739l = (ProfileLikeRemainingSwitcherView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        rlfVar.f163740m = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        rlfVar.f163741n = (VFrame) viewGroup.getChildAt(1);
        rlfVar.f163742o = (VLinear) viewGroup.getChildAt(2);
        rlfVar.f163743p = (VEditText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        rlfVar.f163744q = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m186563b(rlf rlfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125611S2, viewGroup, false);
        m186562a(rlfVar, viewInflate);
        return viewInflate;
    }
}
