package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class okf {
    /* JADX INFO: renamed from: a */
    public static void m164856a(nkf nkfVar, View view) {
        nkfVar.f139401a = (CardPhotoFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nkfVar.f139402b = (PictureView) viewGroup.getChildAt(0);
        nkfVar.f139403c = (VLinear) viewGroup.getChildAt(1);
        nkfVar.f139404d = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nkfVar.f139405e = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nkfVar.f139406f = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m164857b(nkf nkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95573T2, viewGroup, false);
        m164856a(nkfVar, viewInflate);
        return viewInflate;
    }
}
