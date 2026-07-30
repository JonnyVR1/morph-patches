package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ej0 {
    /* JADX INFO: renamed from: a */
    public static void m9892a(dj0 dj0Var, View view) {
        dj0Var.f6950a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dj0Var.f6951b = viewGroup.getChildAt(0);
        dj0Var.f6952c = viewGroup.getChildAt(1);
        dj0Var.f6953d = (DiscoveryPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9893b(dj0 dj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11027C, viewGroup, false);
        m9892a(dj0Var, viewInflate);
        return viewInflate;
    }
}
