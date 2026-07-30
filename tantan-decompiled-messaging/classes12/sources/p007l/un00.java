package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.p005ui.moments.C2254b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class un00 {
    /* JADX INFO: renamed from: a */
    public static void m15110a(C2254b c2254b, View view) {
        c2254b.f5438a = (FrameLayout) view.findViewById(b5c0.f5946A1);
        ViewGroup viewGroup = (ViewGroup) view;
        c2254b.f5439b = viewGroup.getChildAt(0);
        c2254b.f5440c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c2254b.f5441d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c2254b.f5442e = (LinearLayout) viewGroup.getChildAt(1);
        c2254b.f5443f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        c2254b.f5444g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        c2254b.f5445h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m15111b(C2254b c2254b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11309t4, viewGroup, false);
        m15110a(c2254b, viewInflate);
        return viewInflate;
    }
}
