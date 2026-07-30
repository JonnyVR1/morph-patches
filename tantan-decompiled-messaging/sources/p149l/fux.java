package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VCheckCircle;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class fux {
    /* JADX INFO: renamed from: a */
    public static void m123220a(eux euxVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        euxVar.f93281a = (VPager) viewGroup.getChildAt(0);
        euxVar.f93282b = (VCheckCircle) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123221b(eux euxVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95632Wd, viewGroup, false);
        m123220a(euxVar, viewInflate);
        return viewInflate;
    }
}
