package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import p147v.VFrame;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class yoc0 {
    /* JADX INFO: renamed from: a */
    public static void m215489a(xoc0 xoc0Var, View view) {
        xoc0Var.f193813a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xoc0Var.f193814b = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xoc0Var.f193815c = (TagContainerLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        xoc0Var.f193816d = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m215490b(xoc0 xoc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95360Fd, viewGroup, false);
        m215489a(xoc0Var, viewInflate);
        return viewInflate;
    }
}
