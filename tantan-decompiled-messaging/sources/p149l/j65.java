package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.CityTopGreetDialog;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j65 {
    /* JADX INFO: renamed from: a */
    public static void m139903a(CityTopGreetDialog cityTopGreetDialog, View view) {
        cityTopGreetDialog.f32910f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityTopGreetDialog.f32911g = viewGroup.getChildAt(0);
        cityTopGreetDialog.f32912h = (ConstraintLayout) viewGroup.getChildAt(1);
        cityTopGreetDialog.f32913i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cityTopGreetDialog.f32914j = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cityTopGreetDialog.f32915k = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cityTopGreetDialog.f32916l = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        cityTopGreetDialog.f32917m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        cityTopGreetDialog.f32918n = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cityTopGreetDialog.f32919o = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        cityTopGreetDialog.f32920p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        cityTopGreetDialog.f32921q = (VIcon) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cityTopGreetDialog.f32922r = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        cityTopGreetDialog.f32923s = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m139904b(CityTopGreetDialog cityTopGreetDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95997s9, viewGroup, false);
        m139903a(cityTopGreetDialog, viewInflate);
        return viewInflate;
    }
}
