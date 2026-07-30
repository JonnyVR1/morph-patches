package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vs00 {
    /* JADX INFO: renamed from: a */
    public static void m15573a(ts00 ts00Var, View view) {
        ts00Var.f13394d = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ts00Var.f13395e = viewGroup.getChildAt(0);
        ts00Var.f13396f = viewGroup.getChildAt(1);
        ts00Var.f13397g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ts00Var.f13398h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ts00Var.f13399i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ts00Var.f13400j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ts00Var.f13401k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15574b(ts00 ts00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11018A4, viewGroup, false);
        m15573a(ts00Var, viewInflate);
        return viewInflate;
    }
}
