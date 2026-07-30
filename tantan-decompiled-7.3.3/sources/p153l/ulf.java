package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ulf {
    /* JADX INFO: renamed from: a */
    public static void m196548a(tlf tlfVar, View view) {
        tlfVar.f174814a = (CardPhotoFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tlfVar.f174815b = (PictureView) viewGroup.getChildAt(0);
        tlfVar.f174816c = (VLinear) viewGroup.getChildAt(1);
        tlfVar.f174817d = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tlfVar.f174818e = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        tlfVar.f174819f = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m196549b(tlf tlfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125627T2, viewGroup, false);
        m196548a(tlfVar, viewInflate);
        return viewInflate;
    }
}
