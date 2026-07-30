package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gd2 {
    /* JADX INFO: renamed from: a */
    public static void m129914a(fd2 fd2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fd2Var.f98308a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        fd2Var.f98309b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        fd2Var.f98310c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        fd2Var.f98311d = viewGroup.getChildAt(1);
        fd2Var.f98312e = (VButton) viewGroup.getChildAt(2);
        fd2Var.f98313f = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m129915b(fd2 fd2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167551a, viewGroup, false);
        m129914a(fd2Var, viewInflate);
        return viewInflate;
    }
}
