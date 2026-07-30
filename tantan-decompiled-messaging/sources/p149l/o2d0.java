package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightEquipDialogContentView;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class o2d0 {
    /* JADX INFO: renamed from: a */
    public static void m162292a(RightEquipDialogContentView rightEquipDialogContentView, View view) {
        rightEquipDialogContentView.f46059d = (RightEquipDialogContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightEquipDialogContentView.f46060e = viewGroup.getChildAt(0);
        rightEquipDialogContentView.f46061f = (DialogTitleBar) viewGroup.getChildAt(2);
        rightEquipDialogContentView.f46062g = (RecyclerView) viewGroup.getChildAt(3);
        rightEquipDialogContentView.f46063h = (FrameLayout) viewGroup.getChildAt(4);
        rightEquipDialogContentView.f46064i = (VButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        rightEquipDialogContentView.f46065j = (VImage) viewGroup.getChildAt(5);
        rightEquipDialogContentView.f46066k = (VText) viewGroup.getChildAt(6);
        rightEquipDialogContentView.f46067l = (VText) viewGroup.getChildAt(7);
        rightEquipDialogContentView.f46068m = (Group) viewGroup.getChildAt(8);
    }
}
