package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p147v.VButton;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class w1x {
    /* JADX INFO: renamed from: a */
    public static void m200982a(v1x v1xVar, View view) {
        v1xVar.f179286a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        v1xVar.f179287b = (VImage) viewGroup.getChildAt(0);
        v1xVar.f179288c = (VButton) viewGroup.getChildAt(2);
        v1xVar.f179289d = (TabLayout) viewGroup.getChildAt(3);
        v1xVar.f179290e = (ViewPager2) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m200983b(v1x v1xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137331X, viewGroup, false);
        m200982a(v1xVar, viewInflate);
        return viewInflate;
    }
}
