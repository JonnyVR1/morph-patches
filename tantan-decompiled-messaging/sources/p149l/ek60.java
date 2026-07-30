package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.p065ui.permission.PermissionRequestItemView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ek60 {
    /* JADX INFO: renamed from: a */
    public static void m116926a(PermissionRequestItemView permissionRequestItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        permissionRequestItemView.f54654a = (VImage) viewGroup.getChildAt(0);
        permissionRequestItemView.f54655b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        permissionRequestItemView.f54656c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
