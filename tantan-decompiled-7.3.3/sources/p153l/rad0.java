package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightEquipDialogContentView;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rad0 {
    /* JADX INFO: renamed from: a */
    public static void m180715a(RightEquipDialogContentView rightEquipDialogContentView, View view) {
        rightEquipDialogContentView.f46907d = (RightEquipDialogContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightEquipDialogContentView.f46908e = viewGroup.getChildAt(0);
        rightEquipDialogContentView.f46909f = (DialogTitleBar) viewGroup.getChildAt(2);
        rightEquipDialogContentView.f46910g = (RecyclerView) viewGroup.getChildAt(3);
        rightEquipDialogContentView.f46911h = (FrameLayout) viewGroup.getChildAt(4);
        rightEquipDialogContentView.f46912i = (VButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        rightEquipDialogContentView.f46913j = (VImage) viewGroup.getChildAt(5);
        rightEquipDialogContentView.f46914k = (VText) viewGroup.getChildAt(6);
        rightEquipDialogContentView.f46915l = (VText) viewGroup.getChildAt(7);
        rightEquipDialogContentView.f46916m = (Group) viewGroup.getChildAt(8);
    }
}
