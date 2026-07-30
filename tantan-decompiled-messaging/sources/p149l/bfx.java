package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.MbtiLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VFrame;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bfx {
    /* JADX INFO: renamed from: a */
    public static void m101615a(MbtiLayout mbtiLayout, View view) {
        mbtiLayout.f22649a = (MbtiLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mbtiLayout.f22650b = (VLinear) viewGroup.getChildAt(0);
        mbtiLayout.f22651c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mbtiLayout.f22652d = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mbtiLayout.f22653e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mbtiLayout.f22654f = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mbtiLayout.f22655g = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        mbtiLayout.f22656h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        mbtiLayout.f22657i = (VFrame) viewGroup.getChildAt(2);
        mbtiLayout.f22658j = (VLinear) viewGroup.getChildAt(3);
        mbtiLayout.f22659k = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        mbtiLayout.f22660l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        mbtiLayout.f22661m = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mbtiLayout.f22662n = (VFrame_Shadow) viewGroup.getChildAt(4);
        mbtiLayout.f22663o = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
