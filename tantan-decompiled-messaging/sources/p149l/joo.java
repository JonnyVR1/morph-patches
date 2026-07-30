package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.IntlNewUIFilterBaseSetting;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import p147v.VImage;
import p147v.VListCell;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class joo {
    /* JADX INFO: renamed from: a */
    public static void m142523a(ioo iooVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iooVar.f114178a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        iooVar.f114179b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iooVar.f114180c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        iooVar.f114181d = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iooVar.f114182e = (IntlNewUIFilterBaseSetting) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        iooVar.f114183f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        iooVar.f114184g = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        iooVar.f114185h = (TagContainerLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        iooVar.f114186i = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m142524b(ioo iooVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137328V0, viewGroup, false);
        m142523a(iooVar, viewInflate);
        return viewInflate;
    }
}
