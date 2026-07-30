package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.PlatformQualificationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b580 {
    /* JADX INFO: renamed from: a */
    public static void m5690a(PlatformQualificationView platformQualificationView, View view) {
        platformQualificationView.a = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m5691b(PlatformQualificationView platformQualificationView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5488P0, viewGroup, true);
        m5690a(platformQualificationView, viewInflate);
        return viewInflate;
    }
}
