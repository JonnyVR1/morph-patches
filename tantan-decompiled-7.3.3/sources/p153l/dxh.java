package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class dxh {
    /* JADX INFO: renamed from: a */
    public static void m118477a(cxh cxhVar, View view) {
        cxhVar.f84224a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cxhVar.f84225b = (FeedStatesMediaView) viewGroup.getChildAt(0);
        cxhVar.f84226c = viewGroup.getChildAt(1);
        cxhVar.f84227d = (VImage) viewGroup.getChildAt(2);
        cxhVar.f84228e = (VRelative) viewGroup.getChildAt(3);
        cxhVar.f84229f = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        cxhVar.f84230g = (VEditText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        cxhVar.f84231h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        cxhVar.f84232i = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        cxhVar.f84233j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        cxhVar.f84234k = (ConstraintLayout) viewGroup.getChildAt(4);
        cxhVar.f84235l = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        cxhVar.f84236m = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        cxhVar.f84237n = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        cxhVar.f84238o = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m118478b(cxh cxhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173740r, viewGroup, false);
        m118477a(cxhVar, viewInflate);
        return viewInflate;
    }
}
