package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.PlatformQualificationView;
import p147v.VButton;

/* JADX INFO: loaded from: classes10.dex */
public class b580 {
    /* JADX INFO: renamed from: a */
    public static void m100311a(PlatformQualificationView platformQualificationView, View view) {
        platformQualificationView._button = (VButton) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m100312b(PlatformQualificationView platformQualificationView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121325P0, viewGroup, true);
        m100311a(platformQualificationView, viewInflate);
        return viewInflate;
    }
}
