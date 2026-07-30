package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ayh {
    /* JADX INFO: renamed from: a */
    public static void m8622a(zxh zxhVar, View view) {
        zxhVar.f15884a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zxhVar.f15885b = viewGroup.getChildAt(0);
        zxhVar.f15886c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        zxhVar.f15887d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        zxhVar.f15888e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        zxhVar.f15889f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        zxhVar.f15890g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        zxhVar.f15891h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        zxhVar.f15892i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        zxhVar.f15893j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        zxhVar.f15894k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        zxhVar.f15895l = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8623b(zxh zxhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11304t, viewGroup, false);
        m8622a(zxhVar, viewInflate);
        return viewInflate;
    }
}
