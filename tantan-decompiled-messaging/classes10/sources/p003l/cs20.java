package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cs20 {
    /* JADX INFO: renamed from: a */
    public static void m5995a(bs20 bs20Var, View view) {
        bs20Var.f3441a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bs20Var.f3442b = (CoreGiftLayer) viewGroup.getChildAt(0);
        bs20Var.f3443c = (FrameLayout) viewGroup.getChildAt(1);
        bs20Var.f3444d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bs20Var.f3445e = (FrameLayout) viewGroup.getChildAt(2);
        bs20Var.f3446f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bs20Var.f3447g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        bs20Var.f3448h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        bs20Var.f3449i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        bs20Var.f3450j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        bs20Var.f3451k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        bs20Var.f3452l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m5996b(bs20 bs20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5841L, viewGroup, false);
        m5995a(bs20Var, viewInflate);
        return viewInflate;
    }
}
