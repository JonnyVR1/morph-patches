package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p151v.VButton;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class v4x {
    /* JADX INFO: renamed from: a */
    public static void m199738a(u4x u4xVar, View view) {
        u4xVar.f177547a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        u4xVar.f177548b = (VImage) viewGroup.getChildAt(0);
        u4xVar.f177549c = (VButton) viewGroup.getChildAt(2);
        u4xVar.f177550d = (TabLayout) viewGroup.getChildAt(3);
        u4xVar.f177551e = (ViewPager2) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m199739b(u4x u4xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167545X, viewGroup, false);
        m199738a(u4xVar, viewInflate);
        return viewInflate;
    }
}
