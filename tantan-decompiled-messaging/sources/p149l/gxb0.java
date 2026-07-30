package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.QuickChatPrivilegeAnimView;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class gxb0 {
    /* JADX INFO: renamed from: a */
    public static void m128542a(QuickChatPrivilegeAnimView quickChatPrivilegeAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatPrivilegeAnimView.f35143d = (Guideline) viewGroup.getChildAt(0);
        quickChatPrivilegeAnimView.f35144e = (Guideline) viewGroup.getChildAt(1);
        quickChatPrivilegeAnimView.f35145f = (FrameLayout) viewGroup.getChildAt(2);
        quickChatPrivilegeAnimView.f35146g = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickChatPrivilegeAnimView.f35147h = (FrameLayout) viewGroup.getChildAt(3);
        quickChatPrivilegeAnimView.f35148i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        quickChatPrivilegeAnimView.f35149j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        quickChatPrivilegeAnimView.f35150k = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        quickChatPrivilegeAnimView.f35151l = (ImageView) viewGroup.getChildAt(4);
        quickChatPrivilegeAnimView.f35152m = (ImageView) viewGroup.getChildAt(5);
        quickChatPrivilegeAnimView.f35153n = (ImageView) viewGroup.getChildAt(6);
        quickChatPrivilegeAnimView.f35154o = (ImageView) viewGroup.getChildAt(7);
        quickChatPrivilegeAnimView.f35155p = (ImageView) viewGroup.getChildAt(8);
        quickChatPrivilegeAnimView.f35156q = viewGroup.getChildAt(9);
    }
}
