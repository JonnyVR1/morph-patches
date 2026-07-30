package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import p151v.VButton;

/* JADX INFO: loaded from: classes10.dex */
public class hd80 {
    /* JADX INFO: renamed from: a */
    public static void m134575a(PlatformQualificationView platformQualificationView, View view) {
        platformQualificationView._button = (VButton) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m134576b(PlatformQualificationView platformQualificationView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151933P0, viewGroup, true);
        m134575a(platformQualificationView, viewInflate);
        return viewInflate;
    }
}
