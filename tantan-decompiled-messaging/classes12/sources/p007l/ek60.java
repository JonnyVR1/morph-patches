package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.ui.permission.PermissionRequestItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ek60 {
    /* JADX INFO: renamed from: a */
    public static void m9896a(PermissionRequestItemView permissionRequestItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        permissionRequestItemView.a = viewGroup.getChildAt(0);
        permissionRequestItemView.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        permissionRequestItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
