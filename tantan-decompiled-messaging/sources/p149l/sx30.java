package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.p046p1.mobile.putong.core.newui.home.HomeEmptyCardView;
import com.p046p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.sunshine.engine.particle.SceneView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_Squared;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sx30 {
    /* JADX INFO: renamed from: a */
    public static void m186398a(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, View view) {
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21916a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21918b = viewGroup.getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21920c = (VFrame) viewGroup.getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21922d = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21924e = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21926f = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21928g = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21930h = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21932i = (AppCompatImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21934j = (VFrame_Squared) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21936k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21939l = (HomeEmptyCardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21941m = (HomeErrorNetView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21943n = (HomeErrorNetView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21945o = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21947p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21950q = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21952r = (SceneView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21954s = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21956t = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21958u = (ViewStub) viewGroup.getChildAt(2);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21960v = (FrameLayout) viewGroup.getChildAt(3);
        viewTreeObserverOnGlobalLayoutListenerC7866b.f21962w = (HomeTitleLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m186399b(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95866ke, viewGroup, false);
        m186398a(viewTreeObserverOnGlobalLayoutListenerC7866b, viewInflate);
        return viewInflate;
    }
}
