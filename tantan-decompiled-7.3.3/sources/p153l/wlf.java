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
public class wlf {
    /* JADX INFO: renamed from: a */
    public static void m207021a(vlf vlfVar, View view) {
        vlfVar.f184571a = (CardPhotoFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vlfVar.f184572b = (PictureView) viewGroup.getChildAt(0);
        vlfVar.f184573c = (VLinear) viewGroup.getChildAt(1);
        vlfVar.f184574d = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vlfVar.f184575e = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vlfVar.f184576f = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m207022b(vlf vlfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125643U2, viewGroup, false);
        m207021a(vlfVar, viewInflate);
        return viewInflate;
    }
}
