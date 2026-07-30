package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.QuickChatPrivilegeAnimView;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class k5c0 {
    /* JADX INFO: renamed from: a */
    public static void m148350a(QuickChatPrivilegeAnimView quickChatPrivilegeAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatPrivilegeAnimView.f35991d = (Guideline) viewGroup.getChildAt(0);
        quickChatPrivilegeAnimView.f35992e = (Guideline) viewGroup.getChildAt(1);
        quickChatPrivilegeAnimView.f35993f = (FrameLayout) viewGroup.getChildAt(2);
        quickChatPrivilegeAnimView.f35994g = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickChatPrivilegeAnimView.f35995h = (FrameLayout) viewGroup.getChildAt(3);
        quickChatPrivilegeAnimView.f35996i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        quickChatPrivilegeAnimView.f35997j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        quickChatPrivilegeAnimView.f35998k = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        quickChatPrivilegeAnimView.f35999l = (ImageView) viewGroup.getChildAt(4);
        quickChatPrivilegeAnimView.f36000m = (ImageView) viewGroup.getChildAt(5);
        quickChatPrivilegeAnimView.f36001n = (ImageView) viewGroup.getChildAt(6);
        quickChatPrivilegeAnimView.f36002o = (ImageView) viewGroup.getChildAt(7);
        quickChatPrivilegeAnimView.f36003p = (ImageView) viewGroup.getChildAt(8);
        quickChatPrivilegeAnimView.f36004q = viewGroup.getChildAt(9);
    }
}
