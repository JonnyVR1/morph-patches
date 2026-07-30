package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.p070ui.permission.PermissionRequestItemView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ks60 {
    /* JADX INFO: renamed from: a */
    public static void m151148a(PermissionRequestItemView permissionRequestItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        permissionRequestItemView.f55502a = (VImage) viewGroup.getChildAt(0);
        permissionRequestItemView.f55503b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        permissionRequestItemView.f55504c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
