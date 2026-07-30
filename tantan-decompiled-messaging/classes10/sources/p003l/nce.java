package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.banner.DrawerBannersView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nce {
    /* JADX INFO: renamed from: a */
    public static void m8322a(DrawerBannersView drawerBannersView, View view) {
        drawerBannersView.a = (DrawerBannersView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        drawerBannersView.b = viewGroup.getChildAt(0);
        drawerBannersView.c = viewGroup.getChildAt(1);
    }
}
