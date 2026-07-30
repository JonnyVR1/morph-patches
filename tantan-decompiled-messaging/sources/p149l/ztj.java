package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftPanelTopBar;
import p147v.VPager;
import p147v.VProgressBar;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ztj {
    /* JADX INFO: renamed from: a */
    public static void m220127a(ytj ytjVar, View view) {
        ytjVar.f199951a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ytjVar.f199952b = (FrameLayout) viewGroup.getChildAt(0);
        ytjVar.f199953c = (CoreGiftLayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ytjVar.f199954d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ytjVar.f199955e = (FrameLayout) viewGroup.getChildAt(1);
        ytjVar.f199956f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ytjVar.f199957g = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ytjVar.f199958h = (GiftPanelTopBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        ytjVar.f199959i = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m220128b(ytj ytjVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126360P, viewGroup, false);
        m220127a(ytjVar, viewInflate);
        return viewInflate;
    }
}
