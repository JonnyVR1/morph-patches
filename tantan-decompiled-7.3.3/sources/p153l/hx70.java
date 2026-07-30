package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.view.LiveEmptyView;
import p151v.VImage;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class hx70 {
    /* JADX INFO: renamed from: a */
    public static void m137559a(gx70 gx70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gx70Var.f106898i = viewGroup.getChildAt(0);
        gx70Var.f106899j = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gx70Var.f106900k = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        gx70Var.f106901l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        gx70Var.f106902m = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        gx70Var.f106903n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        gx70Var.f106904o = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        gx70Var.f106905p = (ViewPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        gx70Var.f106906q = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gx70Var.f106907r = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        gx70Var.f106908s = (EditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        gx70Var.f106909t = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        gx70Var.f106910u = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        gx70Var.f106911v = (VRecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        gx70Var.f106912w = (LiveEmptyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m137560b(gx70 gx70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198936U4, viewGroup, false);
        m137559a(gx70Var, viewInflate);
        return viewInflate;
    }
}
