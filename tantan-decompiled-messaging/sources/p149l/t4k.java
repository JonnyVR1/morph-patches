package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.p055gp.GpRateGuideDialog;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t4k {
    /* JADX INFO: renamed from: a */
    public static void m187216a(GpRateGuideDialog gpRateGuideDialog, View view) {
        gpRateGuideDialog.f29289a = (VImage) view.findViewById(u4c0.f174157a5);
        gpRateGuideDialog.f29290b = (VText) view.findViewById(u4c0.f174268ge);
        gpRateGuideDialog.f29291c = (VText) view.findViewById(u4c0.f173973P1);
        gpRateGuideDialog.f29292d = (VLinear) view.findViewById(u4c0.f174272h1);
        gpRateGuideDialog.f29293e = (VCheckBox) view.findViewById(u4c0.f174238f1);
        gpRateGuideDialog.f29294f = (VText) view.findViewById(u4c0.f174289i1);
        gpRateGuideDialog.f29295g = (VText) view.findViewById(u4c0.f174535wa);
        gpRateGuideDialog.f29296h = (VText) view.findViewById(u4c0.f173946N8);
    }

    /* JADX INFO: renamed from: b */
    public static View m187217b(GpRateGuideDialog gpRateGuideDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95764ed, viewGroup, false);
        m187216a(gpRateGuideDialog, viewInflate);
        return viewInflate;
    }
}
