package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.CityTopGreetDialog;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k75 {
    /* JADX INFO: renamed from: a */
    public static void m148590a(CityTopGreetDialog cityTopGreetDialog, View view) {
        cityTopGreetDialog.f33758f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cityTopGreetDialog.f33759g = viewGroup.getChildAt(0);
        cityTopGreetDialog.f33760h = (ConstraintLayout) viewGroup.getChildAt(1);
        cityTopGreetDialog.f33761i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cityTopGreetDialog.f33762j = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cityTopGreetDialog.f33763k = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cityTopGreetDialog.f33764l = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        cityTopGreetDialog.f33765m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        cityTopGreetDialog.f33766n = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cityTopGreetDialog.f33767o = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        cityTopGreetDialog.f33768p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        cityTopGreetDialog.f33769q = (VIcon) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cityTopGreetDialog.f33770r = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        cityTopGreetDialog.f33771s = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m148591b(CityTopGreetDialog cityTopGreetDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126170z9, viewGroup, false);
        m148590a(cityTopGreetDialog, viewInflate);
        return viewInflate;
    }
}
