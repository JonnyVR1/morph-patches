package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.StepSeekBar;
import p151v.VButton_FakeShadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ngf0 {
    /* JADX INFO: renamed from: a */
    public static void m162964a(mgf0 mgf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mgf0Var.f136711c = (VRelative) viewGroup.getChildAt(0);
        mgf0Var.f136712d = (StepSeekBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mgf0Var.f136713e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mgf0Var.f136714f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mgf0Var.f136715g = (VScroll) viewGroup.getChildAt(1);
        mgf0Var.f136716h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mgf0Var.f136717i = (ViewPager2) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        mgf0Var.f136718j = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m162965b(mgf0 mgf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109094V, viewGroup, false);
        m162964a(mgf0Var, viewInflate);
        return viewInflate;
    }
}
