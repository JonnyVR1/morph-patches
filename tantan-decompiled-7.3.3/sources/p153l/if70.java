package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class if70 {
    /* JADX INFO: renamed from: a */
    public static void m139723a(hf70 hf70Var, View view) {
        hf70Var.f109233a = (VLinear) view.findViewById(hdc0.f108818A1);
        ViewGroup viewGroup = (ViewGroup) view;
        hf70Var.f109234b = (RelativeLayout) viewGroup.getChildAt(0);
        hf70Var.f109235c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hf70Var.f109236d = (MomentPostBar) viewGroup.getChildAt(1);
        hf70Var.f109237e = (FeedDraftView) viewGroup.getChildAt(2);
        hf70Var.f109238f = (FrameLayout) viewGroup.getChildAt(3);
        hf70Var.f109239g = (FrameLayout) viewGroup.getChildAt(4);
        hf70Var.f109240h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m139724b(hf70 hf70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173774v5, viewGroup, false);
        m139723a(hf70Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m139725c(hf70 hf70Var) {
        hf70Var.f109233a = null;
        hf70Var.f109234b = null;
        hf70Var.f109235c = null;
        hf70Var.f109236d = null;
        hf70Var.f109237e = null;
        hf70Var.f109238f = null;
        hf70Var.f109239g = null;
        hf70Var.f109240h = null;
    }
}
