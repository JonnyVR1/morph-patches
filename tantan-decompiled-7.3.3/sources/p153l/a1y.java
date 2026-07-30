package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.google.android.material.tabs.TabLayout;
import p151v.VPager;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a1y {
    /* JADX INFO: renamed from: a */
    public static void m95586a(z0y z0yVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        z0yVar.f202439a = (ViewStub) viewGroup.getChildAt(0);
        z0yVar.f202440b = (TabLayout) viewGroup.getChildAt(1);
        z0yVar.f202441c = (BottomSheetLayout) viewGroup.getChildAt(3);
        z0yVar.f202442d = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        z0yVar.f202443e = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        z0yVar.f202444f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3);
        z0yVar.f202445g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        z0yVar.f202446h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        z0yVar.f202447i = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4);
        z0yVar.f202448j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        z0yVar.f202449k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m95587b(z0y z0yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125718Yd, viewGroup, false);
        m95586a(z0yVar, viewInflate);
        return viewInflate;
    }
}
