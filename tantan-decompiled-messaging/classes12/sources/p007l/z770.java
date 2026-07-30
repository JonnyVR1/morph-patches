package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.feed.newui.preview.act.C2159a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z770 {
    /* JADX INFO: renamed from: a */
    public static void m17243a(C2159a c2159a, View view) {
        c2159a.f4070a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c2159a.f4071b = viewGroup.getChildAt(0);
        c2159a.f4072c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m17244b(C2159a c2159a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11090M2, viewGroup, false);
        m17243a(c2159a, viewInflate);
        return viewInflate;
    }
}
