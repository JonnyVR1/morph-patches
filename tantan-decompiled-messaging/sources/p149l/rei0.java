package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task.C8230a;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class rei0 {
    /* JADX INFO: renamed from: a */
    public static void m179048a(C8230a c8230a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8230a.f26676a = (VNavigationBar) viewGroup.getChildAt(0);
        c8230a.f26677b = (VRecyclerView) viewGroup.getChildAt(1);
        c8230a.f26678c = (VFrame) viewGroup.getChildAt(2);
        c8230a.f26679d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        c8230a.f26680e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m179049b(C8230a c8230a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95322D7, viewGroup, false);
        m179048a(c8230a, viewInflate);
        return viewInflate;
    }
}
