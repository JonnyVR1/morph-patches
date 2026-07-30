package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n8l {
    /* JADX INFO: renamed from: a */
    public static void m161941a(l8l l8lVar, View view) {
        l8lVar.f130468f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        l8lVar.f130469g = (VImage) viewGroup.getChildAt(0);
        l8lVar.f130470h = (VDraweeView) viewGroup.getChildAt(1);
        l8lVar.f130471i = (VText_Bold) viewGroup.getChildAt(2);
        l8lVar.f130472j = (VText) viewGroup.getChildAt(3);
        l8lVar.f130473k = (VText_Bold) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m161942b(l8l l8lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125792d4, viewGroup, false);
        m161941a(l8lVar, viewInflate);
        return viewInflate;
    }
}
