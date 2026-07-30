package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.C8683b;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.DateEditTextNew;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xea0 {
    /* JADX INFO: renamed from: a */
    public static void m208523a(C8683b c8683b, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8683b.f33552a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8683b.f33553b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8683b.f33554c = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        c8683b.f33555d = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        c8683b.f33556e = (DateEditTextNew) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        c8683b.f33557f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        c8683b.f33558g = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
        c8683b.f33559h = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m208524b(C8683b c8683b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137391z0, viewGroup, false);
        m208523a(c8683b, viewInflate);
        return viewInflate;
    }
}
