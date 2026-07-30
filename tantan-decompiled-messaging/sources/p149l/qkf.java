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
public class qkf {
    /* JADX INFO: renamed from: a */
    public static void m175373a(pkf pkfVar, View view) {
        pkfVar.f149968a = (CardPhotoFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pkfVar.f149969b = (PictureView) viewGroup.getChildAt(0);
        pkfVar.f149970c = (VLinear) viewGroup.getChildAt(1);
        pkfVar.f149971d = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pkfVar.f149972e = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pkfVar.f149973f = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m175374b(pkf pkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95589U2, viewGroup, false);
        m175373a(pkfVar, viewInflate);
        return viewInflate;
    }
}
